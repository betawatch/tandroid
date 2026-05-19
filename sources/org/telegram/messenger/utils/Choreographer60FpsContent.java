package org.telegram.messenger.utils;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import me.vkryl.core.reference.ReferenceList;

/* loaded from: classes3.dex */
public final class Choreographer60FpsContent implements Choreographer.FrameCallback {
    private static Choreographer60FpsContent sInstance;
    private long mAccumulatedNs;
    private final Choreographer mChoreographer;
    private int mCounter;
    private final ReferenceList mDrawablesToInvalidate;
    private final ReferenceList mDrawablesToInvalidate30fps;
    private final SparseArray mGroups;
    private long mLastVsyncNs;
    private final Set mOneShot;
    private final ReferenceList mViewsToInvalidate;

    public interface FrameCallback {
        void doFrame(long j);
    }

    public static Choreographer60FpsContent getInstance() {
        if (sInstance == null) {
            sInstance = new Choreographer60FpsContent();
        }
        return sInstance;
    }

    public void postInvalidateDrawable(Drawable drawable) {
        this.mDrawablesToInvalidate.add(drawable);
    }

    public void postInvalidateDrawable30fps(Drawable drawable) {
        this.mDrawablesToInvalidate30fps.add(drawable);
    }

    public void addFrameCallback(FrameCallback frameCallback) {
        addFrameCallback(frameCallback, 60);
    }

    public void addFrameCallback(FrameCallback frameCallback, int i) {
        int max = Math.max(1, Math.min(i, 60));
        removeFrameCallback(frameCallback);
        getOrCreateGroup(max).callbacks.add(frameCallback);
    }

    public void removeFrameCallback(FrameCallback frameCallback) {
        for (int i = 0; i < this.mGroups.size(); i++) {
            CallbackGroup callbackGroup = (CallbackGroup) this.mGroups.valueAt(i);
            if (callbackGroup.callbacks.remove(frameCallback)) {
                if (callbackGroup.callbacks.isEmpty()) {
                    this.mGroups.removeAt(i);
                    return;
                }
                return;
            }
        }
    }

    private Choreographer60FpsContent() {
        Choreographer choreographer = Choreographer.getInstance();
        this.mChoreographer = choreographer;
        this.mOneShot = new LinkedHashSet();
        this.mGroups = new SparseArray();
        this.mDrawablesToInvalidate = new ReferenceList();
        this.mDrawablesToInvalidate30fps = new ReferenceList();
        this.mViewsToInvalidate = new ReferenceList();
        choreographer.postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long j2 = this.mLastVsyncNs;
        if (j2 == 0) {
            this.mLastVsyncNs = j;
        } else {
            long j3 = this.mAccumulatedNs + (j - j2);
            this.mAccumulatedNs = j3;
            this.mLastVsyncNs = j;
            if (j3 >= 16666666) {
                this.mAccumulatedNs = j3 - 16666666;
                dispatchFrame(j);
            }
        }
        this.mChoreographer.postFrameCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[LOOP:1: B:9:0x0032->B:11:0x0038, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void dispatchFrame(long j) {
        int i;
        Iterator it;
        while (i < this.mGroups.size()) {
            CallbackGroup callbackGroup = (CallbackGroup) this.mGroups.valueAt(i);
            int i2 = callbackGroup.stride;
            if (i2 > 0) {
                i = this.mCounter % i2 != 0 ? i + 1 : 0;
                it = callbackGroup.callbacks.iterator();
                while (it.hasNext()) {
                    ((FrameCallback) it.next()).doFrame(j);
                }
            } else {
                long j2 = callbackGroup.accumulatedNs + 16666666;
                callbackGroup.accumulatedNs = j2;
                long j3 = callbackGroup.intervalNs;
                if (j2 >= j3) {
                    callbackGroup.accumulatedNs = j2 - j3;
                    it = callbackGroup.callbacks.iterator();
                    while (it.hasNext()) {
                    }
                }
            }
        }
        Iterator it2 = this.mOneShot.iterator();
        while (it2.hasNext()) {
            ((FrameCallback) it2.next()).doFrame(j);
        }
        Iterator it3 = this.mViewsToInvalidate.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).invalidate();
        }
        Iterator it4 = this.mDrawablesToInvalidate.iterator();
        while (it4.hasNext()) {
            ((Drawable) it4.next()).invalidateSelf();
        }
        this.mViewsToInvalidate.clear();
        this.mDrawablesToInvalidate.clear();
        this.mOneShot.clear();
        if (this.mCounter % 2 == 0) {
            Iterator it5 = this.mDrawablesToInvalidate30fps.iterator();
            while (it5.hasNext()) {
                ((Drawable) it5.next()).invalidateSelf();
            }
            this.mDrawablesToInvalidate30fps.clear();
        }
        this.mCounter++;
    }

    private CallbackGroup getOrCreateGroup(int i) {
        CallbackGroup callbackGroup = (CallbackGroup) this.mGroups.get(i);
        if (callbackGroup != null) {
            return callbackGroup;
        }
        CallbackGroup callbackGroup2 = new CallbackGroup(1000000000 / i, 60 % i == 0 ? 60 / i : 0);
        this.mGroups.put(i, callbackGroup2);
        return callbackGroup2;
    }

    private static final class CallbackGroup {
        long accumulatedNs;
        final CopyOnWriteArrayList callbacks = new CopyOnWriteArrayList();
        final long intervalNs;
        final int stride;

        CallbackGroup(long j, int i) {
            this.intervalNs = j;
            this.stride = i;
        }
    }
}

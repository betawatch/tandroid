package org.telegram.messenger.utils;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
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
        checkMainThread();
        if (sInstance == null) {
            sInstance = new Choreographer60FpsContent();
        }
        return sInstance;
    }

    public void postInvalidateDrawable(Drawable drawable) {
        checkMainThread();
        this.mDrawablesToInvalidate.add(drawable);
    }

    public void postInvalidateDrawable30fps(Drawable drawable) {
        checkMainThread();
        this.mDrawablesToInvalidate30fps.add(drawable);
    }

    public void addFrameCallbackOnce(Runnable runnable, int i) {
        checkMainThread();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i, 60));
        removeFrameCallbackOnce(runnable);
        CallbackGroup orCreateGroup = getOrCreateGroup(max);
        if (orCreateGroup.runnableCallbacksOnce == null) {
            orCreateGroup.runnableCallbacksOnce = new ReferenceList();
        }
        orCreateGroup.runnableCallbacksOnce.add(runnable);
    }

    public void addFrameCallback(Runnable runnable, int i) {
        checkMainThread();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i, 60));
        removeFrameCallback(runnable);
        getOrCreateGroup(max).runnableCallbacks.add(runnable);
    }

    public void addFrameCallback(FrameCallback frameCallback, int i) {
        checkMainThread();
        int max = Math.max(1, Math.min(i, 60));
        removeFrameCallback(frameCallback);
        getOrCreateGroup(max).callbacks.add(frameCallback);
    }

    public void removeFrameCallback(Runnable runnable) {
        checkMainThread();
        if (runnable == null) {
            return;
        }
        for (int i = 0; i < this.mGroups.size() && !((CallbackGroup) this.mGroups.valueAt(i)).runnableCallbacks.remove(runnable); i++) {
        }
    }

    public void removeFrameCallbackOnce(Runnable runnable) {
        checkMainThread();
        if (runnable == null) {
            return;
        }
        for (int i = 0; i < this.mGroups.size(); i++) {
            ReferenceList referenceList = ((CallbackGroup) this.mGroups.valueAt(i)).runnableCallbacksOnce;
            if (referenceList != null && referenceList.remove(runnable)) {
                return;
            }
        }
    }

    public void removeFrameCallback(FrameCallback frameCallback) {
        checkMainThread();
        if (frameCallback == null) {
            return;
        }
        for (int i = 0; i < this.mGroups.size() && !((CallbackGroup) this.mGroups.valueAt(i)).callbacks.remove(frameCallback); i++) {
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
                this.mAccumulatedNs = j3 % 16666666;
                dispatchFrame(j);
            }
        }
        this.mChoreographer.postFrameCallback(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[LOOP:2: B:16:0x004d->B:18:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[LOOP:3: B:21:0x0063->B:23:0x0069, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void dispatchFrame(long j) {
        int i;
        ReferenceList referenceList;
        Iterator it;
        Iterator it2;
        while (i < this.mGroups.size()) {
            CallbackGroup callbackGroup = (CallbackGroup) this.mGroups.valueAt(i);
            int i2 = callbackGroup.stride;
            if (i2 > 0) {
                i = this.mCounter % i2 != 0 ? i + 1 : 0;
                referenceList = callbackGroup.runnableCallbacksOnce;
                if (referenceList != null) {
                    callbackGroup.runnableCallbacksOnce = null;
                    Iterator it3 = referenceList.iterator();
                    while (it3.hasNext()) {
                        ((Runnable) it3.next()).run();
                    }
                }
                it = callbackGroup.callbacks.iterator();
                while (it.hasNext()) {
                    ((FrameCallback) it.next()).doFrame(j);
                }
                it2 = callbackGroup.runnableCallbacks.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } else {
                long j2 = callbackGroup.accumulatedNs + 16666666;
                callbackGroup.accumulatedNs = j2;
                long j3 = callbackGroup.intervalNs;
                if (j2 >= j3) {
                    callbackGroup.accumulatedNs = j2 % j3;
                    referenceList = callbackGroup.runnableCallbacksOnce;
                    if (referenceList != null) {
                    }
                    it = callbackGroup.callbacks.iterator();
                    while (it.hasNext()) {
                    }
                    it2 = callbackGroup.runnableCallbacks.iterator();
                    while (it2.hasNext()) {
                    }
                }
            }
        }
        Iterator it4 = this.mOneShot.iterator();
        while (it4.hasNext()) {
            ((FrameCallback) it4.next()).doFrame(j);
        }
        Iterator it5 = this.mViewsToInvalidate.iterator();
        while (it5.hasNext()) {
            ((View) it5.next()).invalidate();
        }
        Iterator it6 = this.mDrawablesToInvalidate.iterator();
        while (it6.hasNext()) {
            ((Drawable) it6.next()).invalidateSelf();
        }
        this.mViewsToInvalidate.clear();
        this.mDrawablesToInvalidate.clear();
        this.mOneShot.clear();
        if (this.mCounter % 2 == 0) {
            Iterator it7 = this.mDrawablesToInvalidate30fps.iterator();
            while (it7.hasNext()) {
                ((Drawable) it7.next()).invalidateSelf();
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
        final long intervalNs;
        ReferenceList runnableCallbacksOnce;
        final int stride;
        final ReferenceList callbacks = new ReferenceList();
        final ReferenceList runnableCallbacks = new ReferenceList();

        CallbackGroup(long j, int i) {
            this.intervalNs = j;
            this.stride = i;
        }
    }

    private static void checkMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }
}

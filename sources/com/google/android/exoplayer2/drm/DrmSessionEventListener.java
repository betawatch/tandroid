package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface DrmSessionEventListener {

    public abstract /* synthetic */ class -CC {
        public static void $default$onDrmSessionAcquired(DrmSessionEventListener drmSessionEventListener, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        }
    }

    void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2);

    void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc);

    void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId);

    public static class EventDispatcher {
        private final CopyOnWriteArrayList listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i;
            this.mediaPeriodId = mediaPeriodId;
        }

        public EventDispatcher withParameters(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i, mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(drmSessionEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, drmSessionEventListener));
        }

        public void removeEventListener(DrmSessionEventListener drmSessionEventListener) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                if (listenerAndHandler.listener == drmSessionEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void drmSessionAcquired(final int i) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        DrmSessionEventListener.EventDispatcher.$r8$lambda$It_L6cfamI3TNd5GYpyy98qWAPQ(DrmSessionEventListener.EventDispatcher.this, drmSessionEventListener, i);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$It_L6cfamI3TNd5GYpyy98qWAPQ(EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, i);
        }

        public void drmKeysLoaded() {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmKeysLoaded(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception exc) {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmSessionManagerError(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId, exc);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmKeysRestored(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmKeysRemoved(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            Iterator it = this.listenerAndHandlers.iterator();
            while (it.hasNext()) {
                ListenerAndHandler listenerAndHandler = (ListenerAndHandler) it.next();
                final DrmSessionEventListener drmSessionEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        drmSessionEventListener.onDrmSessionReleased(r0.windowIndex, DrmSessionEventListener.EventDispatcher.this.mediaPeriodId);
                    }
                });
            }
        }

        private static final class ListenerAndHandler {
            public Handler handler;
            public DrmSessionEventListener listener;

            public ListenerAndHandler(Handler handler, DrmSessionEventListener drmSessionEventListener) {
                this.handler = handler;
                this.listener = drmSessionEventListener;
            }
        }
    }
}

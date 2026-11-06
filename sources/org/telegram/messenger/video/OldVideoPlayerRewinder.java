package org.telegram.messenger.video;

import org.telegram.messenger.g0;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.t51;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class OldVideoPlayerRewinder {
    private long rewindBackSeekPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private t51 videoPlayer;
    private ae0 webView;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() { // from class: org.telegram.messenger.video.OldVideoPlayerRewinder.1
        @Override // java.lang.Runnable
        public void run() {
            if (OldVideoPlayerRewinder.this.videoPlayer == null && OldVideoPlayerRewinder.this.webView == null) {
                return;
            }
            long duration = OldVideoPlayerRewinder.this.getDuration();
            if (duration == 0 || duration == -9223372036854775807L) {
                OldVideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
            OldVideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
            OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
            int i7 = oldVideoPlayerRewinder.rewindCount;
            long j10 = j3 * (i7 == 1 ? 3L : i7 == 2 ? 6L : 12L);
            if (oldVideoPlayerRewinder.rewindForward) {
                OldVideoPlayerRewinder.access$514(OldVideoPlayerRewinder.this, j10);
            } else {
                OldVideoPlayerRewinder.access$522(OldVideoPlayerRewinder.this, j10);
            }
            if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition < 0) {
                OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition = 0L;
            } else if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition > duration) {
                OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition = duration;
            }
            OldVideoPlayerRewinder oldVideoPlayerRewinder2 = OldVideoPlayerRewinder.this;
            if (oldVideoPlayerRewinder2.rewindByBackSeek && oldVideoPlayerRewinder2.rewindLastTime - OldVideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 350) {
                OldVideoPlayerRewinder oldVideoPlayerRewinder3 = OldVideoPlayerRewinder.this;
                oldVideoPlayerRewinder3.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder3.rewindLastTime;
                OldVideoPlayerRewinder oldVideoPlayerRewinder4 = OldVideoPlayerRewinder.this;
                oldVideoPlayerRewinder4.seekTo(oldVideoPlayerRewinder4.rewindBackSeekPlayerPosition);
            }
            OldVideoPlayerRewinder oldVideoPlayerRewinder5 = OldVideoPlayerRewinder.this;
            oldVideoPlayerRewinder5.updateRewindProgressUi(OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition - OldVideoPlayerRewinder.this.startRewindFrom, OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition / OldVideoPlayerRewinder.this.getDuration(), oldVideoPlayerRewinder5.rewindByBackSeek);
            if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                OldVideoPlayerRewinder oldVideoPlayerRewinder6 = OldVideoPlayerRewinder.this;
                if (oldVideoPlayerRewinder6.rewindByBackSeek) {
                    oldVideoPlayerRewinder6.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder6.rewindLastTime;
                    OldVideoPlayerRewinder oldVideoPlayerRewinder7 = OldVideoPlayerRewinder.this;
                    oldVideoPlayerRewinder7.seekTo(oldVideoPlayerRewinder7.rewindBackSeekPlayerPosition);
                }
                OldVideoPlayerRewinder.this.cancelRewind();
            }
            OldVideoPlayerRewinder oldVideoPlayerRewinder8 = OldVideoPlayerRewinder.this;
            if (oldVideoPlayerRewinder8.rewindCount > 0) {
                g0.i3(oldVideoPlayerRewinder8.backSeek, 16L);
            }
        }
    };

    public static /* synthetic */ long access$514(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j3) {
        long j10 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition + j3;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    public static /* synthetic */ long access$522(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j3) {
        long j10 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition - j3;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    private long getCurrentPosition() {
        if (this.webView != null) {
            return r0.getCurrentPosition();
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return 0L;
        }
        return t51Var.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return 0L;
        }
        return t51Var.U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        if (r0 != 2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void incrementRewindCount() {
        if (this.videoPlayer == null && this.webView == null) {
            return;
        }
        int i7 = this.rewindCount + 1;
        this.rewindCount = i7;
        boolean z9 = false;
        if (i7 == 1) {
            if (this.rewindForward && isPlaying()) {
                this.rewindByBackSeek = false;
            } else {
                this.rewindByBackSeek = true;
            }
        }
        if (!this.rewindForward || this.rewindByBackSeek) {
            int i10 = this.rewindCount;
            if (i10 != 1) {
            }
            z9 = true;
            if (this.rewindCount == 1) {
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                long currentTimeMillis = System.currentTimeMillis();
                this.rewindLastTime = currentTimeMillis;
                this.rewindLastUpdatePlayerTime = currentTimeMillis;
                this.startRewindFrom = getCurrentPosition();
                onRewindStart(this.rewindForward);
            }
            g0.r(this.backSeek);
            g0.h3(this.backSeek);
            if (z9) {
                Runnable runnable = this.updateRewindRunnable;
                if (runnable != null) {
                    g0.r(runnable);
                }
                a aVar = new a(this, 0);
                this.updateRewindRunnable = aVar;
                g0.i3(aVar, 2000L);
                return;
            }
            return;
        }
        int i11 = this.rewindCount;
        if (i11 == 1) {
            setPlaybackSpeed(4.0f);
        } else if (i11 == 2) {
            setPlaybackSpeed(7.0f);
        } else {
            setPlaybackSpeed(13.0f);
            if (this.rewindCount == 1) {
            }
            g0.r(this.backSeek);
            g0.h3(this.backSeek);
            if (z9) {
            }
        }
        z9 = true;
        if (this.rewindCount == 1) {
        }
        g0.r(this.backSeek);
        g0.h3(this.backSeek);
        if (z9) {
        }
    }

    private boolean isPlaying() {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            return ae0Var.G;
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return false;
        }
        return t51Var.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j3) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            ae0Var.i(j3);
            return;
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return;
        }
        t51Var.p0(j3);
    }

    private void setPlaybackSpeed(float f10) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            ae0Var.setPlaybackSpeed(f10);
            return;
        }
        t51 t51Var = this.videoPlayer;
        if (t51Var == null) {
            return;
        }
        t51Var.v0(f10);
    }

    public void cancelRewind() {
        if (this.rewindCount != 0) {
            this.rewindCount = 0;
            if (this.videoPlayer != null || this.webView != null) {
                if (this.rewindByBackSeek) {
                    seekTo(this.rewindBackSeekPlayerPosition);
                } else {
                    seekTo(getCurrentPosition());
                }
                setPlaybackSpeed(this.playSpeed);
            }
        }
        g0.r(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            g0.r(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void startRewind(ae0 ae0Var, boolean z9, float f10) {
        this.webView = ae0Var;
        this.playSpeed = f10;
        this.rewindForward = z9;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(t51 t51Var, boolean z9, float f10) {
        this.videoPlayer = t51Var;
        this.playSpeed = f10;
        this.rewindForward = z9;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z9) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z9) {
    }
}

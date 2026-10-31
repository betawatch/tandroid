package org.telegram.messenger.video;

import org.telegram.messenger.i0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ve0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    private u61 videoPlayer;
    private ve0 webView;
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
            long j10 = currentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
            OldVideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
            OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
            int i10 = oldVideoPlayerRewinder.rewindCount;
            long j11 = j10 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L);
            if (oldVideoPlayerRewinder.rewindForward) {
                OldVideoPlayerRewinder.access$514(OldVideoPlayerRewinder.this, j11);
            } else {
                OldVideoPlayerRewinder.access$522(OldVideoPlayerRewinder.this, j11);
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
                i0.h3(oldVideoPlayerRewinder8.backSeek, 16L);
            }
        }
    };

    public static /* synthetic */ long access$514(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j10) {
        long j11 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition + j10;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    public static /* synthetic */ long access$522(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j10) {
        long j11 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition - j10;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    private long getCurrentPosition() {
        if (this.webView != null) {
            return r0.getCurrentPosition();
        }
        u61 u61Var = this.videoPlayer;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        u61 u61Var = this.videoPlayer;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.U();
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
        int i10 = this.rewindCount + 1;
        this.rewindCount = i10;
        boolean z10 = false;
        if (i10 == 1) {
            if (this.rewindForward && isPlaying()) {
                this.rewindByBackSeek = false;
            } else {
                this.rewindByBackSeek = true;
            }
        }
        if (!this.rewindForward || this.rewindByBackSeek) {
            int i11 = this.rewindCount;
            if (i11 != 1) {
            }
            z10 = true;
            if (this.rewindCount == 1) {
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                long currentTimeMillis = System.currentTimeMillis();
                this.rewindLastTime = currentTimeMillis;
                this.rewindLastUpdatePlayerTime = currentTimeMillis;
                this.startRewindFrom = getCurrentPosition();
                onRewindStart(this.rewindForward);
            }
            i0.r(this.backSeek);
            i0.g3(this.backSeek);
            if (z10) {
                Runnable runnable = this.updateRewindRunnable;
                if (runnable != null) {
                    i0.r(runnable);
                }
                a aVar = new a(this, 0);
                this.updateRewindRunnable = aVar;
                i0.h3(aVar, 2000L);
                return;
            }
            return;
        }
        int i12 = this.rewindCount;
        if (i12 == 1) {
            setPlaybackSpeed(4.0f);
        } else if (i12 == 2) {
            setPlaybackSpeed(7.0f);
        } else {
            setPlaybackSpeed(13.0f);
            if (this.rewindCount == 1) {
            }
            i0.r(this.backSeek);
            i0.g3(this.backSeek);
            if (z10) {
            }
        }
        z10 = true;
        if (this.rewindCount == 1) {
        }
        i0.r(this.backSeek);
        i0.g3(this.backSeek);
        if (z10) {
        }
    }

    private boolean isPlaying() {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            return ve0Var.G;
        }
        u61 u61Var = this.videoPlayer;
        if (u61Var == null) {
            return false;
        }
        return u61Var.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j10) {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            ve0Var.i(j10);
            return;
        }
        u61 u61Var = this.videoPlayer;
        if (u61Var == null) {
            return;
        }
        u61Var.p0(j10);
    }

    private void setPlaybackSpeed(float f7) {
        ve0 ve0Var = this.webView;
        if (ve0Var != null) {
            ve0Var.setPlaybackSpeed(f7);
            return;
        }
        u61 u61Var = this.videoPlayer;
        if (u61Var == null) {
            return;
        }
        u61Var.v0(f7);
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
        i0.r(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            i0.r(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void startRewind(ve0 ve0Var, boolean z10, float f7) {
        this.webView = ve0Var;
        this.playSpeed = f7;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(u61 u61Var, boolean z10, float f7) {
        this.videoPlayer = u61Var;
        this.playSpeed = f7;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f7, boolean z10) {
    }
}

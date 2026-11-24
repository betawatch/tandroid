package org.telegram.messenger.video;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
    private ndc videoPlayer;
    private bc8 webView;
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
            long j = currentTimeMillis - OldVideoPlayerRewinder.this.rewindLastTime;
            OldVideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
            OldVideoPlayerRewinder oldVideoPlayerRewinder = OldVideoPlayerRewinder.this;
            int i = oldVideoPlayerRewinder.rewindCount;
            long j2 = j * (i == 1 ? 3L : i == 2 ? 6L : 12L);
            boolean z = oldVideoPlayerRewinder.rewindForward;
            OldVideoPlayerRewinder oldVideoPlayerRewinder2 = OldVideoPlayerRewinder.this;
            if (z) {
                OldVideoPlayerRewinder.access$514(oldVideoPlayerRewinder2, j2);
            } else {
                OldVideoPlayerRewinder.access$522(oldVideoPlayerRewinder2, j2);
            }
            long j3 = OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition;
            OldVideoPlayerRewinder oldVideoPlayerRewinder3 = OldVideoPlayerRewinder.this;
            if (j3 < 0) {
                oldVideoPlayerRewinder3.rewindBackSeekPlayerPosition = 0L;
            } else if (oldVideoPlayerRewinder3.rewindBackSeekPlayerPosition > duration) {
                OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition = duration;
            }
            OldVideoPlayerRewinder oldVideoPlayerRewinder4 = OldVideoPlayerRewinder.this;
            if (oldVideoPlayerRewinder4.rewindByBackSeek && oldVideoPlayerRewinder4.rewindLastTime - OldVideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 350) {
                OldVideoPlayerRewinder oldVideoPlayerRewinder5 = OldVideoPlayerRewinder.this;
                oldVideoPlayerRewinder5.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder5.rewindLastTime;
                OldVideoPlayerRewinder oldVideoPlayerRewinder6 = OldVideoPlayerRewinder.this;
                oldVideoPlayerRewinder6.seekTo(oldVideoPlayerRewinder6.rewindBackSeekPlayerPosition);
            }
            OldVideoPlayerRewinder oldVideoPlayerRewinder7 = OldVideoPlayerRewinder.this;
            oldVideoPlayerRewinder7.updateRewindProgressUi(OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition - OldVideoPlayerRewinder.this.startRewindFrom, OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition / OldVideoPlayerRewinder.this.getDuration(), oldVideoPlayerRewinder7.rewindByBackSeek);
            if (OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || OldVideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                OldVideoPlayerRewinder oldVideoPlayerRewinder8 = OldVideoPlayerRewinder.this;
                if (oldVideoPlayerRewinder8.rewindByBackSeek) {
                    oldVideoPlayerRewinder8.rewindLastUpdatePlayerTime = oldVideoPlayerRewinder8.rewindLastTime;
                    OldVideoPlayerRewinder oldVideoPlayerRewinder9 = OldVideoPlayerRewinder.this;
                    oldVideoPlayerRewinder9.seekTo(oldVideoPlayerRewinder9.rewindBackSeekPlayerPosition);
                }
                OldVideoPlayerRewinder.this.cancelRewind();
            }
            OldVideoPlayerRewinder oldVideoPlayerRewinder10 = OldVideoPlayerRewinder.this;
            if (oldVideoPlayerRewinder10.rewindCount > 0) {
                gm.d3(oldVideoPlayerRewinder10.backSeek, 16L);
            }
        }
    };

    public static /* synthetic */ long access$514(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j) {
        long j2 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition + j;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    public static /* synthetic */ long access$522(OldVideoPlayerRewinder oldVideoPlayerRewinder, long j) {
        long j2 = oldVideoPlayerRewinder.rewindBackSeekPlayerPosition - j;
        oldVideoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    private long getCurrentPosition() {
        if (this.webView != null) {
            return r0.getCurrentPosition();
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        if (r0 != 2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void incrementRewindCount() {
        if (this.videoPlayer == null && this.webView == null) {
            return;
        }
        int i = this.rewindCount + 1;
        this.rewindCount = i;
        boolean z = false;
        if (i == 1) {
            if (this.rewindForward && isPlaying()) {
                this.rewindByBackSeek = false;
            } else {
                this.rewindByBackSeek = true;
            }
        }
        if (!this.rewindForward || this.rewindByBackSeek) {
            int i2 = this.rewindCount;
            if (i2 != 1) {
            }
            z = true;
            if (this.rewindCount == 1) {
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                long currentTimeMillis = System.currentTimeMillis();
                this.rewindLastTime = currentTimeMillis;
                this.rewindLastUpdatePlayerTime = currentTimeMillis;
                this.startRewindFrom = getCurrentPosition();
                onRewindStart(this.rewindForward);
            }
            gm.r(this.backSeek);
            gm.c3(this.backSeek);
            if (z) {
                Runnable runnable = this.updateRewindRunnable;
                if (runnable != null) {
                    gm.r(runnable);
                }
                kl7 kl7Var = new kl7(this, (byte) 4);
                this.updateRewindRunnable = kl7Var;
                gm.d3(kl7Var, 2000L);
                return;
            }
            return;
        }
        int i3 = this.rewindCount;
        if (i3 == 1) {
            setPlaybackSpeed(4.0f);
        } else if (i3 == 2) {
            setPlaybackSpeed(7.0f);
        } else {
            setPlaybackSpeed(13.0f);
            if (this.rewindCount == 1) {
            }
            gm.r(this.backSeek);
            gm.c3(this.backSeek);
            if (z) {
            }
        }
        z = true;
        if (this.rewindCount == 1) {
        }
        gm.r(this.backSeek);
        gm.c3(this.backSeek);
        if (z) {
        }
    }

    private boolean isPlaying() {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            return bc8Var.H;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return false;
        }
        return ndcVar.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            bc8Var.i(j);
            return;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return;
        }
        ndcVar.o0(j);
    }

    private void setPlaybackSpeed(float f) {
        bc8 bc8Var = this.webView;
        if (bc8Var != null) {
            bc8Var.setPlaybackSpeed(f);
            return;
        }
        ndc ndcVar = this.videoPlayer;
        if (ndcVar == null) {
            return;
        }
        ndcVar.u0(f);
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
        gm.r(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            gm.r(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void startRewind(bc8 bc8Var, boolean z, float f) {
        this.webView = bc8Var;
        this.playSpeed = f;
        this.rewindForward = z;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(ndc ndcVar, boolean z, float f) {
        this.videoPlayer = ndcVar;
        this.playSpeed = f;
        this.rewindForward = z;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z) {
    }

    public void updateRewindProgressUi(long j, float f, boolean z) {
    }
}

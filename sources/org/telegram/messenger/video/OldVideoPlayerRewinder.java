package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.qf0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    private g71 videoPlayer;
    private qf0 webView;
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
            int i10 = oldVideoPlayerRewinder.rewindCount;
            long j10 = j3 * (i10 == 1 ? 3L : i10 == 2 ? 6L : 12L);
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
                AndroidUtilities.runOnUIThread(oldVideoPlayerRewinder8.backSeek, 16L);
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
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return 0L;
        }
        return g71Var.p();
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
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            AndroidUtilities.runOnUIThread(this.backSeek);
            if (z10) {
                Runnable runnable = this.updateRewindRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                a aVar = new a(this, 0);
                this.updateRewindRunnable = aVar;
                AndroidUtilities.runOnUIThread(aVar, 2000L);
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
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            AndroidUtilities.runOnUIThread(this.backSeek);
            if (z10) {
            }
        }
        z10 = true;
        if (this.rewindCount == 1) {
        }
        AndroidUtilities.cancelRunOnUIThread(this.backSeek);
        AndroidUtilities.runOnUIThread(this.backSeek);
        if (z10) {
        }
    }

    private boolean isPlaying() {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            return qf0Var.G;
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return false;
        }
        return g71Var.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j3) {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            qf0Var.i(j3);
            return;
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return;
        }
        g71Var.K(j3);
    }

    private void setPlaybackSpeed(float f7) {
        qf0 qf0Var = this.webView;
        if (qf0Var != null) {
            qf0Var.setPlaybackSpeed(f7);
            return;
        }
        g71 g71Var = this.videoPlayer;
        if (g71Var == null) {
            return;
        }
        g71Var.Q(f7);
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
        AndroidUtilities.cancelRunOnUIThread(this.backSeek);
        Runnable runnable = this.updateRewindRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRewindRunnable = null;
        }
        onRewindCanceled();
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void startRewind(qf0 qf0Var, boolean z10, float f7) {
        this.webView = qf0Var;
        this.playSpeed = f7;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(g71 g71Var, boolean z10, float f7) {
        this.videoPlayer = g71Var;
        this.playSpeed = f7;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j3, float f7, boolean z10) {
    }
}

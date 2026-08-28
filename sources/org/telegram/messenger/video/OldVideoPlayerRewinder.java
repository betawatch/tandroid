package org.telegram.messenger.video;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ze0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    private k61 videoPlayer;
    private ze0 webView;
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
            int i9 = oldVideoPlayerRewinder.rewindCount;
            long j11 = j10 * (i9 == 1 ? 3L : i9 == 2 ? 6L : 12L);
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
                AndroidUtilities.runOnUIThread(oldVideoPlayerRewinder8.backSeek, 16L);
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
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.q();
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
        int i9 = this.rewindCount + 1;
        this.rewindCount = i9;
        boolean z10 = false;
        if (i9 == 1) {
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
        int i11 = this.rewindCount;
        if (i11 == 1) {
            setPlaybackSpeed(4.0f);
        } else if (i11 == 2) {
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
        ze0 ze0Var = this.webView;
        if (ze0Var != null) {
            return ze0Var.C;
        }
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            return false;
        }
        return k61Var.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j10) {
        ze0 ze0Var = this.webView;
        if (ze0Var != null) {
            ze0Var.i(j10);
            return;
        }
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            return;
        }
        k61Var.L(j10);
    }

    private void setPlaybackSpeed(float f10) {
        ze0 ze0Var = this.webView;
        if (ze0Var != null) {
            ze0Var.setPlaybackSpeed(f10);
            return;
        }
        k61 k61Var = this.videoPlayer;
        if (k61Var == null) {
            return;
        }
        k61Var.R(f10);
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

    public void startRewind(ze0 ze0Var, boolean z10, float f10) {
        this.webView = ze0Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(k61 k61Var, boolean z10, float f10) {
        this.videoPlayer = k61Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f10, boolean z10) {
    }
}

package org.telegram.messenger.video;

import org.telegram.messenger.g0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ke0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
    private f61 videoPlayer;
    private ke0 webView;
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
                g0.h3(oldVideoPlayerRewinder8.backSeek, 16L);
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
        f61 f61Var = this.videoPlayer;
        if (f61Var == null) {
            return 0L;
        }
        return f61Var.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        f61 f61Var = this.videoPlayer;
        if (f61Var == null) {
            return 0L;
        }
        return f61Var.U();
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
        boolean z10 = false;
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
            z10 = true;
            if (this.rewindCount == 1) {
                this.rewindBackSeekPlayerPosition = getCurrentPosition();
                long currentTimeMillis = System.currentTimeMillis();
                this.rewindLastTime = currentTimeMillis;
                this.rewindLastUpdatePlayerTime = currentTimeMillis;
                this.startRewindFrom = getCurrentPosition();
                onRewindStart(this.rewindForward);
            }
            g0.r(this.backSeek);
            g0.g3(this.backSeek);
            if (z10) {
                Runnable runnable = this.updateRewindRunnable;
                if (runnable != null) {
                    g0.r(runnable);
                }
                a aVar = new a(this, 0);
                this.updateRewindRunnable = aVar;
                g0.h3(aVar, 2000L);
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
            g0.g3(this.backSeek);
            if (z10) {
            }
        }
        z10 = true;
        if (this.rewindCount == 1) {
        }
        g0.r(this.backSeek);
        g0.g3(this.backSeek);
        if (z10) {
        }
    }

    private boolean isPlaying() {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            return ke0Var.H;
        }
        f61 f61Var = this.videoPlayer;
        if (f61Var == null) {
            return false;
        }
        return f61Var.d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$incrementRewindCount$0() {
        this.updateRewindRunnable = null;
        incrementRewindCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j3) {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            ke0Var.i(j3);
            return;
        }
        f61 f61Var = this.videoPlayer;
        if (f61Var == null) {
            return;
        }
        f61Var.p0(j3);
    }

    private void setPlaybackSpeed(float f10) {
        ke0 ke0Var = this.webView;
        if (ke0Var != null) {
            ke0Var.setPlaybackSpeed(f10);
            return;
        }
        f61 f61Var = this.videoPlayer;
        if (f61Var == null) {
            return;
        }
        f61Var.v0(f10);
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

    public void startRewind(ke0 ke0Var, boolean z10, float f10) {
        this.webView = ke0Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void startRewind(f61 f61Var, boolean z10, float f10) {
        this.videoPlayer = f61Var;
        this.playSpeed = f10;
        this.rewindForward = z10;
        cancelRewind();
        incrementRewindCount();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z10) {
    }
}

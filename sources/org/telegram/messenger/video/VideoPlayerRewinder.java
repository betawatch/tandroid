package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.ze0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class VideoPlayerRewinder {
    private boolean fastSeeking;
    private VideoFramesRewinder framesRewinder;
    private long rewindBackSeekLastPlayerPosition;
    public boolean rewindByBackSeek;
    public int rewindCount;
    private boolean rewindForward;
    private long rewindLastTime;
    private long rewindLastUpdatePlayerTime;
    public boolean rewinding;
    private tn0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private k61 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private ze0 webView;
    private float x;
    private long rewindBackSeekPlayerPosition = -1;
    private float playSpeed = 1.0f;
    private final Runnable backSeek = new Runnable() { // from class: org.telegram.messenger.video.VideoPlayerRewinder.1
        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayerRewinder.this.videoPlayer == null && VideoPlayerRewinder.this.webView == null) {
                return;
            }
            long duration = VideoPlayerRewinder.this.getDuration();
            if (duration == 0 || duration == -9223372036854775807L) {
                VideoPlayerRewinder.this.rewindLastTime = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
            VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
            float max = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
            VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, (long) (j10 * max));
            VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
            videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.clamp(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
            VideoPlayerRewinder videoPlayerRewinder2 = VideoPlayerRewinder.this;
            if (videoPlayerRewinder2.rewindByBackSeek && videoPlayerRewinder2.getCurrentPosition() > VideoPlayerRewinder.this.rewindBackSeekPlayerPosition && VideoPlayerRewinder.this.rewindLastTime - VideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 10) {
                VideoPlayerRewinder videoPlayerRewinder3 = VideoPlayerRewinder.this;
                videoPlayerRewinder3.rewindLastUpdatePlayerTime = videoPlayerRewinder3.rewindLastTime;
                if (VideoPlayerRewinder.this.framesRewinder != null) {
                    VideoPlayerRewinder.this.framesRewinder.seek(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition, Math.abs(max));
                } else {
                    VideoPlayerRewinder videoPlayerRewinder4 = VideoPlayerRewinder.this;
                    videoPlayerRewinder4.seekTo(videoPlayerRewinder4.rewindBackSeekPlayerPosition, false);
                }
            }
            VideoPlayerRewinder videoPlayerRewinder5 = VideoPlayerRewinder.this;
            videoPlayerRewinder5.updateRewindProgressUi(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition - VideoPlayerRewinder.this.startRewindFrom, VideoPlayerRewinder.this.rewindBackSeekPlayerPosition / VideoPlayerRewinder.this.getDuration(), videoPlayerRewinder5.rewindByBackSeek);
            if (VideoPlayerRewinder.this.rewindBackSeekPlayerPosition == 0 || VideoPlayerRewinder.this.rewindBackSeekPlayerPosition >= duration) {
                VideoPlayerRewinder videoPlayerRewinder6 = VideoPlayerRewinder.this;
                if (videoPlayerRewinder6.rewindByBackSeek) {
                    videoPlayerRewinder6.rewindLastUpdatePlayerTime = videoPlayerRewinder6.rewindLastTime;
                    VideoPlayerRewinder videoPlayerRewinder7 = VideoPlayerRewinder.this;
                    videoPlayerRewinder7.seekTo(videoPlayerRewinder7.rewindBackSeekPlayerPosition, false);
                }
                VideoPlayerRewinder.this.cancelRewind();
            }
            VideoPlayerRewinder videoPlayerRewinder8 = VideoPlayerRewinder.this;
            if (!videoPlayerRewinder8.rewinding || videoPlayerRewinder8.getRewindSpeed() >= 0.0f) {
                return;
            }
            AndroidUtilities.runOnUIThread(VideoPlayerRewinder.this.backSeek, 16L);
        }
    };

    public VideoPlayerRewinder(VideoFramesRewinder videoFramesRewinder) {
        this.framesRewinder = videoFramesRewinder;
    }

    public static /* synthetic */ long access$522(VideoPlayerRewinder videoPlayerRewinder, long j10) {
        long j11 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j10;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j11;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentPosition() {
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
    public /* synthetic */ void lambda$cancelRewind$1() {
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateRewindSpeed$0() {
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.clearCurrent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(long j10, boolean z10) {
        ze0 ze0Var = this.webView;
        if (ze0Var != null) {
            ze0Var.i(j10);
        } else {
            k61 k61Var = this.videoPlayer;
            if (k61Var != null) {
                k61Var.M(j10, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j10;
    }

    private void setMuted(boolean z10) {
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            k61Var.P(z10);
        }
    }

    private void setPaused(boolean z10) {
        ze0 ze0Var = this.webView;
        if (ze0Var != null) {
            if (z10) {
                ze0Var.f();
                return;
            } else {
                ze0Var.g();
                return;
            }
        }
        k61 k61Var = this.videoPlayer;
        if (k61Var != null) {
            if (z10) {
                k61Var.C();
            } else {
                k61Var.D();
            }
        }
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
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            k61 k61Var = this.videoPlayer;
            if (k61Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (!this.rewindByBackSeek) {
                    seekTo(getCurrentPosition(), false);
                } else if (k61Var == null || this.framesRewinder == null) {
                    seekTo(this.rewindBackSeekPlayerPosition, false);
                } else {
                    k61Var.N(this.rewindBackSeekPlayerPosition, false, new r(this, 1));
                    z10 = true;
                    setPlaybackSpeed(this.playSpeed);
                }
                z10 = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            AndroidUtilities.cancelRunOnUIThread(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z10) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            tn0 tn0Var = this.seekSpeedDrawable;
            if (tn0Var != null) {
                tn0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f10 = this.value;
        if (f10 < 0.4f) {
            f10 -= 1.9f;
        }
        return Utilities.clamp(f10, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f10) {
        return f10 < -1.5f ? f10 + 1.9f : f10;
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void setX(float f10) {
        this.value -= (this.x - f10) / AndroidUtilities.dp(40.0f);
        this.x = f10;
        tn0 tn0Var = this.seekSpeedDrawable;
        if (tn0Var != null) {
            tn0Var.c(getRewindSpeed(), true);
        }
        updateRewindSpeed();
    }

    public void startRewind(ze0 ze0Var, boolean z10, float f10, float f11, tn0 tn0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z10;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = ze0Var;
        this.seekSpeedDrawable = tn0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (ze0Var == null || ze0Var.C) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (tn0Var != null) {
            tn0Var.c(getRewindSpeed(), false);
            tn0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        k61 k61Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z10 = true;
        if (rewindSpeed >= 0.0f) {
            if (this.rewindByBackSeek) {
                this.rewindByBackSeek = false;
                AndroidUtilities.cancelRunOnUIThread(this.backSeek);
                if (!this.wasMuted && !this.wasPaused) {
                    z10 = false;
                }
                setMuted(z10);
                setPaused(false);
                k61 k61Var2 = this.videoPlayer;
                if (k61Var2 != null && this.framesRewinder != null) {
                    long j10 = this.rewindBackSeekPlayerPosition;
                    if (j10 >= 0) {
                        k61Var2.N(j10, false, new r(this, 0));
                    }
                }
            }
            setPlaybackSpeed(this.playSpeed * rewindSpeed);
            return;
        }
        if (this.rewindByBackSeek) {
            return;
        }
        this.rewindByBackSeek = true;
        this.rewindBackSeekPlayerPosition = getCurrentPosition();
        this.rewindLastTime = System.currentTimeMillis();
        AndroidUtilities.runOnUIThread(this.backSeek);
        setMuted(true);
        setPaused(true);
        setPlaybackSpeed(this.playSpeed);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder == null || videoFramesRewinder.isReady() || (k61Var = this.videoPlayer) == null) {
            return;
        }
        VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
        ArrayList arrayList = k61Var.J;
        if (arrayList != null) {
            loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((g61) k61Var.J.get(size)).d;
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    i61 i61Var = (i61) obj;
                    if (!i61Var.b()) {
                        i61Var.e(true);
                    }
                    if (i61Var.b()) {
                        file = new File(i61Var.d.getPath());
                        break loop0;
                    }
                }
            }
        }
        Uri uri = k61Var.M;
        file = (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) ? null : new File(k61Var.M.getPath());
        videoFramesRewinder2.setup(file);
    }

    public void startRewind(k61 k61Var, boolean z10, float f10, float f11, tn0 tn0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z10;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.videoPlayer = k61Var;
        this.seekSpeedDrawable = tn0Var;
        this.playSpeed = f11;
        this.wasMuted = k61Var != null && k61Var.y();
        this.wasPaused = (k61Var == null || k61Var.z()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (tn0Var != null) {
            tn0Var.c(getRewindSpeed(), false);
            tn0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j10, float f10, boolean z10) {
    }
}

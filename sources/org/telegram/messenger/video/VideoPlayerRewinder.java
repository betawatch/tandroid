package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    private qm0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private n51 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private ae0 webView;
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
            long j3 = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
            VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
            float max = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
            VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, (long) (j3 * max));
            VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
            videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.k(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
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
            g0.i3(VideoPlayerRewinder.this.backSeek, 16L);
        }
    };

    public VideoPlayerRewinder(VideoFramesRewinder videoFramesRewinder) {
        this.framesRewinder = videoFramesRewinder;
    }

    public static /* synthetic */ long access$522(VideoPlayerRewinder videoPlayerRewinder, long j3) {
        long j10 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j3;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentPosition() {
        if (this.webView != null) {
            return r0.getCurrentPosition();
        }
        n51 n51Var = this.videoPlayer;
        if (n51Var == null) {
            return 0L;
        }
        return n51Var.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        n51 n51Var = this.videoPlayer;
        if (n51Var == null) {
            return 0L;
        }
        return n51Var.U();
    }

    private boolean isPlaying() {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            return ae0Var.G;
        }
        n51 n51Var = this.videoPlayer;
        if (n51Var == null) {
            return false;
        }
        return n51Var.d0();
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
    public void seekTo(long j3, boolean z9) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            ae0Var.i(j3);
        } else {
            n51 n51Var = this.videoPlayer;
            if (n51Var != null) {
                n51Var.q0(j3, z9);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j3;
    }

    private void setMuted(boolean z9) {
        n51 n51Var = this.videoPlayer;
        if (n51Var != null) {
            n51Var.t0(z9);
        }
    }

    private void setPaused(boolean z9) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            if (z9) {
                ae0Var.f();
                return;
            } else {
                ae0Var.g();
                return;
            }
        }
        n51 n51Var = this.videoPlayer;
        if (n51Var != null) {
            if (z9) {
                n51Var.g0();
            } else {
                n51Var.h0();
            }
        }
    }

    private void setPlaybackSpeed(float f10) {
        ae0 ae0Var = this.webView;
        if (ae0Var != null) {
            ae0Var.setPlaybackSpeed(f10);
            return;
        }
        n51 n51Var = this.videoPlayer;
        if (n51Var == null) {
            return;
        }
        n51Var.v0(f10);
    }

    public void cancelRewind() {
        boolean z9;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            n51 n51Var = this.videoPlayer;
            if (n51Var == null && this.webView == null) {
                z9 = false;
            } else {
                if (!this.rewindByBackSeek) {
                    seekTo(getCurrentPosition(), false);
                } else if (n51Var == null || this.framesRewinder == null) {
                    seekTo(this.rewindBackSeekPlayerPosition, false);
                } else {
                    n51Var.r0(this.rewindBackSeekPlayerPosition, false, new q(this, 1));
                    z9 = true;
                    setPlaybackSpeed(this.playSpeed);
                }
                z9 = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            g0.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z9) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                g0.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            qm0 qm0Var = this.seekSpeedDrawable;
            if (qm0Var != null) {
                qm0Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f10 = this.value;
        if (f10 < 0.4f) {
            f10 -= 1.9f;
        }
        return Utilities.i(f10, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f10) {
        return f10 < -1.5f ? f10 + 1.9f : f10;
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void setX(float f10) {
        this.value -= (this.x - f10) / g0.L(40.0f);
        this.x = f10;
        qm0 qm0Var = this.seekSpeedDrawable;
        if (qm0Var != null) {
            qm0Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(ae0 ae0Var, boolean z9, float f10, float f11, qm0 qm0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z9;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = ae0Var;
        this.seekSpeedDrawable = qm0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (ae0Var == null || ae0Var.G) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f10;
        this.value = getValueBySpeed(z9 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (qm0Var != null) {
            qm0Var.c(false, getRewindSpeed());
            qm0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        n51 n51Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z9 = true;
        if (rewindSpeed >= 0.0f) {
            if (this.rewindByBackSeek) {
                this.rewindByBackSeek = false;
                g0.r(this.backSeek);
                if (!this.wasMuted && !this.wasPaused) {
                    z9 = false;
                }
                setMuted(z9);
                setPaused(false);
                n51 n51Var2 = this.videoPlayer;
                if (n51Var2 != null && this.framesRewinder != null) {
                    long j3 = this.rewindBackSeekPlayerPosition;
                    if (j3 >= 0) {
                        n51Var2.r0(j3, false, new q(this, 0));
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
        g0.h3(this.backSeek);
        setMuted(true);
        setPaused(true);
        setPlaybackSpeed(this.playSpeed);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder == null || videoFramesRewinder.isReady() || (n51Var = this.videoPlayer) == null) {
            return;
        }
        VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
        ArrayList arrayList = n51Var.N;
        if (arrayList != null) {
            loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((k51) n51Var.N.get(size)).d;
                int size2 = arrayList2.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    m51 m51Var = (m51) obj;
                    if (!m51Var.b()) {
                        m51Var.e(true);
                    }
                    if (m51Var.b()) {
                        file = new File(m51Var.d.getPath());
                        break loop0;
                    }
                }
            }
        }
        Uri uri = n51Var.Q;
        file = (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) ? null : new File(n51Var.Q.getPath());
        videoFramesRewinder2.setup(file);
    }

    public void onRewindCanceled() {
    }

    public void startRewind(n51 n51Var, boolean z9, float f10, float f11, qm0 qm0Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z9;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.videoPlayer = n51Var;
        this.seekSpeedDrawable = qm0Var;
        this.playSpeed = f11;
        this.wasMuted = n51Var != null && n51Var.c0();
        this.wasPaused = (n51Var == null || n51Var.d0()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f10;
        this.value = getValueBySpeed(z9 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (qm0Var != null) {
            qm0Var.c(false, getRewindSpeed());
            qm0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindStart(boolean z9) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z9) {
    }
}

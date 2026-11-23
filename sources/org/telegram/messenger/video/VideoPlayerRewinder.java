package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.le0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    private fn0 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private i61 videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private le0 webView;
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
            g0.h3(VideoPlayerRewinder.this.backSeek, 16L);
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
        i61 i61Var = this.videoPlayer;
        if (i61Var == null) {
            return 0L;
        }
        return i61Var.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        i61 i61Var = this.videoPlayer;
        if (i61Var == null) {
            return 0L;
        }
        return i61Var.U();
    }

    private boolean isPlaying() {
        le0 le0Var = this.webView;
        if (le0Var != null) {
            return le0Var.H;
        }
        i61 i61Var = this.videoPlayer;
        if (i61Var == null) {
            return false;
        }
        return i61Var.d0();
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
    public void seekTo(long j3, boolean z10) {
        le0 le0Var = this.webView;
        if (le0Var != null) {
            le0Var.i(j3);
        } else {
            i61 i61Var = this.videoPlayer;
            if (i61Var != null) {
                i61Var.q0(j3, z10);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j3;
    }

    private void setMuted(boolean z10) {
        i61 i61Var = this.videoPlayer;
        if (i61Var != null) {
            i61Var.t0(z10);
        }
    }

    private void setPaused(boolean z10) {
        le0 le0Var = this.webView;
        if (le0Var != null) {
            if (z10) {
                le0Var.f();
                return;
            } else {
                le0Var.g();
                return;
            }
        }
        i61 i61Var = this.videoPlayer;
        if (i61Var != null) {
            if (z10) {
                i61Var.g0();
            } else {
                i61Var.h0();
            }
        }
    }

    private void setPlaybackSpeed(float f10) {
        le0 le0Var = this.webView;
        if (le0Var != null) {
            le0Var.setPlaybackSpeed(f10);
            return;
        }
        i61 i61Var = this.videoPlayer;
        if (i61Var == null) {
            return;
        }
        i61Var.v0(f10);
    }

    public void cancelRewind() {
        boolean z10;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            i61 i61Var = this.videoPlayer;
            if (i61Var == null && this.webView == null) {
                z10 = false;
            } else {
                if (!this.rewindByBackSeek) {
                    seekTo(getCurrentPosition(), false);
                } else if (i61Var == null || this.framesRewinder == null) {
                    seekTo(this.rewindBackSeekPlayerPosition, false);
                } else {
                    i61Var.r0(this.rewindBackSeekPlayerPosition, false, new p(this, 1));
                    z10 = true;
                    setPlaybackSpeed(this.playSpeed);
                }
                z10 = false;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            g0.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && !z10) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                g0.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            fn0 fn0Var = this.seekSpeedDrawable;
            if (fn0Var != null) {
                fn0Var.b(false);
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
        fn0 fn0Var = this.seekSpeedDrawable;
        if (fn0Var != null) {
            fn0Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    public void startRewind(le0 le0Var, boolean z10, float f10, float f11, fn0 fn0Var) {
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
        this.webView = le0Var;
        this.seekSpeedDrawable = fn0Var;
        this.playSpeed = f11;
        this.wasMuted = false;
        this.wasPaused = (le0Var == null || le0Var.H) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (fn0Var != null) {
            fn0Var.c(false, getRewindSpeed());
            fn0Var.b(true);
        }
    }

    public void updateRewindSpeed() {
        i61 i61Var;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z10 = true;
        if (rewindSpeed >= 0.0f) {
            if (this.rewindByBackSeek) {
                this.rewindByBackSeek = false;
                g0.r(this.backSeek);
                if (!this.wasMuted && !this.wasPaused) {
                    z10 = false;
                }
                setMuted(z10);
                setPaused(false);
                i61 i61Var2 = this.videoPlayer;
                if (i61Var2 != null && this.framesRewinder != null) {
                    long j3 = this.rewindBackSeekPlayerPosition;
                    if (j3 >= 0) {
                        i61Var2.r0(j3, false, new p(this, 0));
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
        g0.g3(this.backSeek);
        setMuted(true);
        setPaused(true);
        setPlaybackSpeed(this.playSpeed);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder == null || videoFramesRewinder.isReady() || (i61Var = this.videoPlayer) == null) {
            return;
        }
        VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
        ArrayList arrayList = i61Var.O;
        if (arrayList != null) {
            loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((f61) i61Var.O.get(size)).d;
                int size2 = arrayList2.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    h61 h61Var = (h61) obj;
                    if (!h61Var.b()) {
                        h61Var.e(true);
                    }
                    if (h61Var.b()) {
                        file = new File(h61Var.d.getPath());
                        break loop0;
                    }
                }
            }
        }
        Uri uri = i61Var.R;
        file = (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) ? null : new File(i61Var.R.getPath());
        videoFramesRewinder2.setup(file);
    }

    public void onRewindCanceled() {
    }

    public void startRewind(i61 i61Var, boolean z10, float f10, float f11, fn0 fn0Var) {
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
        this.videoPlayer = i61Var;
        this.seekSpeedDrawable = fn0Var;
        this.playSpeed = f11;
        this.wasMuted = i61Var != null && i61Var.c0();
        this.wasPaused = (i61Var == null || i61Var.d0()) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f10;
        this.value = getValueBySpeed(z10 ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (fn0Var != null) {
            fn0Var.c(false, getRewindSpeed());
            fn0Var.b(true);
        }
        updateRewindSpeed();
    }

    public void onRewindStart(boolean z10) {
    }

    public void updateRewindProgressUi(long j3, float f10, boolean z10) {
    }
}

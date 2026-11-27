package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
    private cz9 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private kfc videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private qd8 webView;
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
            long j = currentTimeMillis - VideoPlayerRewinder.this.rewindLastTime;
            VideoPlayerRewinder.this.rewindLastTime = currentTimeMillis;
            float max = Math.max(0.0f, VideoPlayerRewinder.this.playSpeed * (-VideoPlayerRewinder.this.getRewindSpeed()));
            VideoPlayerRewinder.this.rewindBackSeekPlayerPosition -= (long) (j * max);
            VideoPlayerRewinder videoPlayerRewinder = VideoPlayerRewinder.this;
            videoPlayerRewinder.rewindBackSeekPlayerPosition = Utilities.k(videoPlayerRewinder.rewindBackSeekPlayerPosition, duration, 0L);
            VideoPlayerRewinder videoPlayerRewinder2 = VideoPlayerRewinder.this;
            if (videoPlayerRewinder2.rewindByBackSeek && videoPlayerRewinder2.getCurrentPosition() > VideoPlayerRewinder.this.rewindBackSeekPlayerPosition && VideoPlayerRewinder.this.rewindLastTime - VideoPlayerRewinder.this.rewindLastUpdatePlayerTime > 10) {
                VideoPlayerRewinder videoPlayerRewinder3 = VideoPlayerRewinder.this;
                videoPlayerRewinder3.rewindLastUpdatePlayerTime = videoPlayerRewinder3.rewindLastTime;
                VideoFramesRewinder videoFramesRewinder = VideoPlayerRewinder.this.framesRewinder;
                VideoPlayerRewinder videoPlayerRewinder4 = VideoPlayerRewinder.this;
                if (videoFramesRewinder != null) {
                    videoPlayerRewinder4.framesRewinder.seek(VideoPlayerRewinder.this.rewindBackSeekPlayerPosition, Math.abs(max));
                } else {
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
            hl.d3(VideoPlayerRewinder.this.backSeek, 16L);
        }
    };

    public VideoPlayerRewinder(VideoFramesRewinder videoFramesRewinder) {
        this.framesRewinder = videoFramesRewinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentPosition() {
        if (this.webView != null) {
            return r0.getCurrentPosition();
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.U();
    }

    private boolean isPlaying() {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            return qd8Var.H;
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return false;
        }
        return kfcVar.c0();
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
    public void seekTo(long j, boolean z) {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            qd8Var.i(j);
        } else {
            kfc kfcVar = this.videoPlayer;
            if (kfcVar != null) {
                kfcVar.p0(j, z);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j;
    }

    private void setMuted(boolean z) {
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            kfcVar.s0(z);
        }
    }

    private void setPaused(boolean z) {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            if (z) {
                qd8Var.e();
                return;
            } else {
                qd8Var.f();
                return;
            }
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar != null) {
            if (z) {
                kfcVar.f0();
            } else {
                kfcVar.g0();
            }
        }
    }

    private void setPlaybackSpeed(float f) {
        qd8 qd8Var = this.webView;
        if (qd8Var != null) {
            qd8Var.setPlaybackSpeed(f);
            return;
        }
        kfc kfcVar = this.videoPlayer;
        if (kfcVar == null) {
            return;
        }
        kfcVar.u0(f);
    }

    public void cancelRewind() {
        byte b;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            kfc kfcVar = this.videoPlayer;
            if (kfcVar == null && this.webView == null) {
                b = 0;
            } else {
                if (!this.rewindByBackSeek) {
                    seekTo(getCurrentPosition(), false);
                } else if (kfcVar == null || this.framesRewinder == null) {
                    seekTo(this.rewindBackSeekPlayerPosition, false);
                } else {
                    b = 1;
                    kfcVar.q0(this.rewindBackSeekPlayerPosition, false, new qfc(this, b));
                    setPlaybackSpeed(this.playSpeed);
                }
                b = 0;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            hl.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && b == 0) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                hl.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            cz9 cz9Var = this.seekSpeedDrawable;
            if (cz9Var != null) {
                cz9Var.b(false);
            }
        }
    }

    public float getRewindSpeed() {
        float f = this.value;
        if (f < 0.4f) {
            f -= 1.9f;
        }
        return Utilities.i(f, 10.0f, -6.0f);
    }

    public float getValueBySpeed(float f) {
        return f < -1.5f ? f + 1.9f : f;
    }

    public float getVideoProgress() {
        return this.rewindBackSeekPlayerPosition / getDuration();
    }

    public void setX(float f) {
        this.value -= (this.x - f) / hl.L(40.0f);
        this.x = f;
        cz9 cz9Var = this.seekSpeedDrawable;
        if (cz9Var != null) {
            cz9Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startRewind(kfc kfcVar, boolean z, float f, float f2, cz9 cz9Var) {
        boolean z2;
        s64 s64Var;
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.videoPlayer = kfcVar;
        this.seekSpeedDrawable = cz9Var;
        this.playSpeed = f2;
        if (kfcVar != null && (s64Var = kfcVar.d) != null) {
            s64Var.y1();
            if (s64Var.b0 == 0.0f) {
                z2 = true;
                this.wasMuted = z2;
                this.wasPaused = kfcVar == null && !kfcVar.c0();
                this.fastSeeking = false;
                this.rewindLastUpdatePlayerTime = 0L;
                this.x = f;
                this.value = getValueBySpeed(!z ? 2.0f : -2.0f);
                this.rewindBackSeekLastPlayerPosition = -100L;
                if (cz9Var != null) {
                    cz9Var.c(false, getRewindSpeed());
                    cz9Var.b(true);
                }
                updateRewindSpeed();
            }
        }
        z2 = false;
        this.wasMuted = z2;
        this.wasPaused = kfcVar == null && !kfcVar.c0();
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(!z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (cz9Var != null) {
        }
        updateRewindSpeed();
    }

    public void updateRewindSpeed() {
        kfc kfcVar;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z = this.rewindByBackSeek;
        byte b = 0;
        boolean z2 = true;
        if (rewindSpeed >= 0.0f) {
            if (z) {
                this.rewindByBackSeek = false;
                hl.r(this.backSeek);
                if (!this.wasMuted && !this.wasPaused) {
                    z2 = false;
                }
                setMuted(z2);
                setPaused(false);
                kfc kfcVar2 = this.videoPlayer;
                if (kfcVar2 != null && this.framesRewinder != null) {
                    long j = this.rewindBackSeekPlayerPosition;
                    if (j >= 0) {
                        kfcVar2.q0(j, false, new qfc(this, b));
                    }
                }
            }
            setPlaybackSpeed(this.playSpeed * rewindSpeed);
            return;
        }
        if (z) {
            return;
        }
        this.rewindByBackSeek = true;
        this.rewindBackSeekPlayerPosition = getCurrentPosition();
        this.rewindLastTime = System.currentTimeMillis();
        hl.c3(this.backSeek);
        setMuted(true);
        setPaused(true);
        setPlaybackSpeed(this.playSpeed);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder == null || videoFramesRewinder.isReady() || (kfcVar = this.videoPlayer) == null) {
            return;
        }
        VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
        ArrayList arrayList = kfcVar.O;
        if (arrayList != null) {
            loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((hfc) kfcVar.O.get(size)).d;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    jfc jfcVar = (jfc) obj;
                    if (!jfcVar.b()) {
                        jfcVar.e(true);
                    }
                    if (jfcVar.b()) {
                        file = new File(jfcVar.d.getPath());
                        break loop0;
                    }
                }
            }
        }
        Uri uri = kfcVar.R;
        file = (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) ? null : new File(kfcVar.R.getPath());
        videoFramesRewinder2.setup(file);
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z) {
    }

    public void updateRewindProgressUi(long j, float f, boolean z) {
    }

    public void startRewind(qd8 qd8Var, boolean z, float f, float f2, cz9 cz9Var) {
        cancelRewind();
        this.videoPlayer = null;
        this.webView = null;
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.release();
        }
        this.rewindByBackSeek = z;
        this.rewinding = true;
        this.rewindBackSeekPlayerPosition = -1L;
        this.webView = qd8Var;
        this.seekSpeedDrawable = cz9Var;
        this.playSpeed = f2;
        this.wasMuted = false;
        this.wasPaused = (qd8Var == null || qd8Var.H) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (cz9Var != null) {
            cz9Var.c(false, getRewindSpeed());
            cz9Var.b(true);
        }
    }
}

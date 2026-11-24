package org.telegram.messenger.video;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
    private iv9 seekSpeedDrawable;
    private long startRewindFrom;
    private Runnable updateRewindRunnable;
    private float value;
    private lbc videoPlayer;
    private boolean wasMuted;
    private boolean wasPaused;
    private aa8 webView;
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
            VideoPlayerRewinder.access$522(VideoPlayerRewinder.this, (long) (j * max));
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
            gl.e3(VideoPlayerRewinder.this.backSeek, 16L);
        }
    };

    public VideoPlayerRewinder(VideoFramesRewinder videoFramesRewinder) {
        this.framesRewinder = videoFramesRewinder;
    }

    public static /* synthetic */ long access$522(VideoPlayerRewinder videoPlayerRewinder, long j) {
        long j2 = videoPlayerRewinder.rewindBackSeekPlayerPosition - j;
        videoPlayerRewinder.rewindBackSeekPlayerPosition = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentPosition() {
        if (this.webView != null) {
            return r0.getCurrentPosition();
        }
        lbc lbcVar = this.videoPlayer;
        if (lbcVar == null) {
            return 0L;
        }
        return lbcVar.S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getDuration() {
        if (this.webView != null) {
            return r0.getVideoDuration();
        }
        lbc lbcVar = this.videoPlayer;
        if (lbcVar == null) {
            return 0L;
        }
        return lbcVar.U();
    }

    private boolean isPlaying() {
        aa8 aa8Var = this.webView;
        if (aa8Var != null) {
            return aa8Var.H;
        }
        lbc lbcVar = this.videoPlayer;
        if (lbcVar == null) {
            return false;
        }
        return lbcVar.c0();
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
        aa8 aa8Var = this.webView;
        if (aa8Var != null) {
            aa8Var.i(j);
        } else {
            lbc lbcVar = this.videoPlayer;
            if (lbcVar != null) {
                lbcVar.p0(j, z);
            }
        }
        this.rewindBackSeekLastPlayerPosition = j;
    }

    private void setMuted(boolean z) {
        lbc lbcVar = this.videoPlayer;
        if (lbcVar != null) {
            lbcVar.s0(z);
        }
    }

    private void setPaused(boolean z) {
        aa8 aa8Var = this.webView;
        if (aa8Var != null) {
            if (z) {
                aa8Var.e();
                return;
            } else {
                aa8Var.f();
                return;
            }
        }
        lbc lbcVar = this.videoPlayer;
        if (lbcVar != null) {
            if (z) {
                lbcVar.f0();
            } else {
                lbcVar.g0();
            }
        }
    }

    private void setPlaybackSpeed(float f) {
        aa8 aa8Var = this.webView;
        if (aa8Var != null) {
            aa8Var.setPlaybackSpeed(f);
            return;
        }
        lbc lbcVar = this.videoPlayer;
        if (lbcVar == null) {
            return;
        }
        lbcVar.u0(f);
    }

    public void cancelRewind() {
        byte b;
        if (this.rewinding) {
            this.rewinding = false;
            this.fastSeeking = false;
            lbc lbcVar = this.videoPlayer;
            if (lbcVar == null && this.webView == null) {
                b = 0;
            } else {
                if (!this.rewindByBackSeek) {
                    seekTo(getCurrentPosition(), false);
                } else if (lbcVar == null || this.framesRewinder == null) {
                    seekTo(this.rewindBackSeekPlayerPosition, false);
                } else {
                    b = 1;
                    lbcVar.q0(this.rewindBackSeekPlayerPosition, false, new rbc(this, b));
                    setPlaybackSpeed(this.playSpeed);
                }
                b = 0;
                setPlaybackSpeed(this.playSpeed);
            }
            setMuted(this.wasMuted);
            setPaused(this.wasPaused);
            gl.r(this.backSeek);
            VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
            if (videoFramesRewinder != null && b == 0) {
                videoFramesRewinder.release();
            }
            Runnable runnable = this.updateRewindRunnable;
            if (runnable != null) {
                gl.r(runnable);
                this.updateRewindRunnable = null;
            }
            onRewindCanceled();
            iv9 iv9Var = this.seekSpeedDrawable;
            if (iv9Var != null) {
                iv9Var.b(false);
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
        this.value -= (this.x - f) / gl.L(40.0f);
        this.x = f;
        iv9 iv9Var = this.seekSpeedDrawable;
        if (iv9Var != null) {
            iv9Var.c(true, getRewindSpeed());
        }
        updateRewindSpeed();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startRewind(lbc lbcVar, boolean z, float f, float f2, iv9 iv9Var) {
        boolean z2;
        y54 y54Var;
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
        this.videoPlayer = lbcVar;
        this.seekSpeedDrawable = iv9Var;
        this.playSpeed = f2;
        if (lbcVar != null && (y54Var = lbcVar.d) != null) {
            y54Var.y1();
            if (y54Var.b0 == 0.0f) {
                z2 = true;
                this.wasMuted = z2;
                this.wasPaused = lbcVar == null && !lbcVar.c0();
                this.fastSeeking = false;
                this.rewindLastUpdatePlayerTime = 0L;
                this.x = f;
                this.value = getValueBySpeed(!z ? 2.0f : -2.0f);
                this.rewindBackSeekLastPlayerPosition = -100L;
                if (iv9Var != null) {
                    iv9Var.c(false, getRewindSpeed());
                    iv9Var.b(true);
                }
                updateRewindSpeed();
            }
        }
        z2 = false;
        this.wasMuted = z2;
        this.wasPaused = lbcVar == null && !lbcVar.c0();
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(!z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (iv9Var != null) {
        }
        updateRewindSpeed();
    }

    public void updateRewindSpeed() {
        lbc lbcVar;
        File file;
        float rewindSpeed = getRewindSpeed();
        boolean z = this.rewindByBackSeek;
        byte b = 0;
        boolean z2 = true;
        if (rewindSpeed >= 0.0f) {
            if (z) {
                this.rewindByBackSeek = false;
                gl.r(this.backSeek);
                if (!this.wasMuted && !this.wasPaused) {
                    z2 = false;
                }
                setMuted(z2);
                setPaused(false);
                lbc lbcVar2 = this.videoPlayer;
                if (lbcVar2 != null && this.framesRewinder != null) {
                    long j = this.rewindBackSeekPlayerPosition;
                    if (j >= 0) {
                        lbcVar2.q0(j, false, new rbc(this, b));
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
        gl.d3(this.backSeek);
        setMuted(true);
        setPaused(true);
        setPlaybackSpeed(this.playSpeed);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder == null || videoFramesRewinder.isReady() || (lbcVar = this.videoPlayer) == null) {
            return;
        }
        VideoFramesRewinder videoFramesRewinder2 = this.framesRewinder;
        ArrayList arrayList = lbcVar.O;
        if (arrayList != null) {
            loop0: for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((hbc) lbcVar.O.get(size)).d;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    jbc jbcVar = (jbc) obj;
                    if (!jbcVar.b()) {
                        jbcVar.e(true);
                    }
                    if (jbcVar.b()) {
                        file = new File(jbcVar.d.getPath());
                        break loop0;
                    }
                }
            }
        }
        Uri uri = lbcVar.R;
        file = (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) ? null : new File(lbcVar.R.getPath());
        videoFramesRewinder2.setup(file);
    }

    public void onRewindCanceled() {
    }

    public void onRewindStart(boolean z) {
    }

    public void updateRewindProgressUi(long j, float f, boolean z) {
    }

    public void startRewind(aa8 aa8Var, boolean z, float f, float f2, iv9 iv9Var) {
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
        this.webView = aa8Var;
        this.seekSpeedDrawable = iv9Var;
        this.playSpeed = f2;
        this.wasMuted = false;
        this.wasPaused = (aa8Var == null || aa8Var.H) ? false : true;
        this.fastSeeking = false;
        this.rewindLastUpdatePlayerTime = 0L;
        this.x = f;
        this.value = getValueBySpeed(z ? 2.0f : -2.0f);
        this.rewindBackSeekLastPlayerPosition = -100L;
        if (iv9Var != null) {
            iv9Var.c(false, getRewindSpeed());
            iv9Var.b(true);
        }
    }
}

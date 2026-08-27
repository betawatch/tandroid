package e5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q implements Choreographer.FrameCallback, Handler.Callback {
    public static final q e = new q();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;

    public q() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = g0.a;
        Handler handler = new Handler(looper, this);
        this.b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.a = j10;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e9) {
                d5.a.L("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e9);
                return true;
            }
        }
        if (i10 == 1) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i11 = this.d + 1;
                this.d = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.c;
            if (choreographer2 != null) {
                int i12 = this.d - 1;
                this.d = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.a = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}

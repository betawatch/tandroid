package e5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback, Handler.Callback {
    public static final r e = new r();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i9 = f0.a;
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
        int i9 = message.what;
        if (i9 == 0) {
            try {
                this.c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e10) {
                d5.a.L("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
                return true;
            }
        }
        if (i9 == 1) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i10 = this.d + 1;
                this.d = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i9 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.c;
            if (choreographer2 != null) {
                int i11 = this.d - 1;
                this.d = i11;
                if (i11 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.a = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}

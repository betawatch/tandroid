package a3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class c0 implements Choreographer.FrameCallback, Handler.Callback {
    public static final c0 e = new c0();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;

    public c0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = e2.d0.a;
        Handler handler = new Handler(looper, this);
        this.b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.a = j3;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.c = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                e2.a.o("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i11 = this.d + 1;
                this.d = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.c;
        if (choreographer2 != null) {
            int i12 = this.d - 1;
            this.d = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
        }
        return true;
    }
}

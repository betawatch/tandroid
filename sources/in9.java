// default package

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class in9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un9 b;

    public /* synthetic */ in9(un9 un9Var, byte b) {
        this.a = b;
        this.b = un9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un9 un9Var = this.b;
                if (un9Var.a0 == 3) {
                    un9Var.q();
                    return;
                }
                return;
            case 1:
                un9 un9Var2 = this.b;
                om9 om9Var = un9Var2.U;
                File file = un9Var2.V;
                if (om9Var != null) {
                    try {
                        synchronized (om9Var) {
                            om9Var.w = true;
                            try {
                                om9Var.g();
                            } finally {
                                om9Var.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    fve.c(om9Var.a);
                }
                if (file != null) {
                    fve.c(file);
                    return;
                }
                return;
            case 2:
                un9 un9Var3 = this.b;
                int i = un9Var3.a0;
                if (i == 2 || i == 6) {
                    un9Var3.J = SystemClock.elapsedRealtime();
                    un9Var3.m.b("recording started: retainedDurationMs=" + un9Var3.I);
                    un9Var3.x(3);
                    long j = ((long) un9Var3.q) - un9Var3.I;
                    if (j > 0 && !un9Var3.D) {
                        un9Var3.i.postDelayed(un9Var3.X, j);
                        return;
                    } else {
                        un9Var3.D = false;
                        un9Var3.q();
                        return;
                    }
                }
                return;
            default:
                un9 un9Var4 = this.b;
                un9Var4.E = false;
                un9Var4.m.b("recording segment stopped: state=" + hg9.A(un9Var4.a0) + ", retainedDurationMs=" + un9Var4.I);
                if (un9Var4.C) {
                    un9Var4.C = false;
                    un9Var4.i();
                    return;
                }
                if (un9Var4.A) {
                    un9Var4.A = false;
                    un9Var4.j.execute(new eb7((Object) un9Var4, (Object) un9Var4.U, un9Var4.B, (Object) un9Var4.T, (byte) 11));
                    return;
                }
                if (un9Var4.a0 == 4) {
                    try {
                        File d = un9Var4.d("round_video_preview_");
                        un9Var4.V = d;
                        un9Var4.N = System.nanoTime();
                        un9Var4.m.b("preview snapshot started: file=" + d.getName());
                        un9Var4.j.execute(new ak8((Object) un9Var4, (Object) un9Var4.U, (Object) d, (byte) 20));
                        return;
                    } catch (IOException e) {
                        un9Var4.h(e);
                        return;
                    }
                }
                return;
        }
    }
}

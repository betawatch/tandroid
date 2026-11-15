package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ w1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar;
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                if (!b2Var.j && !b2Var.i) {
                    b2Var.f.postDelayed(this, 700L);
                    if (!b2Var.E && DictationLid.f()) {
                        int c10 = b2Var.u.c();
                        if (c10 - b2Var.H >= 16000) {
                            b2Var.H = c10;
                            b2Var.E = true;
                            byte[] b10 = b2Var.u.b(0, c10);
                            DictationLid.a.execute(new a1.e(17, b10, new u1(0, this, b10)));
                            break;
                        }
                    }
                }
                break;
            case 1:
                b2 b2Var2 = this.b;
                if (!b2Var2.j) {
                    b2Var2.f.postDelayed(this, 700L);
                    if (!b2Var2.Y && !b2Var2.i && (yVar = b2Var2.u) != null) {
                        int i7 = b2Var2.a0;
                        int c11 = yVar.c();
                        if (c11 - b2Var2.b0 >= 16000) {
                            b2Var2.b0 = c11;
                            b2Var2.Y = true;
                            int max = Math.max(b2Var2.Z, c11 - 960000);
                            if (!DictationLid.f() || !DictationLid.e(b2Var2.q) || b2Var2.s >= 3) {
                                DictationLid.a.execute(new a1.e(17, b2Var2.u.b(max, c11), new x1(this, i7, 0)));
                                break;
                            } else {
                                DictationLid.j(b2Var2.u.b(max, c11), 2000, new r1(this, i7, 1));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                b2 b2Var3 = this.b;
                if (!b2Var3.j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - b2Var3.j0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < b2Var3.h0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    b2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    b2Var3.f.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }
}

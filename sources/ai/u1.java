package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1 b;

    public /* synthetic */ u1(w1 w1Var, int i7) {
        this.a = i7;
        this.b = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w1 w1Var = this.b;
                if (!w1Var.h && !w1Var.g) {
                    w1Var.e.postDelayed(this, 700L);
                    if (!w1Var.r && DictationLid.c != 0) {
                        int c10 = w1Var.k.c();
                        if (c10 - w1Var.u >= 16000) {
                            w1Var.u = c10;
                            w1Var.r = true;
                            byte[] b10 = w1Var.k.b(0, c10);
                            DictationLid.a.execute(new a1.e(16, b10, new s1(0, this, b10)));
                            break;
                        }
                    }
                }
                break;
            default:
                w1 w1Var2 = this.b;
                if (!w1Var2.h) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - w1Var2.D;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < w1Var2.B) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    w1Var2.c.f(Math.max(0.0f, Math.min(1.0f, sin)));
                    w1Var2.e.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }
}

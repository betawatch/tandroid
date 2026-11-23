package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ a2(f2 f2Var, int i7) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar;
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                if (!f2Var.j && !f2Var.i) {
                    f2Var.f.postDelayed(this, 700L);
                    if (!f2Var.E && DictationLid.f()) {
                        int c10 = f2Var.u.c();
                        if (c10 - f2Var.H >= 16000) {
                            f2Var.H = c10;
                            f2Var.E = true;
                            byte[] b10 = f2Var.u.b(0, c10);
                            DictationLid.a.execute(new a1.e(16, b10, new y1(0, this, b10)));
                            break;
                        }
                    }
                }
                break;
            case 1:
                f2 f2Var2 = this.b;
                if (!f2Var2.j) {
                    f2Var2.f.postDelayed(this, 700L);
                    if (!f2Var2.W && !f2Var2.i && (zVar = f2Var2.u) != null) {
                        int i7 = f2Var2.Y;
                        int c11 = zVar.c();
                        if (c11 - f2Var2.Z >= 16000) {
                            f2Var2.Z = c11;
                            f2Var2.W = true;
                            int max = Math.max(f2Var2.X, c11 - 960000);
                            if (!DictationLid.f() || !DictationLid.e(f2Var2.q) || f2Var2.s >= 3) {
                                DictationLid.a.execute(new a1.e(16, f2Var2.u.b(max, c11), new b2(this, i7, 0)));
                                break;
                            } else {
                                DictationLid.j(2000, new v1(this, i7, 1), TextUtils.join(",", f2Var2.q), f2Var2.u.b(max, c11));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                f2 f2Var3 = this.b;
                if (!f2Var3.j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - f2Var3.h0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < f2Var3.f0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    f2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    f2Var3.f.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }
}

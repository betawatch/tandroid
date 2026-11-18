package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ x1(c2 c2Var, int i7) {
        this.a = i7;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar;
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                if (!c2Var.j && !c2Var.i) {
                    c2Var.f.postDelayed(this, 700L);
                    if (!c2Var.E && DictationLid.f()) {
                        int c10 = c2Var.u.c();
                        if (c10 - c2Var.H >= 16000) {
                            c2Var.H = c10;
                            c2Var.E = true;
                            byte[] b10 = c2Var.u.b(0, c10);
                            DictationLid.a.execute(new a1.e(16, b10, new v1(0, this, b10)));
                            break;
                        }
                    }
                }
                break;
            case 1:
                c2 c2Var2 = this.b;
                if (!c2Var2.j) {
                    c2Var2.f.postDelayed(this, 700L);
                    if (!c2Var2.W && !c2Var2.i && (zVar = c2Var2.u) != null) {
                        int i7 = c2Var2.Y;
                        int c11 = zVar.c();
                        if (c11 - c2Var2.Z >= 16000) {
                            c2Var2.Z = c11;
                            c2Var2.W = true;
                            int max = Math.max(c2Var2.X, c11 - 960000);
                            if (!DictationLid.f() || !DictationLid.e(c2Var2.q) || c2Var2.s >= 3) {
                                DictationLid.a.execute(new a1.e(16, c2Var2.u.b(max, c11), new y1(this, i7, 0)));
                                break;
                            } else {
                                DictationLid.j(c2Var2.u.b(max, c11), 2000, new s1(this, i7, 1));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                c2 c2Var3 = this.b;
                if (!c2Var3.j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - c2Var3.h0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < c2Var3.f0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    c2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    c2Var3.f.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }
}

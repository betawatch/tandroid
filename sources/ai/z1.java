package ai;

import android.os.SystemClock;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ z1(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar;
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                if (!e2Var.j && !e2Var.i) {
                    e2Var.f.postDelayed(this, 700L);
                    if (!e2Var.E && DictationLid.f()) {
                        int c10 = e2Var.u.c();
                        if (c10 - e2Var.H >= 16000) {
                            e2Var.H = c10;
                            e2Var.E = true;
                            byte[] b10 = e2Var.u.b(0, c10);
                            DictationLid.a.execute(new a1.e(16, b10, new x1(0, this, b10)));
                            break;
                        }
                    }
                }
                break;
            case 1:
                e2 e2Var2 = this.b;
                if (!e2Var2.j) {
                    e2Var2.f.postDelayed(this, 700L);
                    if (!e2Var2.W && !e2Var2.i && (zVar = e2Var2.u) != null) {
                        int i7 = e2Var2.Y;
                        int c11 = zVar.c();
                        if (c11 - e2Var2.Z >= 16000) {
                            e2Var2.Z = c11;
                            e2Var2.W = true;
                            int max = Math.max(e2Var2.X, c11 - 960000);
                            if (!DictationLid.f() || !DictationLid.e(e2Var2.q) || e2Var2.s >= 3) {
                                DictationLid.a.execute(new a1.e(16, e2Var2.u.b(max, c11), new a2(this, i7, 0)));
                                break;
                            } else {
                                DictationLid.j(e2Var2.u.b(max, c11), 2000, new u1(this, i7, 1));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                e2 e2Var3 = this.b;
                if (!e2Var3.j) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    double d = elapsedRealtime - e2Var3.h0;
                    float sin = (((float) Math.sin(d / 90.0d)) * 0.03f) + 0.04f;
                    if (elapsedRealtime < e2Var3.f0) {
                        sin = (((float) Math.random()) * 0.12f) + (((float) Math.sin(d / 61.0d)) * 0.28f * ((float) Math.sin((d / 173.0d) + 1.3d))) + 0.45f;
                    }
                    e2Var3.d.h(Math.max(0.0f, Math.min(1.0f, sin)));
                    e2Var3.f.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }
}

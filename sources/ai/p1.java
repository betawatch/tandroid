package ai;

import android.util.Log;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p1(f2 f2Var, int i7, int i10) {
        this.a = i10;
        this.b = f2Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                if (!f2Var.j) {
                    if ((!f2Var.i || f2Var.m()) && f2Var.k == this.c) {
                        f2Var.u();
                        break;
                    }
                }
                break;
            case 1:
                f2 f2Var2 = this.b;
                if (!f2Var2.j && !f2Var2.i && f2Var2.k == this.c) {
                    f2Var2.u();
                    break;
                }
                break;
            case 2:
                f2 f2Var3 = this.b;
                int i7 = this.c;
                f2Var3.k = i7;
                f2Var3.g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                break;
            default:
                this.b.j(this.c, 7);
                break;
        }
    }
}

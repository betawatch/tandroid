package ai;

import android.util.Log;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m1(c2 c2Var, int i7, int i10) {
        this.a = i10;
        this.b = c2Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                if (!c2Var.j) {
                    if ((!c2Var.i || c2Var.l()) && c2Var.k == this.c) {
                        c2Var.t();
                        break;
                    }
                }
                break;
            case 1:
                c2 c2Var2 = this.b;
                if (!c2Var2.j && !c2Var2.i && c2Var2.k == this.c) {
                    c2Var2.t();
                    break;
                }
                break;
            case 2:
                c2 c2Var3 = this.b;
                int i7 = this.c;
                c2Var3.k = i7;
                c2Var3.g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                break;
            default:
                this.b.i(this.c, 7);
                break;
        }
    }
}

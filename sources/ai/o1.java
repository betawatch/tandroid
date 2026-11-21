package ai;

import android.util.Log;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o1(e2 e2Var, int i7, int i10) {
        this.a = i10;
        this.b = e2Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                if (!e2Var.j) {
                    if ((!e2Var.i || e2Var.l()) && e2Var.k == this.c) {
                        e2Var.t();
                        break;
                    }
                }
                break;
            case 1:
                e2 e2Var2 = this.b;
                if (!e2Var2.j && !e2Var2.i && e2Var2.k == this.c) {
                    e2Var2.t();
                    break;
                }
                break;
            case 2:
                e2 e2Var3 = this.b;
                int i7 = this.c;
                e2Var3.k = i7;
                e2Var3.g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                break;
            default:
                this.b.i(this.c, 7);
                break;
        }
    }
}

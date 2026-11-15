package ai;

import android.util.Log;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l1(b2 b2Var, int i7, int i10) {
        this.a = i10;
        this.b = b2Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                if (!b2Var.j) {
                    if ((!b2Var.i || b2Var.l()) && b2Var.k == this.c) {
                        b2Var.t();
                        break;
                    }
                }
                break;
            case 1:
                b2 b2Var2 = this.b;
                if (!b2Var2.j && !b2Var2.i && b2Var2.k == this.c) {
                    b2Var2.t();
                    break;
                }
                break;
            case 2:
                b2 b2Var3 = this.b;
                int i7 = this.c;
                b2Var3.k = i7;
                b2Var3.g.b(i7);
                Log.d("Dictation", "session " + i7 + " start (simulated)");
                break;
            default:
                this.b.i(this.c, 7);
                break;
        }
    }
}

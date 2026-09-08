package ji;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ p2(v3 v3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = v3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View y12;
        View y13;
        switch (this.a) {
            case 0:
                v3 v3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    v3Var.getClass();
                    y12 = null;
                } else {
                    y12 = v3Var.y1(aVar);
                }
                if (y12 instanceof g6) {
                    g6 g6Var = (g6) y12;
                    g6Var.B();
                    g6Var.getEditText().setSelection(Math.min(this.d, g6Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                v3 v3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    v3Var2.getClass();
                    y13 = null;
                } else {
                    y13 = v3Var2.y1(aVar2);
                }
                if (y13 instanceof g6) {
                    g6 g6Var2 = (g6) y13;
                    g6Var2.B();
                    g6Var2.getEditText().setSelection(Math.min(this.d, g6Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View y14 = this.b.y1(this.c);
                if (y14 instanceof g6) {
                    g6 g6Var3 = (g6) y14;
                    g6Var3.B();
                    g6Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View y15 = this.b.y1(this.c);
                if (y15 instanceof g6) {
                    g6 g6Var4 = (g6) y15;
                    g6Var4.B();
                    g6Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View y16 = this.b.y1(this.c);
                if (y16 instanceof g6) {
                    g6 g6Var5 = (g6) y16;
                    g6Var5.B();
                    g6Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View y17 = this.b.y1(this.c);
                if (y17 instanceof g6) {
                    g6 g6Var6 = (g6) y17;
                    g6Var6.B();
                    g6Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, g6Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}

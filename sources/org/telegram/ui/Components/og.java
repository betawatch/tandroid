package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg b;
    public final /* synthetic */ hi.u3 c;

    public /* synthetic */ og(qg qgVar, hi.u3 u3Var, int i7) {
        this.a = i7;
        this.b = qgVar;
        this.c = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg qgVar = this.b;
                hi.u3 u3Var = this.c;
                qgVar.removeView(u3Var);
                if (qgVar.b == u3Var) {
                    qgVar.b = null;
                    break;
                }
                break;
            case 1:
                this.b.removeView(this.c);
                break;
            case 2:
                this.b.removeView(this.c);
                break;
            default:
                qg qgVar2 = this.b;
                hi.u3 u3Var2 = this.c;
                qgVar2.removeView(u3Var2);
                if (qgVar2.a == u3Var2) {
                    qgVar2.a = null;
                    break;
                }
                break;
        }
    }
}

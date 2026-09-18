package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg b;
    public final /* synthetic */ ci.f4 c;

    public /* synthetic */ og(qg qgVar, ci.f4 f4Var, int i10) {
        this.a = i10;
        this.b = qgVar;
        this.c = f4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg qgVar = this.b;
                ci.f4 f4Var = this.c;
                qgVar.removeView(f4Var);
                if (qgVar.b == f4Var) {
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
                ci.f4 f4Var2 = this.c;
                qgVar2.removeView(f4Var2);
                if (qgVar2.a == f4Var2) {
                    qgVar2.a = null;
                    break;
                }
                break;
        }
    }
}

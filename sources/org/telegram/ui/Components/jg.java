package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lg b;
    public final /* synthetic */ nh.t3 c;

    public /* synthetic */ jg(lg lgVar, nh.t3 t3Var, int i10) {
        this.a = i10;
        this.b = lgVar;
        this.c = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lg lgVar = this.b;
                nh.t3 t3Var = this.c;
                lgVar.removeView(t3Var);
                if (lgVar.b == t3Var) {
                    lgVar.b = null;
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
                lg lgVar2 = this.b;
                nh.t3 t3Var2 = this.c;
                lgVar2.removeView(t3Var2);
                if (lgVar2.a == t3Var2) {
                    lgVar2.a = null;
                    break;
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig b;
    public final /* synthetic */ kh.x3 c;

    public /* synthetic */ gg(ig igVar, kh.x3 x3Var, int i9) {
        this.a = i9;
        this.b = igVar;
        this.c = x3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ig igVar = this.b;
                kh.x3 x3Var = this.c;
                igVar.removeView(x3Var);
                if (igVar.b == x3Var) {
                    igVar.b = null;
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
                ig igVar2 = this.b;
                kh.x3 x3Var2 = this.c;
                igVar2.removeView(x3Var2);
                if (igVar2.a == x3Var2) {
                    igVar2.a = null;
                    break;
                }
                break;
        }
    }
}

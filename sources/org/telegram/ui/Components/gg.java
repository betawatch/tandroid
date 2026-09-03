package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig b;
    public final /* synthetic */ qh.e3 c;

    public /* synthetic */ gg(ig igVar, qh.e3 e3Var, int i10) {
        this.a = i10;
        this.b = igVar;
        this.c = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ig igVar = this.b;
                qh.e3 e3Var = this.c;
                igVar.removeView(e3Var);
                if (igVar.b == e3Var) {
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
                qh.e3 e3Var2 = this.c;
                igVar2.removeView(e3Var2);
                if (igVar2.a == e3Var2) {
                    igVar2.a = null;
                    break;
                }
                break;
        }
    }
}

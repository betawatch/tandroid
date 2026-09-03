package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig b;
    public final /* synthetic */ ph.f3 c;

    public /* synthetic */ gg(ig igVar, ph.f3 f3Var, int i10) {
        this.a = i10;
        this.b = igVar;
        this.c = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ig igVar = this.b;
                ph.f3 f3Var = this.c;
                igVar.removeView(f3Var);
                if (igVar.b == f3Var) {
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
                ph.f3 f3Var2 = this.c;
                igVar2.removeView(f3Var2);
                if (igVar2.a == f3Var2) {
                    igVar2.a = null;
                    break;
                }
                break;
        }
    }
}

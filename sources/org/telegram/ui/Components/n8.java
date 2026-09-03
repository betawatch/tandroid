package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ n8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    w8.U(this.b);
                    break;
                }
                break;
            default:
                w8 w8Var = this.b;
                if (i10 == -1) {
                    w8.U(w8Var);
                }
                if (i10 == 1) {
                    w8Var.f0();
                    break;
                }
                break;
        }
    }
}

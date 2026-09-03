package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if0 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ if0(tf0 tf0Var, int i10) {
        this.a = i10;
        this.b = tf0Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                tf0 tf0Var = this.b;
                tf0Var.c(true);
                tf0Var.p0.u1(0, true, null, true);
                break;
            default:
                this.b.p0.u1(0, true, null, true);
                break;
        }
    }
}

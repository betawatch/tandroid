package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements gf.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // gf.j
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                x5 x5Var = (x5) this.b;
                int i10 = x5Var.M0 + 1;
                x5Var.M0 = i10;
                if (i10 > 10) {
                    x5Var.N0 = true;
                }
                x5Var.i();
                if (x5Var.Q0) {
                    x5Var.P0 = true;
                    x5Var.t();
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                int i11 = EditTextBoldCursor.a;
                editTextBoldCursor.invalidate();
                break;
            default:
                oi0.g((oi0) this.b);
                break;
        }
    }
}

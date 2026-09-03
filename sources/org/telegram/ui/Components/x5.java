package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x5 implements lf.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // lf.i
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                y5 y5Var = (y5) this.b;
                int i10 = y5Var.N0 + 1;
                y5Var.N0 = i10;
                if (i10 > 10) {
                    y5Var.O0 = true;
                }
                y5Var.i();
                if (y5Var.R0) {
                    y5Var.Q0 = true;
                    y5Var.t();
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                int i11 = EditTextBoldCursor.a;
                editTextBoldCursor.invalidate();
                break;
            default:
                hj0.g((hj0) this.b);
                break;
        }
    }
}

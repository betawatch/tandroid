package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements yf.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // yf.g
    public final void doFrame(long j3) {
        switch (this.a) {
            case 0:
                b6 b6Var = (b6) this.b;
                int i10 = b6Var.Q0 + 1;
                b6Var.Q0 = i10;
                if (i10 > 10) {
                    b6Var.R0 = true;
                }
                b6Var.i();
                if (b6Var.U0) {
                    b6Var.T0 = true;
                    b6Var.t();
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                int i11 = EditTextBoldCursor.a;
                editTextBoldCursor.invalidate();
                break;
            default:
                xi0.g((xi0) this.b);
                break;
        }
    }
}

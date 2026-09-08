package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements yf.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // yf.g
    public final void doFrame(long j3) {
        switch (this.a) {
            case 0:
                d6 d6Var = (d6) this.b;
                int i10 = d6Var.Q0 + 1;
                d6Var.Q0 = i10;
                if (i10 > 10) {
                    d6Var.R0 = true;
                }
                d6Var.i();
                if (d6Var.U0) {
                    d6Var.T0 = true;
                    d6Var.t();
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

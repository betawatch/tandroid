package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements yf.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // yf.g
    public final void doFrame(long j3) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.b;
                int i10 = c6Var.Q0 + 1;
                c6Var.Q0 = i10;
                if (i10 > 10) {
                    c6Var.R0 = true;
                }
                c6Var.i();
                if (c6Var.U0) {
                    c6Var.T0 = true;
                    c6Var.t();
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                int i11 = EditTextBoldCursor.a;
                editTextBoldCursor.invalidate();
                break;
            default:
                kj0.g((kj0) this.b);
                break;
        }
    }
}

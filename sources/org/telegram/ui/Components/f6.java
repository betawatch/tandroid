package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements ag.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ag.m
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.b;
                int i10 = g6Var.Q0 + 1;
                g6Var.Q0 = i10;
                if (i10 > 10) {
                    g6Var.R0 = true;
                }
                g6Var.i();
                if (g6Var.U0) {
                    g6Var.T0 = true;
                    g6Var.t();
                    break;
                }
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                int i11 = EditTextBoldCursor.a;
                editTextBoldCursor.invalidate();
                break;
            default:
                yj0.g((yj0) this.b);
                break;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                xj0.g((xj0) this.b);
                break;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements zf.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zf.h
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                int i10 = f6Var.Q0 + 1;
                f6Var.Q0 = i10;
                if (i10 > 10) {
                    f6Var.R0 = true;
                }
                f6Var.i();
                if (f6Var.U0) {
                    f6Var.T0 = true;
                    f6Var.t();
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

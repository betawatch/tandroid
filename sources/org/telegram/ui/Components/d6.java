package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements zf.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zf.g
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.b;
                int i10 = e6Var.Q0 + 1;
                e6Var.Q0 = i10;
                if (i10 > 10) {
                    e6Var.R0 = true;
                }
                e6Var.i();
                if (e6Var.U0) {
                    e6Var.T0 = true;
                    e6Var.t();
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

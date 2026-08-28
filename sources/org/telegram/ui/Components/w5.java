package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements ff.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // ff.j
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                x5 x5Var = (x5) this.b;
                int i9 = x5Var.M0 + 1;
                x5Var.M0 = i9;
                if (i9 > 10) {
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
                int i10 = EditTextBoldCursor.a;
                editTextBoldCursor.invalidate();
                break;
            default:
                mi0.g((mi0) this.b);
                break;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b6 implements jf.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // jf.i
    public final void doFrame(long j10) {
        switch (this.a) {
            case 0:
                c6 c6Var = (c6) this.b;
                int i10 = c6Var.M0 + 1;
                c6Var.M0 = i10;
                if (i10 > 10) {
                    c6Var.N0 = true;
                }
                c6Var.i();
                if (c6Var.Q0) {
                    c6Var.P0 = true;
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
                xi0.g((xi0) this.b);
                break;
        }
    }
}

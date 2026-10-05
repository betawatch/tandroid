package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class v8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ v8(e9 e9Var, int i10) {
        this.a = i10;
        this.b = e9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    e9.S(this.b);
                    break;
                }
                break;
            default:
                e9 e9Var = this.b;
                if (i10 == -1) {
                    e9.S(e9Var);
                }
                if (i10 == 1) {
                    e9Var.f0();
                    break;
                }
                break;
        }
    }
}

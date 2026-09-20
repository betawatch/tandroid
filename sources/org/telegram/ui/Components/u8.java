package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class u8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ u8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    d9.U(this.b);
                    break;
                }
                break;
            default:
                d9 d9Var = this.b;
                if (i10 == -1) {
                    d9.U(d9Var);
                }
                if (i10 == 1) {
                    d9Var.f0();
                    break;
                }
                break;
        }
    }
}

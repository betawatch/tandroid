package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a31 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l31 b;

    public /* synthetic */ a31(l31 l31Var, int i10) {
        this.a = i10;
        this.b = l31Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                l31 l31Var = this.b;
                if (l31Var.k()) {
                    l31Var.l();
                    break;
                }
                break;
            default:
                l31 l31Var2 = this.b;
                if (l31Var2.k()) {
                    l31Var2.l();
                    break;
                }
                break;
        }
    }
}

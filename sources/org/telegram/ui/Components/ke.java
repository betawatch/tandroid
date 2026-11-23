package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ke implements z4, yi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.x1(z10, i7, i10, 0L, true);
                break;
            case 1:
            default:
                boolean x12 = this.b.x1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.dg0 dg0Var = chatActivityEnterView.M0;
                if (dg0Var != null) {
                    dg0Var.h(!x12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 2:
                this.b.x1(z10, i7, 0, 0L, true);
                break;
        }
    }

    public void a(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        td tdVar = chatActivityEnterView.X1;
        qg qgVar = chatActivityEnterView.E2;
        if (qgVar != null) {
            qgVar.invalidate();
        }
        if (z10) {
            return;
        }
        yh.a aVar = chatActivityEnterView.T1;
        if (aVar != null) {
            zi0 zi0Var = chatActivityEnterView.i1;
            aVar.c(Math.round(Math.max(1.0f, (zi0Var.w - zi0Var.s) * zi0Var.r)));
        }
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, 300L);
    }
}

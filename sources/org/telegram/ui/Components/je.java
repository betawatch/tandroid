package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class je implements z4, wi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ je(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.s1(z10, i7, i10, 0L, true);
                break;
            case 1:
            default:
                boolean s12 = this.b.s1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!s12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 2:
                this.b.s1(z10, i7, 0, 0L, true);
                break;
        }
    }

    public void a(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        td tdVar = chatActivityEnterView.V1;
        pg pgVar = chatActivityEnterView.C2;
        if (pgVar != null) {
            pgVar.invalidate();
        }
        if (z10) {
            return;
        }
        yh.a aVar = chatActivityEnterView.R1;
        if (aVar != null) {
            xi0 xi0Var = chatActivityEnterView.i1;
            aVar.c(Math.round(Math.max(1.0f, (xi0Var.w - xi0Var.s) * xi0Var.r)));
        }
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, 300L);
    }
}

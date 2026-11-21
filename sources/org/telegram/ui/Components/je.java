package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class je implements a5, yi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ je(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.w1(z10, i7, i10, 0L, true);
                break;
            case 1:
            default:
                boolean w12 = this.b.w1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.eg0 eg0Var = chatActivityEnterView.M0;
                if (eg0Var != null) {
                    eg0Var.h(!w12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 2:
                this.b.w1(z10, i7, 0, 0L, true);
                break;
        }
    }

    public void a(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.b;
        td tdVar = chatActivityEnterView.X1;
        rg rgVar = chatActivityEnterView.E2;
        if (rgVar != null) {
            rgVar.invalidate();
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

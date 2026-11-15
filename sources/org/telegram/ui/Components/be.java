package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class be implements r4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ be(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                boolean k12 = this.b.k1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView = this.b;
                org.telegram.ui.bg0 bg0Var = chatActivityEnterView.M0;
                if (bg0Var != null) {
                    bg0Var.h(!k12);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
            case 1:
            default:
                boolean k13 = this.b.k1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                org.telegram.ui.bg0 bg0Var2 = chatActivityEnterView2.M0;
                if (bg0Var2 != null) {
                    bg0Var2.h(!k13);
                    chatActivityEnterView2.M0 = null;
                    break;
                }
                break;
            case 2:
                this.b.k1(z10, i7, i10, 0L, true);
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                org.telegram.ui.bg0 bg0Var3 = chatActivityEnterView3.M0;
                if (bg0Var3 != null) {
                    bg0Var3.i();
                    chatActivityEnterView3.M0 = null;
                    break;
                }
                break;
        }
    }
}

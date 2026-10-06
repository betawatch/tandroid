package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ze extends wg {
    public final /* synthetic */ int l0;
    public final /* synthetic */ ChatActivityEnterView m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(i10, context, d6Var, true);
        this.l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.wg
    public boolean d() {
        switch (this.l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean e() {
        switch (this.l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.m0.q3;
        }
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean f() {
        switch (this.l0) {
            case 0:
                of ofVar = this.m0.L0;
                return !(ofVar == null || ofVar.q0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.wg
    public boolean j() {
        switch (this.l0) {
            case 0:
                return this.m0.y4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.n5;
                this.m0.y1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ye extends vg {
    public final /* synthetic */ int l0;
    public final /* synthetic */ ChatActivityEnterView m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(i10, context, d6Var, true);
        this.l0 = i11;
        this.m0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.vg
    public boolean d() {
        switch (this.l0) {
            case 0:
                return this.m0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        switch (this.l0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.m0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.m0.q3;
        }
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        switch (this.l0) {
            case 0:
                nf nfVar = this.m0.L0;
                return !(nfVar == null || nfVar.q0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.vg
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
                this.m0.z1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}

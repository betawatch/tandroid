package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ye extends vg {
    public final /* synthetic */ int l0;
    public final /* synthetic */ ChatActivityEnterView m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
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
                return !this.m0.p3;
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
                return this.m0.x4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.l0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.m5;
                this.m0.z1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}

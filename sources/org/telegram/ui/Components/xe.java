package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xe extends vg {
    public final /* synthetic */ int n0;
    public final /* synthetic */ ChatActivityEnterView o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(i10, context, u6Var, true);
        this.n0 = i11;
        this.o0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.vg
    public boolean d() {
        switch (this.n0) {
            case 0:
                return this.o0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        switch (this.n0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.o0;
                return !chatActivityEnterView.c() && chatActivityEnterView.G0 == Integer.MAX_VALUE;
            default:
                return !this.o0.q3;
        }
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        switch (this.n0) {
            case 0:
                mf mfVar = this.o0.L0;
                return !(mfVar == null || mfVar.p0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.vg
    public boolean j() {
        switch (this.n0) {
            case 0:
                return this.o0.y4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.n0) {
            case 0:
                super.setAlpha(f7);
                int i10 = ChatActivityEnterView.r5;
                this.o0.w1();
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}

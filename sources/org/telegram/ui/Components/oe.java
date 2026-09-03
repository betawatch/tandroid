package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oe extends lg {
    public final /* synthetic */ int i0;
    public final /* synthetic */ ChatActivityEnterView j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.i0 = i11;
        this.j0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.lg
    public boolean d() {
        switch (this.i0) {
            case 0:
                return this.j0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        switch (this.i0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.j0;
                return !chatActivityEnterView.c() && chatActivityEnterView.D0 == Integer.MAX_VALUE;
            default:
                return !this.j0.m3;
        }
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        switch (this.i0) {
            case 0:
                cf cfVar = this.j0.I0;
                return !(cfVar == null || cfVar.n0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.lg
    public boolean j() {
        switch (this.i0) {
            case 0:
                return this.j0.u4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.i0) {
            case 0:
                super.setAlpha(f10);
                int i10 = ChatActivityEnterView.j5;
                this.j0.z1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }
}

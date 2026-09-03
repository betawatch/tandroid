package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oe extends lg {
    public final /* synthetic */ int i0;
    public final /* synthetic */ ChatActivityEnterView j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, true);
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

package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ke extends hg {
    public final /* synthetic */ int h0;
    public final /* synthetic */ ChatActivityEnterView i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.h0 = i11;
        this.i0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.hg
    public boolean d() {
        switch (this.h0) {
            case 0:
                return this.i0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean e() {
        switch (this.h0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.i0;
                return !chatActivityEnterView.c() && chatActivityEnterView.C0 == Integer.MAX_VALUE;
            default:
                return !this.i0.l3;
        }
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean f() {
        switch (this.h0) {
            case 0:
                ye yeVar = this.i0.H0;
                return !(yeVar == null || yeVar.m0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.hg
    public boolean j() {
        switch (this.h0) {
            case 0:
                return this.i0.t4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.h0) {
            case 0:
                super.setAlpha(f10);
                int i10 = ChatActivityEnterView.i5;
                this.i0.y1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }
}

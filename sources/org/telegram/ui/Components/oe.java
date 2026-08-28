package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oe extends lg {
    public final /* synthetic */ int h0;
    public final /* synthetic */ ChatActivityEnterView i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe(ChatActivityEnterView chatActivityEnterView, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, context, b6Var, true);
        this.h0 = i10;
        this.i0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.lg
    public boolean d() {
        switch (this.h0) {
            case 0:
                return this.i0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        switch (this.h0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.i0;
                return !chatActivityEnterView.c() && chatActivityEnterView.C0 == Integer.MAX_VALUE;
            default:
                return !this.i0.l3;
        }
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        switch (this.h0) {
            case 0:
                cf cfVar = this.i0.H0;
                return !(cfVar == null || cfVar.m0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.lg
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
                int i9 = ChatActivityEnterView.i5;
                this.i0.z1();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }
}

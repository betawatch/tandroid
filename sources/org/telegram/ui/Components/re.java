package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class re extends og {
    public final /* synthetic */ int h0;
    public final /* synthetic */ ChatActivityEnterView i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re(ChatActivityEnterView chatActivityEnterView, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.h0 = i11;
        this.i0 = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.og
    public boolean d() {
        switch (this.h0) {
            case 0:
                return this.i0.c();
            default:
                return super.d();
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e() {
        switch (this.h0) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.i0;
                return !chatActivityEnterView.c() && chatActivityEnterView.C0 == Integer.MAX_VALUE;
            default:
                return !this.i0.l3;
        }
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f() {
        switch (this.h0) {
            case 0:
                ff ffVar = this.i0.H0;
                return !(ffVar == null || ffVar.m0) || this.r > 0;
            default:
                return true;
        }
    }

    @Override // org.telegram.ui.Components.og
    public boolean j() {
        switch (this.h0) {
            case 0:
                return this.i0.t4;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        switch (this.h0) {
            case 0:
                super.setAlpha(f9);
                int i10 = ChatActivityEnterView.i5;
                this.i0.z1();
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fd0 extends eb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.fu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(hd0 hd0Var, Context context, int i7) {
        super(hd0Var.v0, context);
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = hd0Var;
                super(hd0Var.v0, context);
                break;
            default:
                this.f = hd0Var;
                break;
        }
    }

    @Override // org.telegram.ui.eb0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((hd0) this.f).l0;
            case 1:
                return ((hd0) this.f).l0;
            default:
                return ((ec0) this.f).N;
        }
    }

    @Override // org.telegram.ui.eb0
    public final boolean b() {
        fd0 fd0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    hd0 hd0Var = (hd0) this.f;
                    if (hd0Var.b0 <= 0 || hd0Var.U == null) {
                    }
                }
                break;
            case 1:
                hd0 hd0Var2 = (hd0) this.f;
                if (!isClickable() || getVisibility() != 0 || hd0Var2.g0 || (((fd0Var = hd0Var2.w) != null && fd0Var.getVisibility() != 8) || hd0Var2.l0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f;
                    if (ec0Var.Q <= 0 || ec0Var.O == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(ec0 ec0Var, Context context) {
        super(ec0Var.b0, context);
        this.e = 2;
        this.f = ec0Var;
    }
}

package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class cd0 extends db0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.xt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(ed0 ed0Var, Context context, int i7) {
        super(ed0Var.v0, context);
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = ed0Var;
                super(ed0Var.v0, context);
                break;
            default:
                this.f = ed0Var;
                break;
        }
    }

    @Override // org.telegram.ui.db0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((ed0) this.f).l0;
            case 1:
                return ((ed0) this.f).l0;
            default:
                return ((dc0) this.f).N;
        }
    }

    @Override // org.telegram.ui.db0
    public final boolean b() {
        cd0 cd0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    ed0 ed0Var = (ed0) this.f;
                    if (ed0Var.b0 <= 0 || ed0Var.U == null) {
                    }
                }
                break;
            case 1:
                ed0 ed0Var2 = (ed0) this.f;
                if (!isClickable() || getVisibility() != 0 || ed0Var2.g0 || (((cd0Var = ed0Var2.w) != null && cd0Var.getVisibility() != 8) || ed0Var2.l0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    dc0 dc0Var = (dc0) this.f;
                    if (dc0Var.Q <= 0 || dc0Var.O == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(dc0 dc0Var, Context context) {
        super(dc0Var.b0, context);
        this.e = 2;
        this.f = dc0Var;
    }
}

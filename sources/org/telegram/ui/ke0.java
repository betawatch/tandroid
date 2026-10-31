package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ke0 extends mc0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.zu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(me0 me0Var, Context context, int i10) {
        super(me0Var.u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = me0Var;
                super(me0Var.u0, context);
                break;
            default:
                this.f = me0Var;
                break;
        }
    }

    @Override // org.telegram.ui.mc0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((me0) this.f).k0;
            case 1:
                return ((me0) this.f).k0;
            default:
                return ((ld0) this.f).M;
        }
    }

    @Override // org.telegram.ui.mc0
    public final boolean b() {
        ke0 ke0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    me0 me0Var = (me0) this.f;
                    if (me0Var.a0 <= 0 || me0Var.T == null) {
                    }
                }
                break;
            case 1:
                me0 me0Var2 = (me0) this.f;
                if (!isClickable() || getVisibility() != 0 || me0Var2.f0 || (((ke0Var = me0Var2.w) != null && ke0Var.getVisibility() != 8) || me0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    ld0 ld0Var = (ld0) this.f;
                    if (ld0Var.P <= 0 || ld0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(ld0 ld0Var, Context context) {
        super(ld0Var.a0, context);
        this.e = 2;
        this.f = ld0Var;
    }
}

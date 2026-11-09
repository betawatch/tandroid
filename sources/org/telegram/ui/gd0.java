package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gd0 extends fb0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.yt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(id0 id0Var, Context context, int i7) {
        super(id0Var.u0, context);
        this.e = i7;
        switch (i7) {
            case 1:
                this.f = id0Var;
                super(id0Var.u0, context);
                break;
            default:
                this.f = id0Var;
                break;
        }
    }

    @Override // org.telegram.ui.fb0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((id0) this.f).k0;
            case 1:
                return ((id0) this.f).k0;
            default:
                return ((gc0) this.f).M;
        }
    }

    @Override // org.telegram.ui.fb0
    public final boolean b() {
        gd0 gd0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    id0 id0Var = (id0) this.f;
                    if (id0Var.a0 <= 0 || id0Var.T == null) {
                    }
                }
                break;
            case 1:
                id0 id0Var2 = (id0) this.f;
                if (!isClickable() || getVisibility() != 0 || id0Var2.f0 || (((gd0Var = id0Var2.w) != null && gd0Var.getVisibility() != 8) || id0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    gc0 gc0Var = (gc0) this.f;
                    if (gc0Var.P <= 0 || gc0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(gc0 gc0Var, Context context) {
        super(gc0Var.a0, context);
        this.e = 2;
        this.f = gc0Var;
    }
}

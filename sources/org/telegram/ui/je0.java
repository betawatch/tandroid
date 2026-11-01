package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class je0 extends lc0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.av0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(le0 le0Var, Context context, int i10) {
        super(le0Var.u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = le0Var;
                super(le0Var.u0, context);
                break;
            default:
                this.f = le0Var;
                break;
        }
    }

    @Override // org.telegram.ui.lc0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((le0) this.f).k0;
            case 1:
                return ((le0) this.f).k0;
            default:
                return ((kd0) this.f).M;
        }
    }

    @Override // org.telegram.ui.lc0
    public final boolean b() {
        je0 je0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    le0 le0Var = (le0) this.f;
                    if (le0Var.a0 <= 0 || le0Var.T == null) {
                    }
                }
                break;
            case 1:
                le0 le0Var2 = (le0) this.f;
                if (!isClickable() || getVisibility() != 0 || le0Var2.f0 || (((je0Var = le0Var2.w) != null && je0Var.getVisibility() != 8) || le0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    kd0 kd0Var = (kd0) this.f;
                    if (kd0Var.P <= 0 || kd0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je0(kd0 kd0Var, Context context) {
        super(kd0Var.a0, context);
        this.e = 2;
        this.f = kd0Var;
    }
}

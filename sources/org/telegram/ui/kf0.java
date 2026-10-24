package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kf0 extends gd0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.tw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(mf0 mf0Var, Context context, int i10) {
        super(mf0Var.u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = mf0Var;
                super(mf0Var.u0, context);
                break;
            default:
                this.f = mf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.gd0
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((mf0) this.f).k0;
            case 1:
                return ((mf0) this.f).k0;
            default:
                return ((je0) this.f).M;
        }
    }

    @Override // org.telegram.ui.gd0
    public final boolean b() {
        kf0 kf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    mf0 mf0Var = (mf0) this.f;
                    if (mf0Var.a0 <= 0 || mf0Var.T == null) {
                    }
                }
                break;
            case 1:
                mf0 mf0Var2 = (mf0) this.f;
                if (!isClickable() || getVisibility() != 0 || mf0Var2.f0 || (((kf0Var = mf0Var2.v) != null && kf0Var.getVisibility() != 8) || mf0Var2.k0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    je0 je0Var = (je0) this.f;
                    if (je0Var.P <= 0 || je0Var.N == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(je0 je0Var, Context context) {
        super(je0Var.a0, context);
        this.e = 2;
        this.f = je0Var;
    }
}

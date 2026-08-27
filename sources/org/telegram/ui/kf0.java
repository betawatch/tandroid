package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kf0 extends org.telegram.ui.Components.voip.m2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Components.ev0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(mf0 mf0Var, Context context, int i10) {
        super(mf0Var.o0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f = mf0Var;
                super(mf0Var.o0, context);
                break;
            default:
                this.f = mf0Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.m2
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((mf0) this.f).e0;
            case 1:
                return ((mf0) this.f).e0;
            default:
                return ((je0) this.f).I;
        }
    }

    @Override // org.telegram.ui.Components.voip.m2
    public final boolean b() {
        kf0 kf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    mf0 mf0Var = (mf0) this.f;
                    if (mf0Var.R <= 0 || mf0Var.N == null) {
                    }
                }
                break;
            case 1:
                mf0 mf0Var2 = (mf0) this.f;
                if (!isClickable() || getVisibility() != 0 || mf0Var2.W || (((kf0Var = mf0Var2.v) != null && kf0Var.getVisibility() != 8) || mf0Var2.e0)) {
                }
                break;
            default:
                if (getVisibility() == 0) {
                    je0 je0Var = (je0) this.f;
                    if (je0Var.L <= 0 || je0Var.J == null) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf0(je0 je0Var, Context context) {
        super(je0Var.T, context);
        this.e = 2;
        this.f = je0Var;
    }
}

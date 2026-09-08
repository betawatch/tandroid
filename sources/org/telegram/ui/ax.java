package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ax extends org.telegram.ui.Components.ii0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(eg1 eg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = eg1Var;
    }

    @Override // org.telegram.ui.Components.ii0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ty) this.g0).a.getViewOffset();
            default:
                return ((eg1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.g0 = tyVar;
    }
}

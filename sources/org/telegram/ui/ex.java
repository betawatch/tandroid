package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ex extends org.telegram.ui.Components.jj0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(lg1 lg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = lg1Var;
    }

    @Override // org.telegram.ui.Components.jj0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((xy) this.g0).a.getViewOffset();
            default:
                return ((lg1) this.g0).N.d3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(String str, String str2, xy xyVar) {
        super(str, str2);
        this.g0 = xyVar;
    }
}

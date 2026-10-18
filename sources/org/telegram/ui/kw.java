package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.ej0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(te1 te1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = te1Var;
    }

    @Override // org.telegram.ui.Components.ej0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((dy) this.g0).a.getViewOffset();
            default:
                return ((te1) this.g0).N.d3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.g0 = dyVar;
    }
}

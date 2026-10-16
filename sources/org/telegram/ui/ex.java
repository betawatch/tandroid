package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ex extends org.telegram.ui.Components.jj0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(kg1 kg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = kg1Var;
    }

    @Override // org.telegram.ui.Components.jj0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((xy) this.g0).a.getViewOffset();
            default:
                return ((kg1) this.g0).N.d3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(String str, String str2, xy xyVar) {
        super(str, str2);
        this.g0 = xyVar;
    }
}

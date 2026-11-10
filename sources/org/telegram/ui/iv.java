package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.kg0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(z91 z91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = z91Var;
    }

    @Override // org.telegram.ui.Components.kg0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((yw) this.g0).a.getViewOffset();
            default:
                return ((z91) this.g0).N.l3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(String str, String str2, yw ywVar) {
        super(str, str2);
        this.g0 = ywVar;
    }
}

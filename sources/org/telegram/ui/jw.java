package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jw extends org.telegram.ui.Components.nh0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(nb1 nb1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = nb1Var;
    }

    @Override // org.telegram.ui.Components.nh0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((yx) this.g0).a.getViewOffset();
            default:
                return ((nb1) this.g0).N.l3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(String str, String str2, yx yxVar) {
        super(str, str2);
        this.g0 = yxVar;
    }
}

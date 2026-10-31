package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.mh0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(pb1 pb1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = pb1Var;
    }

    @Override // org.telegram.ui.Components.mh0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((zx) this.g0).a.getViewOffset();
            default:
                return ((pb1) this.g0).N.l3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(String str, String str2, zx zxVar) {
        super(str, str2);
        this.g0 = zxVar;
    }
}

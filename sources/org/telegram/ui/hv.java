package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hv extends org.telegram.ui.Components.lg0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(y91 y91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = y91Var;
    }

    @Override // org.telegram.ui.Components.lg0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((xw) this.g0).a.getViewOffset();
            default:
                return ((y91) this.g0).N.l3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(String str, String str2, xw xwVar) {
        super(str, str2);
        this.g0 = xwVar;
    }
}

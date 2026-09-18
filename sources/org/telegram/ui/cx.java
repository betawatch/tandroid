package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cx extends org.telegram.ui.Components.ji0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = fg1Var;
    }

    @Override // org.telegram.ui.Components.ji0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((vy) this.g0).a.getViewOffset();
            default:
                return ((fg1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(String str, String str2, vy vyVar) {
        super(str, str2);
        this.g0 = vyVar;
    }
}

package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class iw extends org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(re1 re1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = re1Var;
    }

    @Override // org.telegram.ui.Components.fj0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ay) this.g0).a.getViewOffset();
            default:
                return ((re1) this.g0).N.d3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(String str, String str2, ay ayVar) {
        super(str, str2);
        this.g0 = ayVar;
    }
}

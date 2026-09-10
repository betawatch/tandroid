package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cx extends org.telegram.ui.Components.si0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(ig1 ig1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = ig1Var;
    }

    @Override // org.telegram.ui.Components.si0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((vy) this.g0).a.getViewOffset();
            default:
                return ((ig1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(String str, String str2, vy vyVar) {
        super(str, str2);
        this.g0 = vyVar;
    }
}

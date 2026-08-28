package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.uh0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(we1 we1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = we1Var;
    }

    @Override // org.telegram.ui.Components.uh0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((cy) this.g0).a.getViewOffset();
            default:
                return ((we1) this.g0).J.b3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(String str, String str2, cy cyVar) {
        super(str, str2);
        this.g0 = cyVar;
    }
}

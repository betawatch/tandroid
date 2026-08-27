package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nw extends org.telegram.ui.Components.wh0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(we1 we1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = we1Var;
    }

    @Override // org.telegram.ui.Components.wh0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((fy) this.g0).a.getViewOffset();
            default:
                return ((we1) this.g0).J.b3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(String str, String str2, fy fyVar) {
        super(str, str2);
        this.g0 = fyVar;
    }
}

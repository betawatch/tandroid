package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.Components.hj0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(af1 af1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = af1Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ay) this.g0).a.getViewOffset();
            default:
                return ((af1) this.g0).N.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(String str, String str2, ay ayVar) {
        super(str, str2);
        this.g0 = ayVar;
    }
}

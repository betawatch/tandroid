package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ax extends org.telegram.ui.Components.ti0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(dg1 dg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = dg1Var;
    }

    @Override // org.telegram.ui.Components.ti0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ty) this.g0).a.getViewOffset();
            default:
                return ((dg1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.g0 = tyVar;
    }
}

package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hw extends org.telegram.ui.Components.ij0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(cf1 cf1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = cf1Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((dy) this.g0).a.getViewOffset();
            default:
                return ((cf1) this.g0).N.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.g0 = dyVar;
    }
}

package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.Components.ij0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(ye1 ye1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = ye1Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((dy) this.g0).a.getViewOffset();
            default:
                return ((ye1) this.g0).N.g3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(String str, String str2, dy dyVar) {
        super(str, str2);
        this.g0 = dyVar;
    }
}

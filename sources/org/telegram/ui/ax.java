package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ax extends org.telegram.ui.Components.si0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(fg1 fg1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = fg1Var;
    }

    @Override // org.telegram.ui.Components.si0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ty) this.g0).a.getViewOffset();
            default:
                return ((fg1) this.g0).N.f3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(String str, String str2, ty tyVar) {
        super(str, str2);
        this.g0 = tyVar;
    }
}

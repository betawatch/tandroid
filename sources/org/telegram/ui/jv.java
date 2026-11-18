package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.xg0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(y91 y91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = y91Var;
    }

    @Override // org.telegram.ui.Components.xg0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((bx) this.g0).a.getViewOffset();
            default:
                return ((y91) this.g0).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(String str, String str2, bx bxVar) {
        super(str, str2);
        this.g0 = bxVar;
    }
}

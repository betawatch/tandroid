package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

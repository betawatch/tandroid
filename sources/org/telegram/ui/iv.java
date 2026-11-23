package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class iv extends org.telegram.ui.Components.yg0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(w91 w91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = w91Var;
    }

    @Override // org.telegram.ui.Components.yg0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ax) this.g0).a.getViewOffset();
            default:
                return ((w91) this.g0).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(String str, String str2, ax axVar) {
        super(str, str2);
        this.g0 = axVar;
    }
}

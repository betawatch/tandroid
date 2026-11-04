package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.Components.ng0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(m91 m91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = m91Var;
    }

    @Override // org.telegram.ui.Components.ng0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((tw) this.g0).a.getViewOffset();
            default:
                return ((m91) this.g0).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(String str, String str2, tw twVar) {
        super(str, str2);
        this.g0 = twVar;
    }
}

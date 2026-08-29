package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mw extends org.telegram.ui.Components.ei0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(ze1 ze1Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = ze1Var;
    }

    @Override // org.telegram.ui.Components.ei0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((ey) this.g0).a.getViewOffset();
            default:
                return ((ze1) this.g0).J.b3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(String str, String str2, ey eyVar) {
        super(str, str2);
        this.g0 = eyVar;
    }
}

package org.telegram.ui;

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fv extends org.telegram.ui.Components.kg0 {
    public final /* synthetic */ int f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(v91 v91Var, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = v91Var;
    }

    @Override // org.telegram.ui.Components.kg0
    public final float d() {
        switch (this.f0) {
            case 0:
                return ((vw) this.g0).a.getViewOffset();
            default:
                return ((v91) this.g0).N.l3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(String str, String str2, vw vwVar) {
        super(str, str2);
        this.g0 = vwVar;
    }
}

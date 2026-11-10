package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bn extends org.telegram.ui.ActionBar.m5 {
    public boolean M0;
    public final /* synthetic */ cn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(cn cnVar, Activity activity) {
        super(activity);
        this.N0 = cnVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.m5
    public final void d(int i7) {
        super.d(i7);
        if (this.M0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            cn cnVar = this.N0;
            cnVar.U2 = L;
            NumberTextView numberTextView = cnVar.T2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}

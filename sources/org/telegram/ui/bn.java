package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bn extends org.telegram.ui.ActionBar.l5 {
    public boolean M0;
    public final /* synthetic */ cn N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(cn cnVar, Activity activity) {
        super(activity);
        this.N0 = cnVar;
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.l5
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

package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class an extends org.telegram.ui.ActionBar.m5 {
    public boolean N0;
    public final /* synthetic */ bn O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(bn bnVar, Activity activity) {
        super(activity);
        this.O0 = bnVar;
        this.N0 = true;
    }

    @Override // org.telegram.ui.ActionBar.m5
    public final void d(int i7) {
        super.d(i7);
        if (this.N0 && getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(4.0f) + getTextWidth();
            bn bnVar = this.O0;
            bnVar.V2 = L;
            NumberTextView numberTextView = bnVar.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}

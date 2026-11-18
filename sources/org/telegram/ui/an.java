package org.telegram.ui;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class an extends org.telegram.ui.ActionBar.n5 {
    public boolean N0;
    public final /* synthetic */ bn O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(bn bnVar, Activity activity) {
        super(activity);
        this.O0 = bnVar;
        this.N0 = true;
    }

    @Override // org.telegram.ui.ActionBar.n5
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

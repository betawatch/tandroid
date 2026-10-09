package org.telegram.ui.Wallet;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x3 extends FrameLayout {
    public final TextPaint a;
    public final /* synthetic */ a5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(a5 a5Var, Context context) {
        super(context);
        this.b = a5Var;
        this.a = new TextPaint(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float dp = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.a;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        int dp2 = AndroidUtilities.dp(14.0f);
        int i12 = 0;
        while (i12 < 2) {
            dp2 = org.telegram.messenger.q.C(24.0f, (int) Math.ceil(textPaint.measureText(LocaleController.getString(i12 == 0 ? R.string.WalletTransactions : R.string.WalletCollectibles))), dp2);
            i12++;
        }
        this.b.h0.getLayoutParams().width = Math.min(dp2, Math.max(0, View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(32.0f)));
        super.onMeasure(i10, i11);
    }
}

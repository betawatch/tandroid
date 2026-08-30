package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a60 extends LinearLayout {
    public final org.telegram.ui.Components.k6 a;
    public float b;
    public final /* synthetic */ c60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(c60 c60Var, Context context) {
        super(context);
        this.c = c60Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
        this.a = k6Var;
        k6Var.setTextColor(-1);
        k6Var.setTextSize(AndroidUtilities.dp(46.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        yh.p(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(k6Var, k7.b6.n(-1, 46));
        addView(textView, k7.b6.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.k6 k6Var = this.a;
        float measureText = k6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.b != measureText) {
            int i11 = org.telegram.ui.ActionBar.j6.Lj;
            c60 c60Var = this.c;
            k6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{c60Var.getThemedColor(i11), c60Var.getThemedColor(org.telegram.ui.ActionBar.j6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        k6Var.setText(formatNumber);
    }
}

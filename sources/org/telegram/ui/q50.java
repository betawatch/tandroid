package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q50 extends LinearLayout {
    public final org.telegram.ui.Components.j6 a;
    public float b;
    public final /* synthetic */ s50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(s50 s50Var, Context context) {
        super(context);
        this.c = s50Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
        this.a = j6Var;
        j6Var.setTextColor(-1);
        j6Var.setTextSize(AndroidUtilities.dp(46.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(j6Var, h7.z5.n(-1, 46));
        addView(textView, h7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.j6 j6Var = this.a;
        float measureText = j6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.b != measureText) {
            int i11 = org.telegram.ui.ActionBar.g6.Lj;
            s50 s50Var = this.c;
            j6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{s50Var.getThemedColor(i11), s50Var.getThemedColor(org.telegram.ui.ActionBar.g6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        j6Var.setText(formatNumber);
    }
}

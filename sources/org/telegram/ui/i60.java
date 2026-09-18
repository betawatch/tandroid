package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i60 extends LinearLayout {
    public final org.telegram.ui.Components.n6 a;
    public float b;
    public final /* synthetic */ k60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(k60 k60Var, Context context) {
        super(context);
        this.c = k60Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
        this.a = n6Var;
        n6Var.setTextColor(-1);
        n6Var.setTextSize(AndroidUtilities.dp(46.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(n6Var, w7.x5.n(-1, 46));
        addView(textView, w7.x5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.n6 n6Var = this.a;
        float measureText = n6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.b != measureText) {
            int i11 = org.telegram.ui.ActionBar.j6.Lj;
            k60 k60Var = this.c;
            n6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{k60Var.getThemedColor(i11), k60Var.getThemedColor(org.telegram.ui.ActionBar.j6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        n6Var.setText(formatNumber);
    }
}

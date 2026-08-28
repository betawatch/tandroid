package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m50 extends LinearLayout {
    public final org.telegram.ui.Components.j6 a;
    public float b;
    public final /* synthetic */ o50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(o50 o50Var, Context context) {
        super(context);
        this.c = o50Var;
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
        j3.r0.u(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(j6Var, g7.e6.n(-1, 46));
        addView(textView, g7.e6.n(-2, -2));
    }

    public void setWatchersCount(int i9) {
        String formatNumber = LocaleController.formatNumber(i9, ',');
        org.telegram.ui.Components.j6 j6Var = this.a;
        float measureText = j6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.b != measureText) {
            int i10 = org.telegram.ui.ActionBar.f6.Lj;
            o50 o50Var = this.c;
            j6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{o50Var.getThemedColor(i10), o50Var.getThemedColor(org.telegram.ui.ActionBar.f6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        j6Var.setText(formatNumber);
    }
}

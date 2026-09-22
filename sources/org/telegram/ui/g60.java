package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g60 extends LinearLayout {
    public final org.telegram.ui.Components.n6 a;
    public float b;
    public final /* synthetic */ i60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(i60 i60Var, Context context) {
        super(context);
        this.c = i60Var;
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
            int i11 = org.telegram.ui.ActionBar.i6.Lj;
            i60 i60Var = this.c;
            n6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{i60Var.getThemedColor(i11), i60Var.getThemedColor(org.telegram.ui.ActionBar.i6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        n6Var.setText(formatNumber);
    }
}

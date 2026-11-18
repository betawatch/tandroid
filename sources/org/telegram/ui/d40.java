package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d40 extends LinearLayout {
    public final org.telegram.ui.Components.n6 a;
    public float b;
    public final /* synthetic */ f40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(f40 f40Var, Context context) {
        super(context);
        this.c = f40Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
        this.a = n6Var;
        n6Var.setTextColor(-1);
        n6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.gd.M0(2131743209, null));
        addView(n6Var, c8.ma.o(-1, 46));
        addView(textView, c8.ma.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.gd.E(i7, ',');
        org.telegram.ui.Components.n6 n6Var = this.a;
        float measureText = n6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.b != measureText) {
            int i10 = org.telegram.ui.ActionBar.n6.Ck;
            f40 f40Var = this.c;
            n6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.n6.w0(i10, f40Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ek, f40Var.J0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        n6Var.setText(E);
    }
}

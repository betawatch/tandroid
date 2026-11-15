package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a40 extends LinearLayout {
    public final org.telegram.ui.Components.h6 a;
    public float b;
    public final /* synthetic */ c40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(c40 c40Var, Context context) {
        super(context);
        this.c = c40Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
        this.a = h6Var;
        h6Var.setTextColor(-1);
        h6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131743446, null));
        addView(h6Var, c8.ja.o(-1, 46));
        addView(textView, c8.ja.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.hd.E(i7, ',');
        org.telegram.ui.Components.h6 h6Var = this.a;
        float measureText = h6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.b != measureText) {
            int i10 = org.telegram.ui.ActionBar.j6.Ck;
            c40 c40Var = this.c;
            h6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(i10, c40Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ek, c40Var.J0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        h6Var.setText(E);
    }
}

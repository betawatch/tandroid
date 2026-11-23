package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c40 extends LinearLayout {
    public final org.telegram.ui.Components.n6 a;
    public float b;
    public final /* synthetic */ e40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(e40 e40Var, Context context) {
        super(context);
        this.c = e40Var;
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
        textView.setText(org.telegram.messenger.gd.N0(2131743196, null));
        addView(n6Var, c8.na.o(-1, 46));
        addView(textView, c8.na.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.gd.E(i7, ',');
        org.telegram.ui.Components.n6 n6Var = this.a;
        float measureText = n6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.b != measureText) {
            int i10 = org.telegram.ui.ActionBar.n6.Ck;
            e40 e40Var = this.c;
            n6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.n6.w0(i10, e40Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ek, e40Var.J0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        n6Var.setText(E);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a40 extends LinearLayout {
    public final org.telegram.ui.Components.j6 a;
    public float b;
    public final /* synthetic */ c40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(c40 c40Var, Context context) {
        super(context);
        this.c = c40Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
        this.a = j6Var;
        j6Var.setTextColor(-1);
        j6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131743449, null));
        addView(j6Var, c8.ha.o(-1, 46));
        addView(textView, c8.ha.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.id.E(i7, ',');
        org.telegram.ui.Components.j6 j6Var = this.a;
        float measureText = j6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.b != measureText) {
            int i10 = org.telegram.ui.ActionBar.k6.zk;
            c40 c40Var = this.c;
            j6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.w0(i10, c40Var.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bk, c40Var.I0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        j6Var.setText(E);
    }
}

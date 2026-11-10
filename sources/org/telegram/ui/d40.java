package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d40 extends LinearLayout {
    public final org.telegram.ui.Components.i6 a;
    public float b;
    public final /* synthetic */ f40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(f40 f40Var, Context context) {
        super(context);
        this.c = f40Var;
        this.b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, false, false);
        this.a = i6Var;
        i6Var.setTextColor(-1);
        i6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131743446, null));
        addView(i6Var, c8.ha.o(-1, 46));
        addView(textView, c8.ha.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.id.E(i7, ',');
        org.telegram.ui.Components.i6 i6Var = this.a;
        float measureText = i6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.b != measureText) {
            int i10 = org.telegram.ui.ActionBar.m6.zk;
            f40 f40Var = this.c;
            i6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.w0(i10, f40Var.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bk, f40Var.I0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.b = measureText;
        }
        i6Var.setText(E);
    }
}

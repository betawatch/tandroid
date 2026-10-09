package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p70 extends LinearLayout {
    public final org.telegram.ui.Components.ru a;
    public boolean b;
    public int c;
    public m70 d;
    public String e;
    public final o70 f;
    public final /* synthetic */ s70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(s70 s70Var, Context context) {
        super(context);
        this.h = s70Var;
        this.f = new o70(this);
        TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.ru ruVar = new org.telegram.ui.Components.ru(context, null);
        this.a = ruVar;
        ruVar.setLines(1);
        ruVar.setSingleLine(true);
        ruVar.setInputType(16384);
        ruVar.setTextSize(1, 16.0f);
        ruVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ud, false));
        ruVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hc, false));
        ruVar.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.uf, false));
        int i10 = org.telegram.ui.ActionBar.i6.Vd;
        ruVar.setHintColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        ruVar.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        ruVar.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Wd, false));
        ruVar.setHandlesColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.vf, false));
        ruVar.setBackground(null);
        ruVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ruVar, w7.x5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.k0);
        }
    }
}

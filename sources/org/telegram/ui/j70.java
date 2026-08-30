package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j70 extends LinearLayout {
    public final org.telegram.ui.Components.vt a;
    public boolean b;
    public int c;
    public g00 d;
    public String e;
    public final i70 f;
    public final /* synthetic */ m70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(m70 m70Var, Context context) {
        super(context);
        this.h = m70Var;
        this.f = new i70(this);
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.vt vtVar = new org.telegram.ui.Components.vt(context, null);
        this.a = vtVar;
        vtVar.setLines(1);
        vtVar.setSingleLine(true);
        vtVar.setInputType(16384);
        vtVar.setTextSize(1, 16.0f);
        vtVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        vtVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hc, false));
        vtVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        vtVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        vtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        vtVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        vtVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vf, false));
        vtVar.setBackground(null);
        vtVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, k7.b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(vtVar, k7.b6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }
}

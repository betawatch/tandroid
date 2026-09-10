package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p70 extends LinearLayout {
    public final org.telegram.ui.Components.fu a;
    public boolean b;
    public int c;
    public uv d;
    public String e;
    public final o70 f;
    public final /* synthetic */ s70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(s70 s70Var, Context context) {
        super(context);
        this.h = s70Var;
        this.f = new o70(this);
        TextView g10 = org.telegram.messenger.a2.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.fu fuVar = new org.telegram.ui.Components.fu(context, null);
        this.a = fuVar;
        fuVar.setLines(1);
        fuVar.setSingleLine(true);
        fuVar.setInputType(16384);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        fuVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hc, false));
        fuVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        fuVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        fuVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        fuVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        fuVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vf, false));
        fuVar.setBackground(null);
        fuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.a6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(fuVar, w7.a6.t(-1, -2, 16, -4, 0, 0, 0));
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

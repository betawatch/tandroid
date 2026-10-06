package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class p70 extends LinearLayout {
    public final org.telegram.ui.Components.eu a;
    public boolean b;
    public int c;
    public cu d;
    public String e;
    public final o70 f;
    public final /* synthetic */ s70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(s70 s70Var, Context context) {
        super(context);
        this.h = s70Var;
        this.f = new o70(this);
        TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.eu euVar = new org.telegram.ui.Components.eu(context, null);
        this.a = euVar;
        euVar.setLines(1);
        euVar.setSingleLine(true);
        euVar.setInputType(16384);
        euVar.setTextSize(1, 16.0f);
        euVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ud, false));
        euVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hc, false));
        euVar.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.uf, false));
        int i10 = org.telegram.ui.ActionBar.i6.Vd;
        euVar.setHintColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        euVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        euVar.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Wd, false));
        euVar.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.vf, false));
        euVar.setBackground(null);
        euVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(euVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
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

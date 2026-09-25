package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class l70 extends LinearLayout {
    public final org.telegram.ui.Components.cu a;
    public boolean b;
    public int c;
    public tt d;
    public String e;
    public final k70 f;
    public final /* synthetic */ o70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(o70 o70Var, Context context) {
        super(context);
        this.h = o70Var;
        this.f = new k70(this);
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.cu cuVar = new org.telegram.ui.Components.cu(context, null);
        this.a = cuVar;
        cuVar.setLines(1);
        cuVar.setSingleLine(true);
        cuVar.setInputType(16384);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        cuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hc, false));
        cuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        cuVar.setHintColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        cuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        cuVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        cuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.vf, false));
        cuVar.setBackground(null);
        cuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(cuVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.k0);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class q70 extends LinearLayout {
    public final org.telegram.ui.Components.bu a;
    public boolean b;
    public int c;
    public cu d;
    public String e;
    public final p70 f;
    public final /* synthetic */ t70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(t70 t70Var, Context context) {
        super(context);
        this.h = t70Var;
        this.f = new p70(this);
        TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.bu buVar = new org.telegram.ui.Components.bu(context, null);
        this.a = buVar;
        buVar.setLines(1);
        buVar.setSingleLine(true);
        buVar.setInputType(16384);
        buVar.setTextSize(1, 16.0f);
        buVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        buVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hc, false));
        buVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        buVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        buVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.vf, false));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(buVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
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

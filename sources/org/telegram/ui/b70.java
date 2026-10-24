package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b70 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.iu a;
    public boolean b;
    public int c;
    public ot d;
    public String e;
    public final a70 f;
    public final /* synthetic */ e70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(e70 e70Var, Context context) {
        super(context);
        this.h = e70Var;
        this.f = new a70(this);
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.iu iuVar = new org.telegram.ui.Components.iu(context, null);
        this.a = iuVar;
        iuVar.setLines(1);
        iuVar.setSingleLine(true);
        iuVar.setInputType(16384);
        iuVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(iuVar, org.telegram.ui.ActionBar.k6.Ud, null);
        org.telegram.ui.ActionBar.r6.I(iuVar, org.telegram.ui.ActionBar.k6.hc, null);
        org.telegram.ui.ActionBar.r6.E(iuVar, org.telegram.ui.ActionBar.k6.uf, null);
        int i10 = org.telegram.ui.ActionBar.k6.Vd;
        org.telegram.ui.ActionBar.r6.m(iuVar, 34, i10, null);
        org.telegram.ui.ActionBar.r6.F(iuVar, i10, null);
        org.telegram.ui.ActionBar.r6.m(iuVar, 30, org.telegram.ui.ActionBar.k6.Wd, null);
        org.telegram.ui.ActionBar.r6.m(iuVar, 36, org.telegram.ui.ActionBar.k6.vf, null);
        iuVar.setBackground(null);
        iuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(iuVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.iu iuVar = this.a;
        try {
            iuVar.setHintColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vd, false));
            iuVar.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wd, false));
            iuVar.setHandlesColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.vf, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

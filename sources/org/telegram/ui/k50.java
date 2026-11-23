package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class k50 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.ot a;
    public boolean b;
    public int c;
    public ss d;
    public String e;
    public final j50 f;
    public final /* synthetic */ n50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(n50 n50Var, Context context) {
        super(context);
        this.h = n50Var;
        this.f = new j50(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
        textView.setText("t.me/addemoji/");
        org.telegram.ui.Components.ot otVar = new org.telegram.ui.Components.ot(context, null);
        this.a = otVar;
        otVar.setLines(1);
        otVar.setSingleLine(true);
        otVar.setInputType(TLObject.FLAG_14);
        otVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.Le, null);
        org.telegram.ui.ActionBar.t6.G(otVar, org.telegram.ui.ActionBar.m6.Yc, null);
        org.telegram.ui.ActionBar.t6.C(otVar, org.telegram.ui.ActionBar.m6.lg, null);
        int i7 = org.telegram.ui.ActionBar.m6.Me;
        org.telegram.ui.ActionBar.t6.l(otVar, 34, i7, null);
        org.telegram.ui.ActionBar.t6.D(otVar, i7, null);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.Ne, null);
        org.telegram.ui.ActionBar.t6.l(otVar, 36, org.telegram.ui.ActionBar.m6.mg, null);
        otVar.setBackground(null);
        otVar.setHint(org.telegram.messenger.hd.N0(2131754430, null));
        addView(textView, c8.ma.t(-2, -2, 16, 20, 0, 0, 0));
        addView(otVar, c8.ma.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.ot otVar = this.a;
        try {
            otVar.setHintColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Me, false));
            otVar.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ne, false));
            otVar.setHandlesColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.mg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

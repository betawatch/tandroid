package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k50 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.mt a;
    public boolean b;
    public int c;
    public vs d;
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
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        textView.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(TLObject.FLAG_14);
        mtVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.Le, null);
        org.telegram.ui.ActionBar.u6.G(mtVar, org.telegram.ui.ActionBar.n6.Yc, null);
        org.telegram.ui.ActionBar.u6.C(mtVar, org.telegram.ui.ActionBar.n6.lg, null);
        int i7 = org.telegram.ui.ActionBar.n6.Me;
        org.telegram.ui.ActionBar.u6.l(mtVar, 34, i7, null);
        org.telegram.ui.ActionBar.u6.D(mtVar, i7, null);
        org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.Ne, null);
        org.telegram.ui.ActionBar.u6.l(mtVar, 36, org.telegram.ui.ActionBar.n6.mg, null);
        mtVar.setBackground(null);
        mtVar.setHint(org.telegram.messenger.gd.M0(2131754431, null));
        addView(textView, c8.ma.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, c8.ma.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.mt mtVar = this.a;
        try {
            mtVar.setHintColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Me, false));
            mtVar.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ne, false));
            mtVar.setHandlesColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.mg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

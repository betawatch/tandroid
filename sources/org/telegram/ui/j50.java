package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j50 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.ys a;
    public boolean b;
    public int c;
    public q10 d;
    public String e;
    public final i50 f;
    public final /* synthetic */ m50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(m50 m50Var, Context context) {
        super(context);
        this.h = m50Var;
        this.f = new i50(this);
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.ys ysVar = new org.telegram.ui.Components.ys(context, null);
        this.a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        ysVar.setInputType(TLObject.FLAG_14);
        ysVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(ysVar, org.telegram.ui.ActionBar.k6.Ie, null);
        org.telegram.ui.ActionBar.r6.H(ysVar, org.telegram.ui.ActionBar.k6.Vc, null);
        org.telegram.ui.ActionBar.r6.D(ysVar, org.telegram.ui.ActionBar.k6.ig, null);
        int i7 = org.telegram.ui.ActionBar.k6.Je;
        org.telegram.ui.ActionBar.r6.m(ysVar, 34, i7, null);
        org.telegram.ui.ActionBar.r6.E(ysVar, i7, null);
        org.telegram.ui.ActionBar.r6.m(ysVar, 30, org.telegram.ui.ActionBar.k6.Ke, null);
        org.telegram.ui.ActionBar.r6.m(ysVar, 36, org.telegram.ui.ActionBar.k6.jg, null);
        ysVar.setBackground(null);
        ysVar.setHint(org.telegram.messenger.hd.M0(2131754433, null));
        addView(g10, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ysVar, c8.ha.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.Components.ys ysVar = this.a;
        try {
            ysVar.setHintColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Je, false));
            ysVar.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ke, false));
            ysVar.setHandlesColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.jg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i50 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.ft a;
    public boolean b;
    public int c;
    public org.telegram.ui.Components.voip.u d;
    public String e;
    public final h50 f;
    public final /* synthetic */ l50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(l50 l50Var, Context context) {
        super(context);
        this.h = l50Var;
        this.f = new h50(this);
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.ft ftVar = new org.telegram.ui.Components.ft(context, null);
        this.a = ftVar;
        ftVar.setLines(1);
        ftVar.setSingleLine(true);
        ftVar.setInputType(TLObject.FLAG_14);
        ftVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.Le, null);
        org.telegram.ui.ActionBar.q6.G(ftVar, org.telegram.ui.ActionBar.j6.Yc, null);
        org.telegram.ui.ActionBar.q6.C(ftVar, org.telegram.ui.ActionBar.j6.lg, null);
        int i7 = org.telegram.ui.ActionBar.j6.Me;
        org.telegram.ui.ActionBar.q6.l(ftVar, 34, i7, null);
        org.telegram.ui.ActionBar.q6.D(ftVar, i7, null);
        org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.Ne, null);
        org.telegram.ui.ActionBar.q6.l(ftVar, 36, org.telegram.ui.ActionBar.j6.mg, null);
        ftVar.setBackground(null);
        ftVar.setHint(org.telegram.messenger.hd.M0(2131754433, null));
        addView(g10, c8.ja.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ftVar, c8.ja.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.ft ftVar = this.a;
        try {
            ftVar.setHintColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Me, false));
            ftVar.setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ne, false));
            ftVar.setHandlesColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.mg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

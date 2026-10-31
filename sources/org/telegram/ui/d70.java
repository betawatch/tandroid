package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d70 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.p80 T;
    public final org.telegram.ui.ActionBar.b1 U;
    public final org.telegram.ui.ActionBar.b1 V;
    public final org.telegram.ui.ActionBar.b1 W;
    public final ArrayList a0;
    public final c70 b0;
    public int c0;
    public final org.telegram.messenger.y2 d0;
    public a70 e0;
    public ArrayList f0;
    public final org.telegram.ui.ActionBar.k2 g0;
    public final FrameLayout h0;

    public d70(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        this.g0 = k2Var;
        this.d0 = k2Var.getMessagesController().s7;
        setFitItems(true);
        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_autodelete_1d, org.telegram.messenger.cd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.b1 c11 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_autodelete_2d, org.telegram.messenger.cd.G(2, "Days", new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.b1 c12 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_autodelete_1w, org.telegram.messenger.cd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.b1 c13 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_autodelete_1m, org.telegram.messenger.cd.G(1, "Months", new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.b1 c14 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_cancel, org.telegram.messenger.cd.L0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.b1 c15 = org.telegram.ui.ActionBar.t0.c(false, false, this, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751543, null), false, null);
        this.U = c15;
        int i10 = org.telegram.ui.ActionBar.t6.p7;
        c15.d(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        arrayList.add(new b70(c10, 3));
        arrayList.add(new b70(c11, 6));
        arrayList.add(new b70(c12, 0));
        arrayList.add(new b70(c13, 1));
        arrayList.add(new b70(c14, 2));
        arrayList.add(new b70(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.a0(view, context, R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7);
        frameLayout.addView(view, w7.b6.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, w7.b6.o(-1, 8));
        c70 c70Var = new c70(this, context);
        this.b0 = c70Var;
        a(c70Var, w7.b6.o(-1, 48));
        c70Var.setOnClickListener(new wu(12, this, k2Var));
        for (int i11 = 0; i11 < this.a0.size(); i11++) {
            ((b70) this.a0.get(i11)).a.setOnClickListener(new bh.f(this, ((b70) this.a0.get(i11)).b, 19));
        }
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.T = p80Var;
        p80Var.setTag(R.id.fit_width_tag, 1);
        p80Var.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        p80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.E8, null);
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, null);
        p80Var.setText(org.telegram.messenger.cd.L0(2131749067, null));
        a(p80Var, w7.b6.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f0 != null) {
            this.b0.b.setTranslationX((3 - Math.min(3, this.f0.size())) * org.telegram.messenger.i0.L(12.0f));
        }
    }

    public final void h(boolean z10) {
        this.c0 = -1;
        this.h0.setVisibility(0);
        this.U.setVisibility(z10 ? 8 : 0);
        this.T.setVisibility(0);
        this.b0.setVisibility(8);
    }

    public void setCallback(a70 a70Var) {
        this.e0 = a70Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.b1 b1Var = this.U;
            if (b1Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.p7;
                b1Var.d(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

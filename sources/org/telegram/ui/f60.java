package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.j80 U;
    public final org.telegram.ui.ActionBar.y0 V;
    public final org.telegram.ui.ActionBar.y0 W;
    public final org.telegram.ui.ActionBar.y0 a0;
    public final ArrayList b0;
    public final e60 c0;
    public int d0;
    public final org.telegram.messenger.v2 e0;
    public c60 f0;
    public ArrayList g0;
    public final org.telegram.ui.ActionBar.g2 h0;
    public final FrameLayout i0;

    public f60(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = g2Var;
        this.e0 = g2Var.getMessagesController().u7;
        setFitItems(true);
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1d, org.telegram.messenger.gd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_2d, org.telegram.messenger.gd.G(2, "Days", new Object[0]), false, null);
        this.a0 = c11;
        org.telegram.ui.ActionBar.y0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1w, org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.y0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1m, org.telegram.messenger.gd.G(1, "Months", new Object[0]), false, null);
        this.W = c13;
        org.telegram.ui.ActionBar.y0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_cancel, org.telegram.messenger.gd.N0(2131753848, null), false, null);
        org.telegram.ui.ActionBar.y0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131751530, null), false, null);
        this.V = c15;
        int i7 = org.telegram.ui.ActionBar.n6.p7;
        c15.d(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        arrayList.add(new d60(c10, 3));
        arrayList.add(new d60(c11, 6));
        arrayList.add(new d60(c12, 0));
        arrayList.add(new d60(c13, 1));
        arrayList.add(new d60(c14, 2));
        arrayList.add(new d60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.Z(view, context, R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7);
        frameLayout.addView(view, c8.na.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, c8.na.o(-1, 8));
        e60 e60Var = new e60(this, context);
        this.c0 = e60Var;
        a(e60Var, c8.na.o(-1, 48));
        e60Var.setOnClickListener(new org.telegram.ui.Components.p31(21, this, g2Var));
        for (int i10 = 0; i10 < this.b0.size(); i10++) {
            ((d60) this.b0.get(i10)).a.setOnClickListener(new ci.q(this, ((d60) this.b0.get(i10)).b, 26));
        }
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        this.U = j80Var;
        j80Var.setTag(R.id.fit_width_tag, 1);
        j80Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        j80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.E8, null);
        j80Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.J6, null);
        j80Var.setText(org.telegram.messenger.gd.N0(2131748864, null));
        a(j80Var, c8.na.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.g0 != null) {
            this.c0.b.setTranslationX((3 - Math.min(3, this.g0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z10) {
        this.d0 = -1;
        this.i0.setVisibility(0);
        this.V.setVisibility(z10 ? 8 : 0);
        this.U.setVisibility(0);
        this.c0.setVisibility(8);
    }

    public void setCallback(c60 c60Var) {
        this.f0 = c60Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.y0 y0Var = this.V;
            if (y0Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.p7;
                y0Var.d(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

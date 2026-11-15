package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.z70 U;
    public final org.telegram.ui.ActionBar.z0 V;
    public final org.telegram.ui.ActionBar.z0 W;
    public final org.telegram.ui.ActionBar.z0 a0;
    public final ArrayList b0;
    public final c60 c0;
    public int d0;
    public final org.telegram.messenger.u2 e0;
    public a60 f0;
    public ArrayList g0;
    public final org.telegram.ui.ActionBar.e2 h0;
    public final FrameLayout i0;

    public d60(Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.b0 = arrayList;
        this.h0 = e2Var;
        this.e0 = e2Var.getMessagesController().s7;
        setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1d, org.telegram.messenger.hd.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_2d, org.telegram.messenger.hd.G(2, "Days", new Object[0]), false, null);
        this.a0 = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1w, org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_autodelete_1m, org.telegram.messenger.hd.G(1, "Months", new Object[0]), false, null);
        this.W = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_cancel, org.telegram.messenger.hd.M0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.q0.c(false, false, this, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751542, null), false, null);
        this.V = c15;
        int i7 = org.telegram.ui.ActionBar.j6.p7;
        c15.d(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        arrayList.add(new b60(c10, 3));
        arrayList.add(new b60(c11, 6));
        arrayList.add(new b60(c12, 0));
        arrayList.add(new b60(c13, 1));
        arrayList.add(new b60(c14, 2));
        arrayList.add(new b60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.i0 = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.Z(view, context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7);
        frameLayout.addView(view, c8.ja.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, c8.ja.o(-1, 8));
        c60 c60Var = new c60(this, context);
        this.c0 = c60Var;
        a(c60Var, c8.ja.o(-1, 48));
        c60Var.setOnClickListener(new org.telegram.ui.Components.vv0(27, this, e2Var));
        for (int i10 = 0; i10 < this.b0.size(); i10++) {
            ((b60) this.b0.get(i10)).a.setOnClickListener(new ci.q(this, ((b60) this.b0.get(i10)).b, 24));
        }
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, null);
        this.U = z70Var;
        z70Var.setTag(R.id.fit_width_tag, 1);
        z70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        z70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.E8, null);
        z70Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, null);
        z70Var.setText(org.telegram.messenger.hd.M0(2131749057, null));
        a(z70Var, c8.ja.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
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

    public void setCallback(a60 a60Var) {
        this.f0 = a60Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.z0 z0Var = this.V;
            if (z0Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.p7;
                z0Var.d(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.ui.ActionBar.j6.x0(null, i7, false));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

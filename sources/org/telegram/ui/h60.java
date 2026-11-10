package org.telegram.ui;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h60 extends ActionBarPopupWindow$ActionBarPopupWindowLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.w70 T;
    public final org.telegram.ui.ActionBar.z0 U;
    public final org.telegram.ui.ActionBar.z0 V;
    public final org.telegram.ui.ActionBar.z0 W;
    public final ArrayList a0;
    public final g60 b0;
    public int c0;
    public final org.telegram.messenger.u2 d0;
    public e60 e0;
    public ArrayList f0;
    public final org.telegram.ui.ActionBar.f2 g0;
    public final FrameLayout h0;

    public h60(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        this.g0 = f2Var;
        this.d0 = f2Var.getMessagesController().r7;
        setFitItems(true);
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_autodelete_1d, org.telegram.messenger.id.G(1, "Days", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_autodelete_2d, org.telegram.messenger.id.G(2, "Days", new Object[0]), false, null);
        this.W = c11;
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_autodelete_1w, org.telegram.messenger.id.G(1, "Weeks", new Object[0]), false, null);
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_autodelete_1m, org.telegram.messenger.id.G(1, "Months", new Object[0]), false, null);
        this.V = c13;
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_cancel, org.telegram.messenger.id.M0(2131753851, null), false, null);
        org.telegram.ui.ActionBar.z0 c15 = org.telegram.ui.ActionBar.r0.c(false, false, this, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751542, null), false, null);
        this.U = c15;
        int i7 = org.telegram.ui.ActionBar.m6.p7;
        c15.d(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        arrayList.add(new f60(c10, 3));
        arrayList.add(new f60(c11, 6));
        arrayList.add(new f60(c12, 0));
        arrayList.add(new f60(c13, 1));
        arrayList.add(new f60(c14, 2));
        arrayList.add(new f60(c15, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h0 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.H8, frameLayout, null);
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.Z(view, context, R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7);
        frameLayout.addView(view, c8.ha.c(-1.0f, -1));
        frameLayout.setTag(R.id.fit_width_tag, 1);
        a(frameLayout, c8.ha.o(-1, 8));
        g60 g60Var = new g60(this, context);
        this.b0 = g60Var;
        a(g60Var, c8.ha.o(-1, 48));
        g60Var.setOnClickListener(new org.telegram.ui.Components.u41(19, this, f2Var));
        for (int i10 = 0; i10 < this.a0.size(); i10++) {
            ((f60) this.a0.get(i10)).a.setOnClickListener(new ai.v(this, ((f60) this.a0.get(i10)).b, 24));
        }
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.T = w70Var;
        w70Var.setTag(R.id.fit_width_tag, 1);
        w70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        w70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.E8, null);
        w70Var.setMovementMethod(LinkMovementMethod.getInstance());
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.J6, null);
        w70Var.setText(org.telegram.messenger.id.M0(2131749057, null));
        a(w70Var, c8.ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
    }

    public final void g() {
        if (this.f0 != null) {
            this.b0.b.setTranslationX((3 - Math.min(3, this.f0.size())) * org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final void h(boolean z9) {
        this.c0 = -1;
        this.h0.setVisibility(0);
        this.U.setVisibility(z9 ? 8 : 0);
        this.T.setVisibility(0);
        this.b0.setVisibility(8);
    }

    public void setCallback(e60 e60Var) {
        this.e0 = e60Var;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            org.telegram.ui.ActionBar.z0 z0Var = this.U;
            if (z0Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.p7;
                z0Var.d(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.x0(null, i7, false));
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

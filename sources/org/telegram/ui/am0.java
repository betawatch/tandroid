package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class am0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.z70 a;
    public final org.telegram.ui.Components.z70 b;
    public final /* synthetic */ cm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(cm0 cm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.c = cm0Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.j6.d6;
        im0 im0Var = cm0Var.q0;
        org.telegram.ui.ActionBar.q6.h(i7, this, im0Var.getResourceProvider());
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getContext());
        i9Var.setImageDrawable(new org.telegram.ui.Components.ch0(R.raw.utyan_draw, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(i9Var, c8.ja.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.y6;
        e6Var = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
        org.telegram.ui.Components.z70 a10 = c8.sa.a(context2, 14.0f, i10, false, e6Var);
        this.a = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.hd.M0(cm0Var.n0 == 0 ? 2131750083 : 2131750082, null));
        addView(a10, c8.ja.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.j6.Xc;
        e6Var2 = ((org.telegram.ui.ActionBar.e2) im0Var).resourceProvider;
        org.telegram.ui.Components.z70 a11 = c8.sa.a(context3, 14.0f, i11, false, e6Var2);
        this.b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750084, null), new ef0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a11, c8.ja.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        im0 im0Var = this.c.q0;
        setBackgroundColor(im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.a.setTextColor(im0Var.getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        int i7 = org.telegram.ui.ActionBar.j6.Xc;
        int themedColor = im0Var.getThemedColor(i7);
        org.telegram.ui.Components.z70 z70Var = this.b;
        z70Var.setTextColor(themedColor);
        z70Var.setLinkTextColor(im0Var.getThemedColor(i7));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

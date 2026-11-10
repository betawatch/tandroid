package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cm0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.w70 a;
    public final org.telegram.ui.Components.w70 b;
    public final /* synthetic */ em0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(em0 em0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        this.c = em0Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        km0 km0Var = em0Var.p0;
        org.telegram.ui.ActionBar.t6.h(i7, this, km0Var.getResourceProvider());
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
        k9Var.setImageDrawable(new org.telegram.ui.Components.zg0(R.raw.utyan_draw, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(k9Var, c8.ha.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.m6.y6;
        h6Var = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
        org.telegram.ui.Components.w70 a10 = c8.qa.a(context2, 14.0f, i10, false, h6Var);
        this.a = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.id.M0(em0Var.m0 == 0 ? 2131750083 : 2131750082, null));
        addView(a10, c8.ha.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.m6.Uc;
        h6Var2 = ((org.telegram.ui.ActionBar.f2) km0Var).resourceProvider;
        org.telegram.ui.Components.w70 a11 = c8.qa.a(context3, 14.0f, i11, false, h6Var2);
        this.b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750084, null), new hf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a11, c8.ha.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        km0 km0Var = this.c.p0;
        setBackgroundColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
        this.a.setTextColor(km0Var.getThemedColor(org.telegram.ui.ActionBar.m6.y6));
        int i7 = org.telegram.ui.ActionBar.m6.Uc;
        int themedColor = km0Var.getThemedColor(i7);
        org.telegram.ui.Components.w70 w70Var = this.b;
        w70Var.setTextColor(themedColor);
        w70Var.setLinkTextColor(km0Var.getThemedColor(i7));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

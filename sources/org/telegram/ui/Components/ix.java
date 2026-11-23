package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ix extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ ty d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(ty tyVar, Context context) {
        super(context);
        this.d = tyVar;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.a;
        o6 o6Var = new o6(getContext(), false, false, false);
        o6Var.b(0.3f, 250L, nr.h);
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.m6.Ji;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.a2;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, h6Var);
        o6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(tyVar.z(org.telegram.ui.ActionBar.m6.Fi), 8.0f));
        frameLayout.addView(o6Var, c8.ma.e(-1, -2, 17));
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        ug.r0 r0Var = new ug.r0(getContext(), h6Var, false);
        r0Var.setIcon(R.raw.unlock_icon);
        addView(r0Var, c8.ma.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.m6.Fi);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (z10 == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.m6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.m6.I.q();
                this.a = z10;
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.a6.b(z10), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

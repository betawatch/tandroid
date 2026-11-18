package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gx extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ ry d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(ry ryVar, Context context) {
        super(context);
        this.d = ryVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
        n6 n6Var = new n6(getContext(), false, false, false);
        n6Var.b(0.3f, 250L, lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.a2;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.e(ryVar.z(org.telegram.ui.ActionBar.n6.Fi), 8.0f));
        frameLayout.addView(n6Var, c8.ma.e(-1, -2, 17));
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        ug.s0 s0Var = new ug.s0(getContext(), i6Var, false);
        s0Var.setIcon(R.raw.unlock_icon);
        addView(s0Var, c8.ma.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.n6.Fi);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (z10 == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.n6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.n6.I.q();
                this.a = z10;
                org.telegram.ui.ActionBar.n6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.n6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.b6.b(z10), true);
                frameLayout.invalidate();
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

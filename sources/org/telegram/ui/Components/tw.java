package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tw extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ ey d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(ey eyVar, Context context) {
        super(context);
        this.d = eyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        h6 h6Var = new h6(getContext(), false, false, false);
        h6Var.b(0.3f, 250L, xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i3 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(eyVar.z(org.telegram.ui.ActionBar.k6.Ci), 8.0f));
        frameLayout.addView(h6Var, b8.mf.e(-1, -2, 17));
        addView(frameLayout, b8.mf.c(-1.0f, -1));
        vg.o0 o0Var = new vg.o0(getContext(), e6Var, false);
        o0Var.setIcon(R.raw.unlock_icon);
        addView(o0Var, b8.mf.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.k6.Ci);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (z10 == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.k6.I.q();
                this.a = z10;
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.y5.b(z10), true);
                frameLayout.invalidate();
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

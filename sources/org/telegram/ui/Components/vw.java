package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vw extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ hy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(hy hyVar, Context context) {
        super(context);
        this.d = hyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        j6 j6Var = new j6(getContext(), false, false, false);
        j6Var.b(0.3f, 250L, xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i7, f6Var);
        j6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.z5.e(hyVar.z(org.telegram.ui.ActionBar.k6.Ci), 8.0f));
        frameLayout.addView(j6Var, c8.ha.e(-1, -2, 17));
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        ug.p0 p0Var = new ug.p0(getContext(), f6Var, false);
        p0Var.setIcon(R.raw.unlock_icon);
        addView(p0Var, c8.ha.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            int z9 = this.d.z(org.telegram.ui.ActionBar.k6.Ci);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (z9 == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.k6.I.q();
                this.a = z9;
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), z9, false);
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.z5.b(z9), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

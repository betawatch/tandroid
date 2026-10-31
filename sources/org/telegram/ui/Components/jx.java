package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jx extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ vy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(vy vyVar, Context context) {
        super(context);
        this.d = vyVar;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        f6 f6Var = new f6(getContext(), false, false, false);
        f6Var.b(0.3f, 250L, gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int i10 = org.telegram.ui.ActionBar.t6.Gi;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i10, p6Var);
        f6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.e(vyVar.A(org.telegram.ui.ActionBar.t6.Ci), 8.0f));
        frameLayout.addView(f6Var, w7.b6.e(-1, -2, 17));
        addView(frameLayout, w7.b6.c(-1.0f, -1));
        kg.x0 x0Var = new kg.x0(getContext(), p6Var, false);
        x0Var.setIcon(R.raw.unlock_icon);
        addView(x0Var, w7.b6.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(11.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.i0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int A = this.d.A(org.telegram.ui.ActionBar.t6.Ci);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (A == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.t6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.t6.I.q();
                this.a = A;
                org.telegram.ui.ActionBar.t6.H1(frameLayout.getBackground(), A, false);
                org.telegram.ui.ActionBar.t6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.j6.b(A), true);
                frameLayout.invalidate();
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

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uw extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ gy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(gy gyVar, Context context) {
        super(context);
        this.d = gyVar;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.a;
        i6 i6Var = new i6(getContext(), false, false, false);
        i6Var.b(0.3f, 250L, wq.h);
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.m6.Gi;
        org.telegram.ui.ActionBar.h6 h6Var = gyVar.Z1;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i7, h6Var);
        i6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.e(gyVar.z(org.telegram.ui.ActionBar.m6.Ci), 8.0f));
        frameLayout.addView(i6Var, c8.ha.e(-1, -2, 17));
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        ug.p0 p0Var = new ug.p0(getContext(), h6Var, false);
        p0Var.setIcon(R.raw.unlock_icon);
        addView(p0Var, c8.ha.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int z9 = this.d.z(org.telegram.ui.ActionBar.m6.Ci);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (z9 == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.m6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.m6.I.q();
                this.a = z9;
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), z9, false);
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.b6.b(z9), true);
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

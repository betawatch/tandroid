package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ax extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ ly d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(ly lyVar, Context context) {
        super(context);
        this.d = lyVar;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.a;
        h6 h6Var = new h6(getContext(), false, false, false);
        h6Var.b(0.3f, 250L, er.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.a2;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
        h6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(lyVar.z(org.telegram.ui.ActionBar.j6.Fi), 8.0f));
        frameLayout.addView(h6Var, c8.ja.e(-1, -2, 17));
        addView(frameLayout, c8.ja.c(-1.0f, -1));
        ug.q0 q0Var = new ug.q0(getContext(), e6Var, false);
        q0Var.setIcon(R.raw.unlock_icon);
        addView(q0Var, c8.ja.c(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.j6.Fi);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (z10 == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.j6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.j6.I.q();
                this.a = z10;
                org.telegram.ui.ActionBar.j6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.j6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.y5.b(z10), true);
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

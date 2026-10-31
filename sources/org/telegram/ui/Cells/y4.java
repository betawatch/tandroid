package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final FrameLayout b;
    public int c;
    public boolean d;

    public y4(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), 8.0f));
        addView(frameLayout, w7.b6.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        u5Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        u5Var.setGravity(17);
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(8.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        u5Var.setTextSize(14);
        u5Var.l(cd.L0(2131751437, null), false);
        u5Var.setLeftDrawable(R.drawable.filled_directions);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        frameLayout.addView(u5Var, w7.b6.c(-1.0f, -1));
        frameLayout.setOutlineProvider(rf.e0.b);
        frameLayout.setClipToOutline(true);
        w7.e6.b(frameLayout, 0.02f, 1.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(73.0f), TLObject.FLAG_30));
    }

    public void setOnButtonClick(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.a);
            FrameLayout frameLayout = this.b;
            if (frameLayout != null) {
                if (w02 == this.c) {
                    if (this.d != org.telegram.ui.ActionBar.t6.I.q()) {
                    }
                }
                this.d = org.telegram.ui.ActionBar.t6.I.q();
                this.c = w02;
                org.telegram.ui.ActionBar.t6.H1(frameLayout.getBackground(), w02, false);
                org.telegram.ui.ActionBar.t6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.j6.b(w02), true);
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

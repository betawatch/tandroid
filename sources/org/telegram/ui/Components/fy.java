package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fy extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int a;
    public boolean b;
    public final FrameLayout c;
    public final /* synthetic */ sz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(sz szVar, Context context) {
        super(context);
        this.d = szVar;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.a;
        s6 s6Var = new s6(getContext(), false, false, false);
        s6Var.b(0.3f, 250L, ds.h);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i10, u6Var);
        s6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{8.0f}, szVar.A(org.telegram.ui.ActionBar.y6.Oh)));
        frameLayout.addView(s6Var, kb1.i(-1, -2, 17));
        addView(frameLayout, kb1.g(-1.0f, -1));
        tg.p0 p0Var = new tg.p0(getContext(), u6Var, false);
        p0Var.setIcon(R.raw.unlock_icon);
        addView(p0Var, kb1.g(-1.0f, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int A = this.d.A(org.telegram.ui.ActionBar.y6.Oh);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                if (A == this.a) {
                    if (this.b != org.telegram.ui.ActionBar.y6.I.q()) {
                    }
                }
                this.b = org.telegram.ui.ActionBar.y6.I.q();
                this.a = A;
                org.telegram.ui.ActionBar.y6.E1(frameLayout.getBackground(), A, false);
                org.telegram.ui.ActionBar.y6.E1(frameLayout.getBackground(), org.telegram.ui.ActionBar.o6.b(A), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b80 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.n5 a;
    public final org.telegram.ui.Components.k9 b;
    public boolean c;
    public int d;
    public final /* synthetic */ c80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(c80 c80Var, Context context) {
        super(context);
        this.e = c80Var;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        this.d = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.j5, null);
        addView(n5Var, w7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.b = k9Var;
        k9Var.a.a = true;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 0, 4));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.c = true;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.setVisibility(8);
        super.onMeasure(i10, i11);
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth();
        this.c = false;
        this.e.f();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
            if (x02 != this.d) {
                this.d = x02;
                org.telegram.ui.ActionBar.k6.E1(getBackground(), x02, true);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

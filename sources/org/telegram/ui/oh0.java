package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class oh0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public TLRPC.User a;
    public org.telegram.ui.Components.aa0 b;
    public org.telegram.ui.Components.c10 c;
    public boolean d;
    public int e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.aa0 aa0Var = this.b;
        org.telegram.ui.Components.c10 c10Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z10 = c10Var.getVisibility() == 0;
        aa0Var.setVisibility(8);
        if (z10) {
            c10Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z10) {
            c10Var.getLayoutParams().width = getMeasuredWidth();
            c10Var.setVisibility(0);
        }
        aa0Var.setVisibility(0);
        aa0Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i10, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.y6.E1(getBackground(), x02, true);
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

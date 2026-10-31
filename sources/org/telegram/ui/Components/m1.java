package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ m1(LinearLayout linearLayout, int[] iArr) {
        this.b = linearLayout;
        this.c = iArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.c[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.b;
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = linearLayout.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n6) {
                        ((org.telegram.ui.Cells.n6) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) linearLayout2.getChildAt(i11);
                    n6Var.c.a(n6Var == view, true);
                }
                this.c[0] = org.telegram.ui.Cells.v8.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ m1(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}

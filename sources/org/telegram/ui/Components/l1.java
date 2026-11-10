package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ l1(LinearLayout linearLayout, int[] iArr) {
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
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = linearLayout.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        ((org.telegram.ui.Cells.j6) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) linearLayout2.getChildAt(i10);
                    j6Var.c.a(j6Var == view, true);
                }
                this.c[0] = org.telegram.ui.Cells.t8.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ l1(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}

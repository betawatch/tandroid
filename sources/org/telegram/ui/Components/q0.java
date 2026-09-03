package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ q0(LinearLayout linearLayout, int[] iArr) {
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
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        ((org.telegram.ui.Cells.k6) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i11);
                    k6Var.c.a(k6Var == view, true);
                }
                this.c[0] = org.telegram.ui.Cells.u8.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ q0(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}

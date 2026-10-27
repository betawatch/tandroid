package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ r1(LinearLayout linearLayout, int[] iArr) {
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
                    if (childAt instanceof org.telegram.ui.Cells.p6) {
                        ((org.telegram.ui.Cells.p6) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) linearLayout2.getChildAt(i11);
                    p6Var.c.a(p6Var == view, true);
                }
                this.c[0] = org.telegram.ui.Cells.c9.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ r1(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}

package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ p0(LinearLayout linearLayout, int[] iArr) {
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
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = linearLayout.getChildAt(i9);
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        ((org.telegram.ui.Cells.k6) childAt).c.a(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.b;
                int childCount2 = linearLayout2.getChildCount();
                for (int i10 = 0; i10 < childCount2; i10++) {
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) linearLayout2.getChildAt(i10);
                    k6Var.c.a(k6Var == view, true);
                }
                this.c[0] = org.telegram.ui.Cells.v8.f[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public /* synthetic */ p0(int[] iArr, LinearLayout linearLayout) {
        this.c = iArr;
        this.b = linearLayout;
    }
}

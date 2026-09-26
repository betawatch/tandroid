package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.a2[] b;

    public /* synthetic */ c1(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
        this.a = i10;
        this.b = a2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) view.getTag()).intValue();
                this.b[intValue].c(!r1[r3.intValue()].b(), true);
                break;
            default:
                int intValue2 = ((Integer) view.getTag()).intValue();
                this.b[intValue2].c(!r1[r3.intValue()].b(), true);
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.y1[] b;

    public /* synthetic */ b1(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.a = i10;
        this.b = y1VarArr;
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

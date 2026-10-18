package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.a2[] b;

    public /* synthetic */ f20(org.telegram.ui.Cells.a2[] a2VarArr, int i10) {
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
            case 1:
                this.b[0].c(!r3.b(), true);
                break;
            default:
                this.b[0].c(!r3.b(), true);
                break;
        }
    }
}

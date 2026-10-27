package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.y1[] b;

    public /* synthetic */ k20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.a = i10;
        this.b = y1VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Cells.y1[] y1VarArr = this.b;
        switch (i10) {
            case 0:
                y1VarArr[((Integer) view.getTag()).intValue()].c(!y1VarArr[r5.intValue()].b(), true);
                break;
            case 1:
                y1VarArr[0].c(!r5.b(), true);
                break;
            default:
                int i11 = ProfileActivity.R6;
                y1VarArr[0].c(!r5.b(), true);
                break;
        }
    }
}

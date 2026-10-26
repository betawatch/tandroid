package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.y1[] b;

    public /* synthetic */ i20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
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

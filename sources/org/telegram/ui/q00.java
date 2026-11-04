package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    public /* synthetic */ q00(org.telegram.ui.Cells.c2[] c2VarArr, int i3) {
        this.a = i3;
        this.b = c2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.b;
        switch (i3) {
            case 0:
                c2VarArr[((Integer) view.getTag()).intValue()].c(!c2VarArr[r5.intValue()].b(), true);
                break;
            case 1:
                c2VarArr[0].c(!r5.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.T6;
                c2VarArr[0].c(!r5.b(), true);
                break;
        }
    }
}

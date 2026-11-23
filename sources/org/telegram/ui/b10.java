package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.d2[] b;

    public /* synthetic */ b10(org.telegram.ui.Cells.d2[] d2VarArr, int i7) {
        this.a = i7;
        this.b = d2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Cells.d2[] d2VarArr = this.b;
        switch (i7) {
            case 0:
                d2VarArr[((Integer) view.getTag()).intValue()].c(!d2VarArr[r5.intValue()].b(), true);
                break;
            case 1:
                d2VarArr[0].c(!r5.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.Z6;
                d2VarArr[0].c(!r5.b(), true);
                break;
        }
    }
}

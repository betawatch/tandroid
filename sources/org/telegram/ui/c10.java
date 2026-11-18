package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.d2[] b;

    public /* synthetic */ c10(org.telegram.ui.Cells.d2[] d2VarArr, int i7) {
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

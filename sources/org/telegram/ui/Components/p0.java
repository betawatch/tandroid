package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    public /* synthetic */ p0(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        this.a = i7;
        this.b = c2VarArr;
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

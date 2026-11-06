package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    public /* synthetic */ q0(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
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

package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.a2 b;

    public /* synthetic */ i1(org.telegram.ui.Cells.a2 a2Var, int i10) {
        this.a = i10;
        this.b = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.c(!r3.b(), true);
                break;
            default:
                this.b.c(!r3.b(), true);
                break;
        }
    }
}

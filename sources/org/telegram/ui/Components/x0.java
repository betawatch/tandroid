package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2 b;

    public /* synthetic */ x0(org.telegram.ui.Cells.c2 c2Var, int i7) {
        this.a = i7;
        this.b = c2Var;
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

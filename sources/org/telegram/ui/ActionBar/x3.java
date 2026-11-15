package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ x3(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}

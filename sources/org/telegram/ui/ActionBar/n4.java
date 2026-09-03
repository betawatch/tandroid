package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4 b;

    public /* synthetic */ n4(x4 x4Var, int i10) {
        this.a = i10;
        this.b = x4Var;
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

package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;

    public /* synthetic */ k4(u4 u4Var, int i10) {
        this.a = i10;
        this.b = u4Var;
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

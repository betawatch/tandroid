package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ h0(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }
}

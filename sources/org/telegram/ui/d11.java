package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d11 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ d11(h11 h11Var, int i10) {
        this.a = i10;
        this.b = h11Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h11 h11Var = this.b;
                if (h11Var.Y == null) {
                    h11Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

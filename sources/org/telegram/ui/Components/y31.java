package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h41 b;

    public /* synthetic */ y31(h41 h41Var, int i10) {
        this.a = i10;
        this.b = h41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.dismiss();
                break;
            case 3:
                h41 h41Var = this.b;
                CharSequence charSequence = h41Var.c0;
                if (charSequence != null) {
                    h41Var.d0.run(charSequence);
                }
                h41Var.dismiss();
                break;
            default:
                h41.P(this.b, view);
                break;
        }
    }
}

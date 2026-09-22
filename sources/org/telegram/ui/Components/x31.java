package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g41 b;

    public /* synthetic */ x31(g41 g41Var, int i10) {
        this.a = i10;
        this.b = g41Var;
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
                g41 g41Var = this.b;
                CharSequence charSequence = g41Var.c0;
                if (charSequence != null) {
                    g41Var.d0.run(charSequence);
                }
                g41Var.dismiss();
                break;
            default:
                g41.P(this.b, view);
                break;
        }
    }
}

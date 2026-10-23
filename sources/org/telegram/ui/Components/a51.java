package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ a51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
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
                k51 k51Var = this.b;
                CharSequence charSequence = k51Var.c0;
                if (charSequence != null) {
                    k51Var.d0.run(charSequence);
                }
                k51Var.dismiss();
                break;
            default:
                k51.P(this.b, view);
                break;
        }
    }
}

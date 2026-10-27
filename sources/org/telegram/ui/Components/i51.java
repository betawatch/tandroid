package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s51 b;

    public /* synthetic */ i51(s51 s51Var, int i10) {
        this.a = i10;
        this.b = s51Var;
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
                s51 s51Var = this.b;
                CharSequence charSequence = s51Var.c0;
                if (charSequence != null) {
                    s51Var.d0.run(charSequence);
                }
                s51Var.dismiss();
                break;
            default:
                s51.P(this.b, view);
                break;
        }
    }
}

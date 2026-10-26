package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ h51(r51 r51Var, int i10) {
        this.a = i10;
        this.b = r51Var;
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
                r51 r51Var = this.b;
                CharSequence charSequence = r51Var.c0;
                if (charSequence != null) {
                    r51Var.d0.run(charSequence);
                }
                r51Var.dismiss();
                break;
            default:
                r51.P(this.b, view);
                break;
        }
    }
}

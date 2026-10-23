package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ v41(e51 e51Var, int i10) {
        this.a = i10;
        this.b = e51Var;
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
                e51 e51Var = this.b;
                CharSequence charSequence = e51Var.c0;
                if (charSequence != null) {
                    e51Var.d0.run(charSequence);
                }
                e51Var.dismiss();
                break;
            default:
                e51.Q(this.b, view);
                break;
        }
    }
}

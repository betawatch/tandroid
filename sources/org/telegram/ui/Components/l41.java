package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class l41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u41 b;

    public /* synthetic */ l41(u41 u41Var, int i10) {
        this.a = i10;
        this.b = u41Var;
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
                u41 u41Var = this.b;
                CharSequence charSequence = u41Var.c0;
                if (charSequence != null) {
                    u41Var.d0.run(charSequence);
                }
                u41Var.dismiss();
                break;
            default:
                u41.P(this.b, view);
                break;
        }
    }
}

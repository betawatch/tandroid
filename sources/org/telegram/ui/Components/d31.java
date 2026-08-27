package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ d31(m31 m31Var, int i10) {
        this.a = i10;
        this.b = m31Var;
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
                m31 m31Var = this.b;
                CharSequence charSequence = m31Var.Y;
                if (charSequence != null) {
                    m31Var.Z.run(charSequence);
                }
                m31Var.dismiss();
                break;
            default:
                m31.P(this.b, view);
                break;
        }
    }
}

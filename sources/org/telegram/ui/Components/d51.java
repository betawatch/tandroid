package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m51 b;

    public /* synthetic */ d51(m51 m51Var, int i10) {
        this.a = i10;
        this.b = m51Var;
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
                m51 m51Var = this.b;
                CharSequence charSequence = m51Var.c0;
                if (charSequence != null) {
                    m51Var.d0.run(charSequence);
                }
                m51Var.dismiss();
                break;
            default:
                m51.Q(this.b, view);
                break;
        }
    }
}

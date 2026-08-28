package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ b31(k31 k31Var, int i9) {
        this.a = i9;
        this.b = k31Var;
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
                k31 k31Var = this.b;
                CharSequence charSequence = k31Var.Y;
                if (charSequence != null) {
                    k31Var.Z.run(charSequence);
                }
                k31Var.dismiss();
                break;
            default:
                k31.O(this.b, view);
                break;
        }
    }
}

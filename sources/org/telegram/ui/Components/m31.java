package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ m31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
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
                v31 v31Var = this.b;
                CharSequence charSequence = v31Var.Y;
                if (charSequence != null) {
                    v31Var.Z.run(charSequence);
                }
                v31Var.dismiss();
                break;
            default:
                v31.P(this.b, view);
                break;
        }
    }
}

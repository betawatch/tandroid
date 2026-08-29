package nh;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ p7(y7 y7Var, int i10) {
        this.a = i10;
        this.b = y7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.U();
                break;
            default:
                this.b.X();
                break;
        }
    }
}

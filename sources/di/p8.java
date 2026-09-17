package di;

import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ p8(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
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

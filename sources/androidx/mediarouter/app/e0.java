package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ e0(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                o0 o0Var = this.b;
                if (o0Var.r.g()) {
                    o0Var.f.getClass();
                    p4.x.j(2);
                }
                o0Var.dismiss();
                break;
        }
    }
}

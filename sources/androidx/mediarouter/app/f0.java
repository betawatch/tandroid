package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ f0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                p0 p0Var = this.b;
                if (p0Var.r.g()) {
                    p0Var.f.getClass();
                    c2.d0.j(2);
                }
                p0Var.dismiss();
                break;
        }
    }
}

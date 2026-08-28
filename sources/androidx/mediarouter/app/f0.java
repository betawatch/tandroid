package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ f0(p0 p0Var, int i9) {
        this.a = i9;
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
                    c2.c0.j(2);
                }
                p0Var.dismiss();
                break;
        }
    }
}

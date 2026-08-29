package androidx.mediarouter.app;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ c0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                m0 m0Var = this.b;
                if (m0Var.r.g()) {
                    m0Var.f.getClass();
                    c2.d0.j(2);
                }
                m0Var.dismiss();
                break;
        }
    }
}

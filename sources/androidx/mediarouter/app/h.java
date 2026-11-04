package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import b8.c1;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.p {
    public boolean B0 = false;
    public g.u C0;
    public r4.r D0;

    public h() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.B0) {
            c0 c0Var = new c0(n());
            this.C0 = c0Var;
            P();
            c0Var.f(this.D0);
        } else {
            g gVar = new g(n());
            this.C0 = gVar;
            P();
            gVar.h(this.D0);
        }
        return this.C0;
    }

    public final void P() {
        if (this.D0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.D0 = r4.r.b(bundle.getBundle("selector"));
            }
            if (this.D0 == null) {
                this.D0 = r4.r.c;
            }
        }
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.V = true;
        g.u uVar = this.C0;
        if (uVar == null) {
            return;
        }
        if (!this.B0) {
            g gVar = (g) uVar;
            gVar.getWindow().setLayout(c1.a(gVar.getContext()), -2);
        } else {
            c0 c0Var = (c0) uVar;
            Context context = c0Var.n;
            c0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : c1.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}

package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.p {
    public boolean w0 = false;
    public g.t x0;
    public c2.u y0;

    public h() {
        this.m0 = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.w0) {
            c0 c0Var = new c0(n());
            this.x0 = c0Var;
            P();
            c0Var.f(this.y0);
        } else {
            g gVar = new g(n());
            this.x0 = gVar;
            P();
            gVar.h(this.y0);
        }
        return this.x0;
    }

    public final void P() {
        if (this.y0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.y0 = c2.u.b(bundle.getBundle("selector"));
            }
            if (this.y0 == null) {
                this.y0 = c2.u.c;
            }
        }
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
        g.t tVar = this.x0;
        if (tVar == null) {
            return;
        }
        if (!this.w0) {
            g gVar = (g) tVar;
            gVar.getWindow().setLayout(g7.a0.a(gVar.getContext()), -2);
        } else {
            c0 c0Var = (c0) tVar;
            Context context = c0Var.n;
            c0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : g7.a0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}

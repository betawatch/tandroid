package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class j extends androidx.fragment.app.p {
    public boolean w0 = false;
    public g.s x0;
    public c2.v y0;

    public j() {
        this.m0 = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.w0) {
            e0 e0Var = new e0(n());
            this.x0 = e0Var;
            P();
            e0Var.f(this.y0);
        } else {
            i iVar = new i(n());
            this.x0 = iVar;
            P();
            iVar.h(this.y0);
        }
        return this.x0;
    }

    public final void P() {
        if (this.y0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.y0 = c2.v.b(bundle.getBundle("selector"));
            }
            if (this.y0 == null) {
                this.y0 = c2.v.c;
            }
        }
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
        g.s sVar = this.x0;
        if (sVar == null) {
            return;
        }
        if (!this.w0) {
            i iVar = (i) sVar;
            iVar.getWindow().setLayout(f7.c0.a(iVar.getContext()), -2);
        } else {
            e0 e0Var = (e0) sVar;
            Context context = e0Var.n;
            e0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : f7.c0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}

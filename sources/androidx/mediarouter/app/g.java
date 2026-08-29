package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class g extends androidx.fragment.app.p {
    public boolean w0 = false;
    public g.s x0;
    public c2.w y0;

    public g() {
        this.m0 = true;
        Dialog dialog = this.r0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.w0) {
            b0 b0Var = new b0(n());
            this.x0 = b0Var;
            P();
            b0Var.f(this.y0);
        } else {
            f fVar = new f(n());
            this.x0 = fVar;
            P();
            fVar.h(this.y0);
        }
        return this.x0;
    }

    public final void P() {
        if (this.y0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.y0 = c2.w.b(bundle.getBundle("selector"));
            }
            if (this.y0 == null) {
                this.y0 = c2.w.c;
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
            f fVar = (f) sVar;
            fVar.getWindow().setLayout(h7.k0.a(fVar.getContext()), -2);
        } else {
            b0 b0Var = (b0) sVar;
            Context context = b0Var.n;
            b0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : h7.k0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}

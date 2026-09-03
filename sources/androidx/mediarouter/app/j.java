package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class j extends androidx.fragment.app.p {
    public boolean x0 = false;
    public g.s y0;
    public c2.v z0;

    public j() {
        this.n0 = true;
        Dialog dialog = this.s0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.p
    public final Dialog O() {
        if (this.x0) {
            e0 e0Var = new e0(n());
            this.y0 = e0Var;
            P();
            e0Var.f(this.z0);
        } else {
            i iVar = new i(n());
            this.y0 = iVar;
            P();
            iVar.h(this.z0);
        }
        return this.y0;
    }

    public final void P() {
        if (this.z0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.z0 = c2.v.b(bundle.getBundle("selector"));
            }
            if (this.z0 == null) {
                this.z0 = c2.v.c;
            }
        }
    }

    @Override // androidx.fragment.app.s, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.R = true;
        g.s sVar = this.y0;
        if (sVar == null) {
            return;
        }
        if (!this.x0) {
            i iVar = (i) sVar;
            iVar.getWindow().setLayout(j7.z.a(iVar.getContext()), -2);
        } else {
            e0 e0Var = (e0) sVar;
            Context context = e0Var.n;
            e0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : j7.z.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}

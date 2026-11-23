package androidx.mediarouter.app;

import a8.b7;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class h extends androidx.fragment.app.p {
    public boolean B0 = false;
    public g.u C0;
    public s4.r D0;

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
            b0 b0Var = new b0(n());
            this.C0 = b0Var;
            P();
            b0Var.f(this.D0);
        } else {
            g gVar = new g(n());
            this.C0 = gVar;
            P();
            gVar.g(this.D0);
        }
        return this.C0;
    }

    public final void P() {
        if (this.D0 == null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                this.D0 = s4.r.b(bundle.getBundle("selector"));
            }
            if (this.D0 == null) {
                this.D0 = s4.r.c;
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
            gVar.getWindow().setLayout(b7.a(gVar.getContext()), -2);
        } else {
            b0 b0Var = (b0) uVar;
            Context context = b0Var.n;
            b0Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : b7.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}

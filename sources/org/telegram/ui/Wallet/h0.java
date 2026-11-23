package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.fe0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class h0 implements Runnable, gs {
    public boolean a;
    public final /* synthetic */ ls b;
    public final /* synthetic */ fe0 c;
    public final /* synthetic */ u0 d;

    public h0(ls lsVar, fe0 fe0Var, u0 u0Var) {
        this.b = lsVar;
        this.c = fe0Var;
        this.d = u0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        u0 u0Var = this.d;
        if (u0Var.e == null) {
            return;
        }
        ArrayList arrayList = u0Var.J;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((q0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.d4) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        org.telegram.messenger.g0.r(this);
        this.b.n(this, ls.d4);
        this.c.run();
    }
}

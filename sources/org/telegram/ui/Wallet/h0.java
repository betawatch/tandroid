package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.fe0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class h0 implements Runnable, fs {
    public boolean a;
    public final /* synthetic */ ks b;
    public final /* synthetic */ fe0 c;
    public final /* synthetic */ u0 d;

    public h0(ks ksVar, fe0 fe0Var, u0 u0Var) {
        this.b = ksVar;
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.d4) {
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
        this.b.n(this, ks.d4);
        this.c.run();
    }
}

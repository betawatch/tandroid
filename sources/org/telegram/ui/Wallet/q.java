package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(j0 j0Var, a0 a0Var, String str, Runnable runnable) {
        this.c = j0Var;
        this.d = a0Var;
        this.b = str;
        this.e = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                j0 j0Var = this.c;
                j0Var.getClass();
                a0Var.c = (byte[]) obj;
                if (j0Var.J.get(str) == a0Var) {
                    j0Var.f0(a0Var);
                    j0Var.I();
                }
                runnable.run();
                return;
            case 1:
                z6.U((z6) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.m2) this.e, (String) obj);
                return;
            case 2:
                k7 k7Var = (k7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                j0 j0Var2 = this.c;
                String str2 = (String) obj;
                if (str2 != null) {
                    callback.run(str2);
                    return;
                }
                g0 d = g0.d(arrayList);
                try {
                    j0Var2.A(true, false, d, new y6(3, k7Var, callback));
                    d.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        d.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                k7 k7Var2 = (k7) this.d;
                String str3 = (String) this.b;
                o0 o0Var = (o0) this.e;
                j0 j0Var3 = this.c;
                j0Var3.s(str3, new f7(k7Var2, (Utilities.Callback) obj, o0Var, j0Var3));
                return;
        }
    }

    public /* synthetic */ q(z6 z6Var, String str, j0 j0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = z6Var;
        this.b = str;
        this.c = j0Var;
        this.e = m2Var;
    }

    public /* synthetic */ q(k7 k7Var, Utilities.Callback callback, ArrayList arrayList, j0 j0Var) {
        this.d = k7Var;
        this.b = callback;
        this.e = arrayList;
        this.c = j0Var;
    }

    public /* synthetic */ q(k7 k7Var, j0 j0Var, String str, o0 o0Var) {
        this.d = k7Var;
        this.c = j0Var;
        this.b = str;
        this.e = o0Var;
    }
}

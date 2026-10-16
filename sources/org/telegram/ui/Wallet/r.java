package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r(k0 k0Var, b0 b0Var, String str, Runnable runnable) {
        this.c = k0Var;
        this.d = b0Var;
        this.b = str;
        this.e = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                k0 k0Var = this.c;
                k0Var.getClass();
                b0Var.c = (byte[]) obj;
                if (k0Var.J.get(str) == b0Var) {
                    k0Var.f0(b0Var);
                    k0Var.I();
                }
                runnable.run();
                return;
            case 1:
                a7.U((a7) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.m2) this.e, (String) obj);
                return;
            case 2:
                l7 l7Var = (l7) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                k0 k0Var2 = this.c;
                String str2 = (String) obj;
                if (str2 != null) {
                    callback.run(str2);
                    return;
                }
                h0 d = h0.d(arrayList);
                try {
                    k0Var2.A(true, false, d, new z6(3, l7Var, callback));
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
                l7 l7Var2 = (l7) this.d;
                String str3 = (String) this.b;
                p0 p0Var = (p0) this.e;
                k0 k0Var3 = this.c;
                k0Var3.s(str3, new g7(l7Var2, (Utilities.Callback) obj, p0Var, k0Var3));
                return;
        }
    }

    public /* synthetic */ r(a7 a7Var, String str, k0 k0Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = a7Var;
        this.b = str;
        this.c = k0Var;
        this.e = m2Var;
    }

    public /* synthetic */ r(l7 l7Var, Utilities.Callback callback, ArrayList arrayList, k0 k0Var) {
        this.d = l7Var;
        this.b = callback;
        this.e = arrayList;
        this.c = k0Var;
    }

    public /* synthetic */ r(l7 l7Var, k0 k0Var, String str, p0 p0Var) {
        this.d = l7Var;
        this.c = k0Var;
        this.b = str;
        this.e = p0Var;
    }
}

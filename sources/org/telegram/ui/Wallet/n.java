package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Utilities.Callback {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(l0 l0Var, c0 c0Var, String str, Runnable runnable) {
        this.c = l0Var;
        this.d = c0Var;
        this.b = str;
        this.e = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                l0 l0Var = this.c;
                l0Var.getClass();
                c0Var.c = (byte[]) obj;
                if (l0Var.N.get(str) == c0Var) {
                    l0Var.h0(c0Var);
                    l0Var.J();
                }
                runnable.run();
                return;
            case 1:
                w7.V((w7) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.r2) this.e, (String) obj);
                return;
            case 2:
                h8 h8Var = (h8) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                l0 l0Var2 = this.c;
                String str2 = (String) obj;
                if (str2 != null) {
                    callback.run(str2);
                    return;
                }
                i0 d = i0.d(arrayList);
                try {
                    l0Var2.B(true, false, d, new s(12, h8Var, callback));
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
                h8 h8Var2 = (h8) this.d;
                String str3 = (String) this.b;
                p0 p0Var = (p0) this.e;
                l0 l0Var3 = this.c;
                l0Var3.t(str3, new c8(h8Var2, (Utilities.Callback) obj, p0Var, l0Var3));
                return;
        }
    }

    public /* synthetic */ n(w7 w7Var, String str, l0 l0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.d = w7Var;
        this.b = str;
        this.c = l0Var;
        this.e = r2Var;
    }

    public /* synthetic */ n(h8 h8Var, Utilities.Callback callback, ArrayList arrayList, l0 l0Var) {
        this.d = h8Var;
        this.b = callback;
        this.e = arrayList;
        this.c = l0Var;
    }

    public /* synthetic */ n(h8 h8Var, l0 l0Var, String str, p0 p0Var) {
        this.d = h8Var;
        this.c = l0Var;
        this.b = str;
        this.e = p0Var;
    }
}

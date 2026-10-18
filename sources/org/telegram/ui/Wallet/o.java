package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(m0 m0Var, d0 d0Var, String str, Runnable runnable) {
        this.c = m0Var;
        this.d = d0Var;
        this.b = str;
        this.e = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.d;
                String str = (String) this.b;
                Runnable runnable = (Runnable) this.e;
                m0 m0Var = this.c;
                m0Var.getClass();
                d0Var.c = (byte[]) obj;
                if (m0Var.N.get(str) == d0Var) {
                    m0Var.h0(d0Var);
                    m0Var.J();
                }
                runnable.run();
                return;
            case 1:
                w7.U((w7) this.d, (String) this.b, this.c, (org.telegram.ui.ActionBar.n2) this.e, (String) obj);
                return;
            case 2:
                h8 h8Var = (h8) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                ArrayList arrayList = (ArrayList) this.e;
                m0 m0Var2 = this.c;
                String str2 = (String) obj;
                if (str2 != null) {
                    callback.run(str2);
                    return;
                }
                j0 d = j0.d(arrayList);
                try {
                    m0Var2.B(true, false, d, new x(10, h8Var, callback));
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
                q0 q0Var = (q0) this.e;
                m0 m0Var3 = this.c;
                m0Var3.t(str3, new c8(h8Var2, (Utilities.Callback) obj, q0Var, m0Var3));
                return;
        }
    }

    public /* synthetic */ o(w7 w7Var, String str, m0 m0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = w7Var;
        this.b = str;
        this.c = m0Var;
        this.e = n2Var;
    }

    public /* synthetic */ o(h8 h8Var, Utilities.Callback callback, ArrayList arrayList, m0 m0Var) {
        this.d = h8Var;
        this.b = callback;
        this.e = arrayList;
        this.c = m0Var;
    }

    public /* synthetic */ o(h8 h8Var, m0 m0Var, String str, q0 q0Var) {
        this.d = h8Var;
        this.c = m0Var;
        this.b = str;
        this.e = q0Var;
    }
}

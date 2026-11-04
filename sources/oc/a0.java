package oc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.w0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a0 extends Thread {
    public final u a;

    public a0(String str, u uVar, int i3) {
        super(str);
        this.a = uVar;
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b4.n nVar = this.a.d;
        int i3 = 0;
        if (nVar != null) {
            ArrayList arrayList = (ArrayList) nVar.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                w0 w0Var = (w0) obj;
                try {
                    try {
                        w0Var.getClass();
                    } catch (Throwable unused) {
                        w0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (nVar != null) {
            ArrayList arrayList2 = (ArrayList) nVar.q();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                w0 w0Var2 = (w0) obj2;
                try {
                    try {
                        w0Var2.getClass();
                    } catch (Throwable unused3) {
                        w0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}

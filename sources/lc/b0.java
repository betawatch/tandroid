package lc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.y0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b0 extends Thread {
    public final v a;

    public b0(String str, v vVar, int i10) {
        super(str);
        this.a = vVar;
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ac.a aVar = this.a.d;
        int i10 = 0;
        if (aVar != null) {
            ArrayList arrayList = (ArrayList) aVar.o();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (aVar != null) {
            ArrayList arrayList2 = (ArrayList) aVar.o();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}

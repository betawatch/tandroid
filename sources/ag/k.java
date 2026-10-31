package ag;

import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k {
    public static volatile k[] g = new k[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public long b;
    public TL_account.connectedBots c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public k(int i10) {
        this.a = i10;
    }

    public static k a(int i10) {
        k kVar;
        k kVar2 = g[i10];
        if (kVar2 != null) {
            return kVar2;
        }
        synchronized (h[i10]) {
            try {
                kVar = g[i10];
                if (kVar == null) {
                    k[] kVarArr = g;
                    k kVar3 = new k(i10);
                    kVarArr[i10] = kVar3;
                    kVar = kVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(q20 q20Var) {
        boolean z10;
        if (q20Var != null) {
            this.d.add(q20Var);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z10 = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new c(this, 1));
        } else if (z10) {
            d();
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                zs.f(this.a).k(zs.Z3, new Object[0]);
                return;
            } else {
                if (arrayList.get(i10) != null) {
                    ((q20) arrayList.get(i10)).a(this.c);
                }
                i10++;
            }
        }
    }
}

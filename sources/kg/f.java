package kg;

import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f {
    public static volatile f[] g = new f[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public long b;
    public TL_account.connectedBots c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            h[i7] = new Object();
        }
    }

    public f(int i7) {
        this.a = i7;
    }

    public static f a(int i7) {
        f fVar;
        f fVar2 = g[i7];
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (h[i7]) {
            try {
                fVar = g[i7];
                if (fVar == null) {
                    f[] fVarArr = g;
                    f fVar3 = new f(i7);
                    fVarArr[i7] = fVar3;
                    fVar = fVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public final void b() {
        this.f = false;
        c(null);
    }

    public final void c(z10 z10Var) {
        boolean z10;
        if (z10Var != null) {
            this.d.add(z10Var);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z10 = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new ai.d1(this, 15));
        } else if (z10) {
            d();
        }
    }

    public final void d() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                ns.f(this.a).k(ns.Z3, new Object[0]);
                return;
            } else {
                if (arrayList.get(i7) != null) {
                    ((z10) arrayList.get(i7)).a(this.c);
                }
                i7++;
            }
        }
    }
}

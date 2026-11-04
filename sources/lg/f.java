package lg;

import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public f(int i3) {
        this.a = i3;
    }

    public static f a(int i3) {
        f fVar;
        f fVar2 = g[i3];
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (h[i3]) {
            try {
                fVar = g[i3];
                if (fVar == null) {
                    f[] fVarArr = g;
                    f fVar3 = new f(i3);
                    fVarArr[i3] = fVar3;
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

    public final void c(u10 u10Var) {
        boolean z10;
        if (u10Var != null) {
            this.d.add(u10Var);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z10 = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new ci.d0(this, 15));
        } else if (z10) {
            d();
        }
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                hs.f(this.a).k(hs.Z3, new Object[0]);
                return;
            } else {
                if (arrayList.get(i3) != null) {
                    ((u10) arrayList.get(i3)).a(this.c);
                }
                i3++;
            }
        }
    }
}

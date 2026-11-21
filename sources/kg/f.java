package kg;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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

    public final void c(x10 x10Var) {
        boolean z10;
        if (x10Var != null) {
            this.d.add(x10Var);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z10 = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new ai.g1(this, 17));
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
                ks.f(this.a).k(ks.c4, new Object[0]);
                return;
            } else {
                if (arrayList.get(i7) != null) {
                    ((x10) arrayList.get(i7)).a(this.c);
                }
                i7++;
            }
        }
    }
}

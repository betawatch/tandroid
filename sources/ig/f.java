package ig;

import bi.v7;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public f(int i10) {
        this.a = i10;
    }

    public static f a(int i10) {
        f fVar;
        f fVar2 = g[i10];
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (h[i10]) {
            try {
                fVar = g[i10];
                if (fVar == null) {
                    f[] fVarArr = g;
                    f fVar3 = new f(i10);
                    fVarArr[i10] = fVar3;
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

    public final void c(Utilities.Callback callback) {
        boolean z10;
        if (callback != null) {
            this.d.add(callback);
        }
        if (this.e) {
            return;
        }
        if (System.currentTimeMillis() - this.b > 60000 || !(z10 = this.f)) {
            this.e = true;
            ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getConnectedBots(), new v7(this, 11));
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
                NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                return;
            } else {
                if (arrayList.get(i10) != null) {
                    ((Utilities.Callback) arrayList.get(i10)).run(this.c);
                }
                i10++;
            }
        }
    }
}

// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bd5 {
    public final int c;
    public t79 e;
    public boolean f;
    public int g;
    public int h;
    public TLRPC.Peer i;
    public String k;
    public int l;
    public int m;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public int d = -1;
    public int j = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public bd5(int i) {
        this.c = i;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.c).cancelRequest(this.d, true);
            this.d = -1;
        }
        t79 t79Var = this.e;
        if (t79Var != null) {
            t79Var.run();
            this.e = null;
        }
        this.a.clear();
        this.b.clear();
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = 2147483637;
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = false;
    }

    public final int b() {
        int i = this.l >= this.a.size() - 1 ? 0 : 1;
        return this.l > 0 ? i | 2 : i;
    }
}

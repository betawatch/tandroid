package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class na {
    public final int c;
    public k7 e;
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

    public na(int i7) {
        this.c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.c).cancelRequest(this.d, true);
            this.d = -1;
        }
        k7 k7Var = this.e;
        if (k7Var != null) {
            k7Var.run();
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
        int i7 = this.l >= this.a.size() - 1 ? 0 : 1;
        return this.l > 0 ? i7 | 2 : i7;
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class oa {
    public final int c;
    public o7 e;
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

    public oa(int i10) {
        this.c = i10;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.c).cancelRequest(this.d, true);
            this.d = -1;
        }
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.run();
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
        int i10 = this.l >= this.a.size() - 1 ? 0 : 1;
        return this.l > 0 ? i10 | 2 : i10;
    }
}

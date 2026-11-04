package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bf extends se {
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public int G;
    public int H;
    public CharSequence I;
    public TLRPC.Document J;
    public TLRPC.Photo K;
    public TLRPC.PhotoSize L;
    public TLRPC.PhotoSize M;
    public TLRPC.BotInlineResult N;
    public HashMap O;

    @Override // org.telegram.messenger.se
    public final String a() {
        if (this.L != null) {
            w7.G(h10.t0);
            return w7.K(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return zb.A(this.C).getAbsolutePath();
        }
        w7.G(h10.t0);
        return w7.K(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final bf clone() {
        bf bfVar = new bf();
        bfVar.B = this.B;
        bfVar.C = this.C;
        bfVar.D = this.D;
        bfVar.E = this.E;
        bfVar.F = this.F;
        bfVar.G = this.G;
        bfVar.H = this.H;
        bfVar.I = this.I;
        bfVar.J = this.J;
        bfVar.K = this.K;
        bfVar.L = this.L;
        bfVar.M = this.M;
        bfVar.N = this.N;
        bfVar.O = this.O;
        return bfVar;
    }

    public final String g() {
        if (this.L != null) {
            w7.G(h10.t0);
            return w7.K(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        w7.G(h10.t0);
        return w7.K(this.J, null, true, true).getAbsolutePath();
    }
}

package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class jf extends ye {
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

    @Override // org.telegram.messenger.ye
    public final String a() {
        if (this.L != null) {
            w7.G(m10.t0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return fc.A(this.C).getAbsolutePath();
        }
        w7.G(m10.t0);
        return w7.J(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jf clone() {
        jf jfVar = new jf();
        jfVar.B = this.B;
        jfVar.C = this.C;
        jfVar.D = this.D;
        jfVar.E = this.E;
        jfVar.F = this.F;
        jfVar.G = this.G;
        jfVar.H = this.H;
        jfVar.I = this.I;
        jfVar.J = this.J;
        jfVar.K = this.K;
        jfVar.L = this.L;
        jfVar.M = this.M;
        jfVar.N = this.N;
        jfVar.O = this.O;
        return jfVar;
    }

    public final String g() {
        if (this.L != null) {
            w7.G(m10.t0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        w7.G(m10.t0);
        return w7.J(this.J, null, true, true).getAbsolutePath();
    }
}

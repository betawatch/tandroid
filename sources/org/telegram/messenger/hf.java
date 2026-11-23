package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class hf extends xe {
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

    @Override // org.telegram.messenger.xe
    public final String a() {
        if (this.L != null) {
            w7.G(i10.t0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return ec.A(this.C).getAbsolutePath();
        }
        w7.G(i10.t0);
        return w7.J(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final hf clone() {
        hf hfVar = new hf();
        hfVar.B = this.B;
        hfVar.C = this.C;
        hfVar.D = this.D;
        hfVar.E = this.E;
        hfVar.F = this.F;
        hfVar.G = this.G;
        hfVar.H = this.H;
        hfVar.I = this.I;
        hfVar.J = this.J;
        hfVar.K = this.K;
        hfVar.L = this.L;
        hfVar.M = this.M;
        hfVar.N = this.N;
        hfVar.O = this.O;
        return hfVar;
    }

    public final String g() {
        if (this.L != null) {
            w7.G(i10.t0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        w7.G(i10.t0);
        return w7.J(this.J, null, true, true).getAbsolutePath();
    }
}

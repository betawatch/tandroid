package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class kf extends ze {
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

    @Override // org.telegram.messenger.ze
    public final String a() {
        if (this.L != null) {
            w7.G(p10.s0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return gc.A(this.C).getAbsolutePath();
        }
        w7.G(p10.s0);
        return w7.J(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final kf clone() {
        kf kfVar = new kf();
        kfVar.B = this.B;
        kfVar.C = this.C;
        kfVar.D = this.D;
        kfVar.E = this.E;
        kfVar.F = this.F;
        kfVar.G = this.G;
        kfVar.H = this.H;
        kfVar.I = this.I;
        kfVar.J = this.J;
        kfVar.K = this.K;
        kfVar.L = this.L;
        kfVar.M = this.M;
        kfVar.N = this.N;
        kfVar.O = this.O;
        return kfVar;
    }

    public final String g() {
        if (this.L != null) {
            w7.G(p10.s0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        w7.G(p10.s0);
        return w7.J(this.J, null, true, true).getAbsolutePath();
    }
}

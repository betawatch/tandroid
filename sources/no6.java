// default package

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class no6 extends co6 {
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public CharSequence I;
    public TLRPC.Document J;
    public TLRPC.Photo K;
    public TLRPC.PhotoSize L;
    public TLRPC.PhotoSize M;
    public TLRPC.BotInlineResult N;
    public HashMap O;

    @Override // co6
    public final String a() {
        if (this.L != null) {
            bc4.G(z8c.t0);
            return bc4.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return fn5.w(this.C).getAbsolutePath();
        }
        bc4.G(z8c.t0);
        return bc4.J(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final no6 clone() {
        no6 no6Var = new no6();
        no6Var.B = this.B;
        no6Var.C = this.C;
        no6Var.D = this.D;
        no6Var.E = this.E;
        no6Var.F = this.F;
        no6Var.G = this.G;
        no6Var.H = this.H;
        no6Var.I = this.I;
        no6Var.J = this.J;
        no6Var.K = this.K;
        no6Var.L = this.L;
        no6Var.M = this.M;
        no6Var.N = this.N;
        no6Var.O = this.O;
        return no6Var;
    }

    public final String g() {
        if (this.L != null) {
            bc4.G(z8c.t0);
            return bc4.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        bc4.G(z8c.t0);
        return bc4.J(this.J, null, true, true).getAbsolutePath();
    }
}

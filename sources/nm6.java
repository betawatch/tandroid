// default package

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nm6 extends bm6 {
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

    @Override // bm6
    public final String a() {
        if (this.L != null) {
            ba4.G(y6c.t0);
            return ba4.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return fl5.w(this.C).getAbsolutePath();
        }
        ba4.G(y6c.t0);
        return ba4.J(this.J, null, true, true).getAbsolutePath();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final nm6 clone() {
        nm6 nm6Var = new nm6();
        nm6Var.B = this.B;
        nm6Var.C = this.C;
        nm6Var.D = this.D;
        nm6Var.E = this.E;
        nm6Var.F = this.F;
        nm6Var.G = this.G;
        nm6Var.H = this.H;
        nm6Var.I = this.I;
        nm6Var.J = this.J;
        nm6Var.K = this.K;
        nm6Var.L = this.L;
        nm6Var.M = this.M;
        nm6Var.N = this.N;
        nm6Var.O = this.O;
        return nm6Var;
    }

    public final String g() {
        if (this.L != null) {
            ba4.G(y6c.t0);
            return ba4.J(this.L, null, true, true).getAbsolutePath();
        }
        if (this.J == null) {
            return this.C;
        }
        ba4.G(y6c.t0);
        return ba4.J(this.J, null, true, true).getAbsolutePath();
    }
}

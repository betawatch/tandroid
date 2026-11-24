// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class il8 {
    public final wm4 a;
    public final long b;

    public il8(kl8 kl8Var, wm4 wm4Var) {
        long length;
        this.a = wm4Var;
        long length2 = ((kl8Var.b.length() + kl8Var.a.length()) << 1) + 128;
        f26 f26Var = (f26) wm4Var.b;
        if (f26Var == null) {
            length = 1024;
        } else {
            length = (((int[]) f26Var.c) == null ? 0L : ((int[]) f26Var.c).length << 2) + (((int[]) f26Var.b).length << 2) + 64;
        }
        this.b = length2 + length;
    }
}

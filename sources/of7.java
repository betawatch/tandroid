// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class of7 {
    public final oxb a;
    public final xxb b;
    public final wxb c;
    public final g2c d;
    public final boolean e;
    public final boolean f;
    public int g;
    public fm4 h;

    public of7(oxb oxbVar, xxb xxbVar, wxb wxbVar) {
        this.a = oxbVar;
        this.b = xxbVar;
        this.c = wxbVar;
        int i = oxbVar.b;
        fm4 fm4Var = oxbVar.g;
        this.e = i == 2;
        this.f = Objects.equals(fm4Var.t, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(fm4Var.t) ? new g2c() : null;
    }
}

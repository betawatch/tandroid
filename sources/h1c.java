// default package

import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class h1c {
    public final ra0 a;
    public final String b;
    public final s24 c;
    public final yyb d;
    public final i1c e;

    public h1c(ra0 ra0Var, String str, s24 s24Var, yyb yybVar, i1c i1cVar) {
        this.a = ra0Var;
        this.b = str;
        this.c = s24Var;
        this.d = yybVar;
        this.e = i1cVar;
    }

    public final void a(n90 n90Var, j1c j1cVar) {
        yyb yybVar = this.d;
        if (yybVar == null) {
            fvc.f("Null transformer");
            return;
        }
        i1c i1cVar = this.e;
        yb3 yb3Var = i1cVar.c;
        ra0 b = this.a.b(n90Var.c);
        o90 o90Var = new o90();
        o90Var.h = new HashMap();
        o90Var.f = Long.valueOf(i1cVar.a.e());
        o90Var.g = Long.valueOf(i1cVar.b.e());
        o90Var.a = this.b;
        o90Var.e = new o24(this.c, (byte[]) yybVar.apply(n90Var.b));
        o90Var.c = n90Var.a;
        ha0 ha0Var = n90Var.d;
        if (ha0Var != null) {
            o90Var.d = ha0Var.a;
        }
        yb3Var.b.execute(new hn1(yb3Var, b, j1cVar, o90Var.b(), (byte) 12));
    }
}

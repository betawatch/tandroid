// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f66 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String a = j54.a(this.f);
            StringBuilder sb = this.h;
            String a2 = sb != null ? j54.a(sb.toString()) : null;
            String str = this.e;
            e66 e66Var = new e66();
            e66Var.g = str;
            e66Var.h = a;
            e66Var.i = a2;
            this.c.add(e66Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}

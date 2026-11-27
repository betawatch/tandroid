// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j66 {
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
            String a = u44.a(this.f);
            StringBuilder sb = this.h;
            String a2 = sb != null ? u44.a(sb.toString()) : null;
            String str = this.e;
            i66 i66Var = new i66();
            i66Var.g = str;
            i66Var.h = a;
            i66Var.i = a2;
            this.c.add(i66Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}

// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class f46 {
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
            String a = z34.a(this.f);
            StringBuilder sb = this.h;
            String a2 = sb != null ? z34.a(sb.toString()) : null;
            String str = this.e;
            e46 e46Var = new e46();
            e46Var.g = str;
            e46Var.h = a;
            e46Var.i = a2;
            this.c.add(e46Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}

package af;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n {
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
            String a2 = cf.a.a(this.f);
            StringBuilder sb2 = this.h;
            String a10 = sb2 != null ? cf.a.a(sb2.toString()) : null;
            String str = this.e;
            df.m mVar = new df.m();
            mVar.g = str;
            mVar.h = a2;
            mVar.i = a10;
            this.c.add(mVar);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}

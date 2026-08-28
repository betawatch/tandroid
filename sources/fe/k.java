package fe;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k {
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
            String a2 = he.a.a(this.f);
            StringBuilder sb2 = this.h;
            String a3 = sb2 != null ? he.a.a(sb2.toString()) : null;
            String str = this.e;
            ie.m mVar = new ie.m();
            mVar.g = str;
            mVar.h = a2;
            mVar.i = a3;
            this.c.add(mVar);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}

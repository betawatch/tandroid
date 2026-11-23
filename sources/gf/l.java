package gf;

import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class l {
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
            String a10 = jf.a.a(this.f);
            StringBuilder sb2 = this.h;
            String a11 = sb2 != null ? jf.a.a(sb2.toString()) : null;
            String str = this.e;
            kf.m mVar = new kf.m();
            mVar.g = str;
            mVar.h = a10;
            mVar.i = a11;
            this.c.add(mVar);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}

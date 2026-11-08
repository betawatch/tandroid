package gf;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m {
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

package gf;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

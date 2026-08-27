package ge;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            String a2 = ie.a.a(this.f);
            StringBuilder sb2 = this.h;
            String a3 = sb2 != null ? ie.a.a(sb2.toString()) : null;
            String str = this.e;
            je.m mVar = new je.m();
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

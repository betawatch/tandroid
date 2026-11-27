// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class go6 {
    public fo6 A;
    public CharSequence a;
    public boolean b;
    public String c;
    public long d;
    public TLRPC.Photo e;
    public r47 f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m;
    public ArrayList n;
    public po6 o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public oec s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public long y;
    public Boolean z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.b) {
            return false;
        }
        oec oecVar = this.s;
        if (oecVar != null && (oecVar.t || oecVar.a > 0 || oecVar.b > 0)) {
            return true;
        }
        fo6 fo6Var = this.A;
        return ((fo6Var == null || fo6Var.b()) && this.o == null && this.j == null && ((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null) ? false : true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        return bool == null ? xea.d1 : bool.booleanValue();
    }

    public boolean d() {
        return (this instanceof no6) && ((no6) this).d();
    }

    public void e() {
        this.a = null;
        this.g = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.i = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.k = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.p = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.r = null;
        this.A = null;
        this.z = null;
    }
}

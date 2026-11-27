// default package

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jc3 implements uz6 {
    public final am2 a;
    public final lh2 b;
    public uif c;

    public jc3(Context context, db3 db3Var) {
        lh2 lh2Var = new lh2(context);
        uif uifVar = new uif((byte) 17);
        this.b = lh2Var;
        this.c = uifVar;
        am2 am2Var = new am2(db3Var, uifVar);
        this.a = am2Var;
        if (lh2Var != ((lh2) am2Var.e)) {
            am2Var.e = lh2Var;
            ((HashMap) am2Var.c).clear();
            ((HashMap) am2Var.d).clear();
        }
    }

    public static uz6 e(Class cls, lh2 lh2Var) {
        try {
            return (uz6) cls.getConstructor(f73.class).newInstance(lh2Var);
        } catch (Exception e) {
            vr9.l(e);
            return null;
        }
    }

    @Override // uz6
    public final uz6 a() {
        am2 am2Var = this.a;
        synchronized (((db3) am2Var.b)) {
        }
        Iterator it = ((HashMap) am2Var.d).values().iterator();
        while (it.hasNext()) {
            ((uz6) it.next()).a();
        }
        return this;
    }

    @Override // uz6
    public final uz6 b() {
        synchronized (((db3) this.a.b)) {
        }
        return this;
    }

    @Override // uz6
    public final uz6 c(uif uifVar) {
        this.c = uifVar;
        am2 am2Var = this.a;
        am2Var.f = uifVar;
        db3 db3Var = (db3) am2Var.b;
        synchronized (db3Var) {
            db3Var.b = uifVar;
        }
        Iterator it = ((HashMap) am2Var.d).values().iterator();
        while (it.hasNext()) {
            ((uz6) it.next()).c(uifVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uz6
    public final rg0 d(ft6 ft6Var) {
        Uri uri;
        boolean z;
        int i;
        long j;
        Uri uri2;
        String str;
        ss6 ss6Var;
        String str2;
        xs6 xs6Var;
        ft6 ft6Var2 = ft6Var;
        ft6Var2.b.getClass();
        String scheme = ft6Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(ft6Var2.b.b, "application/x-image-uri");
        bt6 bt6Var = ft6Var2.b;
        if (equals) {
            long j2 = bt6Var.h;
            String str3 = gcc.a;
            throw null;
        }
        int M = gcc.M(bt6Var.a, bt6Var.b);
        if (ft6Var2.b.h != -9223372036854775807L) {
            db3 db3Var = (db3) this.a.b;
            synchronized (db3Var) {
                db3Var.c = true;
            }
            this.a.M();
        }
        try {
            am2 am2Var = this.a;
            HashMap hashMap = (HashMap) am2Var.d;
            uz6 uz6Var = (uz6) hashMap.get(Integer.valueOf(M));
            if (uz6Var == null) {
                uz6Var = (uz6) am2Var.B(M).get();
                uz6Var.c((uif) am2Var.f);
                uz6Var.a();
                uz6Var.b();
                hashMap.put(Integer.valueOf(M), uz6Var);
            }
            zs6 a = ft6Var2.c.a();
            at6 at6Var = ft6Var2.c;
            if (at6Var.a == -9223372036854775807L) {
                a.a = -9223372036854775807L;
            }
            if (at6Var.d == -3.4028235E38f) {
                a.d = -3.4028235E38f;
            }
            if (at6Var.e == -3.4028235E38f) {
                a.e = -3.4028235E38f;
            }
            if (at6Var.b == -9223372036854775807L) {
                a.b = -9223372036854775807L;
            }
            if (at6Var.c == -9223372036854775807L) {
                a.c = -9223372036854775807L;
            }
            at6 at6Var2 = new at6(a);
            if (at6Var2.equals(ft6Var2.c)) {
                uri = null;
                z = true;
                i = 0;
            } else {
                xs6 xs6Var2 = new xs6();
                List list = Collections.EMPTY_LIST;
                no5 no5Var = po5.b;
                po5 po5Var = j99.e;
                ct6 ct6Var = ct6.d;
                us6 a2 = ft6Var2.e.a();
                String str4 = ft6Var2.a;
                nt6 nt6Var = ft6Var2.d;
                ft6Var2.c.a();
                ct6 ct6Var2 = ft6Var2.f;
                bt6 bt6Var2 = ft6Var2.b;
                if (bt6Var2 != null) {
                    String str5 = bt6Var2.f;
                    String str6 = bt6Var2.b;
                    Uri uri3 = bt6Var2.a;
                    list = bt6Var2.e;
                    po5Var = bt6Var2.g;
                    uri = null;
                    ys6 ys6Var = bt6Var2.c;
                    if (ys6Var != null) {
                        i = 0;
                        xs6 xs6Var3 = new xs6();
                        z = true;
                        xs6Var3.a = ys6Var.a;
                        xs6Var3.b = ys6Var.b;
                        xs6Var3.c = ys6Var.c;
                        xs6Var3.d = ys6Var.d;
                        xs6Var3.e = ys6Var.e;
                        xs6Var3.f = ys6Var.f;
                        xs6Var3.g = ys6Var.g;
                        xs6Var3.h = ys6Var.h;
                        xs6Var = xs6Var3;
                    } else {
                        z = true;
                        i = 0;
                        xs6Var = new xs6();
                    }
                    ss6 ss6Var2 = bt6Var2.d;
                    j = bt6Var2.h;
                    xs6Var2 = xs6Var;
                    ss6Var = ss6Var2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                } else {
                    uri = null;
                    z = true;
                    i = 0;
                    j = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    ss6Var = null;
                    str2 = null;
                }
                List list2 = list;
                po5 po5Var2 = po5Var;
                zs6 a3 = at6Var2.a();
                yve.p((xs6Var2.b == null || xs6Var2.a != null) ? z : i);
                bt6 bt6Var3 = uri2 != null ? new bt6(uri2, str, xs6Var2.a != null ? new ys6(xs6Var2) : uri, ss6Var, list2, str2, po5Var2, j) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                ws6 ws6Var = new ws6(a2);
                at6 at6Var3 = new at6(a3);
                if (nt6Var == null) {
                    nt6Var = nt6.M;
                }
                ft6Var2 = new ft6(str7, ws6Var, bt6Var3, at6Var3, nt6Var, ct6Var2);
            }
            rg0 d = uz6Var.d(ft6Var2);
            po5 po5Var3 = ft6Var2.b.g;
            if (!po5Var3.isEmpty()) {
                rg0[] rg0VarArr = new rg0[po5Var3.size() + 1];
                rg0VarArr[i] = d;
                for (int i2 = i; i2 < po5Var3.size(); i2++) {
                    jo4 jo4Var = new jo4();
                    jo4Var.s = dg7.n(((et6) po5Var3.get(i2)).b);
                    jo4Var.d = ((et6) po5Var3.get(i2)).c;
                    jo4Var.e = ((et6) po5Var3.get(i2)).d;
                    jo4Var.f = ((et6) po5Var3.get(i2)).e;
                    jo4Var.b = ((et6) po5Var3.get(i2)).f;
                    jo4Var.a = ((et6) po5Var3.get(i2)).g;
                    ko4 ko4Var = new ko4(jo4Var);
                    q72 q72Var = new q72((Object) this, (Object) ko4Var, (byte) 22);
                    lh2 lh2Var = this.b;
                    jz7 jz7Var = new jz7(q72Var, (byte) 21);
                    rx6 rx6Var = new rx6();
                    z6f z6fVar = new z6f((byte) 17);
                    if (this.c.j(ko4Var)) {
                        jo4 a4 = ko4Var.a();
                        a4.s = dg7.n("application/x-media3-cues");
                        a4.k = ko4Var.t;
                        a4.T = this.c.y(ko4Var);
                        ko4Var = new ko4(a4);
                    }
                    ko4 ko4Var2 = ko4Var;
                    int i3 = i2 + 1;
                    String uri4 = ((et6) po5Var3.get(i2)).a.toString();
                    us6 us6Var = new us6();
                    xs6 xs6Var4 = new xs6();
                    List list3 = Collections.EMPTY_LIST;
                    no5 no5Var2 = po5.b;
                    j99 j99Var = j99.e;
                    zs6 zs6Var = new zs6();
                    ct6 ct6Var3 = ct6.d;
                    Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                    yve.p((xs6Var4.b == null || xs6Var4.a != null) ? z : i);
                    ft6 ft6Var3 = new ft6("", new ws6(us6Var), parse != null ? new bt6(parse, null, xs6Var4.a != null ? new ys6(xs6Var4) : uri, null, list3, null, j99Var, -9223372036854775807L) : uri, new at6(zs6Var), nt6.M, ct6Var3);
                    ft6Var3.b.getClass();
                    rg0VarArr[i3] = new ew8(ft6Var3, lh2Var, jz7Var, rx6Var.G(ft6Var3), z6fVar, TLObject.FLAG_20, ko4Var2);
                }
                d = new i37(rg0VarArr);
            }
            ws6 ws6Var2 = ft6Var2.e;
            if (ws6Var2.b != 0 || ws6Var2.d != Long.MIN_VALUE || ws6Var2.f) {
                rx rxVar = new rx(d);
                ws6 ws6Var3 = ft6Var2.e;
                yve.p(!rxVar.b);
                rxVar.d = ws6Var3.a();
                yve.p(!rxVar.b);
                rxVar.b = z;
                d = new oj2(rxVar);
            }
            ft6Var2.b.getClass();
            if (ft6Var2.b.d == null) {
                return d;
            }
            efd.f("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return d;
        } catch (ClassNotFoundException e) {
            vr9.l(e);
            return null;
        }
    }
}

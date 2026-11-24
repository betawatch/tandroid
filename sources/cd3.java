// default package

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cd3 implements qz6 {
    public final sm2 a;
    public final lx6 b;
    public fgf c;

    public cd3(Context context, wb3 wb3Var) {
        lx6 lx6Var = new lx6(context, (byte) 20);
        fgf fgfVar = new fgf((byte) 17);
        this.b = lx6Var;
        this.c = fgfVar;
        sm2 sm2Var = new sm2(wb3Var, fgfVar);
        this.a = sm2Var;
        if (lx6Var != ((lx6) sm2Var.e)) {
            sm2Var.e = lx6Var;
            ((HashMap) sm2Var.c).clear();
            ((HashMap) sm2Var.d).clear();
        }
    }

    public static qz6 e(Class cls, lx6 lx6Var) {
        try {
            return (qz6) cls.getConstructor(y73.class).newInstance(lx6Var);
        } catch (Exception e) {
            dq9.o(e);
            return null;
        }
    }

    @Override // qz6
    public final qz6 a() {
        sm2 sm2Var = this.a;
        synchronized (((wb3) sm2Var.b)) {
        }
        Iterator it = ((HashMap) sm2Var.d).values().iterator();
        while (it.hasNext()) {
            ((qz6) it.next()).a();
        }
        return this;
    }

    @Override // qz6
    public final qz6 b() {
        synchronized (((wb3) this.a.b)) {
        }
        return this;
    }

    @Override // qz6
    public final qz6 c(fgf fgfVar) {
        this.c = fgfVar;
        sm2 sm2Var = this.a;
        sm2Var.f = fgfVar;
        wb3 wb3Var = (wb3) sm2Var.b;
        synchronized (wb3Var) {
            wb3Var.b = fgfVar;
        }
        Iterator it = ((HashMap) sm2Var.d).values().iterator();
        while (it.hasNext()) {
            ((qz6) it.next()).c(fgfVar);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz6
    public final rh0 d(bt6 bt6Var) {
        Uri uri;
        boolean z;
        int i;
        long j;
        Uri uri2;
        String str;
        os6 os6Var;
        String str2;
        ts6 ts6Var;
        bt6 bt6Var2 = bt6Var;
        bt6Var2.b.getClass();
        String scheme = bt6Var2.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(bt6Var2.b.b, "application/x-image-uri");
        xs6 xs6Var = bt6Var2.b;
        if (equals) {
            long j2 = xs6Var.h;
            String str3 = hac.a;
            throw null;
        }
        int M = hac.M(xs6Var.a, xs6Var.b);
        if (bt6Var2.b.h != -9223372036854775807L) {
            wb3 wb3Var = (wb3) this.a.b;
            synchronized (wb3Var) {
                wb3Var.c = true;
            }
            this.a.M();
        }
        try {
            sm2 sm2Var = this.a;
            HashMap hashMap = (HashMap) sm2Var.d;
            qz6 qz6Var = (qz6) hashMap.get(Integer.valueOf(M));
            if (qz6Var == null) {
                qz6Var = (qz6) sm2Var.A(M).get();
                qz6Var.c((fgf) sm2Var.f);
                qz6Var.a();
                qz6Var.b();
                hashMap.put(Integer.valueOf(M), qz6Var);
            }
            vs6 a = bt6Var2.c.a();
            ws6 ws6Var = bt6Var2.c;
            if (ws6Var.a == -9223372036854775807L) {
                a.a = -9223372036854775807L;
            }
            if (ws6Var.d == -3.4028235E38f) {
                a.d = -3.4028235E38f;
            }
            if (ws6Var.e == -3.4028235E38f) {
                a.e = -3.4028235E38f;
            }
            if (ws6Var.b == -9223372036854775807L) {
                a.b = -9223372036854775807L;
            }
            if (ws6Var.c == -9223372036854775807L) {
                a.c = -9223372036854775807L;
            }
            ws6 ws6Var2 = new ws6(a);
            if (ws6Var2.equals(bt6Var2.c)) {
                uri = null;
                z = true;
                i = 0;
            } else {
                ts6 ts6Var2 = new ts6();
                List list = Collections.EMPTY_LIST;
                ko5 ko5Var = mo5.b;
                mo5 mo5Var = y79.e;
                ys6 ys6Var = ys6.d;
                qs6 a2 = bt6Var2.e.a();
                String str4 = bt6Var2.a;
                jt6 jt6Var = bt6Var2.d;
                bt6Var2.c.a();
                ys6 ys6Var2 = bt6Var2.f;
                xs6 xs6Var2 = bt6Var2.b;
                if (xs6Var2 != null) {
                    String str5 = xs6Var2.f;
                    String str6 = xs6Var2.b;
                    Uri uri3 = xs6Var2.a;
                    list = xs6Var2.e;
                    mo5Var = xs6Var2.g;
                    uri = null;
                    us6 us6Var = xs6Var2.c;
                    if (us6Var != null) {
                        i = 0;
                        ts6 ts6Var3 = new ts6();
                        z = true;
                        ts6Var3.a = us6Var.a;
                        ts6Var3.b = us6Var.b;
                        ts6Var3.c = us6Var.c;
                        ts6Var3.d = us6Var.d;
                        ts6Var3.e = us6Var.e;
                        ts6Var3.f = us6Var.f;
                        ts6Var3.g = us6Var.g;
                        ts6Var3.h = us6Var.h;
                        ts6Var = ts6Var3;
                    } else {
                        z = true;
                        i = 0;
                        ts6Var = new ts6();
                    }
                    os6 os6Var2 = xs6Var2.d;
                    j = xs6Var2.h;
                    ts6Var2 = ts6Var;
                    os6Var = os6Var2;
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
                    os6Var = null;
                    str2 = null;
                }
                List list2 = list;
                mo5 mo5Var2 = mo5Var;
                vs6 a3 = ws6Var2.a();
                jte.p((ts6Var2.b == null || ts6Var2.a != null) ? z : i);
                xs6 xs6Var3 = uri2 != null ? new xs6(uri2, str, ts6Var2.a != null ? new us6(ts6Var2) : uri, os6Var, list2, str2, mo5Var2, j) : uri;
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                ss6 ss6Var = new ss6(a2);
                ws6 ws6Var3 = new ws6(a3);
                if (jt6Var == null) {
                    jt6Var = jt6.M;
                }
                bt6Var2 = new bt6(str7, ss6Var, xs6Var3, ws6Var3, jt6Var, ys6Var2);
            }
            rh0 d = qz6Var.d(bt6Var2);
            mo5 mo5Var3 = bt6Var2.b.g;
            if (!mo5Var3.isEmpty()) {
                rh0[] rh0VarArr = new rh0[mo5Var3.size() + 1];
                rh0VarArr[i] = d;
                for (int i2 = i; i2 < mo5Var3.size(); i2++) {
                    fo4 fo4Var = new fo4();
                    fo4Var.s = wf7.n(((at6) mo5Var3.get(i2)).b);
                    fo4Var.d = ((at6) mo5Var3.get(i2)).c;
                    fo4Var.e = ((at6) mo5Var3.get(i2)).d;
                    fo4Var.f = ((at6) mo5Var3.get(i2)).e;
                    fo4Var.b = ((at6) mo5Var3.get(i2)).f;
                    fo4Var.a = ((at6) mo5Var3.get(i2)).g;
                    go4 go4Var = new go4(fo4Var);
                    x92 x92Var = new x92((Object) this, (Object) go4Var, (byte) 19);
                    lx6 lx6Var = this.b;
                    h68 h68Var = new h68(x92Var, (byte) 18);
                    mx6 mx6Var = new mx6();
                    k4f k4fVar = new k4f((byte) 17);
                    if (this.c.h(go4Var)) {
                        fo4 a4 = go4Var.a();
                        a4.s = wf7.n("application/x-media3-cues");
                        a4.k = go4Var.t;
                        a4.T = this.c.C(go4Var);
                        go4Var = new go4(a4);
                    }
                    go4 go4Var2 = go4Var;
                    int i3 = i2 + 1;
                    String uri4 = ((at6) mo5Var3.get(i2)).a.toString();
                    qs6 qs6Var = new qs6();
                    ts6 ts6Var4 = new ts6();
                    List list3 = Collections.EMPTY_LIST;
                    ko5 ko5Var2 = mo5.b;
                    y79 y79Var = y79.e;
                    vs6 vs6Var = new vs6();
                    ys6 ys6Var3 = ys6.d;
                    Uri parse = uri4 == null ? uri : Uri.parse(uri4);
                    jte.p((ts6Var4.b == null || ts6Var4.a != null) ? z : i);
                    bt6 bt6Var3 = new bt6("", new ss6(qs6Var), parse != null ? new xs6(parse, null, ts6Var4.a != null ? new us6(ts6Var4) : uri, null, list3, null, y79Var, -9223372036854775807L) : uri, new ws6(vs6Var), jt6.M, ys6Var3);
                    bt6Var3.b.getClass();
                    rh0VarArr[i3] = new wu8(bt6Var3, lx6Var, h68Var, mx6Var.G(bt6Var3), k4fVar, TLObject.FLAG_20, go4Var2);
                }
                d = new b37(rh0VarArr);
            }
            ss6 ss6Var2 = bt6Var2.e;
            if (ss6Var2.b != 0 || ss6Var2.d != Long.MIN_VALUE || ss6Var2.f) {
                ry ryVar = new ry(d);
                ss6 ss6Var3 = bt6Var2.e;
                jte.p(!ryVar.b);
                ryVar.d = ss6Var3.a();
                jte.p(!ryVar.b);
                ryVar.b = z;
                d = new gk2(ryVar);
            }
            bt6Var2.b.getClass();
            if (bt6Var2.b.d == null) {
                return d;
            }
            ncd.f("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return d;
        } catch (ClassNotFoundException e) {
            dq9.o(e);
            return null;
        }
    }
}

package ma;

import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.telegram.tgnet.TLObject;
import pa.c0;
import pa.h1;
import pa.x;
import pa.x0;
import pa.y0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g {
    public static final c h = c.d;
    public static final p i = t.a;
    public static final q j = t.b;
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final g5.b c;
    public final pa.j d;
    public final List e;
    public final boolean f;
    public final c g;

    public g(oa.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        g5.b bVar = new g5.b(28, hashMap, arrayList4);
        this.c = bVar;
        this.f = true;
        this.g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        arrayList5.add(tVar == t.a ? pa.r.c : new pa.p(tVar, 1));
        arrayList5.add(fVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(h1.p);
        arrayList5.add(h1.g);
        arrayList5.add(h1.d);
        arrayList5.add(h1.e);
        arrayList5.add(h1.f);
        c0 c0Var = h1.k;
        arrayList5.add(new y0(Long.TYPE, Long.class, c0Var));
        arrayList5.add(new y0(Double.TYPE, Double.class, new d(0)));
        arrayList5.add(new y0(Float.TYPE, Float.class, new d(1)));
        arrayList5.add(tVar2 == t.b ? pa.q.b : new pa.p(new pa.q(tVar2), 0));
        arrayList5.add(h1.h);
        arrayList5.add(h1.i);
        arrayList5.add(new x0(AtomicLong.class, new e(c0Var, 0).nullSafe(), 0));
        int i10 = 0;
        arrayList5.add(new x0(AtomicLongArray.class, new e(c0Var, 1).nullSafe(), i10));
        arrayList5.add(h1.j);
        arrayList5.add(h1.l);
        arrayList5.add(h1.q);
        arrayList5.add(h1.r);
        arrayList5.add(new x0(BigDecimal.class, h1.m, i10));
        arrayList5.add(new x0(BigInteger.class, h1.n, i10));
        arrayList5.add(new x0(oa.h.class, h1.o, i10));
        arrayList5.add(h1.s);
        arrayList5.add(h1.t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.w);
        arrayList5.add(h1.y);
        arrayList5.add(h1.u);
        arrayList5.add(h1.b);
        arrayList5.add(pa.h.c);
        arrayList5.add(h1.x);
        if (sa.f.a) {
            arrayList5.add(sa.f.c);
            arrayList5.add(sa.f.b);
            arrayList5.add(sa.f.d);
        }
        arrayList5.add(pa.b.c);
        arrayList5.add(h1.a);
        arrayList5.add(new pa.d(bVar, 0));
        arrayList5.add(new pa.d(bVar, 1));
        pa.j jVar = new pa.j(bVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(bVar, fVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final u b(ta.a aVar) {
        boolean z10;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        u uVar = (u) concurrentHashMap.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            u uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
            z10 = false;
        }
        try {
            f fVar = new f();
            map.put(aVar, fVar);
            Iterator it = this.e.iterator();
            u uVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = ((v) it.next()).create(this, aVar);
                if (uVar3 != null) {
                    if (fVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    fVar.a = uVar3;
                    map.put(aVar, uVar3);
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (uVar3 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return uVar3;
            }
            throw new IllegalArgumentException("GSON (2.11.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r3 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r3 == r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u c(v vVar, ta.a aVar) {
        boolean z10;
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        pa.j jVar = this.d;
        jVar.getClass();
        ConcurrentHashMap concurrentHashMap = jVar.b;
        if (vVar != pa.j.c) {
            Class cls = aVar.a;
            v vVar2 = (v) concurrentHashMap.get(cls);
            if (vVar2 == null) {
                na.a aVar2 = (na.a) cls.getAnnotation(na.a.class);
                if (aVar2 != null) {
                    Class value = aVar2.value();
                    if (v.class.isAssignableFrom(value)) {
                        v vVar3 = (v) jVar.a.l(new ta.a(value)).f2();
                        v vVar4 = (v) concurrentHashMap.putIfAbsent(cls, vVar3);
                        if (vVar4 != null) {
                            vVar3 = vVar4;
                        }
                    }
                }
            }
            z10 = false;
            for (v vVar5 : this.e) {
                if (z10) {
                    u create = vVar5.create(this, aVar);
                    if (create != null) {
                        return create;
                    }
                } else if (vVar5 == vVar) {
                    z10 = true;
                }
            }
            if (z10) {
                return b(aVar);
            }
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
        }
        vVar = jVar;
        z10 = false;
        while (r0.hasNext()) {
        }
        if (z10) {
        }
    }

    public final ua.b d(Writer writer) {
        ua.b bVar = new ua.b(writer);
        bVar.k(this.g);
        bVar.r = this.f;
        bVar.l(2);
        bVar.v = false;
        return bVar;
    }

    public final String e(TLObject tLObject) {
        if (tLObject == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e9) {
                throw new j(e9);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new j(e10);
        }
    }

    public final void f(Object obj, Class cls, ua.b bVar) {
        u b10 = b(new ta.a(cls));
        int i10 = bVar.n;
        if (i10 == 2) {
            bVar.n = 1;
        }
        boolean z10 = bVar.r;
        boolean z11 = bVar.v;
        bVar.r = this.f;
        bVar.v = false;
        try {
            try {
                b10.write(bVar, obj);
            } catch (IOException e9) {
                throw new j(e9);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.r = z10;
            bVar.v = z11;
        }
    }

    public final void g(ua.b bVar) {
        k kVar = k.a;
        int i10 = bVar.n;
        boolean z10 = bVar.r;
        boolean z11 = bVar.v;
        bVar.r = this.f;
        bVar.v = false;
        if (i10 == 2) {
            bVar.n = 1;
        }
        try {
            try {
                try {
                    oa.d.l(kVar, bVar);
                } catch (IOException e9) {
                    throw new j(e9);
                }
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
            }
        } finally {
            bVar.l(i10);
            bVar.r = z10;
            bVar.v = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}

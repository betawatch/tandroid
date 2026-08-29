package na;

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
import qa.c0;
import qa.h1;
import qa.x;
import qa.x0;
import qa.y0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public static final c h = c.d;
    public static final p i = t.a;
    public static final q j = t.b;
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final oc.i c;
    public final qa.j d;
    public final List e;
    public final boolean f;
    public final c g;

    public g(pa.f fVar, HashMap hashMap, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, t tVar, t tVar2, ArrayList arrayList4) {
        oc.i iVar = new oc.i(19, hashMap, arrayList4);
        this.c = iVar;
        this.f = true;
        this.g = cVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(h1.A);
        arrayList5.add(tVar == t.a ? qa.r.c : new qa.p(tVar, 1));
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
        arrayList5.add(tVar2 == t.b ? qa.q.b : new qa.p(new qa.q(tVar2), 0));
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
        arrayList5.add(new x0(pa.h.class, h1.o, i10));
        arrayList5.add(h1.s);
        arrayList5.add(h1.t);
        arrayList5.add(h1.v);
        arrayList5.add(h1.w);
        arrayList5.add(h1.y);
        arrayList5.add(h1.u);
        arrayList5.add(h1.b);
        arrayList5.add(qa.h.c);
        arrayList5.add(h1.x);
        if (ta.f.a) {
            arrayList5.add(ta.f.c);
            arrayList5.add(ta.f.b);
            arrayList5.add(ta.f.d);
        }
        arrayList5.add(qa.b.c);
        arrayList5.add(h1.a);
        arrayList5.add(new qa.d(0, iVar));
        arrayList5.add(new qa.d(1, iVar));
        qa.j jVar = new qa.j(iVar);
        this.d = jVar;
        arrayList5.add(jVar);
        arrayList5.add(h1.B);
        arrayList5.add(new x(iVar, fVar, jVar, arrayList4));
        this.e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final u b(ua.a aVar) {
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
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
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
    public final u c(v vVar, ua.a aVar) {
        boolean z10;
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        qa.j jVar = this.d;
        jVar.getClass();
        ConcurrentHashMap concurrentHashMap = jVar.b;
        if (vVar != qa.j.c) {
            Class cls = aVar.a;
            v vVar2 = (v) concurrentHashMap.get(cls);
            if (vVar2 == null) {
                oa.a aVar2 = (oa.a) cls.getAnnotation(oa.a.class);
                if (aVar2 != null) {
                    Class value = aVar2.value();
                    if (v.class.isAssignableFrom(value)) {
                        v vVar3 = (v) jVar.a.d2(new ua.a(value)).p2();
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

    public final va.b d(Writer writer) {
        va.b bVar = new va.b(writer);
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
            } catch (IOException e10) {
                throw new j(e10);
            }
        }
        Class cls = tLObject.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            f(tLObject, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new j(e11);
        }
    }

    public final void f(Object obj, Class cls, va.b bVar) {
        u b10 = b(new ua.a(cls));
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
            } catch (IOException e10) {
                throw new j(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            bVar.l(i10);
            bVar.r = z10;
            bVar.v = z11;
        }
    }

    public final void g(va.b bVar) {
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
                    pa.d.l(kVar, bVar);
                } catch (IOException e10) {
                    throw new j(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
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

package a8;

import j$.util.Map;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class v implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ int a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ v(int i7) {
        this.a = i7;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:695)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static void b(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.v.b(java.util.Set):void");
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        int i7 = this.a;
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i7 = this.a;
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i7 = this.a;
        return Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            case 1:
                if (get(obj) != null) {
                }
                break;
            case 2:
                if (get(obj) != null) {
                }
                break;
            case 3:
                if (get(obj) != null) {
                }
                break;
            case 4:
                if (get(obj) != null) {
                }
                break;
            case 5:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.d;
                if (e0Var == null) {
                    e0 e0Var2 = new e0(1, ((f0) this).e);
                    this.d = e0Var2;
                    e0Var = e0Var2;
                }
                return e0Var.contains(obj);
            case 1:
                c8.q qVar = (c8.q) this.d;
                if (qVar == null) {
                    c8.q qVar2 = new c8.q(1, ((c8.r) this).e);
                    this.d = qVar2;
                    qVar = qVar2;
                }
                return qVar.contains(obj);
            case 2:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f);
                    this.d = o0Var2;
                    o0Var = o0Var2;
                }
                return o0Var.contains(obj);
            case 3:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f);
                    this.d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            case 4:
                w7.k kVar = (w7.k) this.d;
                if (kVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.k kVar2 = new w7.k(1, lVar.h, lVar.f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 5:
                y7.c cVar = (y7.c) this.d;
                if (cVar == null) {
                    y7.c cVar2 = new y7.c(1, ((y7.d) this).e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            default:
                z7.za zaVar = (z7.za) this.d;
                if (zaVar == null) {
                    z7.za zaVar2 = new z7.za(1, ((z7.ab) this).e);
                    this.d = zaVar2;
                    zaVar = zaVar2;
                }
                return zaVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.b;
                if (c0Var != null) {
                    return c0Var;
                }
                f0 f0Var = (f0) this;
                c0 c0Var2 = new c0(f0Var, f0Var.e);
                this.b = c0Var2;
                return c0Var2;
            case 1:
                c8.o oVar = (c8.o) this.b;
                if (oVar != null) {
                    return oVar;
                }
                c8.r rVar = (c8.r) this;
                c8.o oVar2 = new c8.o(rVar, rVar.e);
                this.b = oVar2;
                return oVar2;
            case 2:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.b;
                if (l0Var != null) {
                    return l0Var;
                }
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f, p0Var.h);
                this.b = l0Var2;
                return l0Var2;
            case 3:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar != null) {
                    return xVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                this.b = xVar2;
                return xVar2;
            case 4:
                w7.i iVar = (w7.i) this.b;
                if (iVar != null) {
                    return iVar;
                }
                w7.l lVar = (w7.l) this;
                w7.i iVar2 = new w7.i(lVar, lVar.f, lVar.h);
                this.b = iVar2;
                return iVar2;
            case 5:
                y7.a aVar = (y7.a) this.b;
                if (aVar != null) {
                    return aVar;
                }
                y7.d dVar = (y7.d) this;
                y7.a aVar2 = new y7.a(dVar, dVar.e);
                this.b = aVar2;
                return aVar2;
            default:
                z7.xa xaVar = (z7.xa) this.b;
                if (xaVar != null) {
                    return xaVar;
                }
                z7.ab abVar = (z7.ab) this;
                z7.xa xaVar2 = new z7.xa(abVar, abVar.e);
                this.b = xaVar2;
                return xaVar2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
            case 2:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
            case 3:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
            case 4:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
            case 5:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                }
                break;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        int i7 = this.a;
        Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            case 2:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
            case 3:
                Object obj6 = get(obj);
                return obj6 != null ? obj6 : obj2;
            case 4:
                Object obj7 = get(obj);
                return obj7 != null ? obj7 : obj2;
            case 5:
                Object obj8 = get(obj);
                return obj8 != null ? obj8 : obj2;
            default:
                Object obj9 = get(obj);
                return obj9 != null ? obj9 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.b;
                if (c0Var == null) {
                    f0 f0Var = (f0) this;
                    c0 c0Var2 = new c0(f0Var, f0Var.e);
                    this.b = c0Var2;
                    c0Var = c0Var2;
                }
                Iterator it = c0Var.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i7 += next != null ? next.hashCode() : 0;
                }
                return i7;
            case 1:
                c8.o oVar = (c8.o) this.b;
                if (oVar == null) {
                    c8.r rVar = (c8.r) this;
                    c8.o oVar2 = new c8.o(rVar, rVar.e);
                    this.b = oVar2;
                    oVar = oVar2;
                }
                Iterator it2 = oVar.iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i10 += next2 != null ? next2.hashCode() : 0;
                }
                return i10;
            case 2:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.b;
                if (l0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f, p0Var.h);
                    this.b = l0Var2;
                    l0Var = l0Var2;
                }
                Iterator it3 = l0Var.iterator();
                int i11 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i11 += next3 != null ? next3.hashCode() : 0;
                }
                return i11;
            case 3:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                    this.b = xVar2;
                    xVar = xVar2;
                }
                Iterator it4 = xVar.iterator();
                int i12 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i12 += next4 != null ? next4.hashCode() : 0;
                }
                return i12;
            case 4:
                w7.i iVar = (w7.i) this.b;
                if (iVar == null) {
                    w7.l lVar = (w7.l) this;
                    w7.i iVar2 = new w7.i(lVar, lVar.f, lVar.h);
                    this.b = iVar2;
                    iVar = iVar2;
                }
                Iterator it5 = iVar.iterator();
                int i13 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i13 += next5 != null ? next5.hashCode() : 0;
                }
                return i13;
            case 5:
                y7.a aVar = (y7.a) this.b;
                if (aVar == null) {
                    y7.d dVar = (y7.d) this;
                    y7.a aVar2 = new y7.a(dVar, dVar.e);
                    this.b = aVar2;
                    aVar = aVar2;
                }
                Iterator it6 = aVar.iterator();
                int i14 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i14 += next6 != null ? next6.hashCode() : 0;
                }
                return i14;
            default:
                z7.xa xaVar = (z7.xa) this.b;
                if (xaVar == null) {
                    z7.ab abVar = (z7.ab) this;
                    z7.xa xaVar2 = new z7.xa(abVar, abVar.e);
                    this.b = xaVar2;
                    xaVar = xaVar2;
                }
                Iterator it7 = xaVar.iterator();
                int i15 = 0;
                while (it7.hasNext()) {
                    Object next7 = it7.next();
                    i15 += next7 != null ? next7.hashCode() : 0;
                }
                return i15;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 2:
                if (((com.google.android.gms.internal.cast.p0) this).size() == 0) {
                }
                break;
            case 3:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                }
                break;
            case 4:
                if (((w7.l) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) this.c;
                if (d0Var != null) {
                    return d0Var;
                }
                f0 f0Var = (f0) this;
                d0 d0Var2 = new d0(f0Var, new e0(0, f0Var.e));
                this.c = d0Var2;
                return d0Var2;
            case 1:
                c8.p pVar = (c8.p) this.c;
                if (pVar != null) {
                    return pVar;
                }
                c8.r rVar = (c8.r) this;
                c8.p pVar2 = new c8.p(rVar, new c8.q(0, rVar.e));
                this.c = pVar2;
                return pVar2;
            case 2:
                com.google.android.gms.internal.cast.n0 n0Var = (com.google.android.gms.internal.cast.n0) this.c;
                if (n0Var != null) {
                    return n0Var;
                }
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                com.google.android.gms.internal.cast.n0 n0Var2 = new com.google.android.gms.internal.cast.n0(p0Var, new com.google.android.gms.internal.cast.o0(0, p0Var.h, p0Var.f));
                this.c = n0Var2;
                return n0Var2;
            case 3:
                com.google.android.gms.internal.play_billing.y yVar = (com.google.android.gms.internal.play_billing.y) this.c;
                if (yVar != null) {
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.y yVar2 = new com.google.android.gms.internal.play_billing.y(a0Var, new com.google.android.gms.internal.play_billing.z(0, a0Var.h, a0Var.f));
                this.c = yVar2;
                return yVar2;
            case 4:
                w7.j jVar = (w7.j) this.c;
                if (jVar != null) {
                    return jVar;
                }
                w7.l lVar = (w7.l) this;
                w7.j jVar2 = new w7.j(lVar, new w7.k(0, lVar.h, lVar.f));
                this.c = jVar2;
                return jVar2;
            case 5:
                y7.b bVar = (y7.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                y7.d dVar = (y7.d) this;
                y7.b bVar2 = new y7.b(dVar, new y7.c(0, dVar.e));
                this.c = bVar2;
                return bVar2;
            default:
                z7.ya yaVar = (z7.ya) this.c;
                if (yaVar != null) {
                    return yaVar;
                }
                z7.ab abVar = (z7.ab) this;
                z7.ya yaVar2 = new z7.ya(abVar, new z7.za(0, abVar.e));
                this.c = yaVar2;
                return yaVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i7 = this.a;
        return Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        int i7 = this.a;
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i7 = this.a;
        return Map.-CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i7 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i7 = this.a;
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                boolean z9 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((c0) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z9) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z9 = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 1:
                boolean z10 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((c8.o) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z10) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z10 = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 2:
                int i7 = ((com.google.android.gms.internal.cast.p0) this).h;
                if (i7 < 0) {
                    throw new IllegalArgumentException(jg.g.j(i7, "size cannot be negative but was: "));
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
                sb4.append('{');
                Iterator it3 = ((com.google.android.gms.internal.cast.l0) entrySet()).iterator();
                boolean z11 = true;
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z11) {
                        sb4.append(", ");
                    }
                    sb4.append(entry3.getKey());
                    sb4.append('=');
                    sb4.append(entry3.getValue());
                    z11 = false;
                }
                sb4.append('}');
                return sb4.toString();
            case 3:
                int i10 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i10 < 0) {
                    throw new IllegalArgumentException(jg.g.j(i10, "size cannot be negative but was: "));
                }
                StringBuilder sb5 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                sb5.append('{');
                Iterator it4 = ((com.google.android.gms.internal.play_billing.x) entrySet()).iterator();
                boolean z12 = true;
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z12) {
                        sb5.append(", ");
                    }
                    sb5.append(entry4.getKey());
                    sb5.append('=');
                    sb5.append(entry4.getValue());
                    z12 = false;
                }
                sb5.append('}');
                return sb5.toString();
            case 4:
                int i11 = ((w7.l) this).h;
                if (i11 < 0) {
                    throw new IllegalArgumentException(jg.g.j(i11, "size cannot be negative but was: "));
                }
                StringBuilder sb6 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
                sb6.append('{');
                Iterator it5 = ((w7.i) entrySet()).iterator();
                boolean z13 = true;
                while (it5.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it5.next();
                    if (!z13) {
                        sb6.append(", ");
                    }
                    sb6.append(entry5.getKey());
                    sb6.append('=');
                    sb6.append(entry5.getValue());
                    z13 = false;
                }
                sb6.append('}');
                return sb6.toString();
            case 5:
                boolean z14 = true;
                StringBuilder sb7 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb7.append('{');
                Iterator it6 = ((y7.a) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z14) {
                        sb7.append(", ");
                    }
                    sb7.append(entry6.getKey());
                    sb7.append('=');
                    sb7.append(entry6.getValue());
                    z14 = false;
                }
                sb7.append('}');
                return sb7.toString();
            default:
                boolean z15 = true;
                StringBuilder sb8 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb8.append('{');
                Iterator it7 = ((z7.xa) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z15) {
                        sb8.append(", ");
                    }
                    sb8.append(entry7.getKey());
                    sb8.append('=');
                    sb8.append(entry7.getValue());
                    z15 = false;
                }
                sb8.append('}');
                return sb8.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.d;
                if (e0Var != null) {
                    return e0Var;
                }
                e0 e0Var2 = new e0(1, ((f0) this).e);
                this.d = e0Var2;
                return e0Var2;
            case 1:
                c8.q qVar = (c8.q) this.d;
                if (qVar != null) {
                    return qVar;
                }
                c8.q qVar2 = new c8.q(1, ((c8.r) this).e);
                this.d = qVar2;
                return qVar2;
            case 2:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var != null) {
                    return o0Var;
                }
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f);
                this.d = o0Var2;
                return o0Var2;
            case 3:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar != null) {
                    return zVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f);
                this.d = zVar2;
                return zVar2;
            case 4:
                w7.k kVar = (w7.k) this.d;
                if (kVar != null) {
                    return kVar;
                }
                w7.l lVar = (w7.l) this;
                w7.k kVar2 = new w7.k(1, lVar.h, lVar.f);
                this.d = kVar2;
                return kVar2;
            case 5:
                y7.c cVar = (y7.c) this.d;
                if (cVar != null) {
                    return cVar;
                }
                y7.c cVar2 = new y7.c(1, ((y7.d) this).e);
                this.d = cVar2;
                return cVar2;
            default:
                z7.za zaVar = (z7.za) this.d;
                if (zaVar != null) {
                    return zaVar;
                }
                z7.za zaVar2 = new z7.za(1, ((z7.ab) this).e);
                this.d = zaVar2;
                return zaVar2;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        int i7 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }
}

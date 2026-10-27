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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class m implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ int a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ m(int i10) {
        this.a = i10;
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
    public static void a(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.m.a(java.util.Set):void");
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
        int i10 = this.a;
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i10 = this.a;
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i10 = this.a;
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
                v vVar = (v) this.d;
                if (vVar == null) {
                    v vVar2 = new v(1, ((w) this).e);
                    this.d = vVar2;
                    vVar = vVar2;
                }
                return vVar.contains(obj);
            case 1:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f);
                    this.d = o0Var2;
                    o0Var = o0Var2;
                }
                return o0Var.contains(obj);
            case 2:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f);
                    this.d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            case 3:
                u7.k kVar = (u7.k) this.d;
                if (kVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.k kVar2 = new u7.k(1, lVar.h, lVar.f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 4:
                w7.c cVar = (w7.c) this.d;
                if (cVar == null) {
                    w7.c cVar2 = new w7.c(1, ((w7.d) this).e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            case 5:
                x7.za zaVar = (x7.za) this.d;
                if (zaVar == null) {
                    x7.za zaVar2 = new x7.za(1, ((x7.ab) this).e);
                    this.d = zaVar2;
                    zaVar = zaVar2;
                }
                return zaVar.contains(obj);
            default:
                y7.v vVar3 = (y7.v) this.d;
                if (vVar3 == null) {
                    y7.v vVar4 = new y7.v(1, ((y7.w) this).e);
                    this.d = vVar4;
                    vVar3 = vVar4;
                }
                return vVar3.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                if (tVar != null) {
                    return tVar;
                }
                w wVar = (w) this;
                t tVar2 = new t(wVar, wVar.e);
                this.b = tVar2;
                return tVar2;
            case 1:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.b;
                if (l0Var != null) {
                    return l0Var;
                }
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f, p0Var.h);
                this.b = l0Var2;
                return l0Var2;
            case 2:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar != null) {
                    return xVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                this.b = xVar2;
                return xVar2;
            case 3:
                u7.i iVar = (u7.i) this.b;
                if (iVar != null) {
                    return iVar;
                }
                u7.l lVar = (u7.l) this;
                u7.i iVar2 = new u7.i(lVar, lVar.f, lVar.h);
                this.b = iVar2;
                return iVar2;
            case 4:
                w7.a aVar = (w7.a) this.b;
                if (aVar != null) {
                    return aVar;
                }
                w7.d dVar = (w7.d) this;
                w7.a aVar2 = new w7.a(dVar, dVar.e);
                this.b = aVar2;
                return aVar2;
            case 5:
                x7.xa xaVar = (x7.xa) this.b;
                if (xaVar != null) {
                    return xaVar;
                }
                x7.ab abVar = (x7.ab) this;
                x7.xa xaVar2 = new x7.xa(abVar, abVar.e);
                this.b = xaVar2;
                return xaVar2;
            default:
                y7.t tVar3 = (y7.t) this.b;
                if (tVar3 != null) {
                    return tVar3;
                }
                y7.w wVar2 = (y7.w) this;
                y7.t tVar4 = new y7.t(wVar2, wVar2.e);
                this.b = tVar4;
                return tVar4;
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
        int i10 = this.a;
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
                t tVar = (t) this.b;
                if (tVar == null) {
                    w wVar = (w) this;
                    t tVar2 = new t(wVar, wVar.e);
                    this.b = tVar2;
                    tVar = tVar2;
                }
                Iterator it = tVar.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i10 += next != null ? next.hashCode() : 0;
                }
                return i10;
            case 1:
                com.google.android.gms.internal.cast.l0 l0Var = (com.google.android.gms.internal.cast.l0) this.b;
                if (l0Var == null) {
                    com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                    com.google.android.gms.internal.cast.l0 l0Var2 = new com.google.android.gms.internal.cast.l0(p0Var, p0Var.f, p0Var.h);
                    this.b = l0Var2;
                    l0Var = l0Var2;
                }
                Iterator it2 = l0Var.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i11 += next2 != null ? next2.hashCode() : 0;
                }
                return i11;
            case 2:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                    this.b = xVar2;
                    xVar = xVar2;
                }
                Iterator it3 = xVar.iterator();
                int i12 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i12 += next3 != null ? next3.hashCode() : 0;
                }
                return i12;
            case 3:
                u7.i iVar = (u7.i) this.b;
                if (iVar == null) {
                    u7.l lVar = (u7.l) this;
                    u7.i iVar2 = new u7.i(lVar, lVar.f, lVar.h);
                    this.b = iVar2;
                    iVar = iVar2;
                }
                Iterator it4 = iVar.iterator();
                int i13 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i13 += next4 != null ? next4.hashCode() : 0;
                }
                return i13;
            case 4:
                w7.a aVar = (w7.a) this.b;
                if (aVar == null) {
                    w7.d dVar = (w7.d) this;
                    w7.a aVar2 = new w7.a(dVar, dVar.e);
                    this.b = aVar2;
                    aVar = aVar2;
                }
                Iterator it5 = aVar.iterator();
                int i14 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i14 += next5 != null ? next5.hashCode() : 0;
                }
                return i14;
            case 5:
                x7.xa xaVar = (x7.xa) this.b;
                if (xaVar == null) {
                    x7.ab abVar = (x7.ab) this;
                    x7.xa xaVar2 = new x7.xa(abVar, abVar.e);
                    this.b = xaVar2;
                    xaVar = xaVar2;
                }
                Iterator it6 = xaVar.iterator();
                int i15 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i15 += next6 != null ? next6.hashCode() : 0;
                }
                return i15;
            default:
                y7.t tVar3 = (y7.t) this.b;
                if (tVar3 == null) {
                    y7.w wVar2 = (y7.w) this;
                    y7.t tVar4 = new y7.t(wVar2, wVar2.e);
                    this.b = tVar4;
                    tVar3 = tVar4;
                }
                Iterator it7 = tVar3.iterator();
                int i16 = 0;
                while (it7.hasNext()) {
                    Object next7 = it7.next();
                    i16 += next7 != null ? next7.hashCode() : 0;
                }
                return i16;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 1:
                if (((com.google.android.gms.internal.cast.p0) this).size() == 0) {
                }
                break;
            case 2:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                }
                break;
            case 3:
                if (((u7.l) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                if (uVar != null) {
                    return uVar;
                }
                w wVar = (w) this;
                u uVar2 = new u(wVar, new v(0, wVar.e));
                this.c = uVar2;
                return uVar2;
            case 1:
                com.google.android.gms.internal.cast.n0 n0Var = (com.google.android.gms.internal.cast.n0) this.c;
                if (n0Var != null) {
                    return n0Var;
                }
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                com.google.android.gms.internal.cast.n0 n0Var2 = new com.google.android.gms.internal.cast.n0(p0Var, new com.google.android.gms.internal.cast.o0(0, p0Var.h, p0Var.f));
                this.c = n0Var2;
                return n0Var2;
            case 2:
                com.google.android.gms.internal.play_billing.y yVar = (com.google.android.gms.internal.play_billing.y) this.c;
                if (yVar != null) {
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.y yVar2 = new com.google.android.gms.internal.play_billing.y(a0Var, new com.google.android.gms.internal.play_billing.z(0, a0Var.h, a0Var.f));
                this.c = yVar2;
                return yVar2;
            case 3:
                u7.j jVar = (u7.j) this.c;
                if (jVar != null) {
                    return jVar;
                }
                u7.l lVar = (u7.l) this;
                u7.j jVar2 = new u7.j(lVar, new u7.k(0, lVar.h, lVar.f));
                this.c = jVar2;
                return jVar2;
            case 4:
                w7.b bVar = (w7.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                w7.d dVar = (w7.d) this;
                w7.b bVar2 = new w7.b(dVar, new w7.c(0, dVar.e));
                this.c = bVar2;
                return bVar2;
            case 5:
                x7.ya yaVar = (x7.ya) this.c;
                if (yaVar != null) {
                    return yaVar;
                }
                x7.ab abVar = (x7.ab) this;
                x7.ya yaVar2 = new x7.ya(abVar, new x7.za(0, abVar.e));
                this.c = yaVar2;
                return yaVar2;
            default:
                y7.u uVar3 = (y7.u) this.c;
                if (uVar3 != null) {
                    return uVar3;
                }
                y7.w wVar2 = (y7.w) this;
                y7.u uVar4 = new y7.u(wVar2, new y7.v(0, wVar2.e));
                this.c = uVar4;
                return uVar4;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10 = this.a;
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
        int i10 = this.a;
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i10 = this.a;
        return Map.-CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i10 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i10 = this.a;
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                boolean z10 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((t) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z10) {
                        sb2.append(", ");
                    }
                    sb2.append(entry.getKey());
                    sb2.append('=');
                    sb2.append(entry.getValue());
                    z10 = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 1:
                int i10 = ((com.google.android.gms.internal.cast.p0) this).h;
                if (i10 < 0) {
                    throw new IllegalArgumentException(ic.a.i(i10, "size cannot be negative but was: "));
                }
                StringBuilder sb3 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((com.google.android.gms.internal.cast.l0) entrySet()).iterator();
                boolean z11 = true;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z11) {
                        sb3.append(", ");
                    }
                    sb3.append(entry2.getKey());
                    sb3.append('=');
                    sb3.append(entry2.getValue());
                    z11 = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 2:
                int i11 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i11 < 0) {
                    throw new IllegalArgumentException(ic.a.i(i11, "size cannot be negative but was: "));
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
                sb4.append('{');
                Iterator it3 = ((com.google.android.gms.internal.play_billing.x) entrySet()).iterator();
                boolean z12 = true;
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z12) {
                        sb4.append(", ");
                    }
                    sb4.append(entry3.getKey());
                    sb4.append('=');
                    sb4.append(entry3.getValue());
                    z12 = false;
                }
                sb4.append('}');
                return sb4.toString();
            case 3:
                int i12 = ((u7.l) this).h;
                if (i12 < 0) {
                    throw new IllegalArgumentException(ic.a.i(i12, "size cannot be negative but was: "));
                }
                StringBuilder sb5 = new StringBuilder((int) Math.min(i12 * 8, 1073741824L));
                sb5.append('{');
                Iterator it4 = ((u7.i) entrySet()).iterator();
                boolean z13 = true;
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z13) {
                        sb5.append(", ");
                    }
                    sb5.append(entry4.getKey());
                    sb5.append('=');
                    sb5.append(entry4.getValue());
                    z13 = false;
                }
                sb5.append('}');
                return sb5.toString();
            case 4:
                boolean z14 = true;
                StringBuilder sb6 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb6.append('{');
                Iterator it5 = ((w7.a) entrySet()).iterator();
                while (it5.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it5.next();
                    if (!z14) {
                        sb6.append(", ");
                    }
                    sb6.append(entry5.getKey());
                    sb6.append('=');
                    sb6.append(entry5.getValue());
                    z14 = false;
                }
                sb6.append('}');
                return sb6.toString();
            case 5:
                boolean z15 = true;
                StringBuilder sb7 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb7.append('{');
                Iterator it6 = ((x7.xa) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z15) {
                        sb7.append(", ");
                    }
                    sb7.append(entry6.getKey());
                    sb7.append('=');
                    sb7.append(entry6.getValue());
                    z15 = false;
                }
                sb7.append('}');
                return sb7.toString();
            default:
                boolean z16 = true;
                StringBuilder sb8 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb8.append('{');
                Iterator it7 = ((y7.t) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z16) {
                        sb8.append(", ");
                    }
                    sb8.append(entry7.getKey());
                    sb8.append('=');
                    sb8.append(entry7.getValue());
                    z16 = false;
                }
                sb8.append('}');
                return sb8.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                v vVar = (v) this.d;
                if (vVar != null) {
                    return vVar;
                }
                v vVar2 = new v(1, ((w) this).e);
                this.d = vVar2;
                return vVar2;
            case 1:
                com.google.android.gms.internal.cast.o0 o0Var = (com.google.android.gms.internal.cast.o0) this.d;
                if (o0Var != null) {
                    return o0Var;
                }
                com.google.android.gms.internal.cast.p0 p0Var = (com.google.android.gms.internal.cast.p0) this;
                com.google.android.gms.internal.cast.o0 o0Var2 = new com.google.android.gms.internal.cast.o0(1, p0Var.h, p0Var.f);
                this.d = o0Var2;
                return o0Var2;
            case 2:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar != null) {
                    return zVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f);
                this.d = zVar2;
                return zVar2;
            case 3:
                u7.k kVar = (u7.k) this.d;
                if (kVar != null) {
                    return kVar;
                }
                u7.l lVar = (u7.l) this;
                u7.k kVar2 = new u7.k(1, lVar.h, lVar.f);
                this.d = kVar2;
                return kVar2;
            case 4:
                w7.c cVar = (w7.c) this.d;
                if (cVar != null) {
                    return cVar;
                }
                w7.c cVar2 = new w7.c(1, ((w7.d) this).e);
                this.d = cVar2;
                return cVar2;
            case 5:
                x7.za zaVar = (x7.za) this.d;
                if (zaVar != null) {
                    return zaVar;
                }
                x7.za zaVar2 = new x7.za(1, ((x7.ab) this).e);
                this.d = zaVar2;
                return zaVar2;
            default:
                y7.v vVar3 = (y7.v) this.d;
                if (vVar3 != null) {
                    return vVar3;
                }
                y7.v vVar4 = new y7.v(1, ((y7.w) this).e);
                this.d = vVar4;
                return vVar4;
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
        int i10 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }
}

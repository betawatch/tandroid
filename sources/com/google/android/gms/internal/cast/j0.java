package com.google.android.gms.internal.cast;

import g7.va;
import g7.wa;
import g7.xa;
import g7.ya;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j0 implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ int a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ j0(int i9) {
        this.a = i9;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v6 short[], r4v11 ??, r4v7 ??, r4v8 byte[], r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:553)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static void a(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.j0.a(java.util.Set):void");
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
        int i9 = this.a;
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i9 = this.a;
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i9 = this.a;
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
                r0 r0Var = (r0) this.d;
                if (r0Var == null) {
                    s0 s0Var = (s0) this;
                    r0 r0Var2 = new r0(1, s0Var.h, s0Var.f);
                    this.d = r0Var2;
                    r0Var = r0Var2;
                }
                return r0Var.contains(obj);
            case 1:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f);
                    this.d = zVar2;
                    zVar = zVar2;
                }
                return zVar.contains(obj);
            case 2:
                d7.k kVar = (d7.k) this.d;
                if (kVar == null) {
                    d7.l lVar = (d7.l) this;
                    d7.k kVar2 = new d7.k(1, lVar.h, lVar.f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 3:
                f7.c cVar = (f7.c) this.d;
                if (cVar == null) {
                    f7.c cVar2 = new f7.c(1, ((f7.d) this).e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            case 4:
                xa xaVar = (xa) this.d;
                if (xaVar == null) {
                    xa xaVar2 = new xa(1, ((ya) this).e);
                    this.d = xaVar2;
                    xaVar = xaVar2;
                }
                return xaVar.contains(obj);
            case 5:
                h7.a0 a0Var2 = (h7.a0) this.d;
                if (a0Var2 == null) {
                    h7.a0 a0Var3 = new h7.a0(1, ((h7.b0) this).e);
                    this.d = a0Var3;
                    a0Var2 = a0Var3;
                }
                return a0Var2.contains(obj);
            default:
                j7.q qVar = (j7.q) this.d;
                if (qVar == null) {
                    j7.q qVar2 = new j7.q(1, ((j7.r) this).e);
                    this.d = qVar2;
                    qVar = qVar2;
                }
                return qVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                if (o0Var != null) {
                    return o0Var;
                }
                s0 s0Var = (s0) this;
                o0 o0Var2 = new o0(s0Var, s0Var.f, s0Var.h);
                this.b = o0Var2;
                return o0Var2;
            case 1:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar != null) {
                    return xVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                this.b = xVar2;
                return xVar2;
            case 2:
                d7.i iVar = (d7.i) this.b;
                if (iVar != null) {
                    return iVar;
                }
                d7.l lVar = (d7.l) this;
                d7.i iVar2 = new d7.i(lVar, lVar.f, lVar.h);
                this.b = iVar2;
                return iVar2;
            case 3:
                f7.a aVar = (f7.a) this.b;
                if (aVar != null) {
                    return aVar;
                }
                f7.d dVar = (f7.d) this;
                f7.a aVar2 = new f7.a(dVar, dVar.e);
                this.b = aVar2;
                return aVar2;
            case 4:
                va vaVar = (va) this.b;
                if (vaVar != null) {
                    return vaVar;
                }
                ya yaVar = (ya) this;
                va vaVar2 = new va(yaVar, yaVar.e);
                this.b = vaVar2;
                return vaVar2;
            case 5:
                h7.y yVar = (h7.y) this.b;
                if (yVar != null) {
                    return yVar;
                }
                h7.b0 b0Var = (h7.b0) this;
                h7.y yVar2 = new h7.y(b0Var, b0Var.e);
                this.b = yVar2;
                return yVar2;
            default:
                j7.o oVar = (j7.o) this.b;
                if (oVar != null) {
                    return oVar;
                }
                j7.r rVar = (j7.r) this;
                j7.o oVar2 = new j7.o(rVar, rVar.e);
                this.b = oVar2;
                return oVar2;
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
        int i9 = this.a;
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
                o0 o0Var = (o0) this.b;
                if (o0Var == null) {
                    s0 s0Var = (s0) this;
                    o0 o0Var2 = new o0(s0Var, s0Var.f, s0Var.h);
                    this.b = o0Var2;
                    o0Var = o0Var2;
                }
                Iterator it = o0Var.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i9 += next != null ? next.hashCode() : 0;
                }
                return i9;
            case 1:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                    this.b = xVar2;
                    xVar = xVar2;
                }
                Iterator it2 = xVar.iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i10 += next2 != null ? next2.hashCode() : 0;
                }
                return i10;
            case 2:
                d7.i iVar = (d7.i) this.b;
                if (iVar == null) {
                    d7.l lVar = (d7.l) this;
                    d7.i iVar2 = new d7.i(lVar, lVar.f, lVar.h);
                    this.b = iVar2;
                    iVar = iVar2;
                }
                Iterator it3 = iVar.iterator();
                int i11 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i11 += next3 != null ? next3.hashCode() : 0;
                }
                return i11;
            case 3:
                f7.a aVar = (f7.a) this.b;
                if (aVar == null) {
                    f7.d dVar = (f7.d) this;
                    f7.a aVar2 = new f7.a(dVar, dVar.e);
                    this.b = aVar2;
                    aVar = aVar2;
                }
                Iterator it4 = aVar.iterator();
                int i12 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i12 += next4 != null ? next4.hashCode() : 0;
                }
                return i12;
            case 4:
                va vaVar = (va) this.b;
                if (vaVar == null) {
                    ya yaVar = (ya) this;
                    va vaVar2 = new va(yaVar, yaVar.e);
                    this.b = vaVar2;
                    vaVar = vaVar2;
                }
                Iterator it5 = vaVar.iterator();
                int i13 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i13 += next5 != null ? next5.hashCode() : 0;
                }
                return i13;
            case 5:
                h7.y yVar = (h7.y) this.b;
                if (yVar == null) {
                    h7.b0 b0Var = (h7.b0) this;
                    h7.y yVar2 = new h7.y(b0Var, b0Var.e);
                    this.b = yVar2;
                    yVar = yVar2;
                }
                Iterator it6 = yVar.iterator();
                int i14 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i14 += next6 != null ? next6.hashCode() : 0;
                }
                return i14;
            default:
                j7.o oVar = (j7.o) this.b;
                if (oVar == null) {
                    j7.r rVar = (j7.r) this;
                    j7.o oVar2 = new j7.o(rVar, rVar.e);
                    this.b = oVar2;
                    oVar = oVar2;
                }
                Iterator it7 = oVar.iterator();
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
            case 0:
                if (((s0) this).size() == 0) {
                }
                break;
            case 1:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                }
                break;
            case 2:
                if (((d7.l) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.c;
                if (q0Var != null) {
                    return q0Var;
                }
                s0 s0Var = (s0) this;
                q0 q0Var2 = new q0(s0Var, new r0(0, s0Var.h, s0Var.f));
                this.c = q0Var2;
                return q0Var2;
            case 1:
                com.google.android.gms.internal.play_billing.y yVar = (com.google.android.gms.internal.play_billing.y) this.c;
                if (yVar != null) {
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.y yVar2 = new com.google.android.gms.internal.play_billing.y(a0Var, new com.google.android.gms.internal.play_billing.z(0, a0Var.h, a0Var.f));
                this.c = yVar2;
                return yVar2;
            case 2:
                d7.j jVar = (d7.j) this.c;
                if (jVar != null) {
                    return jVar;
                }
                d7.l lVar = (d7.l) this;
                d7.j jVar2 = new d7.j(lVar, new d7.k(0, lVar.h, lVar.f));
                this.c = jVar2;
                return jVar2;
            case 3:
                f7.b bVar = (f7.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                f7.d dVar = (f7.d) this;
                f7.b bVar2 = new f7.b(dVar, new f7.c(0, dVar.e));
                this.c = bVar2;
                return bVar2;
            case 4:
                wa waVar = (wa) this.c;
                if (waVar != null) {
                    return waVar;
                }
                ya yaVar = (ya) this;
                wa waVar2 = new wa(yaVar, new xa(0, yaVar.e));
                this.c = waVar2;
                return waVar2;
            case 5:
                h7.z zVar = (h7.z) this.c;
                if (zVar != null) {
                    return zVar;
                }
                h7.b0 b0Var = (h7.b0) this;
                h7.z zVar2 = new h7.z(b0Var, new h7.a0(0, b0Var.e));
                this.c = zVar2;
                return zVar2;
            default:
                j7.p pVar = (j7.p) this.c;
                if (pVar != null) {
                    return pVar;
                }
                j7.r rVar = (j7.r) this;
                j7.p pVar2 = new j7.p(rVar, new j7.q(0, rVar.e));
                this.c = pVar2;
                return pVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i9 = this.a;
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
        int i9 = this.a;
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        int i9 = this.a;
        return Map.-CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i9 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        int i9 = this.a;
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i9 = ((s0) this).h;
                if (i9 < 0) {
                    throw new IllegalArgumentException(j3.r0.l(i9, "size cannot be negative but was: "));
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((o0) entrySet()).iterator();
                boolean z10 = true;
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
                int i10 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i10 < 0) {
                    throw new IllegalArgumentException(j3.r0.l(i10, "size cannot be negative but was: "));
                }
                StringBuilder sb3 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                sb3.append('{');
                Iterator it2 = ((com.google.android.gms.internal.play_billing.x) entrySet()).iterator();
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
                int i11 = ((d7.l) this).h;
                if (i11 < 0) {
                    throw new IllegalArgumentException(j3.r0.l(i11, "size cannot be negative but was: "));
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
                sb4.append('{');
                Iterator it3 = ((d7.i) entrySet()).iterator();
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
                boolean z13 = true;
                StringBuilder sb5 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb5.append('{');
                Iterator it4 = ((f7.a) entrySet()).iterator();
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
                Iterator it5 = ((va) entrySet()).iterator();
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
                Iterator it6 = ((h7.y) entrySet()).iterator();
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
                Iterator it7 = ((j7.o) entrySet()).iterator();
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
                r0 r0Var = (r0) this.d;
                if (r0Var != null) {
                    return r0Var;
                }
                s0 s0Var = (s0) this;
                r0 r0Var2 = new r0(1, s0Var.h, s0Var.f);
                this.d = r0Var2;
                return r0Var2;
            case 1:
                com.google.android.gms.internal.play_billing.z zVar = (com.google.android.gms.internal.play_billing.z) this.d;
                if (zVar != null) {
                    return zVar;
                }
                com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                com.google.android.gms.internal.play_billing.z zVar2 = new com.google.android.gms.internal.play_billing.z(1, a0Var.h, a0Var.f);
                this.d = zVar2;
                return zVar2;
            case 2:
                d7.k kVar = (d7.k) this.d;
                if (kVar != null) {
                    return kVar;
                }
                d7.l lVar = (d7.l) this;
                d7.k kVar2 = new d7.k(1, lVar.h, lVar.f);
                this.d = kVar2;
                return kVar2;
            case 3:
                f7.c cVar = (f7.c) this.d;
                if (cVar != null) {
                    return cVar;
                }
                f7.c cVar2 = new f7.c(1, ((f7.d) this).e);
                this.d = cVar2;
                return cVar2;
            case 4:
                xa xaVar = (xa) this.d;
                if (xaVar != null) {
                    return xaVar;
                }
                xa xaVar2 = new xa(1, ((ya) this).e);
                this.d = xaVar2;
                return xaVar2;
            case 5:
                h7.a0 a0Var2 = (h7.a0) this.d;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                h7.a0 a0Var3 = new h7.a0(1, ((h7.b0) this).e);
                this.d = a0Var3;
                return a0Var3;
            default:
                j7.q qVar = (j7.q) this.d;
                if (qVar != null) {
                    return qVar;
                }
                j7.q qVar2 = new j7.q(1, ((j7.r) this).e);
                this.d = qVar2;
                return qVar2;
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
        int i9 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }
}

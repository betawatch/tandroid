package com.google.android.gms.internal.cast;

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
import k7.va;
import k7.wa;
import k7.xa;
import k7.ya;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i0 implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ int a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ i0(int i10) {
        this.a = i10;
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
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.i0.a(java.util.Set):void");
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
                q0 q0Var = (q0) this.d;
                if (q0Var == null) {
                    r0 r0Var = (r0) this;
                    q0 q0Var2 = new q0(1, r0Var.h, r0Var.f);
                    this.d = q0Var2;
                    q0Var = q0Var2;
                }
                return q0Var.contains(obj);
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
                h7.k kVar = (h7.k) this.d;
                if (kVar == null) {
                    h7.l lVar = (h7.l) this;
                    h7.k kVar2 = new h7.k(1, lVar.h, lVar.f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 3:
                j7.c cVar = (j7.c) this.d;
                if (cVar == null) {
                    j7.c cVar2 = new j7.c(1, ((j7.d) this).e);
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
                l7.a0 a0Var2 = (l7.a0) this.d;
                if (a0Var2 == null) {
                    l7.a0 a0Var3 = new l7.a0(1, ((l7.b0) this).e);
                    this.d = a0Var3;
                    a0Var2 = a0Var3;
                }
                return a0Var2.contains(obj);
            default:
                n7.q qVar = (n7.q) this.d;
                if (qVar == null) {
                    n7.q qVar2 = new n7.q(1, ((n7.r) this).e);
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
                n0 n0Var = (n0) this.b;
                if (n0Var != null) {
                    return n0Var;
                }
                r0 r0Var = (r0) this;
                n0 n0Var2 = new n0(r0Var, r0Var.f, r0Var.h);
                this.b = n0Var2;
                return n0Var2;
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
                h7.i iVar = (h7.i) this.b;
                if (iVar != null) {
                    return iVar;
                }
                h7.l lVar = (h7.l) this;
                h7.i iVar2 = new h7.i(lVar, lVar.f, lVar.h);
                this.b = iVar2;
                return iVar2;
            case 3:
                j7.a aVar = (j7.a) this.b;
                if (aVar != null) {
                    return aVar;
                }
                j7.d dVar = (j7.d) this;
                j7.a aVar2 = new j7.a(dVar, dVar.e);
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
                l7.y yVar = (l7.y) this.b;
                if (yVar != null) {
                    return yVar;
                }
                l7.b0 b0Var = (l7.b0) this;
                l7.y yVar2 = new l7.y(b0Var, b0Var.e);
                this.b = yVar2;
                return yVar2;
            default:
                n7.o oVar = (n7.o) this.b;
                if (oVar != null) {
                    return oVar;
                }
                n7.r rVar = (n7.r) this;
                n7.o oVar2 = new n7.o(rVar, rVar.e);
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
                n0 n0Var = (n0) this.b;
                if (n0Var == null) {
                    r0 r0Var = (r0) this;
                    n0 n0Var2 = new n0(r0Var, r0Var.f, r0Var.h);
                    this.b = n0Var2;
                    n0Var = n0Var2;
                }
                Iterator it = n0Var.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i10 += next != null ? next.hashCode() : 0;
                }
                return i10;
            case 1:
                com.google.android.gms.internal.play_billing.x xVar = (com.google.android.gms.internal.play_billing.x) this.b;
                if (xVar == null) {
                    com.google.android.gms.internal.play_billing.a0 a0Var = (com.google.android.gms.internal.play_billing.a0) this;
                    com.google.android.gms.internal.play_billing.x xVar2 = new com.google.android.gms.internal.play_billing.x(a0Var, a0Var.f, a0Var.h);
                    this.b = xVar2;
                    xVar = xVar2;
                }
                Iterator it2 = xVar.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i11 += next2 != null ? next2.hashCode() : 0;
                }
                return i11;
            case 2:
                h7.i iVar = (h7.i) this.b;
                if (iVar == null) {
                    h7.l lVar = (h7.l) this;
                    h7.i iVar2 = new h7.i(lVar, lVar.f, lVar.h);
                    this.b = iVar2;
                    iVar = iVar2;
                }
                Iterator it3 = iVar.iterator();
                int i12 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i12 += next3 != null ? next3.hashCode() : 0;
                }
                return i12;
            case 3:
                j7.a aVar = (j7.a) this.b;
                if (aVar == null) {
                    j7.d dVar = (j7.d) this;
                    j7.a aVar2 = new j7.a(dVar, dVar.e);
                    this.b = aVar2;
                    aVar = aVar2;
                }
                Iterator it4 = aVar.iterator();
                int i13 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i13 += next4 != null ? next4.hashCode() : 0;
                }
                return i13;
            case 4:
                va vaVar = (va) this.b;
                if (vaVar == null) {
                    ya yaVar = (ya) this;
                    va vaVar2 = new va(yaVar, yaVar.e);
                    this.b = vaVar2;
                    vaVar = vaVar2;
                }
                Iterator it5 = vaVar.iterator();
                int i14 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i14 += next5 != null ? next5.hashCode() : 0;
                }
                return i14;
            case 5:
                l7.y yVar = (l7.y) this.b;
                if (yVar == null) {
                    l7.b0 b0Var = (l7.b0) this;
                    l7.y yVar2 = new l7.y(b0Var, b0Var.e);
                    this.b = yVar2;
                    yVar = yVar2;
                }
                Iterator it6 = yVar.iterator();
                int i15 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i15 += next6 != null ? next6.hashCode() : 0;
                }
                return i15;
            default:
                n7.o oVar = (n7.o) this.b;
                if (oVar == null) {
                    n7.r rVar = (n7.r) this;
                    n7.o oVar2 = new n7.o(rVar, rVar.e);
                    this.b = oVar2;
                    oVar = oVar2;
                }
                Iterator it7 = oVar.iterator();
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
            case 0:
                if (((r0) this).size() == 0) {
                }
                break;
            case 1:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                }
                break;
            case 2:
                if (((h7.l) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.c;
                if (p0Var != null) {
                    return p0Var;
                }
                r0 r0Var = (r0) this;
                p0 p0Var2 = new p0(r0Var, new q0(0, r0Var.h, r0Var.f));
                this.c = p0Var2;
                return p0Var2;
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
                h7.j jVar = (h7.j) this.c;
                if (jVar != null) {
                    return jVar;
                }
                h7.l lVar = (h7.l) this;
                h7.j jVar2 = new h7.j(lVar, new h7.k(0, lVar.h, lVar.f));
                this.c = jVar2;
                return jVar2;
            case 3:
                j7.b bVar = (j7.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                j7.d dVar = (j7.d) this;
                j7.b bVar2 = new j7.b(dVar, new j7.c(0, dVar.e));
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
                l7.z zVar = (l7.z) this.c;
                if (zVar != null) {
                    return zVar;
                }
                l7.b0 b0Var = (l7.b0) this;
                l7.z zVar2 = new l7.z(b0Var, new l7.a0(0, b0Var.e));
                this.c = zVar2;
                return zVar2;
            default:
                n7.p pVar = (n7.p) this.c;
                if (pVar != null) {
                    return pVar;
                }
                n7.r rVar = (n7.r) this;
                n7.p pVar2 = new n7.p(rVar, new n7.q(0, rVar.e));
                this.c = pVar2;
                return pVar2;
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
                int i10 = ((r0) this).h;
                if (i10 < 0) {
                    throw new IllegalArgumentException(kf.k0.j(i10, "size cannot be negative but was: "));
                }
                StringBuilder sb = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((n0) entrySet()).iterator();
                boolean z4 = true;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z4) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z4 = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                int i11 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i11 < 0) {
                    throw new IllegalArgumentException(kf.k0.j(i11, "size cannot be negative but was: "));
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((com.google.android.gms.internal.play_billing.x) entrySet()).iterator();
                boolean z10 = true;
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z10) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z10 = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                int i12 = ((h7.l) this).h;
                if (i12 < 0) {
                    throw new IllegalArgumentException(kf.k0.j(i12, "size cannot be negative but was: "));
                }
                StringBuilder sb3 = new StringBuilder((int) Math.min(i12 * 8, 1073741824L));
                sb3.append('{');
                Iterator it3 = ((h7.i) entrySet()).iterator();
                boolean z11 = true;
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z11) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z11 = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 3:
                boolean z12 = true;
                StringBuilder sb4 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb4.append('{');
                Iterator it4 = ((j7.a) entrySet()).iterator();
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z12) {
                        sb4.append(", ");
                    }
                    sb4.append(entry4.getKey());
                    sb4.append('=');
                    sb4.append(entry4.getValue());
                    z12 = false;
                }
                sb4.append('}');
                return sb4.toString();
            case 4:
                boolean z13 = true;
                StringBuilder sb5 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb5.append('{');
                Iterator it5 = ((va) entrySet()).iterator();
                while (it5.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it5.next();
                    if (!z13) {
                        sb5.append(", ");
                    }
                    sb5.append(entry5.getKey());
                    sb5.append('=');
                    sb5.append(entry5.getValue());
                    z13 = false;
                }
                sb5.append('}');
                return sb5.toString();
            case 5:
                boolean z14 = true;
                StringBuilder sb6 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb6.append('{');
                Iterator it6 = ((l7.y) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z14) {
                        sb6.append(", ");
                    }
                    sb6.append(entry6.getKey());
                    sb6.append('=');
                    sb6.append(entry6.getValue());
                    z14 = false;
                }
                sb6.append('}');
                return sb6.toString();
            default:
                boolean z15 = true;
                StringBuilder sb7 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb7.append('{');
                Iterator it7 = ((n7.o) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z15) {
                        sb7.append(", ");
                    }
                    sb7.append(entry7.getKey());
                    sb7.append('=');
                    sb7.append(entry7.getValue());
                    z15 = false;
                }
                sb7.append('}');
                return sb7.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                q0 q0Var = (q0) this.d;
                if (q0Var != null) {
                    return q0Var;
                }
                r0 r0Var = (r0) this;
                q0 q0Var2 = new q0(1, r0Var.h, r0Var.f);
                this.d = q0Var2;
                return q0Var2;
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
                h7.k kVar = (h7.k) this.d;
                if (kVar != null) {
                    return kVar;
                }
                h7.l lVar = (h7.l) this;
                h7.k kVar2 = new h7.k(1, lVar.h, lVar.f);
                this.d = kVar2;
                return kVar2;
            case 3:
                j7.c cVar = (j7.c) this.d;
                if (cVar != null) {
                    return cVar;
                }
                j7.c cVar2 = new j7.c(1, ((j7.d) this).e);
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
                l7.a0 a0Var2 = (l7.a0) this.d;
                if (a0Var2 != null) {
                    return a0Var2;
                }
                l7.a0 a0Var3 = new l7.a0(1, ((l7.b0) this).e);
                this.d = a0Var3;
                return a0Var3;
            default:
                n7.q qVar = (n7.q) this.d;
                if (qVar != null) {
                    return qVar;
                }
                n7.q qVar2 = new n7.q(1, ((n7.r) this).e);
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
        int i10 = this.a;
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }
}

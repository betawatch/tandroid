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
import w7.wa;
import w7.xa;
import w7.ya;
import w7.za;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class l0 implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ int a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ l0(int i10) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.l0.a(java.util.Set):void");
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
                t0 t0Var = (t0) this.d;
                if (t0Var == null) {
                    u0 u0Var = (u0) this;
                    t0 t0Var2 = new t0(1, u0Var.h, u0Var.f);
                    this.d = t0Var2;
                    t0Var = t0Var2;
                }
                return t0Var.contains(obj);
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
                t7.k kVar = (t7.k) this.d;
                if (kVar == null) {
                    t7.l lVar = (t7.l) this;
                    t7.k kVar2 = new t7.k(1, lVar.h, lVar.f);
                    this.d = kVar2;
                    kVar = kVar2;
                }
                return kVar.contains(obj);
            case 3:
                v7.c cVar = (v7.c) this.d;
                if (cVar == null) {
                    v7.c cVar2 = new v7.c(1, ((v7.d) this).e);
                    this.d = cVar2;
                    cVar = cVar2;
                }
                return cVar.contains(obj);
            case 4:
                ya yaVar = (ya) this.d;
                if (yaVar == null) {
                    ya yaVar2 = new ya(1, ((za) this).e);
                    this.d = yaVar2;
                    yaVar = yaVar2;
                }
                return yaVar.contains(obj);
            case 5:
                x7.w wVar = (x7.w) this.d;
                if (wVar == null) {
                    x7.w wVar2 = new x7.w(1, ((x7.x) this).e);
                    this.d = wVar2;
                    wVar = wVar2;
                }
                return wVar.contains(obj);
            default:
                z7.q qVar = (z7.q) this.d;
                if (qVar == null) {
                    z7.q qVar2 = new z7.q(1, ((z7.r) this).e);
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
                q0 q0Var = (q0) this.b;
                if (q0Var != null) {
                    return q0Var;
                }
                u0 u0Var = (u0) this;
                q0 q0Var2 = new q0(u0Var, u0Var.f, u0Var.h);
                this.b = q0Var2;
                return q0Var2;
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
                t7.i iVar = (t7.i) this.b;
                if (iVar != null) {
                    return iVar;
                }
                t7.l lVar = (t7.l) this;
                t7.i iVar2 = new t7.i(lVar, lVar.f, lVar.h);
                this.b = iVar2;
                return iVar2;
            case 3:
                v7.a aVar = (v7.a) this.b;
                if (aVar != null) {
                    return aVar;
                }
                v7.d dVar = (v7.d) this;
                v7.a aVar2 = new v7.a(dVar, dVar.e);
                this.b = aVar2;
                return aVar2;
            case 4:
                wa waVar = (wa) this.b;
                if (waVar != null) {
                    return waVar;
                }
                za zaVar = (za) this;
                wa waVar2 = new wa(zaVar, zaVar.e);
                this.b = waVar2;
                return waVar2;
            case 5:
                x7.u uVar = (x7.u) this.b;
                if (uVar != null) {
                    return uVar;
                }
                x7.x xVar3 = (x7.x) this;
                x7.u uVar2 = new x7.u(xVar3, xVar3.e);
                this.b = uVar2;
                return uVar2;
            default:
                z7.o oVar = (z7.o) this.b;
                if (oVar != null) {
                    return oVar;
                }
                z7.r rVar = (z7.r) this;
                z7.o oVar2 = new z7.o(rVar, rVar.e);
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
                q0 q0Var = (q0) this.b;
                if (q0Var == null) {
                    u0 u0Var = (u0) this;
                    q0 q0Var2 = new q0(u0Var, u0Var.f, u0Var.h);
                    this.b = q0Var2;
                    q0Var = q0Var2;
                }
                Iterator it = q0Var.iterator();
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
                t7.i iVar = (t7.i) this.b;
                if (iVar == null) {
                    t7.l lVar = (t7.l) this;
                    t7.i iVar2 = new t7.i(lVar, lVar.f, lVar.h);
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
                v7.a aVar = (v7.a) this.b;
                if (aVar == null) {
                    v7.d dVar = (v7.d) this;
                    v7.a aVar2 = new v7.a(dVar, dVar.e);
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
                wa waVar = (wa) this.b;
                if (waVar == null) {
                    za zaVar = (za) this;
                    wa waVar2 = new wa(zaVar, zaVar.e);
                    this.b = waVar2;
                    waVar = waVar2;
                }
                Iterator it5 = waVar.iterator();
                int i14 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i14 += next5 != null ? next5.hashCode() : 0;
                }
                return i14;
            case 5:
                x7.u uVar = (x7.u) this.b;
                if (uVar == null) {
                    x7.x xVar3 = (x7.x) this;
                    x7.u uVar2 = new x7.u(xVar3, xVar3.e);
                    this.b = uVar2;
                    uVar = uVar2;
                }
                Iterator it6 = uVar.iterator();
                int i15 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i15 += next6 != null ? next6.hashCode() : 0;
                }
                return i15;
            default:
                z7.o oVar = (z7.o) this.b;
                if (oVar == null) {
                    z7.r rVar = (z7.r) this;
                    z7.o oVar2 = new z7.o(rVar, rVar.e);
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
                if (((u0) this).size() == 0) {
                }
                break;
            case 1:
                if (((com.google.android.gms.internal.play_billing.a0) this).size() == 0) {
                }
                break;
            case 2:
                if (((t7.l) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.c;
                if (s0Var != null) {
                    return s0Var;
                }
                u0 u0Var = (u0) this;
                s0 s0Var2 = new s0(u0Var, new t0(0, u0Var.h, u0Var.f));
                this.c = s0Var2;
                return s0Var2;
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
                t7.j jVar = (t7.j) this.c;
                if (jVar != null) {
                    return jVar;
                }
                t7.l lVar = (t7.l) this;
                t7.j jVar2 = new t7.j(lVar, new t7.k(0, lVar.h, lVar.f));
                this.c = jVar2;
                return jVar2;
            case 3:
                v7.b bVar = (v7.b) this.c;
                if (bVar != null) {
                    return bVar;
                }
                v7.d dVar = (v7.d) this;
                v7.b bVar2 = new v7.b(dVar, new v7.c(0, dVar.e));
                this.c = bVar2;
                return bVar2;
            case 4:
                xa xaVar = (xa) this.c;
                if (xaVar != null) {
                    return xaVar;
                }
                za zaVar = (za) this;
                xa xaVar2 = new xa(zaVar, new ya(0, zaVar.e));
                this.c = xaVar2;
                return xaVar2;
            case 5:
                x7.v vVar = (x7.v) this.c;
                if (vVar != null) {
                    return vVar;
                }
                x7.x xVar = (x7.x) this;
                x7.v vVar2 = new x7.v(xVar, new x7.w(0, xVar.e));
                this.c = vVar2;
                return vVar2;
            default:
                z7.p pVar = (z7.p) this.c;
                if (pVar != null) {
                    return pVar;
                }
                z7.r rVar = (z7.r) this;
                z7.p pVar2 = new z7.p(rVar, new z7.q(0, rVar.e));
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
                int i10 = ((u0) this).h;
                if (i10 < 0) {
                    throw new IllegalArgumentException(i2.g.i(i10, "size cannot be negative but was: "));
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
                sb2.append('{');
                Iterator it = ((q0) entrySet()).iterator();
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
                int i11 = ((com.google.android.gms.internal.play_billing.a0) this).h;
                if (i11 < 0) {
                    throw new IllegalArgumentException(i2.g.i(i11, "size cannot be negative but was: "));
                }
                StringBuilder sb3 = new StringBuilder((int) Math.min(i11 * 8, 1073741824L));
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
                int i12 = ((t7.l) this).h;
                if (i12 < 0) {
                    throw new IllegalArgumentException(i2.g.i(i12, "size cannot be negative but was: "));
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i12 * 8, 1073741824L));
                sb4.append('{');
                Iterator it3 = ((t7.i) entrySet()).iterator();
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
                Iterator it4 = ((v7.a) entrySet()).iterator();
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
                Iterator it5 = ((wa) entrySet()).iterator();
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
                Iterator it6 = ((x7.u) entrySet()).iterator();
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
                Iterator it7 = ((z7.o) entrySet()).iterator();
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
                t0 t0Var = (t0) this.d;
                if (t0Var != null) {
                    return t0Var;
                }
                u0 u0Var = (u0) this;
                t0 t0Var2 = new t0(1, u0Var.h, u0Var.f);
                this.d = t0Var2;
                return t0Var2;
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
                t7.k kVar = (t7.k) this.d;
                if (kVar != null) {
                    return kVar;
                }
                t7.l lVar = (t7.l) this;
                t7.k kVar2 = new t7.k(1, lVar.h, lVar.f);
                this.d = kVar2;
                return kVar2;
            case 3:
                v7.c cVar = (v7.c) this.d;
                if (cVar != null) {
                    return cVar;
                }
                v7.c cVar2 = new v7.c(1, ((v7.d) this).e);
                this.d = cVar2;
                return cVar2;
            case 4:
                ya yaVar = (ya) this.d;
                if (yaVar != null) {
                    return yaVar;
                }
                ya yaVar2 = new ya(1, ((za) this).e);
                this.d = yaVar2;
                return yaVar2;
            case 5:
                x7.w wVar = (x7.w) this.d;
                if (wVar != null) {
                    return wVar;
                }
                x7.w wVar2 = new x7.w(1, ((x7.x) this).e);
                this.d = wVar2;
                return wVar2;
            default:
                z7.q qVar = (z7.q) this.d;
                if (qVar != null) {
                    return qVar;
                }
                z7.q qVar2 = new z7.q(1, ((z7.r) this).e);
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

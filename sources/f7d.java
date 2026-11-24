// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class f7d implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ byte a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ f7d(byte b) {
        this.a = b;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v5 ??, r5v11 ??, r5v6 ??, r5v8 ??, r5v7 ??, r5v9 ??, r5v10 ??, r5v13 ??]
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
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7d.b(java.util.Set):void");
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
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        byte b = this.a;
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        byte b = this.a;
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        byte b = this.a;
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
                s8d s8dVar = (s8d) this.d;
                if (s8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    s8d s8dVar2 = new s8d(1, v8dVar.h, v8dVar.f);
                    this.d = s8dVar2;
                    s8dVar = s8dVar2;
                }
                return s8dVar.contains(obj);
            case 1:
                jed jedVar = (jed) this.d;
                if (jedVar == null) {
                    jed jedVar2 = new jed(1, ((med) this).e);
                    this.d = jedVar2;
                    jedVar = jedVar2;
                }
                return jedVar.contains(obj);
            case 2:
                agd agdVar = (agd) this.d;
                if (agdVar == null) {
                    agd agdVar2 = new agd(1, ((ggd) this).e);
                    this.d = agdVar2;
                    agdVar = agdVar2;
                }
                return agdVar.contains(obj);
            case 3:
                kid kidVar = (kid) this.d;
                if (kidVar == null) {
                    qid qidVar = (qid) this;
                    kid kidVar2 = new kid(1, qidVar.h, qidVar.f);
                    this.d = kidVar2;
                    kidVar = kidVar2;
                }
                return kidVar.contains(obj);
            case 4:
                u6e u6eVar = (u6e) this.d;
                if (u6eVar == null) {
                    a7e a7eVar = (a7e) this;
                    u6e u6eVar2 = new u6e(1, a7eVar.h, a7eVar.f);
                    this.d = u6eVar2;
                    u6eVar = u6eVar2;
                }
                return u6eVar.contains(obj);
            case 5:
                thf thfVar = (thf) this.d;
                if (thfVar == null) {
                    thf thfVar2 = new thf(1, ((aif) this).e);
                    this.d = thfVar2;
                    thfVar = thfVar2;
                }
                return thfVar.contains(obj);
            default:
                s5d s5dVar = (s5d) this.d;
                if (s5dVar == null) {
                    s5d s5dVar2 = new s5d(1, ((c6d) this).e);
                    this.d = s5dVar2;
                    s5dVar = s5dVar2;
                }
                return s5dVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                l8d l8dVar = (l8d) this.b;
                if (l8dVar != null) {
                    return l8dVar;
                }
                v8d v8dVar = (v8d) this;
                l8d l8dVar2 = new l8d(v8dVar, v8dVar.f, v8dVar.h);
                this.b = l8dVar2;
                return l8dVar2;
            case 1:
                ced cedVar = (ced) this.b;
                if (cedVar != null) {
                    return cedVar;
                }
                med medVar = (med) this;
                ced cedVar2 = new ced(medVar, medVar.e);
                this.b = cedVar2;
                return cedVar2;
            case 2:
                rfd rfdVar = (rfd) this.b;
                if (rfdVar != null) {
                    return rfdVar;
                }
                ggd ggdVar = (ggd) this;
                rfd rfdVar2 = new rfd(ggdVar, ggdVar.e);
                this.b = rfdVar2;
                return rfdVar2;
            case 3:
                bid bidVar = (bid) this.b;
                if (bidVar != null) {
                    return bidVar;
                }
                qid qidVar = (qid) this;
                bid bidVar2 = new bid(qidVar, qidVar.f, qidVar.h);
                this.b = bidVar2;
                return bidVar2;
            case 4:
                u5e u5eVar = (u5e) this.b;
                if (u5eVar != null) {
                    return u5eVar;
                }
                a7e a7eVar = (a7e) this;
                u5e u5eVar2 = new u5e(a7eVar, a7eVar.f, a7eVar.h);
                this.b = u5eVar2;
                return u5eVar2;
            case 5:
                vgf vgfVar = (vgf) this.b;
                if (vgfVar != null) {
                    return vgfVar;
                }
                aif aifVar = (aif) this;
                vgf vgfVar2 = new vgf(aifVar, aifVar.e);
                this.b = vgfVar2;
                return vgfVar2;
            default:
                c5d c5dVar = (c5d) this.b;
                if (c5dVar != null) {
                    return c5dVar;
                }
                c6d c6dVar = (c6d) this;
                c5d c5dVar2 = new c5d(c6dVar, c6dVar.e);
                this.b = c5dVar2;
                return c5dVar2;
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
                } else {
                    break;
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 3:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 4:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 5:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof java.util.Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        byte b = this.a;
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
                l8d l8dVar = (l8d) this.b;
                if (l8dVar == null) {
                    v8d v8dVar = (v8d) this;
                    l8d l8dVar2 = new l8d(v8dVar, v8dVar.f, v8dVar.h);
                    this.b = l8dVar2;
                    l8dVar = l8dVar2;
                }
                Iterator it = l8dVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i += next != null ? next.hashCode() : 0;
                }
                return i;
            case 1:
                ced cedVar = (ced) this.b;
                if (cedVar == null) {
                    med medVar = (med) this;
                    ced cedVar2 = new ced(medVar, medVar.e);
                    this.b = cedVar2;
                    cedVar = cedVar2;
                }
                Iterator it2 = cedVar.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i2 += next2 != null ? next2.hashCode() : 0;
                }
                return i2;
            case 2:
                rfd rfdVar = (rfd) this.b;
                if (rfdVar == null) {
                    ggd ggdVar = (ggd) this;
                    rfd rfdVar2 = new rfd(ggdVar, ggdVar.e);
                    this.b = rfdVar2;
                    rfdVar = rfdVar2;
                }
                Iterator it3 = rfdVar.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i3 += next3 != null ? next3.hashCode() : 0;
                }
                return i3;
            case 3:
                bid bidVar = (bid) this.b;
                if (bidVar == null) {
                    qid qidVar = (qid) this;
                    bid bidVar2 = new bid(qidVar, qidVar.f, qidVar.h);
                    this.b = bidVar2;
                    bidVar = bidVar2;
                }
                Iterator it4 = bidVar.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i4 += next4 != null ? next4.hashCode() : 0;
                }
                return i4;
            case 4:
                u5e u5eVar = (u5e) this.b;
                if (u5eVar == null) {
                    a7e a7eVar = (a7e) this;
                    u5e u5eVar2 = new u5e(a7eVar, a7eVar.f, a7eVar.h);
                    this.b = u5eVar2;
                    u5eVar = u5eVar2;
                }
                Iterator it5 = u5eVar.iterator();
                int i5 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i5 += next5 != null ? next5.hashCode() : 0;
                }
                return i5;
            case 5:
                vgf vgfVar = (vgf) this.b;
                if (vgfVar == null) {
                    aif aifVar = (aif) this;
                    vgf vgfVar2 = new vgf(aifVar, aifVar.e);
                    this.b = vgfVar2;
                    vgfVar = vgfVar2;
                }
                Iterator it6 = vgfVar.iterator();
                int i6 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i6 += next6 != null ? next6.hashCode() : 0;
                }
                return i6;
            default:
                c5d c5dVar = (c5d) this.b;
                if (c5dVar == null) {
                    c6d c6dVar = (c6d) this;
                    c5d c5dVar2 = new c5d(c6dVar, c6dVar.e);
                    this.b = c5dVar2;
                    c5dVar = c5dVar2;
                }
                Iterator it7 = c5dVar.iterator();
                int i7 = 0;
                while (it7.hasNext()) {
                    Object next7 = it7.next();
                    i7 += next7 != null ? next7.hashCode() : 0;
                }
                return i7;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (((v8d) this).size() == 0) {
                }
                break;
            case 3:
                if (((qid) this).size() == 0) {
                }
                break;
            case 4:
                if (((a7e) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                n8d n8dVar = (n8d) this.c;
                if (n8dVar != null) {
                    return n8dVar;
                }
                v8d v8dVar = (v8d) this;
                n8d n8dVar2 = new n8d(v8dVar, new s8d(0, v8dVar.h, v8dVar.f));
                this.c = n8dVar2;
                return n8dVar2;
            case 1:
                ged gedVar = (ged) this.c;
                if (gedVar != null) {
                    return gedVar;
                }
                med medVar = (med) this;
                ged gedVar2 = new ged(medVar, new jed(0, medVar.e));
                this.c = gedVar2;
                return gedVar2;
            case 2:
                wfd wfdVar = (wfd) this.c;
                if (wfdVar != null) {
                    return wfdVar;
                }
                ggd ggdVar = (ggd) this;
                wfd wfdVar2 = new wfd(ggdVar, new agd(0, ggdVar.e));
                this.c = wfdVar2;
                return wfdVar2;
            case 3:
                hid hidVar = (hid) this.c;
                if (hidVar != null) {
                    return hidVar;
                }
                qid qidVar = (qid) this;
                hid hidVar2 = new hid(qidVar, new kid(0, qidVar.h, qidVar.f));
                this.c = hidVar2;
                return hidVar2;
            case 4:
                o6e o6eVar = (o6e) this.c;
                if (o6eVar != null) {
                    return o6eVar;
                }
                a7e a7eVar = (a7e) this;
                o6e o6eVar2 = new o6e(a7eVar, new u6e(0, a7eVar.h, a7eVar.f));
                this.c = o6eVar2;
                return o6eVar2;
            case 5:
                khf khfVar = (khf) this.c;
                if (khfVar != null) {
                    return khfVar;
                }
                aif aifVar = (aif) this;
                khf khfVar2 = new khf(aifVar, new thf(0, aifVar.e));
                this.c = khfVar2;
                return khfVar2;
            default:
                q5d q5dVar = (q5d) this.c;
                if (q5dVar != null) {
                    return q5dVar;
                }
                c6d c6dVar = (c6d) this;
                q5d q5dVar2 = new q5d(c6dVar, new s5d(0, c6dVar.e));
                this.c = q5dVar2;
                return q5dVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        byte b = this.a;
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
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        byte b = this.a;
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
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
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        byte b = this.a;
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        byte b = this.a;
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        boolean z = true;
        switch (this.a) {
            case 0:
                int i = ((v8d) this).h;
                if (i < 0) {
                    w26.j(de9.k(i, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb = new StringBuilder((int) Math.min(i << 3, 1073741824L));
                sb.append('{');
                Iterator it = ((l8d) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder((int) 8);
                sb2.append('{');
                Iterator it2 = ((ced) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder((int) 8);
                sb3.append('{');
                Iterator it3 = ((rfd) entrySet()).iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
            case 3:
                int i2 = ((qid) this).h;
                if (i2 < 0) {
                    w26.j(de9.k(i2, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i2 << 3, 1073741824L));
                sb4.append('{');
                Iterator it4 = ((bid) entrySet()).iterator();
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    if (!z) {
                        sb4.append(", ");
                    }
                    sb4.append(entry4.getKey());
                    sb4.append('=');
                    sb4.append(entry4.getValue());
                    z = false;
                }
                sb4.append('}');
                return sb4.toString();
            case 4:
                int i3 = ((a7e) this).h;
                if (i3 < 0) {
                    w26.j(de9.k(i3, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb5 = new StringBuilder((int) Math.min(i3 << 3, 1073741824L));
                sb5.append('{');
                Iterator it5 = ((u5e) entrySet()).iterator();
                while (it5.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it5.next();
                    if (!z) {
                        sb5.append(", ");
                    }
                    sb5.append(entry5.getKey());
                    sb5.append('=');
                    sb5.append(entry5.getValue());
                    z = false;
                }
                sb5.append('}');
                return sb5.toString();
            case 5:
                StringBuilder sb6 = new StringBuilder((int) 8);
                sb6.append('{');
                Iterator it6 = ((vgf) entrySet()).iterator();
                while (it6.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it6.next();
                    if (!z) {
                        sb6.append(", ");
                    }
                    sb6.append(entry6.getKey());
                    sb6.append('=');
                    sb6.append(entry6.getValue());
                    z = false;
                }
                sb6.append('}');
                return sb6.toString();
            default:
                StringBuilder sb7 = new StringBuilder((int) 8);
                sb7.append('{');
                Iterator it7 = ((c5d) entrySet()).iterator();
                while (it7.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it7.next();
                    if (!z) {
                        sb7.append(", ");
                    }
                    sb7.append(entry7.getKey());
                    sb7.append('=');
                    sb7.append(entry7.getValue());
                    z = false;
                }
                sb7.append('}');
                return sb7.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                s8d s8dVar = (s8d) this.d;
                if (s8dVar != null) {
                    return s8dVar;
                }
                v8d v8dVar = (v8d) this;
                s8d s8dVar2 = new s8d(1, v8dVar.h, v8dVar.f);
                this.d = s8dVar2;
                return s8dVar2;
            case 1:
                jed jedVar = (jed) this.d;
                if (jedVar != null) {
                    return jedVar;
                }
                jed jedVar2 = new jed(1, ((med) this).e);
                this.d = jedVar2;
                return jedVar2;
            case 2:
                agd agdVar = (agd) this.d;
                if (agdVar != null) {
                    return agdVar;
                }
                agd agdVar2 = new agd(1, ((ggd) this).e);
                this.d = agdVar2;
                return agdVar2;
            case 3:
                kid kidVar = (kid) this.d;
                if (kidVar != null) {
                    return kidVar;
                }
                qid qidVar = (qid) this;
                kid kidVar2 = new kid(1, qidVar.h, qidVar.f);
                this.d = kidVar2;
                return kidVar2;
            case 4:
                u6e u6eVar = (u6e) this.d;
                if (u6eVar != null) {
                    return u6eVar;
                }
                a7e a7eVar = (a7e) this;
                u6e u6eVar2 = new u6e(1, a7eVar.h, a7eVar.f);
                this.d = u6eVar2;
                return u6eVar2;
            case 5:
                thf thfVar = (thf) this.d;
                if (thfVar != null) {
                    return thfVar;
                }
                thf thfVar2 = new thf(1, ((aif) this).e);
                this.d = thfVar2;
                return thfVar2;
            default:
                s5d s5dVar = (s5d) this.d;
                if (s5dVar != null) {
                    return s5dVar;
                }
                s5d s5dVar2 = new s5d(1, ((c6d) this).e);
                this.d = s5dVar2;
                return s5dVar2;
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        byte b = this.a;
        return Map.-CC.$default$remove(this, obj, obj2);
    }
}

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class h9d implements Map, Serializable, j$.util.Map {
    public final /* synthetic */ byte a;
    public transient AbstractCollection b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;

    public /* synthetic */ h9d(byte b) {
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
        throw new UnsupportedOperationException("Method not decompiled: h9d.b(java.util.Set):void");
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
                uad uadVar = (uad) this.d;
                if (uadVar == null) {
                    xad xadVar = (xad) this;
                    uad uadVar2 = new uad(1, xadVar.h, xadVar.f);
                    this.d = uadVar2;
                    uadVar = uadVar2;
                }
                return uadVar.contains(obj);
            case 1:
                kgd kgdVar = (kgd) this.d;
                if (kgdVar == null) {
                    kgd kgdVar2 = new kgd(1, ((ngd) this).e);
                    this.d = kgdVar2;
                    kgdVar = kgdVar2;
                }
                return kgdVar.contains(obj);
            case 2:
                bid bidVar = (bid) this.d;
                if (bidVar == null) {
                    bid bidVar2 = new bid(1, ((hid) this).e);
                    this.d = bidVar2;
                    bidVar = bidVar2;
                }
                return bidVar.contains(obj);
            case 3:
                mkd mkdVar = (mkd) this.d;
                if (mkdVar == null) {
                    skd skdVar = (skd) this;
                    mkd mkdVar2 = new mkd(1, skdVar.h, skdVar.f);
                    this.d = mkdVar2;
                    mkdVar = mkdVar2;
                }
                return mkdVar.contains(obj);
            case 4:
                v8e v8eVar = (v8e) this.d;
                if (v8eVar == null) {
                    b9e b9eVar = (b9e) this;
                    v8e v8eVar2 = new v8e(1, b9eVar.h, b9eVar.f);
                    this.d = v8eVar2;
                    v8eVar = v8eVar2;
                }
                return v8eVar.contains(obj);
            case 5:
                ujf ujfVar = (ujf) this.d;
                if (ujfVar == null) {
                    ujf ujfVar2 = new ujf(1, ((bkf) this).e);
                    this.d = ujfVar2;
                    ujfVar = ujfVar2;
                }
                return ujfVar.contains(obj);
            default:
                u7d u7dVar = (u7d) this.d;
                if (u7dVar == null) {
                    u7d u7dVar2 = new u7d(1, ((e8d) this).e);
                    this.d = u7dVar2;
                    u7dVar = u7dVar2;
                }
                return u7dVar.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                nad nadVar = (nad) this.b;
                if (nadVar != null) {
                    return nadVar;
                }
                xad xadVar = (xad) this;
                nad nadVar2 = new nad(xadVar, xadVar.f, xadVar.h);
                this.b = nadVar2;
                return nadVar2;
            case 1:
                dgd dgdVar = (dgd) this.b;
                if (dgdVar != null) {
                    return dgdVar;
                }
                ngd ngdVar = (ngd) this;
                dgd dgdVar2 = new dgd(ngdVar, ngdVar.e);
                this.b = dgdVar2;
                return dgdVar2;
            case 2:
                shd shdVar = (shd) this.b;
                if (shdVar != null) {
                    return shdVar;
                }
                hid hidVar = (hid) this;
                shd shdVar2 = new shd(hidVar, hidVar.e);
                this.b = shdVar2;
                return shdVar2;
            case 3:
                ckd ckdVar = (ckd) this.b;
                if (ckdVar != null) {
                    return ckdVar;
                }
                skd skdVar = (skd) this;
                ckd ckdVar2 = new ckd(skdVar, skdVar.f, skdVar.h);
                this.b = ckdVar2;
                return ckdVar2;
            case 4:
                x7e x7eVar = (x7e) this.b;
                if (x7eVar != null) {
                    return x7eVar;
                }
                b9e b9eVar = (b9e) this;
                x7e x7eVar2 = new x7e(b9eVar, b9eVar.f, b9eVar.h);
                this.b = x7eVar2;
                return x7eVar2;
            case 5:
                wif wifVar = (wif) this.b;
                if (wifVar != null) {
                    return wifVar;
                }
                bkf bkfVar = (bkf) this;
                wif wifVar2 = new wif(bkfVar, bkfVar.e);
                this.b = wifVar2;
                return wifVar2;
            default:
                e7d e7dVar = (e7d) this.b;
                if (e7dVar != null) {
                    return e7dVar;
                }
                e8d e8dVar = (e8d) this;
                e7d e7dVar2 = new e7d(e8dVar, e8dVar.e);
                this.b = e7dVar2;
                return e7dVar2;
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
                nad nadVar = (nad) this.b;
                if (nadVar == null) {
                    xad xadVar = (xad) this;
                    nad nadVar2 = new nad(xadVar, xadVar.f, xadVar.h);
                    this.b = nadVar2;
                    nadVar = nadVar2;
                }
                Iterator it = nadVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i += next != null ? next.hashCode() : 0;
                }
                return i;
            case 1:
                dgd dgdVar = (dgd) this.b;
                if (dgdVar == null) {
                    ngd ngdVar = (ngd) this;
                    dgd dgdVar2 = new dgd(ngdVar, ngdVar.e);
                    this.b = dgdVar2;
                    dgdVar = dgdVar2;
                }
                Iterator it2 = dgdVar.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    i2 += next2 != null ? next2.hashCode() : 0;
                }
                return i2;
            case 2:
                shd shdVar = (shd) this.b;
                if (shdVar == null) {
                    hid hidVar = (hid) this;
                    shd shdVar2 = new shd(hidVar, hidVar.e);
                    this.b = shdVar2;
                    shdVar = shdVar2;
                }
                Iterator it3 = shdVar.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    i3 += next3 != null ? next3.hashCode() : 0;
                }
                return i3;
            case 3:
                ckd ckdVar = (ckd) this.b;
                if (ckdVar == null) {
                    skd skdVar = (skd) this;
                    ckd ckdVar2 = new ckd(skdVar, skdVar.f, skdVar.h);
                    this.b = ckdVar2;
                    ckdVar = ckdVar2;
                }
                Iterator it4 = ckdVar.iterator();
                int i4 = 0;
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    i4 += next4 != null ? next4.hashCode() : 0;
                }
                return i4;
            case 4:
                x7e x7eVar = (x7e) this.b;
                if (x7eVar == null) {
                    b9e b9eVar = (b9e) this;
                    x7e x7eVar2 = new x7e(b9eVar, b9eVar.f, b9eVar.h);
                    this.b = x7eVar2;
                    x7eVar = x7eVar2;
                }
                Iterator it5 = x7eVar.iterator();
                int i5 = 0;
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    i5 += next5 != null ? next5.hashCode() : 0;
                }
                return i5;
            case 5:
                wif wifVar = (wif) this.b;
                if (wifVar == null) {
                    bkf bkfVar = (bkf) this;
                    wif wifVar2 = new wif(bkfVar, bkfVar.e);
                    this.b = wifVar2;
                    wifVar = wifVar2;
                }
                Iterator it6 = wifVar.iterator();
                int i6 = 0;
                while (it6.hasNext()) {
                    Object next6 = it6.next();
                    i6 += next6 != null ? next6.hashCode() : 0;
                }
                return i6;
            default:
                e7d e7dVar = (e7d) this.b;
                if (e7dVar == null) {
                    e8d e8dVar = (e8d) this;
                    e7d e7dVar2 = new e7d(e8dVar, e8dVar.e);
                    this.b = e7dVar2;
                    e7dVar = e7dVar2;
                }
                Iterator it7 = e7dVar.iterator();
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
                if (((xad) this).size() == 0) {
                }
                break;
            case 3:
                if (((skd) this).size() == 0) {
                }
                break;
            case 4:
                if (((b9e) this).size() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case 0:
                pad padVar = (pad) this.c;
                if (padVar != null) {
                    return padVar;
                }
                xad xadVar = (xad) this;
                pad padVar2 = new pad(xadVar, new uad(0, xadVar.h, xadVar.f));
                this.c = padVar2;
                return padVar2;
            case 1:
                hgd hgdVar = (hgd) this.c;
                if (hgdVar != null) {
                    return hgdVar;
                }
                ngd ngdVar = (ngd) this;
                hgd hgdVar2 = new hgd(ngdVar, new kgd(0, ngdVar.e));
                this.c = hgdVar2;
                return hgdVar2;
            case 2:
                xhd xhdVar = (xhd) this.c;
                if (xhdVar != null) {
                    return xhdVar;
                }
                hid hidVar = (hid) this;
                xhd xhdVar2 = new xhd(hidVar, new bid(0, hidVar.e));
                this.c = xhdVar2;
                return xhdVar2;
            case 3:
                jkd jkdVar = (jkd) this.c;
                if (jkdVar != null) {
                    return jkdVar;
                }
                skd skdVar = (skd) this;
                jkd jkdVar2 = new jkd(skdVar, new mkd(0, skdVar.h, skdVar.f));
                this.c = jkdVar2;
                return jkdVar2;
            case 4:
                p8e p8eVar = (p8e) this.c;
                if (p8eVar != null) {
                    return p8eVar;
                }
                b9e b9eVar = (b9e) this;
                p8e p8eVar2 = new p8e(b9eVar, new v8e(0, b9eVar.h, b9eVar.f));
                this.c = p8eVar2;
                return p8eVar2;
            case 5:
                ljf ljfVar = (ljf) this.c;
                if (ljfVar != null) {
                    return ljfVar;
                }
                bkf bkfVar = (bkf) this;
                ljf ljfVar2 = new ljf(bkfVar, new ujf(0, bkfVar.e));
                this.c = ljfVar2;
                return ljfVar2;
            default:
                s7d s7dVar = (s7d) this.c;
                if (s7dVar != null) {
                    return s7dVar;
                }
                e8d e8dVar = (e8d) this;
                s7d s7dVar2 = new s7d(e8dVar, new u7d(0, e8dVar.e));
                this.c = s7dVar2;
                return s7dVar2;
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
                int i = ((xad) this).h;
                if (i < 0) {
                    u36.j(hg9.j(i, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb = new StringBuilder((int) Math.min(i << 3, 1073741824L));
                sb.append('{');
                Iterator it = ((nad) entrySet()).iterator();
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
                Iterator it2 = ((dgd) entrySet()).iterator();
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
                Iterator it3 = ((shd) entrySet()).iterator();
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
                int i2 = ((skd) this).h;
                if (i2 < 0) {
                    u36.j(hg9.j(i2, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb4 = new StringBuilder((int) Math.min(i2 << 3, 1073741824L));
                sb4.append('{');
                Iterator it4 = ((ckd) entrySet()).iterator();
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
                int i3 = ((b9e) this).h;
                if (i3 < 0) {
                    u36.j(hg9.j(i3, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb5 = new StringBuilder((int) Math.min(i3 << 3, 1073741824L));
                sb5.append('{');
                Iterator it5 = ((x7e) entrySet()).iterator();
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
                Iterator it6 = ((wif) entrySet()).iterator();
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
                Iterator it7 = ((e7d) entrySet()).iterator();
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
                uad uadVar = (uad) this.d;
                if (uadVar != null) {
                    return uadVar;
                }
                xad xadVar = (xad) this;
                uad uadVar2 = new uad(1, xadVar.h, xadVar.f);
                this.d = uadVar2;
                return uadVar2;
            case 1:
                kgd kgdVar = (kgd) this.d;
                if (kgdVar != null) {
                    return kgdVar;
                }
                kgd kgdVar2 = new kgd(1, ((ngd) this).e);
                this.d = kgdVar2;
                return kgdVar2;
            case 2:
                bid bidVar = (bid) this.d;
                if (bidVar != null) {
                    return bidVar;
                }
                bid bidVar2 = new bid(1, ((hid) this).e);
                this.d = bidVar2;
                return bidVar2;
            case 3:
                mkd mkdVar = (mkd) this.d;
                if (mkdVar != null) {
                    return mkdVar;
                }
                skd skdVar = (skd) this;
                mkd mkdVar2 = new mkd(1, skdVar.h, skdVar.f);
                this.d = mkdVar2;
                return mkdVar2;
            case 4:
                v8e v8eVar = (v8e) this.d;
                if (v8eVar != null) {
                    return v8eVar;
                }
                b9e b9eVar = (b9e) this;
                v8e v8eVar2 = new v8e(1, b9eVar.h, b9eVar.f);
                this.d = v8eVar2;
                return v8eVar2;
            case 5:
                ujf ujfVar = (ujf) this.d;
                if (ujfVar != null) {
                    return ujfVar;
                }
                ujf ujfVar2 = new ujf(1, ((bkf) this).e);
                this.d = ujfVar2;
                return ujfVar2;
            default:
                u7d u7dVar = (u7d) this.d;
                if (u7dVar != null) {
                    return u7dVar;
                }
                u7d u7dVar2 = new u7d(1, ((e8d) this).e);
                this.d = u7dVar2;
                return u7dVar2;
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

package c9;

import j$.util.DesugarCollections;
import j7.k5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final e f;
    public final Set g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f = eVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(t tVar) {
        t[] tVarArr = new t[0];
        a aVar = new a();
        aVar.a = null;
        HashSet hashSet = new HashSet();
        aVar.d = hashSet;
        aVar.e = new HashSet();
        aVar.b = 0;
        aVar.c = 0;
        aVar.f = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            k5.a(tVar2, "Null interface");
        }
        Collections.addAll((HashSet) aVar.d, tVarArr);
        return aVar;
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            k5.a(cls2, "Null interface");
            hashSet.add(t.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a1.c(obj, 3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}

package c9;

import j$.util.DesugarCollections;
import j7.j5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final f f;
    public final Set g;

    public b(String str, Set set, Set set2, int i10, int i11, f fVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i10;
        this.e = i11;
        this.f = fVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static a a(u uVar) {
        u[] uVarArr = new u[0];
        a aVar = new a();
        aVar.a = null;
        HashSet hashSet = new HashSet();
        aVar.d = hashSet;
        aVar.e = new HashSet();
        aVar.b = 0;
        aVar.c = 0;
        aVar.f = new HashSet();
        hashSet.add(uVar);
        for (u uVar2 : uVarArr) {
            j5.a(uVar2, "Null interface");
        }
        Collections.addAll((HashSet) aVar.d, uVarArr);
        return aVar;
    }

    public static a b(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(u.a(cls));
        for (Class cls2 : clsArr) {
            j5.a(cls2, "Null interface");
            hashSet.add(u.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a1.c(obj, 3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}

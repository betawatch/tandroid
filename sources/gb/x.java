package gb;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import v7.k8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class x implements db.v {
    public final n4.x a;
    public final fb.f b;
    public final j c;
    public final ArrayList d;

    public x(n4.x xVar, fb.f fVar, j jVar, ArrayList arrayList) {
        this.a = xVar;
        this.b = fVar;
        this.c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ib.c.c(field) + " and " + ib.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b1  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v b(db.g gVar, kb.a aVar, Class cls, boolean z10) {
        boolean z11;
        Method method;
        eb.b bVar;
        boolean z12;
        List list;
        List singletonList;
        String str;
        eb.a aVar2;
        db.g gVar2;
        boolean z13;
        Field field;
        List<String> list2;
        db.u uVar;
        Field field2;
        s sVar;
        if (cls.isInterface()) {
            return v.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        kb.a aVar3 = aVar;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                fb.d.f(this.d);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i10 = 0;
            while (i10 < length) {
                Field field3 = declaredFields[i10];
                boolean c10 = c(field3, true);
                boolean c11 = c(field3, r14);
                if (c10 || c11) {
                    if (!z10) {
                        z11 = c11;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        z11 = r14;
                    } else {
                        Method a2 = ib.c.a.a(cls2, field3);
                        ib.c.f(a2);
                        if (a2.getAnnotation(eb.b.class) != null && field3.getAnnotation(eb.b.class) == null) {
                            throw new db.j(a1.g.q("@SerializedName on ", ib.c.d(a2, r14), " is not supported"));
                        }
                        z11 = c11;
                        method = a2;
                        if (method == null) {
                            ib.c.f(field3);
                        }
                        Type j3 = fb.d.j(aVar3.b, cls2, field3.getGenericType(), new HashMap());
                        bVar = (eb.b) field3.getAnnotation(eb.b.class);
                        if (bVar != null) {
                            singletonList = Collections.singletonList(field3.getName());
                        } else {
                            String value = bVar.value();
                            String[] alternate = bVar.alternate();
                            if (alternate.length == 0) {
                                singletonList = Collections.singletonList(value);
                            } else {
                                z12 = true;
                                ArrayList arrayList = new ArrayList(alternate.length + 1);
                                arrayList.add(value);
                                Collections.addAll(arrayList, alternate);
                                list = arrayList;
                                str = (String) list.get(r14);
                                kb.a aVar4 = new kb.a(j3);
                                Class cls3 = aVar4.a;
                                boolean z14 = (cls3 == null && cls3.isPrimitive()) ? z12 : r14;
                                int modifiers = field3.getModifiers();
                                boolean z15 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z12;
                                aVar2 = (eb.a) field3.getAnnotation(eb.a.class);
                                if (aVar2 != null) {
                                    field = field3;
                                    z13 = z12;
                                    list2 = list;
                                    gVar2 = gVar;
                                    uVar = this.c.a(this.a, gVar2, aVar4, aVar2, false);
                                } else {
                                    gVar2 = gVar;
                                    z13 = z12;
                                    field = field3;
                                    list2 = list;
                                    uVar = null;
                                }
                                boolean z16 = uVar != null ? z13 : r14;
                                if (uVar == null) {
                                    uVar = gVar2.b(aVar4);
                                }
                                s sVar2 = new s(str, field, method, c10 ? z16 ? uVar : new o(gVar2, uVar, aVar4.b) : uVar, uVar, z14, z15);
                                field2 = field;
                                if (z11) {
                                    for (String str2 : list2) {
                                        s sVar3 = (s) linkedHashMap.put(str2, sVar2);
                                        if (sVar3 != null) {
                                            a(cls, str2, sVar3.b, field2);
                                            throw null;
                                        }
                                    }
                                }
                                if (!c10 && (sVar = (s) linkedHashMap2.put(str, sVar2)) != null) {
                                    a(cls, str, sVar.b, field2);
                                    throw null;
                                }
                            }
                        }
                        z12 = true;
                        list = singletonList;
                        str = (String) list.get(r14);
                        kb.a aVar42 = new kb.a(j3);
                        Class cls32 = aVar42.a;
                        if (cls32 == null) {
                        }
                        int modifiers2 = field3.getModifiers();
                        if (Modifier.isStatic(modifiers2)) {
                        }
                        aVar2 = (eb.a) field3.getAnnotation(eb.a.class);
                        if (aVar2 != null) {
                        }
                        if (uVar != null) {
                        }
                        if (uVar == null) {
                        }
                        if (c10) {
                        }
                        s sVar22 = new s(str, field, method, c10 ? z16 ? uVar : new o(gVar2, uVar, aVar42.b) : uVar, uVar, z14, z15);
                        field2 = field;
                        if (z11) {
                        }
                        if (!c10) {
                            a(cls, str, sVar.b, field2);
                            throw null;
                        }
                        continue;
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type j32 = fb.d.j(aVar3.b, cls2, field3.getGenericType(), new HashMap());
                    bVar = (eb.b) field3.getAnnotation(eb.b.class);
                    if (bVar != null) {
                    }
                    z12 = true;
                    list = singletonList;
                    str = (String) list.get(r14);
                    kb.a aVar422 = new kb.a(j32);
                    Class cls322 = aVar422.a;
                    if (cls322 == null) {
                    }
                    int modifiers22 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers22)) {
                    }
                    aVar2 = (eb.a) field3.getAnnotation(eb.a.class);
                    if (aVar2 != null) {
                    }
                    if (uVar != null) {
                    }
                    if (uVar == null) {
                    }
                    if (c10) {
                    }
                    s sVar222 = new s(str, field, method, c10 ? z16 ? uVar : new o(gVar2, uVar, aVar422.b) : uVar, uVar, z14, z15);
                    field2 = field;
                    if (z11) {
                    }
                    if (!c10) {
                    }
                }
                i10++;
                r14 = 0;
            }
            aVar3 = new kb.a(fb.d.j(aVar3.b, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = aVar3.a;
        }
        return new v(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean c(Field field, boolean z10) {
        boolean z11;
        fb.f fVar = this.b;
        fVar.getClass();
        if ((136 & field.getModifiers()) == 0 && !field.isSynthetic() && !fVar.b(field.getType(), z10)) {
            List list = z10 ? fVar.a : fVar.b;
            if (!list.isEmpty()) {
                db.b bVar = new db.b(field);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((db.a) it.next()).shouldSkipField(bVar)) {
                    }
                }
            }
            z11 = false;
            return !z11;
        }
        z11 = true;
        return !z11;
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        k8 k8Var = ib.c.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new db.d(2);
        }
        fb.d.f(this.d);
        return ib.c.a.d(cls) ? new w(cls, b(gVar, aVar, cls, true)) : new u(this.a.S(aVar), b(gVar, aVar, cls, false));
    }
}

package oa;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends la.u {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public o(Class cls) {
        this.a = 2;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new g1(cls))) {
                Enum r42 = (Enum) field.get(null);
                String name = r42.name();
                String str = r42.toString();
                ma.b bVar = (ma.b) field.getAnnotation(ma.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        ((HashMap) this.b).put(str2, r42);
                    }
                }
                ((HashMap) this.b).put(name, r42);
                ((HashMap) this.c).put(str, r42);
                ((HashMap) this.d).put(r42, name);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        switch (this.a) {
            case 0:
                int x10 = aVar.x();
                if (x10 == 9) {
                    aVar.t();
                    return null;
                }
                Map map = (Map) ((na.n) this.d).Y1();
                if (x10 == 1) {
                    aVar.a();
                    while (aVar.k()) {
                        aVar.a();
                        Object read = ((la.u) ((o) this.b).c).read(aVar);
                        if (map.put(read, ((la.u) ((o) this.c).c).read(aVar)) != null) {
                            throw new la.j("duplicate key: " + read);
                        }
                        aVar.e();
                    }
                    aVar.e();
                } else {
                    aVar.b();
                    while (aVar.k()) {
                        wa.a.c.getClass();
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            lVar.F(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) lVar.J()).next();
                            lVar.L(entry.getValue());
                            lVar.L(new la.m((String) entry.getKey()));
                        } else {
                            int i9 = aVar.h;
                            if (i9 == 0) {
                                i9 = aVar.d();
                            }
                            if (i9 == 13) {
                                aVar.h = 9;
                            } else if (i9 == 12) {
                                aVar.h = 8;
                            } else {
                                if (i9 != 14) {
                                    throw aVar.E("a name");
                                }
                                aVar.h = 10;
                            }
                        }
                        Object read2 = ((la.u) ((o) this.b).c).read(aVar);
                        if (map.put(read2, ((la.u) ((o) this.c).c).read(aVar)) != null) {
                            throw new la.j("duplicate key: " + read2);
                        }
                    }
                    aVar.f();
                }
                return map;
            case 1:
                return ((la.u) this.c).read(aVar);
            default:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                String v = aVar.v();
                Enum r02 = (Enum) ((HashMap) this.b).get(v);
                return r02 == null ? (Enum) ((HashMap) this.c).get(v) : r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if ((r2 instanceof oa.t) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    @Override // la.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(ta.c cVar, Object obj) {
        la.u a2;
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                o oVar = (o) this.c;
                if (map == null) {
                    cVar.i();
                    break;
                } else {
                    cVar.c();
                    for (Map.Entry entry : map.entrySet()) {
                        cVar.g(String.valueOf(entry.getKey()));
                        oVar.write(cVar, entry.getValue());
                    }
                    cVar.f();
                    break;
                }
            case 1:
                la.u uVar = (la.u) this.c;
                ?? r12 = (Type) this.d;
                Class<?> cls = (obj == null || !((r12 instanceof Class) || (r12 instanceof TypeVariable))) ? r12 : obj.getClass();
                if (cls != r12) {
                    la.u b10 = ((la.g) this.b).b(new sa.a(cls));
                    if (b10 instanceof t) {
                        la.u uVar2 = uVar;
                        while ((uVar2 instanceof y) && (a2 = ((y) uVar2).a()) != uVar2) {
                            uVar2 = a2;
                        }
                        break;
                    }
                    uVar = b10;
                }
                uVar.write(cVar, obj);
                break;
            default:
                Enum r62 = (Enum) obj;
                cVar.r(r62 == null ? null : (String) ((HashMap) this.d).get(r62));
                break;
        }
    }

    public o(la.g gVar, la.u uVar, Type type) {
        this.a = 1;
        this.b = gVar;
        this.c = uVar;
        this.d = type;
    }

    public o(d dVar, la.g gVar, Type type, la.u uVar, Type type2, la.u uVar2, na.n nVar) {
        this.a = 0;
        this.b = new o(gVar, uVar, type);
        this.c = new o(gVar, uVar2, type2);
        this.d = nVar;
    }
}

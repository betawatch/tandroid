package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements la.v {
    private final Class<?> baseType;
    private final la.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, la.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, la.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // la.v
    public <R> la.u create(final la.g gVar, final sa.a<R> aVar) {
        la.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            la.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new la.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private la.u getDelegate(Class<?> cls3) {
                la.u uVar = (la.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (la.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // la.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(ta.a aVar3) {
                boolean z10;
                la.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (la.i) oa.h1.z.read(aVar3);
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new la.j(e);
                            }
                            iVar = la.k.a;
                            iVar.getClass();
                            if (iVar instanceof la.l) {
                            }
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof la.l) {
                        if (iVar instanceof la.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    la.i iVar2 = (la.i) iVar.i().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new androidx.car.app.j("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String n10 = iVar2.n();
                    la.u uVar = (la.u) linkedHashMap.get(n10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new sa.a(Class.forName(n10)));
                        } catch (ClassNotFoundException e12) {
                            throw new androidx.car.app.j(ta.b.d("Cannot find class ", n10), e12);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (IOException e13) {
                    throw new la.j(e13);
                } catch (NumberFormatException e14) {
                    throw new la.j(e14);
                } catch (ta.d e15) {
                    throw new la.j(e15);
                }
            }

            @Override // la.u
            public void write(ta.c cVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                la.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                la.i jsonTree = delegate.toJsonTree(r10);
                jsonTree.getClass();
                if (!(jsonTree instanceof la.l)) {
                    na.d.l(jsonTree, cVar);
                    return;
                }
                na.m mVar = jsonTree.i().a;
                if (mVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                la.l lVar = new la.l();
                lVar.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new la.m(simpleName));
                Iterator it = ((na.k) mVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar.o((String) entry.getKey(), (la.i) entry.getValue());
                }
                na.d.l(lVar, cVar);
            }
        }.nullSafe();
    }

    public RuntimeClassNameTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, "class", null);
    }

    public RuntimeClassNameTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}

package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements na.v {
    private final Class<?> baseType;
    private final na.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, na.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, na.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // na.v
    public <R> na.u create(final na.g gVar, final ua.a<R> aVar) {
        na.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            na.u c3 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c3);
            linkedHashMap2.put(cls2, c3);
        }
        return new na.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private na.u getDelegate(Class<?> cls3) {
                na.u uVar = (na.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (na.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // na.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(va.a aVar3) {
                boolean z10;
                na.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (na.i) qa.h1.z.read(aVar3);
                        } catch (EOFException e10) {
                            e = e10;
                            if (!z10) {
                                throw new na.j(e);
                            }
                            iVar = na.k.a;
                            iVar.getClass();
                            if (iVar instanceof na.l) {
                            }
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof na.l) {
                        if (iVar instanceof na.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    na.i iVar2 = (na.i) iVar.i().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new a6.b("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String n10 = iVar2.n();
                    na.u uVar = (na.u) linkedHashMap.get(n10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new ua.a(Class.forName(n10)));
                        } catch (ClassNotFoundException e12) {
                            throw new a6.b(u3.c.e("Cannot find class ", n10), e12);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (NumberFormatException e13) {
                    throw new na.j(e13);
                } catch (va.c e14) {
                    throw new na.j(e14);
                } catch (IOException e15) {
                    throw new na.j(e15);
                }
            }

            @Override // na.u
            public void write(va.b bVar, R r6) {
                Class<?> cls3 = r6.getClass();
                String simpleName = cls3.getSimpleName();
                na.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new a6.b("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                na.i jsonTree = delegate.toJsonTree(r6);
                jsonTree.getClass();
                if (!(jsonTree instanceof na.l)) {
                    pa.d.l(jsonTree, bVar);
                    return;
                }
                pa.l lVar = jsonTree.i().a;
                if (lVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new a6.b("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                na.l lVar2 = new na.l();
                lVar2.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new na.m(simpleName));
                Iterator it = ((pa.j) lVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar2.o((String) entry.getKey(), (na.i) entry.getValue());
                }
                pa.d.l(lVar2, bVar);
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

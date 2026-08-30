package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements pa.v {
    private final Class<?> baseType;
    private final pa.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, pa.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, pa.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // pa.v
    public <R> pa.u create(final pa.g gVar, final wa.a<R> aVar) {
        pa.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            pa.u c3 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c3);
            linkedHashMap2.put(cls2, c3);
        }
        return new pa.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private pa.u getDelegate(Class<?> cls3) {
                pa.u uVar = (pa.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (pa.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // pa.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(xa.a aVar3) {
                boolean z4;
                pa.i iVar;
                try {
                    try {
                        aVar3.x();
                        z4 = false;
                        try {
                            iVar = (pa.i) sa.h1.z.read(aVar3);
                        } catch (EOFException e) {
                            e = e;
                            if (!z4) {
                                throw new pa.j(e);
                            }
                            iVar = pa.k.a;
                            iVar.getClass();
                            if (iVar instanceof pa.l) {
                            }
                        }
                    } catch (EOFException e6) {
                        e = e6;
                        z4 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof pa.l) {
                        if (iVar instanceof pa.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    pa.i iVar2 = (pa.i) iVar.i().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new a7.b("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String n10 = iVar2.n();
                    pa.u uVar = (pa.u) linkedHashMap.get(n10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new wa.a(Class.forName(n10)));
                        } catch (ClassNotFoundException e10) {
                            throw new a7.b(vh.v2.e("Cannot find class ", n10), e10);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (NumberFormatException e11) {
                    throw new pa.j(e11);
                } catch (xa.c e12) {
                    throw new pa.j(e12);
                } catch (IOException e13) {
                    throw new pa.j(e13);
                }
            }

            @Override // pa.u
            public void write(xa.b bVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                pa.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new a7.b("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                pa.i jsonTree = delegate.toJsonTree(r10);
                jsonTree.getClass();
                if (!(jsonTree instanceof pa.l)) {
                    ra.d.l(jsonTree, bVar);
                    return;
                }
                ra.l lVar = jsonTree.i().a;
                if (lVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new a7.b("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                pa.l lVar2 = new pa.l();
                lVar2.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new pa.m(simpleName));
                Iterator it = ((ra.j) lVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar2.o((String) entry.getKey(), (pa.i) entry.getValue());
                }
                ra.d.l(lVar2, bVar);
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

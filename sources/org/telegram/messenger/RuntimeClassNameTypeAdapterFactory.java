package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements ma.v {
    private final Class<?> baseType;
    private final ma.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, ma.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, ma.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // ma.v
    public <R> ma.u create(final ma.g gVar, final ta.a<R> aVar) {
        ma.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            ma.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new ma.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private ma.u getDelegate(Class<?> cls3) {
                ma.u uVar = (ma.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (ma.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // ma.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(ua.a aVar3) {
                boolean z10;
                ma.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (ma.i) pa.h1.z.read(aVar3);
                        } catch (EOFException e9) {
                            e = e9;
                            if (!z10) {
                                throw new ma.j(e);
                            }
                            iVar = ma.k.a;
                            iVar.getClass();
                            if (iVar instanceof ma.l) {
                            }
                        }
                    } catch (EOFException e10) {
                        e = e10;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof ma.l) {
                        if (iVar instanceof ma.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    ma.i iVar2 = (ma.i) iVar.i().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new a7.c("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String n10 = iVar2.n();
                    ma.u uVar = (ma.u) linkedHashMap.get(n10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new ta.a(Class.forName(n10)));
                        } catch (ClassNotFoundException e11) {
                            throw new a7.c(s3.c.e("Cannot find class ", n10), e11);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (IOException e12) {
                    throw new ma.j(e12);
                } catch (NumberFormatException e13) {
                    throw new ma.j(e13);
                } catch (ua.c e14) {
                    throw new ma.j(e14);
                }
            }

            @Override // ma.u
            public void write(ua.b bVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                ma.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new a7.c("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                ma.i jsonTree = delegate.toJsonTree(r10);
                jsonTree.getClass();
                if (!(jsonTree instanceof ma.l)) {
                    oa.d.l(jsonTree, bVar);
                    return;
                }
                oa.l lVar = jsonTree.i().a;
                if (lVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new a7.c("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                ma.l lVar2 = new ma.l();
                lVar2.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new ma.m(simpleName));
                Iterator it = ((oa.j) lVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar2.o((String) entry.getKey(), (ma.i) entry.getValue());
                }
                oa.d.l(lVar2, bVar);
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

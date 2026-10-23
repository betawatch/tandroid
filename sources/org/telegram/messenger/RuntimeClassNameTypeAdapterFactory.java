package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements eb.v {
    private final Class<?> baseType;
    private final eb.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, eb.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, eb.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // eb.v
    public <R> eb.u create(final eb.g gVar, final lb.a<R> aVar) {
        eb.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            eb.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new eb.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private eb.u getDelegate(Class<?> cls3) {
                eb.u uVar = (eb.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (eb.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // eb.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(mb.a aVar3) {
                boolean z10;
                eb.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (eb.i) hb.h1.z.read(aVar3);
                        } catch (EOFException e) {
                            e = e;
                            if (!z10) {
                                throw new eb.j(e);
                            }
                            iVar = eb.k.a;
                            iVar.getClass();
                            if (iVar instanceof eb.l) {
                            }
                        }
                    } catch (EOFException e7) {
                        e = e7;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof eb.l) {
                        if (iVar instanceof eb.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    eb.i iVar2 = (eb.i) iVar.h().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new androidx.car.app.j("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String m10 = iVar2.m();
                    eb.u uVar = (eb.u) linkedHashMap.get(m10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new lb.a(Class.forName(m10)));
                        } catch (ClassNotFoundException e10) {
                            throw new androidx.car.app.j(r4.c.h("Cannot find class ", m10), e10);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (NumberFormatException e11) {
                    throw new eb.j(e11);
                } catch (mb.c e12) {
                    throw new eb.j(e12);
                } catch (IOException e13) {
                    throw new eb.j(e13);
                }
            }

            @Override // eb.u
            public void write(mb.b bVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                eb.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                eb.i jsonTree = delegate.toJsonTree(r10);
                jsonTree.getClass();
                if (!(jsonTree instanceof eb.l)) {
                    gb.d.l(jsonTree, bVar);
                    return;
                }
                gb.m mVar = jsonTree.h().a;
                if (mVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                eb.l lVar = new eb.l();
                lVar.n(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new eb.m(simpleName));
                Iterator it = ((gb.k) mVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar.n((String) entry.getKey(), (eb.i) entry.getValue());
                }
                gb.d.l(lVar, bVar);
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

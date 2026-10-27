package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements fb.v {
    private final Class<?> baseType;
    private final fb.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, fb.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, fb.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // fb.v
    public <R> fb.u create(final fb.g gVar, final mb.a<R> aVar) {
        fb.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            fb.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new fb.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private fb.u getDelegate(Class<?> cls3) {
                fb.u uVar = (fb.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (fb.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // fb.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(nb.a aVar3) {
                boolean z10;
                fb.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (fb.i) ib.h1.z.read(aVar3);
                        } catch (EOFException e) {
                            e = e;
                            if (!z10) {
                                throw new fb.j(e);
                            }
                            iVar = fb.k.a;
                            iVar.getClass();
                            if (iVar instanceof fb.l) {
                            }
                        }
                    } catch (EOFException e10) {
                        e = e10;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof fb.l) {
                        if (iVar instanceof fb.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    fb.i iVar2 = (fb.i) iVar.h().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new androidx.car.app.j("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String m10 = iVar2.m();
                    fb.u uVar = (fb.u) linkedHashMap.get(m10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new mb.a(Class.forName(m10)));
                        } catch (ClassNotFoundException e11) {
                            throw new androidx.car.app.j(b10.j("Cannot find class ", m10), e11);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (NumberFormatException e12) {
                    throw new fb.j(e12);
                } catch (nb.c e13) {
                    throw new fb.j(e13);
                } catch (IOException e14) {
                    throw new fb.j(e14);
                }
            }

            @Override // fb.u
            public void write(nb.b bVar, R r6) {
                Class<?> cls3 = r6.getClass();
                String simpleName = cls3.getSimpleName();
                fb.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                fb.i jsonTree = delegate.toJsonTree(r6);
                jsonTree.getClass();
                if (!(jsonTree instanceof fb.l)) {
                    hb.d.l(jsonTree, bVar);
                    return;
                }
                hb.m mVar = jsonTree.h().a;
                if (mVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                fb.l lVar = new fb.l();
                lVar.n(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new fb.m(simpleName));
                Iterator it = ((hb.k) mVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar.n((String) entry.getKey(), (fb.i) entry.getValue());
                }
                hb.d.l(lVar, bVar);
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

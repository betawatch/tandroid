package org.telegram.messenger;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class RuntimeClassNameTypeAdapterFactory<T> implements db.v {
    private final Class<?> baseType;
    private final db.a exclusionStrategy;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeClassNameTypeAdapterFactory(Class<?> cls, String str, db.a aVar) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.exclusionStrategy = aVar;
    }

    public static <T> RuntimeClassNameTypeAdapterFactory<T> of(Class<T> cls, String str, db.a aVar) {
        return new RuntimeClassNameTypeAdapterFactory<>(cls, str, aVar);
    }

    @Override // db.v
    public <R> db.u create(final db.g gVar, final kb.a<R> aVar) {
        db.a aVar2 = this.exclusionStrategy;
        Class cls = aVar.a;
        Class cls2 = aVar.a;
        if (aVar2.shouldSkipClass(cls.getClass())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Object.class.isAssignableFrom(cls2)) {
            db.u c10 = gVar.c(this, aVar);
            linkedHashMap.put(cls2.getSimpleName(), c10);
            linkedHashMap2.put(cls2, c10);
        }
        return new db.u() { // from class: org.telegram.messenger.RuntimeClassNameTypeAdapterFactory.1
            private db.u getDelegate(Class<?> cls3) {
                db.u uVar = (db.u) linkedHashMap2.get(cls3);
                if (uVar != null) {
                    return uVar;
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Class) entry.getKey()).isAssignableFrom(cls3)) {
                        return (db.u) entry.getValue();
                    }
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
            /* JADX WARN: Type inference failed for: r4v12, types: [R, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v8, types: [R, java.lang.Object] */
            @Override // db.u
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public R read(lb.a aVar3) {
                boolean z10;
                db.i iVar;
                try {
                    try {
                        aVar3.x();
                        z10 = false;
                        try {
                            iVar = (db.i) gb.h1.z.read(aVar3);
                        } catch (EOFException e7) {
                            e = e7;
                            if (!z10) {
                                throw new db.j(e);
                            }
                            iVar = db.k.a;
                            iVar.getClass();
                            if (iVar instanceof db.l) {
                            }
                        }
                    } catch (EOFException e10) {
                        e = e10;
                        z10 = true;
                    }
                    iVar.getClass();
                    if (iVar instanceof db.l) {
                        if (iVar instanceof db.k) {
                            return null;
                        }
                        return gVar.c(RuntimeClassNameTypeAdapterFactory.this, aVar).fromJsonTree(iVar);
                    }
                    db.i iVar2 = (db.i) iVar.i().a.remove(RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    if (iVar2 == null) {
                        throw new androidx.car.app.j("cannot deserialize " + RuntimeClassNameTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                    }
                    String n10 = iVar2.n();
                    db.u uVar = (db.u) linkedHashMap.get(n10);
                    if (uVar == null) {
                        try {
                            uVar = gVar.c(RuntimeClassNameTypeAdapterFactory.this, new kb.a(Class.forName(n10)));
                        } catch (ClassNotFoundException e11) {
                            throw new androidx.car.app.j(org.telegram.ui.Cells.p6.i("Cannot find class ", n10), e11);
                        }
                    }
                    return uVar.fromJsonTree(iVar);
                } catch (NumberFormatException e12) {
                    throw new db.j(e12);
                } catch (lb.c e13) {
                    throw new db.j(e13);
                } catch (IOException e14) {
                    throw new db.j(e14);
                }
            }

            @Override // db.u
            public void write(lb.b bVar, R r10) {
                Class<?> cls3 = r10.getClass();
                String simpleName = cls3.getSimpleName();
                db.u delegate = getDelegate(cls3);
                if (delegate == null) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + "; did you forget to register a subtype?");
                }
                db.i jsonTree = delegate.toJsonTree(r10);
                jsonTree.getClass();
                if (!(jsonTree instanceof db.l)) {
                    fb.d.l(jsonTree, bVar);
                    return;
                }
                fb.m mVar = jsonTree.i().a;
                if (mVar.containsKey(RuntimeClassNameTypeAdapterFactory.this.typeFieldName)) {
                    throw new androidx.car.app.j("cannot serialize " + cls3.getSimpleName() + " because it already defines a field named " + RuntimeClassNameTypeAdapterFactory.this.typeFieldName);
                }
                db.l lVar = new db.l();
                lVar.o(RuntimeClassNameTypeAdapterFactory.this.typeFieldName, new db.m(simpleName));
                Iterator it = ((fb.k) mVar.entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    lVar.o((String) entry.getKey(), (db.i) entry.getValue());
                }
                fb.d.l(lVar, bVar);
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

package com.google.android.gms.internal.cast;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static boolean a(String str) {
        b5.b bVar = b5.m.a;
        Set<b5.e> unmodifiableSet = DesugarCollections.unmodifiableSet(b5.c.c);
        HashSet hashSet = new HashSet();
        for (b5.e eVar : unmodifiableSet) {
            if (((b5.c) eVar).a.equals(str)) {
                hashSet.add(eVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b5.c cVar = (b5.c) ((b5.e) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }
}

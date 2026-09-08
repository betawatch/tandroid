package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yy0 extends ArrayList {
    public final Class a;
    public final Class b;

    public yy0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m2.t i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new m2.t(objArr, objArr2);
    }
}

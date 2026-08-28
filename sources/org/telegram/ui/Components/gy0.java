package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gy0 extends ArrayList {
    public final Class a;
    public final Class b;

    public gy0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j4.c i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = ((Pair) get(i9)).first;
            objArr2[i9] = ((Pair) get(i9)).second;
        }
        return new j4.c(objArr, objArr2);
    }
}

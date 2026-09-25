package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jz0 extends ArrayList {
    public final Class a;
    public final Class b;

    public jz0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final la.h i() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = ((Pair) get(i10)).first;
            objArr2[i10] = ((Pair) get(i10)).second;
        }
        return new la.h(objArr, objArr2);
    }
}

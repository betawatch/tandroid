package org.telegram.ui.Components;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ex0 extends ArrayList {
    public final Class a;
    public final Class b;

    public ex0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h6.m f() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i7 = 0; i7 < size; i7++) {
            objArr[i7] = ((Pair) get(i7)).first;
            objArr2[i7] = ((Pair) get(i7)).second;
        }
        return new h6.m(objArr, objArr2);
    }
}

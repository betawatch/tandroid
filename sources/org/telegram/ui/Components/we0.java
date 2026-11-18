package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class we0 implements Comparator {
    public final /* synthetic */ df0 a;

    public we0(df0 df0Var) {
        this.a = df0Var;
    }

    public final int a(cf0 cf0Var) {
        df0 df0Var = this.a;
        int size = df0Var.t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(df0Var.t1.answers.get(i7).option, cf0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((cf0) obj);
        int a11 = a((cf0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

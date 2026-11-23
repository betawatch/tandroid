package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xe0 implements Comparator {
    public final /* synthetic */ ef0 a;

    public xe0(ef0 ef0Var) {
        this.a = ef0Var;
    }

    public final int a(df0 df0Var) {
        ef0 ef0Var = this.a;
        int size = ef0Var.t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(ef0Var.t1.answers.get(i7).option, df0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((df0) obj);
        int a11 = a((df0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ye0 implements Comparator {
    public final /* synthetic */ ff0 a;

    public ye0(ff0 ff0Var) {
        this.a = ff0Var;
    }

    public final int a(ef0 ef0Var) {
        ff0 ff0Var = this.a;
        int size = ff0Var.t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(ff0Var.t1.answers.get(i7).option, ef0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((ef0) obj);
        int a11 = a((ef0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

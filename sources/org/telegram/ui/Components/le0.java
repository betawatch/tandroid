package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class le0 implements Comparator {
    public final /* synthetic */ se0 a;

    public le0(se0 se0Var) {
        this.a = se0Var;
    }

    public final int a(re0 re0Var) {
        se0 se0Var = this.a;
        int size = se0Var.q1.answers.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (Arrays.equals(se0Var.q1.answers.get(i3).option, re0Var.d)) {
                return i3;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((re0) obj);
        int a11 = a((re0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

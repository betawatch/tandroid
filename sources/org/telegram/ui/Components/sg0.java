package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class sg0 implements Comparator {
    public final /* synthetic */ ah0 a;

    public sg0(ah0 ah0Var) {
        this.a = ah0Var;
    }

    public final int a(zg0 zg0Var) {
        ah0 ah0Var = this.a;
        int size = ah0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(ah0Var.r.answers.get(i10).option, zg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((zg0) obj);
        int a10 = a((zg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

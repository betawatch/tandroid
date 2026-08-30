package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class og0 implements Comparator {
    public final /* synthetic */ vg0 a;

    public og0(vg0 vg0Var) {
        this.a = vg0Var;
    }

    public final int a(ug0 ug0Var) {
        vg0 vg0Var = this.a;
        int size = vg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(vg0Var.r.answers.get(i10).option, ug0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((ug0) obj);
        int a10 = a((ug0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

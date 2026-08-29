package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eg0 implements Comparator {
    public final /* synthetic */ lg0 a;

    public eg0(lg0 lg0Var) {
        this.a = lg0Var;
    }

    public final int a(kg0 kg0Var) {
        lg0 lg0Var = this.a;
        int size = lg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(lg0Var.r.answers.get(i10).option, kg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((kg0) obj);
        int a10 = a((kg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

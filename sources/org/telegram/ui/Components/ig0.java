package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ig0 implements Comparator {
    public final /* synthetic */ qg0 a;

    public ig0(qg0 qg0Var) {
        this.a = qg0Var;
    }

    public final int a(pg0 pg0Var) {
        qg0 qg0Var = this.a;
        int size = qg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(qg0Var.r.answers.get(i10).option, pg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((pg0) obj);
        int a10 = a((pg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

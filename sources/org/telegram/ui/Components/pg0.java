package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pg0 implements Comparator {
    public final /* synthetic */ wg0 a;

    public pg0(wg0 wg0Var) {
        this.a = wg0Var;
    }

    public final int a(vg0 vg0Var) {
        wg0 wg0Var = this.a;
        int size = wg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(wg0Var.r.answers.get(i10).option, vg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((vg0) obj);
        int a10 = a((vg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

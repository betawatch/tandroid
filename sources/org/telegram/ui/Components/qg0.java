package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qg0 implements Comparator {
    public final /* synthetic */ xg0 a;

    public qg0(xg0 xg0Var) {
        this.a = xg0Var;
    }

    public final int a(wg0 wg0Var) {
        xg0 xg0Var = this.a;
        int size = xg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(xg0Var.r.answers.get(i10).option, wg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((wg0) obj);
        int a10 = a((wg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

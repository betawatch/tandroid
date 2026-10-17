package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ch0 implements Comparator {
    public final /* synthetic */ kh0 a;

    public ch0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    public final int a(jh0 jh0Var) {
        kh0 kh0Var = this.a;
        int size = kh0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(kh0Var.r.answers.get(i10).option, jh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((jh0) obj);
        int a10 = a((jh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

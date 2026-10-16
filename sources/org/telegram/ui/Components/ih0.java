package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ih0 implements Comparator {
    public final /* synthetic */ qh0 a;

    public ih0(qh0 qh0Var) {
        this.a = qh0Var;
    }

    public final int a(ph0 ph0Var) {
        qh0 qh0Var = this.a;
        int size = qh0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(qh0Var.r.answers.get(i10).option, ph0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((ph0) obj);
        int a10 = a((ph0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

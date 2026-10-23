package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class gh0 implements Comparator {
    public final /* synthetic */ oh0 a;

    public gh0(oh0 oh0Var) {
        this.a = oh0Var;
    }

    public final int a(nh0 nh0Var) {
        oh0 oh0Var = this.a;
        int size = oh0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(oh0Var.r.answers.get(i10).option, nh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((nh0) obj);
        int a10 = a((nh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

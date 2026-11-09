package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ke0 implements Comparator {
    public final /* synthetic */ re0 a;

    public ke0(re0 re0Var) {
        this.a = re0Var;
    }

    public final int a(qe0 qe0Var) {
        re0 re0Var = this.a;
        int size = re0Var.p1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(re0Var.p1.answers.get(i7).option, qe0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((qe0) obj);
        int a11 = a((qe0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

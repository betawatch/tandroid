package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class me0 implements Comparator {
    public final /* synthetic */ te0 a;

    public me0(te0 te0Var) {
        this.a = te0Var;
    }

    public final int a(se0 se0Var) {
        te0 te0Var = this.a;
        int size = te0Var.t1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(te0Var.t1.answers.get(i7).option, se0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((se0) obj);
        int a11 = a((se0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

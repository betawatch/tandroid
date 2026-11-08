package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class je0 implements Comparator {
    public final /* synthetic */ qe0 a;

    public je0(qe0 qe0Var) {
        this.a = qe0Var;
    }

    public final int a(pe0 pe0Var) {
        qe0 qe0Var = this.a;
        int size = qe0Var.p1.answers.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Arrays.equals(qe0Var.p1.answers.get(i7).option, pe0Var.d)) {
                return i7;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a10 = a((pe0) obj);
        int a11 = a((pe0) obj2);
        if (a10 > a11) {
            return 1;
        }
        return a10 < a11 ? -1 : 0;
    }
}

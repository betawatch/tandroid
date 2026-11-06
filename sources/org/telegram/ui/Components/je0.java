package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

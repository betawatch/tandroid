package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class dh0 implements Comparator {
    public final /* synthetic */ lh0 a;

    public dh0(lh0 lh0Var) {
        this.a = lh0Var;
    }

    public final int a(kh0 kh0Var) {
        lh0 lh0Var = this.a;
        int size = lh0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(lh0Var.r.answers.get(i10).option, kh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((kh0) obj);
        int a10 = a((kh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

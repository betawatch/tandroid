package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class hg0 implements Comparator {
    public final /* synthetic */ pg0 a;

    public hg0(pg0 pg0Var) {
        this.a = pg0Var;
    }

    public final int a(og0 og0Var) {
        pg0 pg0Var = this.a;
        int size = pg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(pg0Var.r.answers.get(i10).option, og0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((og0) obj);
        int a10 = a((og0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

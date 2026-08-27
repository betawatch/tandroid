package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vf0 implements Comparator {
    public final /* synthetic */ cg0 a;

    public vf0(cg0 cg0Var) {
        this.a = cg0Var;
    }

    public final int a(bg0 bg0Var) {
        cg0 cg0Var = this.a;
        int size = cg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(cg0Var.r.answers.get(i10).option, bg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((bg0) obj);
        int a3 = a((bg0) obj2);
        if (a2 > a3) {
            return 1;
        }
        return a2 < a3 ? -1 : 0;
    }
}

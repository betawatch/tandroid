package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class tg0 implements Comparator {
    public final /* synthetic */ ch0 a;

    public tg0(ch0 ch0Var) {
        this.a = ch0Var;
    }

    public final int a(bh0 bh0Var) {
        ch0 ch0Var = this.a;
        int size = ch0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(ch0Var.r.answers.get(i10).option, bh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((bh0) obj);
        int a10 = a((bh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

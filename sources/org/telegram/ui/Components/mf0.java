package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mf0 implements Comparator {
    public final /* synthetic */ tf0 a;

    public mf0(tf0 tf0Var) {
        this.a = tf0Var;
    }

    public final int a(sf0 sf0Var) {
        tf0 tf0Var = this.a;
        int size = tf0Var.p1.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(tf0Var.p1.answers.get(i10).option, sf0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((sf0) obj);
        int a10 = a((sf0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

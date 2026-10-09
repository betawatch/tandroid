package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jh0 implements Comparator {
    public final /* synthetic */ sh0 a;

    public jh0(sh0 sh0Var) {
        this.a = sh0Var;
    }

    public final int a(rh0 rh0Var) {
        sh0 sh0Var = this.a;
        int size = sh0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(sh0Var.r.answers.get(i10).option, rh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((rh0) obj);
        int a10 = a((rh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

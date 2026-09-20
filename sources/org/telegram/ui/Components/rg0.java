package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class rg0 implements Comparator {
    public final /* synthetic */ zg0 a;

    public rg0(zg0 zg0Var) {
        this.a = zg0Var;
    }

    public final int a(yg0 yg0Var) {
        zg0 zg0Var = this.a;
        int size = zg0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(zg0Var.r.answers.get(i10).option, yg0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((yg0) obj);
        int a10 = a((yg0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

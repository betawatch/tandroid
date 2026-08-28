package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sf0 implements Comparator {
    public final /* synthetic */ ag0 a;

    public sf0(ag0 ag0Var) {
        this.a = ag0Var;
    }

    public final int a(zf0 zf0Var) {
        ag0 ag0Var = this.a;
        int size = ag0Var.r.answers.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (Arrays.equals(ag0Var.r.answers.get(i9).option, zf0Var.d)) {
                return i9;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((zf0) obj);
        int a3 = a((zf0) obj2);
        if (a2 > a3) {
            return 1;
        }
        return a2 < a3 ? -1 : 0;
    }
}

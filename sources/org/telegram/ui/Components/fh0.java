package org.telegram.ui.Components;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fh0 implements Comparator {
    public final /* synthetic */ nh0 a;

    public fh0(nh0 nh0Var) {
        this.a = nh0Var;
    }

    public final int a(mh0 mh0Var) {
        nh0 nh0Var = this.a;
        int size = nh0Var.r.answers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (Arrays.equals(nh0Var.r.answers.get(i10).option, mh0Var.d)) {
                return i10;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a2 = a((mh0) obj);
        int a10 = a((mh0) obj2);
        if (a2 > a10) {
            return 1;
        }
        return a2 < a10 ? -1 : 0;
    }
}

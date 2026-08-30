package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final int c = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public final /* synthetic */ l1 d;

    public k1(l1 l1Var) {
        this.d = l1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f10 = 0.0f;
        while (i10 < i11) {
            f10 += fArr[i10];
            i10++;
        }
        return this.c / f10;
    }
}

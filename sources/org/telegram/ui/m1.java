package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final int c = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public final /* synthetic */ n1 d;

    public m1(n1 n1Var) {
        this.d = n1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f9 = 0.0f;
        while (i10 < i11) {
            f9 += fArr[i10];
            i10++;
        }
        return this.c / f9;
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class j1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final int c = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public final /* synthetic */ k1 d;

    public j1(k1 k1Var) {
        this.d = k1Var;
    }

    public final float a(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.c / f7;
    }
}

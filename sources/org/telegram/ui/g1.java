package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final int c = 1000;
    public final /* synthetic */ h1 d;

    public g1(h1 h1Var) {
        this.d = h1Var;
    }

    public final float a(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return this.c / f10;
    }
}

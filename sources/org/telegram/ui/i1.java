package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class i1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final int c = 1000;
    public final /* synthetic */ j1 d;

    public i1(j1 j1Var) {
        this.d = j1Var;
    }

    public final float a(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return this.c / f7;
    }
}

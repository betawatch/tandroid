package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g4 {
    public ArrayList a;
    public ArrayList b;
    public HashMap c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public float i;

    public final float a(float[] fArr, int i10, int i11) {
        float f9 = 0.0f;
        while (i10 < i11) {
            f9 += fArr[i10];
            i10++;
        }
        return this.h / f9;
    }
}

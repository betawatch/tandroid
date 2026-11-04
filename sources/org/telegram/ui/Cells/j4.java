package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j4 {
    public ArrayList a;
    public ArrayList b;
    public HashMap c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public float i;

    public final float a(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return this.h / f10;
    }
}

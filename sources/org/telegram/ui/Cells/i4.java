package org.telegram.ui.Cells;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i4 {
    public ArrayList a;
    public ArrayList b;
    public HashMap c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public float i;

    public final float a(float[] fArr, int i9, int i10) {
        float f10 = 0.0f;
        while (i9 < i10) {
            f10 += fArr[i9];
            i9++;
        }
        return this.h / f10;
    }
}

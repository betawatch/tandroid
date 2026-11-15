package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

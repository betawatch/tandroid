package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final int c = MediaDataController.MAX_STYLE_RUNS_COUNT;
    public final /* synthetic */ m1 d;

    public l1(m1 m1Var) {
        this.d = m1Var;
    }

    public final float a(float[] fArr, int i9, int i10) {
        float f10 = 0.0f;
        while (i9 < i10) {
            f10 += fArr[i9];
            i9++;
        }
        return this.c / f10;
    }
}

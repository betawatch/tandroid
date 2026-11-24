// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lv {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final /* synthetic */ mv c;

    public lv(mv mvVar) {
        this.c = mvVar;
    }

    public final float a(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return 1000.0f / f;
    }
}

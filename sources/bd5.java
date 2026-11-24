// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bd5 {
    public ArrayList a;
    public ArrayList b;
    public HashMap c;
    public int d;
    public int e;
    public int f;
    public float g;
    public short h;
    public float i;

    public final float a(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return this.h / f;
    }
}

// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fd5 {
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

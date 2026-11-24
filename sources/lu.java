// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lu {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final /* synthetic */ mu c;

    public lu(mu muVar) {
        this.c = muVar;
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

// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ms8 {
    public Paint a;
    public Paint b;
    public float c;
    public int d;
    public int e;
    public float f;

    public final void a(float f) {
        this.c = f;
        if (f < 0.0f) {
            this.c = 0.0f;
        } else if (f > 1.0f) {
            this.c = 1.0f;
        }
    }
}

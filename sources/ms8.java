// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

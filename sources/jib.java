// default package

import android.graphics.Path;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jib extends Path {
    public float a;

    @Override // android.graphics.Path
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        super.addRect(f, f2, f3, f4, direction);
        if (f4 > this.a) {
            this.a = f4;
        }
    }

    @Override // android.graphics.Path
    public final void reset() {
        super.reset();
        this.a = 0.0f;
    }
}

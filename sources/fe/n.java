package fe;

import c3.i0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class n {
    public float a;
    public float b;
    public float c;

    public n(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.b;
        float z10 = i0.z(this.c, f10, f7, f10);
        if (this.a == z10) {
            return false;
        }
        this.a = z10;
        return true;
    }

    public final boolean b(float f7) {
        return this.c != f7;
    }

    public final void c(boolean z10) {
        if (!z10) {
            this.b = this.a;
            return;
        }
        float f7 = this.c;
        this.a = f7;
        this.b = f7;
    }

    public final void d(float f7) {
        this.b = f7;
        this.c = f7;
        this.a = f7;
    }
}

package le;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class m {
    public float a;
    public float b;
    public float c;

    public m(float f7) {
        d(f7);
    }

    public final boolean a(float f7) {
        float f10 = this.b;
        float z10 = e2.z(this.c, f10, f7, f10);
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

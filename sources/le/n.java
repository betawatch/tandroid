package le;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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

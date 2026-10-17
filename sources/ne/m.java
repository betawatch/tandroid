package ne;

import com.google.android.gms.internal.cast.a6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        float x10 = a6.x(this.c, f10, f7, f10);
        if (this.a == x10) {
            return false;
        }
        this.a = x10;
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

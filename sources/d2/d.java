package d2;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public d(int i10, int i11) {
        this.a = Color.red(i10);
        this.b = Color.green(i10);
        this.c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i10 = this.d;
        int g10 = i0.a.g(4.5f, -1, i10);
        int g11 = i0.a.g(3.0f, -1, i10);
        if (g10 != -1 && g11 != -1) {
            this.h = i0.a.k(-1, g10);
            this.g = i0.a.k(-1, g11);
            this.f = true;
            return;
        }
        int g12 = i0.a.g(4.5f, -16777216, i10);
        int g13 = i0.a.g(3.0f, -16777216, i10);
        if (g12 == -1 || g13 == -1) {
            this.h = g10 != -1 ? i0.a.k(-1, g10) : i0.a.k(-16777216, g12);
            this.g = g11 != -1 ? i0.a.k(-1, g11) : i0.a.k(-16777216, g13);
            this.f = true;
        } else {
            this.h = i0.a.k(-16777216, g12);
            this.g = i0.a.k(-16777216, g13);
            this.f = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        i0.a.b(this.i, this.a, this.b, this.c);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.e == dVar.e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(d.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}

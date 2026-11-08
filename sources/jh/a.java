package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ij;
import org.telegram.ui.aj;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(ij ijVar) {
        if (ijVar == null) {
            return false;
        }
        if (ijVar.f1() != this.b) {
            return this.c != 0 && ijVar.d1() == this.c;
        }
        return true;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i7, long j3) {
        if (this.b == i7 && this.c == j3) {
            return false;
        }
        this.b = i7;
        this.c = j3;
        if (i7 != 0) {
            return true;
        }
        this.e = false;
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(aj ajVar) {
        this.a = ajVar;
    }
}

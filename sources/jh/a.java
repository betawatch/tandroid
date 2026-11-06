package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ij;
import org.telegram.ui.aj;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

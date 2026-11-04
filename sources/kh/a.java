package kh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.zi;
import org.telegram.ui.wi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(zi ziVar) {
        if (ziVar == null) {
            return false;
        }
        if (ziVar.f1() != this.b) {
            return this.c != 0 && ziVar.d1() == this.c;
        }
        return true;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i3, long j10) {
        if (this.b == i3 && this.c == j10) {
            return false;
        }
        this.b = i3;
        this.c = j10;
        if (i3 != 0) {
            return true;
        }
        this.e = false;
        return true;
    }

    public final void d(int i3) {
        this.d = i3;
    }

    public final void e(wi wiVar) {
        this.a = wiVar;
    }
}

package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ij;
import org.telegram.ui.cj;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        if (ijVar.e1() != this.b) {
            return this.c != 0 && ijVar.c1() == this.c;
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

    public final void e(cj cjVar) {
        this.a = cjVar;
    }
}

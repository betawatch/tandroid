package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.bj;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(gj gjVar) {
        if (gjVar == null) {
            return false;
        }
        if (gjVar.e1() != this.b) {
            return this.c != 0 && gjVar.c1() == this.c;
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

    public final void e(bj bjVar) {
        this.a = bjVar;
    }
}

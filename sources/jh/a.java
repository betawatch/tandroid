package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.bj;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class a {
    public RecyclerView a;
    public int b;
    public long c;
    public int d;
    public boolean e;

    public final boolean a(fj fjVar) {
        if (fjVar == null) {
            return false;
        }
        if (fjVar.e1() != this.b) {
            return this.c != 0 && fjVar.c1() == this.c;
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

package f2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class m1 {
    public static final List u = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int l;
    public RecyclerView t;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public m1 j = null;
    public m1 k = null;
    public ArrayList m = null;
    public List n = null;
    public int o = 0;
    public bf.f p = null;
    public boolean q = false;
    public int r = 0;
    public int s = -1;

    public m1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void a(int i10) {
        this.l = i10 | this.l;
    }

    public final int b() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.g;
        return i10 == -1 ? this.c : i10;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.l & 1024) != 0 || (arrayList = this.m) == null || arrayList.size() == 0) ? u : this.n;
    }

    public final boolean e(int i10) {
        return (i10 & this.l) != 0;
    }

    public final boolean f() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.t) ? false : true;
    }

    public final boolean g() {
        return (this.l & 1) != 0;
    }

    public final boolean h() {
        return (this.l & 4) != 0;
    }

    public final boolean i() {
        if ((this.l & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = r0.j0.a;
        return !this.a.hasTransientState();
    }

    public final boolean j() {
        return (this.l & 8) != 0;
    }

    public final boolean k() {
        return this.p != null;
    }

    public final boolean l() {
        return (this.l & 256) != 0;
    }

    public final boolean m() {
        return (this.l & 2) != 0;
    }

    public final void n(int i10, boolean z4) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z4) {
            this.g += i10;
        }
        this.c += i10;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((x0) view.getLayoutParams()).c = true;
        }
    }

    public final void o() {
        this.l = 0;
        int i10 = this.c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.o = 0;
        this.j = null;
        this.k = null;
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.l &= -1025;
        this.r = 0;
        this.s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.l = (i10 & i11) | (this.l & (~i11));
    }

    public final void q(boolean z4) {
        int i10 = this.o;
        int i11 = z4 ? i10 - 1 : i10 + 1;
        this.o = i11;
        if (i11 < 0) {
            this.o = 0;
            if (BuildVars.DEBUG_VERSION) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z4 && i11 == 1) {
            this.l |= 16;
        } else if (z4 && i11 == 0) {
            this.l &= -17;
        }
    }

    public final boolean r() {
        return (this.l & 128) != 0;
    }

    public final boolean s() {
        return (this.l & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.q ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.l & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (r()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.o + ")");
        }
        if ((this.l & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}

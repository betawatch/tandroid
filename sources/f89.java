// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class f89 {
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
    public f89 j = null;
    public f89 k = null;
    public ArrayList m = null;
    public List n = null;
    public int o = 0;
    public oh2 p = null;
    public boolean q = false;
    public int r = 0;
    public int s = -1;

    public f89(View view) {
        if (view != null) {
            this.a = view;
        } else {
            lq5.j("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.l |= i;
    }

    public final int b() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.O(this);
    }

    public final int c() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.l & 1024) != 0 || (arrayList = this.m) == null || arrayList.size() == 0) ? u : this.n;
    }

    public final boolean e(int i) {
        return (this.l & i) != 0;
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
        WeakHashMap weakHashMap = ihc.a;
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

    public final void n(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((r79) view.getLayoutParams()).c = true;
        }
    }

    public final void o() {
        this.l = 0;
        int i = this.c;
        if (i != -1) {
            this.h = i;
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
        RecyclerView.n(this);
    }

    public final void p(int i, int i2) {
        this.l = (this.l & (~i2)) | (i & i2);
    }

    public final void q(boolean z) {
        int i = this.o;
        int i2 = z ? i - 1 : i + 1;
        this.o = i2;
        if (i2 < 0) {
            this.o = 0;
            boolean z2 = f11.a;
            grb.h(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
        } else if (z) {
            if (i2 == 0) {
                this.l &= -17;
            }
        } else if (i2 == 1) {
            this.l |= 16;
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

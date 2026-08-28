package o5;

import android.os.Looper;
import android.util.SparseIntArray;
import c2.u0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kh.j2;
import n5.d0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public long b;
    public final h c;
    public ArrayList d;
    public final SparseIntArray e;
    public final r f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final u0 i;
    public final j2 j;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final q5.b a = new q5.b("MediaQueue", null);

    public c(h hVar) {
        this.c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new u0(Looper.getMainLooper(), 1);
        int i9 = 1;
        this.j = new j2(this, i9);
        hVar.p(new d0(this, i9));
        this.f = new r(this);
        this.b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.m) {
            try {
                Iterator it = cVar.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.e;
        sparseIntArray.clear();
        for (int i9 = 0; i9 < cVar.d.size(); i9++) {
            sparseIntArray.put(((Integer) cVar.d.get(i9)).intValue(), i9);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        this.i.removeCallbacks(this.j);
        this.h.clear();
        BasePendingResult basePendingResult = this.l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        x5.l.e("Must be called from the main thread.");
        if (this.b != 0 && (basePendingResult = this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.k = null;
            }
            h hVar = this.c;
            hVar.getClass();
            x5.l.e("Must be called from the main thread.");
            if (hVar.w()) {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            } else {
                basePendingResult2 = h.t();
            }
            this.l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        m5.q e10 = this.c.e();
        if (e10 == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e10.a;
        int i9 = mediaInfo == null ? -1 : mediaInfo.b;
        int i10 = e10.e;
        int i11 = e10.f;
        int i12 = e10.w;
        if (i10 == 1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return 0L;
                    }
                } else if (i9 != 2) {
                    return 0L;
                }
            }
            if (i12 == 0) {
                return 0L;
            }
        }
        return e10.b;
    }

    public final void f() {
        synchronized (this.m) {
            try {
                Iterator it = this.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.m) {
            try {
                Iterator it = this.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.m) {
            try {
                Iterator it = this.m.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package e6;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.c0;
import di.p2;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c {
    public long b;
    public final h c;
    public ArrayList d;
    public final SparseIntArray e;
    public final s f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final c0 i;
    public final p2 j;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final g6.b a = new g6.b("MediaQueue", null);

    public c(h hVar) {
        this.c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new c0(Looper.getMainLooper(), 0);
        int i10 = 1;
        this.j = new p2(this, i10);
        hVar.p(new d6.c0(this, i10));
        this.f = new s(this);
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
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
        n6.l.e("Must be called from the main thread.");
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
            n6.l.e("Must be called from the main thread.");
            if (hVar.w()) {
                j jVar = new j(hVar);
                h.x(jVar);
                basePendingResult2 = jVar;
            } else {
                basePendingResult2 = h.t();
            }
            this.l = basePendingResult2;
            basePendingResult2.i(new r(this, 0));
        }
    }

    public final long e() {
        c6.q e7 = this.c.e();
        if (e7 == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e7.a;
        int i10 = mediaInfo == null ? -1 : mediaInfo.b;
        int i11 = e7.e;
        int i12 = e7.f;
        int i13 = e7.w;
        if (i11 == 1) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        return 0L;
                    }
                } else if (i10 != 2) {
                    return 0L;
                }
            }
            if (i13 == 0) {
                return 0L;
            }
        }
        return e7.b;
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
            } catch (Throwable th2) {
                throw th2;
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
            } catch (Throwable th2) {
                throw th2;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

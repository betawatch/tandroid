package o5;

import android.os.Looper;
import android.util.SparseIntArray;
import c2.t0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lh.h2;
import m5.r;
import n5.d0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c {
    public long b;
    public final h c;
    public ArrayList d;
    public final SparseIntArray e;
    public final q f;
    public final ArrayList g;
    public final ArrayDeque h;
    public final t0 i;
    public final h2 j;
    public BasePendingResult k;
    public BasePendingResult l;
    public final Set m = DesugarCollections.synchronizedSet(new HashSet());
    public final r5.b a = new r5.b("MediaQueue", null);

    public c(h hVar) {
        this.c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.i = new t0(Looper.getMainLooper(), 1);
        int i10 = 1;
        this.j = new h2(this, i10);
        hVar.p(new d0(this, i10));
        this.f = new q(this);
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
        y5.l.e("Must be called from the main thread.");
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
            y5.l.e("Must be called from the main thread.");
            if (hVar.w()) {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            } else {
                basePendingResult2 = h.t();
            }
            this.l = basePendingResult2;
            basePendingResult2.i(new p(this, 0));
        }
    }

    public final long e() {
        r e9 = this.c.e();
        if (e9 == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e9.a;
        int i10 = mediaInfo == null ? -1 : mediaInfo.b;
        int i11 = e9.e;
        int i12 = e9.f;
        int i13 = e9.w;
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
        return e9.b;
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

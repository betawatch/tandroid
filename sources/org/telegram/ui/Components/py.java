package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class py implements jy {
    public String a;
    public int b;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList(0);
    public final ArrayList s = new ArrayList(0);
    public final LongSparseArray w = new LongSparseArray(0);
    public final /* synthetic */ qy x;

    public py(qy qyVar) {
        this.x = qyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] G0 = org.telegram.messenger.i0.G0();
        org.telegram.messenger.ui.b0(this.x.Q.c1).Z1(false, G0.length == 0 ? "" : G0[0], this.a, new ll(this, z10, runnable, 1), z10);
    }

    @Override // org.telegram.ui.Components.jy
    public final void e() {
        fw fwVar = this.x.Q.G0;
        if (fwVar.F) {
            return;
        }
        fwVar.e(true);
        Utilities.B(new ho(this, 17), new oy(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        qy qyVar = this.x;
        vy vyVar = qyVar.Q;
        if (TextUtils.isEmpty(qyVar.N)) {
            s4.g0 adapter = vyVar.D0.getAdapter();
            ny nyVar = vyVar.y0;
            if (adapter != nyVar) {
                vyVar.D0.setAdapter(nyVar);
            }
            qyVar.f();
            return;
        }
        int i10 = 1;
        int i11 = qyVar.M + 1;
        qyVar.M = i11;
        this.b = i11;
        this.a = qyVar.N;
        qyVar.D = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        vyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new ho(this, 17), new oy(this, i10));
        } else {
            Utilities.B(new ho(this, 17), new oy(this, 2), new oy(this, 3), new oy(this, 4), new oy(this, 5), new oy(this, 6), new oy(this, 7));
        }
    }
}

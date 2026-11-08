package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ay implements vx {
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
    public final /* synthetic */ cy x;

    public ay(cy cyVar) {
        this.x = cyVar;
    }

    public final void a(Runnable runnable, boolean z9) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.ui.b0(this.x.Q.c1).Z1(false, G0.length == 0 ? "" : G0[0], this.a, new fi.nb(this, z9, runnable, 2), z9);
    }

    @Override // org.telegram.ui.Components.vx
    public final void e() {
        tv tvVar = this.x.Q.G0;
        if (tvVar.F) {
            return;
        }
        tvVar.e(true);
        Utilities.B(new gp(this, 15), new zx(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        cy cyVar = this.x;
        hy hyVar = cyVar.Q;
        if (TextUtils.isEmpty(cyVar.N)) {
            v4.g0 adapter = hyVar.D0.getAdapter();
            yx yxVar = hyVar.y0;
            if (adapter != yxVar) {
                hyVar.D0.setAdapter(yxVar);
            }
            cyVar.f();
            return;
        }
        int i7 = 1;
        int i10 = cyVar.M + 1;
        cyVar.M = i10;
        this.b = i10;
        this.a = cyVar.N;
        cyVar.D = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        hyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new gp(this, 15), new zx(this, i7));
        } else {
            Utilities.B(new gp(this, 15), new zx(this, 2), new zx(this, 3), new zx(this, 4), new zx(this, 5), new zx(this, 6), new zx(this, 7));
        }
    }
}

package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xx implements sx {
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
    public final /* synthetic */ yx x;

    public xx(yx yxVar) {
        this.x = yxVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.li.b0(this.x.R.d1).Z1(false, G0.length == 0 ? "" : G0[0], this.a, new gi.nb(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.sx
    public final void d() {
        rv rvVar = this.x.R.H0;
        if (rvVar.G) {
            return;
        }
        rvVar.e(true);
        Utilities.B(new gp(this, 15), new wx(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        yx yxVar = this.x;
        ey eyVar = yxVar.R;
        if (TextUtils.isEmpty(yxVar.O)) {
            u4.h0 adapter = eyVar.E0.getAdapter();
            vx vxVar = eyVar.z0;
            if (adapter != vxVar) {
                eyVar.E0.setAdapter(vxVar);
            }
            yxVar.f();
            return;
        }
        int i3 = 1;
        int i10 = yxVar.N + 1;
        yxVar.N = i10;
        this.b = i10;
        this.a = yxVar.O;
        yxVar.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        eyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new gp(this, 15), new wx(this, i3));
        } else {
            Utilities.B(new gp(this, 15), new wx(this, 2), new wx(this, 3), new wx(this, 4), new wx(this, 5), new wx(this, 6), new wx(this, 7));
        }
    }
}

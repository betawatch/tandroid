package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fy implements zx {
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
    public final /* synthetic */ gy x;

    public fy(gy gyVar) {
        this.x = gyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.si.b0(this.x.R.d1).Z1(false, G0.length == 0 ? "" : G0[0], this.a, new hi.kb(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.zx
    public final void e() {
        yv yvVar = this.x.R.H0;
        if (yvVar.G) {
            return;
        }
        yvVar.e(true);
        Utilities.B(new fo(this, 17), new ey(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        gy gyVar = this.x;
        ly lyVar = gyVar.R;
        if (TextUtils.isEmpty(gyVar.O)) {
            v4.h0 adapter = lyVar.E0.getAdapter();
            dy dyVar = lyVar.z0;
            if (adapter != dyVar) {
                lyVar.E0.setAdapter(dyVar);
            }
            gyVar.f();
            return;
        }
        int i7 = 1;
        int i10 = gyVar.N + 1;
        gyVar.N = i10;
        this.b = i10;
        this.a = gyVar.O;
        gyVar.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        lyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new fo(this, 17), new ey(this, i7));
        } else {
            Utilities.B(new fo(this, 17), new ey(this, 2), new ey(this, 3), new ey(this, 4), new ey(this, 5), new ey(this, 6), new ey(this, 7));
        }
    }
}

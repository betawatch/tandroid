package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ky implements ey {
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
    public final /* synthetic */ ly x;

    public ky(ly lyVar) {
        this.x = lyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.ri.d0(this.x.R.d1).e2(false, G0.length == 0 ? "" : G0[0], this.a, new hi.fc(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.ey
    public final void e() {
        dw dwVar = this.x.R.H0;
        if (dwVar.G) {
            return;
        }
        dwVar.e(true);
        Utilities.B(new lo(this, 17), new jy(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        ly lyVar = this.x;
        qy qyVar = lyVar.R;
        if (TextUtils.isEmpty(lyVar.O)) {
            v4.i0 adapter = qyVar.E0.getAdapter();
            iy iyVar = qyVar.z0;
            if (adapter != iyVar) {
                qyVar.E0.setAdapter(iyVar);
            }
            lyVar.f();
            return;
        }
        int i7 = 1;
        int i10 = lyVar.N + 1;
        lyVar.N = i10;
        this.b = i10;
        this.a = lyVar.O;
        lyVar.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        qyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new lo(this, 17), new jy(this, i7));
        } else {
            Utilities.B(new lo(this, 17), new jy(this, 2), new jy(this, 3), new jy(this, 4), new jy(this, 5), new jy(this, 6), new jy(this, 7));
        }
    }
}

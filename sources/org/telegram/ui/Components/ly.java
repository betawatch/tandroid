package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ly implements fy {
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
    public final /* synthetic */ my x;

    public ly(my myVar) {
        this.x = myVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.ri.d0(this.x.R.d1).e2(false, G0.length == 0 ? "" : G0[0], this.a, new hi.lb(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.fy
    public final void e() {
        ew ewVar = this.x.R.H0;
        if (ewVar.G) {
            return;
        }
        ewVar.e(true);
        Utilities.B(new mo(this, 17), new ky(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        my myVar = this.x;
        ry ryVar = myVar.R;
        if (TextUtils.isEmpty(myVar.O)) {
            v4.i0 adapter = ryVar.E0.getAdapter();
            jy jyVar = ryVar.z0;
            if (adapter != jyVar) {
                ryVar.E0.setAdapter(jyVar);
            }
            myVar.f();
            return;
        }
        int i7 = 1;
        int i10 = myVar.N + 1;
        myVar.N = i10;
        this.b = i10;
        this.a = myVar.O;
        myVar.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        ryVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new mo(this, 17), new ky(this, i7));
        } else {
            Utilities.B(new mo(this, 17), new ky(this, 2), new ky(this, 3), new ky(this, 4), new ky(this, 5), new ky(this, 6), new ky(this, 7));
        }
    }
}

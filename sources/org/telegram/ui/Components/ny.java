package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ny implements hy {
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
    public final /* synthetic */ oy x;

    public ny(oy oyVar) {
        this.x = oyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.si.d0(this.x.R.d1).e2(false, G0.length == 0 ? "" : G0[0], this.a, new hi.kb(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.hy
    public final void e() {
        gw gwVar = this.x.R.H0;
        if (gwVar.G) {
            return;
        }
        gwVar.e(true);
        Utilities.B(new oo(this, 17), new my(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        oy oyVar = this.x;
        ty tyVar = oyVar.R;
        if (TextUtils.isEmpty(oyVar.O)) {
            v4.i0 adapter = tyVar.E0.getAdapter();
            ly lyVar = tyVar.z0;
            if (adapter != lyVar) {
                tyVar.E0.setAdapter(lyVar);
            }
            oyVar.f();
            return;
        }
        int i7 = 1;
        int i10 = oyVar.N + 1;
        oyVar.N = i10;
        this.b = i10;
        this.a = oyVar.O;
        oyVar.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        tyVar.H0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new oo(this, 17), new my(this, i7));
        } else {
            Utilities.B(new oo(this, 17), new my(this, 2), new my(this, 3), new my(this, 4), new my(this, 5), new my(this, 6), new my(this, 7));
        }
    }
}

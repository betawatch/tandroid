package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zx implements ux {
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
    public final /* synthetic */ ay x;

    public zx(ay ayVar) {
        this.x = ayVar;
    }

    public final void a(Runnable runnable, boolean z9) {
        String[] G0 = org.telegram.messenger.g0.G0();
        org.telegram.messenger.ui.b0(this.x.Q.c1).Z1(false, G0.length == 0 ? "" : G0[0], this.a, new fi.nb(this, z9, runnable, 2), z9);
    }

    @Override // org.telegram.ui.Components.ux
    public final void e() {
        sv svVar = this.x.Q.G0;
        if (svVar.F) {
            return;
        }
        svVar.e(true);
        Utilities.B(new gp(this, 15), new yx(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        ay ayVar = this.x;
        gy gyVar = ayVar.Q;
        if (TextUtils.isEmpty(ayVar.N)) {
            v4.g0 adapter = gyVar.D0.getAdapter();
            xx xxVar = gyVar.y0;
            if (adapter != xxVar) {
                gyVar.D0.setAdapter(xxVar);
            }
            ayVar.f();
            return;
        }
        int i7 = 1;
        int i10 = ayVar.M + 1;
        ayVar.M = i10;
        this.b = i10;
        this.a = ayVar.N;
        ayVar.D = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        gyVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new gp(this, 15), new yx(this, i7));
        } else {
            Utilities.B(new gp(this, 15), new yx(this, 2), new yx(this, 3), new yx(this, 4), new yx(this, 5), new yx(this, 6), new yx(this, 7));
        }
    }
}

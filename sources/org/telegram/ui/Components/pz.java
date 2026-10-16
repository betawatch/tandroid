package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pz implements jz {
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
    public final LongSparseArray v = new LongSparseArray(0);
    public final /* synthetic */ rz w;

    public pz(rz rzVar) {
        this.w = rzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new di.cd(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.jz
    public final void e() {
        hx hxVar = this.w.Q.G0;
        if (hxVar.F) {
            return;
        }
        hxVar.e(true);
        Utilities.raceCallbacks(new kq(this, 16), new oz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        rz rzVar = this.w;
        wz wzVar = rzVar.Q;
        if (TextUtils.isEmpty(rzVar.N)) {
            s4.g0 adapter = wzVar.D0.getAdapter();
            mz mzVar = wzVar.y0;
            if (adapter != mzVar) {
                wzVar.D0.setAdapter(mzVar);
            }
            rzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = rzVar.M + 1;
        rzVar.M = i11;
        this.b = i11;
        this.a = rzVar.N;
        rzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        wzVar.G0.e(true);
        int i12 = 16;
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new kq(this, i12), new oz(this, i10));
        } else {
            Utilities.raceCallbacks(new kq(this, i12), new oz(this, 2), new oz(this, 3), new oz(this, 4), new oz(this, 5), new oz(this, 6), new oz(this, 7));
        }
    }
}

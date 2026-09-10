package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kz implements fz {
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
    public final /* synthetic */ mz w;

    public kz(mz mzVar) {
        this.w = mzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new bi.we(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.fz
    public final void d() {
        bx bxVar = this.w.Q.G0;
        if (bxVar.F) {
            return;
        }
        bxVar.e(true);
        Utilities.raceCallbacks(new dq(this, 16), new jz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        mz mzVar = this.w;
        rz rzVar = mzVar.Q;
        if (TextUtils.isEmpty(mzVar.N)) {
            s4.h0 adapter = rzVar.D0.getAdapter();
            iz izVar = rzVar.y0;
            if (adapter != izVar) {
                rzVar.D0.setAdapter(izVar);
            }
            mzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = mzVar.M + 1;
        mzVar.M = i11;
        this.b = i11;
        this.a = mzVar.N;
        mzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        rzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new dq(this, 16), new jz(this, i10));
        } else {
            Utilities.raceCallbacks(new dq(this, 16), new jz(this, 2), new jz(this, 3), new jz(this, 4), new jz(this, 5), new jz(this, 6), new jz(this, 7));
        }
    }
}

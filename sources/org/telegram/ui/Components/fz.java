package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class fz implements az {
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
    public final /* synthetic */ hz w;

    public fz(hz hzVar) {
        this.w = hzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.az
    public final void d() {
        yw ywVar = this.w.Q.G0;
        if (ywVar.F) {
            return;
        }
        ywVar.e(true);
        Utilities.raceCallbacks(new zp(this, 16), new ez(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        hz hzVar = this.w;
        mz mzVar = hzVar.Q;
        if (TextUtils.isEmpty(hzVar.N)) {
            s4.h0 adapter = mzVar.D0.getAdapter();
            dz dzVar = mzVar.y0;
            if (adapter != dzVar) {
                mzVar.D0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = hzVar.M + 1;
        hzVar.M = i11;
        this.b = i11;
        this.a = hzVar.N;
        hzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        mzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, i10));
        } else {
            Utilities.raceCallbacks(new zp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}

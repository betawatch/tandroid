package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fz implements zy {
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

    public final void a(Runnable runnable, boolean z4) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.N.Z0).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new ml(this, z4, runnable, 1), z4);
    }

    @Override // org.telegram.ui.Components.zy
    public final void d() {
        uw uwVar = this.w.N.D0;
        if (uwVar.C) {
            return;
        }
        uwVar.e(true);
        Utilities.raceCallbacks(new xp(this, 16), new ez(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        hz hzVar = this.w;
        mz mzVar = hzVar.N;
        if (TextUtils.isEmpty(hzVar.K)) {
            f2.p0 adapter = mzVar.A0.getAdapter();
            dz dzVar = mzVar.v0;
            if (adapter != dzVar) {
                mzVar.A0.setAdapter(dzVar);
            }
            hzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = hzVar.J + 1;
        hzVar.J = i11;
        this.b = i11;
        this.a = hzVar.K;
        hzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        mzVar.D0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new xp(this, 16), new ez(this, i10));
        } else {
            Utilities.raceCallbacks(new xp(this, 16), new ez(this, 2), new ez(this, 3), new ez(this, 4), new ez(this, 5), new ez(this, 6), new ez(this, 7));
        }
    }
}

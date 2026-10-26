package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lz implements gz {
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
    public final /* synthetic */ nz w;

    public lz(nz nzVar) {
        this.w = nzVar;
    }

    public final boolean a() {
        return this.w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new fi.kc(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.gz
    public final void e() {
        if (a()) {
            return;
        }
        this.w.Q.G0.e(true);
        Utilities.raceCallbacks(new bq(this, 17), new kz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        nz nzVar = this.w;
        sz szVar = nzVar.Q;
        if (TextUtils.isEmpty(nzVar.N)) {
            s4.h0 adapter = szVar.D0.getAdapter();
            jz jzVar = szVar.y0;
            if (adapter != jzVar) {
                szVar.D0.setAdapter(jzVar);
            }
            nzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = nzVar.M + 1;
        nzVar.M = i11;
        this.b = i11;
        this.a = nzVar.N;
        nzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        szVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new bq(this, 17), new kz(this, i10));
        } else {
            Utilities.raceCallbacks(new bq(this, 17), new kz(this, 2), new kz(this, 3), new kz(this, 4), new kz(this, 5), new kz(this, 6), new kz(this, 7));
        }
    }
}

package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ez implements zy {
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
    public final /* synthetic */ gz w;

    public ez(gz gzVar) {
        this.w = gzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.zy
    public final void d() {
        xw xwVar = this.w.Q.G0;
        if (xwVar.F) {
            return;
        }
        xwVar.e(true);
        Utilities.raceCallbacks(new yp(this, 16), new dz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        gz gzVar = this.w;
        lz lzVar = gzVar.Q;
        if (TextUtils.isEmpty(gzVar.N)) {
            s4.h0 adapter = lzVar.D0.getAdapter();
            cz czVar = lzVar.y0;
            if (adapter != czVar) {
                lzVar.D0.setAdapter(czVar);
            }
            gzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = gzVar.M + 1;
        gzVar.M = i11;
        this.b = i11;
        this.a = gzVar.N;
        gzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        lzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new yp(this, 16), new dz(this, i10));
        } else {
            Utilities.raceCallbacks(new yp(this, 16), new dz(this, 2), new dz(this, 3), new dz(this, 4), new dz(this, 5), new dz(this, 6), new dz(this, 7));
        }
    }
}

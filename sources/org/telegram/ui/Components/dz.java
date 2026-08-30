package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dz implements xy {
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
    public final /* synthetic */ fz w;

    public dz(fz fzVar) {
        this.w = fzVar;
    }

    public final void a(Runnable runnable, boolean z4) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.N.Z0).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new ll(this, z4, runnable, 1), z4);
    }

    @Override // org.telegram.ui.Components.xy
    public final void d() {
        sw swVar = this.w.N.D0;
        if (swVar.C) {
            return;
        }
        swVar.e(true);
        Utilities.raceCallbacks(new vp(this, 16), new cz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        fz fzVar = this.w;
        kz kzVar = fzVar.N;
        if (TextUtils.isEmpty(fzVar.K)) {
            f2.o0 adapter = kzVar.A0.getAdapter();
            bz bzVar = kzVar.v0;
            if (adapter != bzVar) {
                kzVar.A0.setAdapter(bzVar);
            }
            fzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = fzVar.J + 1;
        fzVar.J = i11;
        this.b = i11;
        this.a = fzVar.K;
        fzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        kzVar.D0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new vp(this, 16), new cz(this, i10));
        } else {
            Utilities.raceCallbacks(new vp(this, 16), new cz(this, 2), new cz(this, 3), new cz(this, 4), new cz(this, 5), new cz(this, 6), new cz(this, 7));
        }
    }
}

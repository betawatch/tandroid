package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tz implements nz {
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
    public final /* synthetic */ vz w;

    public tz(vz vzVar) {
        this.w = vzVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new ci.ed(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.nz
    public final void d() {
        lx lxVar = this.w.Q.G0;
        if (lxVar.F) {
            return;
        }
        lxVar.e(true);
        Utilities.raceCallbacks(new nq(this, 16), new sz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        vz vzVar = this.w;
        a00 a00Var = vzVar.Q;
        if (TextUtils.isEmpty(vzVar.N)) {
            s4.i0 adapter = a00Var.D0.getAdapter();
            qz qzVar = a00Var.y0;
            if (adapter != qzVar) {
                a00Var.D0.setAdapter(qzVar);
            }
            vzVar.l();
            return;
        }
        int i10 = 1;
        int i11 = vzVar.M + 1;
        vzVar.M = i11;
        this.b = i11;
        this.a = vzVar.N;
        vzVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        a00Var.G0.e(true);
        int i12 = 16;
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new nq(this, i12), new sz(this, i10));
        } else {
            Utilities.raceCallbacks(new nq(this, i12), new sz(this, 2), new sz(this, 3), new sz(this, 4), new sz(this, 5), new sz(this, 6), new sz(this, 7));
        }
    }
}

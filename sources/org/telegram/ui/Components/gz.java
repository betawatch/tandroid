package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class gz implements bz {
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
    public final /* synthetic */ iz w;

    public gz(iz izVar) {
        this.w = izVar;
    }

    public final boolean a() {
        return this.w.Q.G0.F;
    }

    public final void b(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.Q.c1).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new ci.dd(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.bz
    public final void d() {
        if (a()) {
            return;
        }
        this.w.Q.G0.e(true);
        Utilities.raceCallbacks(new aq(this, 16), new fz(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        iz izVar = this.w;
        nz nzVar = izVar.Q;
        if (TextUtils.isEmpty(izVar.N)) {
            s4.h0 adapter = nzVar.D0.getAdapter();
            ez ezVar = nzVar.y0;
            if (adapter != ezVar) {
                nzVar.D0.setAdapter(ezVar);
            }
            izVar.l();
            return;
        }
        int i10 = 1;
        int i11 = izVar.M + 1;
        izVar.M = i11;
        this.b = i11;
        this.a = izVar.N;
        izVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        nzVar.G0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, i10));
        } else {
            Utilities.raceCallbacks(new aq(this, 16), new fz(this, 2), new fz(this, 3), new fz(this, 4), new fz(this, 5), new fz(this, 6), new fz(this, 7));
        }
    }
}

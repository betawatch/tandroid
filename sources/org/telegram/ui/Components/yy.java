package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yy implements sy {
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
    public final /* synthetic */ az w;

    public yy(az azVar) {
        this.w = azVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.M.Y0).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new nh.yb(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.sy
    public final void d() {
        ow owVar = this.w.M.C0;
        if (owVar.B) {
            return;
        }
        owVar.e(true);
        Utilities.raceCallbacks(new rp(this, 16), new xy(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        az azVar = this.w;
        fz fzVar = azVar.M;
        if (TextUtils.isEmpty(azVar.J)) {
            f2.p0 adapter = fzVar.z0.getAdapter();
            wy wyVar = fzVar.u0;
            if (adapter != wyVar) {
                fzVar.z0.setAdapter(wyVar);
            }
            azVar.l();
            return;
        }
        int i10 = 1;
        int i11 = azVar.I + 1;
        azVar.I = i11;
        this.b = i11;
        this.a = azVar.J;
        azVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        fzVar.C0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new rp(this, 16), new xy(this, i10));
        } else {
            Utilities.raceCallbacks(new rp(this, 16), new xy(this, 2), new xy(this, 3), new xy(this, 4), new xy(this, 5), new xy(this, 6), new xy(this, 7));
        }
    }
}

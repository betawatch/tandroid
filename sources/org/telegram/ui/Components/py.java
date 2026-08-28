package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class py implements ky {
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
    public final /* synthetic */ ry w;

    public py(ry ryVar) {
        this.w = ryVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.M.Y0).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new kh.oc(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.ky
    public final void d() {
        iw iwVar = this.w.M.C0;
        if (iwVar.B) {
            return;
        }
        iwVar.e(true);
        Utilities.raceCallbacks(new np(this, 16), new oy(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry ryVar = this.w;
        wy wyVar = ryVar.M;
        if (TextUtils.isEmpty(ryVar.J)) {
            f2.r0 adapter = wyVar.z0.getAdapter();
            ny nyVar = wyVar.u0;
            if (adapter != nyVar) {
                wyVar.z0.setAdapter(nyVar);
            }
            ryVar.l();
            return;
        }
        int i9 = 1;
        int i10 = ryVar.I + 1;
        ryVar.I = i10;
        this.b = i10;
        this.a = ryVar.J;
        ryVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        wyVar.C0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new np(this, 16), new oy(this, i9));
        } else {
            Utilities.raceCallbacks(new np(this, 16), new oy(this, 2), new oy(this, 3), new oy(this, 4), new oy(this, 5), new oy(this, 6), new oy(this, 7));
        }
    }
}

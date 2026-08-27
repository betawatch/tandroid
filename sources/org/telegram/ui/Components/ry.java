package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ry implements ly {
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
    public final /* synthetic */ ty w;

    public ry(ty tyVar) {
        this.w = tyVar;
    }

    public final void a(Runnable runnable, boolean z10) {
        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
        MediaDataController.getInstance(this.w.M.Y0).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.a, new lh.kc(this, z10, runnable, 2), z10);
    }

    @Override // org.telegram.ui.Components.ly
    public final void d() {
        hw hwVar = this.w.M.C0;
        if (hwVar.B) {
            return;
        }
        hwVar.e(true);
        Utilities.raceCallbacks(new lp(this, 16), new qy(this, 0));
    }

    @Override // java.lang.Runnable
    public final void run() {
        ty tyVar = this.w;
        yy yyVar = tyVar.M;
        if (TextUtils.isEmpty(tyVar.J)) {
            f2.q0 adapter = yyVar.z0.getAdapter();
            py pyVar = yyVar.u0;
            if (adapter != pyVar) {
                yyVar.z0.setAdapter(pyVar);
            }
            tyVar.l();
            return;
        }
        int i10 = 1;
        int i11 = tyVar.I + 1;
        tyVar.I = i11;
        this.b = i11;
        this.a = tyVar.J;
        tyVar.y = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.v.clear();
        yyVar.C0.e(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.raceCallbacks(new lp(this, 16), new qy(this, i10));
        } else {
            Utilities.raceCallbacks(new lp(this, 16), new qy(this, 2), new qy(this, 3), new qy(this, 4), new qy(this, 5), new qy(this, 6), new qy(this, 7));
        }
    }
}

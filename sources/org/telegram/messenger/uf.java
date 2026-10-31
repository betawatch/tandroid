package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    public /* synthetic */ uf(ui uiVar, boolean z10, int i10, ArrayList arrayList) {
        this.b = uiVar;
        this.c = z10;
        this.e = i10;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.e;
        ArrayList arrayList = this.d;
        boolean z10 = this.c;
        ui uiVar = this.b;
        switch (i10) {
            case 0:
                SharedPreferences.Editor edit = vp.r1(uiVar.currentAccount).g7.edit();
                if (z10) {
                    uiVar.j0 = false;
                    uiVar.k0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    uiVar.g0[i11] = false;
                    uiVar.h0[i11] = true;
                    if (i11 == 0) {
                        edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
                    } else if (i11 == 1) {
                        edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
                    } else if (i11 == 3) {
                        edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
                    } else if (i11 == 5) {
                        edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
                    } else if (i11 == 7) {
                        edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
                    } else {
                        edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
                    }
                }
                if (arrayList != null) {
                    if (z10) {
                        uiVar.i0 = arrayList;
                    } else {
                        uiVar.f0[i11] = arrayList;
                    }
                    if (i11 == 3) {
                        uiVar.n1();
                    }
                    uiVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                    break;
                }
                break;
            default:
                if (z10) {
                    uiVar.i0 = arrayList;
                    uiVar.j0 = false;
                    uiVar.k0 = true;
                } else {
                    uiVar.f0[i11] = arrayList;
                    uiVar.g0[i11] = false;
                    uiVar.h0[i11] = true;
                }
                if (i11 == 3) {
                    uiVar.n1();
                }
                uiVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                uiVar.V0(i11, z10, false, false);
                break;
        }
    }

    public /* synthetic */ uf(ui uiVar, boolean z10, ArrayList arrayList, int i10) {
        this.b = uiVar;
        this.c = z10;
        this.d = arrayList;
        this.e = i10;
    }
}

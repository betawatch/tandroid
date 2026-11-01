package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vi b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    public /* synthetic */ vf(vi viVar, boolean z10, int i10, ArrayList arrayList) {
        this.b = viVar;
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
        vi viVar = this.b;
        switch (i10) {
            case 0:
                SharedPreferences.Editor edit = wp.r1(viVar.currentAccount).g7.edit();
                if (z10) {
                    viVar.j0 = false;
                    viVar.k0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    viVar.g0[i11] = false;
                    viVar.h0[i11] = true;
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
                        viVar.i0 = arrayList;
                    } else {
                        viVar.f0[i11] = arrayList;
                    }
                    if (i11 == 3) {
                        viVar.n1();
                    }
                    viVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                    break;
                }
                break;
            default:
                if (z10) {
                    viVar.i0 = arrayList;
                    viVar.j0 = false;
                    viVar.k0 = true;
                } else {
                    viVar.f0[i11] = arrayList;
                    viVar.g0[i11] = false;
                    viVar.h0[i11] = true;
                }
                if (i11 == 3) {
                    viVar.n1();
                }
                viVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i11));
                viVar.V0(i11, z10, false, false);
                break;
        }
    }

    public /* synthetic */ vf(vi viVar, boolean z10, ArrayList arrayList, int i10) {
        this.b = viVar;
        this.c = z10;
        this.d = arrayList;
        this.e = i10;
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ si b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    public /* synthetic */ wf(si siVar, boolean z10, int i7, ArrayList arrayList) {
        this.b = siVar;
        this.c = z10;
        this.e = i7;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.e;
        ArrayList arrayList = this.d;
        boolean z10 = this.c;
        si siVar = this.b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = np.u1(siVar.currentAccount).i7.edit();
                if (z10) {
                    siVar.k0 = false;
                    siVar.l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    siVar.h0[i10] = false;
                    siVar.i0[i10] = true;
                    if (i10 == 0) {
                        edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
                    } else if (i10 == 1) {
                        edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
                    } else if (i10 == 3) {
                        edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
                    } else if (i10 == 5) {
                        edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
                    } else if (i10 == 7) {
                        edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
                    } else {
                        edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
                    }
                }
                if (arrayList != null) {
                    if (z10) {
                        siVar.j0 = arrayList;
                    } else {
                        siVar.g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        siVar.q1();
                    }
                    siVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    break;
                }
                break;
            default:
                if (z10) {
                    siVar.j0 = arrayList;
                    siVar.k0 = false;
                    siVar.l0 = true;
                } else {
                    siVar.g0[i10] = arrayList;
                    siVar.h0[i10] = false;
                    siVar.i0[i10] = true;
                }
                if (i10 == 3) {
                    siVar.q1();
                }
                siVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                siVar.Y0(i10, z10, false, false);
                break;
        }
    }

    public /* synthetic */ wf(si siVar, boolean z10, ArrayList arrayList, int i7) {
        this.b = siVar;
        this.c = z10;
        this.d = arrayList;
        this.e = i7;
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class of implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ li b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    public /* synthetic */ of(li liVar, boolean z10, int i3, ArrayList arrayList) {
        this.b = liVar;
        this.c = z10;
        this.e = i3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.e;
        ArrayList arrayList = this.d;
        boolean z10 = this.c;
        li liVar = this.b;
        switch (i3) {
            case 0:
                SharedPreferences.Editor edit = hp.s1(liVar.currentAccount).f7.edit();
                if (z10) {
                    liVar.k0 = false;
                    liVar.l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    liVar.h0[i10] = false;
                    liVar.i0[i10] = true;
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
                        liVar.j0 = arrayList;
                    } else {
                        liVar.g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        liVar.n1();
                    }
                    liVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    break;
                }
                break;
            default:
                if (z10) {
                    liVar.j0 = arrayList;
                    liVar.k0 = false;
                    liVar.l0 = true;
                } else {
                    liVar.g0[i10] = arrayList;
                    liVar.h0[i10] = false;
                    liVar.i0[i10] = true;
                }
                if (i10 == 3) {
                    liVar.n1();
                }
                liVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                liVar.V0(i10, z10, false, false);
                break;
        }
    }

    public /* synthetic */ of(li liVar, boolean z10, ArrayList arrayList, int i3) {
        this.b = liVar;
        this.c = z10;
        this.d = arrayList;
        this.e = i3;
    }
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    public /* synthetic */ vf(ri riVar, boolean z10, int i7, ArrayList arrayList) {
        this.b = riVar;
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
        ri riVar = this.b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = mp.u1(riVar.currentAccount).i7.edit();
                if (z10) {
                    riVar.k0 = false;
                    riVar.l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    riVar.h0[i10] = false;
                    riVar.i0[i10] = true;
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
                        riVar.j0 = arrayList;
                    } else {
                        riVar.g0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        riVar.q1();
                    }
                    riVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                    break;
                }
                break;
            default:
                if (z10) {
                    riVar.j0 = arrayList;
                    riVar.k0 = false;
                    riVar.l0 = true;
                } else {
                    riVar.g0[i10] = arrayList;
                    riVar.h0[i10] = false;
                    riVar.i0[i10] = true;
                }
                if (i10 == 3) {
                    riVar.q1();
                }
                riVar.getNotificationCenter().k(86, Boolean.valueOf(z10), Integer.valueOf(i10));
                riVar.Y0(i10, z10, false, false);
                break;
        }
    }

    public /* synthetic */ vf(ri riVar, boolean z10, ArrayList arrayList, int i7) {
        this.b = riVar;
        this.c = z10;
        this.d = arrayList;
        this.e = i7;
    }
}

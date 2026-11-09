package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ int e;

    public /* synthetic */ wf(ui uiVar, boolean z9, int i7, ArrayList arrayList) {
        this.b = uiVar;
        this.c = z9;
        this.e = i7;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.e;
        ArrayList arrayList = this.d;
        boolean z9 = this.c;
        ui uiVar = this.b;
        switch (i7) {
            case 0:
                SharedPreferences.Editor edit = qp.s1(uiVar.currentAccount).f7.edit();
                if (z9) {
                    uiVar.j0 = false;
                    uiVar.k0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    uiVar.g0[i10] = false;
                    uiVar.h0[i10] = true;
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
                    if (z9) {
                        uiVar.i0 = arrayList;
                    } else {
                        uiVar.f0[i10] = arrayList;
                    }
                    if (i10 == 3) {
                        uiVar.n1();
                    }
                    uiVar.getNotificationCenter().k(86, Boolean.valueOf(z9), Integer.valueOf(i10));
                    break;
                }
                break;
            default:
                if (z9) {
                    uiVar.i0 = arrayList;
                    uiVar.j0 = false;
                    uiVar.k0 = true;
                } else {
                    uiVar.f0[i10] = arrayList;
                    uiVar.g0[i10] = false;
                    uiVar.h0[i10] = true;
                }
                if (i10 == 3) {
                    uiVar.n1();
                }
                uiVar.getNotificationCenter().k(86, Boolean.valueOf(z9), Integer.valueOf(i10));
                uiVar.V0(i10, z9, false, false);
                break;
        }
    }

    public /* synthetic */ wf(ui uiVar, boolean z9, ArrayList arrayList, int i7) {
        this.b = uiVar;
        this.c = z9;
        this.d = arrayList;
        this.e = i7;
    }
}

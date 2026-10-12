package org.telegram.ui.Components;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = i10;
        this.b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f = c6Var;
        this.h = callback;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.n;
                int i10 = this.c;
                long j10 = zh.n5.y(i10, false).p().amount;
                long j11 = this.b;
                if (j10 >= j11) {
                    callback.run(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList.get(0)).longValue();
                    new zh.e7(activity, c6Var, j11, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                final org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.e;
                final bi.f0 f0Var = (bi.f0) this.f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.n;
                d2Var.h = false;
                if (z1Var != null) {
                    String str2 = z1Var.e;
                    if (d2Var.y(z1Var) && !d2Var.i(z1Var)) {
                        d2Var.g = z1Var;
                        if ("sendTransaction".equals(str2) && z1Var.f != null) {
                            if (MessagesController.getMainSettings(d2Var.a).contains(org.telegram.ui.Wallet.d2.j(this.b, this.c) + ".transfer")) {
                                z1Var.m = true;
                                final int i11 = 0;
                                d2Var.z(z1Var, g0Var, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.u1
                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        String str3 = (String) obj;
                                        switch (i11) {
                                            case 0:
                                                d2 d2Var2 = d2Var;
                                                d2Var2.getClass();
                                                z1 z1Var2 = z1Var;
                                                z1Var2.m = false;
                                                d2Var2.s(z1Var2);
                                                f0Var.run(null, str3);
                                                break;
                                            default:
                                                d2Var.s(z1Var);
                                                f0Var.run(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (z1Var.l < 0 && !"disconnect".equals(str2)) {
                            f0Var.run(z1Var, null);
                            break;
                        } else {
                            g0Var.close();
                            final int i12 = 1;
                            d2Var.e(z1Var, false, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.u1
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (i12) {
                                        case 0:
                                            d2 d2Var2 = d2Var;
                                            d2Var2.getClass();
                                            z1 z1Var2 = z1Var;
                                            z1Var2.m = false;
                                            d2Var2.s(z1Var2);
                                            f0Var.run(null, str3);
                                            break;
                                        default:
                                            d2Var.s(z1Var);
                                            f0Var.run(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        f0Var.run(null, "Request expired or wallet changed");
                        break;
                    }
                } else {
                    f0Var.run(null, str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m1(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, bi.f0 f0Var, String str, long j10, int i10, org.telegram.ui.Wallet.g0 g0Var) {
        this.d = d2Var;
        this.e = z1Var;
        this.f = f0Var;
        this.h = str;
        this.b = j10;
        this.c = i10;
        this.n = g0Var;
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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

    public /* synthetic */ m1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.c = i10;
        this.b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f = d6Var;
        this.h = callback;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.n;
                int i10 = this.c;
                long j10 = ai.ga.y(i10, false).p().amount;
                long j11 = this.b;
                if (j10 >= j11) {
                    callback.run(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList.get(0)).longValue();
                    new ai.cd(activity, d6Var, j11, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) this.d;
                final org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.e;
                final org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.n;
                f2Var.h = false;
                if (b2Var != null) {
                    String str2 = b2Var.e;
                    if (f2Var.y(b2Var) && !f2Var.i(b2Var)) {
                        f2Var.g = b2Var;
                        if ("sendTransaction".equals(str2) && b2Var.f != null) {
                            if (MessagesController.getMainSettings(f2Var.a).contains(org.telegram.ui.Wallet.f2.j(this.b, this.c) + ".transfer")) {
                                b2Var.m = true;
                                final int i11 = 0;
                                f2Var.z(b2Var, j0Var, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.w1
                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        String str3 = (String) obj;
                                        switch (i11) {
                                            case 0:
                                                f2 f2Var2 = f2Var;
                                                f2Var2.getClass();
                                                b2 b2Var2 = b2Var;
                                                b2Var2.m = false;
                                                f2Var2.s(b2Var2);
                                                s1Var.run(null, str3);
                                                break;
                                            default:
                                                f2Var.s(b2Var);
                                                s1Var.run(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (b2Var.l < 0 && !"disconnect".equals(str2)) {
                            s1Var.run(b2Var, null);
                            break;
                        } else {
                            j0Var.close();
                            final int i12 = 1;
                            f2Var.e(b2Var, false, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.w1
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (i12) {
                                        case 0:
                                            f2 f2Var2 = f2Var;
                                            f2Var2.getClass();
                                            b2 b2Var2 = b2Var;
                                            b2Var2.m = false;
                                            f2Var2.s(b2Var2);
                                            s1Var.run(null, str3);
                                            break;
                                        default:
                                            f2Var.s(b2Var);
                                            s1Var.run(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        s1Var.run(null, "Request expired or wallet changed");
                        break;
                    }
                } else {
                    s1Var.run(null, str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m1(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, org.telegram.ui.Wallet.s1 s1Var, String str, long j10, int i10, org.telegram.ui.Wallet.j0 j0Var) {
        this.d = f2Var;
        this.e = b2Var;
        this.f = s1Var;
        this.h = str;
        this.b = j10;
        this.c = i10;
        this.n = j0Var;
    }
}

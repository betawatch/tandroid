package org.telegram.ui.Components;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

    public /* synthetic */ m1(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.c = i10;
        this.b = j10;
        this.d = activity;
        this.e = arrayList;
        this.f = g6Var;
        this.h = callback;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.n;
                int i10 = this.c;
                long j10 = ai.ha.y(i10, false).p().amount;
                long j11 = this.b;
                if (j10 >= j11) {
                    callback.run(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList.get(0)).longValue();
                    new ai.dd(activity, g6Var, j11, 13, DialogObject.getShortName(i10, longValue), new a2(callback, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.d;
                final org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.e;
                final org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.n;
                e2Var.h = false;
                if (a2Var != null) {
                    String str2 = a2Var.e;
                    if (e2Var.y(a2Var) && !e2Var.i(a2Var)) {
                        e2Var.g = a2Var;
                        if ("sendTransaction".equals(str2) && a2Var.f != null) {
                            if (MessagesController.getMainSettings(e2Var.a).contains(org.telegram.ui.Wallet.e2.j(this.b, this.c) + ".transfer")) {
                                a2Var.m = true;
                                final int i11 = 0;
                                e2Var.z(a2Var, i0Var, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.v1
                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj) {
                                        String str3 = (String) obj;
                                        switch (i11) {
                                            case 0:
                                                e2 e2Var2 = e2Var;
                                                e2Var2.getClass();
                                                a2 a2Var2 = a2Var;
                                                a2Var2.m = false;
                                                e2Var2.s(a2Var2);
                                                r1Var.run(null, str3);
                                                break;
                                            default:
                                                e2Var.s(a2Var);
                                                r1Var.run(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (a2Var.l < 0 && !"disconnect".equals(str2)) {
                            r1Var.run(a2Var, null);
                            break;
                        } else {
                            i0Var.close();
                            final int i12 = 1;
                            e2Var.e(a2Var, false, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.v1
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj) {
                                    String str3 = (String) obj;
                                    switch (i12) {
                                        case 0:
                                            e2 e2Var2 = e2Var;
                                            e2Var2.getClass();
                                            a2 a2Var2 = a2Var;
                                            a2Var2.m = false;
                                            e2Var2.s(a2Var2);
                                            r1Var.run(null, str3);
                                            break;
                                        default:
                                            e2Var.s(a2Var);
                                            r1Var.run(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        r1Var.run(null, "Request expired or wallet changed");
                        break;
                    }
                } else {
                    r1Var.run(null, str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, org.telegram.ui.Wallet.r1 r1Var, String str, long j10, int i10, org.telegram.ui.Wallet.i0 i0Var) {
        this.d = e2Var;
        this.e = a2Var;
        this.f = r1Var;
        this.h = str;
        this.b = j10;
        this.c = i10;
        this.n = i0Var;
    }
}

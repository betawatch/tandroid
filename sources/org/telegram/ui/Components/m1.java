package org.telegram.ui.Components;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    public /* synthetic */ m1(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = i10;
        this.b = j3;
        this.d = activity;
        this.e = arrayList;
        this.f = e6Var;
        this.h = callback;
        this.n = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                HashMap hashMap = (HashMap) this.n;
                int i10 = this.c;
                long j3 = yh.m5.y(i10, false).p().amount;
                long j10 = this.b;
                if (j3 >= j10) {
                    callback.run(hashMap);
                    break;
                } else if (activity != null) {
                    long longValue = ((Long) arrayList.get(0)).longValue();
                    new yh.e7(activity, e6Var, j10, 13, DialogObject.getShortName(i10, longValue), new b2(callback, hashMap, 0), longValue).show();
                    break;
                }
                break;
            default:
                final org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.d;
                final org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.e;
                final ai.m0 m0Var = (ai.m0) this.f;
                String str = (String) this.h;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.n;
                d2Var.h = false;
                if (z1Var != null) {
                    String str2 = z1Var.e;
                    if (d2Var.y(z1Var) && !d2Var.i(z1Var)) {
                        d2Var.g = z1Var;
                        if ("sendTransaction".equals(str2) && z1Var.f != null) {
                            if (MessagesController.getMainSettings(d2Var.a).contains(org.telegram.ui.Wallet.d2.j(this.b, this.c) + ".transfer")) {
                                z1Var.m = true;
                                final int i11 = 0;
                                d2Var.z(z1Var, h0Var, new Utilities.Callback() { // from class: org.telegram.ui.Wallet.u1
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
                                                m0Var.run(null, str3);
                                                break;
                                            default:
                                                d2Var.s(z1Var);
                                                m0Var.run(null, str3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        }
                        if (z1Var.l < 0 && !"disconnect".equals(str2)) {
                            m0Var.run(z1Var, null);
                            break;
                        } else {
                            h0Var.close();
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
                                            m0Var.run(null, str3);
                                            break;
                                        default:
                                            d2Var.s(z1Var);
                                            m0Var.run(null, str3);
                                            break;
                                    }
                                }
                            });
                            break;
                        }
                    } else {
                        m0Var.run(null, "Request expired or wallet changed");
                        break;
                    }
                } else {
                    m0Var.run(null, str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m1(org.telegram.ui.Wallet.d2 d2Var, org.telegram.ui.Wallet.z1 z1Var, ai.m0 m0Var, String str, long j3, int i10, org.telegram.ui.Wallet.h0 h0Var) {
        this.d = d2Var;
        this.e = z1Var;
        this.f = m0Var;
        this.h = str;
        this.b = j3;
        this.c = i10;
        this.n = h0Var;
    }
}

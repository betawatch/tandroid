package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        String str;
        int i7 = this.a;
        int i10 = this.b;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                v vVar = (v) obj3;
                TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                if (aicomposetoneexample != null) {
                    vVar.e2[i10] = aicomposetoneexample;
                    vVar.c2.O(true);
                    break;
                } else {
                    vVar.getClass();
                    break;
                }
            default:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) obj3).c;
                if (i10 == 0) {
                    z41Var.V();
                    org.telegram.ui.Wallet.t0 t0Var = n6Var.G0;
                    boolean z10 = (t0Var == null || t0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i11 = 0; i11 < n6Var.G0.c.size(); i11++) {
                            arrayList.add(org.telegram.ui.Wallet.d4.i((TL_wallet.walletTransaction) n6Var.G0.c.get(i11), n6Var.G0.a));
                        }
                    }
                    org.telegram.ui.Wallet.t0 t0Var2 = n6Var.G0;
                    if (t0Var2 != null && (t0Var2.k || !t0Var2.h)) {
                        arrayList.add(l41.q(-1, 37));
                        arrayList.add(l41.q(-2, 37));
                        arrayList.add(l41.q(-3, 37));
                    }
                    z41Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) n6Var.getMessagesController().A7.r0.b).c;
                        if (j3 > 0) {
                            arrayList.add(l41.C(org.telegram.messenger.gd.V(null, null, 2131742859, org.telegram.ui.Wallet.u0.x(j3, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.l0 l0Var = n6Var.H0;
                    if (l0Var != null) {
                        ArrayList arrayList2 = l0Var.a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (n6Var.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(n6Var.l0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.r8 r8Var = n6Var.k0;
                                    int i13 = org.telegram.ui.Wallet.d8.b;
                                    l41 K = l41.K(org.telegram.ui.Wallet.d8.class);
                                    K.v = 1;
                                    K.H = nftitem;
                                    K.I = r8Var;
                                    arrayList.add(K);
                                } else {
                                    int i14 = org.telegram.ui.Wallet.b.b;
                                    l41 K2 = l41.K(org.telegram.ui.Wallet.b.class);
                                    K2.H = nftitem;
                                    K2.v = 1;
                                    arrayList.add(K2);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !n6Var.l0.isEmpty()) {
                            org.telegram.ui.Wallet.l0 l0Var2 = n6Var.H0;
                            if (!l0Var2.i && l0Var2.g) {
                                arrayList.add(l41.r(org.telegram.messenger.gd.M0(2131747975, null)));
                            }
                        }
                        org.telegram.ui.Wallet.l0 l0Var3 = n6Var.H0;
                        if (l0Var3.i) {
                            for (int i15 = 0; i15 < 3; i15++) {
                                int i16 = org.telegram.ui.Wallet.d.b;
                                l41 K3 = l41.K(org.telegram.ui.Wallet.d.class);
                                K3.v = 1;
                                K3.d = (-1) - i15;
                                arrayList.add(K3);
                            }
                            break;
                        } else if (l0Var3.m != null) {
                            arrayList.add(l41.e(-10001, org.telegram.messenger.gd.M0(2131745857, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}

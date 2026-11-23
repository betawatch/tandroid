package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements org.telegram.messenger.p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // org.telegram.messenger.p10
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
                b51 b51Var = (b51) obj2;
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) ((di.i4) obj3).c;
                if (i10 == 0) {
                    b51Var.V();
                    org.telegram.ui.Wallet.u0 u0Var = o6Var.G0;
                    boolean z10 = (u0Var == null || u0Var.c.isEmpty()) ? false : true;
                    if (z10) {
                        for (int i11 = 0; i11 < o6Var.G0.c.size(); i11++) {
                            arrayList.add(org.telegram.ui.Wallet.e4.i((TL_wallet.walletTransaction) o6Var.G0.c.get(i11), o6Var.G0.a));
                        }
                    }
                    org.telegram.ui.Wallet.u0 u0Var2 = o6Var.G0;
                    if (u0Var2 != null && (u0Var2.k || !u0Var2.h)) {
                        arrayList.add(n41.q(-1, 37));
                        arrayList.add(n41.q(-2, 37));
                        arrayList.add(n41.q(-3, 37));
                    }
                    b51Var.U();
                    if (z10) {
                        long j3 = ((org.telegram.messenger.l0) o6Var.getMessagesController().A7.r0.b).c;
                        if (j3 > 0) {
                            arrayList.add(n41.C(org.telegram.messenger.gd.V(null, null, 2131742846, org.telegram.ui.Wallet.v0.x(j3, false))));
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.m0 m0Var = o6Var.H0;
                    if (m0Var != null) {
                        ArrayList arrayList2 = m0Var.a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj4 = arrayList2.get(i12);
                            i12++;
                            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj4;
                            if (o6Var.l0.isEmpty() || ((str = nftitem.name) != null && str.toLowerCase(Locale.ROOT).contains(o6Var.l0))) {
                                if (nftitem.gift != null) {
                                    org.telegram.ui.Wallet.s8 s8Var = o6Var.k0;
                                    int i13 = org.telegram.ui.Wallet.e8.b;
                                    n41 K = n41.K(org.telegram.ui.Wallet.e8.class);
                                    K.v = 1;
                                    K.H = nftitem;
                                    K.I = s8Var;
                                    arrayList.add(K);
                                } else {
                                    int i14 = org.telegram.ui.Wallet.b.b;
                                    n41 K2 = n41.K(org.telegram.ui.Wallet.b.class);
                                    K2.H = nftitem;
                                    K2.v = 1;
                                    arrayList.add(K2);
                                }
                            }
                        }
                        if (arrayList.isEmpty() && !o6Var.l0.isEmpty()) {
                            org.telegram.ui.Wallet.m0 m0Var2 = o6Var.H0;
                            if (!m0Var2.i && m0Var2.g) {
                                arrayList.add(n41.r(org.telegram.messenger.gd.N0(2131747974, null)));
                            }
                        }
                        org.telegram.ui.Wallet.m0 m0Var3 = o6Var.H0;
                        if (m0Var3.i) {
                            for (int i15 = 0; i15 < 3; i15++) {
                                int i16 = org.telegram.ui.Wallet.d.b;
                                n41 K3 = n41.K(org.telegram.ui.Wallet.d.class);
                                K3.v = 1;
                                K3.d = (-1) - i15;
                                arrayList.add(K3);
                            }
                            break;
                        } else if (m0Var3.m != null) {
                            arrayList.add(n41.e(-10001, org.telegram.messenger.gd.N0(2131745856, null)));
                            break;
                        }
                    }
                }
                break;
        }
    }
}

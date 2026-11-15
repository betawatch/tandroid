package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ q3(c6 c6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                final cg.a aVar = (cg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o4 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final c6 c6Var = this.b;
                updatestargiftprice.stargift = c6Var.B1();
                updatestargiftprice.resell_amount = o4;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(c6Var.a);
                final int i7 = 0;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() { // from class: di.z1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final c6 c6Var2 = c6Var;
                                final Runnable runnable2 = runnable;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.h3(new bi.m1(c6Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 3));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i10 = 1;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: di.m2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i10) {
                                                    case 0:
                                                        c6Var2.k().f0(tL_error, false);
                                                        Runnable runnable3 = runnable2;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        c6Var2.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable2;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    np.s1(c6Var2.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i11 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final cg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.l2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i12 = i11;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable3 = runnable2;
                                            cg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            c6 c6Var3 = c6Var2;
                                            switch (i12) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    c6Var3.b2.setResellPrice(aVar3);
                                                    bi.o3 o3Var = c6Var3.g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    c6Var3.b2.setResellPrice(aVar3);
                                                    bi.o3 o3Var2 = c6Var3.g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    c6Var3.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750028, c6Var3.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final c6 c6Var3 = c6Var;
                                final Runnable runnable3 = runnable;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i12 = 0;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: di.m2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        c6Var3.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        c6Var3.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable3;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    np.s1(c6Var3.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final cg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.l2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            c6 c6Var32 = c6Var3;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var = c6Var32.g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var2 = c6Var32.g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    c6Var32.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750028, c6Var32.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                z10 z10Var = (z10) obj;
                Boolean bool = (Boolean) obj2;
                c6 c6Var2 = this.b;
                bi.y5 y5Var = c6Var2.S2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (y5Var == null) {
                    bi.y5 y5Var2 = new bi.y5(c6Var2.a, tL_starGiftUnique2.gift_id);
                    c6Var2.S2 = y5Var2;
                    y5Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (true) {
                    w4[] w4VarArr = c6Var2.b2.N.n;
                    if (i10 >= w4VarArr.length) {
                        bi.z5 z5Var = new bi.z5(c6Var2.getContext(), tL_starGiftUnique2.title, c6Var2.S2);
                        z5Var.c2.addAll(hashSet);
                        z5Var.e2.O(true);
                        z5Var.d2 = bool.booleanValue();
                        z5Var.a2.set(org.telegram.messenger.g0.X2(hd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        z5Var.b2 = new y1(z10Var, 0);
                        z5Var.show();
                        break;
                    } else {
                        TL_stars.StarGift starGift = w4VarArr[i10].h;
                        if ((starGift != null ? starGift : null) != null) {
                            if (starGift == null) {
                                starGift = null;
                            }
                            hashSet.add(Long.valueOf(starGift.id));
                        }
                        i10++;
                    }
                }
            default:
                final cg.a aVar2 = (cg.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final c6 c6Var3 = this.b;
                updatestargiftprice2.stargift = c6Var3.B1();
                updatestargiftprice2.resell_amount = o10;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(c6Var3.a);
                final int i11 = 1;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() { // from class: di.z1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final c6 c6Var22 = c6Var3;
                                final Runnable runnable22 = runnable2;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.h3(new bi.m1(c6Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 3));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i102 = 1;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: di.m2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i102) {
                                                    case 0:
                                                        c6Var22.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable22;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        c6Var22.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable22;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    np.s1(c6Var22.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i112 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final cg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.l2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i112;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable22;
                                            cg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            c6 c6Var32 = c6Var22;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var = c6Var32.g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var32.b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var2 = c6Var32.g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    c6Var32.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750028, c6Var32.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final c6 c6Var32 = c6Var3;
                                final Runnable runnable3 = runnable2;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i12 = 0;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: di.m2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        c6Var32.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        c6Var32.k().f0(tL_error, false);
                                                        Runnable runnable4 = runnable3;
                                                        if (runnable4 != null) {
                                                            runnable4.run();
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                } else {
                                    np.s1(c6Var32.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final cg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: di.l2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            c6 c6Var322 = c6Var32;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var322.b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var = c6Var322.g3;
                                                    if (o3Var != null) {
                                                        o3Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    c6Var322.b2.setResellPrice(aVar32);
                                                    bi.o3 o3Var2 = c6Var322.g3;
                                                    if (o3Var2 != null) {
                                                        o3Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    c6Var322.k().Q(R.raw.contact_check, 36, hd.a0(null, null, 2131750028, c6Var322.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}

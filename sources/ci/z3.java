package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ z3(l6 l6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                final dg.a aVar = (dg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o10 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final l6 l6Var = this.b;
                updatestargiftprice.stargift = l6Var.B1();
                updatestargiftprice.resell_amount = o10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(l6Var.a);
                final int i3 = 0;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() { // from class: ci.f2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var2 = l6Var;
                                final Runnable runnable2 = runnable;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.h3(new ai.r1(l6Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 3));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i10 = 1;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i10) {
                                                    case 0:
                                                        l6Var2.k().f0(tL_error, false);
                                                        Runnable runnable3 = runnable2;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        l6Var2.k().f0(tL_error, false);
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
                                    hp.s1(l6Var2.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i11 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final dg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i12 = i11;
                                            dg.b bVar = dg.b.a;
                                            dg.b bVar2 = dg.b.b;
                                            Runnable runnable3 = runnable2;
                                            dg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            l6 l6Var3 = l6Var2;
                                            switch (i12) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    l6Var3.Y1.setResellPrice(aVar3);
                                                    ai.a4 a4Var = l6Var3.d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
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
                                                    l6Var3.Y1.setResellPrice(aVar3);
                                                    ai.a4 a4Var2 = l6Var3.d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    l6Var3.k().Q(R.raw.contact_check, 36, bd.a0(null, null, 2131750036, l6Var3.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var3 = l6Var;
                                final Runnable runnable3 = runnable;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i12 = 0;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        l6Var3.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        l6Var3.k().f0(tL_error, false);
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
                                    hp.s1(l6Var3.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final dg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            dg.b bVar = dg.b.a;
                                            dg.b bVar2 = dg.b.b;
                                            Runnable runnable32 = runnable3;
                                            dg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            l6 l6Var32 = l6Var3;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var = l6Var32.d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
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
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var2 = l6Var32.d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    l6Var32.k().Q(R.raw.contact_check, 36, bd.a0(null, null, 2131750036, l6Var32.z1())).j();
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
                u10 u10Var = (u10) obj;
                Boolean bool = (Boolean) obj2;
                l6 l6Var2 = this.b;
                ai.g6 g6Var = l6Var2.P2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (g6Var == null) {
                    ai.g6 g6Var2 = new ai.g6(l6Var2.a, tL_starGiftUnique2.gift_id);
                    l6Var2.P2 = g6Var2;
                    g6Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (true) {
                    f5[] f5VarArr = l6Var2.Y1.N.n;
                    if (i10 >= f5VarArr.length) {
                        ai.h6 h6Var = new ai.h6(l6Var2.getContext(), tL_starGiftUnique2.title, l6Var2.P2);
                        h6Var.Z1.addAll(hashSet);
                        h6Var.b2.O(true);
                        h6Var.a2 = bool.booleanValue();
                        h6Var.X1.set(org.telegram.messenger.g0.X2(bd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        h6Var.Y1 = new e2(u10Var, 0);
                        h6Var.show();
                        break;
                    } else {
                        TL_stars.StarGift starGift = f5VarArr[i10].h;
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
                final dg.a aVar2 = (dg.a) obj;
                final Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarsAmount o11 = aVar2.o();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final l6 l6Var3 = this.b;
                updatestargiftprice2.stargift = l6Var3.B1();
                updatestargiftprice2.resell_amount = o11;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(l6Var3.a);
                final int i11 = 1;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() { // from class: ci.f2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var22 = l6Var3;
                                final Runnable runnable22 = runnable2;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.h3(new ai.r1(l6Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 3));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i102 = 1;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i102) {
                                                    case 0:
                                                        l6Var22.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable22;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        l6Var22.k().f0(tL_error, false);
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
                                    hp.s1(l6Var22.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i112 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final dg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i112;
                                            dg.b bVar = dg.b.a;
                                            dg.b bVar2 = dg.b.b;
                                            Runnable runnable32 = runnable22;
                                            dg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            l6 l6Var32 = l6Var22;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var = l6Var32.d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
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
                                                    l6Var32.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var2 = l6Var32.d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    l6Var32.k().Q(R.raw.contact_check, 36, bd.a0(null, null, 2131750036, l6Var32.z1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final l6 l6Var32 = l6Var3;
                                final Runnable runnable3 = runnable2;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i12 = 0;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        l6Var32.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        l6Var32.k().f0(tL_error, false);
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
                                    hp.s1(l6Var32.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final dg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            dg.b bVar = dg.b.a;
                                            dg.b bVar2 = dg.b.b;
                                            Runnable runnable32 = runnable3;
                                            dg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            l6 l6Var322 = l6Var32;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    l6Var322.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var = l6Var322.d3;
                                                    if (a4Var != null) {
                                                        a4Var.run();
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
                                                    l6Var322.Y1.setResellPrice(aVar32);
                                                    ai.a4 a4Var2 = l6Var322.d3;
                                                    if (a4Var2 != null) {
                                                        a4Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    l6Var322.k().Q(R.raw.contact_check, 36, bd.a0(null, null, 2131750036, l6Var322.z1())).j();
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

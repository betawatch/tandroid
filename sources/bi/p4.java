package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ p4(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                final cg.a aVar = (cg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount o4 = aVar.o();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final k7 k7Var = this.b;
                updatestargiftprice.stargift = k7Var.A1();
                updatestargiftprice.resell_amount = o4;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k7Var.a);
                final int i7 = 0;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() { // from class: bi.o2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i7) {
                            case 0:
                                boolean z9 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var2 = k7Var;
                                final Runnable runnable2 = runnable;
                                if (!z9) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.h3(new d3(k7Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 1));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i10 = 1;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.f3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i10) {
                                                    case 0:
                                                        k7Var2.k().f0(tL_error, false);
                                                        Runnable runnable3 = runnable2;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        k7Var2.k().f0(tL_error, false);
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
                                    qp.s1(k7Var2.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i11 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final cg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i12 = i11;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable3 = runnable2;
                                            cg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            k7 k7Var3 = k7Var2;
                                            switch (i12) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).o());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).o());
                                                    k7Var3.a2.setResellPrice(aVar3);
                                                    zh.p1 p1Var = k7Var3.f3;
                                                    if (p1Var != null) {
                                                        p1Var.run();
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
                                                    k7Var3.a2.setResellPrice(aVar3);
                                                    zh.p1 p1Var2 = k7Var3.f3;
                                                    if (p1Var2 != null) {
                                                        p1Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    k7Var3.k().Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131750028, k7Var3.y1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var3 = k7Var;
                                final Runnable runnable3 = runnable;
                                if (!z10) {
                                    if (tL_error != null) {
                                        final int i12 = 0;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.f3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        k7Var3.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        k7Var3.k().f0(tL_error, false);
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
                                    qp.s1(k7Var3.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final cg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            k7 k7Var32 = k7Var3;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var32.a2.setResellPrice(aVar32);
                                                    zh.p1 p1Var = k7Var32.f3;
                                                    if (p1Var != null) {
                                                        p1Var.run();
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
                                                    k7Var32.a2.setResellPrice(aVar32);
                                                    zh.p1 p1Var2 = k7Var32.f3;
                                                    if (p1Var2 != null) {
                                                        p1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    k7Var32.k().Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131750028, k7Var32.y1())).j();
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
                c20 c20Var = (c20) obj;
                Boolean bool = (Boolean) obj2;
                k7 k7Var2 = this.b;
                zh.k3 k3Var = k7Var2.R2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (k3Var == null) {
                    zh.k3 k3Var2 = new zh.k3(k7Var2.a, tL_starGiftUnique2.gift_id);
                    k7Var2.R2 = k3Var2;
                    k3Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (true) {
                    b6[] b6VarArr = k7Var2.a2.M.n;
                    if (i10 >= b6VarArr.length) {
                        zh.l3 l3Var = new zh.l3(k7Var2.getContext(), tL_starGiftUnique2.title, k7Var2.R2);
                        l3Var.b2.addAll(hashSet);
                        l3Var.d2.O(true);
                        l3Var.c2 = bool.booleanValue();
                        l3Var.Z1.set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        l3Var.a2 = new n2(c20Var, 0);
                        l3Var.show();
                        break;
                    } else {
                        TL_stars.StarGift starGift = b6VarArr[i10].h;
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
                final k7 k7Var3 = this.b;
                updatestargiftprice2.stargift = k7Var3.A1();
                updatestargiftprice2.resell_amount = o10;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(k7Var3.a);
                final int i11 = 1;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() { // from class: bi.o2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i11) {
                            case 0:
                                boolean z9 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var22 = k7Var3;
                                final Runnable runnable22 = runnable2;
                                if (!z9) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.h3(new d3(k7Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 1));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i102 = 1;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.f3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i102) {
                                                    case 0:
                                                        k7Var22.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable22;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        k7Var22.k().f0(tL_error, false);
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
                                    qp.s1(k7Var22.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i112 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final cg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i112;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable22;
                                            cg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            k7 k7Var32 = k7Var22;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var32.a2.setResellPrice(aVar32);
                                                    zh.p1 p1Var = k7Var32.f3;
                                                    if (p1Var != null) {
                                                        p1Var.run();
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
                                                    k7Var32.a2.setResellPrice(aVar32);
                                                    zh.p1 p1Var2 = k7Var32.f3;
                                                    if (p1Var2 != null) {
                                                        p1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    k7Var32.k().Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131750028, k7Var32.y1())).j();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final k7 k7Var32 = k7Var3;
                                final Runnable runnable3 = runnable2;
                                if (!z10) {
                                    if (tL_error != null) {
                                        final int i12 = 0;
                                        org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.f3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        k7Var32.k().f0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        k7Var32.k().f0(tL_error, false);
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
                                    qp.s1(k7Var32.a).O3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final cg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.e3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            k7 k7Var322 = k7Var32;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).o());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).o());
                                                    k7Var322.a2.setResellPrice(aVar32);
                                                    zh.p1 p1Var = k7Var322.f3;
                                                    if (p1Var != null) {
                                                        p1Var.run();
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
                                                    k7Var322.a2.setResellPrice(aVar32);
                                                    zh.p1 p1Var2 = k7Var322.f3;
                                                    if (p1Var2 != null) {
                                                        p1Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    k7Var322.k().Q(R.raw.contact_check, 36, org.telegram.messenger.id.a0(null, null, 2131750028, k7Var322.y1())).j();
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

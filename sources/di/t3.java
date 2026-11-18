package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t3 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;

    public /* synthetic */ t3(f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i7) {
        this.a = i7;
        this.b = f6Var;
        this.c = tL_starGiftUnique;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                final cg.a aVar = (cg.a) obj;
                final Runnable runnable = (Runnable) obj2;
                TL_stars.StarsAmount q10 = aVar.q();
                TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
                final f6 f6Var = this.b;
                updatestargiftprice.stargift = f6Var.G1();
                updatestargiftprice.resell_amount = q10;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(f6Var.a);
                final int i7 = 0;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
                connectionsManager.sendRequest(updatestargiftprice, new RequestDelegate() { // from class: di.b2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i7) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final f6 f6Var2 = f6Var;
                                final Runnable runnable2 = runnable;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.g3(new bi.m2(f6Var2, Long.parseLong(tL_error.text.substring(26)), runnable2, 2));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i10 = 0;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: di.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i10) {
                                                    case 0:
                                                        f6Var2.k().g0(tL_error, false);
                                                        Runnable runnable3 = runnable2;
                                                        if (runnable3 != null) {
                                                            runnable3.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f6Var2.k().g0(tL_error, false);
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
                                    mp.u1(f6Var2.a).V3((TLRPC.Updates) tLObject, false);
                                    final int i11 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                                    final cg.a aVar2 = aVar;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: di.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i12 = i11;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable3 = runnable2;
                                            cg.a aVar3 = aVar2;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique2;
                                            f6 f6Var3 = f6Var2;
                                            switch (i12) {
                                                case 0:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList;
                                                    arrayList.add(aVar3.e(bVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).q());
                                                    f6Var3.b2.setResellPrice(aVar3);
                                                    bi.w5 w5Var = f6Var3.j3;
                                                    if (w5Var != null) {
                                                        w5Var.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                    }
                                                    f6Var3.k().Q(R.raw.contact_check, 36, gd.a0(null, null, 2131750012, f6Var3.E1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique3.flags |= 16;
                                                    tL_starGiftUnique3.resale_ton_only = aVar3.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique3.resell_amount = arrayList2;
                                                    arrayList2.add(aVar3.e(bVar).q());
                                                    tL_starGiftUnique3.resell_amount.add(aVar3.e(bVar2).q());
                                                    f6Var3.b2.setResellPrice(aVar3);
                                                    bi.w5 w5Var2 = f6Var3.j3;
                                                    if (w5Var2 != null) {
                                                        w5Var2.run();
                                                    }
                                                    if (runnable3 != null) {
                                                        runnable3.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final f6 f6Var3 = f6Var;
                                final Runnable runnable3 = runnable;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i12 = 1;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: di.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        f6Var3.k().g0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f6Var3.k().g0(tL_error, false);
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
                                    mp.u1(f6Var3.a).V3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = tL_starGiftUnique;
                                    final cg.a aVar3 = aVar;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: di.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                            f6 f6Var32 = f6Var3;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.b2.setResellPrice(aVar32);
                                                    bi.w5 w5Var = f6Var32.j3;
                                                    if (w5Var != null) {
                                                        w5Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    f6Var32.k().Q(R.raw.contact_check, 36, gd.a0(null, null, 2131750012, f6Var32.E1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.b2.setResellPrice(aVar32);
                                                    bi.w5 w5Var2 = f6Var32.j3;
                                                    if (w5Var2 != null) {
                                                        w5Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
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
                x10 x10Var = (x10) obj;
                Boolean bool = (Boolean) obj2;
                f6 f6Var2 = this.b;
                bi.f8 f8Var = f6Var2.S2;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.c;
                if (f8Var == null) {
                    bi.f8 f8Var2 = new bi.f8(f6Var2.a, tL_starGiftUnique2.gift_id);
                    f6Var2.S2 = f8Var2;
                    f8Var2.a();
                }
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (true) {
                    z4[] z4VarArr = f6Var2.b2.N.n;
                    if (i10 >= z4VarArr.length) {
                        bi.g8 g8Var = new bi.g8(f6Var2.getContext(), tL_starGiftUnique2.title, f6Var2.S2);
                        g8Var.c2.addAll(hashSet);
                        g8Var.e2.O(true);
                        g8Var.d2 = bool.booleanValue();
                        g8Var.a2.set(org.telegram.messenger.g0.W2(gd.G(4 - hashSet.size(), "GiftCraftSelect", new Object[0])));
                        g8Var.b2 = new c2(x10Var, 0);
                        g8Var.show();
                        break;
                    } else {
                        TL_stars.StarGift starGift = z4VarArr[i10].h;
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
                TL_stars.StarsAmount q11 = aVar2.q();
                TL_stars.updateStarGiftPrice updatestargiftprice2 = new TL_stars.updateStarGiftPrice();
                final f6 f6Var3 = this.b;
                updatestargiftprice2.stargift = f6Var3.G1();
                updatestargiftprice2.resell_amount = q11;
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(f6Var3.a);
                final int i11 = 1;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.c;
                connectionsManager2.sendRequest(updatestargiftprice2, new RequestDelegate() { // from class: di.b2
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.Updates;
                                final f6 f6Var22 = f6Var3;
                                final Runnable runnable22 = runnable2;
                                if (!z10) {
                                    if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
                                        org.telegram.messenger.g0.g3(new bi.m2(f6Var22, Long.parseLong(tL_error.text.substring(26)), runnable22, 2));
                                        break;
                                    } else if (tL_error != null) {
                                        final int i102 = 0;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: di.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i102) {
                                                    case 0:
                                                        f6Var22.k().g0(tL_error, false);
                                                        Runnable runnable32 = runnable22;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f6Var22.k().g0(tL_error, false);
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
                                    mp.u1(f6Var22.a).V3((TLRPC.Updates) tLObject, false);
                                    final int i112 = 0;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique3;
                                    final cg.a aVar22 = aVar2;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: di.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i112;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable22;
                                            cg.a aVar32 = aVar22;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique22;
                                            f6 f6Var32 = f6Var22;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.b2.setResellPrice(aVar32);
                                                    bi.w5 w5Var = f6Var32.j3;
                                                    if (w5Var != null) {
                                                        w5Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    f6Var32.k().Q(R.raw.contact_check, 36, gd.a0(null, null, 2131750012, f6Var32.E1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique32.flags |= 16;
                                                    tL_starGiftUnique32.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique32.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique32.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var32.b2.setResellPrice(aVar32);
                                                    bi.w5 w5Var2 = f6Var32.j3;
                                                    if (w5Var2 != null) {
                                                        w5Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                }
                                break;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.Updates;
                                final f6 f6Var32 = f6Var3;
                                final Runnable runnable3 = runnable2;
                                if (!z11) {
                                    if (tL_error != null) {
                                        final int i12 = 1;
                                        org.telegram.messenger.g0.g3(new Runnable() { // from class: di.s2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i12) {
                                                    case 0:
                                                        f6Var32.k().g0(tL_error, false);
                                                        Runnable runnable32 = runnable3;
                                                        if (runnable32 != null) {
                                                            runnable32.run();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        f6Var32.k().g0(tL_error, false);
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
                                    mp.u1(f6Var32.a).V3((TLRPC.Updates) tLObject, false);
                                    final int i13 = 1;
                                    final TL_stars.TL_starGiftUnique tL_starGiftUnique32 = tL_starGiftUnique3;
                                    final cg.a aVar3 = aVar2;
                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: di.r2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i122 = i13;
                                            cg.b bVar = cg.b.a;
                                            cg.b bVar2 = cg.b.b;
                                            Runnable runnable32 = runnable3;
                                            cg.a aVar32 = aVar3;
                                            TL_stars.TL_starGiftUnique tL_starGiftUnique322 = tL_starGiftUnique32;
                                            f6 f6Var322 = f6Var32;
                                            switch (i122) {
                                                case 0:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList;
                                                    arrayList.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var322.b2.setResellPrice(aVar32);
                                                    bi.w5 w5Var = f6Var322.j3;
                                                    if (w5Var != null) {
                                                        w5Var.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                    }
                                                    f6Var322.k().Q(R.raw.contact_check, 36, gd.a0(null, null, 2131750012, f6Var322.E1())).j();
                                                    break;
                                                default:
                                                    tL_starGiftUnique322.flags |= 16;
                                                    tL_starGiftUnique322.resale_ton_only = aVar32.a == bVar2;
                                                    ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                                                    tL_starGiftUnique322.resell_amount = arrayList2;
                                                    arrayList2.add(aVar32.e(bVar).q());
                                                    tL_starGiftUnique322.resell_amount.add(aVar32.e(bVar2).q());
                                                    f6Var322.b2.setResellPrice(aVar32);
                                                    bi.w5 w5Var2 = f6Var322.j3;
                                                    if (w5Var2 != null) {
                                                        w5Var2.run();
                                                    }
                                                    if (runnable32 != null) {
                                                        runnable32.run();
                                                        break;
                                                    }
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

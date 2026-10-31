package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;

    public /* synthetic */ gh(ui uiVar, int i10) {
        this.a = i10;
        this.b = uiVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                if (tL_error == null) {
                    uiVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new eg(uiVar, 11));
                    break;
                } else {
                    i0.g3(new eg(uiVar, 10));
                    break;
                }
            case 1:
                final int i10 = 1;
                final ui uiVar2 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        ui uiVar3 = uiVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar4 = uiVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar4.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar4.getUserConfig().h0 = System.currentTimeMillis();
                                    uiVar4.getUserConfig().v(false);
                                    uiVar4.s1(uiVar4.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                        if (uiVar4.currentAccount == d20.s0) {
                                            uiVar4.l1(ic.b(tL_messages_stickerSet.documents.get(i12)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    uiVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar3.getMessagesStorage().a.c(new eg(uiVar3, 12));
                                    uiVar3.f0[0].clear();
                                    zs.f(uiVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    uiVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar2;
                                    uiVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(zs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                uiVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar3.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar2;
                                    uiVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(zs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                i0.g3(new mg(this.b, tL_error, tLObject, 0));
                break;
            case 3:
                final int i11 = 4;
                final ui uiVar3 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        ui uiVar32 = uiVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar4 = uiVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar4.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar4.getUserConfig().h0 = System.currentTimeMillis();
                                    uiVar4.getUserConfig().v(false);
                                    uiVar4.s1(uiVar4.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                        if (uiVar4.currentAccount == d20.s0) {
                                            uiVar4.l1(ic.b(tL_messages_stickerSet.documents.get(i12)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    uiVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().a.c(new eg(uiVar32, 12));
                                    uiVar32.f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    uiVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar3;
                                    uiVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(zs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar3;
                                    uiVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(zs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i12 = 3;
                final ui uiVar4 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        ui uiVar32 = uiVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (uiVar42.currentAccount == d20.s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    uiVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().a.c(new eg(uiVar32, 12));
                                    uiVar32.f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar5 = uiVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar5.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar5.getUserConfig().i0 = System.currentTimeMillis();
                                    uiVar5.getUserConfig().v(false);
                                    uiVar5.s1(uiVar5.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    uiVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar4;
                                    uiVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(zs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar4;
                                    uiVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(zs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i13 = 2;
                final ui uiVar5 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i13;
                        ui uiVar32 = uiVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (uiVar42.currentAccount == d20.s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    uiVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().a.c(new eg(uiVar32, 12));
                                    uiVar32.f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    uiVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar6 = uiVar5;
                                    uiVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    uiVar6.getUserConfig().v(false);
                                    uiVar6.s1(uiVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar6.getNotificationCenter().k(zs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar5;
                                    uiVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(zs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 6:
                if (tLObject != null) {
                    i0.g3(new ag(this.b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    break;
                }
                break;
            case 7:
                final int i14 = 5;
                final ui uiVar6 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i14;
                        ui uiVar32 = uiVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (uiVar42.currentAccount == d20.s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    uiVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().a.c(new eg(uiVar32, 12));
                                    uiVar32.f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    uiVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar62 = uiVar6;
                                    uiVar62.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar62.getUserConfig().f0 = System.currentTimeMillis();
                                    uiVar62.getUserConfig().v(false);
                                    uiVar62.s1(uiVar62.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar62.getNotificationCenter().k(zs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar7 = uiVar6;
                                    uiVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    uiVar7.getUserConfig().v(false);
                                    uiVar7.s1(uiVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar7.getNotificationCenter().k(zs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 8:
                final int i15 = 0;
                final ui uiVar7 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.xf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i15;
                        ui uiVar32 = uiVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar42 = uiVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    uiVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    uiVar42.getUserConfig().v(false);
                                    uiVar42.s1(uiVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (uiVar42.currentAccount == d20.s0) {
                                            uiVar42.l1(ic.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    uiVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    uiVar32.getMessagesStorage().a.c(new eg(uiVar32, 12));
                                    uiVar32.f0[0].clear();
                                    zs.f(uiVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ui uiVar52 = uiVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    uiVar52.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    uiVar52.getUserConfig().i0 = System.currentTimeMillis();
                                    uiVar52.getUserConfig().v(false);
                                    uiVar52.s1(uiVar52.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    uiVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar62 = uiVar7;
                                    uiVar62.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    uiVar62.getUserConfig().f0 = System.currentTimeMillis();
                                    uiVar62.getUserConfig().v(false);
                                    uiVar62.s1(uiVar62.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar62.getNotificationCenter().k(zs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                uiVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    uiVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    uiVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ui uiVar72 = uiVar7;
                                    uiVar72.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    uiVar72.getUserConfig().g0 = System.currentTimeMillis();
                                    uiVar72.getUserConfig().v(false);
                                    uiVar72.s1(uiVar72.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    uiVar72.getNotificationCenter().k(zs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ui uiVar8 = this.b;
                uiVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    uiVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    break;
                }
                break;
        }
    }
}

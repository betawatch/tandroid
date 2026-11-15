package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;

    public /* synthetic */ gh(si siVar, int i7) {
        this.a = i7;
        this.b = siVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                si siVar = this.b;
                if (tL_error == null) {
                    siVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new eg(siVar, 11));
                    break;
                } else {
                    g0.h3(new eg(siVar, 10));
                    break;
                }
            case 1:
                final int i7 = 1;
                final si siVar2 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        si siVar3 = siVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar4 = siVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar4.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    siVar4.getUserConfig().i0 = System.currentTimeMillis();
                                    siVar4.getUserConfig().v(false);
                                    siVar4.s1(siVar4.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (siVar4.currentAccount == m10.t0) {
                                            siVar4.l1(gc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    siVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar3.getMessagesStorage().a.c(new eg(siVar3, 12));
                                    siVar3.g0[0].clear();
                                    ns.f(siVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar5 = siVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    siVar5.getUserConfig().v(false);
                                    siVar5.s1(siVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    siVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar2;
                                    siVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.s1(siVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(ns.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                siVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar3.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar2;
                                    siVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.s1(siVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(ns.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                g0.h3(new mg(this.b, tL_error, tLObject, 0));
                break;
            case 3:
                final int i10 = 4;
                final si siVar3 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        si siVar32 = siVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar4 = siVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar4.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    siVar4.getUserConfig().i0 = System.currentTimeMillis();
                                    siVar4.getUserConfig().v(false);
                                    siVar4.s1(siVar4.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (siVar4.currentAccount == m10.t0) {
                                            siVar4.l1(gc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    siVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().a.c(new eg(siVar32, 12));
                                    siVar32.g0[0].clear();
                                    ns.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar5 = siVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    siVar5.getUserConfig().v(false);
                                    siVar5.s1(siVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    siVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar3;
                                    siVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.s1(siVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(ns.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar3;
                                    siVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.s1(siVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(ns.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i11 = 3;
                final si siVar4 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        si siVar32 = siVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.s1(siVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (siVar42.currentAccount == m10.t0) {
                                            siVar42.l1(gc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    siVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().a.c(new eg(siVar32, 12));
                                    siVar32.g0[0].clear();
                                    ns.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar5 = siVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    siVar5.getUserConfig().v(false);
                                    siVar5.s1(siVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    siVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar4;
                                    siVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.s1(siVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(ns.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar4;
                                    siVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.s1(siVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(ns.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i12 = 2;
                final si siVar5 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i12;
                        si siVar32 = siVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.s1(siVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (siVar42.currentAccount == m10.t0) {
                                            siVar42.l1(gc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    siVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().a.c(new eg(siVar32, 12));
                                    siVar32.g0[0].clear();
                                    ns.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar52 = siVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    siVar52.getUserConfig().v(false);
                                    siVar52.s1(siVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    siVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar6 = siVar5;
                                    siVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    siVar6.getUserConfig().v(false);
                                    siVar6.s1(siVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar6.getNotificationCenter().k(ns.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar5;
                                    siVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.s1(siVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(ns.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 6:
                if (tLObject != null) {
                    g0.h3(new bg(this.b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    break;
                }
                break;
            case 7:
                final int i13 = 5;
                final si siVar6 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i13;
                        si siVar32 = siVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.s1(siVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (siVar42.currentAccount == m10.t0) {
                                            siVar42.l1(gc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    siVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().a.c(new eg(siVar32, 12));
                                    siVar32.g0[0].clear();
                                    ns.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar52 = siVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    siVar52.getUserConfig().v(false);
                                    siVar52.s1(siVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    siVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar62 = siVar6;
                                    siVar62.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar62.getUserConfig().g0 = System.currentTimeMillis();
                                    siVar62.getUserConfig().v(false);
                                    siVar62.s1(siVar62.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar62.getNotificationCenter().k(ns.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar7 = siVar6;
                                    siVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    siVar7.getUserConfig().v(false);
                                    siVar7.s1(siVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar7.getNotificationCenter().k(ns.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 8:
                final int i14 = 0;
                final si siVar7 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i14;
                        si siVar32 = siVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar42 = siVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    siVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    siVar42.getUserConfig().v(false);
                                    siVar42.s1(siVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (siVar42.currentAccount == m10.t0) {
                                            siVar42.l1(gc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    siVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    siVar32.getMessagesStorage().a.c(new eg(siVar32, 12));
                                    siVar32.g0[0].clear();
                                    ns.f(siVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                si siVar52 = siVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    siVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    siVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    siVar52.getUserConfig().v(false);
                                    siVar52.s1(siVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    siVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar62 = siVar7;
                                    siVar62.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    siVar62.getUserConfig().g0 = System.currentTimeMillis();
                                    siVar62.getUserConfig().v(false);
                                    siVar62.s1(siVar62.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar62.getNotificationCenter().k(ns.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                siVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    siVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    siVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    si siVar72 = siVar7;
                                    siVar72.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    siVar72.getUserConfig().h0 = System.currentTimeMillis();
                                    siVar72.getUserConfig().v(false);
                                    siVar72.s1(siVar72.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    siVar72.getNotificationCenter().k(ns.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                si siVar8 = this.b;
                siVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    siVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    break;
                }
                break;
        }
    }
}

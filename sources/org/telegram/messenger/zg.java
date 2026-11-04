package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    public /* synthetic */ zg(li liVar, int i3) {
        this.a = i3;
        this.b = liVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                li liVar = this.b;
                if (tL_error == null) {
                    liVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new xf(liVar, 11));
                    break;
                } else {
                    g0.h3(new xf(liVar, 10));
                    break;
                }
            case 1:
                final int i3 = 1;
                final li liVar2 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.rf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        li liVar3 = liVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar4 = liVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar4.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    liVar4.getUserConfig().i0 = System.currentTimeMillis();
                                    liVar4.getUserConfig().v(false);
                                    liVar4.s1(liVar4.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (liVar4.currentAccount == h10.t0) {
                                            liVar4.l1(ac.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    liVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar3.getMessagesStorage().a.c(new xf(liVar3, 12));
                                    liVar3.g0[0].clear();
                                    hs.f(liVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar5 = liVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    liVar5.getUserConfig().v(false);
                                    liVar5.s1(liVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    liVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar2;
                                    liVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(hs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                liVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar3.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar2;
                                    liVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(hs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                g0.h3(new fg(this.b, tL_error, tLObject, 0));
                break;
            case 3:
                final int i10 = 4;
                final li liVar3 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.rf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        li liVar32 = liVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar4 = liVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar4.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    liVar4.getUserConfig().i0 = System.currentTimeMillis();
                                    liVar4.getUserConfig().v(false);
                                    liVar4.s1(liVar4.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (liVar4.currentAccount == h10.t0) {
                                            liVar4.l1(ac.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    liVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().a.c(new xf(liVar32, 12));
                                    liVar32.g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar5 = liVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    liVar5.getUserConfig().v(false);
                                    liVar5.s1(liVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    liVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar3;
                                    liVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(hs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar3;
                                    liVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(hs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i11 = 3;
                final li liVar4 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.rf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        li liVar32 = liVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (liVar42.currentAccount == h10.t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    liVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().a.c(new xf(liVar32, 12));
                                    liVar32.g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar5 = liVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    liVar5.getUserConfig().v(false);
                                    liVar5.s1(liVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    liVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar4;
                                    liVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(hs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar4;
                                    liVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(hs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i12 = 2;
                final li liVar5 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.rf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i12;
                        li liVar32 = liVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (liVar42.currentAccount == h10.t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    liVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().a.c(new xf(liVar32, 12));
                                    liVar32.g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar52 = liVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    liVar52.getUserConfig().v(false);
                                    liVar52.s1(liVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    liVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar6 = liVar5;
                                    liVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    liVar6.getUserConfig().v(false);
                                    liVar6.s1(liVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar6.getNotificationCenter().k(hs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar5;
                                    liVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(hs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 6:
                if (tLObject != null) {
                    g0.h3(new uf(this.b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    break;
                }
                break;
            case 7:
                final int i13 = 5;
                final li liVar6 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.rf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i13;
                        li liVar32 = liVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (liVar42.currentAccount == h10.t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    liVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().a.c(new xf(liVar32, 12));
                                    liVar32.g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar52 = liVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    liVar52.getUserConfig().v(false);
                                    liVar52.s1(liVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    liVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar62 = liVar6;
                                    liVar62.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar62.getUserConfig().g0 = System.currentTimeMillis();
                                    liVar62.getUserConfig().v(false);
                                    liVar62.s1(liVar62.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar62.getNotificationCenter().k(hs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar7 = liVar6;
                                    liVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    liVar7.getUserConfig().v(false);
                                    liVar7.s1(liVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar7.getNotificationCenter().k(hs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 8:
                final int i14 = 0;
                final li liVar7 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.rf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i14;
                        li liVar32 = liVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar42 = liVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    liVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    liVar42.getUserConfig().v(false);
                                    liVar42.s1(liVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (liVar42.currentAccount == h10.t0) {
                                            liVar42.l1(ac.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    liVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    liVar32.getMessagesStorage().a.c(new xf(liVar32, 12));
                                    liVar32.g0[0].clear();
                                    hs.f(liVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                li liVar52 = liVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    liVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    liVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    liVar52.getUserConfig().v(false);
                                    liVar52.s1(liVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    liVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar62 = liVar7;
                                    liVar62.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    liVar62.getUserConfig().g0 = System.currentTimeMillis();
                                    liVar62.getUserConfig().v(false);
                                    liVar62.s1(liVar62.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar62.getNotificationCenter().k(hs.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                liVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    liVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    liVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    li liVar72 = liVar7;
                                    liVar72.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    liVar72.getUserConfig().h0 = System.currentTimeMillis();
                                    liVar72.getUserConfig().v(false);
                                    liVar72.s1(liVar72.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    liVar72.getNotificationCenter().k(hs.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                li liVar8 = this.b;
                liVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    liVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    break;
                }
                break;
        }
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ih implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;

    public /* synthetic */ ih(ri riVar, int i7) {
        this.a = i7;
        this.b = riVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ri riVar = this.b;
                if (tL_error == null) {
                    riVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new eg(riVar, 12));
                    break;
                } else {
                    g0.g3(new eg(riVar, 11));
                    break;
                }
            case 1:
                final int i7 = 1;
                final ri riVar2 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.zf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        ri riVar3 = riVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar4 = riVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar4.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    riVar4.getUserConfig().i0 = System.currentTimeMillis();
                                    riVar4.getUserConfig().v(false);
                                    riVar4.v1(riVar4.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (riVar4.currentAccount == j10.t0) {
                                            riVar4.o1(fc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    riVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar3.getMessagesStorage().a.c(new eg(riVar3, 13));
                                    riVar3.g0[0].clear();
                                    ks.f(riVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar5 = riVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    riVar5.getUserConfig().v(false);
                                    riVar5.v1(riVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    riVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar2;
                                    riVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(ks.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                riVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar3.A1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar3.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar2;
                                    riVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(ks.Z2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                g0.g3(new yf(this.b, tL_error, tLObject, 0));
                break;
            case 3:
                final int i10 = 4;
                final ri riVar3 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.zf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        ri riVar32 = riVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar4 = riVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar4.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    riVar4.getUserConfig().i0 = System.currentTimeMillis();
                                    riVar4.getUserConfig().v(false);
                                    riVar4.v1(riVar4.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                                        if (riVar4.currentAccount == j10.t0) {
                                            riVar4.o1(fc.b(tL_messages_stickerSet.documents.get(i11)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    riVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().a.c(new eg(riVar32, 13));
                                    riVar32.g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar5 = riVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    riVar5.getUserConfig().v(false);
                                    riVar5.v1(riVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    riVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar3;
                                    riVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(ks.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar3;
                                    riVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(ks.Z2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i11 = 3;
                final ri riVar4 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.zf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        ri riVar32 = riVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (riVar42.currentAccount == j10.t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    riVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().a.c(new eg(riVar32, 13));
                                    riVar32.g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar5 = riVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar5.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar5.getUserConfig().j0 = System.currentTimeMillis();
                                    riVar5.getUserConfig().v(false);
                                    riVar5.v1(riVar5.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    riVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar4;
                                    riVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(ks.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar4;
                                    riVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(ks.Z2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i12 = 2;
                final ri riVar5 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.zf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i12;
                        ri riVar32 = riVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (riVar42.currentAccount == j10.t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    riVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().a.c(new eg(riVar32, 13));
                                    riVar32.g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar52 = riVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    riVar52.getUserConfig().v(false);
                                    riVar52.v1(riVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    riVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar6 = riVar5;
                                    riVar6.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar6.getUserConfig().g0 = System.currentTimeMillis();
                                    riVar6.getUserConfig().v(false);
                                    riVar6.v1(riVar6.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar6.getNotificationCenter().k(ks.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar5;
                                    riVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(ks.Z2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 6:
                if (tLObject != null) {
                    g0.g3(new cg(this.b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    break;
                }
                break;
            case 7:
                final int i13 = 5;
                final ri riVar6 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.zf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i13;
                        ri riVar32 = riVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (riVar42.currentAccount == j10.t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    riVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().a.c(new eg(riVar32, 13));
                                    riVar32.g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar52 = riVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    riVar52.getUserConfig().v(false);
                                    riVar52.v1(riVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    riVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar62 = riVar6;
                                    riVar62.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar62.getUserConfig().g0 = System.currentTimeMillis();
                                    riVar62.getUserConfig().v(false);
                                    riVar62.v1(riVar62.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar62.getNotificationCenter().k(ks.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar7 = riVar6;
                                    riVar7.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar7.getUserConfig().h0 = System.currentTimeMillis();
                                    riVar7.getUserConfig().v(false);
                                    riVar7.v1(riVar7.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar7.getNotificationCenter().k(ks.Z2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 8:
                final int i14 = 0;
                final ri riVar7 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.zf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i14;
                        ri riVar32 = riVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar42 = riVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar42.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    riVar42.getUserConfig().i0 = System.currentTimeMillis();
                                    riVar42.getUserConfig().v(false);
                                    riVar42.v1(riVar42.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i112 = 0; i112 < tL_messages_stickerSet.documents.size(); i112++) {
                                        if (riVar42.currentAccount == j10.t0) {
                                            riVar42.o1(fc.b(tL_messages_stickerSet.documents.get(i112)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    riVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    riVar32.getMessagesStorage().a.c(new eg(riVar32, 13));
                                    riVar32.g0[0].clear();
                                    ks.f(riVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                ri riVar52 = riVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    riVar52.getUserConfig().f0 = tL_messages_stickerSet2.set.short_name;
                                    riVar52.getUserConfig().j0 = System.currentTimeMillis();
                                    riVar52.getUserConfig().v(false);
                                    riVar52.v1(riVar52.getUserConfig().f0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    riVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar62 = riVar7;
                                    riVar62.getUserConfig().c0 = tL_messages_stickerSet3.set.short_name;
                                    riVar62.getUserConfig().g0 = System.currentTimeMillis();
                                    riVar62.getUserConfig().v(false);
                                    riVar62.v1(riVar62.getUserConfig().c0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar62.getNotificationCenter().k(ks.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                riVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    riVar32.A1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    riVar32.A1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ri riVar72 = riVar7;
                                    riVar72.getUserConfig().d0 = tL_messages_stickerSet4.set.short_name;
                                    riVar72.getUserConfig().h0 = System.currentTimeMillis();
                                    riVar72.getUserConfig().v(false);
                                    riVar72.v1(riVar72.getUserConfig().d0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    riVar72.getNotificationCenter().k(ks.Z2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ri riVar8 = this.b;
                riVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    riVar8.z1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    break;
                }
                break;
        }
    }
}

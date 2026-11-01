package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class hh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    public /* synthetic */ hh(vi viVar, int i10) {
        this.a = i10;
        this.b = viVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vi viVar = this.b;
                if (tL_error == null) {
                    viVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new fg(viVar, 11));
                    break;
                } else {
                    i0.g3(new fg(viVar, 10));
                    break;
                }
            case 1:
                final int i10 = 1;
                final vi viVar2 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        vi viVar3 = viVar2;
                        TLObject tLObject2 = tLObject;
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar4 = viVar2;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar4.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    viVar4.getUserConfig().h0 = System.currentTimeMillis();
                                    viVar4.getUserConfig().v(false);
                                    viVar4.s1(viVar4.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                        if (viVar4.currentAccount == e20.s0) {
                                            viVar4.l1(jc.b(tL_messages_stickerSet.documents.get(i12)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    viVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar3.getMessagesStorage().a.c(new fg(viVar3, 12));
                                    viVar3.f0[0].clear();
                                    at.f(viVar3.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar5 = viVar2;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar5.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar5.getUserConfig().i0 = System.currentTimeMillis();
                                    viVar5.getUserConfig().v(false);
                                    viVar5.s1(viVar5.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    viVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar2;
                                    viVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(at.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                viVar3.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar3.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar3.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar2;
                                    viVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(at.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                i0.g3(new ng(this.b, tL_error, tLObject, 0));
                break;
            case 3:
                final int i11 = 4;
                final vi viVar3 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        vi viVar32 = viVar3;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar4 = viVar3;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar4.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    viVar4.getUserConfig().h0 = System.currentTimeMillis();
                                    viVar4.getUserConfig().v(false);
                                    viVar4.s1(viVar4.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                        if (viVar4.currentAccount == e20.s0) {
                                            viVar4.l1(jc.b(tL_messages_stickerSet.documents.get(i12)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    viVar4.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().a.c(new fg(viVar32, 12));
                                    viVar32.f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar5 = viVar3;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar5.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar5.getUserConfig().i0 = System.currentTimeMillis();
                                    viVar5.getUserConfig().v(false);
                                    viVar5.s1(viVar5.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    viVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar3;
                                    viVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(at.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar3;
                                    viVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(at.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i12 = 3;
                final vi viVar4 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        vi viVar32 = viVar4;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar4;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (viVar42.currentAccount == e20.s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    viVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().a.c(new fg(viVar32, 12));
                                    viVar32.f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar5 = viVar4;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar5.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar5.getUserConfig().i0 = System.currentTimeMillis();
                                    viVar5.getUserConfig().v(false);
                                    viVar5.s1(viVar5.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    viVar5.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar4;
                                    viVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(at.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar4;
                                    viVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(at.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i13 = 2;
                final vi viVar5 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i13;
                        vi viVar32 = viVar5;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar5;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (viVar42.currentAccount == e20.s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    viVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().a.c(new fg(viVar32, 12));
                                    viVar32.f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar52 = viVar5;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar52.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar52.getUserConfig().i0 = System.currentTimeMillis();
                                    viVar52.getUserConfig().v(false);
                                    viVar52.s1(viVar52.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    viVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar6 = viVar5;
                                    viVar6.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar6.getUserConfig().f0 = System.currentTimeMillis();
                                    viVar6.getUserConfig().v(false);
                                    viVar6.s1(viVar6.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar6.getNotificationCenter().k(at.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar5;
                                    viVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(at.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 6:
                if (tLObject != null) {
                    i0.g3(new bg(this.b, (TLRPC.TL_messages_stickerSet) tLObject, 0));
                    break;
                }
                break;
            case 7:
                final int i14 = 5;
                final vi viVar6 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i14;
                        vi viVar32 = viVar6;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar6;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (viVar42.currentAccount == e20.s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    viVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().a.c(new fg(viVar32, 12));
                                    viVar32.f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar52 = viVar6;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar52.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar52.getUserConfig().i0 = System.currentTimeMillis();
                                    viVar52.getUserConfig().v(false);
                                    viVar52.s1(viVar52.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    viVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar62 = viVar6;
                                    viVar62.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar62.getUserConfig().f0 = System.currentTimeMillis();
                                    viVar62.getUserConfig().v(false);
                                    viVar62.s1(viVar62.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar62.getNotificationCenter().k(at.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar7 = viVar6;
                                    viVar7.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar7.getUserConfig().g0 = System.currentTimeMillis();
                                    viVar7.getUserConfig().v(false);
                                    viVar7.s1(viVar7.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar7.getNotificationCenter().k(at.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 8:
                final int i15 = 0;
                final vi viVar7 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.yf
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i15;
                        vi viVar32 = viVar7;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar42 = viVar7;
                                if (z10) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar42.getUserConfig().d0 = tL_messages_stickerSet.set.short_name;
                                    viVar42.getUserConfig().h0 = System.currentTimeMillis();
                                    viVar42.getUserConfig().v(false);
                                    viVar42.s1(viVar42.getUserConfig().d0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i122 = 0; i122 < tL_messages_stickerSet.documents.size(); i122++) {
                                        if (viVar42.currentAccount == e20.s0) {
                                            viVar42.l1(jc.b(tL_messages_stickerSet.documents.get(i122)), 0);
                                        }
                                    }
                                    break;
                                } else {
                                    viVar42.getClass();
                                    break;
                                }
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    viVar32.getMessagesStorage().a.c(new fg(viVar32, 12));
                                    viVar32.f0[0].clear();
                                    at.f(viVar32.currentAccount).k(86, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                boolean z11 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                vi viVar52 = viVar7;
                                if (z11) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    viVar52.getUserConfig().e0 = tL_messages_stickerSet2.set.short_name;
                                    viVar52.getUserConfig().i0 = System.currentTimeMillis();
                                    viVar52.getUserConfig().v(false);
                                    viVar52.s1(viVar52.getUserConfig().e0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                } else {
                                    viVar52.getClass();
                                    break;
                                }
                            case 3:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar62 = viVar7;
                                    viVar62.getUserConfig().b0 = tL_messages_stickerSet3.set.short_name;
                                    viVar62.getUserConfig().f0 = System.currentTimeMillis();
                                    viVar62.getUserConfig().v(false);
                                    viVar62.s1(viVar62.getUserConfig().b0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar62.getNotificationCenter().k(at.W2, new Object[0]);
                                    break;
                                }
                                break;
                            case 4:
                                viVar32.getClass();
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    viVar32.x1(null, 0, currentTimeMillis, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    viVar32.x1(tL_messages_availableReactions.reactions, tL_messages_availableReactions.hash, currentTimeMillis, false);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    vi viVar72 = viVar7;
                                    viVar72.getUserConfig().c0 = tL_messages_stickerSet4.set.short_name;
                                    viVar72.getUserConfig().g0 = System.currentTimeMillis();
                                    viVar72.getUserConfig().v(false);
                                    viVar72.s1(viVar72.getUserConfig().c0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    viVar72.getNotificationCenter().k(at.X2, new Object[0]);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                vi viVar8 = this.b;
                viVar8.getClass();
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    viVar8.w1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    break;
                }
                break;
        }
    }
}

// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class fp6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;

    public /* synthetic */ fp6(ls6 ls6Var, byte b) {
        this.a = b;
        this.b = ls6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 4;
        final byte b3 = 0;
        final ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b4) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(jn7.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(jn7.Z2, new Object[0]);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                if (tL_error == null) {
                    ls6Var.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new ip6(ls6Var, (byte) 12));
                    break;
                } else {
                    hl.c3(new ip6(ls6Var, (byte) 11));
                    break;
                }
            case 2:
                final byte b4 = 1;
                hl.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b4;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b42) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(jn7.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(jn7.Z2, new Object[0]);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                hl.c3(new es6((Object) ls6Var, (Object) tL_error, (Object) tLObject, b3));
                break;
            case 4:
                final byte b5 = 3;
                hl.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b5;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b42) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(jn7.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(jn7.Z2, new Object[0]);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 5:
                final byte b6 = 2;
                hl.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b6;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b42) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(jn7.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(jn7.Z2, new Object[0]);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 6:
                final byte b7 = 5;
                hl.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b7;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b42) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(jn7.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis, null, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis, tL_messages_availableReactions.reactions, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(jn7.Z2, new Object[0]);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 7:
                if (tLObject != null) {
                    hl.c3(new mp6(ls6Var, (TLRPC.TL_messages_stickerSet) tLObject, b2));
                    break;
                }
                break;
            case 8:
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (tLObject instanceof TLRPC.TL_help_premiumPromo) {
                    ls6Var.x1((TLRPC.TL_help_premiumPromo) tLObject, currentTimeMillis, false);
                    break;
                }
                break;
            default:
                hl.c3(new Runnable() { // from class: qq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b42 = b2;
                        ls6 ls6Var2 = ls6Var;
                        TLObject tLObject2 = tLObject;
                        switch (b42) {
                            case 0:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var3 = ls6Var;
                                    ls6Var3.getUserConfig().e0 = tL_messages_stickerSet.set.short_name;
                                    ls6Var3.getUserConfig().i0 = System.currentTimeMillis();
                                    ls6Var3.getUserConfig().u(false);
                                    ls6Var3.t1(ls6Var3.getUserConfig().e0, false, tL_messages_stickerSet, false, (int) (System.currentTimeMillis() / 1000));
                                    for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                                        if (ls6Var3.currentAccount == yac.t0) {
                                            ls6Var3.m1(jn5.b(tL_messages_stickerSet.documents.get(i)), 0);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    ls6Var2.getMessagesStorage().a.c(new ip6(ls6Var2, (byte) 13));
                                    ls6Var2.g0[0].clear();
                                    jn7.f(ls6Var2.currentAccount).k(87, Boolean.FALSE, 0);
                                    break;
                                }
                                break;
                            case 2:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var4 = ls6Var;
                                    ls6Var4.getUserConfig().c0 = tL_messages_stickerSet2.set.short_name;
                                    ls6Var4.getUserConfig().g0 = System.currentTimeMillis();
                                    ls6Var4.getUserConfig().u(false);
                                    ls6Var4.t1(ls6Var4.getUserConfig().c0, false, tL_messages_stickerSet2, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var4.getNotificationCenter().k(jn7.Y2, new Object[0]);
                                    break;
                                }
                                break;
                            case 3:
                                int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
                                if (tLObject2 instanceof TLRPC.TL_messages_availableReactionsNotModified) {
                                    ls6Var2.y1(0, currentTimeMillis2, null, false);
                                    break;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_availableReactions) {
                                    TLRPC.TL_messages_availableReactions tL_messages_availableReactions = (TLRPC.TL_messages_availableReactions) tLObject2;
                                    ls6Var2.y1(tL_messages_availableReactions.hash, currentTimeMillis2, tL_messages_availableReactions.reactions, false);
                                    break;
                                }
                                break;
                            case 4:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var5 = ls6Var;
                                    ls6Var5.getUserConfig().d0 = tL_messages_stickerSet3.set.short_name;
                                    ls6Var5.getUserConfig().h0 = System.currentTimeMillis();
                                    ls6Var5.getUserConfig().u(false);
                                    ls6Var5.t1(ls6Var5.getUserConfig().d0, false, tL_messages_stickerSet3, false, (int) (System.currentTimeMillis() / 1000));
                                    ls6Var5.getNotificationCenter().k(jn7.Z2, new Object[0]);
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) tLObject2;
                                    ls6 ls6Var6 = ls6Var;
                                    ls6Var6.getUserConfig().f0 = tL_messages_stickerSet4.set.short_name;
                                    ls6Var6.getUserConfig().j0 = System.currentTimeMillis();
                                    ls6Var6.getUserConfig().u(false);
                                    ls6Var6.t1(ls6Var6.getUserConfig().f0, false, tL_messages_stickerSet4, false, (int) (System.currentTimeMillis() / 1000));
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

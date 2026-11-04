package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    public /* synthetic */ xf(li liVar, int i3) {
        this.a = i3;
        this.b = liVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor;
        int i3;
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor3;
        int i12;
        long j10;
        int i13;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        int i14;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        SQLiteCursor queryFinalized;
        TLRPC.TL_attachMenuBots tL_attachMenuBots3;
        int i15;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor queryFinalized2;
        switch (this.a) {
            case 0:
                hs.f(this.b.currentAccount).k(hs.W4, new Object[0]);
                return;
            case 1:
                this.b.getNotificationCenter().k(hs.C1, new Object[0]);
                return;
            case 2:
                this.b.getMediaDataController().V0(2, false, false, true);
                return;
            case 3:
                this.b.getNotificationCenter().k(hs.g5, new Object[0]);
                return;
            case 4:
                li liVar = this.b;
                try {
                    long currentTimeMillis = System.currentTimeMillis() - 604800000;
                    liVar.getMessagesStorage().b.executeFast("DELETE FROM stickersets2 WHERE date < " + currentTimeMillis).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 5:
                li liVar2 = this.b;
                liVar2.getNotificationCenter().k(81, new Object[0]);
                liVar2.getNotificationCenter().k(82, new Object[0]);
                liVar2.getNotificationCenter().k(83, new Object[0]);
                liVar2.getNotificationCenter().k(84, new Object[0]);
                return;
            case 6:
                li liVar3 = this.b;
                liVar3.getUserConfig().W = true;
                liVar3.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                liVar3.getUserConfig().v(false);
                return;
            case 7:
                this.b.k1();
                hs.e().k(hs.V4, new Object[0]);
                return;
            case 8:
                li liVar4 = this.b;
                liVar4.getClass();
                try {
                    liVar4.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                this.b.getNotificationCenter().k(hs.l3, new Object[0]);
                return;
            case 10:
                this.b.v1 = false;
                return;
            case 11:
                li liVar5 = this.b;
                liVar5.v1 = false;
                h10 userConfig = liVar5.getUserConfig();
                userConfig.w = true;
                userConfig.v(false);
                return;
            case 12:
                try {
                    this.b.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 13:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                li liVar6 = this.b;
                long e12 = liVar6.getUserConfig().e();
                try {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    int i16 = 0;
                    SQLiteCursor queryFinalized3 = liVar6.getMessagesStorage().b.queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
                    while (queryFinalized3.next()) {
                        long longValue = queryFinalized3.longValue(i16);
                        if (longValue != e12) {
                            long j11 = e12;
                            int intValue = queryFinalized3.intValue(1);
                            TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                            li liVar7 = liVar6;
                            ArrayList arrayList11 = arrayList7;
                            tL_topPeer.rating = queryFinalized3.doubleValue(2);
                            if (longValue > 0) {
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_topPeer.peer = tL_peerUser;
                                tL_peerUser.user_id = longValue;
                                arrayList9.add(Long.valueOf(longValue));
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_topPeer.peer = tL_peerChat;
                                long j12 = -longValue;
                                tL_peerChat.chat_id = j12;
                                arrayList10.add(Long.valueOf(j12));
                            }
                            if (intValue == 0) {
                                arrayList3.add(tL_topPeer);
                            } else if (intValue == 1) {
                                arrayList4.add(tL_topPeer);
                            } else if (intValue == 2) {
                                arrayList6.add(tL_topPeer);
                            } else if (intValue == 3) {
                                arrayList5.add(tL_topPeer);
                            }
                            e12 = j11;
                            arrayList7 = arrayList11;
                            liVar6 = liVar7;
                            i16 = 0;
                        }
                    }
                    li liVar8 = liVar6;
                    ArrayList arrayList12 = arrayList7;
                    queryFinalized3.dispose();
                    if (arrayList9.isEmpty()) {
                        arrayList = arrayList12;
                    } else {
                        arrayList = arrayList12;
                        liVar8.getMessagesStorage().n0(arrayList9, arrayList, false);
                    }
                    if (!arrayList10.isEmpty()) {
                        liVar8.getMessagesStorage().Q(TextUtils.join(",", arrayList10), arrayList8);
                    }
                    g0.h3(new wm(liVar8, arrayList, arrayList8, arrayList3, arrayList4, arrayList5, arrayList6, 2));
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 14:
                li liVar9 = this.b;
                SQLiteCursor sQLiteCursor4 = null;
                int i17 = 0;
                try {
                    try {
                        SQLiteCursor queryFinalized4 = liVar9.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
                        try {
                            try {
                                if (queryFinalized4.next()) {
                                    NativeByteBuffer byteBufferValue = queryFinalized4.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        int readInt32 = byteBufferValue.readInt32(false);
                                        arrayList2 = new ArrayList(readInt32);
                                        for (int i18 = 0; i18 < readInt32; i18++) {
                                            try {
                                                arrayList2.add(TLRPC.TL_availableReaction.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true));
                                            } catch (Exception e14) {
                                                e = e14;
                                                i3 = 0;
                                                sQLiteCursor3 = arrayList2;
                                                sQLiteCursor4 = queryFinalized4;
                                                sQLiteCursor = sQLiteCursor3;
                                                a8.g(e, false);
                                                if (sQLiteCursor4 != null) {
                                                }
                                                i11 = i3;
                                                sQLiteCursor2 = sQLiteCursor;
                                                i10 = 0;
                                                g0.h3(new k2.a0(liVar9, sQLiteCursor2, i11, i10, 2));
                                                return;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                        sQLiteCursor4 = arrayList2;
                                    }
                                    i3 = queryFinalized4.intValue(1);
                                    try {
                                        i12 = queryFinalized4.intValue(2);
                                        i17 = i3;
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLiteCursor3 = sQLiteCursor4;
                                        sQLiteCursor4 = queryFinalized4;
                                        sQLiteCursor = sQLiteCursor3;
                                        a8.g(e, false);
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        i11 = i3;
                                        sQLiteCursor2 = sQLiteCursor;
                                        i10 = 0;
                                        g0.h3(new k2.a0(liVar9, sQLiteCursor2, i11, i10, 2));
                                        return;
                                    }
                                } else {
                                    i12 = 0;
                                }
                                queryFinalized4.dispose();
                                i10 = i12;
                                sQLiteCursor2 = sQLiteCursor4;
                                i11 = i17;
                            } catch (Exception e16) {
                                e = e16;
                                arrayList2 = sQLiteCursor4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor4 = queryFinalized4;
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor = null;
                        i3 = 0;
                    }
                    g0.h3(new k2.a0(liVar9, sQLiteCursor2, i11, i10, 2));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            case 15:
                li liVar10 = this.b;
                SQLiteCursor sQLiteCursor5 = null;
                r3 = null;
                TLRPC.TL_attachMenuBots tL_attachMenuBots4 = null;
                sQLiteCursor5 = null;
                long j13 = 0;
                try {
                    try {
                        queryFinalized = liVar10.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                    } catch (Exception e18) {
                        e = e18;
                        j10 = 0;
                        i13 = 0;
                        tL_attachMenuBots = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    try {
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                TLRPC.AttachMenuBots TLdeserialize = TLRPC.AttachMenuBots.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                tL_attachMenuBots4 = TLdeserialize instanceof TLRPC.TL_attachMenuBots ? (TLRPC.TL_attachMenuBots) TLdeserialize : null;
                                byteBufferValue2.reuse();
                            }
                            j13 = queryFinalized.longValue(1);
                            j10 = j13;
                            tL_attachMenuBots3 = tL_attachMenuBots4;
                            i15 = queryFinalized.intValue(2);
                        } else {
                            j10 = 0;
                            tL_attachMenuBots3 = null;
                            i15 = 0;
                        }
                        if (tL_attachMenuBots3 != null) {
                            try {
                                ArrayList arrayList13 = new ArrayList();
                                for (int i19 = 0; i19 < tL_attachMenuBots3.bots.size(); i19++) {
                                    arrayList13.add(Long.valueOf(tL_attachMenuBots3.bots.get(i19).bot_id));
                                }
                                tL_attachMenuBots3.users.addAll(liVar10.getMessagesStorage().l0(arrayList13));
                            } catch (Exception e19) {
                                e = e19;
                                tL_attachMenuBots = tL_attachMenuBots3;
                                i13 = i15;
                                sQLiteCursor5 = queryFinalized;
                                a8.g(e, false);
                                if (sQLiteCursor5 != null) {
                                    sQLiteCursor5.dispose();
                                }
                                i14 = i13;
                                tL_attachMenuBots2 = tL_attachMenuBots;
                                liVar10.v1(tL_attachMenuBots2, j10, i14, true);
                                return;
                            }
                        }
                        queryFinalized.dispose();
                        i14 = i15;
                        tL_attachMenuBots2 = tL_attachMenuBots3;
                    } catch (Exception e20) {
                        e = e20;
                        j10 = j13;
                        i13 = 0;
                        tL_attachMenuBots = tL_attachMenuBots4;
                    }
                    liVar10.v1(tL_attachMenuBots2, j10, i14, true);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor5 = queryFinalized;
                    if (sQLiteCursor5 != null) {
                        sQLiteCursor5.dispose();
                    }
                    throw th;
                }
            case 16:
                li liVar11 = this.b;
                liVar11.getClass();
                try {
                    liVar11.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 17:
                li liVar12 = this.b;
                SQLiteCursor sQLiteCursor6 = null;
                r4 = null;
                r4 = null;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = null;
                sQLiteCursor6 = null;
                int i20 = 0;
                try {
                    try {
                        queryFinalized2 = liVar12.getMessagesStorage().b.queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
                    } catch (Exception e21) {
                        e = e21;
                        tL_help_premiumPromo = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                try {
                    if (queryFinalized2.next()) {
                        NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(0);
                        if (byteBufferValue3 != null) {
                            tL_help_premiumPromo2 = TLRPC.TL_help_premiumPromo.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), true);
                            byteBufferValue3.reuse();
                        }
                        i20 = queryFinalized2.intValue(1);
                    }
                    queryFinalized2.dispose();
                } catch (Exception e22) {
                    e = e22;
                    tL_help_premiumPromo = tL_help_premiumPromo2;
                    sQLiteCursor6 = queryFinalized2;
                    a8.g(e, false);
                    if (sQLiteCursor6 != null) {
                        sQLiteCursor6.dispose();
                    }
                    tL_help_premiumPromo2 = tL_help_premiumPromo;
                    liVar12.w1(tL_help_premiumPromo2, i20, true);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor6 = queryFinalized2;
                    if (sQLiteCursor6 != null) {
                        sQLiteCursor6.dispose();
                    }
                    throw th;
                }
                liVar12.w1(tL_help_premiumPromo2, i20, true);
                return;
            default:
                this.b.getNotificationCenter().k(hs.C1, new Object[0]);
                return;
        }
    }
}

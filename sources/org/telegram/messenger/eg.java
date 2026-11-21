package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;

    public /* synthetic */ eg(ri riVar, int i7) {
        this.a = i7;
        this.b = riVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0184  */
    /* JADX WARN: Type inference failed for: r2v52, types: [org.telegram.messenger.c1, org.telegram.messenger.ri] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.tgnet.TLRPC$TL_help_premiumPromo] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor;
        int i7;
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor2;
        ?? r82;
        SQLiteCursor sQLiteCursor3;
        int i12;
        long j3;
        int i13;
        TLRPC.TL_attachMenuBots tL_attachMenuBots;
        int i14;
        TLRPC.TL_attachMenuBots tL_attachMenuBots2;
        TLRPC.TL_attachMenuBots tL_attachMenuBots3;
        int i15;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        SQLiteCursor queryFinalized;
        switch (this.a) {
            case 0:
                ks.f(this.b.currentAccount).k(ks.Z4, new Object[0]);
                return;
            case 1:
                this.b.getNotificationCenter().k(ks.C1, new Object[0]);
                return;
            case 2:
                this.b.getMediaDataController().Y0(2, false, false, true);
                return;
            case 3:
                this.b.getNotificationCenter().k(ks.C1, new Object[0]);
                return;
            case 4:
                this.b.getNotificationCenter().k(ks.j5, new Object[0]);
                return;
            case 5:
                ri riVar = this.b;
                try {
                    long currentTimeMillis = System.currentTimeMillis() - 604800000;
                    riVar.getMessagesStorage().b.executeFast("DELETE FROM stickersets2 WHERE date < " + currentTimeMillis).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 6:
                ri riVar2 = this.b;
                riVar2.getNotificationCenter().k(81, new Object[0]);
                riVar2.getNotificationCenter().k(82, new Object[0]);
                riVar2.getNotificationCenter().k(83, new Object[0]);
                riVar2.getNotificationCenter().k(84, new Object[0]);
                return;
            case 7:
                ri riVar3 = this.b;
                riVar3.getUserConfig().W = true;
                riVar3.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                riVar3.getUserConfig().v(false);
                return;
            case 8:
                this.b.n1();
                ks.e().k(ks.Y4, new Object[0]);
                return;
            case 9:
                ri riVar4 = this.b;
                riVar4.getClass();
                try {
                    riVar4.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 10:
                this.b.getNotificationCenter().k(ks.n3, new Object[0]);
                return;
            case 11:
                this.b.x1 = false;
                return;
            case 12:
                ri riVar5 = this.b;
                riVar5.x1 = false;
                j10 userConfig = riVar5.getUserConfig();
                userConfig.w = true;
                userConfig.v(false);
                return;
            case 13:
                try {
                    this.b.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE type = 3").stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 14:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ri riVar6 = this.b;
                long e12 = riVar6.getUserConfig().e();
                try {
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    int i16 = 0;
                    SQLiteCursor queryFinalized2 = riVar6.getMessagesStorage().b.queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
                    while (queryFinalized2.next()) {
                        long longValue = queryFinalized2.longValue(i16);
                        if (longValue != e12) {
                            long j10 = e12;
                            int intValue = queryFinalized2.intValue(1);
                            TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                            ri riVar7 = riVar6;
                            ArrayList arrayList10 = arrayList6;
                            tL_topPeer.rating = queryFinalized2.doubleValue(2);
                            if (longValue > 0) {
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_topPeer.peer = tL_peerUser;
                                tL_peerUser.user_id = longValue;
                                arrayList8.add(Long.valueOf(longValue));
                            } else {
                                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                                tL_topPeer.peer = tL_peerChat;
                                long j11 = -longValue;
                                tL_peerChat.chat_id = j11;
                                arrayList9.add(Long.valueOf(j11));
                            }
                            if (intValue == 0) {
                                arrayList2.add(tL_topPeer);
                            } else if (intValue == 1) {
                                arrayList3.add(tL_topPeer);
                            } else if (intValue == 2) {
                                arrayList5.add(tL_topPeer);
                            } else if (intValue == 3) {
                                arrayList4.add(tL_topPeer);
                            }
                            e12 = j10;
                            arrayList6 = arrayList10;
                            riVar6 = riVar7;
                            i16 = 0;
                        }
                    }
                    ri riVar8 = riVar6;
                    ArrayList arrayList11 = arrayList6;
                    queryFinalized2.dispose();
                    if (arrayList8.isEmpty()) {
                        arrayList = arrayList11;
                    } else {
                        arrayList = arrayList11;
                        riVar8.getMessagesStorage().n0(arrayList8, arrayList, false);
                    }
                    if (!arrayList9.isEmpty()) {
                        riVar8.getMessagesStorage().Q(TextUtils.join(",", arrayList9), arrayList7);
                    }
                    g0.g3(new wm(riVar8, arrayList, arrayList7, arrayList2, arrayList3, arrayList4, arrayList5, 2));
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 15:
                ri riVar9 = this.b;
                SQLiteCursor sQLiteCursor4 = null;
                int i17 = 0;
                try {
                    try {
                        SQLiteCursor queryFinalized3 = riVar9.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
                        try {
                            try {
                                if (queryFinalized3.next()) {
                                    NativeByteBuffer byteBufferValue = queryFinalized3.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        int readInt32 = byteBufferValue.readInt32(false);
                                        r82 = new ArrayList(readInt32);
                                        for (int i18 = 0; i18 < readInt32; i18++) {
                                            try {
                                                r82.add(TLRPC.TL_availableReaction.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true));
                                            } catch (Exception e14) {
                                                e = e14;
                                                i7 = 0;
                                                sQLiteCursor3 = r82;
                                                sQLiteCursor4 = queryFinalized3;
                                                sQLiteCursor = sQLiteCursor3;
                                                a8.g(e, false);
                                                if (sQLiteCursor4 != null) {
                                                }
                                                i11 = i7;
                                                sQLiteCursor2 = sQLiteCursor;
                                                i10 = 0;
                                                g0.g3(new l2.x(riVar9, sQLiteCursor2, i11, i10, 2));
                                                return;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                        sQLiteCursor4 = r82;
                                    }
                                    i7 = queryFinalized3.intValue(1);
                                    try {
                                        i12 = queryFinalized3.intValue(2);
                                        i17 = i7;
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLiteCursor3 = sQLiteCursor4;
                                        sQLiteCursor4 = queryFinalized3;
                                        sQLiteCursor = sQLiteCursor3;
                                        a8.g(e, false);
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        i11 = i7;
                                        sQLiteCursor2 = sQLiteCursor;
                                        i10 = 0;
                                        g0.g3(new l2.x(riVar9, sQLiteCursor2, i11, i10, 2));
                                        return;
                                    }
                                } else {
                                    i12 = 0;
                                }
                                queryFinalized3.dispose();
                                i10 = i12;
                                sQLiteCursor2 = sQLiteCursor4;
                                i11 = i17;
                            } catch (Exception e16) {
                                e = e16;
                                r82 = sQLiteCursor4;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLiteCursor4 = queryFinalized3;
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e17) {
                        e = e17;
                        sQLiteCursor = null;
                        i7 = 0;
                    }
                    g0.g3(new l2.x(riVar9, sQLiteCursor2, i11, i10, 2));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            case 16:
                ri riVar10 = this.b;
                SQLiteCursor sQLiteCursor5 = null;
                r3 = null;
                TLRPC.TL_attachMenuBots tL_attachMenuBots4 = null;
                sQLiteCursor5 = null;
                long j12 = 0;
                try {
                    try {
                        SQLiteCursor queryFinalized4 = riVar10.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                        try {
                            try {
                                if (queryFinalized4.next()) {
                                    NativeByteBuffer byteBufferValue2 = queryFinalized4.byteBufferValue(0);
                                    if (byteBufferValue2 != null) {
                                        TLRPC.AttachMenuBots TLdeserialize = TLRPC.AttachMenuBots.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), true);
                                        tL_attachMenuBots4 = TLdeserialize instanceof TLRPC.TL_attachMenuBots ? (TLRPC.TL_attachMenuBots) TLdeserialize : null;
                                        byteBufferValue2.reuse();
                                    }
                                    j12 = queryFinalized4.longValue(1);
                                    j3 = j12;
                                    tL_attachMenuBots3 = tL_attachMenuBots4;
                                    i15 = queryFinalized4.intValue(2);
                                } else {
                                    j3 = 0;
                                    tL_attachMenuBots3 = null;
                                    i15 = 0;
                                }
                                if (tL_attachMenuBots3 != null) {
                                    try {
                                        ArrayList arrayList12 = new ArrayList();
                                        for (int i19 = 0; i19 < tL_attachMenuBots3.bots.size(); i19++) {
                                            arrayList12.add(Long.valueOf(tL_attachMenuBots3.bots.get(i19).bot_id));
                                        }
                                        tL_attachMenuBots3.users.addAll(riVar10.getMessagesStorage().l0(arrayList12));
                                    } catch (Exception e18) {
                                        e = e18;
                                        tL_attachMenuBots = tL_attachMenuBots3;
                                        i13 = i15;
                                        sQLiteCursor5 = queryFinalized4;
                                        a8.g(e, false);
                                        if (sQLiteCursor5 != null) {
                                            sQLiteCursor5.dispose();
                                        }
                                        i14 = i13;
                                        tL_attachMenuBots2 = tL_attachMenuBots;
                                        riVar10.y1(tL_attachMenuBots2, j3, i14, true);
                                        return;
                                    }
                                }
                                queryFinalized4.dispose();
                                i14 = i15;
                                tL_attachMenuBots2 = tL_attachMenuBots3;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor5 = queryFinalized4;
                                if (sQLiteCursor5 != null) {
                                    sQLiteCursor5.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e19) {
                            e = e19;
                            j3 = j12;
                            i13 = 0;
                            tL_attachMenuBots = tL_attachMenuBots4;
                        }
                    } catch (Exception e20) {
                        e = e20;
                        j3 = 0;
                        i13 = 0;
                        tL_attachMenuBots = null;
                    }
                    riVar10.y1(tL_attachMenuBots2, j3, i14, true);
                    return;
                } catch (Throwable th5) {
                    th = th5;
                }
            case 17:
                ri riVar11 = this.b;
                riVar11.getClass();
                try {
                    riVar11.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                ?? r22 = this.b;
                ?? r42 = 0;
                r4 = null;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = null;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo3 = null;
                SQLiteCursor sQLiteCursor6 = null;
                int i20 = 0;
                try {
                    try {
                        queryFinalized = r22.getMessagesStorage().b.queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e21) {
                    e = e21;
                    tL_help_premiumPromo = null;
                }
                try {
                    if (queryFinalized.next()) {
                        NativeByteBuffer byteBufferValue3 = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue3 != null) {
                            TLRPC.TL_help_premiumPromo TLdeserialize2 = TLRPC.TL_help_premiumPromo.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), true);
                            byteBufferValue3.reuse();
                            tL_help_premiumPromo3 = TLdeserialize2;
                        }
                        i20 = queryFinalized.intValue(1);
                        tL_help_premiumPromo2 = tL_help_premiumPromo3;
                    }
                    queryFinalized.dispose();
                    r42 = tL_help_premiumPromo2;
                } catch (Exception e22) {
                    e = e22;
                    tL_help_premiumPromo = tL_help_premiumPromo3;
                    sQLiteCursor6 = queryFinalized;
                    a8.g(e, false);
                    if (sQLiteCursor6 != null) {
                        sQLiteCursor6.dispose();
                    }
                    r42 = tL_help_premiumPromo;
                    r22.z1(r42, i20, true);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    r42 = queryFinalized;
                    if (r42 != 0) {
                        r42.dispose();
                    }
                    throw th;
                }
                r22.z1(r42, i20, true);
                return;
        }
    }
}

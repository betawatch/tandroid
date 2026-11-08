package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;

    public /* synthetic */ fg(ui uiVar, int i7) {
        this.a = i7;
        this.b = uiVar;
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
        int i7;
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor3;
        int i12;
        long j3;
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
                qs.f(this.b.currentAccount).k(qs.W4, new Object[0]);
                return;
            case 1:
                this.b.getNotificationCenter().k(qs.C1, new Object[0]);
                return;
            case 2:
                this.b.getMediaDataController().V0(2, false, false, true);
                return;
            case 3:
                this.b.getNotificationCenter().k(qs.g5, new Object[0]);
                return;
            case 4:
                ui uiVar = this.b;
                try {
                    long currentTimeMillis = System.currentTimeMillis() - 604800000;
                    uiVar.getMessagesStorage().b.executeFast("DELETE FROM stickersets2 WHERE date < " + currentTimeMillis).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 5:
                ui uiVar2 = this.b;
                uiVar2.getNotificationCenter().k(81, new Object[0]);
                uiVar2.getNotificationCenter().k(82, new Object[0]);
                uiVar2.getNotificationCenter().k(83, new Object[0]);
                uiVar2.getNotificationCenter().k(84, new Object[0]);
                return;
            case 6:
                ui uiVar3 = this.b;
                uiVar3.getUserConfig().V = true;
                uiVar3.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                uiVar3.getUserConfig().v(false);
                return;
            case 7:
                this.b.k1();
                qs.e().k(qs.V4, new Object[0]);
                return;
            case 8:
                ui uiVar4 = this.b;
                uiVar4.getClass();
                try {
                    uiVar4.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = 0").stepThis().dispose();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                this.b.getNotificationCenter().k(qs.l3, new Object[0]);
                return;
            case 10:
                this.b.u1 = false;
                return;
            case 11:
                ui uiVar5 = this.b;
                uiVar5.u1 = false;
                p10 userConfig = uiVar5.getUserConfig();
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
                ui uiVar6 = this.b;
                long e12 = uiVar6.getUserConfig().e();
                try {
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    int i16 = 0;
                    SQLiteCursor queryFinalized3 = uiVar6.getMessagesStorage().b.queryFinalized("SELECT did, type, rating FROM chat_hints WHERE 1 ORDER BY rating DESC", new Object[0]);
                    while (queryFinalized3.next()) {
                        long longValue = queryFinalized3.longValue(i16);
                        if (longValue != e12) {
                            long j10 = e12;
                            int intValue = queryFinalized3.intValue(1);
                            TLRPC.TL_topPeer tL_topPeer = new TLRPC.TL_topPeer();
                            ui uiVar7 = uiVar6;
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
                                long j11 = -longValue;
                                tL_peerChat.chat_id = j11;
                                arrayList10.add(Long.valueOf(j11));
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
                            e12 = j10;
                            arrayList7 = arrayList11;
                            uiVar6 = uiVar7;
                            i16 = 0;
                        }
                    }
                    ui uiVar8 = uiVar6;
                    ArrayList arrayList12 = arrayList7;
                    queryFinalized3.dispose();
                    if (arrayList9.isEmpty()) {
                        arrayList = arrayList12;
                    } else {
                        arrayList = arrayList12;
                        uiVar8.getMessagesStorage().n0(arrayList9, arrayList, false);
                    }
                    if (!arrayList10.isEmpty()) {
                        uiVar8.getMessagesStorage().Q(TextUtils.join(",", arrayList10), arrayList8);
                    }
                    g0.h3(new gn(uiVar8, arrayList, arrayList8, arrayList3, arrayList4, arrayList5, arrayList6, 2));
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 14:
                ui uiVar9 = this.b;
                SQLiteCursor sQLiteCursor4 = null;
                int i17 = 0;
                try {
                    try {
                        SQLiteCursor queryFinalized4 = uiVar9.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM reactions", new Object[0]);
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
                                                i7 = 0;
                                                sQLiteCursor3 = arrayList2;
                                                sQLiteCursor4 = queryFinalized4;
                                                sQLiteCursor = sQLiteCursor3;
                                                a8.g(e, false);
                                                if (sQLiteCursor4 != null) {
                                                }
                                                i11 = i7;
                                                sQLiteCursor2 = sQLiteCursor;
                                                i10 = 0;
                                                g0.h3(new l2.a0(uiVar9, sQLiteCursor2, i11, i10, 2));
                                                return;
                                            }
                                        }
                                        byteBufferValue.reuse();
                                        sQLiteCursor4 = arrayList2;
                                    }
                                    i7 = queryFinalized4.intValue(1);
                                    try {
                                        i12 = queryFinalized4.intValue(2);
                                        i17 = i7;
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLiteCursor3 = sQLiteCursor4;
                                        sQLiteCursor4 = queryFinalized4;
                                        sQLiteCursor = sQLiteCursor3;
                                        a8.g(e, false);
                                        if (sQLiteCursor4 != null) {
                                            sQLiteCursor4.dispose();
                                        }
                                        i11 = i7;
                                        sQLiteCursor2 = sQLiteCursor;
                                        i10 = 0;
                                        g0.h3(new l2.a0(uiVar9, sQLiteCursor2, i11, i10, 2));
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
                        i7 = 0;
                    }
                    g0.h3(new l2.a0(uiVar9, sQLiteCursor2, i11, i10, 2));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
            case 15:
                ui uiVar10 = this.b;
                SQLiteCursor sQLiteCursor5 = null;
                r3 = null;
                TLRPC.TL_attachMenuBots tL_attachMenuBots4 = null;
                sQLiteCursor5 = null;
                long j12 = 0;
                try {
                    try {
                        queryFinalized = uiVar10.getMessagesStorage().b.queryFinalized("SELECT data, hash, date FROM attach_menu_bots", new Object[0]);
                    } catch (Exception e18) {
                        e = e18;
                        j3 = 0;
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
                            j12 = queryFinalized.longValue(1);
                            j3 = j12;
                            tL_attachMenuBots3 = tL_attachMenuBots4;
                            i15 = queryFinalized.intValue(2);
                        } else {
                            j3 = 0;
                            tL_attachMenuBots3 = null;
                            i15 = 0;
                        }
                        if (tL_attachMenuBots3 != null) {
                            try {
                                ArrayList arrayList13 = new ArrayList();
                                for (int i19 = 0; i19 < tL_attachMenuBots3.bots.size(); i19++) {
                                    arrayList13.add(Long.valueOf(tL_attachMenuBots3.bots.get(i19).bot_id));
                                }
                                tL_attachMenuBots3.users.addAll(uiVar10.getMessagesStorage().l0(arrayList13));
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
                                uiVar10.v1(tL_attachMenuBots2, j3, i14, true);
                                return;
                            }
                        }
                        queryFinalized.dispose();
                        i14 = i15;
                        tL_attachMenuBots2 = tL_attachMenuBots3;
                    } catch (Exception e20) {
                        e = e20;
                        j3 = j12;
                        i13 = 0;
                        tL_attachMenuBots = tL_attachMenuBots4;
                    }
                    uiVar10.v1(tL_attachMenuBots2, j3, i14, true);
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
                ui uiVar11 = this.b;
                uiVar11.getClass();
                try {
                    uiVar11.getMessagesStorage().b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 17:
                ui uiVar12 = this.b;
                SQLiteCursor sQLiteCursor6 = null;
                r4 = null;
                r4 = null;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo2 = null;
                sQLiteCursor6 = null;
                int i20 = 0;
                try {
                    try {
                        queryFinalized2 = uiVar12.getMessagesStorage().b.queryFinalized("SELECT data, date FROM premium_promo", new Object[0]);
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
                    uiVar12.w1(tL_help_premiumPromo2, i20, true);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor6 = queryFinalized2;
                    if (sQLiteCursor6 != null) {
                        sQLiteCursor6.dispose();
                    }
                    throw th;
                }
                uiVar12.w1(tL_help_premiumPromo2, i20, true);
                return;
            default:
                this.b.getNotificationCenter().k(qs.C1, new Object[0]);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dg(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0680  */
    /* JADX WARN: Type inference failed for: r0v74, types: [org.telegram.SQLite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v43, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v45, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v22, types: [org.telegram.tgnet.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r6v12, types: [ze.b] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object[]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TL_bots.BotInfo botInfo;
        int i10;
        TLRPC.Dialog dialog;
        int i11;
        SQLiteCursor sQLiteCursor;
        TLObject tLObject;
        NativeByteBuffer byteBufferValue;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i14 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject2;
                    viVar.b0[i14] = tL_messages_archivedStickers.count;
                    wp.r1(viVar.currentAccount).e7.edit().putInt(i0.a.i(i14, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    viVar.getNotificationCenter().k(88, Integer.valueOf(i14));
                    return;
                }
                return;
            case 1:
                wp wpVar = (wp) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i15 = this.b;
                LongSparseIntArray longSparseIntArray = wpVar.G0;
                wpVar.r4(userFull.user.id, userFull.settings);
                long j10 = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull.notify_settings;
                qt qtVar = wpVar.getNotificationsController().g0;
                qtVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new y8(qtVar, j10, 0L, peerNotifySettings, 6));
                }
                TL_bots.BotInfo botInfo2 = userFull.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    wpVar.getMediaDataController().D1(user.id, userFull.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        wpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    wpVar.getNotificationCenter().k(43, new Object[0]);
                }
                wpVar.k1.k(userFull, user.id);
                long j11 = user.id;
                a0.h hVar = wpVar.e8;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) hVar.f(j11);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact o10 = i20.o(userFull);
                    if (!i20.c(requirementToContact, o10)) {
                        if (o10 == null) {
                            hVar.l(j11);
                        } else {
                            hVar.k(o10, j11);
                        }
                        z10 = true;
                        wpVar.t7.M(user.id);
                        rh.e6.y(wpVar.currentAccount, false).Q(userFull);
                        wpVar.q1.remove(Long.valueOf(user.id));
                        wpVar.r1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + i20.n(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull.user);
                        wpVar.V3(arrayList, false);
                        wpVar.getMessagesStorage().m1(arrayList, null, false, true);
                        if (!str.equals(userFull.user.first_name + userFull.user.last_name + i20.n(userFull.user))) {
                            wpVar.getNotificationCenter().k(2, 1);
                        }
                        userProfilePhoto = userFull.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            wpVar.getNotificationCenter().k(2, 2);
                        }
                        botInfo = userFull.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i10 = 0;
                        } else {
                            botInfo.user_id = userFull.id;
                            i10 = 0;
                            wpVar.getNotificationCenter().k(66, userFull.bot_info, Integer.valueOf(i15));
                        }
                        at notificationCenter = wpVar.getNotificationCenter();
                        Object[] objArr = new Object[2];
                        objArr[i10] = Long.valueOf(user.id);
                        objArr[1] = userFull;
                        notificationCenter.k(67, objArr);
                        if (z10) {
                            wpVar.getNotificationCenter().k(at.i3, new Object[i10]);
                        }
                        dialog = (TLRPC.Dialog) wpVar.Q.f(user.id);
                        if (dialog == null) {
                            if ((userFull.flags & 2048) != 0) {
                                int i16 = dialog.folder_id;
                                int i17 = userFull.folder_id;
                                if (i16 != i17) {
                                    dialog.folder_id = i17;
                                    wpVar.Q4(null);
                                    wpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull.flags & TLObject.FLAG_14) != 0) {
                                int i18 = dialog.ttl_period;
                                int i19 = userFull.ttl_period;
                                if (i18 != i19) {
                                    dialog.ttl_period = i19;
                                    wpVar.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = false;
                wpVar.t7.M(user.id);
                rh.e6.y(wpVar.currentAccount, false).Q(userFull);
                wpVar.q1.remove(Long.valueOf(user.id));
                wpVar.r1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + i20.n(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull.user);
                wpVar.V3(arrayList2, false);
                wpVar.getMessagesStorage().m1(arrayList2, null, false, true);
                if (!str.equals(userFull.user.first_name + userFull.user.last_name + i20.n(userFull.user))) {
                }
                userProfilePhoto = userFull.user.photo;
                if (userProfilePhoto != null) {
                    wpVar.getNotificationCenter().k(2, 2);
                }
                botInfo = userFull.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                at notificationCenter2 = wpVar.getNotificationCenter();
                Object[] objArr2 = new Object[2];
                objArr2[i10] = Long.valueOf(user.id);
                objArr2[1] = userFull;
                notificationCenter2.k(67, objArr2);
                if (z10) {
                }
                dialog = (TLRPC.Dialog) wpVar.Q.f(user.id);
                if (dialog == null) {
                }
            case 2:
                i0.g3(new ng((y1) this.c, (x1) this.e, is.a0(this.b).l0((ArrayList) this.d), 10));
                return;
            case 3:
                i5 i5Var = (i5) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                int i20 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                i5Var.getMessagesController().V3(arrayList3, i20 == 1);
                a0.h hVar2 = new a0.h();
                boolean isEmpty = arrayList4.isEmpty();
                if (i20 == 2 && !i5Var.e0.isEmpty()) {
                    int i21 = 0;
                    while (i21 < arrayList4.size()) {
                        if (i5Var.f0.get(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i21)).user_id)) != null) {
                            arrayList4.remove(i21);
                            i21--;
                        }
                        i21++;
                    }
                    arrayList4.addAll(i5Var.e0);
                }
                for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                    TLRPC.User Z1 = i5Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i22)).user_id));
                    if (Z1 != null) {
                        hVar2.k(Z1, Z1.id);
                    }
                }
                Utilities.d.c(new b5(i5Var, i20, arrayList4, arrayList3, hVar2, isEmpty));
                return;
            case 4:
                i5 i5Var2 = (i5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i23 = this.b;
                int[] iArr = i5Var2.I;
                if (tL_error2 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    i5Var2.getMessagesController().V3(privacyrules.users, false);
                    i5Var2.getMessagesController().P3(privacyrules.chats, false);
                    switch (i23) {
                        case 0:
                            i5Var2.J = privacyrules.rules;
                            break;
                        case 1:
                            i5Var2.K = privacyrules.rules;
                            break;
                        case 2:
                            i5Var2.L = privacyrules.rules;
                            break;
                        case 3:
                            i5Var2.M = privacyrules.rules;
                            break;
                        case 4:
                            i5Var2.N = privacyrules.rules;
                            break;
                        case 5:
                            i5Var2.Q = privacyrules.rules;
                            break;
                        case 6:
                            i5Var2.R = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            i5Var2.S = privacyrules.rules;
                            break;
                        case 8:
                            i5Var2.T = privacyrules.rules;
                            break;
                        case 9:
                            i5Var2.O = privacyrules.rules;
                            break;
                        case 11:
                            i5Var2.U = privacyrules.rules;
                            break;
                        case 12:
                            i5Var2.V = privacyrules.rules;
                            break;
                        case 13:
                            i5Var2.W = privacyrules.rules;
                            break;
                        case 14:
                            i5Var2.P = privacyrules.rules;
                            break;
                    }
                    iArr[i23] = 2;
                    i11 = 0;
                } else {
                    i11 = 0;
                    iArr[i23] = 0;
                }
                i5Var2.getNotificationCenter().k(47, new Object[i11]);
                return;
            case 5:
                ic icVar = (ic) this.c;
                String str2 = (String) this.d;
                int i24 = this.b;
                File file = (File) this.e;
                ConcurrentHashMap concurrentHashMap = icVar.i;
                HashMap hashMap = icVar.g;
                HashMap hashMap2 = icVar.l;
                gc gcVar = (gc) hashMap2.get(str2);
                if (gcVar != null && gcVar.a != null) {
                    icVar.v(i24, file, gcVar);
                    hashMap2.remove(str2);
                }
                wb wbVar = (wb) hashMap.get(str2);
                if (wbVar == null) {
                    return;
                }
                ArrayList arrayList5 = wbVar.v;
                hashMap.remove(str2);
                icVar.h.remove(str2);
                ArrayList arrayList6 = new ArrayList();
                for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                    String str3 = (String) wbVar.x.get(i25);
                    String str4 = (String) wbVar.y.get(i25);
                    int intValue = ((Integer) wbVar.z.get(i25)).intValue();
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList5.get(i25);
                    int intValue2 = ((Integer) wbVar.w.get(i25)).intValue();
                    wb wbVar2 = (wb) concurrentHashMap.get(str3);
                    if (wbVar2 == null) {
                        wbVar2 = new wb(icVar);
                        wbVar2.a = wbVar.a;
                        wbVar2.h = wbVar.h;
                        wbVar2.o = wbVar.o;
                        wbVar2.p = file;
                        wbVar2.j = wbVar.j;
                        wbVar2.c = wbVar.c;
                        wbVar2.d = str3;
                        wbVar2.n = wbVar.n;
                        wbVar2.i = wbVar.i;
                        wbVar2.m = intValue;
                        wbVar2.g = wbVar.g;
                        wbVar2.r = wbVar.r;
                        wbVar2.u = new xb(icVar, wbVar2);
                        wbVar2.f = str4;
                        wbVar2.l = wbVar.l;
                        concurrentHashMap.put(str3, wbVar2);
                        icVar.j.add(ic.n(str3));
                        arrayList6.add(wbVar2.u);
                    }
                    wbVar2.a(imageReceiver, str3, str4, intValue, intValue2);
                }
                for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                    xb xbVar = (xb) arrayList6.get(i26);
                    wb wbVar3 = xbVar.c;
                    if (wbVar3.m == 1) {
                        icVar.q.c(xbVar);
                    } else {
                        com.google.android.gms.internal.cast.c0 c0Var = icVar.p;
                        int i27 = wbVar3.a;
                        if (i27 != 1) {
                            c0Var.getClass();
                            xbVar = new ze.b(i27, xbVar);
                        }
                        ((ze.a) c0Var.b).execute(xbVar);
                    }
                }
                return;
            case 6:
                ((dd) this.c).f((ad) this.d, null, true, this.b, (Runnable) this.e);
                return;
            case 7:
                vi viVar2 = (vi) this.c;
                r20 r20Var = (r20) this.d;
                TL_bots.BotInfo botInfo3 = (TL_bots.BotInfo) this.e;
                int i28 = this.b;
                if (r20Var != null) {
                    r20Var.a(botInfo3);
                }
                viVar2.getNotificationCenter().k(66, botInfo3, Integer.valueOf(i28));
                return;
            case 8:
                vi viVar3 = (vi) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str5 = (String) this.e;
                int i29 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = viVar3.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str5);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, i29);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = viVar3.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i29);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 9:
                ((wp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.e, (TLRPC.TL_error) this.d);
                return;
            case 10:
                ((wp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 11:
                ((wp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 12:
                wp wpVar2 = (wp) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                int i30 = this.b;
                yo yoVar = (yo) this.d;
                if (!(tLObject4 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    yoVar.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject4;
                wpVar2.P3(tL_chatlists_chatlistUpdates.chats, false);
                wpVar2.V3(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = wpVar2.c0;
                yo yoVar2 = new yo();
                yoVar2.a = false;
                yoVar2.b = System.currentTimeMillis();
                yoVar2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i30, yoVar2);
                wpVar2.getNotificationCenter().k(at.z5, Integer.valueOf(i30));
                return;
            case 13:
                ((wp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.e, (TLRPC.TL_error) this.d);
                return;
            case 14:
                wp wpVar3 = (wp) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                int i31 = this.b;
                wpVar3.T1 = false;
                if (hVar3 == null && hVar4 == null) {
                    wpVar3.U1 = 0;
                    wpVar3.V1 = null;
                    wpVar3.W1 = null;
                    return;
                }
                wpVar3.U1 = i31;
                wpVar3.V1 = hVar3;
                wpVar3.W1 = hVar4;
                if (wpVar3.X1 != null) {
                    Utilities.d.a(wpVar3.X1);
                    wpVar3.X1 = null;
                }
                if (wpVar3.I(false)) {
                    return;
                }
                wpVar3.X1 = new ak(wpVar3, 26);
                Utilities.d.d(wpVar3.X1, Math.abs(wpVar3.getConnectionsManager().getCurrentTime() - wpVar3.U1) * 1000);
                return;
            case 15:
                is isVar = (is) this.c;
                int i32 = this.b;
                ?? r32 = (String) this.d;
                ?? r52 = (RequestDelegate) this.e;
                isVar.getClass();
                ?? r62 = "DELETE FROM botcache WHERE date < ";
                try {
                    try {
                        isVar.b.executeFast("DELETE FROM botcache WHERE date < " + i32).stepThis().dispose();
                        r32 = isVar.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", new Object[]{r32});
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        try {
                            if (r32.next()) {
                                try {
                                    byteBufferValue = r32.byteBufferValue(0);
                                } catch (Exception e7) {
                                    e = e7;
                                    tLObject = null;
                                }
                                if (byteBufferValue != null) {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    tLObject = readInt32 == 911761060 ? TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(byteBufferValue, readInt32, false) : TLRPC.messages_BotResults.TLdeserialize(byteBufferValue, readInt32, false);
                                    try {
                                        byteBufferValue.reuse();
                                    } catch (Exception e10) {
                                        e = e10;
                                        try {
                                            isVar.o(e, true);
                                            r32.dispose();
                                            r52.run(tLObject, null);
                                            return;
                                        } catch (Exception e11) {
                                            e = e11;
                                            sQLiteCursor = r32;
                                            isVar.o(e, true);
                                            r52.run(tLObject, null);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    r32.dispose();
                                    r52.run(tLObject, null);
                                    return;
                                }
                            }
                            tLObject = null;
                            r32.dispose();
                            r52.run(tLObject, null);
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            tLObject = null;
                            sQLiteCursor = r32;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r62 = 0;
                        r52.run(r62, null);
                        if (r32 != 0) {
                            r32.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    sQLiteCursor = null;
                    tLObject = null;
                } catch (Throwable th4) {
                    th = th4;
                    r32 = 0;
                    r62 = 0;
                }
            case 16:
                Context context = (Context) this.c;
                int i33 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                k20 k20Var = (k20) this.e;
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
                x1Var.r(500L);
                x1Var.setOnCancelListener(new tt(i33, ConnectionsManager.getInstance(i33).sendRequestTyped(registerpasskey, new a3.b(i12), new a4(5, x1Var, k20Var)), k20Var, i13));
                return;
            default:
                pw pwVar = (pw) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) this.e;
                int i34 = this.b;
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                    TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                    if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                        messages_sentencryptedmessage.date = 0;
                    }
                }
                pwVar.getMessagesStorage().a2(message.random_id, 0L, Integer.valueOf(message.id), message.id, messages_sentencryptedmessage.date, 0, 0);
                i0.g3(new o7(pwVar, message, i34, 21));
                return;
        }
    }

    public /* synthetic */ dg(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ dg(f1 f1Var, Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = f1Var;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
    }

    public /* synthetic */ dg(wp wpVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11) {
        this.a = i11;
        this.c = wpVar;
        this.b = i10;
        this.e = tLObject;
        this.d = tL_error;
    }

    public /* synthetic */ dg(wp wpVar, TLObject tLObject, int i10, yo yoVar) {
        this.a = 12;
        this.c = wpVar;
        this.e = tLObject;
        this.b = i10;
        this.d = yoVar;
    }
}

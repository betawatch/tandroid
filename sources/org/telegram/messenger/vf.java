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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vf(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
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
    /* JADX WARN: Type inference failed for: r6v12, types: [lf.b] */
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
        int i3;
        TLRPC.Dialog dialog;
        int i10;
        SQLiteCursor sQLiteCursor;
        TLObject tLObject;
        NativeByteBuffer byteBufferValue;
        int i11 = 1;
        switch (this.a) {
            case 0:
                li liVar = (li) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i12 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject2;
                    liVar.c0[i12] = tL_messages_archivedStickers.count;
                    hp.s1(liVar.currentAccount).d7.edit().putInt(k2.p1.i(i12, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    liVar.getNotificationCenter().k(88, Integer.valueOf(i12));
                    return;
                }
                return;
            case 1:
                hp hpVar = (hp) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i13 = this.b;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                hpVar.u4(userFull.user.id, userFull.settings);
                long j10 = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull.notify_settings;
                ws wsVar = hpVar.getNotificationsController().h0;
                wsVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new t8(wsVar, j10, 0L, peerNotifySettings, 6));
                }
                TL_bots.BotInfo botInfo2 = userFull.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    hpVar.getMediaDataController().D1(user.id, userFull.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        hpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    hpVar.getNotificationCenter().k(43, new Object[0]);
                }
                hpVar.l1.k(userFull, user.id);
                long j11 = user.id;
                a0.h hVar = hpVar.d8;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) hVar.f(j11);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact o10 = l10.o(userFull);
                    if (!l10.c(requirementToContact, o10)) {
                        if (o10 == null) {
                            hVar.l(j11);
                        } else {
                            hVar.k(o10, j11);
                        }
                        z10 = true;
                        hpVar.s7.M(user.id);
                        ci.e9.y(hpVar.currentAccount, false).Q(userFull);
                        hpVar.r1.remove(Long.valueOf(user.id));
                        hpVar.s1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + l10.n(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull.user);
                        hpVar.Y3(arrayList, false);
                        hpVar.getMessagesStorage().m1(arrayList, null, false, true);
                        if (!str.equals(userFull.user.first_name + userFull.user.last_name + l10.n(userFull.user))) {
                            hpVar.getNotificationCenter().k(2, 1);
                        }
                        userProfilePhoto = userFull.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            hpVar.getNotificationCenter().k(2, 2);
                        }
                        botInfo = userFull.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i3 = 0;
                        } else {
                            botInfo.user_id = userFull.id;
                            i3 = 0;
                            hpVar.getNotificationCenter().k(66, userFull.bot_info, Integer.valueOf(i13));
                        }
                        hs notificationCenter = hpVar.getNotificationCenter();
                        Object[] objArr = new Object[2];
                        objArr[i3] = Long.valueOf(user.id);
                        objArr[1] = userFull;
                        notificationCenter.k(67, objArr);
                        if (z10) {
                            hpVar.getNotificationCenter().k(hs.i3, new Object[i3]);
                        }
                        dialog = (TLRPC.Dialog) hpVar.R.f(user.id);
                        if (dialog == null) {
                            if ((userFull.flags & 2048) != 0) {
                                int i14 = dialog.folder_id;
                                int i15 = userFull.folder_id;
                                if (i14 != i15) {
                                    dialog.folder_id = i15;
                                    hpVar.T4(null);
                                    hpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull.flags & TLObject.FLAG_14) != 0) {
                                int i16 = dialog.ttl_period;
                                int i17 = userFull.ttl_period;
                                if (i16 != i17) {
                                    dialog.ttl_period = i17;
                                    hpVar.getNotificationCenter().k(3, new Object[0]);
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
                hpVar.s7.M(user.id);
                ci.e9.y(hpVar.currentAccount, false).Q(userFull);
                hpVar.r1.remove(Long.valueOf(user.id));
                hpVar.s1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + l10.n(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull.user);
                hpVar.Y3(arrayList2, false);
                hpVar.getMessagesStorage().m1(arrayList2, null, false, true);
                if (!str.equals(userFull.user.first_name + userFull.user.last_name + l10.n(userFull.user))) {
                }
                userProfilePhoto = userFull.user.photo;
                if (userProfilePhoto != null) {
                    hpVar.getNotificationCenter().k(2, 2);
                }
                botInfo = userFull.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                hs notificationCenter2 = hpVar.getNotificationCenter();
                Object[] objArr2 = new Object[2];
                objArr2[i3] = Long.valueOf(user.id);
                objArr2[1] = userFull;
                notificationCenter2.k(67, objArr2);
                if (z10) {
                }
                dialog = (TLRPC.Dialog) hpVar.R.f(user.id);
                if (dialog == null) {
                }
            case 2:
                g0.h3(new fg((v1) this.c, (u1) this.e, qr.a0(this.b).l0((ArrayList) this.d), 10));
                return;
            case 3:
                g5 g5Var = (g5) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                int i18 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                g5Var.getMessagesController().Y3(arrayList3, i18 == 1);
                a0.h hVar2 = new a0.h();
                boolean isEmpty = arrayList4.isEmpty();
                if (i18 == 2 && !g5Var.f0.isEmpty()) {
                    int i19 = 0;
                    while (i19 < arrayList4.size()) {
                        if (g5Var.g0.get(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i19)).user_id)) != null) {
                            arrayList4.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                    arrayList4.addAll(g5Var.f0);
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i20)).user_id));
                    if (a22 != null) {
                        hVar2.k(a22, a22.id);
                    }
                }
                Utilities.d.c(new z4(g5Var, i18, arrayList4, arrayList3, hVar2, isEmpty));
                return;
            case 4:
                g5 g5Var2 = (g5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i21 = this.b;
                int[] iArr = g5Var2.J;
                if (tL_error2 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    g5Var2.getMessagesController().Y3(privacyrules.users, false);
                    g5Var2.getMessagesController().S3(privacyrules.chats, false);
                    switch (i21) {
                        case 0:
                            g5Var2.K = privacyrules.rules;
                            break;
                        case 1:
                            g5Var2.L = privacyrules.rules;
                            break;
                        case 2:
                            g5Var2.M = privacyrules.rules;
                            break;
                        case 3:
                            g5Var2.N = privacyrules.rules;
                            break;
                        case 4:
                            g5Var2.O = privacyrules.rules;
                            break;
                        case 5:
                            g5Var2.R = privacyrules.rules;
                            break;
                        case 6:
                            g5Var2.S = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            g5Var2.T = privacyrules.rules;
                            break;
                        case 8:
                            g5Var2.U = privacyrules.rules;
                            break;
                        case 9:
                            g5Var2.P = privacyrules.rules;
                            break;
                        case 11:
                            g5Var2.V = privacyrules.rules;
                            break;
                        case 12:
                            g5Var2.W = privacyrules.rules;
                            break;
                        case 13:
                            g5Var2.X = privacyrules.rules;
                            break;
                        case 14:
                            g5Var2.Q = privacyrules.rules;
                            break;
                    }
                    iArr[i21] = 2;
                    i10 = 0;
                } else {
                    i10 = 0;
                    iArr[i21] = 0;
                }
                g5Var2.getNotificationCenter().k(47, new Object[i10]);
                return;
            case 5:
                zb zbVar = (zb) this.c;
                String str2 = (String) this.d;
                int i22 = this.b;
                File file = (File) this.e;
                ConcurrentHashMap concurrentHashMap = zbVar.i;
                HashMap hashMap = zbVar.g;
                HashMap hashMap2 = zbVar.l;
                xb xbVar = (xb) hashMap2.get(str2);
                if (xbVar != null && xbVar.a != null) {
                    zbVar.v(i22, file, xbVar);
                    hashMap2.remove(str2);
                }
                nb nbVar = (nb) hashMap.get(str2);
                if (nbVar == null) {
                    return;
                }
                ArrayList arrayList5 = nbVar.v;
                hashMap.remove(str2);
                zbVar.h.remove(str2);
                ArrayList arrayList6 = new ArrayList();
                for (int i23 = 0; i23 < arrayList5.size(); i23++) {
                    String str3 = (String) nbVar.x.get(i23);
                    String str4 = (String) nbVar.y.get(i23);
                    int intValue = ((Integer) nbVar.z.get(i23)).intValue();
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList5.get(i23);
                    int intValue2 = ((Integer) nbVar.w.get(i23)).intValue();
                    nb nbVar2 = (nb) concurrentHashMap.get(str3);
                    if (nbVar2 == null) {
                        nbVar2 = new nb(zbVar);
                        nbVar2.a = nbVar.a;
                        nbVar2.h = nbVar.h;
                        nbVar2.o = nbVar.o;
                        nbVar2.p = file;
                        nbVar2.j = nbVar.j;
                        nbVar2.c = nbVar.c;
                        nbVar2.d = str3;
                        nbVar2.n = nbVar.n;
                        nbVar2.i = nbVar.i;
                        nbVar2.m = intValue;
                        nbVar2.g = nbVar.g;
                        nbVar2.r = nbVar.r;
                        nbVar2.u = new ob(zbVar, nbVar2);
                        nbVar2.f = str4;
                        nbVar2.l = nbVar.l;
                        concurrentHashMap.put(str3, nbVar2);
                        zbVar.j.add(zb.n(str3));
                        arrayList6.add(nbVar2.u);
                    }
                    nbVar2.a(imageReceiver, str3, str4, intValue, intValue2);
                }
                for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                    ob obVar = (ob) arrayList6.get(i24);
                    nb nbVar3 = obVar.c;
                    if (nbVar3.m == 1) {
                        zbVar.q.c(obVar);
                    } else {
                        com.google.android.gms.internal.cast.c0 c0Var = zbVar.p;
                        int i25 = nbVar3.a;
                        if (i25 != 1) {
                            c0Var.getClass();
                            obVar = new lf.b(i25, obVar);
                        }
                        ((lf.a) c0Var.b).execute(obVar);
                    }
                }
                return;
            case 6:
                ((bd) this.c).f((yc) this.d, null, true, this.b, (Runnable) this.e);
                return;
            case 7:
                li liVar2 = (li) this.c;
                u10 u10Var = (u10) this.d;
                TL_bots.BotInfo botInfo3 = (TL_bots.BotInfo) this.e;
                int i26 = this.b;
                if (u10Var != null) {
                    u10Var.a(botInfo3);
                }
                liVar2.getNotificationCenter().k(66, botInfo3, Integer.valueOf(i26));
                return;
            case 8:
                li liVar3 = (li) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str5 = (String) this.e;
                int i27 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = liVar3.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str5);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, i27);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = liVar3.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i27);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 9:
                ((hp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.e, (TLRPC.TL_error) this.d);
                return;
            case 10:
                hp hpVar2 = (hp) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                int i28 = this.b;
                jo joVar = (jo) this.d;
                if (!(tLObject4 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    joVar.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject4;
                hpVar2.S3(tL_chatlists_chatlistUpdates.chats, false);
                hpVar2.Y3(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = hpVar2.d0;
                jo joVar2 = new jo();
                joVar2.a = false;
                joVar2.b = System.currentTimeMillis();
                joVar2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i28, joVar2);
                hpVar2.getNotificationCenter().k(hs.z5, Integer.valueOf(i28));
                return;
            case 11:
                ((hp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ((hp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.e, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ((hp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 14:
                hp hpVar3 = (hp) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                int i29 = this.b;
                hpVar3.U1 = false;
                if (hVar3 == null && hVar4 == null) {
                    hpVar3.V1 = 0;
                    hpVar3.W1 = null;
                    hpVar3.X1 = null;
                    return;
                }
                hpVar3.V1 = i29;
                hpVar3.W1 = hVar3;
                hpVar3.X1 = hVar4;
                if (hpVar3.Y1 != null) {
                    Utilities.d.a(hpVar3.Y1);
                    hpVar3.Y1 = null;
                }
                if (hpVar3.I(false)) {
                    return;
                }
                hpVar3.Y1 = new mj(hpVar3, 29);
                Utilities.d.e(hpVar3.Y1, Math.abs(hpVar3.getConnectionsManager().getCurrentTime() - hpVar3.V1) * 1000);
                return;
            case 15:
                qr qrVar = (qr) this.c;
                int i30 = this.b;
                ?? r32 = (String) this.d;
                ?? r5 = (RequestDelegate) this.e;
                qrVar.getClass();
                ?? r62 = "DELETE FROM botcache WHERE date < ";
                try {
                    try {
                        qrVar.b.executeFast("DELETE FROM botcache WHERE date < " + i30).stepThis().dispose();
                        r32 = qrVar.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", new Object[]{r32});
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        try {
                            if (r32.next()) {
                                try {
                                    byteBufferValue = r32.byteBufferValue(0);
                                } catch (Exception e11) {
                                    e = e11;
                                    tLObject = null;
                                }
                                if (byteBufferValue != null) {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    tLObject = readInt32 == 911761060 ? TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(byteBufferValue, readInt32, false) : TLRPC.messages_BotResults.TLdeserialize(byteBufferValue, readInt32, false);
                                    try {
                                        byteBufferValue.reuse();
                                    } catch (Exception e12) {
                                        e = e12;
                                        try {
                                            qrVar.o(e, true);
                                            r32.dispose();
                                            r5.run(tLObject, null);
                                            return;
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLiteCursor = r32;
                                            qrVar.o(e, true);
                                            r5.run(tLObject, null);
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    r32.dispose();
                                    r5.run(tLObject, null);
                                    return;
                                }
                            }
                            tLObject = null;
                            r32.dispose();
                            r5.run(tLObject, null);
                            return;
                        } catch (Exception e14) {
                            e = e14;
                            tLObject = null;
                            sQLiteCursor = r32;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r62 = 0;
                        r5.run(r62, null);
                        if (r32 != 0) {
                            r32.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor = null;
                    tLObject = null;
                } catch (Throwable th4) {
                    th = th4;
                    r32 = 0;
                    r62 = 0;
                }
            case 16:
                Context context = (Context) this.c;
                int i31 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                n10 n10Var = (n10) this.e;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
                s1Var.r(500L);
                s1Var.setOnCancelListener(new ji.c0(i31, ConnectionsManager.getInstance(i31).sendRequestTyped(registerpasskey, new c3.b(i11), new x3(5, s1Var, n10Var)), n10Var, i11));
                return;
            default:
                vv vvVar = (vv) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) this.e;
                int i32 = this.b;
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                    TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                    if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                        messages_sentencryptedmessage.date = 0;
                    }
                }
                vvVar.getMessagesStorage().a2(message.random_id, 0L, Integer.valueOf(message.id), message.id, messages_sentencryptedmessage.date, 0, 0);
                g0.h3(new k7(vvVar, message, i32, 21));
                return;
        }
    }

    public /* synthetic */ vf(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
        this.e = obj3;
    }

    public /* synthetic */ vf(c1 c1Var, Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = c1Var;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
    }

    public /* synthetic */ vf(hp hpVar, int i3, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.c = hpVar;
        this.b = i3;
        this.e = tLObject;
        this.d = tL_error;
    }

    public /* synthetic */ vf(hp hpVar, TLObject tLObject, int i3, jo joVar) {
        this.a = 10;
        this.c = hpVar;
        this.e = tLObject;
        this.b = i3;
        this.d = joVar;
    }
}

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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x067e  */
    /* JADX WARN: Type inference failed for: r0v74, types: [org.telegram.SQLite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r3v44, types: [org.telegram.SQLite.SQLiteCursor] */
    /* JADX WARN: Type inference failed for: r5v22, types: [org.telegram.tgnet.RequestDelegate] */
    /* JADX WARN: Type inference failed for: r6v12, types: [of.b] */
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
        boolean z9;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TL_bots.BotInfo botInfo;
        int i7;
        TLRPC.Dialog dialog;
        int i10;
        SQLiteCursor sQLiteCursor;
        TLObject tLObject;
        NativeByteBuffer byteBufferValue;
        int i11 = 1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i13 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject2;
                    uiVar.b0[i13] = tL_messages_archivedStickers.count;
                    qp.s1(uiVar.currentAccount).d7.edit().putInt(jg.g.j(i13, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    uiVar.getNotificationCenter().k(88, Integer.valueOf(i13));
                    return;
                }
                return;
            case 1:
                qp qpVar = (qp) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i14 = this.b;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                qpVar.u4(userFull.user.id, userFull.settings);
                long j3 = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull.notify_settings;
                et etVar = qpVar.getNotificationsController().g0;
                etVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new t8(etVar, j3, 0L, peerNotifySettings, 6));
                }
                TL_bots.BotInfo botInfo2 = userFull.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    qpVar.getMediaDataController().D1(user.id, userFull.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        qpVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    qpVar.getNotificationCenter().k(43, new Object[0]);
                }
                qpVar.k1.k(userFull, user.id);
                long j10 = user.id;
                a0.h hVar = qpVar.d8;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) hVar.f(j10);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact o4 = t10.o(userFull);
                    if (!t10.c(requirementToContact, o4)) {
                        if (o4 == null) {
                            hVar.l(j10);
                        } else {
                            hVar.k(o4, j10);
                        }
                        z9 = true;
                        qpVar.s7.M(user.id);
                        bi.ea.y(qpVar.currentAccount, false).Q(userFull);
                        qpVar.q1.remove(Long.valueOf(user.id));
                        qpVar.r1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + t10.n(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull.user);
                        qpVar.Y3(arrayList, false);
                        qpVar.getMessagesStorage().m1(arrayList, null, false, true);
                        if (!str.equals(userFull.user.first_name + userFull.user.last_name + t10.n(userFull.user))) {
                            qpVar.getNotificationCenter().k(2, 1);
                        }
                        userProfilePhoto = userFull.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            qpVar.getNotificationCenter().k(2, 2);
                        }
                        botInfo = userFull.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i7 = 0;
                        } else {
                            botInfo.user_id = userFull.id;
                            i7 = 0;
                            qpVar.getNotificationCenter().k(66, userFull.bot_info, Integer.valueOf(i14));
                        }
                        qs notificationCenter = qpVar.getNotificationCenter();
                        Object[] objArr = new Object[2];
                        objArr[i7] = Long.valueOf(user.id);
                        objArr[1] = userFull;
                        notificationCenter.k(67, objArr);
                        if (z9) {
                            qpVar.getNotificationCenter().k(qs.i3, new Object[i7]);
                        }
                        dialog = (TLRPC.Dialog) qpVar.Q.f(user.id);
                        if (dialog == null) {
                            if ((userFull.flags & 2048) != 0) {
                                int i15 = dialog.folder_id;
                                int i16 = userFull.folder_id;
                                if (i15 != i16) {
                                    dialog.folder_id = i16;
                                    qpVar.T4(null);
                                    qpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull.flags & TLObject.FLAG_14) != 0) {
                                int i17 = dialog.ttl_period;
                                int i18 = userFull.ttl_period;
                                if (i17 != i18) {
                                    dialog.ttl_period = i18;
                                    qpVar.getNotificationCenter().k(3, new Object[0]);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z9 = false;
                qpVar.s7.M(user.id);
                bi.ea.y(qpVar.currentAccount, false).Q(userFull);
                qpVar.q1.remove(Long.valueOf(user.id));
                qpVar.r1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + t10.n(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull.user);
                qpVar.Y3(arrayList2, false);
                qpVar.getMessagesStorage().m1(arrayList2, null, false, true);
                if (!str.equals(userFull.user.first_name + userFull.user.last_name + t10.n(userFull.user))) {
                }
                userProfilePhoto = userFull.user.photo;
                if (userProfilePhoto != null) {
                    qpVar.getNotificationCenter().k(2, 2);
                }
                botInfo = userFull.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                qs notificationCenter2 = qpVar.getNotificationCenter();
                Object[] objArr2 = new Object[2];
                objArr2[i7] = Long.valueOf(user.id);
                objArr2[1] = userFull;
                notificationCenter2.k(67, objArr2);
                if (z9) {
                }
                dialog = (TLRPC.Dialog) qpVar.Q.f(user.id);
                if (dialog == null) {
                }
            case 2:
                g0.h3(new ng((v1) this.c, (u1) this.e, yr.a0(this.b).l0((ArrayList) this.d), 10));
                return;
            case 3:
                g5 g5Var = (g5) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                int i19 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                g5Var.getMessagesController().Y3(arrayList3, i19 == 1);
                a0.h hVar2 = new a0.h();
                boolean isEmpty = arrayList4.isEmpty();
                if (i19 == 2 && !g5Var.e0.isEmpty()) {
                    int i20 = 0;
                    while (i20 < arrayList4.size()) {
                        if (g5Var.f0.get(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i20)).user_id)) != null) {
                            arrayList4.remove(i20);
                            i20--;
                        }
                        i20++;
                    }
                    arrayList4.addAll(g5Var.e0);
                }
                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                    TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i21)).user_id));
                    if (a22 != null) {
                        hVar2.k(a22, a22.id);
                    }
                }
                Utilities.d.c(new y4(g5Var, i19, arrayList4, arrayList3, hVar2, isEmpty));
                return;
            case 4:
                g5 g5Var2 = (g5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i22 = this.b;
                int[] iArr = g5Var2.I;
                if (tL_error2 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    g5Var2.getMessagesController().Y3(privacyrules.users, false);
                    g5Var2.getMessagesController().S3(privacyrules.chats, false);
                    switch (i22) {
                        case 0:
                            g5Var2.J = privacyrules.rules;
                            break;
                        case 1:
                            g5Var2.K = privacyrules.rules;
                            break;
                        case 2:
                            g5Var2.L = privacyrules.rules;
                            break;
                        case 3:
                            g5Var2.M = privacyrules.rules;
                            break;
                        case 4:
                            g5Var2.N = privacyrules.rules;
                            break;
                        case 5:
                            g5Var2.Q = privacyrules.rules;
                            break;
                        case 6:
                            g5Var2.R = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            g5Var2.S = privacyrules.rules;
                            break;
                        case 8:
                            g5Var2.T = privacyrules.rules;
                            break;
                        case 9:
                            g5Var2.O = privacyrules.rules;
                            break;
                        case 11:
                            g5Var2.U = privacyrules.rules;
                            break;
                        case 12:
                            g5Var2.V = privacyrules.rules;
                            break;
                        case 13:
                            g5Var2.W = privacyrules.rules;
                            break;
                        case 14:
                            g5Var2.P = privacyrules.rules;
                            break;
                    }
                    iArr[i22] = 2;
                    i10 = 0;
                } else {
                    i10 = 0;
                    iArr[i22] = 0;
                }
                g5Var2.getNotificationCenter().k(47, new Object[i10]);
                return;
            case 5:
                gc gcVar = (gc) this.c;
                String str2 = (String) this.d;
                int i23 = this.b;
                File file = (File) this.e;
                ConcurrentHashMap concurrentHashMap = gcVar.i;
                HashMap hashMap = gcVar.g;
                HashMap hashMap2 = gcVar.l;
                ec ecVar = (ec) hashMap2.get(str2);
                if (ecVar != null && ecVar.a != null) {
                    gcVar.v(i23, file, ecVar);
                    hashMap2.remove(str2);
                }
                ub ubVar = (ub) hashMap.get(str2);
                if (ubVar == null) {
                    return;
                }
                ArrayList arrayList5 = ubVar.v;
                hashMap.remove(str2);
                gcVar.h.remove(str2);
                ArrayList arrayList6 = new ArrayList();
                for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                    String str3 = (String) ubVar.x.get(i24);
                    String str4 = (String) ubVar.y.get(i24);
                    int intValue = ((Integer) ubVar.z.get(i24)).intValue();
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList5.get(i24);
                    int intValue2 = ((Integer) ubVar.w.get(i24)).intValue();
                    ub ubVar2 = (ub) concurrentHashMap.get(str3);
                    if (ubVar2 == null) {
                        ubVar2 = new ub(gcVar);
                        ubVar2.a = ubVar.a;
                        ubVar2.h = ubVar.h;
                        ubVar2.o = ubVar.o;
                        ubVar2.p = file;
                        ubVar2.j = ubVar.j;
                        ubVar2.c = ubVar.c;
                        ubVar2.d = str3;
                        ubVar2.n = ubVar.n;
                        ubVar2.i = ubVar.i;
                        ubVar2.m = intValue;
                        ubVar2.g = ubVar.g;
                        ubVar2.r = ubVar.r;
                        ubVar2.u = new vb(gcVar, ubVar2);
                        ubVar2.f = str4;
                        ubVar2.l = ubVar.l;
                        concurrentHashMap.put(str3, ubVar2);
                        gcVar.j.add(gc.n(str3));
                        arrayList6.add(ubVar2.u);
                    }
                    ubVar2.a(imageReceiver, str3, str4, intValue, intValue2);
                }
                for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                    vb vbVar = (vb) arrayList6.get(i25);
                    ub ubVar3 = vbVar.c;
                    if (ubVar3.m == 1) {
                        gcVar.q.c(vbVar);
                    } else {
                        com.google.android.gms.internal.cast.b0 b0Var = gcVar.p;
                        int i26 = ubVar3.a;
                        if (i26 != 1) {
                            b0Var.getClass();
                            vbVar = new of.b(i26, vbVar);
                        }
                        ((of.a) b0Var.b).execute(vbVar);
                    }
                }
                return;
            case 6:
                ((id) this.c).f((fd) this.d, null, true, this.b, (Runnable) this.e);
                return;
            case 7:
                ui uiVar2 = (ui) this.c;
                c20 c20Var = (c20) this.d;
                TL_bots.BotInfo botInfo3 = (TL_bots.BotInfo) this.e;
                int i27 = this.b;
                if (c20Var != null) {
                    c20Var.a(botInfo3);
                }
                uiVar2.getNotificationCenter().k(66, botInfo3, Integer.valueOf(i27));
                return;
            case 8:
                ui uiVar3 = (ui) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str5 = (String) this.e;
                int i28 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = uiVar3.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str5);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, i28);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = uiVar3.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i28);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 9:
                ((qp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.e, (TLRPC.TL_error) this.d);
                return;
            case 10:
                qp qpVar2 = (qp) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                int i29 = this.b;
                so soVar = (so) this.d;
                if (!(tLObject4 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    soVar.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject4;
                qpVar2.S3(tL_chatlists_chatlistUpdates.chats, false);
                qpVar2.Y3(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = qpVar2.c0;
                so soVar2 = new so();
                soVar2.a = false;
                soVar2.b = System.currentTimeMillis();
                soVar2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i29, soVar2);
                qpVar2.getNotificationCenter().k(qs.z5, Integer.valueOf(i29));
                return;
            case 11:
                ((qp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ((qp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.e, (TLRPC.TL_error) this.d);
                return;
            case 13:
                ((qp) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 14:
                qp qpVar3 = (qp) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                int i30 = this.b;
                qpVar3.T1 = false;
                if (hVar3 == null && hVar4 == null) {
                    qpVar3.U1 = 0;
                    qpVar3.V1 = null;
                    qpVar3.W1 = null;
                    return;
                }
                qpVar3.U1 = i30;
                qpVar3.V1 = hVar3;
                qpVar3.W1 = hVar4;
                if (qpVar3.X1 != null) {
                    Utilities.d.a(qpVar3.X1);
                    qpVar3.X1 = null;
                }
                if (qpVar3.I(false)) {
                    return;
                }
                qpVar3.X1 = new sn(qpVar3, i12);
                Utilities.d.d(qpVar3.X1, Math.abs(qpVar3.getConnectionsManager().getCurrentTime() - qpVar3.U1) * 1000);
                return;
            case 15:
                yr yrVar = (yr) this.c;
                int i31 = this.b;
                ?? r32 = (String) this.d;
                ?? r52 = (RequestDelegate) this.e;
                yrVar.getClass();
                ?? r62 = "DELETE FROM botcache WHERE date < ";
                try {
                    try {
                        yrVar.b.executeFast("DELETE FROM botcache WHERE date < " + i31).stepThis().dispose();
                        r32 = yrVar.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", new Object[]{r32});
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
                                            yrVar.o(e, true);
                                            r32.dispose();
                                            r52.run(tLObject, null);
                                            return;
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLiteCursor = r32;
                                            yrVar.o(e, true);
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
                        } catch (Exception e14) {
                            e = e14;
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
                int i32 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                v10 v10Var = (v10) this.e;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
                u1Var.r(500L);
                u1Var.setOnCancelListener(new ii.e0(i32, ConnectionsManager.getInstance(i32).sendRequestTyped(registerpasskey, new d3.b(i11), new x3(6, u1Var, v10Var)), v10Var, i11));
                return;
            default:
                dw dwVar = (dw) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) this.e;
                int i33 = this.b;
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                    TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                    if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                        messages_sentencryptedmessage.date = 0;
                    }
                }
                dwVar.getMessagesStorage().a2(message.random_id, 0L, Integer.valueOf(message.id), message.id, messages_sentencryptedmessage.date, 0, 0);
                g0.h3(new l7(dwVar, message, i33, 21));
                return;
        }
    }

    public /* synthetic */ dg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ dg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = c1Var;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
    }

    public /* synthetic */ dg(qp qpVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.c = qpVar;
        this.b = i7;
        this.e = tLObject;
        this.d = tL_error;
    }

    public /* synthetic */ dg(qp qpVar, TLObject tLObject, int i7, so soVar) {
        this.a = 10;
        this.c = qpVar;
        this.e = tLObject;
        this.b = i7;
        this.d = soVar;
    }
}

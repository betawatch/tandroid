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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Type inference failed for: r8v17, types: [of.b] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
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
        switch (this.a) {
            case 0:
                si siVar = (si) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                int i12 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_messages_archivedStickers tL_messages_archivedStickers = (TLRPC.TL_messages_archivedStickers) tLObject2;
                    siVar.c0[i12] = tL_messages_archivedStickers.count;
                    np.u1(siVar.currentAccount).g7.edit().putInt(i5.c.i(i12, "archivedStickersCount"), tL_messages_archivedStickers.count).commit();
                    siVar.getNotificationCenter().k(88, Integer.valueOf(i12));
                    return;
                }
                return;
            case 1:
                np npVar = (np) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                int i13 = this.b;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                npVar.D4(userFull.user.id, userFull.settings);
                long j3 = user.id;
                TLRPC.PeerNotifySettings peerNotifySettings = userFull.notify_settings;
                zs zsVar = npVar.getNotificationsController().h0;
                zsVar.getClass();
                if (peerNotifySettings != null) {
                    Utilities.e.c(new t8(zsVar, j3, 0L, peerNotifySettings, 6));
                }
                TL_bots.BotInfo botInfo2 = userFull.bot_info;
                if (botInfo2 instanceof TL_bots.TL_botInfo) {
                    botInfo2.user_id = user.id;
                    npVar.getMediaDataController().I1(user.id, userFull.bot_info);
                }
                int indexOfKey = longSparseIntArray.indexOfKey(user.id);
                if (userFull.blocked) {
                    if (indexOfKey < 0) {
                        longSparseIntArray.put(user.id, 1);
                        npVar.getNotificationCenter().k(43, new Object[0]);
                    }
                } else if (indexOfKey >= 0) {
                    longSparseIntArray.removeAt(indexOfKey);
                    npVar.getNotificationCenter().k(43, new Object[0]);
                }
                npVar.l1.k(userFull, user.id);
                long j10 = user.id;
                a0.h hVar = npVar.j8;
                TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) hVar.f(j10);
                if (requirementToContact != null) {
                    TL_account.RequirementToContact p10 = p10.p(userFull);
                    if (!p10.d(requirementToContact, p10)) {
                        if (p10 == null) {
                            hVar.l(j10);
                        } else {
                            hVar.k(p10, j10);
                        }
                        z10 = true;
                        npVar.v7.M(user.id);
                        di.y8.y(npVar.currentAccount, false).P(userFull);
                        npVar.r1.remove(Long.valueOf(user.id));
                        npVar.s1.put(user.id, System.currentTimeMillis());
                        str = user.first_name + user.last_name + p10.o(user);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(userFull.user);
                        npVar.f4(arrayList, false);
                        npVar.getMessagesStorage().m1(arrayList, null, false, true);
                        if (!str.equals(userFull.user.first_name + userFull.user.last_name + p10.o(userFull.user))) {
                            npVar.getNotificationCenter().k(2, 1);
                        }
                        userProfilePhoto = userFull.user.photo;
                        if (userProfilePhoto != null && userProfilePhoto.has_video) {
                            npVar.getNotificationCenter().k(2, 2);
                        }
                        botInfo = userFull.bot_info;
                        if (botInfo instanceof TL_bots.TL_botInfo) {
                            i7 = 0;
                        } else {
                            botInfo.user_id = userFull.id;
                            i7 = 0;
                            npVar.getNotificationCenter().k(66, userFull.bot_info, Integer.valueOf(i13), Long.valueOf(user.id));
                        }
                        ls notificationCenter = npVar.getNotificationCenter();
                        Object[] objArr = new Object[2];
                        objArr[i7] = Long.valueOf(user.id);
                        objArr[1] = userFull;
                        notificationCenter.k(67, objArr);
                        if (z10) {
                            npVar.getNotificationCenter().k(ls.k3, new Object[i7]);
                        }
                        dialog = (TLRPC.Dialog) npVar.R.f(user.id);
                        if (dialog == null) {
                            if ((userFull.flags & 2048) != 0) {
                                int i14 = dialog.folder_id;
                                int i15 = userFull.folder_id;
                                if (i14 != i15) {
                                    dialog.folder_id = i15;
                                    npVar.f5(null);
                                    npVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            if ((userFull.flags & TLObject.FLAG_14) != 0) {
                                int i16 = dialog.ttl_period;
                                int i17 = userFull.ttl_period;
                                if (i16 != i17) {
                                    dialog.ttl_period = i17;
                                    npVar.getNotificationCenter().k(3, new Object[0]);
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
                npVar.v7.M(user.id);
                di.y8.y(npVar.currentAccount, false).P(userFull);
                npVar.r1.remove(Long.valueOf(user.id));
                npVar.s1.put(user.id, System.currentTimeMillis());
                str = user.first_name + user.last_name + p10.o(user);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(userFull.user);
                npVar.f4(arrayList2, false);
                npVar.getMessagesStorage().m1(arrayList2, null, false, true);
                if (!str.equals(userFull.user.first_name + userFull.user.last_name + p10.o(userFull.user))) {
                }
                userProfilePhoto = userFull.user.photo;
                if (userProfilePhoto != null) {
                    npVar.getNotificationCenter().k(2, 2);
                }
                botInfo = userFull.bot_info;
                if (botInfo instanceof TL_bots.TL_botInfo) {
                }
                ls notificationCenter2 = npVar.getNotificationCenter();
                Object[] objArr2 = new Object[2];
                objArr2[i7] = Long.valueOf(user.id);
                objArr2[1] = userFull;
                notificationCenter2.k(67, objArr2);
                if (z10) {
                }
                dialog = (TLRPC.Dialog) npVar.R.f(user.id);
                if (dialog == null) {
                }
            case 2:
                g0.g3(new zf((v1) this.c, (u1) this.e, ur.a0(this.b).l0((ArrayList) this.d), 10));
                return;
            case 3:
                i5 i5Var = (i5) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                int i18 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                i5Var.getMessagesController().f4(arrayList3, i18 == 1);
                a0.h hVar2 = new a0.h();
                boolean isEmpty = arrayList4.isEmpty();
                if (i18 == 2 && !i5Var.f0.isEmpty()) {
                    int i19 = 0;
                    while (i19 < arrayList4.size()) {
                        if (i5Var.g0.get(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i19)).user_id)) != null) {
                            arrayList4.remove(i19);
                            i19--;
                        }
                        i19++;
                    }
                    arrayList4.addAll(i5Var.f0);
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    TLRPC.User c22 = i5Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i20)).user_id));
                    if (c22 != null) {
                        hVar2.k(c22, c22.id);
                    }
                }
                Utilities.d.c(new a5(i5Var, i18, arrayList4, arrayList3, hVar2, isEmpty));
                return;
            case 4:
                i5 i5Var2 = (i5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                int i21 = this.b;
                int[] iArr = i5Var2.J;
                if (tL_error2 == null) {
                    TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject3;
                    i5Var2.getMessagesController().f4(privacyrules.users, false);
                    i5Var2.getMessagesController().Z3(privacyrules.chats, false);
                    switch (i21) {
                        case 0:
                            i5Var2.K = privacyrules.rules;
                            break;
                        case 1:
                            i5Var2.L = privacyrules.rules;
                            break;
                        case 2:
                            i5Var2.M = privacyrules.rules;
                            break;
                        case 3:
                            i5Var2.N = privacyrules.rules;
                            break;
                        case 4:
                            i5Var2.O = privacyrules.rules;
                            break;
                        case 5:
                            i5Var2.R = privacyrules.rules;
                            break;
                        case 6:
                            i5Var2.S = privacyrules.rules;
                            break;
                        case 7:
                        case 10:
                        default:
                            i5Var2.T = privacyrules.rules;
                            break;
                        case 8:
                            i5Var2.U = privacyrules.rules;
                            break;
                        case 9:
                            i5Var2.P = privacyrules.rules;
                            break;
                        case 11:
                            i5Var2.V = privacyrules.rules;
                            break;
                        case 12:
                            i5Var2.W = privacyrules.rules;
                            break;
                        case 13:
                            i5Var2.X = privacyrules.rules;
                            break;
                        case 14:
                            i5Var2.Q = privacyrules.rules;
                            break;
                    }
                    iArr[i21] = 2;
                    i10 = 0;
                } else {
                    i10 = 0;
                    iArr[i21] = 0;
                }
                i5Var2.getNotificationCenter().k(47, new Object[i10]);
                return;
            case 5:
                fc fcVar = (fc) this.c;
                String str2 = (String) this.d;
                int i22 = this.b;
                File file = (File) this.e;
                ConcurrentHashMap concurrentHashMap = fcVar.i;
                HashMap hashMap = fcVar.g;
                HashMap hashMap2 = fcVar.l;
                dc dcVar = (dc) hashMap2.get(str2);
                if (dcVar != null && dcVar.a != null) {
                    fcVar.v(i22, file, dcVar);
                    hashMap2.remove(str2);
                }
                tb tbVar = (tb) hashMap.get(str2);
                if (tbVar == null) {
                    return;
                }
                ArrayList arrayList5 = tbVar.v;
                hashMap.remove(str2);
                fcVar.h.remove(str2);
                ArrayList arrayList6 = new ArrayList();
                for (int i23 = 0; i23 < arrayList5.size(); i23++) {
                    String str3 = (String) tbVar.x.get(i23);
                    String str4 = (String) tbVar.y.get(i23);
                    int intValue = ((Integer) tbVar.z.get(i23)).intValue();
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList5.get(i23);
                    int intValue2 = ((Integer) tbVar.w.get(i23)).intValue();
                    tb tbVar2 = (tb) concurrentHashMap.get(str3);
                    if (tbVar2 == null) {
                        tbVar2 = new tb(fcVar);
                        tbVar2.a = tbVar.a;
                        tbVar2.h = tbVar.h;
                        tbVar2.o = tbVar.o;
                        tbVar2.p = file;
                        tbVar2.j = tbVar.j;
                        tbVar2.c = tbVar.c;
                        tbVar2.d = str3;
                        tbVar2.n = tbVar.n;
                        tbVar2.i = tbVar.i;
                        tbVar2.m = intValue;
                        tbVar2.g = tbVar.g;
                        tbVar2.r = tbVar.r;
                        tbVar2.u = new ub(fcVar, tbVar2);
                        tbVar2.f = str4;
                        tbVar2.l = tbVar.l;
                        concurrentHashMap.put(str3, tbVar2);
                        fcVar.j.add(fc.n(str3));
                        arrayList6.add(tbVar2.u);
                    }
                    tbVar2.a(imageReceiver, str3, str4, intValue, intValue2);
                }
                for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                    ub ubVar = (ub) arrayList6.get(i24);
                    tb tbVar3 = ubVar.c;
                    if (tbVar3.m == 1) {
                        fcVar.q.c(ubVar);
                    } else {
                        com.google.android.gms.internal.cast.b0 b0Var = fcVar.p;
                        int i25 = tbVar3.a;
                        if (i25 != 1) {
                            b0Var.getClass();
                            ubVar = new of.b(i25, ubVar);
                        }
                        ((of.a) b0Var.b).execute(ubVar);
                    }
                }
                return;
            case 6:
                ((hd) this.c).f((dd) this.d, null, true, this.b, (Runnable) this.e);
                return;
            case 7:
                si siVar2 = (si) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                String str5 = (String) this.e;
                int i26 = this.b;
                try {
                    if (tL_messages_stickerSet != null) {
                        SQLitePreparedStatement executeFast = siVar2.getMessagesStorage().b.executeFast("REPLACE INTO stickers_dice VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_stickerSet.getObjectSize());
                        tL_messages_stickerSet.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str5);
                        executeFast.bindByteBuffer(2, nativeByteBuffer);
                        executeFast.bindInteger(3, i26);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = siVar2.getMessagesStorage().b.executeFast("UPDATE stickers_dice SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i26);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 8:
                ((np) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 9:
                ((np) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getSavedHistory) this.e, (TLRPC.TL_error) this.d);
                return;
            case 10:
                np npVar2 = (np) this.c;
                TLObject tLObject4 = (TLObject) this.e;
                int i27 = this.b;
                po poVar = (po) this.d;
                if (!(tLObject4 instanceof TL_chatlists.TL_chatlists_chatlistUpdates)) {
                    poVar.a = false;
                    return;
                }
                TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = (TL_chatlists.TL_chatlists_chatlistUpdates) tLObject4;
                npVar2.Z3(tL_chatlists_chatlistUpdates.chats, false);
                npVar2.f4(tL_chatlists_chatlistUpdates.users, false);
                SparseArray sparseArray = npVar2.d0;
                po poVar2 = new po();
                poVar2.a = false;
                poVar2.b = System.currentTimeMillis();
                poVar2.c = tL_chatlists_chatlistUpdates;
                sparseArray.put(i27, poVar2);
                npVar2.getNotificationCenter().k(ls.C5, Integer.valueOf(i27));
                return;
            case 11:
                ((np) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getPeerDialogs) this.e, (TLRPC.TL_error) this.d);
                return;
            case 12:
                ((np) this.c).getNotificationCenter().k(19, Integer.valueOf(this.b), (TLRPC.TL_messages_getReplies) this.e, (TLRPC.TL_error) this.d);
                return;
            case 13:
                np npVar3 = (np) this.c;
                a0.h hVar3 = (a0.h) this.d;
                a0.h hVar4 = (a0.h) this.e;
                int i28 = this.b;
                npVar3.W1 = false;
                if (hVar3 == null && hVar4 == null) {
                    npVar3.X1 = 0;
                    npVar3.Y1 = null;
                    npVar3.Z1 = null;
                    return;
                }
                npVar3.X1 = i28;
                npVar3.Y1 = hVar3;
                npVar3.Z1 = hVar4;
                if (npVar3.a2 != null) {
                    Utilities.d.a(npVar3.a2);
                    npVar3.a2 = null;
                }
                if (npVar3.I(false)) {
                    return;
                }
                npVar3.a2 = new sj(npVar3, 26);
                Utilities.d.d(npVar3.a2, Math.abs(npVar3.getConnectionsManager().getCurrentTime() - npVar3.X1) * 1000);
                return;
            case 14:
                ur urVar = (ur) this.c;
                int i29 = this.b;
                String str6 = (String) this.d;
                RequestDelegate requestDelegate = (RequestDelegate) this.e;
                urVar.getClass();
                try {
                    urVar.b.executeFast("DELETE FROM botcache WHERE date < " + i29).stepThis().dispose();
                    sQLiteCursor = urVar.b.queryFinalized("SELECT data FROM botcache WHERE id = ?", str6);
                    try {
                        try {
                            if (sQLiteCursor.next()) {
                                try {
                                    byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                } catch (Exception e11) {
                                    e = e11;
                                    tLObject = null;
                                }
                                if (byteBufferValue != null) {
                                    int readInt32 = byteBufferValue.readInt32(false);
                                    tLObject = readInt32 == 911761060 ? TLRPC.TL_messages_botCallbackAnswer.TLdeserialize(byteBufferValue, readInt32, false) : TLRPC.messages_BotResults.TLdeserialize(byteBufferValue, readInt32, false);
                                    try {
                                        try {
                                            byteBufferValue.reuse();
                                        } catch (Exception e12) {
                                            e = e12;
                                            try {
                                                urVar.o(e, true);
                                                sQLiteCursor.dispose();
                                                requestDelegate.run(tLObject, null);
                                                return;
                                            } catch (Exception e13) {
                                                e = e13;
                                                urVar.o(e, true);
                                                requestDelegate.run(tLObject, null);
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        requestDelegate.run(tLObject, null);
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        requestDelegate.run(tLObject, null);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                }
                            }
                            tLObject = null;
                            sQLiteCursor.dispose();
                            requestDelegate.run(tLObject, null);
                            return;
                        } catch (Exception e14) {
                            e = e14;
                            tLObject = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        tLObject = null;
                        requestDelegate.run(tLObject, null);
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor = null;
                    tLObject = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                    tLObject = null;
                }
            case 15:
                Context context = (Context) this.c;
                int i30 = this.b;
                TL_account.registerPasskey registerpasskey = (TL_account.registerPasskey) this.d;
                r10 r10Var = (r10) this.e;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context, null);
                t1Var.r(500L);
                t1Var.setOnCancelListener(new li.e0(i30, ConnectionsManager.getInstance(i30).sendRequestTyped(registerpasskey, new d3.b(i11), new z3(6, t1Var, r10Var)), r10Var, i11));
                return;
            default:
                yv yvVar = (yv) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) this.e;
                int i31 = this.b;
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                    TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                    if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                        messages_sentencryptedmessage.date = 0;
                    }
                }
                yvVar.getMessagesStorage().a2(message.random_id, 0L, Integer.valueOf(message.id), message.id, messages_sentencryptedmessage.date, 0, 0);
                g0.g3(new l7(yvVar, message, i31, 21));
                return;
        }
    }

    public /* synthetic */ eg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ eg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = c1Var;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
    }

    public /* synthetic */ eg(np npVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.c = npVar;
        this.b = i7;
        this.e = tLObject;
        this.d = tL_error;
    }

    public /* synthetic */ eg(np npVar, TLObject tLObject, int i7, po poVar) {
        this.a = 10;
        this.c = npVar;
        this.e = tLObject;
        this.b = i7;
        this.d = poVar;
    }
}

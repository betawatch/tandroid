package org.telegram.messenger;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        i5 i5Var = (i5) this.b;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            i5Var.f0.add(tL_contact);
            i5Var.g0.put(Long.valueOf(user.id), tL_contact);
        }
        i5Var.d(true);
        ks notificationCenter = i5Var.getNotificationCenter();
        int i7 = mp.I8;
        notificationCenter.k(ks.r, 1);
        i5Var.getNotificationCenter().k(ks.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        i5 i5Var = (i5) this.b;
        mt0 mt0Var = (mt0) this.c;
        AccountManager accountManager = AccountManager.get(t0.b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            i5Var.a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        accountArr = accountsByType;
                        break;
                    }
                    TLRPC.User f10 = j10.i(i10).f();
                    if (f10 != null) {
                        String str = account.name;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        accountArr = accountsByType;
                        sb2.append(f10.id);
                        if (str.equals(sb2.toString())) {
                            accountManager.removeAccount(account, null, null);
                            break;
                        }
                    } else {
                        accountArr = accountsByType;
                    }
                    i10++;
                    accountsByType = accountArr;
                }
                i7++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + i5Var.getUserConfig().e(), "org.telegram.messenger");
            i5Var.a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        i5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        i5Var.getMessagesStorage().c1(new ArrayList(), true);
        i5Var.b0.clear();
        i5Var.f0.clear();
        i5Var.g0.clear();
        i5Var.h0.clear();
        i5Var.j0.clear();
        i5Var.i0.clear();
        i5Var.c0.clear();
        i5Var.d0.clear();
        i5Var.e0.clear();
        i5Var.x.clear();
        i5Var.k0.clear();
        i5Var.l0.clear();
        i5Var.m0.clear();
        i5Var.getNotificationCenter().k(ks.O, new Object[0]);
        i5Var.A(0L, false);
        mt0Var.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v44 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        Bitmap bitmap;
        FileInputStream fileInputStream;
        Throwable th2;
        Throwable th3;
        int i7 = this.a;
        int i10 = 11;
        ?? r52 = 4;
        ?? r53 = 4;
        ?? r72 = 2;
        ?? r73 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ks f10 = ks.f(((f4) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(30, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                i5 i5Var = (i5) obj2;
                i5Var.E = false;
                SharedPreferences.Editor edit = mp.u1(i5Var.currentAccount).h7.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                i5Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                a6 a6Var = (a6) obj2;
                TLObject tLObject = (TLObject) obj;
                z5 z5Var = a6Var.P;
                z5 z5Var2 = a6Var.O;
                z5 z5Var3 = a6Var.N;
                z5 z5Var4 = a6Var.M;
                z5 z5Var5 = a6Var.L;
                z5 z5Var6 = a6Var.K;
                a6Var.F = false;
                a6Var.getUserConfig().b0 = System.currentTimeMillis();
                a6Var.getUserConfig().v(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    z5Var6.d(autodownloadsettings.low);
                    z5Var6.e = false;
                    z5Var5.d(autodownloadsettings.medium);
                    z5Var4.d(autodownloadsettings.high);
                    int i11 = 0;
                    while (i11 < 3) {
                        z5 z5Var7 = i11 == 0 ? z5Var3 : i11 == 1 ? z5Var2 : z5Var;
                        if (z5Var7.a(z5Var6)) {
                            z5Var7.d(autodownloadsettings.low);
                            z5Var7.e = false;
                        } else if (z5Var7.a(z5Var5)) {
                            z5Var7.d(autodownloadsettings.medium);
                        } else if (z5Var7.a(z5Var4)) {
                            z5Var7.d(autodownloadsettings.high);
                        }
                        i11++;
                    }
                    SharedPreferences.Editor edit2 = mp.u1(a6Var.currentAccount).h7.edit();
                    edit2.putString("mobilePreset", z5Var3.toString());
                    edit2.putString("wifiPreset", z5Var2.toString());
                    edit2.putString("roamingPreset", z5Var.toString());
                    edit2.putString("preset0", z5Var6.toString());
                    edit2.putString("preset1", z5Var5.toString());
                    edit2.putString("preset2", z5Var4.toString());
                    edit2.commit();
                    z5Var6.toString();
                    z5Var5.toString();
                    z5Var4.toString();
                    a6Var.g();
                    return;
                }
                return;
            case 3:
                a6 a6Var2 = (a6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = a6Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((fj) arrayList2.get(i12)).F0().dc_id);
                        executeFast.bindLong(2, ((fj) arrayList2.get(i12)).F0().id);
                        executeFast.step();
                        try {
                            w7.G(a6Var2.currentAccount);
                            w7.M(((fj) arrayList2.get(i12)).k, false, true).delete();
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 4:
                mp.u1(((u9) obj2).currentAccount).V3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                mp mpVar = (mp) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                zy sendMessagesHelper = mpVar.getSendMessagesHelper();
                sendMessagesHelper.getClass();
                if (message != null && message.reply_markup != null) {
                    List list = (List) sendMessagesHelper.s.remove(message.dialog_id + "_" + message.id);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            sendMessagesHelper.r.remove((String) it.next());
                        }
                    }
                }
                if (message.out || message.dialog_id != 777000) {
                    return;
                }
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                    TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                    if (tL_messageActionWalletTonConnectRequest.accepted || tL_messageActionWalletTonConnectRequest.declined) {
                        org.telegram.ui.Wallet.u0.D(mpVar.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                mp mpVar2 = (mp) obj2;
                mpVar2.getClass();
                gd E0 = gd.E0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i13 = mpVar2.currentAccount;
                if (E0.B == null) {
                    return;
                }
                String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
                if (lowerCase.equals(E0.B.c) || lowerCase.equals(E0.B.e)) {
                    E0.c1(E0.B, tL_langPackDifference, i13, false, null);
                    return;
                }
                return;
            case 7:
                gd.E0().a1(((mp) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                return;
            case 8:
                mp mpVar3 = (mp) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                mpVar3.getDownloadController().s(false);
                mpVar3.X2(true);
                mpVar3.M(true);
                mpVar3.l4 = true;
                mpVar3.a3 = tL_config.megagroup_size_max;
                mpVar3.Y2 = tL_config.chat_size_max;
                mpVar3.b3 = tL_config.edit_time_limit;
                mpVar3.c3 = tL_config.rating_e_decay;
                mpVar3.g3 = tL_config.stickers_recent_limit;
                mpVar3.d3 = tL_config.revoke_time_limit;
                mpVar3.e3 = tL_config.revoke_pm_time_limit;
                mpVar3.f3 = tL_config.revoke_pm_inbox;
                mpVar3.m4 = tL_config.fpnv_allowed;
                String str2 = tL_config.me_url_prefix;
                mpVar3.X2 = str2;
                boolean z10 = tL_config.force_try_ipv6;
                if (str2.endsWith("/")) {
                    mpVar3.X2 = com.google.android.gms.internal.vision.e2.k(mpVar3.X2, 1, 0);
                }
                if (mpVar3.X2.startsWith("https://")) {
                    mpVar3.X2 = mpVar3.X2.substring(8);
                } else if (mpVar3.X2.startsWith("http://")) {
                    mpVar3.X2 = mpVar3.X2.substring(7);
                }
                mpVar3.j3 = tL_config.call_receive_timeout_ms;
                mpVar3.k3 = tL_config.call_ring_timeout_ms;
                mpVar3.l3 = tL_config.call_connect_timeout_ms;
                mpVar3.m3 = tL_config.call_packet_timeout_ms;
                mpVar3.w3 = tL_config.message_length_max;
                mpVar3.x3 = tL_config.caption_length_max;
                mpVar3.C3 = tL_config.preload_featured_stickers;
                String str3 = tL_config.gif_search_username;
                if (str3 != null) {
                    mpVar3.N3 = str3;
                }
                if (mpVar3.O3 != null) {
                    mpVar3.O3 = tL_config.img_search_username;
                }
                mpVar3.B3 = tL_config.blocked_mode;
                mpVar3.P3 = tL_config.dc_txt_domain_name;
                mpVar3.Q3 = tL_config.webfile_dc_id;
                String str4 = tL_config.suggested_lang_code;
                if (str4 != null) {
                    String str5 = mpVar3.R3;
                    boolean z11 = str5 == null || !str5.equals(str4);
                    mpVar3.R3 = tL_config.suggested_lang_code;
                    if (z11) {
                        gd.E0().W0(mpVar3.currentAccount, true);
                    }
                }
                org.telegram.ui.ActionBar.m6.m1(mpVar3.currentAccount, false);
                org.telegram.ui.ActionBar.m6.G(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                mpVar3.v3 = null;
                mpVar3.p3 = 2;
                mpVar3.q3 = 0;
                p5.c.s(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i14 = 0; i14 < split.length; i14++) {
                    String[] split2 = split[i14].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i14 == 0) {
                                    if (split2.length > 1) {
                                        mpVar3.p3 = 3;
                                    } else {
                                        mpVar3.p3 = 1;
                                    }
                                }
                                mpVar3.q3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i14 == 0 && split2.length > 1) {
                                    mpVar3.p3 = 4;
                                }
                                mpVar3.q3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i14 == 0) {
                                    mpVar3.p3 = 2;
                                }
                                mpVar3.q3 |= 2;
                            }
                            if (split3.length > 1) {
                                mpVar3.v3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = mpVar3.h7.edit();
                edit3.putBoolean("remoteConfigLoaded", mpVar3.l4);
                edit3.putInt("maxGroupCount", mpVar3.Y2);
                edit3.putInt("maxMegagroupCount", mpVar3.a3);
                edit3.putInt("maxEditTime", mpVar3.b3);
                edit3.putInt("ratingDecay", mpVar3.c3);
                edit3.putInt("maxRecentGifsCount", mpVar3.i3);
                edit3.putInt("maxRecentStickersCount", mpVar3.g3);
                edit3.putInt("maxFaveStickersCount", mpVar3.h3);
                edit3.putInt("callReceiveTimeout", mpVar3.j3);
                edit3.putInt("callRingTimeout", mpVar3.k3);
                edit3.putInt("callConnectTimeout", mpVar3.l3);
                edit3.putInt("callPacketTimeout", mpVar3.m3);
                edit3.putString("linkPrefix", mpVar3.X2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", mpVar3.n3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", mpVar3.o3);
                edit3.putInt("maxMessageLength", mpVar3.w3);
                edit3.putInt("maxCaptionLength", mpVar3.x3);
                edit3.putBoolean("preloadFeaturedStickers", mpVar3.C3);
                edit3.putInt("revokeTimeLimit", mpVar3.d3);
                edit3.putInt("revokeTimePmLimit", mpVar3.e3);
                edit3.putInt("mapProvider", mpVar3.p3);
                String str6 = mpVar3.v3;
                if (str6 != null) {
                    edit3.putString("pk", str6);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", mpVar3.f3);
                edit3.putBoolean("fpnvAllowed", mpVar3.m4);
                edit3.putBoolean("blockedCountry", mpVar3.B3);
                edit3.putString("gifSearchBot", mpVar3.N3);
                edit3.putString("imageSearchBot", mpVar3.O3);
                edit3.putString("dcDomainName2", mpVar3.P3);
                edit3.putInt("webFileDatacenterId", mpVar3.Q3);
                edit3.putString("suggestedLangCode", mpVar3.R3);
                edit3.putBoolean("forceTryIpV6", z10);
                String str7 = tL_config.autologin_token;
                mpVar3.i4 = str7;
                edit3.putString("autologinToken", str7);
                edit3.commit();
                mpVar3.getConnectionsManager().setForceTryIpV6(z10);
                gd E02 = gd.E0();
                int i15 = mpVar3.currentAccount;
                int i16 = tL_config.lang_pack_version;
                int i17 = tL_config.base_lang_pack_version;
                cd cdVar = E02.B;
                if (cdVar != null && (cdVar.i() || E02.B.j())) {
                    if (E02.B.g()) {
                        if (E02.B.i < i17) {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + E02.B.i + ", remote is " + i17 + ")");
                            E02.P = true;
                            cd cdVar2 = E02.B;
                            E02.f(cdVar2, cdVar2.e, false, i15, new tc(E02, i15, 0));
                        } else {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + E02.B.i + ", remote is " + i17 + ")");
                        }
                    }
                    if (E02.B.h < i16) {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + E02.B.h + ", remote is " + i16 + ")");
                        E02.P = true;
                        cd cdVar3 = E02.B;
                        E02.f(cdVar3, cdVar3.c, false, i15, new tc(E02, i15, 1));
                    } else {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + E02.B.h + ", remote is " + i16 + ")");
                    }
                }
                mpVar3.getNotificationCenter().k(ks.J2, new Object[0]);
                return;
            case 9:
                mp mpVar4 = (mp) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                mpVar4.f4(tL_messages_invitedUsers.updates.users, false);
                mpVar4.Z3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = tL_messages_invitedUsers.updates.chats;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    mpVar4.getNotificationCenter().k(29, new Object[0]);
                    return;
                } else {
                    mpVar4.getNotificationCenter().k(28, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    org.telegram.ui.Components.c5.f(mpVar4.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
            case 10:
                tr trVar = (tr) obj2;
                fj fjVar = (fj) obj;
                trVar.getClass();
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(fjVar.k.getObjectSize());
                    fjVar.k.serializeToStream(nativeByteBuffer);
                    int i18 = fjVar.a == 2 ? 1 : 0;
                    if (fjVar.f) {
                        i18 |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = trVar.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, fj.B0(fjVar.k));
                    executeFast2.bindInteger(2, fjVar.e1());
                    executeFast2.bindLong(3, fjVar.k.random_id);
                    executeFast2.bindInteger(4, fjVar.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = fjVar.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str8 = fjVar.b;
                    if (str8 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str8);
                    }
                    String str9 = fjVar.c;
                    if (str9 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str9);
                    }
                    executeFast2.bindInteger(9, i18);
                    executeFast2.bindLong(10, fj.b2(trVar.currentAccount, fjVar.k, false, false));
                    executeFast2.bindInteger(11, (fjVar.I ? 1 : 0) + (fjVar.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e12) {
                    trVar.o(e12, true);
                    return;
                }
            case 11:
                di.y8.y(((zy) obj2).currentAccount, false).d0((ArrayList) obj);
                return;
            case 12:
                e00 e00Var = (e00) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (sr srVar : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(srVar)).intValue();
                    TLRPC.TL_forumTopic f11 = e00Var.f(-srVar.a, srVar.b);
                    if (f11 != null) {
                        f11.read_outbox_max_id = Math.max(f11.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-srVar.a));
                        TLRPC.Message message2 = f11.topMessage;
                        if (message2 != null && f11.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ks.f(e00Var.currentAccount).k(ks.t5, (Long) it2.next(), Boolean.TRUE);
                }
                return;
            case 13:
                e00 e00Var2 = (e00) obj2;
                List list2 = (List) obj;
                a0.h hVar = e00Var2.e;
                HashSet hashSet2 = new HashSet();
                a0.h hVar2 = null;
                for (int i19 = 0; i19 < list2.size(); i19++) {
                    b00 b00Var = (b00) list2.get(i19);
                    if (b00Var.i) {
                        if (hVar2 == null) {
                            hVar2 = new a0.h();
                        }
                        ArrayList arrayList4 = (ArrayList) hVar2.f(b00Var.b);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            hVar2.k(arrayList4, b00Var.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (v3.o0(e00Var2.currentAccount, b00Var.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = b00Var.c;
                        } else {
                            tL_forumTopic.id = (int) b00Var.c;
                        }
                        arrayList4.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f12 = e00Var2.f(-b00Var.b, b00Var.c);
                        if (f12 != null) {
                            if (b00Var.j) {
                                int i20 = b00Var.e;
                                if (i20 >= 0) {
                                    f12.unread_count = i20;
                                }
                                int i21 = b00Var.d;
                                if (i21 >= 0) {
                                    f12.unread_mentions_count = i21;
                                }
                            } else {
                                hVar.l(e00.p(f12.top_message, -b00Var.b));
                                f12.topMessage = b00Var.g;
                                f12.groupedMessages = b00Var.h;
                                int i22 = b00Var.f;
                                f12.top_message = i22;
                                f12.unread_count = b00Var.e;
                                f12.unread_mentions_count = b00Var.d;
                                hVar.k(f12, e00.p(i22, -b00Var.b));
                            }
                            int i23 = b00Var.a;
                            if (i23 > 0) {
                                f12.totalMessagesCount = i23;
                            }
                            hashSet2.add(Long.valueOf(-b00Var.b));
                        }
                        if (f12 != null && b00Var.k) {
                            f12.totalMessagesCount = 0;
                            e00Var2.k(b00Var.b, b00Var.c);
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    e00Var2.y(((Long) it3.next()).longValue(), true);
                }
                if (hVar2 != null) {
                    for (int i24 = 0; i24 < hVar2.m(); i24++) {
                        e00Var2.v(-hVar2.j(i24), (ArrayList) hVar2.n(i24), null);
                    }
                    return;
                }
                return;
            case 14:
                e00 e00Var3 = (e00) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                e00Var3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getContext());
                String N0 = gd.N0(2131748785, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                t1Var.U = gd.a0(null, null, 2131748755, Integer.valueOf(mp.u1(e00Var3.currentAccount).g5));
                alertDialog$Builder.k(gd.N0(2131747637, null), null);
                g2Var.showDialog(t1Var);
                return;
            case 15:
                h1 h1Var = (h1) obj2;
                File file = (File) obj;
                if (file == null) {
                    h1Var.j = false;
                    ks.e().k(ks.T4, new Object[0]);
                    return;
                }
                if (!TextUtils.isEmpty(h1Var.d)) {
                    try {
                        new File(h1Var.d).delete();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                }
                h1Var.d = file.getAbsolutePath();
                h1Var.f();
                h1Var.k = 1.0f;
                h1Var.j = false;
                ks.e().k(ks.T4, new Object[0]);
                return;
            case 16:
                v1 v1Var = (v1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i25 = v1Var.a;
                if (tLObject2 instanceof TL_account.contactBirthdays) {
                    v1Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject2;
                    v1Var.c = t1.b(contactbirthdays);
                    mp.u1(i25).f4(contactbirthdays.users, false);
                    tr.a0(i25).m1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit4 = mp.u1(i25).h7.edit();
                    edit4.putLong("bday_check", v1Var.b);
                    u1 u1Var = new u1();
                    u1Var.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(u1Var.getObjectSize());
                    u1Var.serializeToStream(serializedData);
                    edit4.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit4.apply();
                    ks.f(i25).k(ks.j5, new Object[0]);
                    v1Var.e = false;
                    return;
                }
                return;
            case 17:
                ((k3) obj2).a.getMessagesController().R1().k.j((ArrayList) obj);
                return;
            case 18:
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) obj;
                try {
                    try {
                        fileInputStream = new FileInputStream((File) obj2);
                    } catch (Exception e14) {
                        e = e14;
                        r52 = 0;
                        r72 = 0;
                        a8.g(e, true);
                        bitmap = r52;
                        arrayList = r72;
                        g0.g3(new w3(21, q3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    a8.g(e, true);
                    bitmap = r52;
                    arrayList = r72;
                    g0.g3(new w3(21, q3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                    return;
                }
                try {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            ArrayList arrayList5 = new ArrayList(1);
                            Bitmap d = c8.h0.d(gZIPInputStream, arrayList5);
                            try {
                                int size = arrayList5.size();
                                ArrayList arrayList6 = null;
                                int i26 = 0;
                                while (i26 < size) {
                                    try {
                                        Object obj3 = arrayList5.get(i26);
                                        i26++;
                                        String str10 = (String) obj3;
                                        if (str10.startsWith("patterns = ")) {
                                            byte[] v = Utilities.v(str10.substring(i10));
                                            int length = v.length / 52;
                                            SerializedData serializedData2 = new SerializedData(v);
                                            ArrayList arrayList7 = new ArrayList(length);
                                            for (int i27 = 0; i27 < length; i27++) {
                                                try {
                                                    arrayList7.add(gg.c.a(serializedData2));
                                                } catch (Throwable th4) {
                                                    th3 = th4;
                                                    r73 = arrayList7;
                                                    r53 = d;
                                                    try {
                                                        gZIPInputStream.close();
                                                        throw th3;
                                                    } catch (Throwable th5) {
                                                        th3.addSuppressed(th5);
                                                        throw th3;
                                                    }
                                                }
                                            }
                                            serializedData2.cleanup();
                                            arrayList6 = arrayList7;
                                        }
                                        i10 = 11;
                                        arrayList6 = arrayList6;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                        r53 = d;
                                        r73 = arrayList6;
                                    }
                                }
                                gZIPInputStream.close();
                                fileInputStream.close();
                                bitmap = d;
                                arrayList = arrayList6;
                                g0.g3(new w3(21, q3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                                return;
                            } catch (Throwable th7) {
                                th3 = th7;
                                r73 = 0;
                                r53 = d;
                            }
                        } catch (Throwable th8) {
                            th3 = th8;
                            r53 = 0;
                            r73 = 0;
                        }
                    } catch (Throwable th9) {
                        th2 = th9;
                        r52 = 0;
                        r72 = 0;
                        try {
                            fileInputStream.close();
                            throw th2;
                        } catch (Throwable th10) {
                            th2.addSuppressed(th10);
                            throw th2;
                        }
                    }
                } catch (Throwable th11) {
                    th2 = th11;
                    r52 = r53;
                    r72 = r73;
                    fileInputStream.close();
                    throw th2;
                }
            case 19:
                ((ResultCallback) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 20:
                ((j1) obj2).onComplete((Bitmap) obj);
                return;
            case 21:
                ((org.telegram.ui.ActionBar.q3) obj2).a((gg.a) obj);
                return;
            case 22:
                ((org.telegram.ui.Components.kp) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 23:
                l2.q1 q1Var = ((f4) obj2).f;
                q1Var.b = System.currentTimeMillis();
                q1Var.c = true;
                ((org.telegram.ui.Components.kp) obj).onComplete(null);
                return;
            case 24:
                Bitmap bitmap2 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream((File) obj2);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                    return;
                } catch (Exception e16) {
                    a8.g(e16, true);
                    return;
                }
            case 25:
                File file2 = (File) obj2;
                j1 j1Var = (j1) obj;
                try {
                    if (file2.exists()) {
                        r8 = BitmapFactory.decodeFile(file2.getAbsolutePath());
                    }
                } catch (Exception e17) {
                    a8.g(e17, true);
                }
                g0.g3(new w3(20, j1Var, r8));
                return;
            case 26:
                i5 i5Var2 = (i5) obj2;
                i5Var2.getClass();
                i5Var2.j(((Long) obj).longValue());
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                ((i5) obj2).a((TLRPC.User) obj);
                return;
        }
    }
}

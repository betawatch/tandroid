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
import org.telegram.ui.ct0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.b;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.f0.add(tL_contact);
            g5Var.g0.put(Long.valueOf(user.id), tL_contact);
        }
        g5Var.d(true);
        hs notificationCenter = g5Var.getNotificationCenter();
        int i3 = hp.C8;
        notificationCenter.k(hs.r, 1);
        g5Var.getNotificationCenter().k(hs.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.b;
        ct0 ct0Var = (ct0) this.c;
        AccountManager accountManager = AccountManager.get(t0.b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.a = null;
            int i3 = 0;
            while (i3 < accountsByType.length) {
                Account account = accountsByType[i3];
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        accountArr = accountsByType;
                        break;
                    }
                    TLRPC.User f10 = h10.i(i10).f();
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
                i3++;
                accountsByType = accountArr;
            }
        } catch (Throwable unused) {
        }
        try {
            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
            g5Var.a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.b0.clear();
        g5Var.f0.clear();
        g5Var.g0.clear();
        g5Var.h0.clear();
        g5Var.j0.clear();
        g5Var.i0.clear();
        g5Var.c0.clear();
        g5Var.d0.clear();
        g5Var.e0.clear();
        g5Var.x.clear();
        g5Var.k0.clear();
        g5Var.l0.clear();
        g5Var.m0.clear();
        g5Var.getNotificationCenter().k(hs.O, new Object[0]);
        g5Var.A(0L, false);
        ct0Var.run();
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
        int i3 = this.a;
        int i10 = 11;
        ?? r5 = 4;
        ?? r52 = 4;
        ?? r72 = 2;
        ?? r73 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                hs f10 = hs.f(((d4) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(30, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                g5 g5Var = (g5) obj2;
                g5Var.E = false;
                SharedPreferences.Editor edit = hp.s1(g5Var.currentAccount).e7.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                g5Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                z5 z5Var = (z5) obj2;
                TLObject tLObject = (TLObject) obj;
                y5 y5Var = z5Var.P;
                y5 y5Var2 = z5Var.O;
                y5 y5Var3 = z5Var.N;
                y5 y5Var4 = z5Var.M;
                y5 y5Var5 = z5Var.L;
                y5 y5Var6 = z5Var.K;
                z5Var.F = false;
                z5Var.getUserConfig().b0 = System.currentTimeMillis();
                z5Var.getUserConfig().v(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    y5Var6.d(autodownloadsettings.low);
                    y5Var6.e = false;
                    y5Var5.d(autodownloadsettings.medium);
                    y5Var4.d(autodownloadsettings.high);
                    int i11 = 0;
                    while (i11 < 3) {
                        y5 y5Var7 = i11 == 0 ? y5Var3 : i11 == 1 ? y5Var2 : y5Var;
                        if (y5Var7.a(y5Var6)) {
                            y5Var7.d(autodownloadsettings.low);
                            y5Var7.e = false;
                        } else if (y5Var7.a(y5Var5)) {
                            y5Var7.d(autodownloadsettings.medium);
                        } else if (y5Var7.a(y5Var4)) {
                            y5Var7.d(autodownloadsettings.high);
                        }
                        i11++;
                    }
                    SharedPreferences.Editor edit2 = hp.s1(z5Var.currentAccount).e7.edit();
                    edit2.putString("mobilePreset", y5Var3.toString());
                    edit2.putString("wifiPreset", y5Var2.toString());
                    edit2.putString("roamingPreset", y5Var.toString());
                    edit2.putString("preset0", y5Var6.toString());
                    edit2.putString("preset1", y5Var5.toString());
                    edit2.putString("preset2", y5Var4.toString());
                    edit2.commit();
                    y5Var6.toString();
                    y5Var5.toString();
                    y5Var4.toString();
                    z5Var.g();
                    return;
                }
                return;
            case 3:
                z5 z5Var2 = (z5) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = z5Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((zi) arrayList2.get(i12)).F0().dc_id);
                        executeFast.bindLong(2, ((zi) arrayList2.get(i12)).F0().id);
                        executeFast.step();
                        try {
                            w7.G(z5Var2.currentAccount);
                            w7.N(((zi) arrayList2.get(i12)).k, false, true).delete();
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
                hp.s1(((q9) obj2).currentAccount).O3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                hp hpVar = (hp) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                yy sendMessagesHelper = hpVar.getSendMessagesHelper();
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
                        org.telegram.ui.Wallet.k0.x(hpVar.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                hp hpVar2 = (hp) obj2;
                hpVar2.getClass();
                bd E0 = bd.E0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i13 = hpVar2.currentAccount;
                if (E0.B == null) {
                    return;
                }
                String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
                if (lowerCase.equals(E0.B.c) || lowerCase.equals(E0.B.e)) {
                    E0.b1(E0.B, tL_langPackDifference, i13, false, null);
                    return;
                }
                return;
            case 7:
                bd.E0().Z0(((hp) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                return;
            case 8:
                hp hpVar3 = (hp) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                hpVar3.getDownloadController().s(false);
                hpVar3.R2(true);
                hpVar3.M(true);
                hpVar3.j4 = true;
                hpVar3.Y2 = tL_config.megagroup_size_max;
                hpVar3.W2 = tL_config.chat_size_max;
                hpVar3.Z2 = tL_config.edit_time_limit;
                hpVar3.a3 = tL_config.rating_e_decay;
                hpVar3.e3 = tL_config.stickers_recent_limit;
                hpVar3.b3 = tL_config.revoke_time_limit;
                hpVar3.c3 = tL_config.revoke_pm_time_limit;
                hpVar3.d3 = tL_config.revoke_pm_inbox;
                String str2 = tL_config.me_url_prefix;
                hpVar3.V2 = str2;
                boolean z10 = tL_config.force_try_ipv6;
                if (str2.endsWith("/")) {
                    hpVar3.V2 = com.google.android.recaptcha.internal.a.j(hpVar3.V2, 1, 0);
                }
                if (hpVar3.V2.startsWith("https://")) {
                    hpVar3.V2 = hpVar3.V2.substring(8);
                } else if (hpVar3.V2.startsWith("http://")) {
                    hpVar3.V2 = hpVar3.V2.substring(7);
                }
                hpVar3.h3 = tL_config.call_receive_timeout_ms;
                hpVar3.i3 = tL_config.call_ring_timeout_ms;
                hpVar3.j3 = tL_config.call_connect_timeout_ms;
                hpVar3.k3 = tL_config.call_packet_timeout_ms;
                hpVar3.u3 = tL_config.message_length_max;
                hpVar3.v3 = tL_config.caption_length_max;
                hpVar3.A3 = tL_config.preload_featured_stickers;
                String str3 = tL_config.gif_search_username;
                if (str3 != null) {
                    hpVar3.L3 = str3;
                }
                if (hpVar3.M3 != null) {
                    hpVar3.M3 = tL_config.img_search_username;
                }
                hpVar3.z3 = tL_config.blocked_mode;
                hpVar3.N3 = tL_config.dc_txt_domain_name;
                hpVar3.O3 = tL_config.webfile_dc_id;
                String str4 = tL_config.suggested_lang_code;
                if (str4 != null) {
                    String str5 = hpVar3.P3;
                    boolean z11 = str5 == null || !str5.equals(str4);
                    hpVar3.P3 = tL_config.suggested_lang_code;
                    if (z11) {
                        bd.E0().V0(hpVar3.currentAccount, true);
                    }
                }
                org.telegram.ui.ActionBar.k6.m1(hpVar3.currentAccount, false);
                org.telegram.ui.ActionBar.k6.G(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                hpVar3.t3 = null;
                hpVar3.n3 = 2;
                hpVar3.o3 = 0;
                k2.p1.w(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i14 = 0; i14 < split.length; i14++) {
                    String[] split2 = split[i14].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i14 == 0) {
                                    if (split2.length > 1) {
                                        hpVar3.n3 = 3;
                                    } else {
                                        hpVar3.n3 = 1;
                                    }
                                }
                                hpVar3.o3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i14 == 0 && split2.length > 1) {
                                    hpVar3.n3 = 4;
                                }
                                hpVar3.o3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i14 == 0) {
                                    hpVar3.n3 = 2;
                                }
                                hpVar3.o3 |= 2;
                            }
                            if (split3.length > 1) {
                                hpVar3.t3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = hpVar3.e7.edit();
                edit3.putBoolean("remoteConfigLoaded", hpVar3.j4);
                edit3.putInt("maxGroupCount", hpVar3.W2);
                edit3.putInt("maxMegagroupCount", hpVar3.Y2);
                edit3.putInt("maxEditTime", hpVar3.Z2);
                edit3.putInt("ratingDecay", hpVar3.a3);
                edit3.putInt("maxRecentGifsCount", hpVar3.g3);
                edit3.putInt("maxRecentStickersCount", hpVar3.e3);
                edit3.putInt("maxFaveStickersCount", hpVar3.f3);
                edit3.putInt("callReceiveTimeout", hpVar3.h3);
                edit3.putInt("callRingTimeout", hpVar3.i3);
                edit3.putInt("callConnectTimeout", hpVar3.j3);
                edit3.putInt("callPacketTimeout", hpVar3.k3);
                edit3.putString("linkPrefix", hpVar3.V2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", hpVar3.l3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", hpVar3.m3);
                edit3.putInt("maxMessageLength", hpVar3.u3);
                edit3.putInt("maxCaptionLength", hpVar3.v3);
                edit3.putBoolean("preloadFeaturedStickers", hpVar3.A3);
                edit3.putInt("revokeTimeLimit", hpVar3.b3);
                edit3.putInt("revokeTimePmLimit", hpVar3.c3);
                edit3.putInt("mapProvider", hpVar3.n3);
                String str6 = hpVar3.t3;
                if (str6 != null) {
                    edit3.putString("pk", str6);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", hpVar3.d3);
                edit3.putBoolean("blockedCountry", hpVar3.z3);
                edit3.putString("gifSearchBot", hpVar3.L3);
                edit3.putString("imageSearchBot", hpVar3.M3);
                edit3.putString("dcDomainName2", hpVar3.N3);
                edit3.putInt("webFileDatacenterId", hpVar3.O3);
                edit3.putString("suggestedLangCode", hpVar3.P3);
                edit3.putBoolean("forceTryIpV6", z10);
                String str7 = tL_config.autologin_token;
                hpVar3.g4 = str7;
                edit3.putString("autologinToken", str7);
                edit3.commit();
                hpVar3.getConnectionsManager().setForceTryIpV6(z10);
                bd E02 = bd.E0();
                int i15 = hpVar3.currentAccount;
                int i16 = tL_config.lang_pack_version;
                int i17 = tL_config.base_lang_pack_version;
                yc ycVar = E02.B;
                if (ycVar != null && (ycVar.i() || E02.B.j())) {
                    if (E02.B.g()) {
                        if (E02.B.i < i17) {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + E02.B.i + ", remote is " + i17 + ")");
                            E02.P = true;
                            yc ycVar2 = E02.B;
                            E02.f(ycVar2, ycVar2.e, false, i15, new pc(E02, i15, 0));
                        } else {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + E02.B.i + ", remote is " + i17 + ")");
                        }
                    }
                    if (E02.B.h < i16) {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + E02.B.h + ", remote is " + i16 + ")");
                        E02.P = true;
                        yc ycVar3 = E02.B;
                        E02.f(ycVar3, ycVar3.c, false, i15, new pc(E02, i15, 1));
                    } else {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + E02.B.h + ", remote is " + i16 + ")");
                    }
                }
                hpVar3.getNotificationCenter().k(hs.J2, new Object[0]);
                return;
            case 9:
                hp hpVar4 = (hp) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                hpVar4.Y3(tL_messages_invitedUsers.updates.users, false);
                hpVar4.S3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = tL_messages_invitedUsers.updates.chats;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    hpVar4.getNotificationCenter().k(29, new Object[0]);
                    return;
                } else {
                    hpVar4.getNotificationCenter().k(28, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    org.telegram.ui.Components.t4.f(hpVar4.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
            case 10:
                qr qrVar = (qr) obj2;
                zi ziVar = (zi) obj;
                qrVar.getClass();
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ziVar.k.getObjectSize());
                    ziVar.k.serializeToStream(nativeByteBuffer);
                    int i18 = ziVar.a == 2 ? 1 : 0;
                    if (ziVar.f) {
                        i18 |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = qrVar.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, zi.B0(ziVar.k));
                    executeFast2.bindInteger(2, ziVar.f1());
                    executeFast2.bindLong(3, ziVar.k.random_id);
                    executeFast2.bindInteger(4, ziVar.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = ziVar.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str8 = ziVar.b;
                    if (str8 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str8);
                    }
                    String str9 = ziVar.c;
                    if (str9 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str9);
                    }
                    executeFast2.bindInteger(9, i18);
                    executeFast2.bindLong(10, zi.c2(qrVar.currentAccount, ziVar.k, false, false));
                    executeFast2.bindInteger(11, (ziVar.I ? 1 : 0) + (ziVar.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e12) {
                    qrVar.o(e12, true);
                    return;
                }
            case 11:
                ci.e9.y(((yy) obj2).currentAccount, false).d0((ArrayList) obj);
                return;
            case 12:
                c00 c00Var = (c00) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (pr prVar : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(prVar)).intValue();
                    TLRPC.TL_forumTopic f11 = c00Var.f(-prVar.a, prVar.b);
                    if (f11 != null) {
                        f11.read_outbox_max_id = Math.max(f11.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-prVar.a));
                        TLRPC.Message message2 = f11.topMessage;
                        if (message2 != null && f11.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    hs.f(c00Var.currentAccount).k(hs.q5, (Long) it2.next(), Boolean.TRUE);
                }
                return;
            case 13:
                c00 c00Var2 = (c00) obj2;
                List list2 = (List) obj;
                a0.h hVar = c00Var2.e;
                HashSet hashSet2 = new HashSet();
                a0.h hVar2 = null;
                for (int i19 = 0; i19 < list2.size(); i19++) {
                    a00 a00Var = (a00) list2.get(i19);
                    if (a00Var.i) {
                        if (hVar2 == null) {
                            hVar2 = new a0.h();
                        }
                        ArrayList arrayList4 = (ArrayList) hVar2.f(a00Var.b);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            hVar2.k(arrayList4, a00Var.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (t3.o0(c00Var2.currentAccount, a00Var.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = a00Var.c;
                        } else {
                            tL_forumTopic.id = (int) a00Var.c;
                        }
                        arrayList4.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f12 = c00Var2.f(-a00Var.b, a00Var.c);
                        if (f12 != null) {
                            if (a00Var.j) {
                                int i20 = a00Var.e;
                                if (i20 >= 0) {
                                    f12.unread_count = i20;
                                }
                                int i21 = a00Var.d;
                                if (i21 >= 0) {
                                    f12.unread_mentions_count = i21;
                                }
                            } else {
                                hVar.l(c00.p(f12.top_message, -a00Var.b));
                                f12.topMessage = a00Var.g;
                                f12.groupedMessages = a00Var.h;
                                int i22 = a00Var.f;
                                f12.top_message = i22;
                                f12.unread_count = a00Var.e;
                                f12.unread_mentions_count = a00Var.d;
                                hVar.k(f12, c00.p(i22, -a00Var.b));
                            }
                            int i23 = a00Var.a;
                            if (i23 > 0) {
                                f12.totalMessagesCount = i23;
                            }
                            hashSet2.add(Long.valueOf(-a00Var.b));
                        }
                        if (f12 != null && a00Var.k) {
                            f12.totalMessagesCount = 0;
                            c00Var2.k(a00Var.b, a00Var.c);
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    c00Var2.y(((Long) it3.next()).longValue(), true);
                }
                if (hVar2 != null) {
                    for (int i24 = 0; i24 < hVar2.m(); i24++) {
                        c00Var2.v(-hVar2.j(i24), (ArrayList) hVar2.n(i24), null);
                    }
                    return;
                }
                return;
            case 14:
                c00 c00Var3 = (c00) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                c00Var3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getContext());
                String M0 = bd.M0(2131748986, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.a0(null, null, 2131748956, Integer.valueOf(hp.s1(c00Var3.currentAccount).d5));
                alertDialog$Builder.k(bd.M0(2131747839, null), null);
                d2Var.showDialog(s1Var);
                return;
            case 15:
                h1 h1Var = (h1) obj2;
                File file = (File) obj;
                if (file == null) {
                    h1Var.j = false;
                    hs.e().k(hs.Q4, new Object[0]);
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
                hs.e().k(hs.Q4, new Object[0]);
                return;
            case 16:
                v1 v1Var = (v1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i25 = v1Var.a;
                if (tLObject2 instanceof TL_account.contactBirthdays) {
                    v1Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject2;
                    v1Var.c = t1.b(contactbirthdays);
                    hp.s1(i25).Y3(contactbirthdays.users, false);
                    qr.a0(i25).m1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit4 = hp.s1(i25).e7.edit();
                    edit4.putLong("bday_check", v1Var.b);
                    u1 u1Var = new u1();
                    u1Var.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(u1Var.getObjectSize());
                    u1Var.serializeToStream(serializedData);
                    edit4.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit4.apply();
                    hs.f(i25).k(hs.g5, new Object[0]);
                    v1Var.e = false;
                    return;
                }
                return;
            case 17:
                ((i3) obj2).a.getMessagesController().P1().k.j((ArrayList) obj);
                return;
            case 18:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                try {
                    try {
                        fileInputStream = new FileInputStream((File) obj2);
                    } catch (Exception e14) {
                        e = e14;
                        r5 = 0;
                        r72 = 0;
                        a8.g(e, true);
                        bitmap = r5;
                        arrayList = r72;
                        g0.h3(new b4(21, n3Var, bitmap != null ? new hg.a(bitmap, 1, arrayList) : null));
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    a8.g(e, true);
                    bitmap = r5;
                    arrayList = r72;
                    g0.h3(new b4(21, n3Var, bitmap != null ? new hg.a(bitmap, 1, arrayList) : null));
                    return;
                }
                try {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            ArrayList arrayList5 = new ArrayList(1);
                            Bitmap d = b8.bd.d(gZIPInputStream, arrayList5);
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
                                                    arrayList7.add(hg.c.a(serializedData2));
                                                } catch (Throwable th4) {
                                                    th3 = th4;
                                                    r73 = arrayList7;
                                                    r52 = d;
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
                                        r52 = d;
                                        r73 = arrayList6;
                                    }
                                }
                                gZIPInputStream.close();
                                fileInputStream.close();
                                bitmap = d;
                                arrayList = arrayList6;
                                g0.h3(new b4(21, n3Var, bitmap != null ? new hg.a(bitmap, 1, arrayList) : null));
                                return;
                            } catch (Throwable th7) {
                                th3 = th7;
                                r73 = 0;
                                r52 = d;
                            }
                        } catch (Throwable th8) {
                            th3 = th8;
                            r52 = 0;
                            r73 = 0;
                        }
                    } catch (Throwable th9) {
                        th2 = th9;
                        r5 = 0;
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
                    r5 = r52;
                    r72 = r73;
                    fileInputStream.close();
                    throw th2;
                }
            case 19:
                ((ResultCallback) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 20:
                ((p1) obj2).onComplete((Bitmap) obj);
                return;
            case 21:
                ((org.telegram.ui.ActionBar.n3) obj2).a((hg.a) obj);
                return;
            case 22:
                ((org.telegram.ui.Components.so) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 23:
                k2.u1 u1Var2 = ((d4) obj2).f;
                u1Var2.b = System.currentTimeMillis();
                u1Var2.c = true;
                ((org.telegram.ui.Components.so) obj).onComplete(null);
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
                p1 p1Var = (p1) obj;
                try {
                    if (file2.exists()) {
                        r8 = BitmapFactory.decodeFile(file2.getAbsolutePath());
                    }
                } catch (Exception e17) {
                    a8.g(e17, true);
                }
                g0.h3(new b4(20, p1Var, r8));
                return;
            case 26:
                g5 g5Var2 = (g5) obj2;
                g5Var2.getClass();
                g5Var2.j(((Long) obj).longValue());
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                ((g5) obj2).a((TLRPC.User) obj);
                return;
        }
    }
}

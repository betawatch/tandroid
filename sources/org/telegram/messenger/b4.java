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
import org.telegram.ui.ot0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b4(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        g5 g5Var = (g5) this.b;
        for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
            TLRPC.User user = (TLRPC.User) entry.getKey();
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) entry.getValue();
            user.contact = true;
            g5Var.e0.add(tL_contact);
            g5Var.f0.put(Long.valueOf(user.id), tL_contact);
        }
        g5Var.d(true);
        qs notificationCenter = g5Var.getNotificationCenter();
        int i7 = qp.C8;
        notificationCenter.k(qs.r, 1);
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
    }

    private final void b() {
        Account[] accountArr;
        g5 g5Var = (g5) this.b;
        ot0 ot0Var = (ot0) this.c;
        AccountManager accountManager = AccountManager.get(t0.b);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("org.telegram.messenger");
            g5Var.a = null;
            int i7 = 0;
            while (i7 < accountsByType.length) {
                Account account = accountsByType[i7];
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        accountArr = accountsByType;
                        break;
                    }
                    TLRPC.User f10 = p10.i(i10).f();
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
            Account account2 = new Account("" + g5Var.getUserConfig().e(), "org.telegram.messenger");
            g5Var.a = account2;
            accountManager.addAccountExplicitly(account2, "", null);
        } catch (Exception unused2) {
        }
        g5Var.getMessagesStorage().Z0(new HashMap(), false, true);
        g5Var.getMessagesStorage().c1(new ArrayList(), true);
        g5Var.a0.clear();
        g5Var.e0.clear();
        g5Var.f0.clear();
        g5Var.g0.clear();
        g5Var.i0.clear();
        g5Var.h0.clear();
        g5Var.b0.clear();
        g5Var.c0.clear();
        g5Var.d0.clear();
        g5Var.x.clear();
        g5Var.j0.clear();
        g5Var.k0.clear();
        g5Var.l0.clear();
        g5Var.getNotificationCenter().k(qs.O, new Object[0]);
        g5Var.A(0L, false);
        ot0Var.run();
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
                qs f10 = qs.f(((d4) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f10.k(30, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                g5 g5Var = (g5) obj2;
                g5Var.D = false;
                SharedPreferences.Editor edit = qp.s1(g5Var.currentAccount).e7.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                g5Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                z5 z5Var = (z5) obj2;
                TLObject tLObject = (TLObject) obj;
                y5 y5Var = z5Var.O;
                y5 y5Var2 = z5Var.N;
                y5 y5Var3 = z5Var.M;
                y5 y5Var4 = z5Var.L;
                y5 y5Var5 = z5Var.K;
                y5 y5Var6 = z5Var.J;
                z5Var.E = false;
                z5Var.getUserConfig().a0 = System.currentTimeMillis();
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
                    SharedPreferences.Editor edit2 = qp.s1(z5Var.currentAccount).e7.edit();
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
                        executeFast.bindInteger(1, ((ij) arrayList2.get(i12)).F0().dc_id);
                        executeFast.bindLong(2, ((ij) arrayList2.get(i12)).F0().id);
                        executeFast.step();
                        try {
                            w7.G(z5Var2.currentAccount);
                            w7.M(((ij) arrayList2.get(i12)).k, false, true).delete();
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
                qp.s1(((w9) obj2).currentAccount).O3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                qp qpVar = (qp) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                gz sendMessagesHelper = qpVar.getSendMessagesHelper();
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
                        org.telegram.ui.Wallet.l0.x(qpVar.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                qp qpVar2 = (qp) obj2;
                qpVar2.getClass();
                id E0 = id.E0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i13 = qpVar2.currentAccount;
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
                id.E0().Z0(((qp) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                return;
            case 8:
                qp qpVar3 = (qp) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                qpVar3.getDownloadController().s(false);
                qpVar3.R2(true);
                qpVar3.M(true);
                qpVar3.i4 = true;
                qpVar3.X2 = tL_config.megagroup_size_max;
                qpVar3.V2 = tL_config.chat_size_max;
                qpVar3.Y2 = tL_config.edit_time_limit;
                qpVar3.Z2 = tL_config.rating_e_decay;
                qpVar3.d3 = tL_config.stickers_recent_limit;
                qpVar3.a3 = tL_config.revoke_time_limit;
                qpVar3.b3 = tL_config.revoke_pm_time_limit;
                qpVar3.c3 = tL_config.revoke_pm_inbox;
                qpVar3.j4 = tL_config.fpnv_allowed;
                String str2 = tL_config.me_url_prefix;
                qpVar3.U2 = str2;
                boolean z9 = tL_config.force_try_ipv6;
                if (str2.endsWith("/")) {
                    qpVar3.U2 = com.google.android.recaptcha.internal.a.k(qpVar3.U2, 1, 0);
                }
                if (qpVar3.U2.startsWith("https://")) {
                    qpVar3.U2 = qpVar3.U2.substring(8);
                } else if (qpVar3.U2.startsWith("http://")) {
                    qpVar3.U2 = qpVar3.U2.substring(7);
                }
                qpVar3.g3 = tL_config.call_receive_timeout_ms;
                qpVar3.h3 = tL_config.call_ring_timeout_ms;
                qpVar3.i3 = tL_config.call_connect_timeout_ms;
                qpVar3.j3 = tL_config.call_packet_timeout_ms;
                qpVar3.t3 = tL_config.message_length_max;
                qpVar3.u3 = tL_config.caption_length_max;
                qpVar3.z3 = tL_config.preload_featured_stickers;
                String str3 = tL_config.gif_search_username;
                if (str3 != null) {
                    qpVar3.K3 = str3;
                }
                if (qpVar3.L3 != null) {
                    qpVar3.L3 = tL_config.img_search_username;
                }
                qpVar3.y3 = tL_config.blocked_mode;
                qpVar3.M3 = tL_config.dc_txt_domain_name;
                qpVar3.N3 = tL_config.webfile_dc_id;
                String str4 = tL_config.suggested_lang_code;
                if (str4 != null) {
                    String str5 = qpVar3.O3;
                    boolean z10 = str5 == null || !str5.equals(str4);
                    qpVar3.O3 = tL_config.suggested_lang_code;
                    if (z10) {
                        id.E0().V0(qpVar3.currentAccount, true);
                    }
                }
                org.telegram.ui.ActionBar.m6.m1(qpVar3.currentAccount, false);
                org.telegram.ui.ActionBar.m6.G(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                qpVar3.s3 = null;
                qpVar3.m3 = 2;
                qpVar3.n3 = 0;
                org.telegram.ui.Cells.f1.u(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i14 = 0; i14 < split.length; i14++) {
                    String[] split2 = split[i14].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i14 == 0) {
                                    if (split2.length > 1) {
                                        qpVar3.m3 = 3;
                                    } else {
                                        qpVar3.m3 = 1;
                                    }
                                }
                                qpVar3.n3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i14 == 0 && split2.length > 1) {
                                    qpVar3.m3 = 4;
                                }
                                qpVar3.n3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i14 == 0) {
                                    qpVar3.m3 = 2;
                                }
                                qpVar3.n3 |= 2;
                            }
                            if (split3.length > 1) {
                                qpVar3.s3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = qpVar3.e7.edit();
                edit3.putBoolean("remoteConfigLoaded", qpVar3.i4);
                edit3.putInt("maxGroupCount", qpVar3.V2);
                edit3.putInt("maxMegagroupCount", qpVar3.X2);
                edit3.putInt("maxEditTime", qpVar3.Y2);
                edit3.putInt("ratingDecay", qpVar3.Z2);
                edit3.putInt("maxRecentGifsCount", qpVar3.f3);
                edit3.putInt("maxRecentStickersCount", qpVar3.d3);
                edit3.putInt("maxFaveStickersCount", qpVar3.e3);
                edit3.putInt("callReceiveTimeout", qpVar3.g3);
                edit3.putInt("callRingTimeout", qpVar3.h3);
                edit3.putInt("callConnectTimeout", qpVar3.i3);
                edit3.putInt("callPacketTimeout", qpVar3.j3);
                edit3.putString("linkPrefix", qpVar3.U2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", qpVar3.k3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", qpVar3.l3);
                edit3.putInt("maxMessageLength", qpVar3.t3);
                edit3.putInt("maxCaptionLength", qpVar3.u3);
                edit3.putBoolean("preloadFeaturedStickers", qpVar3.z3);
                edit3.putInt("revokeTimeLimit", qpVar3.a3);
                edit3.putInt("revokeTimePmLimit", qpVar3.b3);
                edit3.putInt("mapProvider", qpVar3.m3);
                String str6 = qpVar3.s3;
                if (str6 != null) {
                    edit3.putString("pk", str6);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", qpVar3.c3);
                edit3.putBoolean("fpnvAllowed", qpVar3.j4);
                edit3.putBoolean("blockedCountry", qpVar3.y3);
                edit3.putString("gifSearchBot", qpVar3.K3);
                edit3.putString("imageSearchBot", qpVar3.L3);
                edit3.putString("dcDomainName2", qpVar3.M3);
                edit3.putInt("webFileDatacenterId", qpVar3.N3);
                edit3.putString("suggestedLangCode", qpVar3.O3);
                edit3.putBoolean("forceTryIpV6", z9);
                String str7 = tL_config.autologin_token;
                qpVar3.f4 = str7;
                edit3.putString("autologinToken", str7);
                edit3.commit();
                qpVar3.getConnectionsManager().setForceTryIpV6(z9);
                id E02 = id.E0();
                int i15 = qpVar3.currentAccount;
                int i16 = tL_config.lang_pack_version;
                int i17 = tL_config.base_lang_pack_version;
                fd fdVar = E02.B;
                if (fdVar != null && (fdVar.i() || E02.B.j())) {
                    if (E02.B.g()) {
                        if (E02.B.i < i17) {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + E02.B.i + ", remote is " + i17 + ")");
                            E02.P = true;
                            fd fdVar2 = E02.B;
                            E02.f(fdVar2, fdVar2.e, false, i15, new wc(E02, i15, 0));
                        } else {
                            a8.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + E02.B.i + ", remote is " + i17 + ")");
                        }
                    }
                    if (E02.B.h < i16) {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + E02.B.h + ", remote is " + i16 + ")");
                        E02.P = true;
                        fd fdVar3 = E02.B;
                        E02.f(fdVar3, fdVar3.c, false, i15, new wc(E02, i15, 1));
                    } else {
                        a8.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + E02.B.h + ", remote is " + i16 + ")");
                    }
                }
                qpVar3.getNotificationCenter().k(qs.J2, new Object[0]);
                return;
            case 9:
                qp qpVar4 = (qp) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                qpVar4.Y3(tL_messages_invitedUsers.updates.users, false);
                qpVar4.S3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList3 = tL_messages_invitedUsers.updates.chats;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    qpVar4.getNotificationCenter().k(29, new Object[0]);
                    return;
                } else {
                    qpVar4.getNotificationCenter().k(28, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    org.telegram.ui.Components.u4.f(qpVar4.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
            case 10:
                yr yrVar = (yr) obj2;
                ij ijVar = (ij) obj;
                yrVar.getClass();
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(ijVar.k.getObjectSize());
                    ijVar.k.serializeToStream(nativeByteBuffer);
                    int i18 = ijVar.a == 2 ? 1 : 0;
                    if (ijVar.f) {
                        i18 |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = yrVar.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, ij.B0(ijVar.k));
                    executeFast2.bindInteger(2, ijVar.e1());
                    executeFast2.bindLong(3, ijVar.k.random_id);
                    executeFast2.bindInteger(4, ijVar.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = ijVar.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str8 = ijVar.b;
                    if (str8 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str8);
                    }
                    String str9 = ijVar.c;
                    if (str9 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str9);
                    }
                    executeFast2.bindInteger(9, i18);
                    executeFast2.bindLong(10, ij.b2(yrVar.currentAccount, ijVar.k, false, false));
                    executeFast2.bindInteger(11, (ijVar.I ? 1 : 0) + (ijVar.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e12) {
                    yrVar.o(e12, true);
                    return;
                }
            case 11:
                bi.ea.y(((gz) obj2).currentAccount, false).d0((ArrayList) obj);
                return;
            case 12:
                k00 k00Var = (k00) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (xr xrVar : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(xrVar)).intValue();
                    TLRPC.TL_forumTopic f11 = k00Var.f(-xrVar.a, xrVar.b);
                    if (f11 != null) {
                        f11.read_outbox_max_id = Math.max(f11.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-xrVar.a));
                        TLRPC.Message message2 = f11.topMessage;
                        if (message2 != null && f11.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    qs.f(k00Var.currentAccount).k(qs.q5, (Long) it2.next(), Boolean.TRUE);
                }
                return;
            case 13:
                k00 k00Var2 = (k00) obj2;
                List list2 = (List) obj;
                a0.h hVar = k00Var2.e;
                HashSet hashSet2 = new HashSet();
                a0.h hVar2 = null;
                for (int i19 = 0; i19 < list2.size(); i19++) {
                    i00 i00Var = (i00) list2.get(i19);
                    if (i00Var.i) {
                        if (hVar2 == null) {
                            hVar2 = new a0.h();
                        }
                        ArrayList arrayList4 = (ArrayList) hVar2.f(i00Var.b);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            hVar2.k(arrayList4, i00Var.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (t3.o0(k00Var2.currentAccount, i00Var.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = i00Var.c;
                        } else {
                            tL_forumTopic.id = (int) i00Var.c;
                        }
                        arrayList4.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f12 = k00Var2.f(-i00Var.b, i00Var.c);
                        if (f12 != null) {
                            if (i00Var.j) {
                                int i20 = i00Var.e;
                                if (i20 >= 0) {
                                    f12.unread_count = i20;
                                }
                                int i21 = i00Var.d;
                                if (i21 >= 0) {
                                    f12.unread_mentions_count = i21;
                                }
                            } else {
                                hVar.l(k00.p(f12.top_message, -i00Var.b));
                                f12.topMessage = i00Var.g;
                                f12.groupedMessages = i00Var.h;
                                int i22 = i00Var.f;
                                f12.top_message = i22;
                                f12.unread_count = i00Var.e;
                                f12.unread_mentions_count = i00Var.d;
                                hVar.k(f12, k00.p(i22, -i00Var.b));
                            }
                            int i23 = i00Var.a;
                            if (i23 > 0) {
                                f12.totalMessagesCount = i23;
                            }
                            hashSet2.add(Long.valueOf(-i00Var.b));
                        }
                        if (f12 != null && i00Var.k) {
                            f12.totalMessagesCount = 0;
                            k00Var2.k(i00Var.b, i00Var.c);
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    k00Var2.y(((Long) it3.next()).longValue(), true);
                }
                if (hVar2 != null) {
                    for (int i24 = 0; i24 < hVar2.m(); i24++) {
                        k00Var2.v(-hVar2.j(i24), (ArrayList) hVar2.n(i24), null);
                    }
                    return;
                }
                return;
            case 14:
                k00 k00Var3 = (k00) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                k00Var3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getContext());
                String M0 = id.M0(2131748978, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = id.a0(null, null, 2131748948, Integer.valueOf(qp.s1(k00Var3.currentAccount).d5));
                alertDialog$Builder.k(id.M0(2131747831, null), null);
                f2Var.showDialog(u1Var);
                return;
            case 15:
                h1 h1Var = (h1) obj2;
                File file = (File) obj;
                if (file == null) {
                    h1Var.j = false;
                    qs.e().k(qs.Q4, new Object[0]);
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
                qs.e().k(qs.Q4, new Object[0]);
                return;
            case 16:
                v1 v1Var = (v1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i25 = v1Var.a;
                if (tLObject2 instanceof TL_account.contactBirthdays) {
                    v1Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject2;
                    v1Var.c = t1.b(contactbirthdays);
                    qp.s1(i25).Y3(contactbirthdays.users, false);
                    yr.a0(i25).m1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit4 = qp.s1(i25).e7.edit();
                    edit4.putLong("bday_check", v1Var.b);
                    u1 u1Var2 = new u1();
                    u1Var2.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(u1Var2.getObjectSize());
                    u1Var2.serializeToStream(serializedData);
                    edit4.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit4.apply();
                    qs.f(i25).k(qs.g5, new Object[0]);
                    v1Var.e = false;
                    return;
                }
                return;
            case 17:
                ((i3) obj2).a.getMessagesController().P1().k.j((ArrayList) obj);
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
                        g0.h3(new b4(21, q3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                        return;
                    }
                } catch (Exception e15) {
                    e = e15;
                    a8.g(e, true);
                    bitmap = r52;
                    arrayList = r72;
                    g0.h3(new b4(21, q3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
                    return;
                }
                try {
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
                        try {
                            ArrayList arrayList5 = new ArrayList(1);
                            Bitmap d = c8.f0.d(gZIPInputStream, arrayList5);
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
                                g0.h3(new b4(21, q3Var, bitmap != null ? new gg.a(bitmap, 1, arrayList) : null));
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
                ((org.telegram.ui.Components.so) obj2).onError((TLRPC.TL_error) obj);
                return;
            case 23:
                l2.u1 u1Var3 = ((d4) obj2).f;
                u1Var3.b = System.currentTimeMillis();
                u1Var3.c = true;
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
                j1 j1Var = (j1) obj;
                try {
                    if (file2.exists()) {
                        r8 = BitmapFactory.decodeFile(file2.getAbsolutePath());
                    }
                } catch (Exception e17) {
                    a8.g(e17, true);
                }
                g0.h3(new b4(20, j1Var, r8));
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

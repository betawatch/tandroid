// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ee2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ee2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 3;
        byte b4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kk7 f = kk7.f(((je2) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f.k(30, (TLRPC.ChatFull) obj, 0, bool, bool);
                break;
            case 1:
                qu2 qu2Var = (qu2) obj2;
                qu2Var.E = false;
                SharedPreferences.Editor edit = na7.q1(qu2Var.currentAccount).X3.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                qu2Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                break;
            case 2:
                up3 up3Var = (up3) obj2;
                TLObject tLObject = (TLObject) obj;
                tp3 tp3Var = up3Var.P;
                tp3 tp3Var2 = up3Var.O;
                tp3 tp3Var3 = up3Var.N;
                tp3 tp3Var4 = up3Var.M;
                tp3 tp3Var5 = up3Var.L;
                tp3 tp3Var6 = up3Var.K;
                up3Var.F = false;
                up3Var.getUserConfig().b0 = System.currentTimeMillis();
                up3Var.getUserConfig().u(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    tp3Var6.d(autodownloadsettings.low);
                    tp3Var6.e = false;
                    tp3Var5.d(autodownloadsettings.medium);
                    tp3Var4.d(autodownloadsettings.high);
                    int i = 0;
                    while (i < 3) {
                        tp3 tp3Var7 = i == 0 ? tp3Var3 : i == 1 ? tp3Var2 : tp3Var;
                        if (tp3Var7.a(tp3Var6)) {
                            tp3Var7.d(autodownloadsettings.low);
                            tp3Var7.e = false;
                        } else if (tp3Var7.a(tp3Var5)) {
                            tp3Var7.d(autodownloadsettings.medium);
                        } else if (tp3Var7.a(tp3Var4)) {
                            tp3Var7.d(autodownloadsettings.high);
                        }
                        i++;
                    }
                    SharedPreferences.Editor edit2 = na7.q1(up3Var.currentAccount).X3.edit();
                    edit2.putString("mobilePreset", tp3Var3.toString());
                    edit2.putString("wifiPreset", tp3Var2.toString());
                    edit2.putString("roamingPreset", tp3Var.toString());
                    edit2.putString("preset0", tp3Var6.toString());
                    edit2.putString("preset1", tp3Var5.toString());
                    edit2.putString("preset2", tp3Var4.toString());
                    edit2.commit();
                    tp3Var6.toString();
                    tp3Var5.toString();
                    tp3Var4.toString();
                    up3Var.g();
                    break;
                }
                break;
            case 3:
                up3 up3Var2 = (up3) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = up3Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((k27) arrayList.get(i2)).F0().dc_id);
                        executeFast.bindLong(2, ((k27) arrayList.get(i2)).F0().id);
                        executeFast.step();
                        try {
                            ba4.G(up3Var2.currentAccount);
                            ba4.M(((k27) arrayList.get(i2)).k, false, true).delete();
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                    executeFast.dispose();
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 4:
                na7.q1(((kt4) obj2).currentAccount).R3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                break;
            case 5:
                na7 na7Var = (na7) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                z3a sendMessagesHelper = na7Var.getSendMessagesHelper();
                sendMessagesHelper.getClass();
                if (message.reply_markup != null) {
                    List list = (List) sendMessagesHelper.s.remove(message.dialog_id + "_" + message.id);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            sendMessagesHelper.r.remove((String) it.next());
                        }
                    }
                }
                if (!message.out && message.dialog_id == 777000) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                        TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                        if (tL_messageActionWalletTonConnectRequest.accepted || tL_messageActionWalletTonConnectRequest.declined) {
                            c.C(na7Var.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                            break;
                        }
                    }
                }
                break;
            case 6:
                k96 D0 = k96.D0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i3 = ((na7) obj2).currentAccount;
                if (D0.B != null) {
                    String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
                    if (lowerCase.equals(D0.B.c) || lowerCase.equals(D0.B.e)) {
                        D0.b1(D0.B, tL_langPackDifference, i3, false, null);
                        break;
                    }
                }
                break;
            case 7:
                k96.D0().Z0(((na7) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                break;
            case 8:
                na7 na7Var2 = (na7) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                na7Var2.getDownloadController().s(false);
                na7Var2.U2(true);
                na7Var2.I(true);
                na7Var2.C3 = true;
                na7Var2.Q2 = tL_config.megagroup_size_max;
                na7Var2.O2 = tL_config.chat_size_max;
                na7Var2.R2 = tL_config.edit_time_limit;
                na7Var2.S2 = tL_config.rating_e_decay;
                na7Var2.W2 = tL_config.stickers_recent_limit;
                na7Var2.T2 = tL_config.revoke_time_limit;
                na7Var2.U2 = tL_config.revoke_pm_time_limit;
                na7Var2.V2 = tL_config.revoke_pm_inbox;
                na7Var2.D3 = tL_config.fpnv_allowed;
                String str2 = tL_config.me_url_prefix;
                na7Var2.N2 = str2;
                boolean z = tL_config.force_try_ipv6;
                if (str2.endsWith("/")) {
                    na7Var2.N2 = ir2.n(1, 0, na7Var2.N2);
                }
                boolean startsWith = na7Var2.N2.startsWith("https://");
                String str3 = na7Var2.N2;
                if (startsWith) {
                    na7Var2.N2 = str3.substring(8);
                } else if (str3.startsWith("http://")) {
                    na7Var2.N2 = na7Var2.N2.substring(7);
                }
                na7Var2.Z2 = tL_config.call_receive_timeout_ms;
                na7Var2.a3 = tL_config.call_ring_timeout_ms;
                na7Var2.b3 = tL_config.call_connect_timeout_ms;
                na7Var2.c3 = tL_config.call_packet_timeout_ms;
                na7Var2.j3 = tL_config.message_length_max;
                na7Var2.k3 = tL_config.caption_length_max;
                na7Var2.m3 = tL_config.preload_featured_stickers;
                String str4 = tL_config.gif_search_username;
                if (str4 != null) {
                    na7Var2.o3 = str4;
                }
                if (na7Var2.p3 != null) {
                    na7Var2.p3 = tL_config.img_search_username;
                }
                na7Var2.l3 = tL_config.blocked_mode;
                na7Var2.q3 = tL_config.dc_txt_domain_name;
                na7Var2.r3 = tL_config.webfile_dc_id;
                String str5 = tL_config.suggested_lang_code;
                if (str5 != null) {
                    String str6 = na7Var2.s3;
                    Object[] objArr = str6 == null || !str6.equals(str5);
                    na7Var2.s3 = tL_config.suggested_lang_code;
                    if (objArr != false) {
                        k96.D0().V0(na7Var2.currentAccount, true);
                    }
                }
                bkb.k1(na7Var2.currentAccount, false);
                bkb.F(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                na7Var2.i3 = null;
                na7Var2.f3 = 2;
                na7Var2.g3 = 0;
                de9.s(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i4 = 0; i4 < split.length; i4++) {
                    String[] split2 = split[i4].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i4 == 0) {
                                    if (split2.length > 1) {
                                        na7Var2.f3 = 3;
                                    } else {
                                        na7Var2.f3 = 1;
                                    }
                                }
                                na7Var2.g3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i4 == 0 && split2.length > 1) {
                                    na7Var2.f3 = 4;
                                }
                                na7Var2.g3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i4 == 0) {
                                    na7Var2.f3 = 2;
                                }
                                na7Var2.g3 |= 2;
                            }
                            if (split3.length > 1) {
                                na7Var2.i3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = na7Var2.X3.edit();
                edit3.putBoolean("remoteConfigLoaded", na7Var2.C3);
                edit3.putInt("maxGroupCount", na7Var2.O2);
                edit3.putInt("maxMegagroupCount", na7Var2.Q2);
                edit3.putInt("maxEditTime", na7Var2.R2);
                edit3.putInt("ratingDecay", na7Var2.S2);
                edit3.putInt("maxRecentGifsCount", na7Var2.Y2);
                edit3.putInt("maxRecentStickersCount", na7Var2.W2);
                edit3.putInt("maxFaveStickersCount", na7Var2.X2);
                edit3.putInt("callReceiveTimeout", na7Var2.Z2);
                edit3.putInt("callRingTimeout", na7Var2.a3);
                edit3.putInt("callConnectTimeout", na7Var2.b3);
                edit3.putInt("callPacketTimeout", na7Var2.c3);
                edit3.putString("linkPrefix", na7Var2.N2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", na7Var2.d3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", na7Var2.e3);
                edit3.putInt("maxMessageLength", na7Var2.j3);
                edit3.putInt("maxCaptionLength", na7Var2.k3);
                edit3.putBoolean("preloadFeaturedStickers", na7Var2.m3);
                edit3.putInt("revokeTimeLimit", na7Var2.T2);
                edit3.putInt("revokeTimePmLimit", na7Var2.U2);
                edit3.putInt("mapProvider", na7Var2.f3);
                String str7 = na7Var2.i3;
                if (str7 != null) {
                    edit3.putString("pk", str7);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", na7Var2.V2);
                edit3.putBoolean("fpnvAllowed", na7Var2.D3);
                edit3.putBoolean("blockedCountry", na7Var2.l3);
                edit3.putString("gifSearchBot", na7Var2.o3);
                edit3.putString("imageSearchBot", na7Var2.p3);
                edit3.putString("dcDomainName2", na7Var2.q3);
                edit3.putInt("webFileDatacenterId", na7Var2.r3);
                edit3.putString("suggestedLangCode", na7Var2.s3);
                edit3.putBoolean("forceTryIpV6", z);
                String str8 = tL_config.autologin_token;
                na7Var2.z3 = str8;
                edit3.putString("autologinToken", str8);
                edit3.commit();
                na7Var2.getConnectionsManager().setForceTryIpV6(z);
                k96 D02 = k96.D0();
                int i5 = na7Var2.currentAccount;
                int i6 = tL_config.lang_pack_version;
                int i7 = tL_config.base_lang_pack_version;
                i96 i96Var = D02.B;
                if (i96Var != null && (i96Var.i() || D02.B.j())) {
                    if (D02.B.g()) {
                        int i8 = D02.B.i;
                        if (i8 < i7) {
                            fa4.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + i8 + ", remote is " + i7 + ")");
                            D02.P = true;
                            i96 i96Var2 = D02.B;
                            D02.f(i96Var2, i96Var2.e, false, i5, new a96(D02, i5, (byte) 0));
                        } else {
                            fa4.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + i8 + ", remote is " + i7 + ")");
                        }
                    }
                    int i9 = D02.B.h;
                    if (i9 < i6) {
                        fa4.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + i9 + ", remote is " + i6 + ")");
                        D02.P = true;
                        i96 i96Var3 = D02.B;
                        D02.f(i96Var3, i96Var3.c, false, i5, new a96(D02, i5, (byte) 1));
                    } else {
                        fa4.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + i9 + ", remote is " + i6 + ")");
                    }
                }
                na7Var2.getNotificationCenter().k(kk7.I2, new Object[0]);
                break;
            case 9:
                na7 na7Var3 = (na7) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                na7Var3.b4(tL_messages_invitedUsers.updates.users, false);
                na7Var3.V3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList2 = tL_messages_invitedUsers.updates.chats;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    na7Var3.getNotificationCenter().k(28, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    ij.f(na7Var3.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    break;
                } else {
                    na7Var3.getNotificationCenter().k(29, new Object[0]);
                    break;
                }
                break;
            case 10:
                ad7 ad7Var = (ad7) obj2;
                k27 k27Var = (k27) obj;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(k27Var.k.getObjectSize());
                    k27Var.k.serializeToStream(nativeByteBuffer);
                    int i10 = k27Var.a == 2 ? 1 : 0;
                    if (k27Var.f) {
                        i10 |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, k27.B0(k27Var.k));
                    executeFast2.bindInteger(2, k27Var.e1());
                    executeFast2.bindLong(3, k27Var.k.random_id);
                    executeFast2.bindInteger(4, k27Var.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = k27Var.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str9 = k27Var.b;
                    if (str9 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str9);
                    }
                    String str10 = k27Var.c;
                    if (str10 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str10);
                    }
                    executeFast2.bindInteger(9, i10);
                    executeFast2.bindLong(10, k27.b2(ad7Var.currentAccount, k27Var.k, false, false));
                    executeFast2.bindInteger(11, (k27Var.I ? 1 : 0) + (k27Var.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    break;
                } catch (Exception e3) {
                    ad7Var.n(e3, true);
                    return;
                }
            case 11:
                gta.v(((z3a) obj2).currentAccount, false).d0((ArrayList) obj);
                break;
            case 12:
                pub pubVar = (pub) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (zc7 zc7Var : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(zc7Var)).intValue();
                    TLRPC.TL_forumTopic f2 = pubVar.f(-zc7Var.a, zc7Var.b);
                    if (f2 != null) {
                        f2.read_outbox_max_id = Math.max(f2.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-zc7Var.a));
                        TLRPC.Message message2 = f2.topMessage;
                        if (message2 != null && f2.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    kk7.f(pubVar.currentAccount).k(kk7.s5, (Long) it2.next(), Boolean.TRUE);
                }
                break;
            case 13:
                pub pubVar2 = (pub) obj2;
                List list2 = (List) obj;
                vf6 vf6Var = pubVar2.e;
                HashSet hashSet2 = new HashSet();
                vf6 vf6Var2 = null;
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    mub mubVar = (mub) list2.get(i11);
                    if (mubVar.i) {
                        if (vf6Var2 == null) {
                            vf6Var2 = new vf6();
                        }
                        ArrayList arrayList3 = (ArrayList) vf6Var2.f(mubVar.b);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            vf6Var2.k(arrayList3, mubVar.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (hc2.o0(pubVar2.currentAccount, mubVar.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = mubVar.c;
                        } else {
                            tL_forumTopic.id = (int) mubVar.c;
                        }
                        arrayList3.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f3 = pubVar2.f(-mubVar.b, mubVar.c);
                        if (f3 != null) {
                            if (mubVar.j) {
                                int i12 = mubVar.e;
                                if (i12 >= 0) {
                                    f3.unread_count = i12;
                                }
                                int i13 = mubVar.d;
                                if (i13 >= 0) {
                                    f3.unread_mentions_count = i13;
                                }
                            } else {
                                vf6Var.l(pub.p(f3.top_message, -mubVar.b));
                                f3.topMessage = mubVar.g;
                                f3.groupedMessages = mubVar.h;
                                int i14 = mubVar.f;
                                f3.top_message = i14;
                                f3.unread_count = mubVar.e;
                                f3.unread_mentions_count = mubVar.d;
                                vf6Var.k(f3, pub.p(i14, -mubVar.b));
                            }
                            int i15 = mubVar.a;
                            if (i15 > 0) {
                                f3.totalMessagesCount = i15;
                            }
                            hashSet2.add(Long.valueOf(-mubVar.b));
                        }
                        if (f3 != null && mubVar.k) {
                            f3.totalMessagesCount = 0;
                            pubVar2.k(mubVar.b, mubVar.c);
                        }
                    }
                }
                Iterator it3 = hashSet2.iterator();
                while (it3.hasNext()) {
                    pubVar2.y(((Long) it3.next()).longValue(), true);
                }
                if (vf6Var2 != null) {
                    for (int i16 = 0; i16 < vf6Var2.m(); i16++) {
                        pubVar2.v(-vf6Var2.j(i16), (ArrayList) vf6Var2.n(i16), null);
                    }
                    break;
                }
                break;
            case 14:
                pub pubVar3 = (pub) obj2;
                d dVar = (d) obj;
                pubVar3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getContext());
                String M0 = k96.M0(2131748786, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.a0(null, null, 2131748756, Integer.valueOf(na7.q1(pubVar3.currentAccount).k4.p1.f()));
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                dVar.showDialog(hdVar);
                break;
            case 15:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                ic icVar = ((a1) obj2).r2;
                icVar.b.remove(tL_aiComposeTone);
                icVar.d();
                icVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(icVar.a).sendRequest(savetone, null);
                break;
            case 16:
                e0 e0Var = (e0) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.P2(tL_aiComposeTone2.author_id));
                    e0Var.dismiss();
                    break;
                }
                break;
            case 17:
                ((View.OnClickListener) obj).onClick((n5) obj2);
                break;
            case 18:
                a aVar = (a) obj2;
                boolean canScrollVertically = ((tu9) obj).canScrollVertically(-1);
                boolean z2 = !canScrollVertically;
                if (aVar.D1 != z2) {
                    ValueAnimator valueAnimator = aVar.F1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f4 = aVar.E1;
                    aVar.D1 = z2;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, canScrollVertically ? 0.0f : 1.0f);
                    aVar.F1 = ofFloat;
                    ofFloat.addUpdateListener(new q5(aVar, b2));
                    aVar.F1.addListener(new s5(aVar, z2, b4));
                    aVar.F1.setDuration(320L);
                    aVar.F1.setInterpolator(s33.h);
                    aVar.F1.start();
                    break;
                }
                break;
            case 19:
                a aVar2 = (a) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z3 = !canScrollVertically2;
                if (aVar2.D1 != z3) {
                    ValueAnimator valueAnimator2 = aVar2.F1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f5 = aVar2.E1;
                    aVar2.D1 = z3;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f5, canScrollVertically2 ? 0.0f : 1.0f);
                    aVar2.F1 = ofFloat2;
                    ofFloat2.addUpdateListener(new q5(aVar2, b3));
                    aVar2.F1.addListener(new s5(aVar2, z3, null == true ? 1 : 0));
                    aVar2.F1.setDuration(320L);
                    aVar2.F1.setInterpolator(s33.h);
                    aVar2.F1.start();
                    break;
                }
                break;
            case 20:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.d0((d) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 21:
                d dVar2 = (d) obj2;
                d dVar3 = (d) obj;
                Drawable drawable2 = ActionBarLayout.w1;
                if (dVar2 != null) {
                    dVar2.onTransitionAnimationEnd(false, false);
                }
                dVar3.onTransitionAnimationEnd(true, false);
                dVar3.onBecomeFullyVisible();
                break;
            case 22:
                bc bcVar = (bc) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (userFull != null) {
                    bcVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    bcVar.b0 = starrefprogram;
                    if (starrefprogram == null) {
                        bcVar.Z = true;
                        bcVar.b0 = bcVar.D0();
                        bcVar.a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        bcVar.a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = bcVar.b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                bcVar.J0(true);
                break;
            case 23:
                w88 w88Var = (w88) obj;
                if (((boolean[]) obj2)[0]) {
                    w88Var.run();
                    break;
                }
                break;
            case 24:
                ((hs) obj2).b0((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 25:
                o oVar = (o) obj2;
                vt vtVar = (vt) obj;
                sw swVar = oVar.L;
                if (swVar != null) {
                    swVar.a(true);
                }
                if (oVar.O0 == vtVar) {
                    oVar.O0 = null;
                    break;
                }
                break;
            case 26:
                ((o) obj2).T0.d();
                ((AnimatorSet) obj).start();
                break;
            case 27:
                ((gv) obj2).b((SpannableString) obj);
                break;
            case 28:
                i00.a = (AudioManager) ((Context) obj2).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                ((vq2) obj).e();
                break;
            default:
                h30 h30Var = (h30) obj2;
                Throwable th = (Throwable) obj;
                h30Var.getClass();
                h30Var.g(th instanceof Exception ? (Exception) th : new RuntimeException(th));
                break;
        }
    }
}

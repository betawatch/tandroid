package org.telegram.ui;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lx0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r7 == null) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int indexOf;
        int i10;
        int i11;
        int i12 = this.a;
        SQLiteCursor sQLiteCursor = null;
        final int i13 = 1;
        final int i14 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    r10.a(profileActivity.getParentActivity(), 0, tL_username.username, profileActivity.a1 != 0 ? profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1)) : profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.b1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.v0);
                    return;
                } else {
                    org.telegram.ui.Components.tc.b0(tL_error);
                    return;
                }
            case 1:
                int i15 = 2;
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.k31.J(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str, str2, new v10(profileActivity2, i15), null);
                    return;
                }
                return;
            case 2:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj, (TLObject) obj3, (String) obj2);
                return;
            case 3:
                TLObject tLObject2 = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                ProfileActivity profileActivity3 = ((dz0) obj4).b;
                profileActivity3.j0.Y0--;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    profileActivity3.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity3.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity3.j0.R0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity4 = ((oz0) obj4).c.e;
                profileActivity4.M4(null);
                if (!(tLObject3 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.tc.b0(tL_error2);
                    return;
                }
                TLObject user2 = profileActivity4.a1 != 0 ? profileActivity4.getMessagesController().getUser(Long.valueOf(profileActivity4.a1)) : profileActivity4.getMessagesController().getChat(Long.valueOf(profileActivity4.b1));
                if (profileActivity4.getParentActivity() == null) {
                    return;
                }
                r10.a(profileActivity4.getParentActivity(), 0, tL_username2.username, user2, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity4.v0);
                return;
            case 5:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj2;
                sessionsActivity.getClass();
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error3 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    n71 n71Var = sessionsActivity.a;
                    if (n71Var != null) {
                        n71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj2;
                sessionsActivity2.getClass();
                try {
                    c2Var2.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error4 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    n71 n71Var2 = sessionsActivity2.a;
                    if (n71Var2 != null) {
                        n71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                m71 m71Var = (m71) obj4;
                m71Var.a = (TLObject) obj3;
                m71Var.b = (TLRPC.TL_error) obj;
                ((i9) obj2).run();
                return;
            case 8:
                b81.b0((b81) obj4, (TLRPC.TL_error) obj, (TLObject) obj3, (String) obj2);
                return;
            case 9:
                e91 e91Var = (e91) obj4;
                uf.b bVar = (uf.b) obj3;
                String str3 = (String) obj2;
                s91 s91Var = (s91) obj;
                t91 t91Var = e91Var.w;
                if (bVar != null) {
                    t91Var.R.put(str3, bVar);
                }
                if (bVar != null && !s91Var.b && (i10 = s91Var.a) >= 0) {
                    View m10 = t91Var.Q.m(i10);
                    if (m10 instanceof e91) {
                        e91Var.r.e = bVar;
                        e91 e91Var2 = (e91) m10;
                        e91Var2.b.p0.d(false, false);
                        e91Var2.g(false);
                    }
                }
                t91.Z(t91Var);
                return;
            case 10:
                f91 f91Var = (f91) obj4;
                f91Var.k = false;
                f91Var.d = (uf.b) obj3;
                f91Var.g = (String) obj2;
                d91 d91Var = (d91) ((Utilities.Callback0Return) obj).run();
                if (d91Var != null) {
                    d91Var.e(f91Var, true);
                    return;
                }
                return;
            case 11:
                TLObject tLObject4 = (TLObject) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj;
                td1 td1Var = ((pd1) obj4).a;
                if (tLObject4 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i16);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = td1Var.getMessagesController().getPeer(td1Var.a);
                            tL_messageService.dialog_id = td1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                            arrayList2.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = td1Var.getMessagesController().getChat(Long.valueOf(-td1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j10 = td1Var.b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = td1Var.getMessagesController().getPeer(td1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = td1Var.A;
                            tn tnVar = td1Var.y;
                            if (tnVar != null) {
                                tnVar.La();
                                tnVar.Pa();
                                tnVar.pb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                tnVar.c = true;
                                tnVar.r8();
                                tnVar.Nc(true);
                                tnVar.W0.n(true);
                                tnVar.Tc();
                                tnVar.N1.setCurrentTopic(tnVar.b());
                                tnVar.Qc(true);
                                tnVar.hc(true);
                                tnVar.e9(true);
                                tnVar.A6(true, true);
                                tnVar.Ea();
                                td1Var.getMessagesController().getTopicsController().onTopicCreated(td1Var.a, tL_forumTopic, true);
                                td1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -td1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                tn tnVar2 = new tn(bundle);
                                tnVar2.pb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                tnVar2.c = true;
                                td1Var.getMessagesController().getTopicsController().onTopicCreated(td1Var.a, tL_forumTopic, true);
                                td1Var.presentFragment(tnVar2);
                            }
                        }
                    }
                }
                c2Var3.dismiss();
                return;
            case 12:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj2, (TLObject) obj3, (byte[]) obj);
                return;
            case 13:
                cg1 cg1Var = (cg1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    cg1Var.u0(new t31(21, cg1Var, str5));
                    return;
                }
                if (tL_error5 == null || tL_error5.text.startsWith("CODE_INVALID")) {
                    cg1Var.y0();
                    return;
                } else if (!tL_error5.text.startsWith("FLOOD_WAIT")) {
                    cg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error5.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error5.text).intValue();
                    cg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            case 14:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    z0Var.v("file_download_requested", org.telegram.ui.web.z0.x("cancelled", "status"));
                    return;
                }
                Context context = z0Var.getContext();
                String userName = UserObject.getUserName(z0Var.Q);
                final ih.i iVar = new ih.i(z0Var, str6, str7, 12);
                HashMap hashMap = ph.h0.g;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String string = LocaleController.getString(R.string.BotDownloadFileTitle);
                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder.a;
                c2Var4.N = string;
                c2Var4.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(44.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
                imageView.setImageResource(R.drawable.msg_round_file_s);
                linearLayout.addView(imageView, i7.f6.t(44, 44, 19, 0, 0, 10, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                TextView h = org.telegram.messenger.x3.h(context, 1, 15.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setText(str7);
                h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n5, false));
                linearLayout2.addView(h, i7.f6.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
                o6Var.setTextSize(AndroidUtilities.dp(12.0f));
                SpannableString spannableString = new SpannableString("l");
                org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(AndroidUtilities.dp(55.0f), o6Var);
                int i17 = org.telegram.ui.ActionBar.g6.Ed;
                d90Var.a(org.telegram.ui.ActionBar.g6.l1(0.35f, org.telegram.ui.ActionBar.g6.w0(null, i17, false)), org.telegram.ui.ActionBar.g6.l1(0.075f, org.telegram.ui.ActionBar.g6.w0(null, i17, false)));
                spannableString.setSpan(d90Var, 0, 1, 33);
                o6Var.setText(spannableString);
                nh.t4 t4Var = new nh.t4(o6Var, 9);
                HashMap hashMap2 = ph.h0.h;
                if (hashMap2.containsKey(str6)) {
                    Pair pair = (Pair) hashMap2.get(str6);
                    t4Var.run((String) pair.first, (Long) pair.second);
                } else {
                    new ph.b0(str6, t4Var).execute(str6);
                }
                o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                linearLayout2.addView(o6Var, i7.f6.n(-1, 15));
                linearLayout.addView(linearLayout2, i7.f6.t(-1, -2, 23, 0, 0, 0, 2));
                alertDialog$Builder.n(linearLayout);
                final boolean[] zArr = new boolean[1];
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: ph.a0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var5, int i18) {
                        switch (i14) {
                            case 0:
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    iVar.run(Boolean.FALSE);
                                    zArr2[0] = true;
                                    break;
                                }
                                break;
                            default:
                                boolean[] zArr3 = zArr;
                                if (!zArr3[0]) {
                                    iVar.run(Boolean.TRUE);
                                    zArr3[0] = true;
                                    break;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.b2() { // from class: ph.a0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var5, int i18) {
                        switch (i13) {
                            case 0:
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    iVar.run(Boolean.FALSE);
                                    zArr2[0] = true;
                                    break;
                                }
                                break;
                            default:
                                boolean[] zArr3 = zArr;
                                if (!zArr3[0]) {
                                    iVar.run(Boolean.TRUE);
                                    zArr3[0] = true;
                                    break;
                                }
                                break;
                        }
                    }
                });
                c2Var4.setOnDismissListener(new eg.g(15, zArr, iVar));
                c2Var4.show();
                return;
            case 15:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                ph.j1 j1Var = (ph.j1) obj;
                ((nh.d) obj4).setLoading(false);
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    f3Var.dismiss();
                    j1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 16:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new org.telegram.ui.Components.tc(((org.telegram.ui.ActionBar.f3) obj3).topBulletinContainer, (org.telegram.ui.ActionBar.c6) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ph.j.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                return;
            case 17:
                ph.d3.x0((ph.d3) obj4, (Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                return;
            case 18:
                boolean[] zArr2 = (boolean[]) obj4;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    sVar.run(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                sVar.run(Boolean.TRUE, "allowed");
                return;
            case 19:
                rf.c cVar = (rf.c) obj4;
                Location location = (Location) obj3;
                String str8 = (String) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = cVar.r;
                cVar.n = false;
                if (location == null) {
                    cVar.B = 0;
                    cVar.h = false;
                    cVar.s.clear();
                    cVar.F = false;
                    cVar.x = str8;
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                cVar.l();
                return;
            case 20:
                rf.c cVar2 = (rf.c) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                String str9 = (String) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                ArrayList arrayList5 = cVar2.s;
                if (tL_error6 == null) {
                    cVar2.B = 0;
                    cVar2.h = false;
                    arrayList5.clear();
                    cVar2.F = false;
                    cVar2.x = str9;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    int size = messages_botresults.results.size();
                    while (i14 < size) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i14);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a4.w.q(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList5.add(tL_messageMediaVenue);
                            }
                        }
                        i14++;
                    }
                }
                rf.b bVar2 = cVar2.y;
                if (bVar2 != null) {
                    bVar2.a(arrayList5);
                }
                cVar2.l();
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new lx0((rf.l) obj4, (Runnable) obj2, (ArrayList) obj, f2.q.c((org.telegram.ui.Components.mx) obj3, true), 22));
                return;
            case 22:
                rf.l lVar = (rf.l) obj4;
                Runnable runnable = (Runnable) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                f2.m mVar = (f2.m) obj;
                if (lVar.V) {
                    lVar.V = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    lVar.I = arrayList6;
                    mVar.b(lVar);
                    if (lVar.W) {
                        lVar.W = false;
                        lVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                sf.u uVar = (sf.u) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = uVar.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf2 = arrayList7.indexOf(tL_businessChatLink);
                    if (indexOf2 != -1) {
                        arrayList7.set(indexOf2, tL_businessChatLink2);
                        NotificationCenter.getInstance(uVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        uVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                sf.s1 s1Var = (sf.s1) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                sf.r1 r1Var = (sf.r1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(r1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    break;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new lx0(s1Var, arrayList8, r1Var, tL_messages_sendQuickReplyMessages, 25));
                return;
            case 25:
                sf.s1 s1Var2 = (sf.s1) obj4;
                ArrayList<Integer> arrayList9 = (ArrayList) obj3;
                sf.r1 r1Var2 = (sf.r1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i18 = s1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < r1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = r1Var2.a;
                    ConnectionsManager.getInstance(i18).sendRequest(tL_messages_getQuickReplyMessages, new eg.z(s1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 27));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    while (i14 < arrayList9.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(i18).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            default:
                ((th.p) obj4).r.V4((th.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.j70) obj).u();
                return;
        }
    }

    public /* synthetic */ lx0(Object obj, Object obj2, TLRPC.TL_error tL_error, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = tL_error;
        this.d = obj3;
    }

    public /* synthetic */ lx0(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.s sVar, TLRPC.UserFull userFull) {
        this.a = 18;
        this.c = tLObject;
        this.b = zArr;
        this.d = sVar;
        this.e = userFull;
    }

    public /* synthetic */ lx0(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = o2Var;
        this.e = tL_error;
        this.c = tLObject;
        this.d = str;
    }

    public /* synthetic */ lx0(TwoStepVerificationActivity twoStepVerificationActivity, byte[] bArr, TLObject tLObject, byte[] bArr2) {
        this.a = 12;
        this.b = twoStepVerificationActivity;
        this.d = bArr;
        this.c = tLObject;
        this.e = bArr2;
    }

    public /* synthetic */ lx0(rf.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.a = 20;
        this.b = cVar;
        this.e = tL_error;
        this.d = str;
        this.c = tLObject;
    }
}

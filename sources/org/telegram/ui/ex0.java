package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ex0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        if (r7 == null) goto L39;
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
        int i13 = 24;
        SQLiteCursor sQLiteCursor = null;
        final int i14 = 1;
        final int i15 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (!zArr[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                        return;
                    }
                    return;
                }
                int i16 = Build.VERSION.SDK_INT;
                Uri d = i16 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                Intent intent = new Intent("android.intent.action.SEND");
                if (i16 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", d);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.mc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.k4 == iArr[0]) {
                    profileActivity.k4 = 0;
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    s10.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.a1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.a1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.b1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity2.v0);
                    return;
                } else {
                    org.telegram.ui.Components.mc.b0(tL_error2);
                    return;
                }
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.b31.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new w10(profileActivity3, 2), null);
                    return;
                }
                return;
            case 4:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 5:
                TLObject tLObject2 = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((dz0) obj4).b;
                profileActivity4.j0.Y0--;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity4.j0.R0;
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
            case 6:
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((oz0) obj4).c.e;
                profileActivity5.M4(null);
                if (!(tLObject3 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.mc.b0(tL_error3);
                    return;
                }
                TLObject user2 = profileActivity5.a1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.a1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.b1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                s10.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user2, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity5.v0);
                return;
            case 7:
                SessionsActivity sessionsActivity = (SessionsActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    b2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    j71 j71Var = sessionsActivity.a;
                    if (j71Var != null) {
                        j71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj3;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    b2Var2.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    j71 j71Var2 = sessionsActivity2.a;
                    if (j71Var2 != null) {
                        j71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                i71 i71Var = (i71) obj4;
                i71Var.a = (TLObject) obj3;
                i71Var.b = (TLRPC.TL_error) obj2;
                ((k9) obj).run();
                return;
            case 10:
                x71.b0((x71) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 11:
                b91 b91Var = (b91) obj4;
                sf.b bVar = (sf.b) obj3;
                String str3 = (String) obj2;
                p91 p91Var = (p91) obj;
                q91 q91Var = b91Var.w;
                if (bVar != null) {
                    q91Var.R.put(str3, bVar);
                }
                if (bVar != null && !p91Var.b && (i10 = p91Var.a) >= 0) {
                    View m10 = q91Var.Q.m(i10);
                    if (m10 instanceof b91) {
                        b91Var.r.e = bVar;
                        b91 b91Var2 = (b91) m10;
                        b91Var2.b.p0.d(false, false);
                        b91Var2.g(false);
                    }
                }
                q91.Z(q91Var);
                return;
            case 12:
                c91 c91Var = (c91) obj4;
                c91Var.k = false;
                c91Var.d = (sf.b) obj3;
                c91Var.g = (String) obj2;
                a91 a91Var = (a91) ((Utilities.Callback0Return) obj).run();
                if (a91Var != null) {
                    a91Var.e(c91Var, true);
                    return;
                }
                return;
            case 13:
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj4;
                sd1 sd1Var = ((od1) obj3).a;
                if (tLObject4 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    for (int i17 = 0; i17 < updates.updates.size(); i17++) {
                        if (updates.updates.get(i17) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i17);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = sd1Var.getMessagesController().getPeer(sd1Var.a);
                            tL_messageService.dialog_id = sd1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount;
                            arrayList2.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = sd1Var.getMessagesController().getChat(Long.valueOf(-sd1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j10 = sd1Var.b;
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
                            tL_forumTopic.from_id = sd1Var.getMessagesController().getPeer(sd1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = sd1Var.A;
                            rn rnVar = sd1Var.y;
                            if (rnVar != null) {
                                rnVar.La();
                                rnVar.Pa();
                                rnVar.pb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                rnVar.c = true;
                                rnVar.r8();
                                rnVar.Nc(true);
                                rnVar.W0.n(true);
                                rnVar.Tc();
                                rnVar.N1.setCurrentTopic(rnVar.b());
                                rnVar.Qc(true);
                                rnVar.hc(true);
                                rnVar.e9(true);
                                rnVar.A6(true, true);
                                rnVar.Ea();
                                sd1Var.getMessagesController().getTopicsController().onTopicCreated(sd1Var.a, tL_forumTopic, true);
                                sd1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -sd1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                rn rnVar2 = new rn(bundle);
                                rnVar2.pb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                rnVar2.c = true;
                                sd1Var.getMessagesController().getTopicsController().onTopicCreated(sd1Var.a, tL_forumTopic, true);
                                sd1Var.presentFragment(rnVar2);
                            }
                        }
                    }
                }
                b2Var3.dismiss();
                return;
            case 14:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 15:
                zf1 zf1Var = (zf1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    zf1Var.u0(new m21(i13, zf1Var, str5));
                    return;
                }
                if (tL_error6 == null || tL_error6.text.startsWith("CODE_INVALID")) {
                    zf1Var.y0();
                    return;
                } else if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                    zf1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                    zf1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            case 16:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    z0Var.v("file_download_requested", org.telegram.ui.web.z0.x("cancelled", "status"));
                    return;
                }
                Context context = z0Var.getContext();
                String userName = UserObject.getUserName(z0Var.Q);
                final gh.i iVar = new gh.i(z0Var, str6, str7, 12);
                HashMap hashMap = nh.j0.g;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String string = LocaleController.getString(R.string.BotDownloadFileTitle);
                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.a;
                b2Var4.N = string;
                b2Var4.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(44.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
                imageView.setImageResource(R.drawable.msg_round_file_s);
                linearLayout.addView(imageView, h7.z5.t(44, 44, 19, 0, 0, 10, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                TextView h = org.telegram.messenger.y1.h(context, 1, 15.0f);
                h.setTypeface(AndroidUtilities.bold());
                h.setText(str7);
                h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n5, false));
                linearLayout2.addView(h, h7.z5.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
                j6Var.setTextSize(AndroidUtilities.dp(12.0f));
                SpannableString spannableString = new SpannableString("l");
                org.telegram.ui.Components.u80 u80Var = new org.telegram.ui.Components.u80(AndroidUtilities.dp(55.0f), j6Var);
                int i18 = org.telegram.ui.ActionBar.g6.Ed;
                u80Var.a(org.telegram.ui.ActionBar.g6.l1(0.35f, org.telegram.ui.ActionBar.g6.w0(null, i18, false)), org.telegram.ui.ActionBar.g6.l1(0.075f, org.telegram.ui.ActionBar.g6.w0(null, i18, false)));
                spannableString.setSpan(u80Var, 0, 1, 33);
                j6Var.setText(spannableString);
                lh.a8 a8Var = new lh.a8(j6Var, 7);
                HashMap hashMap2 = nh.j0.h;
                if (hashMap2.containsKey(str6)) {
                    Pair pair = (Pair) hashMap2.get(str6);
                    a8Var.run((String) pair.first, (Long) pair.second);
                } else {
                    new nh.c0(str6, a8Var).execute(str6);
                }
                j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                linearLayout2.addView(j6Var, h7.z5.n(-1, 15));
                linearLayout.addView(linearLayout2, h7.z5.t(-1, -2, 23, 0, 0, 0, 2));
                alertDialog$Builder.n(linearLayout);
                final boolean[] zArr2 = new boolean[1];
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() { // from class: nh.b0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i19) {
                        switch (i15) {
                            case 0:
                                boolean[] zArr3 = zArr2;
                                if (!zArr3[0]) {
                                    iVar.run(Boolean.FALSE);
                                    zArr3[0] = true;
                                    break;
                                }
                                break;
                            default:
                                boolean[] zArr4 = zArr2;
                                if (!zArr4[0]) {
                                    iVar.run(Boolean.TRUE);
                                    zArr4[0] = true;
                                    break;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.a2() { // from class: nh.b0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var5, int i19) {
                        switch (i14) {
                            case 0:
                                boolean[] zArr3 = zArr2;
                                if (!zArr3[0]) {
                                    iVar.run(Boolean.FALSE);
                                    zArr3[0] = true;
                                    break;
                                }
                                break;
                            default:
                                boolean[] zArr4 = zArr2;
                                if (!zArr4[0]) {
                                    iVar.run(Boolean.TRUE);
                                    zArr4[0] = true;
                                    break;
                                }
                                break;
                        }
                    }
                });
                b2Var4.setOnDismissListener(new cg.g(2, zArr2, iVar));
                b2Var4.show();
                return;
            case 17:
                pf.c cVar = (pf.c) obj4;
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
            case 18:
                pf.c cVar2 = (pf.c) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                String str9 = (String) obj2;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList5 = cVar2.s;
                if (tL_error7 == null) {
                    cVar2.B = 0;
                    cVar2.h = false;
                    arrayList5.clear();
                    cVar2.F = false;
                    cVar2.x = str9;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    int size = messages_botresults.results.size();
                    while (i15 < size) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i15);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a9.p.p(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList5.add(tL_messageMediaVenue);
                            }
                        }
                        i15++;
                    }
                }
                pf.b bVar2 = cVar2.y;
                if (bVar2 != null) {
                    bVar2.a(arrayList5);
                }
                cVar2.l();
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ex0((pf.k) obj4, (Runnable) obj2, (ArrayList) obj, f2.q.c((org.telegram.ui.Components.fx) obj3, true), 20));
                return;
            case 20:
                pf.k kVar = (pf.k) obj4;
                Runnable runnable = (Runnable) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                f2.m mVar = (f2.m) obj;
                if (kVar.V) {
                    kVar.V = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    kVar.I = arrayList6;
                    mVar.b(kVar);
                    if (kVar.W) {
                        kVar.W = false;
                        kVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                qf.v vVar = (qf.v) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList7 = vVar.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf2 = arrayList7.indexOf(tL_businessChatLink);
                    if (indexOf2 != -1) {
                        arrayList7.set(indexOf2, tL_businessChatLink2);
                        NotificationCenter.getInstance(vVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        vVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                qf.q1 q1Var = (qf.q1) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                qf.p1 p1Var = (qf.p1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                ArrayList arrayList8 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(p1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList8.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Throwable th) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    break;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new ex0(q1Var, arrayList8, p1Var, tL_messages_sendQuickReplyMessages, 23));
                return;
            case 23:
                qf.q1 q1Var2 = (qf.q1) obj4;
                ArrayList<Integer> arrayList9 = (ArrayList) obj3;
                qf.p1 p1Var2 = (qf.p1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i19 = q1Var2.a;
                if (arrayList9.isEmpty() || arrayList9.size() < p1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = p1Var2.a;
                    ConnectionsManager.getInstance(i19).sendRequest(tL_messages_getQuickReplyMessages, new cg.y(q1Var2, arrayList9, tL_messages_sendQuickReplyMessages2, 27));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList9;
                    while (i15 < arrayList9.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i15++;
                    }
                    ConnectionsManager.getInstance(i19).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 24:
                ((rh.p) obj4).r.V4((rh.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.b70) obj).u();
                return;
            case 25:
                zf.n2 n2Var = (zf.n2) obj4;
                n2Var.C = true;
                n2Var.D = (zf.k2[]) ((ArrayList) obj3).toArray(new zf.k2[0]);
                ((nq0) obj2).run((zf.k2) obj);
                return;
            default:
                zf.n2 n2Var2 = (zf.n2) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                zf.l2 l2Var = (zf.l2) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                if (!(tLObject7 instanceof TLRPC.TL_messageMediaDocument)) {
                    n2Var2.h();
                    n2Var2.n(tL_error8);
                    return;
                }
                n2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                l2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.c);
                l2Var.f = tL_messageMediaDocument;
                n2Var2.a();
                return;
        }
    }

    public /* synthetic */ ex0(SessionsActivity sessionsActivity, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = sessionsActivity;
        this.b = b2Var;
        this.d = tL_error;
        this.e = tLObject;
    }

    public /* synthetic */ ex0(od1 od1Var, TLObject tLObject, String str, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = 13;
        this.c = od1Var;
        this.d = tLObject;
        this.e = str;
        this.b = b2Var;
    }
}

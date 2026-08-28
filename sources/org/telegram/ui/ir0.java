package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import org.telegram.messenger.MessagesController;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ir0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
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
        int i9;
        int i10;
        int i11 = this.a;
        int i12 = 24;
        SQLiteCursor sQLiteCursor = null;
        final int i13 = 1;
        final int i14 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer = ((pr0) obj4).b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i15 = photoViewer.P;
                    ArrayList arrayList = photoViewer.b7;
                    MessagesController.getInstance(i15).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
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
            case 1:
                pv0.T((pv0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 2:
                PrivacyControlActivity.U((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (boolean[]) obj);
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.M = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
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
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.oc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.k4 == iArr[0]) {
                    profileActivity.k4 = 0;
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    p10.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.a1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.a1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.b1)), (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.v0);
                    return;
                } else {
                    org.telegram.ui.Components.oc.b0(tL_error2);
                    return;
                }
            case 7:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.z21.J(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new t10(profileActivity3, 2), null);
                    return;
                }
                return;
            case 8:
                ProfileActivity.m0((ProfileActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 9:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((dz0) obj4).b;
                profileActivity4.j0.Y0--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.j0.R0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((oz0) obj4).c.e;
                profileActivity5.M4(null);
                if (!(tLObject5 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.oc.b0(tL_error3);
                    return;
                }
                TLObject user3 = profileActivity5.a1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.a1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.b1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                p10.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user3, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.v0);
                return;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    c2Var2.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.l0();
                    k71 k71Var = sessionsActivity.a;
                    if (k71Var != null) {
                        k71Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    c2Var3.dismiss();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.l0();
                    k71 k71Var2 = sessionsActivity2.a;
                    if (k71Var2 != null) {
                        k71Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                j71 j71Var = (j71) obj4;
                j71Var.a = (TLObject) obj3;
                j71Var.b = (TLRPC.TL_error) obj2;
                ((j9) obj).run();
                return;
            case 14:
                z71.a0((z71) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 15:
                d91 d91Var = (d91) obj4;
                rf.b bVar = (rf.b) obj3;
                String str3 = (String) obj2;
                r91 r91Var = (r91) obj;
                s91 s91Var = d91Var.w;
                if (bVar != null) {
                    s91Var.R.put(str3, bVar);
                }
                if (bVar != null && !r91Var.b && (i9 = r91Var.a) >= 0) {
                    View m10 = s91Var.Q.m(i9);
                    if (m10 instanceof d91) {
                        d91Var.r.e = bVar;
                        d91 d91Var2 = (d91) m10;
                        d91Var2.b.p0.d(false, false);
                        d91Var2.g(false);
                    }
                }
                s91.Y(s91Var);
                return;
            case 16:
                e91 e91Var = (e91) obj4;
                e91Var.k = false;
                e91Var.d = (rf.b) obj3;
                e91Var.g = (String) obj2;
                c91 c91Var = (c91) ((Utilities.Callback0Return) obj).run();
                if (c91Var != null) {
                    c91Var.e(e91Var, true);
                    return;
                }
                return;
            case 17:
                TLObject tLObject6 = (TLObject) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj;
                rd1 rd1Var = ((nd1) obj4).a;
                if (tLObject6 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                    for (int i17 = 0; i17 < updates.updates.size(); i17++) {
                        if (updates.updates.get(i17) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i17);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = rd1Var.getMessagesController().getPeer(rd1Var.a);
                            tL_messageService.dialog_id = rd1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i10 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
                            arrayList3.add(new MessageObject(i10, tL_messageService, false, false));
                            TLRPC.Chat chat = rd1Var.getMessagesController().getChat(Long.valueOf(-rd1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j10 = rd1Var.b;
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
                            tL_forumTopic.from_id = rd1Var.getMessagesController().getPeer(rd1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = rd1Var.A;
                            qn qnVar = rd1Var.y;
                            if (qnVar != null) {
                                qnVar.La();
                                qnVar.Pa();
                                qnVar.pb(arrayList3, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                qnVar.c = true;
                                qnVar.r8();
                                qnVar.Nc(true);
                                qnVar.W0.n(true);
                                qnVar.Tc();
                                qnVar.N1.setCurrentTopic(qnVar.b());
                                qnVar.Qc(true);
                                qnVar.hc(true);
                                qnVar.e9(true);
                                qnVar.A6(true, true);
                                qnVar.Ea();
                                rd1Var.getMessagesController().getTopicsController().onTopicCreated(rd1Var.a, tL_forumTopic, true);
                                rd1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -rd1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                qn qnVar2 = new qn(bundle);
                                qnVar2.pb(arrayList3, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                qnVar2.c = true;
                                rd1Var.getMessagesController().getTopicsController().onTopicCreated(rd1Var.a, tL_forumTopic, true);
                                rd1Var.presentFragment(qnVar2);
                            }
                        }
                    }
                }
                c2Var4.dismiss();
                return;
            case 18:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj4, (byte[]) obj2, (TLObject) obj3, (byte[]) obj);
                return;
            case 19:
                ag1 ag1Var = (ag1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    ag1Var.t0(new n21(i12, ag1Var, str5));
                    return;
                }
                if (tL_error6 == null || tL_error6.text.startsWith("CODE_INVALID")) {
                    ag1Var.x0();
                    return;
                } else if (!tL_error6.text.startsWith("FLOOD_WAIT")) {
                    ag1Var.F0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                    ag1Var.F0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            case 20:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    y0Var.v("file_download_requested", org.telegram.ui.web.y0.x("cancelled", "status"));
                    return;
                }
                Context context = y0Var.getContext();
                String userName = UserObject.getUserName(y0Var.Q);
                final fh.i iVar = new fh.i(y0Var, str6, str7, 12);
                HashMap hashMap = mh.k0.g;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String string = LocaleController.getString(R.string.BotDownloadFileTitle);
                org.telegram.ui.ActionBar.c2 c2Var5 = alertDialog$Builder.a;
                c2Var5.N = string;
                c2Var5.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(44.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
                imageView.setImageResource(R.drawable.msg_round_file_s);
                linearLayout.addView(imageView, g7.e6.t(44, 44, 19, 0, 0, 10, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 15.0f);
                g10.setTypeface(AndroidUtilities.bold());
                g10.setText(str7);
                g10.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n5, false));
                linearLayout2.addView(g10, g7.e6.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
                j6Var.setTextSize(AndroidUtilities.dp(12.0f));
                SpannableString spannableString = new SpannableString("l");
                org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80(AndroidUtilities.dp(55.0f), j6Var);
                int i18 = org.telegram.ui.ActionBar.f6.Ed;
                q80Var.a(org.telegram.ui.ActionBar.f6.l1(0.35f, org.telegram.ui.ActionBar.f6.w0(null, i18, false)), org.telegram.ui.ActionBar.f6.l1(0.075f, org.telegram.ui.ActionBar.f6.w0(null, i18, false)));
                spannableString.setSpan(q80Var, 0, 1, 33);
                j6Var.setText(spannableString);
                kh.b8 b8Var = new kh.b8(j6Var, 7);
                HashMap hashMap2 = mh.k0.h;
                if (hashMap2.containsKey(str6)) {
                    Pair pair = (Pair) hashMap2.get(str6);
                    b8Var.run((String) pair.first, (Long) pair.second);
                } else {
                    new mh.e0(str6, b8Var).execute(str6);
                }
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                linearLayout2.addView(j6Var, g7.e6.n(-1, 15));
                linearLayout.addView(linearLayout2, g7.e6.t(-1, -2, 23, 0, 0, 0, 2));
                alertDialog$Builder.n(linearLayout);
                final boolean[] zArr2 = new boolean[1];
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: mh.d0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var6, int i19) {
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
                alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.b2() { // from class: mh.d0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var6, int i19) {
                        switch (i13) {
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
                c2Var5.setOnDismissListener(new bg.j(2, zArr2, iVar));
                c2Var5.show();
                return;
            case 21:
                pf.u uVar = (pf.u) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList4 = uVar.b;
                if (tLObject7 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject7;
                    int indexOf3 = arrayList4.indexOf(tL_businessChatLink);
                    if (indexOf3 != -1) {
                        arrayList4.set(indexOf3, tL_businessChatLink2);
                        NotificationCenter.getInstance(uVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable != null) {
                            runnable.run();
                        }
                        uVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                pf.r1 r1Var = (pf.r1) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                pf.q1 q1Var = (pf.q1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                ArrayList arrayList5 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(q1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList5.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Throwable th) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    FileLog.e(e14);
                    break;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new ir0(r1Var, arrayList5, q1Var, tL_messages_sendQuickReplyMessages, 23));
                return;
            case 23:
                pf.r1 r1Var2 = (pf.r1) obj4;
                ArrayList<Integer> arrayList6 = (ArrayList) obj3;
                pf.q1 q1Var2 = (pf.q1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i19 = r1Var2.a;
                if (arrayList6.isEmpty() || arrayList6.size() < q1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = q1Var2.a;
                    ConnectionsManager.getInstance(i19).sendRequest(tL_messages_getQuickReplyMessages, new bg.b0(r1Var2, arrayList6, tL_messages_sendQuickReplyMessages2, 27));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList6;
                    while (i14 < arrayList6.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(i19).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 24:
                ((qh.p) obj4).r.V4((qh.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.x60) obj).u();
                return;
            case 25:
                yf.m2 m2Var = (yf.m2) obj4;
                m2Var.C = true;
                m2Var.D = (yf.j2[]) ((ArrayList) obj3).toArray(new yf.j2[0]);
                ((mq0) obj2).run((yf.j2) obj);
                return;
            default:
                yf.m2 m2Var2 = (yf.m2) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                yf.k2 k2Var = (yf.k2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (!(tLObject8 instanceof TLRPC.TL_messageMediaDocument)) {
                    m2Var2.h();
                    m2Var2.n(tL_error7);
                    return;
                }
                m2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                k2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, k2Var.c);
                k2Var.f = tL_messageMediaDocument;
                m2Var2.a();
                return;
        }
    }

    public /* synthetic */ ir0(org.telegram.ui.ActionBar.o2 o2Var, Object obj, TLObject tLObject, Object obj2, int i9) {
        this.a = i9;
        this.c = o2Var;
        this.d = obj;
        this.b = tLObject;
        this.e = obj2;
    }
}

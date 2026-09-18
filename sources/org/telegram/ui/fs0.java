package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fs0(Dialog dialog, boolean[] zArr, Object obj, Serializable serializable, int i10) {
        this.a = i10;
        this.b = dialog;
        this.d = zArr;
        this.c = obj;
        this.e = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        int i12 = this.a;
        int i13 = 2;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                es0 es0Var = (es0) obj;
                ImageView imageView = photoViewer.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        es0Var.run();
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer2 = ((ss0) obj4).b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i14 = photoViewer2.T;
                    ArrayList arrayList = photoViewer2.f7;
                    MessagesController.getInstance(i14).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer2.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                tw0.U((tw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 3:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (boolean[]) obj2);
                break;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
            case 5:
                boolean[] zArr2 = (boolean[]) obj2;
                Activity activity = (Activity) obj3;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i15 = Build.VERSION.SDK_INT;
                    Uri d = i15 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i15 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", d);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    break;
                }
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.xc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.o4 == iArr[0]) {
                    profileActivity.o4 = 0;
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    i20.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.e1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1)), (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.z0);
                    break;
                } else {
                    org.telegram.ui.Components.xc.b0(tL_error2);
                    break;
                }
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.k41.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new m20(profileActivity3, i13), null);
                    break;
                }
                break;
            case 9:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 10:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((h01) obj4).b;
                profileActivity4.n0.c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            break;
                        }
                    }
                }
                break;
            case 11:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((s01) obj4).c.e;
                profileActivity5.M4(null);
                if (!(tLObject5 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.xc.b0(tL_error3);
                    break;
                } else {
                    TLObject user3 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f1));
                    if (profileActivity5.getParentActivity() != null) {
                        i20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user3, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.z0);
                        break;
                    }
                }
                break;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    b2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    p81 p81Var = sessionsActivity.a;
                    if (p81Var != null) {
                        p81Var.l();
                        break;
                    }
                }
                break;
            case 13:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    b2Var3.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    p81 p81Var2 = sessionsActivity2.a;
                    if (p81Var2 != null) {
                        p81Var2.l();
                        break;
                    }
                }
                break;
            case 14:
                o81 o81Var = (o81) obj4;
                o81Var.a = (TLObject) obj3;
                o81Var.b = (TLRPC.TL_error) obj2;
                ((m9) obj).run();
                break;
            case 15:
                f91.c0((f91) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 16:
                ka1 ka1Var = (ka1) obj4;
                jg.b bVar = (jg.b) obj3;
                String str3 = (String) obj2;
                ya1 ya1Var = (ya1) obj;
                za1 za1Var = ka1Var.w;
                if (bVar != null) {
                    za1Var.V.put(str3, bVar);
                }
                if (bVar != null && !ya1Var.b && (i10 = ya1Var.a) >= 0) {
                    View m10 = za1Var.U.m(i10);
                    if (m10 instanceof ka1) {
                        ka1Var.r.e = bVar;
                        ka1 ka1Var2 = (ka1) m10;
                        ka1Var2.b.t0.d(false, false);
                        ka1Var2.g(false);
                    }
                }
                za1.Z(za1Var);
                break;
            case 17:
                la1 la1Var = (la1) obj4;
                la1Var.k = false;
                la1Var.d = (jg.b) obj3;
                la1Var.g = (String) obj2;
                ja1 ja1Var = (ja1) ((Utilities.Callback0Return) obj).run();
                if (ja1Var != null) {
                    ja1Var.e(la1Var, true);
                    break;
                }
                break;
            case 18:
                TLObject tLObject6 = (TLObject) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) obj;
                ze1 ze1Var = ((ve1) obj4).a;
                if (tLObject6 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                    for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                        if (updates.updates.get(i16) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i16);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = ze1Var.getMessagesController().getPeer(ze1Var.a);
                            tL_messageService.dialog_id = ze1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.n2) ze1Var).currentAccount;
                            arrayList3.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = ze1Var.getMessagesController().getChat(Long.valueOf(-ze1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j3 = ze1Var.b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = ze1Var.getMessagesController().getPeer(ze1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = ze1Var.E;
                            zn znVar = ze1Var.y;
                            if (znVar != null) {
                                znVar.La();
                                znVar.Pa();
                                znVar.pb(arrayList3, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                znVar.c = true;
                                znVar.r8();
                                znVar.Nc(true);
                                znVar.a1.n(true);
                                znVar.Tc();
                                znVar.R1.setCurrentTopic(znVar.d());
                                znVar.Qc(true);
                                znVar.hc(true);
                                znVar.e9(true);
                                znVar.A6(true, true);
                                znVar.Ea();
                                ze1Var.getMessagesController().getTopicsController().onTopicCreated(ze1Var.a, tL_forumTopic, true);
                                ze1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -ze1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                zn znVar2 = new zn(bundle);
                                znVar2.pb(arrayList3, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                znVar2.c = true;
                                ze1Var.getMessagesController().getTopicsController().onTopicCreated(ze1Var.a, tL_forumTopic, true);
                                ze1Var.presentFragment(znVar2);
                            }
                        }
                    }
                }
                b2Var4.dismiss();
                break;
            case 19:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                break;
            case 20:
                gh1 gh1Var = (gh1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    gh1Var.u0(new x81(16, gh1Var, str5));
                    break;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        gh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        gh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                        break;
                    }
                } else {
                    gh1Var.y0();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                ai.da daVar = (ai.da) obj3;
                String str6 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (!z0Var.c || ((d1Var = z0Var.Q) != null && d1Var.p(daVar))) {
                    z0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                    break;
                } else {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    break;
                }
                break;
            case 22:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str7 = iVar.a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f;
                try {
                    m5.e a2 = aVar.c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.a(new IllegalArgumentException(str8));
                    } else {
                        ((s5.h) aVar.e).f(new org.telegram.ui.Components.r50(aVar, iVar, ((j5.b) a2).a(hVar), 5));
                        gVar.a(null);
                    }
                    break;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.a(e12);
                    return;
                }
            case 23:
                qg.m2 m2Var = (qg.m2) obj4;
                m2Var.G = true;
                m2Var.H = (qg.j2[]) ((ArrayList) obj3).toArray(new qg.j2[0]);
                ((pr0) obj2).run((qg.j2) obj);
                break;
            case 24:
                qg.m2 m2Var2 = (qg.m2) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                qg.k2 k2Var = (qg.k2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject7 instanceof TLRPC.TL_messageMediaDocument) {
                    m2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                    k2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, k2Var.c);
                    k2Var.f = tL_messageMediaDocument;
                    m2Var2.a();
                    break;
                } else {
                    m2Var2.h();
                    m2Var2.n(tL_error7);
                    break;
                }
            case 25:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error8 != null) {
                    callback.run(tL_error8);
                    break;
                } else if (tLObject8 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject8);
                    break;
                }
                break;
            case 26:
                final xh.o2 o2Var = (xh.o2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                xh.j1 j1Var = (xh.j1) obj2;
                final View view = (View) obj;
                org.telegram.ui.Components.zr0 zr0Var = o2Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    j1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(o2Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (o2Var.e.m(savedStarGift, z11, false)) {
                    new xh.r2(o2Var.getContext(), zr0Var.c, savedStarGift, o2Var.c, new Utilities.Callback0Return() { // from class: xh.h2
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((j1) view).c(z11, true);
                            o2 o2Var2 = o2.this;
                            o2Var2.f.v0(0);
                            return xc.a0(o2Var2.a.a);
                        }
                    }).show();
                    break;
                } else {
                    if (z10) {
                        org.telegram.messenger.q.q(R.string.Gift2Unpinned, org.telegram.ui.Components.xc.a0(zr0Var.a), R.raw.ic_unpin, 36);
                    } else {
                        org.telegram.ui.Components.xc.a0(zr0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                    }
                    ((xh.j1) view).c(z11, true);
                    o2Var.f.v0(0);
                    break;
                }
            case 27:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                nf.e eVar = (nf.e) obj2;
                org.telegram.ui.ActionBar.b2 b2Var5 = (org.telegram.ui.ActionBar.b2) obj;
                if (n2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.xc.a0(n2Var).d0(tL_error9, false);
                }
                if ((n2Var instanceof zn) && tL_error9 == null) {
                    ((zn) n2Var).Yb();
                }
                eVar.b();
                b2Var5.dismiss();
                break;
            case 28:
                yh.y3.Z((yh.y3) obj4, (boolean[]) obj2, (TL_stars.StarGiftAttribute) obj3, (org.telegram.ui.Components.zc[]) obj);
                break;
            default:
                yh.y3.R0((yh.y3) obj4, (TLObject) obj3, (tg.r) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ fs0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ fs0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        this.a = 3;
        this.b = privacyControlActivity;
        this.c = tL_error;
        this.e = tLObject;
        this.d = zArr;
    }
}

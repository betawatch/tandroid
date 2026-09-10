package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fy0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int i10;
        int i11;
        org.telegram.ui.web.c1 c1Var;
        int i12 = 2;
        switch (this.a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                TLObject tLObject = (TLObject) this.d;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                privacySettingsActivity.getClass();
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.b;
                boolean[] zArr = (boolean[]) this.c;
                Activity activity = (Activity) this.d;
                File file = (File) this.e;
                try {
                    d2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr[0]) {
                    int i13 = Build.VERSION.SDK_INT;
                    Uri d = i13 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i13 >= 24) {
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
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                int[] iArr = (int[]) this.e;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.wc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.o4 == iArr[0]) {
                    profileActivity.o4 = 0;
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    j20.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.e1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1)), (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.z0);
                    break;
                } else {
                    org.telegram.ui.Components.wc.b0(tL_error2);
                    break;
                }
            case 4:
                ProfileActivity profileActivity3 = (ProfileActivity) this.c;
                String[] strArr = (String[]) this.b;
                String str = (String) this.d;
                String str2 = (String) this.e;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.i41.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new n20(profileActivity3, i12), null);
                    break;
                }
                break;
            case 5:
                ProfileActivity.n0((ProfileActivity) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (String) this.e);
                break;
            case 6:
                n01 n01Var = (n01) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                UserConfig userConfig = (UserConfig) this.b;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = n01Var.b;
                profileActivity4.n0.c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity4.n0.V0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
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
            case 7:
                y01 y01Var = (y01) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity5 = y01Var.c.e;
                profileActivity5.M4(null);
                if (!(tLObject5 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.wc.b0(tL_error3);
                    break;
                } else {
                    TLObject user2 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f1));
                    if (profileActivity5.getParentActivity() != null) {
                        j20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user2, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.z0);
                        break;
                    }
                }
                break;
            case 8:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                sessionsActivity.getClass();
                try {
                    d2Var3.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    v81 v81Var = sessionsActivity.a;
                    if (v81Var != null) {
                        v81Var.l();
                        break;
                    }
                }
                break;
            case 9:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                sessionsActivity2.getClass();
                try {
                    d2Var4.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    v81 v81Var2 = sessionsActivity2.a;
                    if (v81Var2 != null) {
                        v81Var2.l();
                        break;
                    }
                }
                break;
            case 10:
                u81 u81Var = (u81) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.b;
                l9 l9Var = (l9) this.e;
                u81Var.a = tLObject6;
                u81Var.b = tL_error6;
                l9Var.run();
                break;
            case 11:
                k91.c0((k91) this.c, (TLRPC.TL_error) this.b, (TLObject) this.d, (String) this.e);
                break;
            case 12:
                qa1 qa1Var = (qa1) this.c;
                ig.b bVar = (ig.b) this.b;
                String str3 = (String) this.d;
                eb1 eb1Var = (eb1) this.e;
                fb1 fb1Var = qa1Var.w;
                if (bVar != null) {
                    fb1Var.V.put(str3, bVar);
                }
                if (bVar != null && !eb1Var.b && (i10 = eb1Var.a) >= 0) {
                    View m10 = fb1Var.U.m(i10);
                    if (m10 instanceof qa1) {
                        qa1Var.r.e = bVar;
                        qa1 qa1Var2 = (qa1) m10;
                        qa1Var2.b.t0.d(false, false);
                        qa1Var2.g(false);
                    }
                }
                fb1.Z(fb1Var);
                break;
            case 13:
                ra1 ra1Var = (ra1) this.c;
                ig.b bVar2 = (ig.b) this.b;
                String str4 = (String) this.d;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.e;
                ra1Var.k = false;
                ra1Var.d = bVar2;
                ra1Var.g = str4;
                pa1 pa1Var = (pa1) callback0Return.run();
                if (pa1Var != null) {
                    pa1Var.e(ra1Var, true);
                    break;
                }
                break;
            case 14:
                af1 af1Var = (af1) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str5 = (String) this.e;
                org.telegram.ui.ActionBar.d2 d2Var5 = (org.telegram.ui.ActionBar.d2) this.b;
                ef1 ef1Var = af1Var.a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = ef1Var.getMessagesController().getPeer(ef1Var.a);
                            tL_messageService.dialog_id = ef1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.p2) ef1Var).currentAccount;
                            arrayList2.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = ef1Var.getMessagesController().getChat(Long.valueOf(-ef1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j3 = ef1Var.b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str5;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = ef1Var.getMessagesController().getPeer(ef1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = ef1Var.E;
                            eo eoVar = ef1Var.y;
                            if (eoVar != null) {
                                eoVar.La();
                                eoVar.Pa();
                                eoVar.pb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                eoVar.c = true;
                                eoVar.r8();
                                eoVar.Nc(true);
                                eoVar.a1.n(true);
                                eoVar.Tc();
                                eoVar.R1.setCurrentTopic(eoVar.d());
                                eoVar.Qc(true);
                                eoVar.hc(true);
                                eoVar.e9(true);
                                eoVar.A6(true, true);
                                eoVar.Ea();
                                ef1Var.getMessagesController().getTopicsController().onTopicCreated(ef1Var.a, tL_forumTopic, true);
                                ef1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -ef1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                eo eoVar2 = new eo(bundle);
                                eoVar2.pb(arrayList2, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                eoVar2.c = true;
                                ef1Var.getMessagesController().getTopicsController().onTopicCreated(ef1Var.a, tL_forumTopic, true);
                                ef1Var.presentFragment(eoVar2);
                            }
                        }
                    }
                }
                d2Var5.dismiss();
                break;
            case 15:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.c, (byte[]) this.b, (TLObject) this.d, (byte[]) this.e);
                break;
            case 16:
                mh1 mh1Var = (mh1) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                String str6 = (String) this.b;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    mh1Var.u0(new r91(15, mh1Var, str6));
                    break;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        mh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        mh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error7.text);
                        break;
                    }
                } else {
                    mh1Var.y0();
                    break;
                }
            case 17:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.c;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                String str7 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (!y0Var.c || ((c1Var = y0Var.Q) != null && c1Var.p(a1Var))) {
                    y0Var.d("window.Telegram.WebView.receiveEvent('" + str7 + "', " + jSONObject + ");");
                    break;
                } else {
                    FileLog.d("notifyEvent " + str7 + " dropped after document change");
                    break;
                }
                break;
            case 18:
                pg.n2 n2Var = (pg.n2) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                or0 or0Var = (or0) this.d;
                pg.k2 k2Var = (pg.k2) this.e;
                n2Var.G = true;
                n2Var.H = (pg.k2[]) arrayList3.toArray(new pg.k2[0]);
                or0Var.run(k2Var);
                break;
            case 19:
                pg.n2 n2Var2 = (pg.n2) this.c;
                TLObject tLObject9 = (TLObject) this.d;
                pg.l2 l2Var = (pg.l2) this.b;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.e;
                if (tLObject9 instanceof TLRPC.TL_messageMediaDocument) {
                    n2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject9;
                    l2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.c);
                    l2Var.f = tL_messageMediaDocument;
                    n2Var2.a();
                    break;
                } else {
                    n2Var2.h();
                    n2Var2.n(tL_error8);
                    break;
                }
            case 20:
                q5.a aVar = (q5.a) this.c;
                l5.i iVar = (l5.i) this.b;
                String str8 = iVar.a;
                i5.g gVar = (i5.g) this.d;
                l5.h hVar = (l5.h) this.e;
                aVar.getClass();
                Logger logger = q5.a.f;
                try {
                    m5.e a2 = aVar.c.a(str8);
                    if (a2 == null) {
                        String str9 = "Transport backend '" + str8 + "' is not registered";
                        logger.warning(str9);
                        gVar.b(new IllegalArgumentException(str9));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.f21(aVar, iVar, ((j5.b) a2).a(hVar), 3));
                        gVar.b(null);
                    }
                    break;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.b(e12);
                    return;
                }
            case 21:
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLObject tLObject10 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error9 != null) {
                    callback.run(tL_error9);
                    break;
                } else if (tLObject10 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject10);
                    break;
                }
                break;
            case 22:
                final wh.m2 m2Var = (wh.m2) this.c;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.b;
                wh.h1 h1Var = (wh.h1) this.d;
                final View view = (View) this.e;
                org.telegram.ui.Components.wr0 wr0Var = m2Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.m(savedStarGift, z11, false)) {
                    new wh.p2(m2Var.getContext(), wr0Var.c, savedStarGift, m2Var.c, new Utilities.Callback0Return() { // from class: wh.f2
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f.u0(0);
                            return wc.a0(m2Var2.a.a);
                        }
                    }).show();
                    break;
                } else {
                    if (z10) {
                        org.telegram.messenger.a2.o(R.string.Gift2Unpinned, org.telegram.ui.Components.wc.a0(wr0Var.a), R.raw.ic_unpin, 36);
                    } else {
                        org.telegram.ui.Components.wc.a0(wr0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                    }
                    ((wh.h1) view).c(z11, true);
                    m2Var.f.u0(0);
                    break;
                }
            case 23:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.d;
                nf.e eVar = (nf.e) this.e;
                org.telegram.ui.ActionBar.d2 d2Var6 = (org.telegram.ui.ActionBar.d2) this.b;
                if (p2Var != null && tL_error10 != null) {
                    org.telegram.ui.Components.wc.a0(p2Var).d0(tL_error10, false);
                }
                if ((p2Var instanceof eo) && tL_error10 == null) {
                    ((eo) p2Var).Yb();
                }
                eVar.b();
                d2Var6.dismiss();
                break;
            case 24:
                xh.x3.Z((xh.x3) this.c, (boolean[]) this.b, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.yc[]) this.e);
                break;
            case 25:
                xh.x3.R0((xh.x3) this.c, (TLObject) this.d, (org.telegram.ui.Components.sx0) this.b, (TLRPC.TL_error) this.e);
                break;
            case 26:
                xh.x3.S0((xh.x3) this.c, (MessageObject) this.b, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                break;
            case 27:
                xh.x3 x3Var = (xh.x3) this.c;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) this.b;
                TLObject tLObject11 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error11 != null || !(tLObject11 instanceof TLRPC.Updates)) {
                    x3Var.getBulletinFactory().d0(tL_error11, false);
                    break;
                } else {
                    x3Var.q0 = true;
                    x3Var.l1 = null;
                    x3Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject11, new xh.b1(x3Var, 5));
                    Utilities.stageQueue.postRunnable(new u2.k0(14, x3Var, tLObject11));
                    break;
                }
            case 28:
                xh.x2 x2Var = (xh.x2) this.c;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.o6 o6Var = x2Var.H;
                x2Var.h0 = false;
                if (starGift == null) {
                    org.telegram.ui.Components.kj0 kj0Var = x2Var.l0;
                    if (kj0Var != null) {
                        kj0Var.d();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(11), 750L);
                    }
                    x2Var.Q.animate().alpha(0.0f).start();
                    x2Var.S.animate().alpha(1.0f).start();
                    x2Var.G.animate().alpha(1.0f).start();
                    x2Var.R.animate().alpha(0.0f).start();
                    x2Var.P.animate().alpha(1.0f).start();
                    x2Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList4.size(), new Object[0])));
                    o6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                    o6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                    x2Var.I.setAlpha(0.0f);
                    if (x2Var.O != null) {
                        int i15 = 0;
                        while (true) {
                            wh.h1[] h1VarArr = x2Var.O;
                            if (i15 < h1VarArr.length) {
                                AndroidUtilities.removeFromParent(h1VarArr[i15]);
                                i15++;
                            } else {
                                x2Var.O = null;
                            }
                        }
                    }
                    x2Var.O = new wh.h1[arrayList4.size()];
                    int i16 = 0;
                    while (i16 < arrayList4.size()) {
                        TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList4.get(i16);
                        wh.h1 h1Var2 = new wh.h1(x2Var.getContext(), x2Var.W, x2Var.a);
                        h1Var2.g(starGift2, false, false, false, false, true);
                        h1Var2.x.setVisibility(8);
                        h1Var2.setRibbonColor(-3065286);
                        org.telegram.ui.Components.w9 w9Var = h1Var2.y;
                        FrameLayout.LayoutParams e13 = w7.a6.e(42, 42, 17);
                        h1Var2.E = e13;
                        w9Var.setLayoutParams(e13);
                        int i17 = i16 + 1;
                        boolean z12 = i17 >= arrayList4.size();
                        LinearLayout linearLayout = x2Var.N;
                        x2Var.O[i16] = h1Var2;
                        linearLayout.addView(h1Var2, w7.a6.p(74, 74, 0.0f, 51, 0, 0, z12 ? 0 : 6, 0));
                        i16 = i17;
                    }
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
            default:
                zh.v2 v2Var = (zh.v2) this.c;
                TLObject tLObject12 = (TLObject) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.b;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                zh.a3 a3Var = v2Var.l;
                if (tLObject12 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject12;
                    MessagesController.getInstance(a3Var.C2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(a3Var.C2).putChats(tL_stories_stories.chats, false);
                    for (int i18 = 0; i18 < tL_stories_stories.stories.size(); i18++) {
                        if (tL_stories_stories.stories.get(i18).id == storyItem.id) {
                            callback3.run(tL_stories_stories.stories.get(i18).media.document);
                            break;
                        }
                    }
                }
                callback3.run(null);
                break;
        }
    }

    public /* synthetic */ fy0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = tLObject;
        this.b = obj2;
        this.e = obj3;
    }

    public /* synthetic */ fy0(Object obj, TLObject tLObject, Object obj2, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.b = d2Var;
    }

    public /* synthetic */ fy0(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, Activity activity, File file) {
        this.a = 1;
        this.b = d2Var;
        this.c = zArr;
        this.d = activity;
        this.e = file;
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4  */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v52 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String formatString;
        int i16;
        int i17;
        char c10;
        String formatPluralString;
        int i18;
        int i19;
        long j3;
        boolean z11;
        String str;
        TLRPC.Message message;
        ?? r10;
        String formatString2;
        org.telegram.ui.ActionBar.m2 U;
        qc M;
        org.telegram.ui.no0 no0Var;
        org.telegram.ui.no0 no0Var2;
        int i20 = this.a;
        int i21 = 10;
        int i22 = 3;
        int i23 = 1;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i20) {
            case 0:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj3;
                qyVar.showDialog(new org.telegram.ui.l41((Context) obj2, qyVar.getResourceProvider(), new wn0(0, (eo0) obj4, qyVar)));
                ((y70) obj).u();
                break;
            case 1:
                org.telegram.ui.qy qyVar2 = (org.telegram.ui.qy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                y70 y70Var = (y70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.d6 resourceProvider = qyVar2.getResourceProvider();
                vw vwVar = new vw(29, (eo0) obj4, tL_sponsoredPeer);
                int i24 = org.telegram.ui.t31.v;
                int currentAccount = qyVar2.getCurrentAccount();
                Activity parentActivity = qyVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.hi(parentActivity, resourceProvider, bArr, qyVar2, vwVar, currentAccount));
                }
                y70Var.u();
                break;
            case 2:
                uq0.m((uq0) obj4, (AtomicReference) obj3, (bq0) obj2, (TLRPC.Dialog) obj);
                break;
            case 3:
                fy0.F((fy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                break;
            case 4:
                fy0.o((org.telegram.ui.js0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                break;
            case 5:
                s01 s01Var = (s01) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(s01Var.d).performLogout(0);
                    break;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder h = v7.j.h(string, "\n");
                        h.append(tL_error.text);
                        string = h.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s01Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.R = string2;
                    a2Var.T = string;
                    org.telegram.messenger.f0.o(R.string.OK, alertDialog$Builder, null);
                    break;
                }
                break;
            case 6:
                k31 k31Var = (k31) obj4;
                ((y70) obj).u();
                ((MessagesController) obj3).getTopicsController().pinTopic(-k31Var.c, ((TLRPC.TL_forumTopic) obj2).id, !r5.pinned, k31Var.h);
                break;
            case 7:
                i41.n((i41) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                break;
            case 8:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = d60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                d60Var.a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = d60Var.a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                call2.chatId = chat == null ? 0L : chat.id;
                groupCall.schedule_date = d60Var.k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = d60Var.a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                t20 t20Var = d60Var.p2;
                ChatObject.Call call4 = d60Var.a1;
                t20Var.c = call4;
                d60Var.a2.setGroupCall(call4);
                d60Var.o2.c = d60Var.a1;
                d60Var.c0.C0(accountInstance.getCurrentAccount(), d60Var.a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = d60Var.a1;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
            case 9:
                org.telegram.ui.d60.w((org.telegram.ui.d60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                break;
            case 10:
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ai.m3 m3Var = (ai.m3) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i25 = 0; i25 < Math.min(arrayList.size(), vector.objects.size()); i25++) {
                        if (vector.objects.get(i25) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i25)).id));
                        }
                    }
                }
                m3Var.run();
                break;
            case 11:
                org.telegram.ui.k50 k50Var = (org.telegram.ui.k50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str2 = (String) obj;
                org.telegram.ui.d60 d60Var2 = k50Var.f;
                AccountInstance accountInstance2 = d60Var2.d;
                org.telegram.ui.x30 x30Var = d60Var2.b;
                ImageLocation imageLocation = k50Var.d;
                if (imageLocation != null) {
                    x30Var.K0 = imageLocation;
                    x30Var.q1 = null;
                    x30Var.r1 = null;
                    k50Var.d = null;
                }
                if (tL_error2 == null) {
                    TLRPC.User user = accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance2.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance2.getMessagesController().putUser(user, false);
                        }
                    } else {
                        accountInstance2.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    ArrayList<TLRPC.PhotoSize> arrayList3 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 800);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize == null || k50Var.c == null) {
                        z10 = true;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.e3) d60Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.e3) d60Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(k50Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(k50Var.c.volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(k50Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String o10 = a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.e3) d60Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(o9, o10, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && k50Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.e3) d60Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.e3) d60Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(k50Var.b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str2 != null) {
                        i10 = ((org.telegram.ui.ActionBar.e3) d60Var2).currentAccount;
                        new File(str2).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(k50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(k50Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(k50Var.c);
                    }
                    x30Var.setCreateThumbFromParent(false);
                    x30Var.H(null, forUser, forUser2, true);
                    k50Var.c = null;
                    k50Var.b = null;
                    AndroidUtilities.updateVisibleRows(d60Var2.Q);
                    k50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                break;
            case 12:
                org.telegram.ui.g70.U((org.telegram.ui.g70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 13:
                org.telegram.ui.n70 n70Var = (org.telegram.ui.n70) obj4;
                n70Var.d = (ArrayList) obj3;
                n70Var.e = (ArrayList) obj2;
                n70Var.l();
                org.telegram.ui.o70 o70Var = n70Var.r;
                o70Var.b.d.setVisibility(8);
                o70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                o70Var.b.e(false, true);
                break;
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.n80 n80Var = (org.telegram.ui.n80) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = e5.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        tL_langPackLanguage.base_lang_code = str3.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        a2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new h1(launchActivity, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        a2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        a2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        formatString = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new org.telegram.ui.o(23, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(formatString));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i26 = indexOf + 1;
                        i16 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i26);
                        if (i16 != -1) {
                            spannableStringBuilder.delete(i16, i16 + 1);
                            spannableStringBuilder.delete(indexOf, i26);
                        }
                    } else {
                        i16 = -1;
                    }
                    if (indexOf != -1 && i16 != -1) {
                        spannableStringBuilder.setSpan(new p3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    break;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(e5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb4);
                        sb4.append(tL_error3.text);
                        launchActivity.B0(e5.N(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    a2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.n80(i22, hVar, tL_error4));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.zb0 zb0Var = (org.telegram.ui.zb0) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                dr.a(m2Var.getContext(), zb0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.bt(5, zb0Var, userArr), m2Var.getResourceProvider(), org.telegram.ui.zb0.b());
                break;
            case 17:
                org.telegram.ui.wb0.t0((org.telegram.ui.wb0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 18:
                EditText editText = (EditText) obj2;
                rn rnVar = (rn) obj;
                ((jd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.n80(15, editText, rnVar));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ge0 ge0Var = (org.telegram.ui.ge0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str4 != null ? AndroidUtilities.getStringBytes(str4) : null;
                org.telegram.ui.ee0 ee0Var = new org.telegram.ui.ee0(ge0Var, str4, str5, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ge0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            ee0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.m2) ge0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ee0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                    tL_error6.text = "PASSWORD_HASH_INVALID";
                    ee0Var.run(null, tL_error6);
                    break;
                }
            case 20:
                org.telegram.ui.ue0 ue0Var = (org.telegram.ui.ue0) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                org.telegram.ui.qg0 qg0Var = ue0Var.y;
                qg0Var.k1(false, true);
                ue0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", ue0Var.h);
                    qg0Var.u1(9, true, bundle, false);
                    break;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c10 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        int i27 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c10] = formatPluralString;
                        qg0Var.l1(string3, LocaleController.formatString("FloodWaitTime", i27, objArr));
                        break;
                    } else {
                        qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                        break;
                    }
                } else {
                    ue0Var.o(true);
                    break;
                }
            case 21:
                org.telegram.ui.tf0 tf0Var = (org.telegram.ui.tf0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.qg0 qg0Var2 = tf0Var.s0;
                tf0Var.d0 = false;
                if (tL_error8 == null) {
                    tf0Var.o0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                    tf0Var.p0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        tf0Var.g0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        tf0Var.g0 = 16;
                    }
                    qg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str7 = tL_error8.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            tf0Var.c(true);
                            qg0Var2.u1(0, true, null, true);
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error8.code != -1000) {
                            String string4 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb5);
                            sb5.append(tL_error8.text);
                            qg0Var2.l1(string4, sb5.toString());
                        }
                    }
                }
                tf0Var.z(false);
                break;
            case 22:
                org.telegram.ui.zf0.o((org.telegram.ui.zf0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 23:
                c5.o oVar = (c5.o) obj3;
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) obj2;
                org.telegram.ui.qg0 qg0Var3 = ((org.telegram.ui.zf0) obj4).v;
                qg0Var3.e = true;
                BillingController.getInstance().addResultListener(oVar.c, new org.telegram.ui.h3(t3Var, i22));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.xf0(t3Var, i23));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = qg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.m2) qg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                of.b bVar = new of.b(7, false);
                bVar.U(oVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.B()));
                break;
            case 24:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str8 = (String) obj;
                pg0Var.K = false;
                org.telegram.ui.qg0 qg0Var4 = pg0Var.V;
                qg0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (TwoStepVerificationActivity.i0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str8);
                        qg0Var4.u1(6, true, bundle3, false);
                        break;
                    } else {
                        e5.x0(qg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    qg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    break;
                }
            case 25:
                org.telegram.ui.aj0 aj0Var = (org.telegram.ui.aj0) obj4;
                jg.b bVar2 = (jg.b) obj3;
                String str9 = (String) obj2;
                ra1 ra1Var = (ra1) obj;
                org.telegram.ui.dj0 dj0Var = aj0Var.v.d;
                if (bVar2 != null) {
                    dj0Var.v.put(str9, bVar2);
                }
                if (bVar2 != null && !ra1Var.b && (i19 = ra1Var.a) >= 0) {
                    View m10 = dj0Var.h.m(i19);
                    if (m10 instanceof ca1) {
                        aj0Var.r.e = bVar2;
                        ca1 ca1Var = (ca1) m10;
                        ca1Var.b.t0.d(false, false);
                        ca1Var.g(false);
                    }
                }
                aj0Var.f();
                break;
            case 26:
                org.telegram.ui.kk0 kk0Var = (org.telegram.ui.kk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                gg.c2 c2Var = kk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = kk0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    kk0Var.f = null;
                    kk0Var.d = arrayList5;
                    kk0Var.e = arrayList6;
                    c2Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f && !c2Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    kk0Var.l();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.oo0 oo0Var = (org.telegram.ui.oo0) obj4;
                TLRPC.Message message2 = (TLRPC.Message) obj;
                oo0Var.a1 = true;
                oo0Var.f1 = 1;
                oo0Var.x0((org.telegram.ui.ActionBar.b5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = oo0Var.b1;
                boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                if (z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                    j3 = 0;
                    z11 = true;
                } else {
                    j3 = 0;
                    z11 = false;
                }
                boolean z13 = z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z12 && (no0Var2 = oo0Var.Z0) != null) {
                    no0Var2.a(oo0Var.f1);
                }
                oo0Var.t0();
                if (z12 && (no0Var = oo0Var.Z0) != null) {
                    no0Var.a(oo0Var.f1);
                }
                long r02 = oo0Var.r0();
                if (r02 <= j3) {
                    str = "";
                    if (r02 < j3) {
                        message = message2;
                        r10 = 0;
                        r10 = 0;
                        TLRPC.Chat chat2 = oo0Var.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat2 != null) {
                            str = chat2.title;
                        }
                        long q02 = oo0Var.q0();
                        int i28 = !z12 ? (z11 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string5 = z12 ? null : LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                        if (z12) {
                            int i29 = R.string.PaymentInfoHint;
                            String str10 = oo0Var.R0[r10];
                            String str11 = oo0Var.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r10] = str10;
                            objArr2[1] = str11;
                            formatString2 = LocaleController.formatString(i29, objArr2);
                        } else if (z13) {
                            formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            String str12 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r10] = str;
                            formatString2 = LocaleController.formatPluralStringComma(str12, (int) q02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                        U = LaunchActivity.U();
                        if (U == null) {
                            xc a02 = xc.a0(U);
                            if (r02 == j3 || string5 == null || z13) {
                                String str13 = string5;
                                M = str13 != null ? a02.M(str13, replaceTags, i28) : a02.Q(i28, 36, replaceTags);
                            } else {
                                M = a02.K(i28, string5, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.pn0(r02, i23));
                            }
                            qc qcVar = M;
                            qcVar.r = r10;
                            qcVar.j = 5000;
                            ai.l5 l5Var = new ai.l5(oo0Var, qcVar, z11, message, 4);
                            ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(l5Var);
                            }
                            qcVar.k(z13);
                            break;
                        }
                    }
                } else {
                    str = UserObject.getForcedFirstName(oo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                }
                message = message2;
                r10 = 0;
                long q022 = oo0Var.q0();
                int i282 = !z12 ? (z11 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z12) {
                }
                if (z12) {
                }
                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString2);
                U = LaunchActivity.U();
                if (U == null) {
                }
                break;
            case 28:
                org.telegram.ui.oo0.d0((org.telegram.ui.oo0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str14 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ar0(photoViewer, i21));
                    break;
                } else {
                    int i30 = 11;
                    int[] iArr = new int[11];
                    AnimatedFileNative.d(photoEntry.path, iArr, 0L);
                    int max = Math.max(iArr[1], photoEntry.width);
                    int max2 = Math.max(iArr[2], photoEntry.height);
                    if ((iArr[8] / 90) % 2 == 1) {
                        max2 = max;
                        max = max2;
                    }
                    float f7 = max;
                    float f10 = max2;
                    float max3 = Math.max(decodeFile.getWidth() / f7, decodeFile.getHeight() / f10);
                    int i31 = (int) (f7 * max3);
                    int i32 = (int) (f10 * max3);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(i31, i32, config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                    float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                    canvas.scale(max4, max4);
                    canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str14));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                        float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                        canvas2.scale(max5, max5);
                        canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.jr0(photoViewer, photoEntry, str14, createBitmap2, 0));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ar0(photoViewer, i30));
                    }
                }
        }
    }

    public /* synthetic */ vn0(k31 k31Var, y70 y70Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.a = 6;
        this.b = k31Var;
        this.d = y70Var;
        this.c = messagesController;
        this.e = tL_forumTopic;
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a91;
import org.telegram.ui.p91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l11(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
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
        int i18;
        int i19;
        String str;
        TLRPC.Chat chat;
        String formatString2;
        org.telegram.ui.co0 co0Var;
        org.telegram.ui.co0 co0Var2;
        int i20 = this.a;
        int i21 = 3;
        int i22 = 10;
        int i23 = 1;
        int i24 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i20) {
            case 0:
                d21 d21Var = (d21) obj4;
                ((b70) obj3).u();
                ((MessagesController) obj2).getTopicsController().pinTopic(-d21Var.c, ((TLRPC.TL_forumTopic) obj).id, !r15.pinned, d21Var.h);
                break;
            case 1:
                b31.n((b31) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                break;
            case 2:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = s50Var.d;
                ChatObject.Call call = new ChatObject.Call();
                s50Var.W0 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = s50Var.W0;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                call2.chatId = chat2 != null ? chat2.id : 0L;
                groupCall.schedule_date = s50Var.g2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = s50Var.W0;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                f20 f20Var = s50Var.l2;
                ChatObject.Call call4 = s50Var.W0;
                f20Var.c = call4;
                s50Var.W1.setGroupCall(call4);
                s50Var.k2.c = s50Var.W0;
                s50Var.Y.C0(accountInstance.getCurrentAccount(), s50Var.W0.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = s50Var.W0;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
            case 3:
                org.telegram.ui.s50.x((org.telegram.ui.s50) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                break;
            case 4:
                TLObject tLObject = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                l20 l20Var = (l20) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i25 = 0; i25 < Math.min(arrayList.size(), vector.objects.size()); i25++) {
                        if (vector.objects.get(i25) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i25)).id));
                        }
                    }
                }
                l20Var.run();
                break;
            case 5:
                org.telegram.ui.z40 z40Var = (org.telegram.ui.z40) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                org.telegram.ui.s50 s50Var2 = z40Var.f;
                AccountInstance accountInstance2 = s50Var2.d;
                org.telegram.ui.l30 l30Var = s50Var2.b;
                ImageLocation imageLocation = z40Var.d;
                if (imageLocation != null) {
                    l30Var.G0 = imageLocation;
                    l30Var.m1 = null;
                    l30Var.n1 = null;
                    z40Var.d = null;
                }
                if (tL_error == null) {
                    TLRPC.User user = accountInstance2.getMessagesController().getUser(Long.valueOf(accountInstance2.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance2.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance2.getMessagesController().putUser(user, false);
                        }
                    } else {
                        accountInstance2.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
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
                    if (closestPhotoSizeWithSize == null || z40Var.c == null) {
                        z10 = true;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.e3) s50Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.e3) s50Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(z40Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(z40Var.c.volume_id);
                        sb2.append("_");
                        String k10 = a9.p.k(z40Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String k11 = a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.e3) s50Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(k10, k11, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && z40Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.e3) s50Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.e3) s50Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(z40Var.b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str2 != null) {
                        i10 = ((org.telegram.ui.ActionBar.e3) s50Var2).currentAccount;
                        new File(str2).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(z40Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(z40Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(z40Var.c);
                    }
                    l30Var.setCreateThumbFromParent(false);
                    l30Var.H(null, forUser, forUser2, true);
                    z40Var.c = null;
                    z40Var.b = null;
                    AndroidUtilities.updateVisibleRows(s50Var2.M);
                    z40Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                break;
            case 6:
                org.telegram.ui.u60.U((org.telegram.ui.u60) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 7:
                org.telegram.ui.b70 b70Var = (org.telegram.ui.b70) obj4;
                b70Var.d = (ArrayList) obj3;
                b70Var.e = (ArrayList) obj2;
                b70Var.l();
                org.telegram.ui.c70 c70Var = b70Var.r;
                c70Var.b.d.setVisibility(8);
                c70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                c70Var.b.e(false, true);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.a30 a30Var = (org.telegram.ui.a30) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (tLObject3 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject3;
                    Pattern pattern2 = y4.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        tL_langPackLanguage.base_lang_code = str3.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    if (equals) {
                        b2Var.N = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.i(LocaleController.getString(R.string.SETTINGS), new f1(launchActivity, i24));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        b2Var.N = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        b2Var.N = LocaleController.getString(R.string.LanguageTitle);
                        formatString = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new g1(i24, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
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
                        spannableStringBuilder.setSpan(new k3(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                    alertDialog$Builder.n(textView);
                    launchActivity.B0(alertDialog$Builder);
                    break;
                } else if (tL_error2 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error2.text)) {
                        launchActivity.B0(y4.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb4);
                        sb4.append(tL_error2.text);
                        launchActivity.B0(y4.N(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    b2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject4 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.a30(i22, hVar, tL_error3));
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                qq.a(n2Var.getContext(), ob0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.ib0(i24, ob0Var, userArr), n2Var.getResourceProvider(), org.telegram.ui.ob0.b());
                break;
            case 11:
                org.telegram.ui.lb0.t0((org.telegram.ui.lb0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 12:
                EditText editText = (EditText) obj2;
                gh.n4 n4Var = (gh.n4) obj;
                ((jc0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.a30(22, editText, n4Var));
                    break;
                }
                break;
            case 13:
                org.telegram.ui.yd0 yd0Var = (org.telegram.ui.yd0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str4 != null ? AndroidUtilities.getStringBytes(str4) : null;
                org.telegram.ui.wd0 wd0Var = new org.telegram.ui.wd0(yd0Var, str4, str5, i24);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = yd0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                            tL_error4.text = "ALGO_INVALID";
                            wd0Var.run(null, tL_error4);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.n2) yd0Var.A).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, wd0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                    tL_error5.text = "PASSWORD_HASH_INVALID";
                    wd0Var.run(null, tL_error5);
                    break;
                }
            case 14:
                org.telegram.ui.me0 me0Var = (org.telegram.ui.me0) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                org.telegram.ui.ig0 ig0Var = me0Var.y;
                ig0Var.k1(false, true);
                me0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", me0Var.h);
                    ig0Var.u1(9, true, bundle, false);
                    break;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error6.text);
                        break;
                    }
                } else {
                    me0Var.o(true);
                    break;
                }
            case 15:
                org.telegram.ui.mf0 mf0Var = (org.telegram.ui.mf0) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject5 = (TLObject) obj;
                org.telegram.ui.ig0 ig0Var2 = mf0Var.o0;
                mf0Var.W = false;
                if (tL_error7 == null) {
                    mf0Var.k0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject5;
                    mf0Var.l0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        mf0Var.c0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        mf0Var.c0 = 16;
                    }
                    ig0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str7 = tL_error7.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            mf0Var.c(true);
                            ig0Var2.u1(0, true, null, true);
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb5);
                            sb5.append(tL_error7.text);
                            ig0Var2.l1(string, sb5.toString());
                        }
                    }
                }
                mf0Var.z(false);
                break;
            case 16:
                org.telegram.ui.rf0.o((org.telegram.ui.rf0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 17:
                n2.l lVar = (n2.l) obj3;
                org.telegram.ui.x3 x3Var = (org.telegram.ui.x3) obj2;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.rf0) obj4).v;
                ig0Var3.e = true;
                BillingController.getInstance().addResultListener(lVar.c, new org.telegram.ui.l3(x3Var, i21));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.qf0(x3Var, i23));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = ig0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.n2) ig0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                g5.b bVar = new g5.b(22);
                bVar.t(lVar);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.i()));
                break;
            case 18:
                org.telegram.ui.hg0 hg0Var = (org.telegram.ui.hg0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str8 = (String) obj;
                hg0Var.G = false;
                org.telegram.ui.ig0 ig0Var4 = hg0Var.R;
                ig0Var4.v1(false, true);
                if (tL_error8 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (TwoStepVerificationActivity.i0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str8);
                        ig0Var4.u1(6, true, bundle3, false);
                        break;
                    } else {
                        y4.x0(ig0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    ig0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error8.text);
                    break;
                }
            case 19:
                org.telegram.ui.si0 si0Var = (org.telegram.ui.si0) obj4;
                sf.b bVar2 = (sf.b) obj3;
                String str9 = (String) obj2;
                p91 p91Var = (p91) obj;
                org.telegram.ui.vi0 vi0Var = si0Var.v.d;
                if (bVar2 != null) {
                    vi0Var.v.put(str9, bVar2);
                }
                if (bVar2 != null && !p91Var.b && (i19 = p91Var.a) >= 0) {
                    View m10 = vi0Var.h.m(i19);
                    if (m10 instanceof a91) {
                        si0Var.r.e = bVar2;
                        a91 a91Var = (a91) m10;
                        a91Var.b.p0.d(false, false);
                        a91Var.g(false);
                    }
                }
                si0Var.f();
                break;
            case 20:
                org.telegram.ui.ck0 ck0Var = (org.telegram.ui.ck0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                pf.j1 j1Var = ck0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ck0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    ck0Var.f = null;
                    ck0Var.d = arrayList5;
                    ck0Var.e = arrayList6;
                    j1Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f && !j1Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    ck0Var.l();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.do0 do0Var = (org.telegram.ui.do0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                do0Var.W0 = true;
                do0Var.b1 = 1;
                do0Var.x0((org.telegram.ui.ActionBar.b5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = do0Var.X0;
                boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z11 && (co0Var2 = do0Var.V0) != null) {
                    co0Var2.b(do0Var.b1);
                }
                do0Var.t0();
                if (z11 && (co0Var = do0Var.V0) != null) {
                    co0Var.b(do0Var.b1);
                }
                long r02 = do0Var.r0();
                if (r02 > 0) {
                    str = UserObject.getForcedFirstName(do0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (r02 < 0 && (chat = do0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = do0Var.q0();
                int i27 = z11 ? (z12 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                String string2 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z12 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                if (!z11) {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, do0Var.N0[0], do0Var.m0);
                } else if (z13) {
                    formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                } else {
                    formatString2 = LocaleController.formatPluralStringComma(z12 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    mc a02 = mc.a0(U);
                    ec M = (r02 == 0 || string2 == null || z13) ? string2 != null ? a02.M(string2, replaceTags, i27) : a02.Q(i27, 36, replaceTags) : a02.K(i27, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new hh.v9(r02, 2));
                    M.r = false;
                    M.j = 5000;
                    ag.u1 u1Var = new ag.u1(do0Var, M, z12, message, 5);
                    jb jbVar = M.e;
                    if (jbVar != null) {
                        jbVar.setOnClickListener(u1Var);
                    }
                    M.k(z13);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.do0.d0((org.telegram.ui.do0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str10 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.hq0(photoViewer, i22));
                    break;
                } else {
                    int i28 = 11;
                    int[] iArr = new int[11];
                    AnimatedFileNative.d(photoEntry.path, iArr, 0L);
                    int max = Math.max(iArr[1], photoEntry.width);
                    int max2 = Math.max(iArr[2], photoEntry.height);
                    if ((iArr[8] / 90) % 2 == 1) {
                        max2 = max;
                        max = max2;
                    }
                    float f10 = max;
                    float f11 = max2;
                    float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                    int i29 = (int) (f10 * max3);
                    int i30 = (int) (f11 * max3);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(i29, i30, config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                    float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                    canvas.scale(max4, max4);
                    canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str10));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                        float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                        canvas2.scale(max5, max5);
                        canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new l11(photoViewer, photoEntry, str10, createBitmap2, 24));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.hq0(photoViewer, i28));
                        return;
                    }
                }
            case 24:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str11 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str11;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.m5.b.setLoading(false);
                org.telegram.ui.au0 au0Var = photoViewer2.d;
                if (au0Var != null) {
                    au0Var.W(photoViewer2.L4);
                }
                org.telegram.ui.xr0 xr0Var = photoViewer2.c1;
                if (xr0Var != null) {
                    xr0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.J0;
                if (!checkBox.x) {
                    checkBox.callOnClick();
                    break;
                }
                break;
            case 25:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.dr0 dr0Var = (org.telegram.ui.dr0) obj;
                ImageView imageView = photoViewer3.t3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.t3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.y2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        dr0Var.run();
                        break;
                    }
                }
                break;
            case 26:
                TLObject tLObject7 = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((org.telegram.ui.qr0) obj4).b;
                if (tLObject7 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject7;
                    int i31 = photoViewer4.P;
                    ArrayList arrayList8 = photoViewer4.b7;
                    MessagesController.getInstance(i31).putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer4.P).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo2.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList8.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList8.set(indexOf2, tL_photos_photo2.photo);
                        }
                        if (user3 != null) {
                            user3.photo.photo_id = tL_photos_photo2.photo.id;
                            userConfig.setCurrentUser(user3);
                            userConfig.saveConfig(true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                org.telegram.ui.qv0.U((org.telegram.ui.qv0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 28:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    b2Var3.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.M = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
        }
    }
}

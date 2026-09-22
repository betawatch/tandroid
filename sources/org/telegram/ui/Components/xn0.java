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
import org.telegram.ui.ab1;
import org.telegram.ui.la1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.i60 i60Var;
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
        org.telegram.ui.wo0 wo0Var;
        org.telegram.ui.wo0 wo0Var2;
        int i20 = this.a;
        int i21 = 3;
        int i22 = 10;
        int i23 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i20) {
            case 0:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                y70 y70Var = (y70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.f6 resourceProvider = uyVar.getResourceProvider();
                yn0 yn0Var = new yn0(objArr == true ? 1 : 0, (go0) obj4, tL_sponsoredPeer);
                int i24 = org.telegram.ui.c41.v;
                int currentAccount = uyVar.getCurrentAccount();
                Activity parentActivity = uyVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ii(parentActivity, resourceProvider, bArr, uyVar, yn0Var, currentAccount));
                }
                y70Var.u();
                break;
            case 1:
                wq0.m((wq0) obj4, (AtomicReference) obj3, (dq0) obj2, (TLRPC.Dialog) obj);
                break;
            case 2:
                iy0.E((iy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (MediaDataController) obj);
                break;
            case 3:
                iy0.o((org.telegram.ui.rs0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_messages_getAttachedStickers) obj);
                break;
            case 4:
                v01 v01Var = (v01) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(v01Var.d).performLogout(0);
                    break;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder h = v7.j0.h(string, "\n");
                        h.append(tL_error.text);
                        string = h.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v01Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    b2Var.R = string2;
                    b2Var.T = string;
                    org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                    break;
                }
                break;
            case 5:
                n31 n31Var = (n31) obj4;
                ((y70) obj).u();
                ((MessagesController) obj3).getTopicsController().pinTopic(-n31Var.c, ((TLRPC.TL_forumTopic) obj2).id, !r2.pinned, n31Var.h);
                break;
            case 6:
                l41.n((l41) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TLRPC.TL_textWithEntities) obj);
                break;
            case 7:
                org.telegram.ui.i60 i60Var2 = (org.telegram.ui.i60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = i60Var2.d;
                ChatObject.Call call = new ChatObject.Call();
                i60Var2.a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = i60Var2.a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                call2.chatId = chat2 != null ? chat2.id : 0L;
                groupCall.schedule_date = i60Var2.k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = i60Var2.a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                s20 s20Var = i60Var2.p2;
                ChatObject.Call call4 = i60Var2.a1;
                s20Var.c = call4;
                i60Var2.a2.setGroupCall(call4);
                i60Var2.o2.c = i60Var2.a1;
                i60Var2.c0.D0(accountInstance.getCurrentAccount(), i60Var2.a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = i60Var2.a1;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
            case 8:
                org.telegram.ui.i60.w((org.telegram.ui.i60) obj4, (HashSet) obj3, (ChatObject.Call) obj2, (String) obj);
                break;
            case 9:
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
            case 10:
                org.telegram.ui.p50 p50Var = (org.telegram.ui.p50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                String str2 = (String) obj;
                org.telegram.ui.i60 i60Var3 = p50Var.f;
                AccountInstance accountInstance2 = i60Var3.d;
                org.telegram.ui.c40 c40Var = i60Var3.b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.q1 = null;
                    c40Var.r1 = null;
                    p50Var.d = null;
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
                    if (closestPhotoSizeWithSize == null || p50Var.c == null) {
                        i60Var = i60Var3;
                        z10 = true;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.f3) i60Var3).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.f3) i60Var3).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(p50Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(p50Var.c.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(p50Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        i60Var = i60Var3;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.f3) i60Var).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && p50Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.f3) i60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.f3) i60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(p50Var.b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str2 != null) {
                        i10 = ((org.telegram.ui.ActionBar.f3) i60Var).currentAccount;
                        new File(str2).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(p50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(p50Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(p50Var.c);
                    }
                    c40Var.setCreateThumbFromParent(false);
                    c40Var.H(null, forUser, forUser2, true);
                    p50Var.c = null;
                    p50Var.b = null;
                    AndroidUtilities.updateVisibleRows(i60Var.Q);
                    p50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                break;
            case 11:
                org.telegram.ui.l70.U((org.telegram.ui.l70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 12:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) obj4;
                s70Var.d = (ArrayList) obj3;
                s70Var.e = (ArrayList) obj2;
                s70Var.l();
                org.telegram.ui.t70 t70Var = s70Var.r;
                t70Var.b.d.setVisibility(8);
                t70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                t70Var.b.e(false, true);
                break;
            case 13:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.r80 r80Var = (org.telegram.ui.r80) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = d5.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        tL_langPackLanguage.base_lang_code = str3.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        b2Var2.R = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new h1(launchActivity, objArr2 == true ? 1 : 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        b2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        b2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        formatString = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new org.telegram.ui.l4(21, tL_langPackLanguage, launchActivity));
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
                        spannableStringBuilder.setSpan(new o3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    break;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(d5.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb4);
                        sb4.append(tL_error3.text);
                        launchActivity.B0(d5.N(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    b2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r80(4, hVar, tL_error4));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.hc0 hc0Var = (org.telegram.ui.hc0) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                cr.a(n2Var.getContext(), hc0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.of(28, hc0Var, userArr), n2Var.getResourceProvider(), org.telegram.ui.hc0.b());
                break;
            case 16:
                org.telegram.ui.ec0.t0((org.telegram.ui.ec0) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 17:
                EditText editText = (EditText) obj2;
                qn qnVar = (qn) obj;
                ((kd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.r80(16, editText, qnVar));
                    break;
                }
                break;
            case 18:
                org.telegram.ui.oe0 oe0Var = (org.telegram.ui.oe0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str4 != null ? AndroidUtilities.getStringBytes(str4) : null;
                org.telegram.ui.me0 me0Var = new org.telegram.ui.me0(oe0Var, str4, str5, objArr3 == true ? 1 : 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = oe0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            me0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.n2) oe0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, me0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                    tL_error6.text = "PASSWORD_HASH_INVALID";
                    me0Var.run(null, tL_error6);
                    break;
                }
            case 19:
                org.telegram.ui.cf0 cf0Var = (org.telegram.ui.cf0) obj4;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                org.telegram.ui.yg0 yg0Var = cf0Var.y;
                yg0Var.k1(false, true);
                cf0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", cf0Var.h);
                    yg0Var.u1(9, true, bundle, false);
                    break;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                        break;
                    }
                } else {
                    cf0Var.o(true);
                    break;
                }
            case 20:
                org.telegram.ui.bg0 bg0Var = (org.telegram.ui.bg0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject6 = (TLObject) obj;
                org.telegram.ui.yg0 yg0Var2 = bg0Var.s0;
                bg0Var.d0 = false;
                if (tL_error8 == null) {
                    bg0Var.o0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                    bg0Var.p0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        bg0Var.g0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        bg0Var.g0 = 16;
                    }
                    yg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str7 = tL_error8.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            bg0Var.c(true);
                            yg0Var2.u1(0, true, null, true);
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error8.code != -1000) {
                            String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb5);
                            sb5.append(tL_error8.text);
                            yg0Var2.l1(string3, sb5.toString());
                        }
                    }
                }
                bg0Var.z(false);
                break;
            case 21:
                org.telegram.ui.hg0.o((org.telegram.ui.hg0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 22:
                c5.n nVar = (c5.n) obj3;
                org.telegram.ui.s3 s3Var = (org.telegram.ui.s3) obj2;
                org.telegram.ui.yg0 yg0Var3 = ((org.telegram.ui.hg0) obj4).v;
                yg0Var3.e = true;
                BillingController.getInstance().addResultListener(nVar.c, new org.telegram.ui.g3(s3Var, i21));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.fg0(s3Var, i23));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity2 = yg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.n2) yg0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                of.b bVar = new of.b(7, (boolean) (objArr4 == true ? 1 : 0));
                bVar.X(nVar);
                billingController.launchBillingFlow(parentActivity2, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.H()));
                break;
            case 23:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str8 = (String) obj;
                xg0Var.K = false;
                org.telegram.ui.yg0 yg0Var4 = xg0Var.V;
                yg0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (TwoStepVerificationActivity.i0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str8);
                        yg0Var4.u1(6, true, bundle3, false);
                        break;
                    } else {
                        d5.x0(yg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    yg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    break;
                }
            case 24:
                org.telegram.ui.jj0 jj0Var = (org.telegram.ui.jj0) obj4;
                jg.b bVar2 = (jg.b) obj3;
                String str9 = (String) obj2;
                ab1 ab1Var = (ab1) obj;
                org.telegram.ui.mj0 mj0Var = jj0Var.v.d;
                if (bVar2 != null) {
                    mj0Var.v.put(str9, bVar2);
                }
                if (bVar2 != null && !ab1Var.b && (i19 = ab1Var.a) >= 0) {
                    View m10 = mj0Var.h.m(i19);
                    if (m10 instanceof la1) {
                        jj0Var.r.e = bVar2;
                        la1 la1Var = (la1) m10;
                        la1Var.b.t0.d(false, false);
                        la1Var.g(false);
                    }
                }
                jj0Var.f();
                break;
            case 25:
                org.telegram.ui.tk0 tk0Var = (org.telegram.ui.tk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                gg.c2 c2Var = tk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = tk0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    tk0Var.f = null;
                    tk0Var.d = arrayList5;
                    tk0Var.e = arrayList6;
                    c2Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f && !c2Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    tk0Var.l();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.xo0 xo0Var = (org.telegram.ui.xo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                xo0Var.a1 = true;
                xo0Var.f1 = 1;
                xo0Var.x0((org.telegram.ui.ActionBar.d5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = xo0Var.b1;
                boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z11 && (wo0Var2 = xo0Var.Z0) != null) {
                    wo0Var2.a(xo0Var.f1);
                }
                xo0Var.t0();
                if (z11 && (wo0Var = xo0Var.Z0) != null) {
                    wo0Var.a(xo0Var.f1);
                }
                long r02 = xo0Var.r0();
                if (r02 > 0) {
                    str = UserObject.getForcedFirstName(xo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (r02 < 0 && (chat = xo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = xo0Var.q0();
                int i27 = z11 ? (z12 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                String string4 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z12 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                if (!z11) {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, xo0Var.R0[0], xo0Var.q0);
                } else if (z13) {
                    formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                } else {
                    formatString2 = LocaleController.formatPluralStringComma(z12 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    xc a02 = xc.a0(U);
                    pc M = (r02 == 0 || string4 == null || z13) ? string4 != null ? a02.M(string4, replaceTags, i27) : a02.Q(i27, 36, replaceTags) : a02.K(i27, string4, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.yn0(r02, i23));
                    M.r = false;
                    M.j = 5000;
                    pc pcVar = M;
                    ai.m5 m5Var = new ai.m5(xo0Var, pcVar, z12, message, 4);
                    tb tbVar = pcVar.e;
                    if (tbVar != null) {
                        tbVar.setOnClickListener(m5Var);
                    }
                    pcVar.k(z13);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.xo0.d0((org.telegram.ui.xo0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str10 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.jr0(photoViewer, i22));
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
                    float f7 = max;
                    float f10 = max2;
                    float max3 = Math.max(decodeFile.getWidth() / f7, decodeFile.getHeight() / f10);
                    int i29 = (int) (f7 * max3);
                    int i30 = (int) (f10 * max3);
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
                        AndroidUtilities.runOnUIThread(new xn0(photoViewer, photoEntry, str10, createBitmap2, 29));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.jr0(photoViewer, i28));
                        return;
                    }
                }
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str11 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
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
                photoViewer2.q5.b.setLoading(false);
                org.telegram.ui.bv0 bv0Var = photoViewer2.d;
                if (bv0Var != null) {
                    bv0Var.W(photoViewer2.P4);
                }
                org.telegram.ui.zs0 zs0Var = photoViewer2.g1;
                if (zs0Var != null) {
                    zs0Var.setImage(bitmap);
                }
                photoViewer2.d3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.x) {
                    checkBox.callOnClick();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ xn0(n31 n31Var, y70 y70Var, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        this.a = 5;
        this.b = n31Var;
        this.e = y70Var;
        this.c = messagesController;
        this.d = tL_forumTopic;
    }
}

package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
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
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a30(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.e;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            org.telegram.ui.Components.qc.a0(profileActivity).d0(tL_error, false);
        }
        if (profileActivity.l4 == iArr[0]) {
            profileActivity.l4 = 0;
        }
    }

    private final void b() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            d20.a(profileActivity.getParentActivity(), 0, tL_username.username, profileActivity.b1 != 0 ? profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1)) : profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.c1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.w0);
        } else {
            org.telegram.ui.Components.qc.b0(tL_error);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccountInstance accountInstance;
        boolean z4;
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
        TLRPC.Chat chat;
        String formatString2;
        org.telegram.ui.Components.ic M;
        io0 io0Var;
        io0 io0Var2;
        int i20 = this.a;
        int i21 = 10;
        String str = "";
        int i22 = 2;
        int i23 = 1;
        int i24 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i20) {
            case 0:
                TLObject tLObject = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.Components.jy0 jy0Var = (org.telegram.ui.Components.jy0) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i25 = 0; i25 < Math.min(arrayList.size(), vector.objects.size()); i25++) {
                        if (vector.objects.get(i25) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i25)).id));
                        }
                    }
                }
                jy0Var.run();
                break;
            case 1:
                k50 k50Var = (k50) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj4;
                String str2 = (String) obj;
                c60 c60Var = k50Var.f;
                AccountInstance accountInstance2 = c60Var.d;
                x30 x30Var = c60Var.b;
                ImageLocation imageLocation = k50Var.d;
                if (imageLocation != null) {
                    x30Var.H0 = imageLocation;
                    x30Var.n1 = null;
                    x30Var.o1 = null;
                    k50Var.d = null;
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
                    if (closestPhotoSizeWithSize == null || k50Var.c == null) {
                        accountInstance = accountInstance2;
                        z4 = true;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(k50Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb = new StringBuilder();
                        sb.append(k50Var.c.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(k50Var.c.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        accountInstance = accountInstance2;
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        String m10 = android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        z4 = true;
                        imageLoader.replaceImageInCache(m9, m10, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && k50Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z4);
                        i12 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(k50Var.b, z4).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str2 != null) {
                        i10 = ((org.telegram.ui.ActionBar.g3) c60Var).currentAccount;
                        new File(str2).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z4));
                    }
                    accountInstance.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance.getMessagesController().getUser(Long.valueOf(k50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(k50Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(k50Var.c);
                    }
                    x30Var.setCreateThumbFromParent(false);
                    x30Var.H(null, forUser, forUser2, true);
                    k50Var.c = null;
                    k50Var.b = null;
                    AndroidUtilities.updateVisibleRows(c60Var.N);
                    k50Var.a(1.0f);
                } else {
                    accountInstance = accountInstance2;
                }
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance.getUserConfig().saveConfig(true);
                break;
            case 2:
                e70.U((e70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 3:
                l70 l70Var = (l70) obj4;
                l70Var.d = (ArrayList) obj3;
                l70Var.e = (ArrayList) obj2;
                l70Var.l();
                m70 m70Var = l70Var.r;
                m70Var.b.d.setVisibility(8);
                m70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                m70Var.b.e(false, true);
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                g00 g00Var = (g00) obj2;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.y1;
                try {
                    g00Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject3;
                    Pattern pattern2 = org.telegram.ui.Components.z4.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str3 = tL_langPackLanguage.base_lang_code;
                    if (str3 != null) {
                        tL_langPackLanguage.base_lang_code = str3.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                    boolean equals = LocaleController.getInstance().getCurrentLocaleInfo().shortName.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    if (equals) {
                        d2Var.O = LocaleController.getString(R.string.Language);
                        formatString = LocaleController.formatString("LanguageSame", R.string.LanguageSame, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                        alertDialog$Builder.i(LocaleController.getString(R.string.SETTINGS), new org.telegram.ui.Components.g1(launchActivity, i24));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        d2Var.O = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        d2Var.O = LocaleController.getString(R.string.LanguageTitle);
                        formatString = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new mg.w(29, tL_langPackLanguage, launchActivity));
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l3(tL_langPackLanguage.translations_url, alertDialog$Builder), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                    alertDialog$Builder.n(textView);
                    launchActivity.B0(alertDialog$Builder);
                    break;
                } else if (tL_error2 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error2.text)) {
                        launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        b.i(R.string.ErrorOccurred, "\n", sb3);
                        sb3.append(tL_error2.text);
                        launchActivity.B0(org.telegram.ui.Components.z4.N(launchActivity, null, sb3.toString()));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj3;
                TLObject tLObject4 = (TLObject) obj4;
                i iVar = (i) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    d2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject4 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new g00(16, iVar, tL_error3));
                    break;
                }
                break;
            case 6:
                wb0 wb0Var = (wb0) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                org.telegram.ui.Components.ar.a(p2Var.getContext(), wb0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.Components.vk(15, wb0Var, userArr), p2Var.getResourceProvider(), wb0.b());
                break;
            case 7:
                tb0.t0((tb0) obj3, (TLObject) obj4, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 8:
                EditText editText = (EditText) obj2;
                cg.b0 b0Var = (cg.b0) obj;
                ((org.telegram.ui.Components.ad0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new g00(28, editText, b0Var));
                    break;
                }
                break;
            case 9:
                de0 de0Var = (de0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str4 != null ? AndroidUtilities.getStringBytes(str4) : null;
                ce0 ce0Var = new ce0(de0Var, str4, str5, i24);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = de0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                            tL_error4.text = "ALGO_INVALID";
                            ce0Var.run(null, tL_error4);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.p2) de0Var.B).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ce0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                    tL_error5.text = "PASSWORD_HASH_INVALID";
                    ce0Var.run(null, tL_error5);
                    break;
                }
            case 10:
                se0 se0Var = (se0) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                ng0 ng0Var = se0Var.y;
                ng0Var.k1(false, true);
                se0Var.n = false;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", se0Var.h);
                    ng0Var.u1(9, true, bundle, false);
                    break;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error6.text);
                        break;
                    }
                } else {
                    se0Var.o(true);
                    break;
                }
                break;
            case 11:
                rf0 rf0Var = (rf0) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj;
                TLObject tLObject5 = (TLObject) obj4;
                ng0 ng0Var2 = rf0Var.p0;
                rf0Var.a0 = false;
                if (tL_error7 == null) {
                    rf0Var.l0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject5;
                    rf0Var.m0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        rf0Var.d0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        rf0Var.d0 = 16;
                    }
                    ng0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str7 = tL_error7.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            rf0Var.c(true);
                            ng0Var2.u1(0, true, null, true);
                            ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb4 = new StringBuilder();
                            b.i(R.string.ErrorOccurred, "\n", sb4);
                            sb4.append(tL_error7.text);
                            ng0Var2.l1(string, sb4.toString());
                        }
                    }
                }
                rf0Var.z(false);
                break;
            case 12:
                wf0.o((wf0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 13:
                p2.n nVar = (p2.n) obj3;
                w3 w3Var = (w3) obj2;
                ng0 ng0Var3 = ((wf0) obj4).v;
                ng0Var3.e = true;
                BillingController.getInstance().addResultListener(nVar.c, new j3(w3Var, 3));
                BillingController.getInstance().setOnCanceled(new vf0(w3Var, i23));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = ng0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.p2) ng0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                n7.qa qaVar = new n7.qa(23);
                qaVar.i1(nVar);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(qaVar.Q0()));
                break;
            case 14:
                mg0 mg0Var = (mg0) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj4;
                String str8 = (String) obj;
                mg0Var.H = false;
                ng0 ng0Var4 = mg0Var.S;
                ng0Var4.v1(false, true);
                if (tL_error8 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (TwoStepVerificationActivity.i0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str8);
                        ng0Var4.u1(6, true, bundle3, false);
                        break;
                    } else {
                        org.telegram.ui.Components.z4.x0(ng0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    ng0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error8.text);
                    break;
                }
            case 15:
                xi0 xi0Var = (xi0) obj4;
                wf.b bVar = (wf.b) obj3;
                String str9 = (String) obj2;
                fa1 fa1Var = (fa1) obj;
                aj0 aj0Var = xi0Var.v.d;
                if (bVar != null) {
                    aj0Var.v.put(str9, bVar);
                }
                if (bVar != null && !fa1Var.b && (i19 = fa1Var.a) >= 0) {
                    View m11 = aj0Var.h.m(i19);
                    if (m11 instanceof q91) {
                        xi0Var.r.e = bVar;
                        q91 q91Var = (q91) m11;
                        q91Var.b.q0.d(false, false);
                        q91Var.g(false);
                    }
                }
                xi0Var.f();
                break;
            case 16:
                gk0 gk0Var = (gk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                tf.k1 k1Var = gk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = gk0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    gk0Var.f = null;
                    gk0Var.d = arrayList5;
                    gk0Var.e = arrayList6;
                    k1Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f && !k1Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    gk0Var.l();
                    break;
                }
                break;
            case 17:
                jo0 jo0Var = (jo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                jo0Var.X0 = true;
                jo0Var.c1 = 1;
                jo0Var.x0((org.telegram.ui.ActionBar.e5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = jo0Var.Y0;
                boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z10 && (io0Var2 = jo0Var.W0) != null) {
                    io0Var2.a(jo0Var.c1);
                }
                jo0Var.t0();
                if (z10 && (io0Var = jo0Var.W0) != null) {
                    io0Var.a(jo0Var.c1);
                }
                long r02 = jo0Var.r0();
                if (r02 > 0) {
                    str = UserObject.getForcedFirstName(jo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else if (r02 < 0 && (chat = jo0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                    str = chat.title;
                }
                long q02 = jo0Var.q0();
                int i27 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                String string2 = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                if (!z10) {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, jo0Var.O0[0], jo0Var.n0);
                } else if (z12) {
                    formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                } else {
                    formatString2 = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(U);
                    if (r02 == 0 || string2 == null || z12) {
                        String str10 = string2;
                        M = str10 != null ? a02.M(str10, replaceTags, i27) : a02.Q(i27, 36, replaceTags);
                    } else {
                        M = a02.K(i27, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new lh.s9(r02, 2));
                    }
                    org.telegram.ui.Components.ic icVar = M;
                    icVar.r = false;
                    icVar.j = 5000;
                    eg.e1 e1Var = new eg.e1(jo0Var, icVar, z11, message, 5);
                    org.telegram.ui.Components.nb nbVar = icVar.e;
                    if (nbVar != null) {
                        nbVar.setOnClickListener(e1Var);
                    }
                    icVar.k(z12);
                    break;
                }
                break;
            case 18:
                jo0.d0((jo0) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str11 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new mq0(photoViewer, i21));
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
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str11));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                        float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                        canvas2.scale(max5, max5);
                        canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new a30(photoViewer, photoEntry, str11, createBitmap2, 20));
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        AndroidUtilities.runOnUIThread(new mq0(photoViewer, i28));
                        return;
                    }
                }
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str12 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str12;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.n5.b.setLoading(false);
                hu0 hu0Var = photoViewer2.d;
                if (hu0Var != null) {
                    hu0Var.W(photoViewer2.M4);
                }
                ds0 ds0Var = photoViewer2.d1;
                if (ds0Var != null) {
                    ds0Var.setImage(bitmap);
                }
                photoViewer2.e3(0);
                CheckBox checkBox = photoViewer2.K0;
                if (!checkBox.x) {
                    checkBox.callOnClick();
                    break;
                }
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                jr0 jr0Var = (jr0) obj;
                ImageView imageView = photoViewer3.u3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.u3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.z2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        jr0Var.run();
                        break;
                    }
                }
                break;
            case 22:
                TLObject tLObject7 = (TLObject) obj4;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((wr0) obj3).b;
                if (tLObject7 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject7;
                    int i31 = photoViewer4.Q;
                    ArrayList arrayList8 = photoViewer4.c7;
                    MessagesController.getInstance(i31).putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer4.Q).getUser(Long.valueOf(userConfig.clientUserId));
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
            case 23:
                yv0.U((yv0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj4, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 24:
                PrivacyControlActivity.V((PrivacyControlActivity) obj3, (TLRPC.TL_error) obj2, (TLObject) obj4, (boolean[]) obj);
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj3;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj2;
                TLObject tLObject8 = (TLObject) obj4;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    d2Var3.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.N = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
            case 26:
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.d2) obj4).dismiss();
                } catch (Exception unused2) {
                }
                if (zArr2[0]) {
                    int i32 = Build.VERSION.SDK_INT;
                    Uri d = i32 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i32 >= 24) {
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
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                    }
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    break;
                }
                break;
            case 27:
                a();
                break;
            case 28:
                b();
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str13 = (String) obj2;
                String str14 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity.getParentActivity())) {
                    org.telegram.ui.Components.v31.J(profileActivity.getParentActivity(), profileActivity, strArr[0], str13, str14, new h20(profileActivity, i22), null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a30(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ a30(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tLObject;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ a30(rf0 rf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.a = 11;
        this.c = rf0Var;
        this.d = tL_error;
        this.e = bundle;
        this.b = tLObject;
    }
}

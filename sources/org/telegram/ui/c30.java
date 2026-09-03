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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c30(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
            f20.a(profileActivity.getParentActivity(), 0, tL_username.username, profileActivity.b1 != 0 ? profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1)) : profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.c1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.w0);
        } else {
            org.telegram.ui.Components.qc.b0(tL_error);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ae  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e60 e60Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String formatString;
        int i16;
        int i17;
        char c3;
        String formatPluralString;
        int i18;
        int i19;
        int i20;
        char c10;
        String formatString2;
        org.telegram.ui.ActionBar.p2 U;
        ko0 ko0Var;
        ko0 ko0Var2;
        int i21 = this.a;
        int i22 = 10;
        String str = "";
        int i23 = 24;
        int i24 = 2;
        int i25 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i21) {
            case 0:
                TLObject tLObject = (TLObject) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                org.telegram.ui.Components.jy0 jy0Var = (org.telegram.ui.Components.jy0) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    for (int i26 = 0; i26 < Math.min(arrayList.size(), vector.objects.size()); i26++) {
                        if (vector.objects.get(i26) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i26)).id));
                        }
                    }
                }
                jy0Var.run();
                break;
            case 1:
                m50 m50Var = (m50) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj4;
                String str2 = (String) obj;
                e60 e60Var2 = m50Var.f;
                AccountInstance accountInstance = e60Var2.d;
                z30 z30Var = e60Var2.b;
                ImageLocation imageLocation = m50Var.d;
                if (imageLocation != null) {
                    z30Var.H0 = imageLocation;
                    z30Var.n1 = null;
                    z30Var.o1 = null;
                    m50Var.d = null;
                }
                if (tL_error == null) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(accountInstance.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = accountInstance.getUserConfig().getCurrentUser();
                        if (user != null) {
                            accountInstance.getMessagesController().putUser(user, false);
                        }
                    } else {
                        accountInstance.getUserConfig().setCurrentUser(user);
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
                    if (closestPhotoSizeWithSize == null || m50Var.c == null) {
                        e60Var = e60Var2;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.g3) e60Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.g3) e60Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(m50Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb = new StringBuilder();
                        sb.append(m50Var.c.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(m50Var.c.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        e60Var = e60Var2;
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        String m10 = android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.g3) e60Var).currentAccount;
                        imageLoader.replaceImageInCache(m9, m10, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && m50Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.g3) e60Var).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i12 = ((org.telegram.ui.ActionBar.g3) e60Var).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(m50Var.b, true).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str2 != null) {
                        i10 = ((org.telegram.ui.ActionBar.g3) e60Var).currentAccount;
                        new File(str2).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", true));
                    }
                    accountInstance.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance.getMessagesController().getUser(Long.valueOf(m50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(m50Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(m50Var.c);
                    }
                    z30Var.setCreateThumbFromParent(false);
                    z30Var.H(null, forUser, forUser2, true);
                    m50Var.c = null;
                    m50Var.b = null;
                    AndroidUtilities.updateVisibleRows(e60Var.N);
                    m50Var.a(1.0f);
                }
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance.getUserConfig().saveConfig(true);
                break;
            case 2:
                g70.U((g70) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 3:
                n70 n70Var = (n70) obj4;
                n70Var.d = (ArrayList) obj3;
                n70Var.e = (ArrayList) obj2;
                n70Var.l();
                o70 o70Var = n70Var.r;
                o70Var.b.d.setVisibility(8);
                o70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                o70Var.b.e(false, true);
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                w10 w10Var = (w10) obj2;
                TLObject tLObject3 = (TLObject) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.y1;
                try {
                    w10Var.run();
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
                        alertDialog$Builder.i(LocaleController.getString(R.string.SETTINGS), new org.telegram.ui.Components.g1(launchActivity, 0));
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
                        int i27 = indexOf + 1;
                        i16 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i27);
                        if (i16 != -1) {
                            spannableStringBuilder.delete(i16, i16 + 1);
                            spannableStringBuilder.delete(indexOf, i27);
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
                    AndroidUtilities.runOnUIThread(new w10(15, iVar, tL_error3));
                    break;
                }
                break;
            case 6:
                yb0 yb0Var = (yb0) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                org.telegram.ui.Components.zq.a(p2Var.getContext(), yb0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.Components.vk(15, yb0Var, userArr), p2Var.getResourceProvider(), yb0.b());
                break;
            case 7:
                vb0.t0((vb0) obj3, (TLObject) obj4, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 8:
                EditText editText = (EditText) obj2;
                cg.b0 b0Var = (cg.b0) obj;
                ((org.telegram.ui.Components.bd0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new w10(27, editText, b0Var));
                    break;
                }
                break;
            case 9:
                fe0 fe0Var = (fe0) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str4 != null ? AndroidUtilities.getStringBytes(str4) : null;
                ee0 ee0Var = new ee0(fe0Var, str4, str5, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = fe0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error4 = new TLRPC.TL_error();
                            tL_error4.text = "ALGO_INVALID";
                            ee0Var.run(null, tL_error4);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.p2) fe0Var.B).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ee0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                    tL_error5.text = "PASSWORD_HASH_INVALID";
                    ee0Var.run(null, tL_error5);
                    break;
                }
            case 10:
                ue0 ue0Var = (ue0) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                pg0 pg0Var = ue0Var.y;
                pg0Var.k1(false, true);
                ue0Var.n = false;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", ue0Var.h);
                    pg0Var.u1(9, true, bundle, false);
                    break;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        int i28 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        pg0Var.l1(string, LocaleController.formatString("FloodWaitTime", i28, objArr));
                        break;
                    } else {
                        pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error6.text);
                        break;
                    }
                } else {
                    ue0Var.o(true);
                    break;
                }
                break;
            case 11:
                tf0 tf0Var = (tf0) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj;
                TLObject tLObject5 = (TLObject) obj4;
                pg0 pg0Var2 = tf0Var.p0;
                tf0Var.a0 = false;
                if (tL_error7 == null) {
                    tf0Var.l0 = bundle2;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject5;
                    tf0Var.m0 = tL_auth_sentCode;
                    TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                    if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                        tf0Var.d0 = 17;
                    } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                        tf0Var.d0 = 16;
                    }
                    pg0Var2.g1(bundle2, tL_auth_sentCode, true);
                } else {
                    String str7 = tL_error7.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error7.text.contains("PHONE_CODE_EMPTY") || tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                            tf0Var.c(true);
                            pg0Var2.u1(0, true, null, true);
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                            pg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error7.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb4 = new StringBuilder();
                            b.i(R.string.ErrorOccurred, "\n", sb4);
                            sb4.append(tL_error7.text);
                            pg0Var2.l1(string2, sb4.toString());
                        }
                    }
                }
                tf0Var.z(false);
                break;
            case 12:
                yf0.o((yf0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 13:
                p2.n nVar = (p2.n) obj3;
                y3 y3Var = (y3) obj2;
                pg0 pg0Var3 = ((yf0) obj4).v;
                pg0Var3.e = true;
                BillingController.getInstance().addResultListener(nVar.c, new l3(y3Var, 3));
                BillingController.getInstance().setOnCanceled(new xf0(y3Var, i25));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = pg0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.p2) pg0Var3).currentAccount;
                AccountInstance accountInstance2 = AccountInstance.getInstance(i18);
                n7.qa qaVar = new n7.qa(i23);
                qaVar.L0(nVar);
                billingController.launchBillingFlow(parentActivity, accountInstance2, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(qaVar.X()));
                break;
            case 14:
                og0 og0Var = (og0) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj4;
                String str8 = (String) obj;
                og0Var.H = false;
                pg0 pg0Var4 = og0Var.S;
                pg0Var4.v1(false, true);
                if (tL_error8 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject6;
                    if (TwoStepVerificationActivity.i0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str8);
                        pg0Var4.u1(6, true, bundle3, false);
                        break;
                    } else {
                        org.telegram.ui.Components.z4.x0(pg0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    pg0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error8.text);
                    break;
                }
            case 15:
                zi0 zi0Var = (zi0) obj4;
                wf.b bVar = (wf.b) obj3;
                String str9 = (String) obj2;
                na1 na1Var = (na1) obj;
                cj0 cj0Var = zi0Var.v.d;
                if (bVar != null) {
                    cj0Var.v.put(str9, bVar);
                }
                if (bVar != null && !na1Var.b && (i19 = na1Var.a) >= 0) {
                    View m11 = cj0Var.h.m(i19);
                    if (m11 instanceof y91) {
                        zi0Var.r.e = bVar;
                        y91 y91Var = (y91) m11;
                        y91Var.b.q0.d(false, false);
                        y91Var.g(false);
                    }
                }
                zi0Var.f();
                break;
            case 16:
                ik0 ik0Var = (ik0) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                tf.j1 j1Var = ik0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = ik0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    ik0Var.f = null;
                    ik0Var.d = arrayList5;
                    ik0Var.e = arrayList6;
                    j1Var.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f && !j1Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    ik0Var.l();
                    break;
                }
                break;
            case 17:
                lo0 lo0Var = (lo0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                lo0Var.X0 = true;
                lo0Var.c1 = 1;
                lo0Var.x0((org.telegram.ui.ActionBar.e5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = lo0Var.Y0;
                boolean z4 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z10 = z4 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z11 = z4 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z4 && (ko0Var2 = lo0Var.W0) != null) {
                    ko0Var2.a(lo0Var.c1);
                }
                lo0Var.t0();
                if (z4 && (ko0Var = lo0Var.W0) != null) {
                    ko0Var.a(lo0Var.c1);
                }
                long r02 = lo0Var.r0();
                int i29 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                if (i29 > 0) {
                    str = UserObject.getForcedFirstName(lo0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else if (i29 < 0) {
                    i20 = i29;
                    c10 = 0;
                    TLRPC.Chat chat = lo0Var.getMessagesController().getChat(Long.valueOf(-r02));
                    if (chat != null) {
                        str = chat.title;
                    }
                    long q02 = lo0Var.q0();
                    int i30 = !z4 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String string3 = z4 ? LocaleController.getString(z11 ? R.string.StarsGiveawaySentPopup : z10 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (z4) {
                        int i31 = R.string.PaymentInfoHint;
                        String str10 = lo0Var.O0[c10];
                        String str11 = lo0Var.n0;
                        Object[] objArr2 = new Object[2];
                        objArr2[c10] = str10;
                        objArr2[1] = str11;
                        formatString2 = LocaleController.formatString(i31, objArr2);
                    } else if (z11) {
                        formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        String str12 = z10 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                        int i32 = (int) q02;
                        Object[] objArr3 = new Object[1];
                        objArr3[c10] = str;
                        formatString2 = LocaleController.formatPluralStringComma(str12, i32, objArr3);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                    U = LaunchActivity.U();
                    if (U == null) {
                        org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(U);
                        org.telegram.ui.Components.ic M = (i20 == 0 || string3 == null || z11) ? string3 != null ? a02.M(string3, replaceTags, i30) : a02.Q(i30, 36, replaceTags) : a02.K(i30, string3, replaceTags, LocaleController.getString(R.string.ViewInChat), new lh.s9(r02, i24));
                        M.r = false;
                        M.j = 5000;
                        eg.e1 e1Var = new eg.e1(lo0Var, M, z10, message, 5);
                        org.telegram.ui.Components.nb nbVar = M.e;
                        if (nbVar != null) {
                            nbVar.setOnClickListener(e1Var);
                        }
                        M.k(z11);
                        break;
                    }
                }
                i20 = i29;
                c10 = 0;
                long q022 = lo0Var.q0();
                int i302 = !z4 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z4) {
                }
                String string32 = z4 ? LocaleController.getString(z11 ? R.string.StarsGiveawaySentPopup : z10 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                if (z4) {
                }
                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString2);
                U = LaunchActivity.U();
                if (U == null) {
                }
                break;
            case 18:
                lo0.d0((lo0) obj3, (TLObject) obj4, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str13 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new tq0(photoViewer, i22));
                    break;
                } else {
                    int i33 = 11;
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
                    int i34 = (int) (f10 * max3);
                    int i35 = (int) (f11 * max3);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(i34, i35, config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                    float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                    canvas.scale(max4, max4);
                    canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str13));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                        float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                        canvas2.scale(max5, max5);
                        canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new c30(photoViewer, photoEntry, str13, createBitmap2, 20));
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        AndroidUtilities.runOnUIThread(new tq0(photoViewer, i33));
                        return;
                    }
                }
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str14 = (String) obj2;
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
                photoEntry2.coverPath = str14;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.n5.b.setLoading(false);
                ou0 ou0Var = photoViewer2.d;
                if (ou0Var != null) {
                    ou0Var.W(photoViewer2.M4);
                }
                ks0 ks0Var = photoViewer2.d1;
                if (ks0Var != null) {
                    ks0Var.setImage(bitmap);
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
                qr0 qr0Var = (qr0) obj;
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
                        qr0Var.run();
                        break;
                    }
                }
                break;
            case 22:
                TLObject tLObject7 = (TLObject) obj4;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((ds0) obj3).b;
                if (tLObject7 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject7;
                    int i36 = photoViewer4.Q;
                    ArrayList arrayList8 = photoViewer4.c7;
                    MessagesController.getInstance(i36).putUsers(tL_photos_photo2.users, false);
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
                fw0.U((fw0) obj3, (TLRPC.TL_error) obj2, (TLObject) obj4, (TL_stars.updatePaidMessagesPrice) obj);
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
                    int i37 = Build.VERSION.SDK_INT;
                    Uri d = i37 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i37 >= 24) {
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
                String str15 = (String) obj2;
                String str16 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity.getParentActivity())) {
                    org.telegram.ui.Components.v31.J(profileActivity.getParentActivity(), profileActivity, strArr[0], str15, str16, new j20(profileActivity, i24), null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c30(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = tLObject;
        this.e = obj3;
    }

    public /* synthetic */ c30(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tLObject;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c30(tf0 tf0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.a = 11;
        this.c = tf0Var;
        this.d = tL_error;
        this.e = bundle;
        this.b = tLObject;
    }
}

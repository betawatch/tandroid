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
import android.view.KeyEvent;
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
import org.telegram.messenger.MediaDataController;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gb1;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ey0(KeyEvent.Callback callback, Object obj, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.d = callback;
        this.e = obj;
        this.c = tLObject;
        this.b = tL_error;
    }

    private final void a() {
        PhotoViewer photoViewer = (PhotoViewer) this.d;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.b;
        String str = (String) this.c;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.U8;
        if (photoEntry.coverPath != null) {
            try {
                new File(photoEntry.coverPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        photoEntry.coverSavedPosition = -1L;
        photoEntry.coverPath = str;
        photoEntry.coverPhoto = null;
        photoEntry.coverPhotoParentObject = null;
        photoViewer.q5.b.setLoading(false);
        org.telegram.ui.hv0 hv0Var = photoViewer.d;
        if (hv0Var != null) {
            hv0Var.X(photoViewer.P4);
        }
        org.telegram.ui.ft0 ft0Var = photoViewer.g1;
        if (ft0Var != null) {
            ft0Var.setImage(bitmap);
        }
        photoViewer.e3(0);
        CheckBox checkBox = photoViewer.N0;
        if (checkBox.x) {
            return;
        }
        checkBox.callOnClick();
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
        sc M;
        org.telegram.ui.zo0 zo0Var;
        org.telegram.ui.zo0 zo0Var2;
        int i20 = this.a;
        int i21 = 3;
        int i22 = 10;
        int i23 = 1;
        int i24 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i20) {
            case 0:
                uy0.G((uy0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (MediaDataController) obj);
                break;
            case 1:
                uy0.q((org.telegram.ui.xs0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_messages_getAttachedStickers) obj);
                break;
            case 2:
                h11 h11Var = (h11) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                try {
                    ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesController.getInstance(h11Var.d).performLogout(0);
                    break;
                } else if (tL_error == null || tL_error.code != -1000) {
                    String string = LocaleController.getString(R.string.ErrorOccurred);
                    if (tL_error != null) {
                        StringBuilder i25 = t8.b.i(string, "\n");
                        i25.append(tL_error.text);
                        string = i25.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h11Var.getContext());
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                    a2Var.R = string2;
                    a2Var.T = string;
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                    break;
                }
                break;
            case 3:
                y31 y31Var = (y31) obj4;
                ((l80) obj2).u();
                ((MessagesController) obj3).getTopicsController().pinTopic(-y31Var.c, ((TLRPC.TL_forumTopic) obj).id, !r7.pinned, y31Var.h);
                break;
            case 4:
                x41.o((x41) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TLRPC.TL_textWithEntities) obj);
                break;
            case 5:
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj3;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                AccountInstance accountInstance = n60Var.d;
                ChatObject.Call call = new ChatObject.Call();
                n60Var.a1 = call;
                call.call = new TLRPC.TL_groupCall();
                ChatObject.Call call2 = n60Var.a1;
                TLRPC.GroupCall groupCall = call2.call;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                call2.chatId = chat2 != null ? chat2.id : 0L;
                groupCall.schedule_date = n60Var.k2;
                groupCall.flags |= 128;
                call2.currentAccount = accountInstance;
                call2.setSelfPeer(inputPeer);
                ChatObject.Call call3 = n60Var.a1;
                TLRPC.GroupCall groupCall2 = call3.call;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                call3.createNoVideoParticipant();
                f30 f30Var = n60Var.p2;
                ChatObject.Call call4 = n60Var.a1;
                f30Var.c = call4;
                n60Var.a2.setGroupCall(call4);
                n60Var.o2.c = n60Var.a1;
                n60Var.c0.C0(accountInstance.getCurrentAccount(), n60Var.a1.getInputGroupCall(false));
                MessagesController messagesController = accountInstance.getMessagesController();
                ChatObject.Call call5 = n60Var.a1;
                messagesController.putGroupCall(call5.chatId, call5);
                break;
            case 6:
                org.telegram.ui.n60.y((org.telegram.ui.n60) obj4, (HashSet) obj2, (ChatObject.Call) obj3, (String) obj);
                break;
            case 7:
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                bi.c3 c3Var = (bi.c3) obj;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    for (int i26 = 0; i26 < Math.min(arrayList.size(), vector.objects.size()); i26++) {
                        if (vector.objects.get(i26) instanceof TL_account.requirementToContactPremium) {
                            arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i26)).id));
                        }
                    }
                }
                c3Var.run();
                break;
            case 8:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject3 = (TLObject) obj3;
                String str2 = (String) obj;
                org.telegram.ui.n60 n60Var2 = u50Var.f;
                AccountInstance accountInstance2 = n60Var2.d;
                org.telegram.ui.g40 g40Var = n60Var2.b;
                ImageLocation imageLocation = u50Var.d;
                if (imageLocation != null) {
                    g40Var.K0 = imageLocation;
                    g40Var.q1 = null;
                    g40Var.r1 = null;
                    u50Var.d = null;
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
                    if (closestPhotoSizeWithSize == null || u50Var.c == null) {
                        z10 = true;
                    } else {
                        i13 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        File pathToAttach = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize, true);
                        i14 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(u50Var.c, true).renameTo(pathToAttach);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(u50Var.c.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(u50Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i15 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUser(i15, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && u50Var.b != null) {
                        i11 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, z10);
                        i12 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(u50Var.b, z10).renameTo(pathToAttach2);
                    }
                    if (videoSize != null && str2 != null) {
                        i10 = ((org.telegram.ui.ActionBar.e3) n60Var2).currentAccount;
                        new File(str2).renameTo(FileLoader.getInstance(i10).getPathToAttach(videoSize, "mp4", z10));
                    }
                    accountInstance2.getMessagesController().getDialogPhotos(user.id).reset();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    accountInstance2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.User user2 = accountInstance2.getMessagesController().getUser(Long.valueOf(u50Var.e));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 0);
                    ImageLocation forUser2 = ImageLocation.getForUser(accountInstance2.getCurrentAccount(), user2, 1);
                    if (ImageLocation.getForLocal(u50Var.b) == null) {
                        forUser2 = ImageLocation.getForLocal(u50Var.c);
                    }
                    g40Var.setCreateThumbFromParent(false);
                    g40Var.H(null, forUser, forUser2, true);
                    u50Var.c = null;
                    u50Var.b = null;
                    AndroidUtilities.updateVisibleRows(n60Var2.Q);
                    u50Var.a(1.0f);
                }
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                accountInstance2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                accountInstance2.getUserConfig().saveConfig(true);
                break;
            case 9:
                org.telegram.ui.p70.U((org.telegram.ui.p70) obj4, (ArrayList) obj2, (ArrayList) obj3, (CountDownLatch) obj);
                break;
            case 10:
                org.telegram.ui.x70 x70Var = (org.telegram.ui.x70) obj4;
                x70Var.d = (ArrayList) obj2;
                x70Var.e = (ArrayList) obj3;
                x70Var.l();
                org.telegram.ui.y70 y70Var = x70Var.r;
                y70Var.b.d.setVisibility(8);
                y70Var.b.e.setText(LocaleController.formatString(R.string.ChooseStickerNoResultsFound, (String) obj));
                y70Var.b.e(false, true);
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.d20 d20Var = (org.telegram.ui.d20) obj;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                try {
                    d20Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject4 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject4;
                    Pattern pattern2 = g5.a;
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
                        alertDialog$Builder2.i(LocaleController.getString(R.string.SETTINGS), new h1(launchActivity, i24));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        a2Var2.R = LocaleController.getString(R.string.LanguageUnknownTitle);
                        formatString = LocaleController.formatString("LanguageUnknownCustomAlert", R.string.LanguageUnknownCustomAlert, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
                    } else {
                        a2Var2.R = LocaleController.getString(R.string.LanguageTitle);
                        formatString = tL_langPackLanguage.official ? LocaleController.formatString("LanguageAlert", R.string.LanguageAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : LocaleController.formatString("LanguageCustomAlert", R.string.LanguageCustomAlert, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Change), new m4.y0(25, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
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
                        spannableStringBuilder.setSpan(new r3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i16 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k5, false));
                    textView.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.l5, false));
                    textView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
                    textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
                    alertDialog$Builder2.n(textView);
                    launchActivity.B0(alertDialog$Builder2);
                    break;
                } else if (tL_error3 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error3.text)) {
                        launchActivity.B0(g5.M(launchActivity, null, LocaleController.getString(R.string.LanguageUnsupportedError)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb4);
                        sb4.append(tL_error3.text);
                        launchActivity.B0(g5.M(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                org.telegram.ui.h hVar = (org.telegram.ui.h) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    a2Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject5 instanceof TLRPC.TL_authorization)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.d20(15, hVar, tL_error4));
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ic0 ic0Var = (org.telegram.ui.ic0) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                qr.e(m2Var.getContext(), ic0Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new org.telegram.ui.mt(5, ic0Var, userArr), m2Var.getResourceProvider(), org.telegram.ui.ic0.d());
                break;
            case 14:
                org.telegram.ui.fc0.t0((org.telegram.ui.fc0) obj4, (TLObject) obj3, (HashSet) obj, (TLRPC.TL_error) obj2);
                break;
            case 15:
                EditText editText = (EditText) obj3;
                eo eoVar = (eo) obj;
                ((yd0) obj4).a(0.0f);
                ((View) obj2).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.d20(27, editText, eoVar));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.pe0 pe0Var = (org.telegram.ui.pe0) obj4;
                String str4 = (String) obj2;
                String str5 = (String) obj3;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] stringBytes = str4 != null ? AndroidUtilities.getStringBytes(str4) : null;
                org.telegram.ui.ne0 ne0Var = new org.telegram.ui.ne0(pe0Var, str4, str5, i24);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = pe0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str4 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error5 = new TLRPC.TL_error();
                            tL_error5.text = "ALGO_INVALID";
                            ne0Var.run(null, tL_error5);
                        }
                    }
                    i17 = ((org.telegram.ui.ActionBar.m2) pe0Var.E).currentAccount;
                    ConnectionsManager.getInstance(i17).sendRequest(tL_auth_recoverPassword, ne0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error6 = new TLRPC.TL_error();
                    tL_error6.text = "PASSWORD_HASH_INVALID";
                    ne0Var.run(null, tL_error6);
                    break;
                }
            case 17:
                org.telegram.ui.ef0 ef0Var = (org.telegram.ui.ef0) obj4;
                String str6 = (String) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ah0 ah0Var = ef0Var.y;
                ah0Var.k1(false, true);
                ef0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str6);
                    bundle.putString("password", ef0Var.h);
                    ah0Var.u1(9, true, bundle, false);
                    break;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        ah0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error7.text);
                        break;
                    }
                } else {
                    ef0Var.o(true);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.dg0 dg0Var = (org.telegram.ui.dg0) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                Bundle bundle2 = (Bundle) obj;
                TLObject tLObject6 = (TLObject) obj3;
                org.telegram.ui.ah0 ah0Var2 = dg0Var.s0;
                dg0Var.d0 = false;
                if (tL_error8 == null) {
                    dg0Var.o0 = bundle2;
                    if (tLObject6 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject6;
                        dg0Var.p0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            dg0Var.g0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            dg0Var.g0 = 16;
                        }
                        ah0Var2.g1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject6 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject6;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        ah0Var2.u1(18, true, bundle2, true);
                    }
                } else {
                    String str7 = tL_error8.text;
                    if (str7 != null) {
                        if (str7.contains("PHONE_NUMBER_INVALID")) {
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error8.text.contains("PHONE_CODE_EMPTY") || tL_error8.text.contains("PHONE_CODE_INVALID")) {
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error8.text.contains("PHONE_CODE_EXPIRED")) {
                            dg0Var.c(true);
                            ah0Var2.u1(0, true, null, true);
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error8.text.startsWith("FLOOD_WAIT")) {
                            ah0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error8.code != -1000) {
                            String string3 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb5);
                            sb5.append(tL_error8.text);
                            ah0Var2.l1(string3, sb5.toString());
                        }
                    }
                }
                dg0Var.z(false);
                break;
            case 19:
                org.telegram.ui.jg0.o((org.telegram.ui.jg0) obj4, (String) obj2, (String) obj3, (String) obj);
                break;
            case 20:
                c5.p pVar = (c5.p) obj2;
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj3;
                org.telegram.ui.ah0 ah0Var3 = ((org.telegram.ui.jg0) obj4).v;
                ah0Var3.e = true;
                BillingController.getInstance().addResultListener(pVar.c, new org.telegram.ui.j3(v3Var, i21));
                BillingController.getInstance().setOnCanceled(new org.telegram.ui.hg0(v3Var, i23));
                BillingController billingController = BillingController.getInstance();
                Activity parentActivity = ah0Var3.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.m2) ah0Var3).currentAccount;
                AccountInstance accountInstance3 = AccountInstance.getInstance(i18);
                qf.b bVar = new qf.b(9);
                bVar.e0(pVar);
                billingController.launchBillingFlow(parentActivity, accountInstance3, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.v()));
                break;
            case 21:
                org.telegram.ui.zg0 zg0Var = (org.telegram.ui.zg0) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                TLObject tLObject7 = (TLObject) obj3;
                String str8 = (String) obj;
                zg0Var.K = false;
                org.telegram.ui.ah0 ah0Var4 = zg0Var.V;
                ah0Var4.v1(false, true);
                if (tL_error9 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject7;
                    if (TwoStepVerificationActivity.i0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str8);
                        ah0Var4.u1(6, true, bundle3, false);
                        break;
                    } else {
                        g5.w0(ah0Var4.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    ah0Var4.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error9.text);
                    break;
                }
            case 22:
                org.telegram.ui.mj0 mj0Var = (org.telegram.ui.mj0) obj4;
                kg.b bVar2 = (kg.b) obj2;
                String str9 = (String) obj3;
                gb1 gb1Var = (gb1) obj;
                org.telegram.ui.pj0 pj0Var = mj0Var.v.d;
                if (bVar2 != null) {
                    pj0Var.v.put(str9, bVar2);
                }
                if (bVar2 != null && !gb1Var.b && (i19 = gb1Var.a) >= 0) {
                    View m10 = pj0Var.h.m(i19);
                    if (m10 instanceof ra1) {
                        mj0Var.r.e = bVar2;
                        ra1 ra1Var = (ra1) m10;
                        ra1Var.b.t0.d(false, false);
                        ra1Var.g(false);
                    }
                }
                mj0Var.f();
                break;
            case 23:
                org.telegram.ui.vk0 vk0Var = (org.telegram.ui.vk0) obj4;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                hg.a2 a2Var4 = vk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = vk0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    vk0Var.f = null;
                    vk0Var.d = arrayList5;
                    vk0Var.e = arrayList6;
                    a2Var4.f(arrayList7, null);
                    if (notificationsCustomSettingsActivity.f && !a2Var4.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    vk0Var.l();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ap0 ap0Var = (org.telegram.ui.ap0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                ap0Var.a1 = true;
                ap0Var.f1 = 1;
                ap0Var.x0((org.telegram.ui.ActionBar.b5) obj2, (Activity) obj3);
                TLRPC.InputInvoice inputInvoice = ap0Var.b1;
                boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z11 && (zo0Var2 = ap0Var.Z0) != null) {
                    zo0Var2.a(ap0Var.f1);
                }
                ap0Var.t0();
                if (z11 && (zo0Var = ap0Var.Z0) != null) {
                    zo0Var.a(ap0Var.f1);
                }
                long r02 = ap0Var.r0();
                if (r02 > 0) {
                    str = UserObject.getForcedFirstName(ap0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else {
                    str = "";
                    if (r02 < 0 && (chat = ap0Var.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                }
                long q02 = ap0Var.q0();
                int i28 = z11 ? (z12 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                String string4 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z12 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                if (!z11) {
                    formatString2 = LocaleController.formatString(R.string.PaymentInfoHint, ap0Var.R0[0], ap0Var.q0);
                } else if (z13) {
                    formatString2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                } else {
                    formatString2 = LocaleController.formatPluralStringComma(z12 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString2);
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    zc a02 = zc.a0(U);
                    if (r02 == 0 || string4 == null || z13) {
                        String str10 = string4;
                        M = str10 != null ? a02.M(str10, replaceTags, i28) : a02.Q(i28, 36, replaceTags);
                    } else {
                        M = a02.K(i28, string4, replaceTags, LocaleController.getString(R.string.ViewInChat), new org.telegram.ui.bo0(r02, i23));
                    }
                    M.r = false;
                    M.j = 5000;
                    bi.y4 y4Var = new bi.y4(ap0Var, M, z12, message, 4);
                    wb wbVar = M.e;
                    if (wbVar != null) {
                        wbVar.setOnClickListener(y4Var);
                    }
                    M.k(z13);
                    break;
                }
                break;
            case 25:
                org.telegram.ui.ap0.d0((org.telegram.ui.ap0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 26:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                String str11 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj2).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.mr0(photoViewer, i22));
                    break;
                } else {
                    int i29 = 11;
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
                    int i30 = (int) (f7 * max3);
                    int i31 = (int) (f10 * max3);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(i30, i31, config);
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
                        AndroidUtilities.runOnUIThread(new ey0(photoViewer, photoEntry, str11, createBitmap2, 27));
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.mr0(photoViewer, i29));
                        return;
                    }
                }
            case 27:
                a();
                break;
            case 28:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj2;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ks0 ks0Var = (org.telegram.ui.ks0) obj;
                ImageView imageView = photoViewer2.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer2.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer2.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ks0Var.run();
                        break;
                    }
                }
                break;
            default:
                TLObject tLObject8 = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer3 = ((org.telegram.ui.ys0) obj4).b;
                if (tLObject8 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject8;
                    int i32 = photoViewer3.T;
                    ArrayList arrayList8 = photoViewer3.f7;
                    MessagesController.getInstance(i32).putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user3 = MessagesController.getInstance(photoViewer3.T).getUser(Long.valueOf(userConfig.clientUserId));
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
        }
    }

    public /* synthetic */ ey0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public /* synthetic */ ey0(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = tLObject;
        this.b = obj2;
        this.e = tLObject2;
    }

    public /* synthetic */ ey0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = tLObject;
        this.e = obj2;
        this.b = tL_error;
    }

    public /* synthetic */ ey0(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, bi.c3 c3Var) {
        this.a = 7;
        this.c = tLObject;
        this.d = arrayList;
        this.b = arrayList2;
        this.e = c3Var;
    }

    public /* synthetic */ ey0(org.telegram.ui.dg0 dg0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.a = 18;
        this.d = dg0Var;
        this.b = tL_error;
        this.e = bundle;
        this.c = tLObject;
    }
}

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
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cg0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0816  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String formatString;
        org.telegram.ui.ActionBar.r2 U;
        qo0 qo0Var;
        qo0 qo0Var2;
        int indexOf;
        int i11;
        int i12;
        org.telegram.ui.web.a1 a1Var;
        int i13 = this.a;
        int i14 = 3;
        String str = "";
        int i15 = 2;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i13) {
            case 0:
                hg0 hg0Var = (hg0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                hg0Var.M = false;
                ig0 ig0Var = hg0Var.a0;
                ig0Var.A1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (TwoStepVerificationActivity.j0(password, true)) {
                        Bundle bundle = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle.putString("phoneFormated", str2);
                        ig0Var.z1(6, true, bundle, false);
                        break;
                    } else {
                        org.telegram.ui.Components.g5.w0(ig0Var.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    break;
                }
            case 1:
                ui0 ui0Var = (ui0) obj4;
                lg.b bVar = (lg.b) obj3;
                String str3 = (String) obj;
                x91 x91Var = (x91) obj2;
                xi0 xi0Var = ui0Var.v.d;
                if (bVar != null) {
                    xi0Var.v.put(str3, bVar);
                }
                if (bVar != null && !x91Var.b && (i10 = x91Var.a) >= 0) {
                    View m10 = xi0Var.h.m(i10);
                    if (m10 instanceof i91) {
                        ui0Var.r.e = bVar;
                        i91 i91Var = (i91) m10;
                        i91Var.b.t0.d(false, false);
                        i91Var.g(false);
                    }
                }
                ui0Var.f();
                break;
            case 2:
                nk0 nk0Var = (nk0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                ig.a2 a2Var = nk0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = nk0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    nk0Var.f = null;
                    nk0Var.d = arrayList;
                    nk0Var.e = arrayList2;
                    a2Var.f(arrayList3, null);
                    if (notificationsCustomSettingsActivity.f && !a2Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    nk0Var.l();
                    break;
                }
                break;
            case 3:
                ro0 ro0Var = (ro0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                ro0Var.a1 = true;
                ro0Var.f1 = 1;
                ro0Var.y0((org.telegram.ui.ActionBar.j5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = ro0Var.b1;
                boolean z14 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                if (z14 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                    z10 = z14;
                    z11 = true;
                } else {
                    z10 = z14;
                    z11 = false;
                }
                boolean z15 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z10 && (qo0Var2 = ro0Var.Z0) != null) {
                    qo0Var2.a(ro0Var.f1);
                }
                ro0Var.u0();
                if (z10 && (qo0Var = ro0Var.Z0) != null) {
                    qo0Var.a(ro0Var.f1);
                }
                long s02 = ro0Var.s0();
                if (s02 > 0) {
                    str = UserObject.getForcedFirstName(ro0Var.getMessagesController().getUser(Long.valueOf(s02)));
                } else if (s02 < 0) {
                    boolean z16 = false;
                    z12 = z10;
                    TLRPC.Chat chat = ro0Var.getMessagesController().getChat(Long.valueOf(-s02));
                    z13 = z16;
                    if (chat != null) {
                        str = chat.title;
                        z13 = z16;
                    }
                    long r02 = ro0Var.r0();
                    int i16 = !z12 ? (z11 || z15) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String string = z12 ? LocaleController.getString(z15 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (z12) {
                        int i17 = R.string.PaymentInfoHint;
                        String str4 = ro0Var.R0[z13];
                        String str5 = ro0Var.q0;
                        Object[] objArr = new Object[2];
                        objArr[z13] = str4;
                        objArr[1] = str5;
                        formatString = LocaleController.formatString(i17, objArr);
                    } else if (z15) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) r02);
                    } else {
                        String str6 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                        Object[] objArr2 = new Object[1];
                        objArr2[z13] = str;
                        formatString = LocaleController.formatPluralStringComma(str6, (int) r02, objArr2);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(U);
                        org.telegram.ui.Components.qc M = (s02 == 0 || string == null || z15) ? string != null ? b02.M(string, replaceTags, i16) : b02.R(i16, 36, replaceTags) : b02.K(i16, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new bi.j4(s02, i14));
                        M.s = z13;
                        M.j = 5000;
                        di.y3 y3Var = new di.y3(ro0Var, M, z11, message, 4);
                        org.telegram.ui.Components.ub ubVar = M.e;
                        if (ubVar != null) {
                            ubVar.setOnClickListener(y3Var);
                        }
                        M.k(z15);
                        break;
                    }
                }
                z13 = 0;
                z12 = z10;
                long r022 = ro0Var.r0();
                int i162 = !z12 ? (z11 || z15) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z12) {
                }
                String string2 = z12 ? LocaleController.getString(z15 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                if (z12) {
                }
                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                U = LaunchActivity.U();
                if (U == null) {
                }
                break;
            case 4:
                ro0.e0((ro0) obj4, (TLObject) obj2, (TLRPC.TL_error) obj3, (TL_account.getTmpPassword) obj);
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str7 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new zq0(photoViewer, 10));
                    break;
                } else {
                    int i18 = 11;
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
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap((int) (f7 * max3), (int) (f10 * max3), config);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                    float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                    canvas.scale(max4, max4);
                    canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str7));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                        float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                        canvas2.scale(max5, max5);
                        canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new cg0((Object) photoViewer, (Object) photoEntry, str7, (Object) createBitmap2, 6));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        AndroidUtilities.runOnUIThread(new zq0(photoViewer, i18));
                        return;
                    }
                }
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str8 = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str8;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.q5.b.setLoading(false);
                qu0 qu0Var = photoViewer2.d;
                if (qu0Var != null) {
                    qu0Var.X(photoViewer2.P4);
                }
                os0 os0Var = photoViewer2.g1;
                if (os0Var != null) {
                    os0Var.setImage(bitmap);
                }
                photoViewer2.h3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.x) {
                    checkBox.callOnClick();
                    break;
                }
                break;
            case 7:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                ur0 ur0Var = (ur0) obj;
                ImageView imageView = photoViewer3.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap2);
                    photoViewer3.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        ur0Var.run();
                        break;
                    }
                }
                break;
            case 8:
                TLObject tLObject2 = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((hs0) obj4).b;
                if (tLObject2 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    int i19 = photoViewer4.T;
                    ArrayList arrayList4 = photoViewer4.f7;
                    MessagesController.getInstance(i19).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer4.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList4.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList4.set(indexOf2, tL_photos_photo.photo);
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
            case 9:
                hw0.V((hw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 10:
                PrivacyControlActivity.W((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                break;
            case 11:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    e2Var.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj4;
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                int i20 = ProfileActivity.R6;
                try {
                    e2Var2.dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i21 = Build.VERSION.SDK_INT;
                    Uri d = i21 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i21 >= 24) {
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
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    int i22 = ProfileActivity.R6;
                    profileActivity.getClass();
                    org.telegram.ui.Components.wc.b0(profileActivity).g0(tL_error2, false);
                }
                if (profileActivity.t4 == iArr2[0]) {
                    profileActivity.t4 = 0;
                    break;
                }
                break;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    v10.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.e1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1)), (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity2.z0);
                    break;
                } else {
                    int i23 = ProfileActivity.R6;
                    org.telegram.ui.Components.wc.e0(tL_error3);
                    break;
                }
            case 15:
                ProfileActivity.Y((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str9 = (String) obj;
                String str10 = (String) obj2;
                int i24 = ProfileActivity.R6;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.g51.T(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str9, str10, new z10(profileActivity3, i15), null);
                    break;
                }
                break;
            case 17:
                TLObject tLObject5 = (TLObject) obj2;
                UserConfig userConfig2 = (UserConfig) obj3;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((tz0) obj4).b;
                profileActivity4.n0.c1--;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject5;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList5 = profileActivity4.n0.V0;
                        if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(photo2)) >= 0) {
                            arrayList5.set(indexOf, photo3);
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
            case 18:
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                ProfileActivity profileActivity5 = ((e01) obj4).c.e;
                profileActivity5.V4(null);
                if (!(tLObject6 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.wc.e0(tL_error4);
                    break;
                } else {
                    TLObject user3 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f1));
                    if (profileActivity5.getParentActivity() != null) {
                        v10.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user3, (TL_fragment.TL_collectibleInfo) tLObject6, profileActivity5.z0);
                        break;
                    }
                }
                break;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    e2Var3.dismiss();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (tL_error5 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.n0();
                    p71 p71Var = sessionsActivity.a;
                    if (p71Var != null) {
                        p71Var.l();
                        break;
                    }
                }
                break;
            case 20:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.e2 e2Var4 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    e2Var4.dismiss();
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (tL_error6 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.n0();
                    p71 p71Var2 = sessionsActivity2.a;
                    if (p71Var2 != null) {
                        p71Var2.l();
                        break;
                    }
                }
                break;
            case 21:
                o71 o71Var = (o71) obj4;
                o71Var.a = (TLObject) obj2;
                o71Var.b = (TLRPC.TL_error) obj3;
                ((p9) obj).run();
                break;
            case 22:
                f81.c0((f81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 23:
                j91 j91Var = (j91) obj4;
                lg.b bVar2 = (lg.b) obj3;
                String str11 = (String) obj;
                x91 x91Var2 = (x91) obj2;
                y91 y91Var = j91Var.w;
                if (bVar2 != null) {
                    y91Var.U.put(str11, bVar2);
                }
                if (bVar2 != null && !x91Var2.b && (i11 = x91Var2.a) >= 0) {
                    View m11 = y91Var.T.m(i11);
                    if (m11 instanceof j91) {
                        j91Var.r.e = bVar2;
                        j91 j91Var2 = (j91) m11;
                        j91Var2.b.t0.d(false, false);
                        j91Var2.g(false);
                    }
                }
                y91.Y(y91Var);
                break;
            case 24:
                k91 k91Var = (k91) obj4;
                k91Var.k = false;
                k91Var.d = (lg.b) obj3;
                k91Var.g = (String) obj;
                i91 i91Var2 = (i91) ((Utilities.Callback0Return) obj2).run();
                if (i91Var2 != null) {
                    i91Var2.e(k91Var, true);
                    break;
                }
                break;
            case 25:
                TLObject tLObject7 = (TLObject) obj2;
                String str12 = (String) obj;
                org.telegram.ui.ActionBar.e2 e2Var5 = (org.telegram.ui.ActionBar.e2) obj3;
                yd1 yd1Var = ((ud1) obj4).a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i25 = 0; i25 < updates.updates.size(); i25++) {
                        if (updates.updates.get(i25) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i25);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str12;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = yd1Var.getMessagesController().getPeer(yd1Var.a);
                            tL_messageService.dialog_id = yd1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList6 = new ArrayList();
                            i12 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
                            arrayList6.add(new MessageObject(i12, tL_messageService, false, false));
                            TLRPC.Chat chat2 = yd1Var.getMessagesController().getChat(Long.valueOf(-yd1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j10 = yd1Var.b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str12;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = yd1Var.getMessagesController().getPeer(yd1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = yd1Var.E;
                            wn wnVar = yd1Var.y;
                            if (wnVar != null) {
                                wnVar.Xa();
                                wnVar.bb();
                                wnVar.Eb(arrayList6, chat2, tL_messageService.id, 1, 1, tL_forumTopic);
                                wnVar.c = true;
                                wnVar.C8();
                                wnVar.ed(true);
                                wnVar.m1.n(true);
                                wnVar.kd();
                                wnVar.d2.setCurrentTopic(wnVar.b());
                                wnVar.hd(true);
                                wnVar.yc(true);
                                wnVar.r9(true);
                                wnVar.G6(true, true);
                                wnVar.Qa();
                                yd1Var.getMessagesController().getTopicsController().onTopicCreated(yd1Var.a, tL_forumTopic, true);
                                yd1Var.finishFragment();
                            } else {
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", -yd1Var.a);
                                bundle2.putInt("message_id", 1);
                                bundle2.putInt("unread_count", 0);
                                bundle2.putBoolean("historyPreloaded", false);
                                wn wnVar2 = new wn(bundle2);
                                wnVar2.Eb(arrayList6, chat2, tL_messageService.id, 1, 1, tL_forumTopic);
                                wnVar2.c = true;
                                yd1Var.getMessagesController().getTopicsController().onTopicCreated(yd1Var.a, tL_forumTopic, true);
                                yd1Var.presentFragment(wnVar2);
                            }
                        }
                    }
                }
                e2Var5.dismiss();
                break;
            case 26:
                TwoStepVerificationActivity.f0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                break;
            case 27:
                fg1 fg1Var = (fg1) obj4;
                String str13 = (String) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    fg1Var.v0(new yc1(9, fg1Var, str13));
                    break;
                } else if (tL_error7 != null && !tL_error7.text.startsWith("CODE_INVALID")) {
                    if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error7.text).intValue();
                        fg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        fg1Var.H0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error7.text);
                        break;
                    }
                } else {
                    fg1Var.z0();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                di.x7 x7Var = (di.x7) obj3;
                String str14 = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                if (!x0Var.c || ((a1Var = x0Var.Q) != null && a1Var.o(x7Var))) {
                    x0Var.d("window.Telegram.WebView.receiveEvent('" + str14 + "', " + jSONObject + ");");
                    break;
                } else {
                    FileLog.d("notifyEvent " + str14 + " dropped after document change");
                    break;
                }
                break;
            default:
                r5.a aVar = (r5.a) obj4;
                m5.i iVar = (m5.i) obj3;
                String str15 = iVar.a;
                j5.g gVar = (j5.g) obj2;
                m5.h hVar = (m5.h) obj;
                aVar.getClass();
                Logger logger = r5.a.f;
                try {
                    n5.e a2 = aVar.c.a(str15);
                    if (a2 == null) {
                        String str16 = "Transport backend '" + str15 + "' is not registered";
                        logger.warning(str16);
                        gVar.d(new IllegalArgumentException(str16));
                    } else {
                        ((t5.g) aVar.e).f(new org.telegram.ui.Components.qy(aVar, iVar, ((k5.c) a2).a(hVar), 7));
                        gVar.d(null);
                    }
                    break;
                } catch (Exception e15) {
                    logger.warning("Error scheduling event " + e15.getMessage());
                    gVar.d(e15);
                    return;
                }
        }
    }

    public /* synthetic */ cg0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = obj2;
        this.d = obj3;
        this.b = obj4;
    }

    public /* synthetic */ cg0(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
    }

    public /* synthetic */ cg0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = tLObject;
        this.b = obj2;
        this.d = obj3;
    }
}

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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jn0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x085e  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String formatString;
        org.telegram.ui.ActionBar.o2 U;
        org.telegram.ui.Components.qc M;
        ho0 ho0Var;
        ho0 ho0Var2;
        int indexOf;
        int i10;
        int i11;
        org.telegram.ui.web.b1 b1Var;
        int i12 = this.a;
        int i13 = 3;
        String str = "";
        int i14 = 2;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                io0 io0Var = (io0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                io0Var.a1 = true;
                io0Var.f1 = 1;
                io0Var.x0((org.telegram.ui.ActionBar.h5) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = io0Var.b1;
                boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z11 && (ho0Var2 = io0Var.Z0) != null) {
                    ho0Var2.a(io0Var.f1);
                }
                io0Var.t0();
                if (z11 && (ho0Var = io0Var.Z0) != null) {
                    ho0Var.a(io0Var.f1);
                }
                long r02 = io0Var.r0();
                if (r02 > 0) {
                    str = UserObject.getForcedFirstName(io0Var.getMessagesController().getUser(Long.valueOf(r02)));
                } else if (r02 < 0) {
                    boolean z14 = false;
                    TLRPC.Chat chat = io0Var.getMessagesController().getChat(Long.valueOf(-r02));
                    z10 = z14;
                    if (chat != null) {
                        str = chat.title;
                        z10 = z14;
                    }
                    long q02 = io0Var.q0();
                    int i15 = !z11 ? (z12 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String string = z11 ? null : LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z12 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    if (z11) {
                        int i16 = R.string.PaymentInfoHint;
                        String str2 = io0Var.R0[z10];
                        String str3 = io0Var.q0;
                        Object[] objArr = new Object[2];
                        objArr[z10] = str2;
                        objArr[1] = str3;
                        formatString = LocaleController.formatString(i16, objArr);
                    } else if (z13) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        String str4 = z12 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                        Object[] objArr2 = new Object[1];
                        objArr2[z10] = str;
                        formatString = LocaleController.formatPluralStringComma(str4, (int) q02, objArr2);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U);
                        if (r02 == 0 || string == null || z13) {
                            String str5 = string;
                            M = str5 != null ? a02.M(str5, replaceTags, i15) : a02.Q(i15, 36, replaceTags);
                        } else {
                            M = a02.K(i15, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new ai.o4(r02, i13));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = z10;
                        qcVar.j = 5000;
                        ci.y3 y3Var = new ci.y3(io0Var, qcVar, z12, message, 4);
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if (ubVar != null) {
                            ubVar.setOnClickListener(y3Var);
                        }
                        qcVar.k(z13);
                        break;
                    }
                }
                z10 = 0;
                long q022 = io0Var.q0();
                int i152 = !z11 ? (z12 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z11) {
                }
                if (z11) {
                }
                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                U = LaunchActivity.U();
                if (U == null) {
                }
                break;
            case 1:
                io0.d0((io0) obj4, (TLObject) obj3, (TLRPC.TL_error) obj2, (TL_account.getTmpPassword) obj);
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                String str6 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                Bitmap decodeFile = BitmapFactory.decodeFile(((MediaController.PhotoEntry) obj3).path);
                if (decodeFile == null) {
                    AndroidUtilities.runOnUIThread(new tq0(photoViewer, 10));
                    break;
                } else {
                    int i17 = 11;
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
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str6));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                        float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                        canvas2.scale(max5, max5);
                        canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                        AndroidUtilities.runOnUIThread(new jn0(photoViewer, photoEntry, str6, createBitmap2, 3));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        AndroidUtilities.runOnUIThread(new tq0(photoViewer, i17));
                        return;
                    }
                }
            case 3:
                PhotoViewer photoViewer2 = (PhotoViewer) obj4;
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj3;
                String str7 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                if (photoEntry2.coverPath != null) {
                    try {
                        new File(photoEntry2.coverPath).delete();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                photoEntry2.coverSavedPosition = -1L;
                photoEntry2.coverPath = str7;
                photoEntry2.coverPhoto = null;
                photoEntry2.coverPhotoParentObject = null;
                photoViewer2.q5.b.setLoading(false);
                ku0 ku0Var = photoViewer2.d;
                if (ku0Var != null) {
                    ku0Var.X(photoViewer2.P4);
                }
                is0 is0Var = photoViewer2.g1;
                if (is0Var != null) {
                    is0Var.setImage(bitmap);
                }
                photoViewer2.g3(0);
                CheckBox checkBox = photoViewer2.N0;
                if (!checkBox.x) {
                    checkBox.callOnClick();
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer3 = (PhotoViewer) obj4;
                Bitmap bitmap2 = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                or0 or0Var = (or0) obj;
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
                        or0Var.run();
                        break;
                    }
                }
                break;
            case 5:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer4 = ((bs0) obj4).b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i18 = photoViewer4.T;
                    ArrayList arrayList = photoViewer4.f7;
                    MessagesController.getInstance(i18).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer4.T).getUser(Long.valueOf(userConfig.clientUserId));
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
            case 6:
                bw0.U((bw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                break;
            case 7:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (boolean[]) obj);
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.a.l();
                    break;
                }
                break;
            case 9:
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
                    int i19 = Build.VERSION.SDK_INT;
                    Uri d = i19 >= 24 ? FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file) : Uri.fromFile(file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i19 >= 24) {
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
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    break;
                }
                break;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr2 = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.xc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.p4 == iArr2[0]) {
                    profileActivity.p4 = 0;
                    break;
                }
                break;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    t10.a(profileActivity2.getParentActivity(), 0, tL_username.username, profileActivity2.f1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.g1)), (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.A0);
                    break;
                } else {
                    org.telegram.ui.Components.xc.d0(tL_error2);
                    break;
                }
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str8 = (String) obj2;
                String str9 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.y41.T(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str8, str9, new x10(profileActivity3, i14), null);
                    break;
                }
                break;
            case 13:
                ProfileActivity.k0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((nz0) obj4).b;
                profileActivity4.o0.c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.o0.V0;
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
            case 15:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((yz0) obj4).c.e;
                profileActivity5.P4(null);
                if (!(tLObject5 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.xc.d0(tL_error3);
                    break;
                } else {
                    TLObject user3 = profileActivity5.f1 != 0 ? profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f1)) : profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.g1));
                    if (profileActivity5.getParentActivity() != null) {
                        t10.a(profileActivity5.getParentActivity(), 0, tL_username2.username, user3, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.A0);
                        break;
                    }
                }
                break;
            case 16:
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
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    l71 l71Var = sessionsActivity.a;
                    if (l71Var != null) {
                        l71Var.l();
                        break;
                    }
                }
                break;
            case 17:
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
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.m0();
                    l71 l71Var2 = sessionsActivity2.a;
                    if (l71Var2 != null) {
                        l71Var2.l();
                        break;
                    }
                }
                break;
            case 18:
                k71 k71Var = (k71) obj4;
                k71Var.a = (TLObject) obj3;
                k71Var.b = (TLRPC.TL_error) obj2;
                ((n9) obj).run();
                break;
            case 19:
                c81.c0((c81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 20:
                f91 f91Var = (f91) obj4;
                kg.b bVar = (kg.b) obj3;
                String str10 = (String) obj2;
                t91 t91Var = (t91) obj;
                u91 u91Var = f91Var.w;
                if (bVar != null) {
                    u91Var.V.put(str10, bVar);
                }
                if (bVar != null && !t91Var.b && (i10 = t91Var.a) >= 0) {
                    View m10 = u91Var.U.m(i10);
                    if (m10 instanceof f91) {
                        f91Var.r.e = bVar;
                        f91 f91Var2 = (f91) m10;
                        f91Var2.b.t0.d(false, false);
                        f91Var2.g(false);
                    }
                }
                u91.Z(u91Var);
                break;
            case 21:
                g91 g91Var = (g91) obj4;
                g91Var.k = false;
                g91Var.d = (kg.b) obj3;
                g91Var.g = (String) obj2;
                e91 e91Var = (e91) ((Utilities.Callback0Return) obj).run();
                if (e91Var != null) {
                    e91Var.e(g91Var, true);
                    break;
                }
                break;
            case 22:
                TLObject tLObject6 = (TLObject) obj3;
                String str11 = (String) obj2;
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj;
                td1 td1Var = ((pd1) obj4).a;
                if (tLObject6 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject6;
                    for (int i20 = 0; i20 < updates.updates.size(); i20++) {
                        if (updates.updates.get(i20) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i20);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str11;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = td1Var.getMessagesController().getPeer(td1Var.a);
                            tL_messageService.dialog_id = td1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                            arrayList3.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat2 = td1Var.getMessagesController().getChat(Long.valueOf(-td1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j10 = td1Var.b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str11;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = td1Var.getMessagesController().getPeer(td1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = td1Var.E;
                            sn snVar = td1Var.y;
                            if (snVar != null) {
                                snVar.Pa();
                                snVar.Ta();
                                snVar.vb(arrayList3, chat2, tL_messageService.id, 1, 1, tL_forumTopic);
                                snVar.c = true;
                                snVar.v8();
                                snVar.Uc(true);
                                snVar.m1.n(true);
                                snVar.ad();
                                snVar.d2.setCurrentTopic(snVar.d());
                                snVar.Xc(true);
                                snVar.oc(true);
                                snVar.j9(true);
                                snVar.D6(true, true);
                                snVar.Ia();
                                td1Var.getMessagesController().getTopicsController().onTopicCreated(td1Var.a, tL_forumTopic, true);
                                td1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -td1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                sn snVar2 = new sn(bundle);
                                snVar2.vb(arrayList3, chat2, tL_messageService.id, 1, 1, tL_forumTopic);
                                snVar2.c = true;
                                td1Var.getMessagesController().getTopicsController().onTopicCreated(td1Var.a, tL_forumTopic, true);
                                td1Var.presentFragment(snVar2);
                            }
                        }
                    }
                }
                c2Var4.dismiss();
                break;
            case 23:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                break;
            case 24:
                bg1 bg1Var = (bg1) obj4;
                String str12 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    bg1Var.u0(new o71(18, bg1Var, str12));
                    break;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        bg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        bg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                        break;
                    }
                } else {
                    bg1Var.y0();
                    break;
                }
            case 25:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                ci.y7 y7Var = (ci.y7) obj3;
                String str13 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (!y0Var.c || ((b1Var = y0Var.Q) != null && b1Var.o(y7Var))) {
                    y0Var.d("window.Telegram.WebView.receiveEvent('" + str13 + "', " + jSONObject + ");");
                    break;
                } else {
                    FileLog.d("notifyEvent " + str13 + " dropped after document change");
                    break;
                }
                break;
            case 26:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str14 = iVar.a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f;
                try {
                    m5.e a2 = aVar.c.a(str14);
                    if (a2 == null) {
                        String str15 = "Transport backend '" + str14 + "' is not registered";
                        logger.warning(str15);
                        gVar.c(new IllegalArgumentException(str15));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.ry(aVar, iVar, ((j5.d) a2).a(hVar), 7));
                        gVar.c(null);
                    }
                    break;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    gVar.c(e14);
                    return;
                }
            case 27:
                qi.e eVar = (qi.e) obj4;
                ((ArrayDeque) eVar.a).addLast(new qi.d((j5.b) obj3, (qi.a) obj2, (RequestTimeDelegate) obj));
                eVar.D();
                break;
            case 28:
                rg.o2 o2Var = (rg.o2) obj4;
                o2Var.G = true;
                o2Var.H = (rg.l2[]) ((ArrayList) obj3).toArray(new rg.l2[0]);
                ((zq0) obj2).run((rg.l2) obj);
                break;
            default:
                rg.o2 o2Var2 = (rg.o2) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                rg.m2 m2Var = (rg.m2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject7 instanceof TLRPC.TL_messageMediaDocument) {
                    o2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                    m2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, m2Var.c);
                    m2Var.f = tL_messageMediaDocument;
                    o2Var2.a();
                    break;
                } else {
                    o2Var2.h();
                    o2Var2.n(tL_error7);
                    break;
                }
        }
    }
}

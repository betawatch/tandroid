package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.di1;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i30(View view, View view2, WindowManager windowManager, View view3, View view4) {
        this.a = 0;
        this.b = view;
        this.c = view2;
        this.f = windowManager;
        this.d = view3;
        this.e = view4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10;
        org.telegram.ui.ro0 ro0Var;
        wc d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.qu0 qu0Var;
        String str2;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i18 = this.a;
        TLRPC.TL_wallPaper tL_wallPaper = null;
        final int i19 = 1;
        final int i20 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i18) {
            case 0:
                View view = (View) obj5;
                View view2 = (View) obj4;
                WindowManager windowManager = (WindowManager) obj;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj3);
                windowManager.removeView((View) obj2);
                break;
            case 1:
                dz0.v((dz0) obj5, (String) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TextView) obj);
                break;
            case 2:
                oz0 oz0Var = (oz0) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject instanceof TLRPC.TL_boolTrue) {
                        qc M = wc.b0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.j = 5000;
                        M.j();
                        break;
                    } else {
                        if (userFull != null) {
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            MessagesStorage.getInstance(oz0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oz0Var.b.getContext());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.t.q(R.string.UnknownError, wc.b0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 3:
                f41 f41Var = (f41) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                l80 l80Var = (l80) obj2;
                l80 l80Var2 = (l80) obj;
                org.telegram.ui.wn wnVar = f41Var.h;
                if (((MessagesController) obj4).isDialogMuted(f41Var.c, tL_forumTopic.id)) {
                    l80Var.u();
                    NotificationsController.getInstance(f41Var.b).muteDialog(f41Var.c, tL_forumTopic.id, false);
                    if (wc.a(wnVar)) {
                        wc.z(wnVar, 4, 0, f41Var.d).j();
                        break;
                    }
                } else {
                    l80Var.K(l80Var2);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj;
                if (((TLRPC.TL_error) obj4) == null && (tLObject2 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject2;
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = tL_messages_myStickers.sets;
                    int size = arrayList2.size();
                    while (i20 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i20);
                        i20++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(htVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) ic.a.g(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(htVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.ea(htVar, arrayList, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.ey.G0((org.telegram.ui.ey) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
            case 6:
                org.telegram.ui.x50.B((org.telegram.ui.x50) obj5, (org.telegram.ui.ActionBar.e2) obj4, (TLObject) obj3, (TL_phone.exportGroupCallInvite) obj2, (TLRPC.TL_error) obj);
                break;
            case 7:
                org.telegram.ui.x50.x((org.telegram.ui.x50) obj5, (ArrayList) obj4, (ArrayList) obj3, (ArrayList) obj2, (String) obj);
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj5;
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject3 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper3 = (TLRPC.TL_wallPaper) tLObject3;
                    if (tL_wallPaper3.pattern) {
                        String str3 = tL_wallPaper3.slug;
                        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper2.settings;
                        di1 di1Var = new di1(str3, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r3.intensity / 100.0f, tL_wallPaper2.settings.motion, null);
                        di1Var.g = tL_wallPaper3;
                        tL_wallPaper3 = di1Var;
                    }
                    vc1 vc1Var = new vc1(tL_wallPaper3, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper2.settings;
                    boolean z10 = wallPaperSettings2.blur;
                    boolean z11 = wallPaperSettings2.motion;
                    float f7 = wallPaperSettings2.intensity;
                    vc1Var.G1 = z10;
                    vc1Var.F1 = z11;
                    vc1Var.o1 = f7;
                    launchActivity.u0(vc1Var);
                    break;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.d3.p(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(tL_error2.text);
                    launchActivity.G0(g5.M(launchActivity, null, sb2.toString()));
                    break;
                }
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj5;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str4 = (String) obj;
                ArrayList arrayList3 = launchActivity2.E0;
                if (eyVar != null) {
                    if (r2Var != null) {
                        r2Var.dismissCurrentDialog();
                    }
                    while (i20 < arrayList3.size()) {
                        if (((Dialog) arrayList3.get(i20)).isShowing()) {
                            ((Dialog) arrayList3.get(i20)).dismiss();
                        }
                        i20++;
                    }
                    arrayList3.clear();
                    launchActivity2.u0(eyVar);
                    break;
                } else if (r2Var instanceof org.telegram.ui.wn) {
                    ((org.telegram.ui.wn) r2Var).ja(user.id, str4, true);
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj5;
                TLObject tLObject4 = (TLObject) obj4;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (tLObject4 != null) {
                    if (tLObject4 instanceof TLRPC.TL_urlAuthResultRequest) {
                        org.telegram.ui.fl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject4, null, null, null, false, null);
                        break;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        org.telegram.ui.fl0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject4, null, null, null, false, null);
                        break;
                    } else if (tLObject4 instanceof TLRPC.TL_urlAuthResultDefault) {
                        g5.p0(U2, str5, false, true);
                        break;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.ui.fl0.a().M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain), R.raw.error).j();
                        break;
                    } else {
                        org.telegram.ui.fl0.a().g0(tL_error3, false);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                org.telegram.ui.kz kzVar2 = (org.telegram.ui.kz) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Pattern pattern2 = LaunchActivity.D1;
                if (tLObject5 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) tLObject5;
                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
                    if (themeSettings != null) {
                        org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(org.telegram.ui.ActionBar.y6.r0(themeSettings));
                        if (P0 != null) {
                            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (!FileLoader.getInstance(launchActivity4.O).getPathToAttach(tL_wallPaper.document, true).exists()) {
                                    launchActivity4.W0 = e2Var;
                                    launchActivity4.V0 = true;
                                    launchActivity4.T0 = P0;
                                    launchActivity4.U0 = tL_theme;
                                    launchActivity4.S0 = tL_wallPaper;
                                    launchActivity4.R0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                                    FileLoader.getInstance(launchActivity4.O).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                                    break;
                                }
                            }
                            try {
                                kzVar2.run();
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            launchActivity4.s0(tL_theme, tL_wallPaper, P0);
                        } else {
                            i20 = 1;
                        }
                    } else {
                        TLRPC.Document document = tL_theme.document;
                        if (document != null) {
                            launchActivity4.V0 = false;
                            launchActivity4.U0 = tL_theme;
                            launchActivity4.Q0 = FileLoader.getAttachFileName(document);
                            launchActivity4.W0 = e2Var;
                            FileLoader.getInstance(launchActivity4.O).loadFile(launchActivity4.U0.document, tL_theme, 1, 1);
                        }
                        i10 = 1;
                    }
                    i10 = i20;
                } else {
                    if (tL_error4 == null || !"THEME_FORMAT_INVALID".equals(tL_error4.text)) {
                        i10 = 2;
                    }
                    i10 = 1;
                }
                if (i10 != 0) {
                    try {
                        kzVar2.run();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    if (i10 == 1) {
                        launchActivity4.G0(g5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotSupported)));
                        break;
                    } else {
                        launchActivity4.G0(g5.M(launchActivity4, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNotFound)));
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj5;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                String str6 = (String) obj;
                int i21 = ob0Var.b;
                LaunchActivity launchActivity5 = ob0Var.a;
                if (tL_error5 != null) {
                    if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error5.text)) {
                        d = org.telegram.ui.ob0.d();
                        i11 = R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid;
                    } else {
                        d = org.telegram.ui.ob0.d();
                        i11 = R.string.PaymentInvoiceLinkInvalid;
                    }
                    org.telegram.messenger.wh.n(i11, d, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        zh.o4 o4Var = launchActivity5.Z0;
                        launchActivity5.Z0 = null;
                        bi.ca.y(i21, false).Y(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new org.telegram.ui.ib0(ob0Var, 1), new org.telegram.ui.i90(o4Var, i19));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            MessagesController.getInstance(i21).putUsers(paymentForm.users, false);
                            ro0Var = new org.telegram.ui.ro0(paymentForm, null, str6, LaunchActivity.U());
                        } else {
                            ro0Var = tLObject6 instanceof TLRPC.PaymentReceipt ? new org.telegram.ui.ro0((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (ro0Var != null) {
                            zh.o4 o4Var2 = launchActivity5.Z0;
                            if (o4Var2 != null) {
                                launchActivity5.Z0 = null;
                                ro0Var.Z0 = new org.telegram.ui.ef(10, o4Var2);
                            }
                            ob0Var.u(ro0Var, false);
                        }
                    }
                }
                ob0Var.c();
                break;
            case 13:
                org.telegram.ui.ig0.X((org.telegram.ui.ig0) obj5, (TLRPC.TL_error) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 14:
                TLObject tLObject7 = (TLObject) obj4;
                Bundle bundle = (Bundle) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.ig0 ig0Var = ((org.telegram.ui.qd0) obj5).W;
                if (tLObject7 instanceof TLRPC.TL_auth_sentCode) {
                    ig0Var.l1(bundle, (TLRPC.TL_auth_sentCode) tLObject7, true);
                    break;
                } else if (tL_error6 != null && tL_error6.text != null) {
                    i12 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                    g5.e0(i12, tL_error6, ig0Var, tL_auth_resendCode, new Object[0]);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.xe0 xe0Var = (org.telegram.ui.xe0) obj5;
                TLObject tLObject8 = (TLObject) obj4;
                Bundle bundle2 = (Bundle) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                TL_account.sendVerifyEmailCode sendverifyemailcode = (TL_account.sendVerifyEmailCode) obj;
                org.telegram.ui.ig0 ig0Var2 = xe0Var.E;
                ig0Var2.p1(false, true);
                xe0Var.r = false;
                if (tLObject8 instanceof TL_account.sentEmailCode) {
                    TL_account.sentEmailCode sentemailcode = (TL_account.sentEmailCode) tLObject8;
                    bundle2.putString("emailPattern", sentemailcode.email_pattern);
                    bundle2.putInt("length", sentemailcode.length);
                    ig0Var2.z1(13, true, bundle2, false);
                    break;
                } else {
                    String str7 = tL_error7.text;
                    if (str7 != null) {
                        if (str7.contains("EMAIL_INVALID")) {
                            xe0Var.n();
                            break;
                        } else if (tL_error7.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error7.text.contains("PHONE_PASSWORD_FLOOD")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            break;
                        } else if (tL_error7.text.contains("PHONE_NUMBER_FLOOD")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                            break;
                        } else if (!tL_error7.text.contains("PHONE_CODE_EMPTY") && !tL_error7.text.contains("PHONE_CODE_INVALID")) {
                            if (tL_error7.text.contains("PHONE_CODE_EXPIRED")) {
                                ig0Var2.z1(0, true, null, true);
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                break;
                            } else if (tL_error7.text.startsWith("FLOOD_WAIT")) {
                                ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                break;
                            } else if (tL_error7.code != -1000) {
                                i13 = ((org.telegram.ui.ActionBar.r2) ig0Var2).currentAccount;
                                g5.e0(i13, tL_error7, ig0Var2, sendverifyemailcode, xe0Var.w);
                                break;
                            }
                        } else {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                            break;
                        }
                    }
                }
                break;
            case 16:
                TLObject tLObject9 = (TLObject) obj4;
                Bundle bundle3 = (Bundle) obj3;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj2;
                TL_account.verifyEmail verifyemail = (TL_account.verifyEmail) obj;
                org.telegram.ui.ig0 ig0Var3 = ((org.telegram.ui.xe0) obj5).E;
                if (!(tLObject9 instanceof TL_account.TL_emailVerified) || ig0Var3.F != 3) {
                    if (tLObject9 instanceof TL_account.TL_emailVerifiedLogin) {
                        TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject9;
                        bundle3.putString("email", tL_emailVerifiedLogin.email);
                        ig0Var3.l1(bundle3, tL_emailVerifiedLogin.sent_code, true);
                        break;
                    } else if (tL_error8 != null) {
                        if (tL_error8.text.contains("EMAIL_NOT_ALLOWED")) {
                            ig0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                            break;
                        } else if (tL_error8.text.contains("EMAIL_TOKEN_INVALID")) {
                            ig0Var3.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                            break;
                        } else if (tL_error8.code != -1000) {
                            i14 = ((org.telegram.ui.ActionBar.r2) ig0Var3).currentAccount;
                            g5.e0(i14, tL_error8, ig0Var3, verifyemail, new Object[0]);
                            break;
                        }
                    }
                } else {
                    ig0Var3.finishFragment();
                    ig0Var3.d0.run();
                    break;
                }
                break;
            case 17:
                final org.telegram.ui.qf0 qf0Var = (org.telegram.ui.qf0) obj5;
                TLObject tLObject10 = (TLObject) obj4;
                TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = (TLRPC.TL_inputInvoicePremiumAuthCode) obj3;
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                org.telegram.ui.ig0 ig0Var4 = qf0Var.v;
                qf0Var.b.setLoading(false);
                if (tLObject10 instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject10;
                    ig0Var4.getMessagesController().putUsers(paymentForm2.users, false);
                    org.telegram.ui.ro0 ro0Var2 = new org.telegram.ui.ro0(tL_inputInvoicePremiumAuthCode, paymentForm2, null, null, 4, null, null, null, null, null, null, false, null, ig0Var4, true);
                    ro0Var2.V0 = true;
                    ro0Var2.c1 = new Utilities.Callback() { // from class: org.telegram.ui.mf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i20) {
                                case 0:
                                    final int i22 = 0;
                                    final qf0 qf0Var2 = qf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.of0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode3.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode3.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    qf0 qf0Var3 = qf0Var2;
                                                    if (!qf0Var3.f) {
                                                        qf0Var3.f = true;
                                                        qf0Var3.h = str8;
                                                        qf0Var3.n = str9;
                                                        qf0Var3.r = j10;
                                                        qf0Var3.b.setLoading(true);
                                                        qf0Var3.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    qf0 qf0Var4 = qf0Var2;
                                                    if (!qf0Var4.f) {
                                                        qf0Var4.f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.n = str11;
                                                        qf0Var4.r = j11;
                                                        qf0Var4.b.setLoading(true);
                                                        qf0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final qf0 qf0Var3 = qf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.of0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    qf0 qf0Var32 = qf0Var3;
                                                    if (!qf0Var32.f) {
                                                        qf0Var32.f = true;
                                                        qf0Var32.h = str8;
                                                        qf0Var32.n = str9;
                                                        qf0Var32.r = j10;
                                                        qf0Var32.b.setLoading(true);
                                                        qf0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    qf0 qf0Var4 = qf0Var3;
                                                    if (!qf0Var4.f) {
                                                        qf0Var4.f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.n = str11;
                                                        qf0Var4.r = j11;
                                                        qf0Var4.b.setLoading(true);
                                                        qf0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    ro0Var2.d1 = new Utilities.Callback() { // from class: org.telegram.ui.mf0
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj6) {
                            switch (i19) {
                                case 0:
                                    final int i22 = 0;
                                    final qf0 qf0Var2 = qf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode2 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm3 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.of0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode2;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm3.form_id;
                                                    qf0 qf0Var32 = qf0Var2;
                                                    if (!qf0Var32.f) {
                                                        qf0Var32.f = true;
                                                        qf0Var32.h = str8;
                                                        qf0Var32.n = str9;
                                                        qf0Var32.r = j10;
                                                        qf0Var32.b.setLoading(true);
                                                        qf0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode2;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm3.form_id;
                                                    qf0 qf0Var4 = qf0Var2;
                                                    if (!qf0Var4.f) {
                                                        qf0Var4.f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.n = str11;
                                                        qf0Var4.r = j11;
                                                        qf0Var4.b.setLoading(true);
                                                        qf0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final int i23 = 1;
                                    final qf0 qf0Var3 = qf0Var;
                                    final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode3 = tL_inputStorePaymentAuthCode;
                                    final TLRPC.PaymentForm paymentForm4 = paymentForm2;
                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.of0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i23) {
                                                case 0:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode32 = tL_inputStorePaymentAuthCode3;
                                                    String str8 = tL_inputStorePaymentAuthCode32.phone_number;
                                                    String str9 = tL_inputStorePaymentAuthCode32.phone_code_hash;
                                                    long j10 = paymentForm4.form_id;
                                                    qf0 qf0Var32 = qf0Var3;
                                                    if (!qf0Var32.f) {
                                                        qf0Var32.f = true;
                                                        qf0Var32.h = str8;
                                                        qf0Var32.n = str9;
                                                        qf0Var32.r = j10;
                                                        qf0Var32.b.setLoading(true);
                                                        qf0Var32.o();
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode4 = tL_inputStorePaymentAuthCode3;
                                                    String str10 = tL_inputStorePaymentAuthCode4.phone_number;
                                                    String str11 = tL_inputStorePaymentAuthCode4.phone_code_hash;
                                                    long j11 = paymentForm4.form_id;
                                                    qf0 qf0Var4 = qf0Var3;
                                                    if (!qf0Var4.f) {
                                                        qf0Var4.f = true;
                                                        qf0Var4.h = str10;
                                                        qf0Var4.n = str11;
                                                        qf0Var4.r = j11;
                                                        qf0Var4.b.setLoading(true);
                                                        qf0Var4.o();
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                        }
                    };
                    ro0Var2.e1 = new org.telegram.ui.z10(qf0Var, i19);
                    ig0Var4.presentFragment(ro0Var2);
                    break;
                } else if (tL_error9 != null) {
                    if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error9.text)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.nf0(qf0Var, i20));
                        break;
                    } else {
                        String str8 = tL_error9.text;
                        qf0Var.e = str8;
                        new wc(ig0Var4.Z, null).H(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, str8));
                        break;
                    }
                } else {
                    new wc(ig0Var4.Z, null).H(R.raw.error, LocaleController.getString(R.string.UnknownError));
                    break;
                }
            case 18:
                org.telegram.ui.xi0 xi0Var = (org.telegram.ui.xi0) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                lg.b bVar = (lg.b) obj3;
                String str9 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                xi0Var.y = true;
                if (tL_error10 != null || bVar == null) {
                    xi0Var.i0();
                    break;
                } else {
                    xi0Var.v.put(str9, bVar);
                    org.telegram.ui.k91 k91Var = xi0Var.r;
                    k91Var.e = bVar;
                    k91Var.c = tL_loadAsyncGraph.x;
                    xi0Var.i0();
                    break;
                }
            case 19:
                org.telegram.ui.qj0.n((org.telegram.ui.qj0) obj5, (TLRPC.TL_contacts_importedContacts) obj4, (TLRPC.TL_inputPhoneContact) obj3, (TLRPC.TL_error) obj2, (TLRPC.TL_contacts_importContacts) obj);
                break;
            case 20:
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj4;
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) obj3;
                m4.w1 w1Var = (m4.w1) obj2;
                TL_account.verifyEmail verifyemail2 = (TL_account.verifyEmail) obj;
                org.telegram.ui.kn0 kn0Var = ((org.telegram.ui.sm0) obj5).a;
                if (tL_error11 == null) {
                    ((org.telegram.ui.nm0) kn0Var.B1).c(kn0Var.E, (String) kn0Var.s1.get("email"), null, null, null, null, null, null, null, null, nj0Var, w1Var);
                    break;
                } else {
                    i15 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
                    g5.e0(i15, tL_error11, kn0Var, verifyemail2, new Object[0]);
                    w1Var.d(null, null);
                    break;
                }
            case 21:
                org.telegram.ui.gn0 gn0Var = (org.telegram.ui.gn0) obj5;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj4;
                Bundle bundle4 = (Bundle) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                TLRPC.TL_auth_resendCode tL_auth_resendCode2 = (TLRPC.TL_auth_resendCode) obj;
                org.telegram.ui.kn0 kn0Var2 = gn0Var.Q;
                gn0Var.J = false;
                if (tL_error12 == null) {
                    kn0Var2.l1(bundle4, (TLRPC.TL_auth_sentCode) tLObject11, true);
                } else {
                    i16 = ((org.telegram.ui.ActionBar.r2) kn0Var2).currentAccount;
                    org.telegram.ui.ActionBar.e2 e02 = g5.e0(i16, tL_error12, kn0Var2, tL_auth_resendCode2, new Object[0]);
                    if (e02 != null && tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                        e02.o0 = new org.telegram.ui.bn0(gn0Var, i20);
                    }
                }
                kn0Var2.x1();
                break;
            case 22:
                org.telegram.ui.ro0.g0((org.telegram.ui.ro0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (String) obj2, (TL_account.getPassword) obj);
                break;
            case 23:
                ClippingImageView[] clippingImageViewArr = (ClippingImageView[]) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                Integer num = (Integer) obj2;
                org.telegram.ui.qu0 qu0Var2 = (org.telegram.ui.qu0) obj;
                PhotoViewer photoViewer = ((org.telegram.ui.ut0) obj5).r;
                photoViewer.p4 = null;
                org.telegram.ui.ku0 ku0Var = photoViewer.e0;
                if (ku0Var != null && photoViewer.g0 != null) {
                    ku0Var.setLayerType(0, null);
                    photoViewer.n4 = 0;
                    photoViewer.I1();
                    photoViewer.o4 = 0L;
                    photoViewer.G1 = null;
                    photoViewer.E1.a = false;
                    photoViewer.H1 = null;
                    photoViewer.F1.a = false;
                    photoViewer.G2();
                    photoViewer.C2();
                    photoViewer.e0.invalidate();
                    for (ClippingImageView clippingImageView : clippingImageViewArr) {
                        clippingImageView.setVisibility(8);
                    }
                    org.telegram.ui.su0 su0Var = photoViewer.q4;
                    if (su0Var != null) {
                        su0Var.a.setVisible(true, true);
                    }
                    org.telegram.ui.su0 su0Var2 = photoViewer.r4;
                    if (su0Var2 != null && !su0Var2.s) {
                        su0Var2.a.setVisible(false, true);
                    }
                    if (arrayList4 != null && (i17 = photoViewer.c2) != 3 && i17 != 1 && ((qu0Var = photoViewer.d) == null || !qu0Var.P())) {
                        photoViewer.V1();
                    }
                    t81 t81Var = photoViewer.F2;
                    if (t81Var != null && t81Var.y() && photoViewer.r1 && !photoViewer.g7.isEmpty()) {
                        PhotoViewer.a0(photoViewer, photoViewer.F2.n());
                        PhotoViewer.Z(photoViewer, true);
                    }
                    if (photoViewer.t4) {
                        PhotoViewer.b0(photoViewer, num.intValue());
                    }
                    if (qu0Var2 != null) {
                        qu0Var2.d();
                        break;
                    }
                }
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj5;
                boolean[] zArr = (boolean[]) obj3;
                TLRPC.GlobalPrivacySettings globalPrivacySettings = (TLRPC.GlobalPrivacySettings) obj2;
                TL_account.setGlobalPrivacySettings setglobalprivacysettings = (TL_account.setGlobalPrivacySettings) obj;
                if (((TLRPC.TL_error) obj4) != null) {
                    privacyControlActivity.C0();
                    break;
                } else {
                    privacyControlActivity.getClass();
                    zArr[1] = true;
                    if (globalPrivacySettings != null) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                        globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
                        int i22 = globalPrivacySettings2.flags;
                        globalPrivacySettings.flags = i22;
                        globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
                        long j10 = globalPrivacySettings2.noncontact_peers_paid_stars;
                        if (j10 > 0) {
                            globalPrivacySettings.flags = i22 | 32;
                            globalPrivacySettings.noncontact_peers_paid_stars = j10;
                        } else {
                            globalPrivacySettings.flags = i22 & (-33);
                            globalPrivacySettings.noncontact_peers_paid_stars = 0L;
                        }
                    }
                    if (zArr[0]) {
                        privacyControlActivity.y0();
                    }
                    privacyControlActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
                    break;
                }
            case 25:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj;
                PrivacyControlActivity privacyControlActivity2 = ((org.telegram.ui.mx0) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    qc R = wc.b0(privacyControlActivity2).R(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
                    R.j = 5000;
                    R.j();
                    break;
                } else {
                    if (userFull2 != null) {
                        if (tL_birthday2 == null) {
                            userFull2.flags2 &= -33;
                        } else {
                            userFull2.flags2 |= 32;
                        }
                        userFull2.birthday = tL_birthday2;
                        privacyControlActivity2.getMessagesStorage().updateUserInfo(userFull2, false);
                    }
                    if (tL_error13 != null && (str2 = tL_error13.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                        if (privacyControlActivity2.getParentActivity() != null) {
                            Activity parentActivity = privacyControlActivity2.getParentActivity();
                            u6Var = ((org.telegram.ui.ActionBar.r2) privacyControlActivity2).resourceProvider;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(parentActivity, 0, u6Var);
                            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                            e2Var2.R = string;
                            e2Var2.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                            privacyControlActivity2.showDialog(e2Var2);
                            break;
                        }
                    } else {
                        org.telegram.messenger.t.q(R.string.UnknownError, wc.b0(privacyControlActivity2), R.raw.error, 36);
                        break;
                    }
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj5;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                org.telegram.messenger.lk lkVar = (org.telegram.messenger.lk) obj;
                int i23 = ProfileActivity.R6;
                if (!(((TLRPC.ChannelParticipant) obj4) instanceof TLRPC.TL_channelParticipantAdmin) && !(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                    lkVar.run(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                    String string2 = LocaleController.getString(R.string.AppName);
                    org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.a;
                    e2Var3.R = string2;
                    e2Var3.T = LocaleController.formatString(R.string.AdminWillBeRemoved, ContactsController.formatName(user2.first_name, user2.last_name));
                    alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new org.telegram.ui.jl0(lkVar, 12));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    profileActivity.showDialog(e2Var3);
                    break;
                }
            case 27:
                ProfileActivity profileActivity2 = (ProfileActivity) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                org.telegram.ui.kz0 kz0Var = (org.telegram.ui.kz0) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                if (tLObject12 instanceof TL_fragment.TL_collectibleInfo) {
                    TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject12;
                    if (profileActivity2.e1 != 0) {
                        profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1));
                    } else {
                        profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f1));
                    }
                    String str10 = "@" + tL_username.username;
                    String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
                    String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                    String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                    qc w10 = new wc(kz0Var.x, profileActivity2.z0).w(R.drawable.filled_username, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FragmentChannelUsername, str10, format, formatCurrency, TextUtils.isEmpty(formatCurrency2) ? "" : a1.g.p("(", formatCurrency2, ")"))), new org.telegram.ui.by0(i19, profileActivity2, tL_collectibleInfo)));
                    org.telegram.ui.zd0 zd0Var = new org.telegram.ui.zd0(10, profileActivity2, tL_collectibleInfo);
                    ub ubVar = w10.e;
                    if (ubVar != null) {
                        ubVar.setOnClickListener(zd0Var);
                    }
                    w10.k(false);
                    break;
                } else {
                    int i24 = ProfileActivity.R6;
                    wc.e0(tL_error14);
                    break;
                }
            case 28:
                ProfileActivity profileActivity3 = (ProfileActivity) obj5;
                TLObject tLObject13 = (TLObject) obj4;
                String str11 = (String) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj;
                int i25 = ProfileActivity.R6;
                if (tLObject13 instanceof TL_fragment.TL_collectibleInfo) {
                    org.telegram.ui.v10.a(profileActivity3.getParentActivity(), 1, str11, user3, (TL_fragment.TL_collectibleInfo) tLObject13, profileActivity3.z0);
                    break;
                } else {
                    wc.e0(tL_error15);
                    break;
                }
            default:
                ProfileActivity.m0((ProfileActivity) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }

    public /* synthetic */ i30(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}

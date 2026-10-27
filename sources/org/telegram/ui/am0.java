package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AgentController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ am0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        TLRPC.Chat chat;
        String string;
        String formatString;
        org.telegram.ui.Components.qc M;
        qo0 qo0Var;
        qo0 qo0Var2;
        jk jkVar;
        String str = "";
        int i12 = 23;
        switch (this.a) {
            case 0:
                kn0 kn0Var = (kn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = kn0Var.x;
                int i13 = result.type;
                if (i13 == 2) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = kn0Var.G.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i14);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    kn0Var.F = tL_secureRequiredType;
                                    kn0Var.Q1();
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                } else if (i13 == 1) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = kn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i15);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    kn0Var.F = tL_secureRequiredType2;
                                    kn0Var.Q1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i13 == 3) {
                    if (!(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = kn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i16);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    kn0Var.F = tL_secureRequiredType3;
                                    kn0Var.Q1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i13 == 4 && !(kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = kn0Var.G.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) kn0Var.G.get(i17);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                kn0Var.F = tL_secureRequiredType4;
                                kn0Var.Q1();
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    kn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    kn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    kn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    kn0Var.Y[7].setText(result.number);
                }
                int i18 = result.gender;
                if (i18 != 0) {
                    if (i18 == 1) {
                        kn0Var.w = "male";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i18 == 2) {
                        kn0Var.w = "female";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    kn0Var.s = str2;
                    String str3 = (String) kn0Var.Y0.get(str2);
                    if (str3 != null) {
                        kn0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    kn0Var.v = str4;
                    String str5 = (String) kn0Var.Y0.get(str4);
                    if (str5 != null) {
                        kn0Var.Y[6].setText(str5);
                    }
                }
                int i19 = result.birthDay;
                if (i19 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    kn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i20 = result.expiryDay;
                if (i20 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i20;
                    kn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    kn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 1:
                kn0 kn0Var2 = (kn0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kn0Var2.J = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(kn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.n0(kn0Var2.J);
                        kn0Var2.S1();
                        if (kn0Var2.Z[0].getVisibility() == 0) {
                            kn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(kn0Var2.Y[0]);
                        }
                        if (kn0Var2.N0 == 1) {
                            kn0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                kn0 kn0Var3 = (kn0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    kn0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        kn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.g5.w0(kn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    kn0Var3.f1 = true;
                    kn0Var3.W0(true);
                    kn0Var3.finishFragment();
                    break;
                }
            case 3:
                ((fn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 4:
                ro0 ro0Var = (ro0) this.b;
                View view = (View) this.c;
                ro0Var.E0(false);
                view.callOnClick();
                break;
            case 5:
                ro0 ro0Var2 = (ro0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ro0Var2.I0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            ro0Var2.G0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            ro0Var2.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.h3 h3Var = ro0Var2.S;
                        try {
                            h3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                        org.telegram.ui.Cells.h3 h3Var2 = ro0Var2.S;
                        h3Var2.a.setText("");
                        h3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (ro0Var2.getParentActivity() != null) {
                    pn0 pn0Var = ro0Var2.d0;
                    if (pn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(pn0Var);
                        ro0Var2.d0 = null;
                    }
                    ro0Var2.u0();
                    break;
                }
                break;
            case 6:
                ro0.X((ro0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 7:
                ro0 ro0Var3 = (ro0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = ro0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity != null) {
                    ro0Var3.a1 = true;
                    ro0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = ro0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (qo0Var2 = ro0Var3.Z0) != null) {
                        qo0Var2.a(1);
                    }
                    ro0Var3.u0();
                    if (z10 && (qo0Var = ro0Var3.Z0) != null) {
                        qo0Var.a(ro0Var3.f1);
                    }
                    long s02 = ro0Var3.s0();
                    if (s02 > 0) {
                        str = UserObject.getForcedFirstName(ro0Var3.getMessagesController().getUser(Long.valueOf(s02)));
                    } else if (s02 < 0 && (chat = ro0Var3.getMessagesController().getChat(Long.valueOf(-s02))) != null) {
                        str = chat.title;
                    }
                    long r02 = ro0Var3.r0();
                    int i21 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, ro0Var3.R0[0], ro0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) r02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) r02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(U);
                        if (s02 == 0 || string == null || z12) {
                            String str6 = string;
                            M = str6 != null ? b02.M(str6, replaceTags, i21) : b02.R(i21, 36, replaceTags);
                        } else {
                            M = b02.K(i21, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new bi.j4(s02, 2));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.s = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            di.y3 y3Var = new di.y3(ro0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(y3Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                c31.T(photoViewer.E, photoViewer.m4, false, (di.b) this.c, null);
                break;
            case 9:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                vs0 vs0Var = (vs0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (vs0Var.getWindow() != null) {
                    vs0Var.setFocusable(true);
                    wn wnVar = photoViewer2.l4;
                    if (wnVar != null && (jkVar = wnVar.Y) != null) {
                        jkVar.i0(false);
                        break;
                    }
                }
                break;
            case 10:
                bi.t2 t2Var = (bi.t2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                t2Var.run(bitmap);
                break;
            case 11:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                sg.w0 w0Var = (sg.w0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.c.postRunnable(new w90(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 12:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (g6Var != null) {
                    ArrayList arrayList = g6Var.h;
                    org.telegram.ui.Components.d6 d6Var = g6Var.n;
                    if (d6Var != null) {
                        arrayList.add(d6Var);
                    }
                    org.telegram.ui.Components.d6 d6Var2 = g6Var.r;
                    if (d6Var2 != null) {
                        arrayList.add(d6Var2);
                    }
                    org.telegram.ui.Components.d6 d6Var3 = g6Var.s;
                    if (d6Var3 != null) {
                        arrayList.add(d6Var3);
                    }
                    g6Var.n = new org.telegram.ui.Components.d6(bitmap2);
                    g6Var.r = null;
                    g6Var.s = null;
                    g6Var.t();
                    break;
                }
                break;
            case 13:
                wr0 wr0Var = (wr0) this.b;
                View view2 = (View) this.c;
                wr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = wr0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                ju0 ju0Var = photoViewer4.E2;
                if (ju0Var != null) {
                    ju0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 14:
                gt0 gt0Var = (gt0) this.b;
                org.telegram.ui.Components.t81 t81Var = (org.telegram.ui.Components.t81) this.c;
                gt0Var.getClass();
                if (t81Var.p() > 0 && t81Var.n() >= t81Var.p() - 590) {
                    gt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 15:
                kt0 kt0Var = (kt0) this.b;
                sg.w0 w0Var2 = (sg.w0) this.c;
                w0Var2.e.h();
                w0Var2.c.postRunnable(new w90(i12));
                try {
                    kt0Var.b.e0.removeView(w0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 16:
                ps0 ps0Var = (ps0) this.b;
                bh.p pVar = (bh.p) this.c;
                PhotoViewer photoViewer5 = ps0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) pVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 17:
                ut0 ut0Var = (ut0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                ut0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 18:
                ut0 ut0Var2 = (ut0) this.b;
                su0 su0Var = (su0) this.c;
                ut0Var2.r.s4 = false;
                if (!su0Var.s) {
                    su0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 19:
                zv0 zv0Var = (zv0) this.b;
                String str7 = (String) this.c;
                zv0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                zv0Var.c(true);
                break;
            case 20:
                zv0 zv0Var2 = (zv0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                zv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                zv0Var2.c(true);
                break;
            case 21:
                zv0 zv0Var3 = (zv0) this.b;
                SendMessagesHelper.getInstance(zv0Var3.H.currentAccount).deletePollOption(zv0Var3.H, (byte[]) this.c);
                zv0Var3.c(true);
                break;
            case 22:
                PrivacyControlActivity.X((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.y0();
                    break;
                }
                break;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.z0();
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) this.c;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                a9Var.setChecked(z13);
                break;
            case 26:
                ((ux0) this.b).getMessagesController().unblockPeer(((Long) this.c).longValue());
                break;
            case 27:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                int i22 = ProfileActivity.R6;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i23 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i23);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i23, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new wn(bundle), true);
                break;
            case 28:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j10 = profileActivity2.A2;
                if (j10 == 0) {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i24 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i24);
                    if (AndroidUtilities.isTablet()) {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i24, Long.valueOf(-profileActivity2.f1));
                    } else {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i24, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.J1 = 0;
                    profileActivity2.finishFragment();
                    break;
                } else {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.wc.a(profileActivity2)) {
                        org.telegram.ui.Components.wc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.p5(true, false);
                        break;
                    }
                }
                break;
            default:
                AgentController agentController = (AgentController) this.b;
                String str8 = (String) this.c;
                int i25 = ProfileActivity.R6;
                agentController.disconnect(str8);
                break;
        }
    }
}

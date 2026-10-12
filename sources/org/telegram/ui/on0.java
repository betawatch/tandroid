package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ on0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c10;
        String formatPluralString;
        int i10;
        int i11;
        String formatString;
        org.telegram.ui.ActionBar.m2 U;
        bp0 bp0Var;
        bp0 bp0Var2;
        sk skVar;
        String str = "";
        int i12 = 16;
        String str2 = null;
        switch (this.a) {
            case 0:
                ((pn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 1:
                cp0 cp0Var = (cp0) this.b;
                View view = (View) this.c;
                cp0Var.D0(false);
                view.callOnClick();
                break;
            case 2:
                cp0 cp0Var2 = (cp0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                cp0Var2.H0(true, false);
                if (tL_error != null) {
                    if (!tL_error.text.startsWith("CODE_INVALID")) {
                        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                            cp0Var2.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue < 60) {
                                c10 = 0;
                                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                            } else {
                                c10 = 0;
                                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                            }
                            String string = LocaleController.getString(R.string.AppName);
                            int i13 = R.string.FloodWaitTime;
                            Object[] objArr = new Object[1];
                            objArr[c10] = formatPluralString;
                            cp0Var2.F0(string, LocaleController.formatString("FloodWaitTime", i13, objArr));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.k3 k3Var = cp0Var2.S;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = cp0Var2.S;
                        k3Var2.a.setText("");
                        k3Var2.b = false;
                        k3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (cp0Var2.getParentActivity() != null) {
                    zn0 zn0Var = cp0Var2.d0;
                    if (zn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(zn0Var);
                        cp0Var2.d0 = null;
                    }
                    cp0Var2.t0();
                    break;
                }
                break;
            case 3:
                cp0.W((cp0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 4:
                cp0 cp0Var3 = (cp0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = cp0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    cp0Var3.a1 = true;
                    cp0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = cp0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (bp0Var2 = cp0Var3.Z0) != null) {
                        bp0Var2.a(1);
                    }
                    cp0Var3.t0();
                    if (z10 && (bp0Var = cp0Var3.Z0) != null) {
                        bp0Var.a(cp0Var3.f1);
                    }
                    long r02 = cp0Var3.r0();
                    int i14 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i14 <= 0) {
                        if (i14 < 0) {
                            i10 = 0;
                            i11 = i14;
                            TLRPC.Chat chat = cp0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                            if (chat != null) {
                                str = chat.title;
                            }
                            long q02 = cp0Var3.q0();
                            int i15 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                            if (z10) {
                                str2 = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                            }
                            String str3 = str2;
                            if (z10) {
                                int i16 = R.string.PaymentInfoHint;
                                String str4 = cp0Var3.R0[i10];
                                String str5 = cp0Var3.q0;
                                Object[] objArr2 = new Object[2];
                                objArr2[i10] = str4;
                                objArr2[1] = str5;
                                formatString = LocaleController.formatString(i16, objArr2);
                            } else if (z12) {
                                formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                            } else {
                                String str6 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                                Object[] objArr3 = new Object[1];
                                objArr3[i10] = str;
                                formatString = LocaleController.formatPluralStringComma(str6, (int) q02, objArr3);
                            }
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                            U = LaunchActivity.U();
                            if (U == null) {
                                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(U);
                                org.telegram.ui.Components.sc M = (i11 == 0 || str3 == null || z12) ? str3 != null ? a02.M(str3, replaceTags, i15) : a02.Q(i15, 36, replaceTags) : a02.K(i15, str3, replaceTags, LocaleController.getString(R.string.ViewInChat), new do0(r02, i10));
                                M.r = false;
                                M.j = 5000;
                                if (messageArr[0] != null) {
                                    bi.y4 y4Var = new bi.y4(cp0Var3, M, z11, messageArr, 3);
                                    org.telegram.ui.Components.wb wbVar = M.e;
                                    if (wbVar != null) {
                                        wbVar.setOnClickListener(y4Var);
                                    }
                                }
                                M.k(z12);
                                break;
                            }
                        }
                    } else {
                        str = UserObject.getForcedFirstName(cp0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    }
                    i10 = 0;
                    i11 = i14;
                    long q022 = cp0Var3.q0();
                    int i152 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    String str32 = str2;
                    if (z10) {
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                    }
                }
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                n41.U(photoViewer.E, photoViewer.m4, false, (bi.b) this.c, null);
                break;
            case 6:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                nt0 nt0Var = (nt0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (nt0Var.getWindow() != null) {
                    nt0Var.setFocusable(true);
                    fo foVar = photoViewer2.l4;
                    if (foVar != null && (skVar = foVar.Y) != null) {
                        skVar.k0(false);
                        break;
                    }
                }
                break;
            case 7:
                bi.i iVar = (bi.i) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                iVar.run(bitmap);
                break;
            case 8:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                rg.y0 y0Var = (rg.y0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                y0Var.e.h();
                y0Var.c.postRunnable(new b31(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 9:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (f6Var != null) {
                    ArrayList arrayList = f6Var.h;
                    org.telegram.ui.Components.c6 c6Var = f6Var.n;
                    if (c6Var != null) {
                        arrayList.add(c6Var);
                    }
                    org.telegram.ui.Components.c6 c6Var2 = f6Var.r;
                    if (c6Var2 != null) {
                        arrayList.add(c6Var2);
                    }
                    org.telegram.ui.Components.c6 c6Var3 = f6Var.s;
                    if (c6Var3 != null) {
                        arrayList.add(c6Var3);
                    }
                    f6Var.n = new org.telegram.ui.Components.c6(bitmap2);
                    f6Var.r = null;
                    f6Var.s = null;
                    f6Var.t();
                    break;
                }
                break;
            case 10:
                ns0 ns0Var = (ns0) this.b;
                View view2 = (View) this.c;
                ns0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = ns0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                bv0 bv0Var = photoViewer4.E2;
                if (bv0Var != null) {
                    bv0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 11:
                yt0 yt0Var = (yt0) this.b;
                org.telegram.ui.Components.h81 h81Var = (org.telegram.ui.Components.h81) this.c;
                yt0Var.getClass();
                if (h81Var.p() > 0 && h81Var.n() >= h81Var.p() - 590) {
                    yt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 12:
                cu0 cu0Var = (cu0) this.b;
                rg.y0 y0Var2 = (rg.y0) this.c;
                y0Var2.e.h();
                y0Var2.c.postRunnable(new b31(i12));
                try {
                    cu0Var.b.e0.removeView(y0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ht0 ht0Var = (ht0) this.b;
                ah.v vVar = (ah.v) this.c;
                PhotoViewer photoViewer5 = ht0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 14:
                mu0 mu0Var = (mu0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                mu0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 15:
                mu0 mu0Var2 = (mu0) this.b;
                kv0 kv0Var = (kv0) this.c;
                mu0Var2.r.s4 = false;
                if (!kv0Var.s) {
                    kv0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 16:
                sw0 sw0Var = (sw0) this.b;
                String str7 = (String) this.c;
                sw0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                sw0Var.c(true);
                break;
            case 17:
                sw0 sw0Var2 = (sw0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                sw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                sw0Var2.c(true);
                break;
            case 18:
                sw0 sw0Var3 = (sw0) this.b;
                SendMessagesHelper.getInstance(sw0Var3.H.currentAccount).deletePollOption(sw0Var3.H, (byte[]) this.c);
                sw0Var3.c(true);
                break;
            case 19:
                PrivacyControlActivity.W((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 20:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 21:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.y0();
                break;
            case 22:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) this.c;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                w8Var.setChecked(z13);
                break;
            case 23:
                ((my0) this.b).getMessagesController().unblockPeer(((Long) this.c).longValue());
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr4 = (Object[]) this.c;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i17 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i17);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i17, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr4[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new fo(bundle), true);
                break;
            case 25:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j10 = profileActivity2.A2;
                if (j10 == 0) {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i18 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i18);
                    if (AndroidUtilities.isTablet()) {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i18, Long.valueOf(-profileActivity2.f1));
                    } else {
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i18, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.J1 = 0;
                    profileActivity2.finishFragment();
                    break;
                } else {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.zc.a(profileActivity2)) {
                        org.telegram.ui.Components.zc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                }
                break;
            case 26:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) this.b).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) this.c));
                break;
            case 27:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                profileActivity3.getClass();
                org.telegram.ui.Components.sc.e();
                pf.d.s(profileActivity3.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 28:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f1);
                countDownLatch.countDown();
                break;
            default:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
        }
    }
}

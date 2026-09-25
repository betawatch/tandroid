package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jx0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.u8 u8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 1:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 2:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z10;
                ((org.telegram.ui.Cells.w8) obj).setChecked(z10);
                break;
            case 3:
                ((yx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new wn(bundle), true);
                break;
            case 5:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j3 = profileActivity2.A2;
                if (j3 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j3));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i15 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i15);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.J1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 6:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 7:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 8:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 9:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 10:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.s2.g());
                break;
            case 11:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity7.x5) != null) {
                    u8Var.run();
                }
                profileActivity7.x5 = null;
                break;
            case 12:
                bz0 bz0Var = (bz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = bz0Var.b1.c;
                org.telegram.ui.Components.xc.x(profileActivity8.getParentActivity(), profileActivity8.m5, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 13:
                pz0 pz0Var = (pz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = pz0Var.b1;
                org.telegram.ui.Components.xc.x(profileActivity9.getParentActivity(), profileActivity9.m5, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, pz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), pz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 14:
                ((q01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 15:
                z9 z9Var = new z9(null);
                z9Var.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment(z9Var);
                break;
            case 16:
                a11 a11Var = (a11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = a11Var.d;
                org.telegram.ui.ActionBar.m2 m2Var = a11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i16 = 0; i16 < split.length; i16++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i16]);
                    strArr2[i16] = translitString;
                    if (translitString.equals(split[i16])) {
                        strArr2[i16] = null;
                    }
                }
                int i17 = 0;
                while (true) {
                    z01[] z01VarArr = a11Var.c;
                    if (i17 >= z01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (a11Var.E != null) {
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i18);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i19 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i19 < split.length) {
                                        if (split[i19].length() != 0) {
                                            String str8 = split[i19];
                                            int indexOf = str7.indexOf(" " + str8);
                                            i11 = size;
                                            if (indexOf < 0 && (str = strArr3[i19]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(m2Var.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            i11 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder2 != null && i19 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i19++;
                                        size = i11;
                                        arrayList2 = arrayList;
                                    } else {
                                        i11 = size;
                                    }
                                }
                                i18++;
                                size = i11;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new c90(a11Var, str6, arrayList3, arrayList4, arrayList5, 22));
                        break;
                    } else {
                        z01 z01Var = z01VarArr[i17];
                        if (z01Var != null) {
                            String str9 = z01Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i20 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i20 < split.length) {
                                if (split[i20].length() != 0) {
                                    String str11 = split[i20];
                                    i12 = i17;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i20]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(m2Var.getThemedColor(org.telegram.ui.ActionBar.h6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i12 = i17;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i20 == split.length - 1) {
                                    if (z01Var.f == 502) {
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 >= 4) {
                                                i21 = -1;
                                            } else if (UserConfig.getInstance(i21).isClientActivated()) {
                                                i21++;
                                            }
                                        }
                                        if (i21 < 0) {
                                        }
                                    }
                                    arrayList3.add(z01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i20++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i17 = i12;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i17;
                        i17 = i12 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 17:
                a11 a11Var2 = (a11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                a11Var2.d.addAll(arrayList6);
                int i22 = a11Var2.f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = a11Var2.E;
                if (!a11Var2.w) {
                    a11Var2.l();
                    break;
                }
                break;
            case 18:
                e11 e11Var = (e11) obj2;
                e11Var.f.add((g11) obj);
                e11Var.a();
                break;
            case 19:
                ((w21) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 20:
                q21 q21Var = (q21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    q21Var.getClass();
                    break;
                } else {
                    int i23 = q21Var.J;
                    if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) q21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                q21Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    q21Var.J = tL_exportedContactToken.expires;
                    q21Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
            case 21:
                s31 s31Var = (s31) ((View[]) obj2)[0];
                s31Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                s31Var.c = null;
                s31Var.d = null;
                s31Var.f.Y2.N(false);
                break;
            case 22:
                ((s31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 23:
                s31 s31Var2 = (s31) ((View[]) obj2)[0];
                s31Var2.b = null;
                s31Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                s31Var2.d = null;
                s31Var2.f.Y2.N(false);
                break;
            case 24:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 25:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.vw) obj);
                break;
            case 26:
                ((SecretMediaViewer) obj2).M = false;
                ((vu0) obj).a.setVisible(false, true);
                break;
            case 27:
                ((SecretMediaViewer) ((n7.z0) obj2).c).h((File) obj);
                break;
            case 28:
                a71 a71Var = (a71) obj2;
                a71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj).presentFragment(new StickersActivity(5, a71Var.L0));
                Runnable runnable = a71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((z81) obj2).k(false).j();
                break;
        }
    }

    public /* synthetic */ jx0(org.telegram.ui.Components.uq0 uq0Var, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.b = uq0Var;
        this.c = iVar;
    }
}

package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class av0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ av0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.v8 v8Var;
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
                iv0 iv0Var = (iv0) obj2;
                iv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                iv0Var.c(true);
                break;
            case 1:
                iv0 iv0Var2 = (iv0) obj2;
                iv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                iv0Var2.c(true);
                break;
            case 2:
                iv0 iv0Var3 = (iv0) obj2;
                SendMessagesHelper.getInstance(iv0Var3.D.currentAccount).deletePollOption(iv0Var3.D, (byte[]) obj);
                iv0Var3.c(true);
                break;
            case 3:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 4:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 6:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.R;
                privacySettingsActivity2.R = z10;
                ((org.telegram.ui.Cells.q8) obj).setChecked(z10);
                break;
            case 7:
                ((bx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new tn(bundle), true);
                break;
            case 9:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.w2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.b1, user);
                    if (profileActivity2.A2 != null && user != null && org.telegram.ui.Components.tc.a(profileActivity2)) {
                        org.telegram.ui.Components.tc.D(profileActivity2, user, profileActivity2.A2.title).j();
                    }
                    if (profileActivity2.q2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i15 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i15);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.b1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.b1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.F1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 10:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 11:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.mc.e();
                ye.d.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 12:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.A2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.b1);
                ((CountDownLatch) obj).countDown();
                break;
            case 13:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.C2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 14:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.m8) ((View) obj)).setChecked(profileActivity6.o2.g());
                break;
            case 15:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (v8Var = profileActivity7.t5) != null) {
                    v8Var.run();
                }
                profileActivity7.t5 = null;
                break;
            case 16:
                gy0 gy0Var = (gy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = gy0Var.X0.c;
                org.telegram.ui.Components.tc.x(profileActivity8.getParentActivity(), profileActivity8.i5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, gy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), gy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 17:
                vy0 vy0Var = (vy0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = vy0Var.X0;
                org.telegram.ui.Components.tc.x(profileActivity9.getParentActivity(), profileActivity9.i5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, vy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), vy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 18:
                ((vz0) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 19:
                w9 w9Var = new w9(null);
                w9Var.d = (org.telegram.ui.ActionBar.c6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment(w9Var);
                break;
            case 20:
                g01 g01Var = (g01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = g01Var.d;
                org.telegram.ui.ActionBar.o2 o2Var = g01Var.e;
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
                    f01[] f01VarArr = g01Var.c;
                    if (i17 >= f01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (g01Var.A != null) {
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
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(o2Var.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf, str8.length() + indexOf, 33);
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
                        AndroidUtilities.runOnUIThread(new a01(g01Var, str6, arrayList3, arrayList4, arrayList5, 0));
                        break;
                    } else {
                        f01 f01Var = f01VarArr[i17];
                        if (f01Var != null) {
                            String str9 = f01Var.a;
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
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(o2Var.getThemedColor(org.telegram.ui.ActionBar.g6.q6));
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
                                    if (f01Var.f == 502) {
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
                                    arrayList3.add(f01Var);
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
            case 21:
                g01 g01Var2 = (g01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                g01Var2.d.addAll(arrayList6);
                int i22 = g01Var2.f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = g01Var2.A;
                if (!g01Var2.w) {
                    g01Var2.l();
                    break;
                }
                break;
            case 22:
                k01 k01Var = (k01) obj2;
                k01Var.f.add((m01) obj);
                k01Var.a();
                break;
            case 23:
                ((a21) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 24:
                v11 v11Var = (v11) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    v11Var.getClass();
                    break;
                } else {
                    int i23 = v11Var.F;
                    if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) v11Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                v11Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    v11Var.F = tL_exportedContactToken.expires;
                    v11Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
                break;
            case 25:
                x21 x21Var = (x21) ((View[]) obj2)[0];
                x21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                x21Var.c = null;
                x21Var.d = null;
                x21Var.f.U2.N(false);
                break;
            case 26:
                ((x21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 27:
                x21 x21Var2 = (x21) ((View[]) obj2)[0];
                x21Var2.b = null;
                x21Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                x21Var2.d = null;
                x21Var2.f.U2.N(false);
                break;
            case 28:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.tc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            default:
                org.telegram.ui.Components.tc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ii0) obj);
                break;
        }
    }

    public /* synthetic */ av0(org.telegram.ui.Components.dq0 dq0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = dq0Var;
        this.c = hVar;
    }
}

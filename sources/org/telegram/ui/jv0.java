package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jv0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.o8 o8Var;
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
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                qv0 qv0Var = (qv0) obj2;
                qv0Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                qv0Var.c(true);
                break;
            case 1:
                qv0 qv0Var2 = (qv0) obj2;
                SendMessagesHelper.getInstance(qv0Var2.H.currentAccount).deletePollOption(qv0Var2.H, (byte[]) obj);
                qv0Var2.c(true);
                break;
            case 2:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 3:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 5:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.v8) obj).setChecked(z11);
                break;
            case 6:
                ((kx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new qn(bundle), true);
                break;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.B2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.g1, user);
                    if (profileActivity2.F2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i15 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i15);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.g1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.g1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.K1 = i10;
                    profileActivity2.finishFragment();
                    break;
                }
                break;
            case 9:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 10:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.qc.e();
                pf.d.r(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 11:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.F2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.g1);
                ((CountDownLatch) obj).countDown();
                break;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.q8) ((View) obj)).setChecked(profileActivity5.t2.g());
                break;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                profileActivity6.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (o8Var = profileActivity7.z5) != null) {
                    o8Var.run();
                }
                profileActivity7.z5 = null;
                break;
            case 15:
                my0 my0Var = (my0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = my0Var.c1.c;
                org.telegram.ui.Components.xc.x(profileActivity8.getParentActivity(), profileActivity8.o5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, my0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), my0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 16:
                bz0 bz0Var = (bz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = bz0Var.c1;
                org.telegram.ui.Components.xc.x(profileActivity9.getParentActivity(), profileActivity9.o5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 17:
                ((b01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 18:
                ba baVar = new ba(null);
                baVar.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(baVar);
                break;
            case 19:
                m01 m01Var = (m01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = m01Var.d;
                org.telegram.ui.ActionBar.n2 n2Var = m01Var.e;
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
                    l01[] l01VarArr = m01Var.c;
                    boolean z12 = z10;
                    if (i17 >= l01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (m01Var.E != null) {
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
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, str8.length() + indexOf, 33);
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
                        AndroidUtilities.runOnUIThread(new g01(m01Var, str6, arrayList3, arrayList4, arrayList5, 0));
                        break;
                    } else {
                        l01 l01Var = l01VarArr[i17];
                        if (l01Var != null) {
                            String str9 = l01Var.a;
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
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.h6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        z10 = z12;
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
                                    if (l01Var.f == 502) {
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
                                    arrayList3.add(l01Var);
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
                        z10 = z12;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 20:
                m01 m01Var2 = (m01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                m01Var2.d.addAll(arrayList6);
                int i22 = m01Var2.f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = m01Var2.E;
                if (!m01Var2.w) {
                    m01Var2.l();
                    break;
                }
                break;
            case 21:
                q01 q01Var = (q01) obj2;
                q01Var.f.add((s01) obj);
                q01Var.a();
                break;
            case 22:
                n21 n21Var = (n21) ((View[]) obj2)[0];
                n21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                n21Var.c = null;
                n21Var.d = null;
                n21Var.f.W2.N(false);
                break;
            case 23:
                ((n21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 24:
                n21 n21Var2 = (n21) ((View[]) obj2)[0];
                n21Var2.b = null;
                n21Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                n21Var2.d = null;
                n21Var2.f.W2.N(false);
                break;
            case 25:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 26:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.go0) obj);
                break;
            case 27:
                ((SecretMediaViewer) obj2).M = false;
                ((ju0) obj).a.setVisible(false, true);
                break;
            case 28:
                ((SecretMediaViewer) ((mi.q) obj2).c).h((File) obj);
                break;
            default:
                x51 x51Var = (x51) obj2;
                x51Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, x51Var.L0));
                Runnable runnable = x51Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jv0(org.telegram.ui.Components.er0 er0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = er0Var;
        this.c = hVar;
    }
}

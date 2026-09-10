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
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ey0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.a9 a9Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        int i12;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity.V;
                privacySettingsActivity.V = z10;
                ((org.telegram.ui.Cells.x8) obj).setChecked(z10);
                break;
            case 1:
                ((ky0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new eo(bundle), true);
                break;
            case 3:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j3 = profileActivity2.A2;
                if (j3 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j3));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.wc.a(profileActivity2)) {
                        org.telegram.ui.Components.wc.D(profileActivity2, user, profileActivity2.E2.title).j();
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
            case 4:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.pc.e();
                nf.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 6:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 7:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 8:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.s8) ((View) obj)).setChecked(profileActivity6.s2.g());
                break;
            case 9:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (a9Var = profileActivity7.x5) != null) {
                    a9Var.run();
                }
                profileActivity7.x5 = null;
                break;
            case 10:
                oz0 oz0Var = (oz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = oz0Var.b1.c;
                org.telegram.ui.Components.wc.x(profileActivity8.getParentActivity(), profileActivity8.m5, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, oz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), oz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 11:
                c01 c01Var = (c01) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = c01Var.b1;
                org.telegram.ui.Components.wc.x(profileActivity9.getParentActivity(), profileActivity9.m5, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, c01Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), c01Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 12:
                ((f11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 13:
                z9 z9Var = new z9(null);
                z9Var.d = (org.telegram.ui.ActionBar.f6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment(z9Var);
                break;
            case 14:
                p11 p11Var = (p11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = p11Var.d;
                org.telegram.ui.ActionBar.p2 p2Var = p11Var.e;
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
                    o11[] o11VarArr = p11Var.c;
                    if (i17 >= o11VarArr.length) {
                        String str6 = str5;
                        String[] strArr3 = strArr2;
                        if (p11Var.E != null) {
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
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf, str8.length() + indexOf, 33);
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
                        AndroidUtilities.runOnUIThread(new ac0(p11Var, str6, arrayList3, arrayList4, arrayList5));
                        break;
                    } else {
                        o11 o11Var = o11VarArr[i17];
                        if (o11Var != null) {
                            String str9 = o11Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i20 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i20 < split.length) {
                                if (split[i20].length() != 0) {
                                    String str11 = split[i20];
                                    str3 = str5;
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
                                        i12 = i17;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(p2Var.getThemedColor(org.telegram.ui.ActionBar.j6.q6));
                                        int length = str12.length() + indexOf2;
                                        strArr = strArr2;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i17++;
                                        str5 = str3;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    str3 = str5;
                                    i12 = i17;
                                    strArr = strArr2;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i20 == split.length - 1) {
                                    if (o11Var.f == 502) {
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
                                    arrayList3.add(o11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i20++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                str5 = str3;
                                strArr2 = strArr;
                                str10 = str2;
                                i17 = i12;
                            }
                        }
                        str3 = str5;
                        i17++;
                        str5 = str3;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 15:
                p11 p11Var2 = (p11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                p11Var2.d.addAll(arrayList6);
                int i22 = p11Var2.f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = p11Var2.E;
                if (!p11Var2.w) {
                    p11Var2.l();
                    break;
                }
                break;
            case 16:
                t11 t11Var = (t11) obj2;
                t11Var.f.add((v11) obj);
                t11Var.a();
                break;
            case 17:
                ((k31) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 18:
                e31 e31Var = (e31) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    e31Var.getClass();
                    break;
                } else {
                    int i23 = e31Var.J;
                    if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) e31Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                e31Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    e31Var.J = tL_exportedContactToken.expires;
                    e31Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
                break;
            case 19:
                g41 g41Var = (g41) ((View[]) obj2)[0];
                g41Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                g41Var.c = null;
                g41Var.d = null;
                g41Var.f.Y2.N(false);
                break;
            case 20:
                ((g41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 21:
                g41 g41Var2 = (g41) ((View[]) obj2)[0];
                g41Var2.b = null;
                g41Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                g41Var2.d = null;
                g41Var2.f.Y2.N(false);
                break;
            case 22:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 23:
                org.telegram.ui.Components.wc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.hy) obj);
                break;
            case 24:
                ((SecretMediaViewer) obj2).M = false;
                ((ev0) obj).a.setVisible(false, true);
                break;
            case 25:
                ((SecretMediaViewer) ((og.u0) obj2).c).h((File) obj);
                break;
            case 26:
                l71 l71Var = (l71) obj2;
                l71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, l71Var.L0));
                Runnable runnable = l71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 27:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.wc.a0((k91) obj2).k(false).j();
                break;
            case 28:
                k91.X((k91) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            default:
                d91 d91Var = (d91) obj2;
                a0.i iVar3 = (a0.i) obj;
                k91 k91Var = d91Var.b1;
                org.telegram.ui.Components.wc.x(k91Var.getParentActivity(), k91Var.b, iVar3.m(), iVar3.m() == 1 ? ((TLRPC.Dialog) iVar3.n(0)).id : 0L, d91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), d91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
        }
    }

    public /* synthetic */ ey0(org.telegram.ui.Components.sq0 sq0Var, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.b = sq0Var;
        this.c = iVar;
    }
}

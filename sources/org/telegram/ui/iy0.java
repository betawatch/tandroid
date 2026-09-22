package org.telegram.ui;

import android.graphics.Bitmap;
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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        org.telegram.messenger.t8 t8Var;
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
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j3 = profileActivity.A2;
                if (j3 != 0) {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j3));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f1, user);
                    if (profileActivity.E2 != null && user != null && org.telegram.ui.Components.vc.a(profileActivity)) {
                        org.telegram.ui.Components.vc.D(profileActivity, user, profileActivity.E2.title).j();
                    }
                    if (profileActivity.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity.e5(true, false);
                        break;
                    }
                } else {
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i14 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i14);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity.f1));
                    } else {
                        i10 = 0;
                        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                    }
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f1, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId())));
                    profileActivity.J1 = i10;
                    profileActivity.finishFragment();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                profileActivity2.getClass();
                org.telegram.ui.Components.oc.e();
                nf.f.s(profileActivity2.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.E2 = profileActivity3.getMessagesStorage().getChat(profileActivity3.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 4:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.getClass();
                profileActivity4.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 5:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity5.s2.g());
                break;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (t8Var = profileActivity6.x5) != null) {
                    t8Var.run();
                }
                profileActivity6.x5 = null;
                break;
            case 7:
                lz0 lz0Var = (lz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity7 = lz0Var.b1.c;
                org.telegram.ui.Components.vc.x(profileActivity7.getParentActivity(), profileActivity7.m5, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, lz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), lz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                break;
            case 8:
                zz0 zz0Var = (zz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity8 = zz0Var.b1;
                org.telegram.ui.Components.vc.x(profileActivity8.getParentActivity(), profileActivity8.m5, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, zz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), zz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                break;
            case 9:
                ((a11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 10:
                z9 z9Var = new z9(null);
                z9Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(z9Var);
                break;
            case 11:
                k11 k11Var = (k11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = k11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var = k11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i15 = 0; i15 < split.length; i15++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i15]);
                    strArr2[i15] = translitString;
                    if (translitString.equals(split[i15])) {
                        strArr2[i15] = null;
                    }
                }
                int i16 = 0;
                while (true) {
                    j11[] j11VarArr = k11Var.c;
                    if (i16 >= j11VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (k11Var.E != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i17);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i18 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i18 < split.length) {
                                        if (split[i18].length() != 0) {
                                            String str8 = split[i18];
                                            int indexOf = str7.indexOf(" " + str8);
                                            i11 = size;
                                            if (indexOf < 0 && (str = strArr3[i18]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            i11 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder2 != null && i18 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i18++;
                                        size = i11;
                                        arrayList2 = arrayList;
                                    } else {
                                        i11 = size;
                                    }
                                }
                                i17++;
                                size = i11;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new g90(k11Var, str6, arrayList3, arrayList4, arrayList5, 22));
                        break;
                    } else {
                        j11 j11Var = j11VarArr[i16];
                        if (j11Var != null) {
                            String str9 = j11Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i19 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i19 < split.length) {
                                if (split[i19].length() != 0) {
                                    String str11 = split[i19];
                                    i12 = i16;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i19]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.i6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i16 = i12 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i12 = i16;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i19 == split.length - 1) {
                                    if (j11Var.f == 502) {
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 >= 4) {
                                                i20 = -1;
                                            } else if (UserConfig.getInstance(i20).isClientActivated()) {
                                                i20++;
                                            }
                                        }
                                        if (i20 < 0) {
                                        }
                                    }
                                    arrayList3.add(j11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i19++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i16 = i12;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i16;
                        i16 = i12 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 12:
                k11 k11Var2 = (k11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                k11Var2.d.addAll(arrayList6);
                int i21 = k11Var2.f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = k11Var2.E;
                if (!k11Var2.w) {
                    k11Var2.l();
                    break;
                }
                break;
            case 13:
                o11 o11Var = (o11) obj2;
                o11Var.f.add((q11) obj);
                o11Var.a();
                break;
            case 14:
                ((f31) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 15:
                z21 z21Var = (z21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    z21Var.getClass();
                    break;
                } else {
                    int i22 = z21Var.J;
                    if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) z21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                z21Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    z21Var.J = tL_exportedContactToken.expires;
                    z21Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
                break;
            case 16:
                b41 b41Var = (b41) ((View[]) obj2)[0];
                b41Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                b41Var.c = null;
                b41Var.d = null;
                b41Var.f.Y2.N(false);
                break;
            case 17:
                ((b41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 18:
                b41 b41Var2 = (b41) ((View[]) obj2)[0];
                b41Var2.b = null;
                b41Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                b41Var2.d = null;
                b41Var2.f.Y2.N(false);
                break;
            case 19:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.vc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 20:
                org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ny) obj);
                break;
            case 21:
                ((SecretMediaViewer) obj2).M = false;
                ((dv0) obj).a.setVisible(false, true);
                break;
            case 22:
                ((SecretMediaViewer) ((n7.a1) obj2).c).h((File) obj);
                break;
            case 23:
                h71 h71Var = (h71) obj2;
                h71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, h71Var.L0));
                Runnable runnable = h71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 24:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.vc.a0((f91) obj2).k(false).j();
                break;
            case 25:
                f91.X((f91) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 26:
                y81 y81Var = (y81) obj2;
                a0.i iVar3 = (a0.i) obj;
                f91 f91Var = y81Var.b1;
                org.telegram.ui.Components.vc.x(f91Var.getParentActivity(), f91Var.b, iVar3.m(), iVar3.m() == 1 ? ((TLRPC.Dialog) iVar3.n(0)).id : 0L, y81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), y81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                break;
            case 27:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                new r91(n2Var2.getContext(), n2Var2.getCurrentAccount(), n2Var2.getResourceProvider(), (nf) obj).show();
                break;
            case 28:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ iy0(org.telegram.ui.Components.hq0 hq0Var, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.b = hq0Var;
        this.c = iVar;
    }
}

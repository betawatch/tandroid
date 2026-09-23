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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class by0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ by0(int i10, Object obj, Object obj2) {
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
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j3 = profileActivity.A2;
                if (j3 != 0) {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j3));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f1, user);
                    if (profileActivity.E2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity)) {
                        org.telegram.ui.Components.xc.D(profileActivity, user, profileActivity.E2.title).j();
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
                org.telegram.ui.Components.qc.e();
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
                ((org.telegram.ui.Cells.s8) ((View) obj)).setChecked(profileActivity5.s2.g());
                break;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity6.x5) != null) {
                    u8Var.run();
                }
                profileActivity6.x5 = null;
                break;
            case 7:
                dz0 dz0Var = (dz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity7 = dz0Var.b1.c;
                org.telegram.ui.Components.xc.x(profileActivity7.getParentActivity(), profileActivity7.m5, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 8:
                rz0 rz0Var = (rz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity8 = rz0Var.b1;
                org.telegram.ui.Components.xc.x(profileActivity8.getParentActivity(), profileActivity8.m5, iVar2.m(), iVar2.m() == 1 ? ((TLRPC.Dialog) iVar2.n(0)).id : 0L, rz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), rz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 9:
                ((s01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 10:
                z9 z9Var = new z9(null);
                z9Var.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(z9Var);
                break;
            case 11:
                c11 c11Var = (c11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = c11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var = c11Var.e;
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
                    b11[] b11VarArr = c11Var.c;
                    if (i16 >= b11VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (c11Var.E != null) {
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
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, str8.length() + indexOf, 33);
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
                        AndroidUtilities.runOnUIThread(new d90(c11Var, str6, arrayList3, arrayList4, arrayList5, 22));
                        break;
                    } else {
                        b11 b11Var = b11VarArr[i16];
                        if (b11Var != null) {
                            String str9 = b11Var.a;
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
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.h6.q6));
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
                                    if (b11Var.f == 502) {
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
                                    arrayList3.add(b11Var);
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
                c11 c11Var2 = (c11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                c11Var2.d.addAll(arrayList6);
                int i21 = c11Var2.f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = c11Var2.E;
                if (!c11Var2.w) {
                    c11Var2.l();
                    break;
                }
                break;
            case 13:
                g11 g11Var = (g11) obj2;
                g11Var.f.add((i11) obj);
                g11Var.a();
                break;
            case 14:
                ((x21) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 15:
                r21 r21Var = (r21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    r21Var.getClass();
                    break;
                } else {
                    int i22 = r21Var.J;
                    if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) r21Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                        } catch (Exception unused) {
                            try {
                                r21Var.performHapticFeedback(0, 2);
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    r21Var.J = tL_exportedContactToken.expires;
                    r21Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
                break;
            case 16:
                t31 t31Var = (t31) ((View[]) obj2)[0];
                t31Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                t31Var.c = null;
                t31Var.d = null;
                t31Var.f.Y2.N(false);
                break;
            case 17:
                ((t31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 18:
                t31 t31Var2 = (t31) ((View[]) obj2)[0];
                t31Var2.b = null;
                t31Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                t31Var2.d = null;
                t31Var2.f.Y2.N(false);
                break;
            case 19:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 20:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.oy) obj);
                break;
            case 21:
                ((SecretMediaViewer) obj2).M = false;
                ((wu0) obj).a.setVisible(false, true);
                break;
            case 22:
                ((SecretMediaViewer) ((n7.a1) obj2).c).h((File) obj);
                break;
            case 23:
                z61 z61Var = (z61) obj2;
                z61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, z61Var.L0));
                Runnable runnable = z61Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 24:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((x81) obj2).k(false).j();
                break;
            case 25:
                x81.W((x81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 26:
                q81 q81Var = (q81) obj2;
                a0.i iVar3 = (a0.i) obj;
                x81 x81Var = q81Var.b1;
                org.telegram.ui.Components.xc.x(x81Var.getParentActivity(), x81Var.b, iVar3.m(), iVar3.m() == 1 ? ((TLRPC.Dialog) iVar3.n(0)).id : 0L, q81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), q81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                break;
            case 27:
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                new j91(n2Var2.getContext(), n2Var2.getCurrentAccount(), n2Var2.getResourceProvider(), (oc) obj).show();
                break;
            case 28:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.n8) obj);
                break;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ by0(org.telegram.ui.Components.hq0 hq0Var, a0.i iVar, int i10, int i11) {
        this.a = i11;
        this.b = hq0Var;
        this.c = iVar;
    }
}

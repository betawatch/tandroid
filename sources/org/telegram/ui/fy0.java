package org.telegram.ui;

import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fy0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.u8 u8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        org.telegram.ui.Components.vl0 vl0Var;
        int i12 = this.a;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                qf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                int i14 = ProfileActivity.R6;
                profileActivity2.E2 = profileActivity2.getMessagesStorage().getChat(profileActivity2.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 2:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                int i15 = ProfileActivity.R6;
                profileActivity3.getClass();
                ((org.telegram.ui.Cells.v8) ((View) obj)).setChecked(profileActivity3.s2.g());
                break;
            case 3:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                int i16 = ProfileActivity.R6;
                profileActivity4.getClass();
                profileActivity4.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 4:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                int i17 = ProfileActivity.R6;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity5.D5) != null) {
                    u8Var.run();
                }
                profileActivity5.D5 = null;
                break;
            case 5:
                uy0 uy0Var = (uy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity6 = uy0Var.a1.c;
                org.telegram.ui.Components.wc.x(profileActivity6.getParentActivity(), profileActivity6.s5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, uy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), uy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                break;
            case 6:
                iz0 iz0Var = (iz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity7 = iz0Var.a1;
                org.telegram.ui.Components.wc.x(profileActivity7.getParentActivity(), profileActivity7.s5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, iz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), iz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                break;
            case 7:
                ((j01) obj2).e.presentFragment(ProfileActivity.t4(((Long) obj).longValue()));
                break;
            case 8:
                da daVar = new da(null);
                daVar.d = (org.telegram.ui.ActionBar.u6) obj;
                ((org.telegram.ui.ActionBar.r2) obj2).presentFragment(daVar);
                break;
            case 9:
                u01 u01Var = (u01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = u01Var.d;
                org.telegram.ui.ActionBar.r2 r2Var = u01Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i18 = 0; i18 < split.length; i18++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i18]);
                    strArr2[i18] = translitString;
                    if (translitString.equals(split[i18])) {
                        strArr2[i18] = null;
                    }
                }
                int i19 = 0;
                while (true) {
                    t01[] t01VarArr = u01Var.c;
                    boolean z11 = z10;
                    if (i19 >= t01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (u01Var.E != null) {
                            int size = arrayList2.size();
                            int i20 = 0;
                            while (i20 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i20);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i21 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i21 < split.length) {
                                        if (split[i21].length() != 0) {
                                            String str8 = split[i21];
                                            int indexOf = str7.indexOf(" " + str8);
                                            i10 = size;
                                            if (indexOf < 0 && (str = strArr3[i21]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(r2Var.getThemedColor(org.telegram.ui.ActionBar.y6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder2 != null && i21 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i21++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i20++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new o01(u01Var, str6, arrayList3, arrayList4, arrayList5, 0));
                        break;
                    } else {
                        t01 t01Var = t01VarArr[i19];
                        if (t01Var != null) {
                            String str9 = t01Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i22 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i22 < split.length) {
                                if (split[i22].length() != 0) {
                                    String str11 = split[i22];
                                    i11 = i19;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i22]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(r2Var.getThemedColor(org.telegram.ui.ActionBar.y6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i19 = i11 + 1;
                                        z10 = z11;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i11 = i19;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i22 == split.length - 1) {
                                    if (t01Var.f == 502) {
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 >= 4) {
                                                i23 = -1;
                                            } else if (UserConfig.getInstance(i23).isClientActivated()) {
                                                i23++;
                                            }
                                        }
                                        if (i23 < 0) {
                                        }
                                    }
                                    arrayList3.add(t01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i22++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i19 = i11;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i19;
                        i19 = i11 + 1;
                        z10 = z11;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 10:
                u01 u01Var2 = (u01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                u01Var2.d.addAll(arrayList6);
                int i24 = u01Var2.f;
                MessagesController.getInstance(i24).faqSearchArray = arrayList6;
                MessagesController.getInstance(i24).faqWebPage = u01Var2.E;
                if (!u01Var2.w) {
                    u01Var2.l();
                    break;
                }
                break;
            case 11:
                y01 y01Var = (y01) obj2;
                y01Var.f.add((a11) obj);
                y01Var.a();
                break;
            case 12:
                u21 u21Var = (u21) ((View[]) obj2)[0];
                u21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                u21Var.c = null;
                u21Var.d = null;
                u21Var.f.g3.O(false);
                break;
            case 13:
                ((u21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 14:
                u21 u21Var2 = (u21) ((View[]) obj2)[0];
                u21Var2.b = null;
                u21Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                u21Var2.d = null;
                u21Var2.f.g3.O(false);
                break;
            case 15:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 16:
                org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.t90) obj);
                break;
            case 17:
                ((SecretMediaViewer) obj2).M = false;
                ((qu0) obj).a.setVisible(false, true);
                break;
            case 18:
                ((SecretMediaViewer) ((m4.w1) obj2).c).h((File) obj);
                break;
            case 19:
                c61 c61Var = (c61) obj2;
                c61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new StickersActivity(5, c61Var.L0));
                Runnable runnable = c61Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 20:
                d81.X((d81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 21:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.wc.b0((d81) obj2).k(false).j();
                break;
            case 22:
                w71 w71Var = (w71) obj2;
                a0.h hVar3 = (a0.h) obj;
                d81 d81Var = w71Var.a1;
                org.telegram.ui.Components.wc.x(d81Var.getParentActivity(), d81Var.b, hVar3.m(), hVar3.m() == 1 ? ((TLRPC.Dialog) hVar3.n(0)).id : 0L, w71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), w71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                break;
            case 23:
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                new n81(r2Var2.getContext(), r2Var2.getCurrentAccount(), r2Var2.getResourceProvider(), (li.s2) obj).show();
                break;
            case 24:
                ((StickersActivity) obj2).o0((org.telegram.ui.Cells.p8) obj);
                break;
            case 25:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 26:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.y6.w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.y6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.y6.x), Double.valueOf(org.telegram.ui.ActionBar.y6.y));
                }
                org.telegram.ui.ActionBar.y6.t1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.b;
                if (mm0Var != null && (vl0Var = (org.telegram.ui.Components.vl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = vl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ga) {
                        ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.y6.w, false, false);
                        break;
                    }
                }
                break;
            case 27:
                tc1 tc1Var = (tc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (tc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    tc1Var.B0.f(tc1Var.L0[0], true);
                    break;
                }
                break;
            case 28:
                xc1.Y((xc1) obj2, (String) obj);
                break;
            default:
                xc1.W((xc1) obj2, (TLRPC.TL_theme) obj);
                break;
        }
    }

    public /* synthetic */ fy0(org.telegram.ui.Components.mr0 mr0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = mr0Var;
        this.c = hVar;
    }
}

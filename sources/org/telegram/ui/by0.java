package org.telegram.ui;

import android.content.SharedPreferences;
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
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        org.telegram.messenger.v8 v8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        org.telegram.ui.Components.wl0 wl0Var;
        int i12 = this.a;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                int i13 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i14 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                qf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                int i15 = ProfileActivity.R6;
                profileActivity2.E2 = profileActivity2.getMessagesStorage().getChat(profileActivity2.f1);
                ((CountDownLatch) obj).countDown();
                break;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                int i16 = ProfileActivity.R6;
                profileActivity3.getClass();
                ((org.telegram.ui.Cells.v8) ((View) obj)).setChecked(profileActivity3.s2.g());
                break;
            case 4:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                int i17 = ProfileActivity.R6;
                profileActivity4.getClass();
                profileActivity4.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 5:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                int i18 = ProfileActivity.R6;
                if (!((boolean[]) obj)[0] && (v8Var = profileActivity5.D5) != null) {
                    v8Var.run();
                }
                profileActivity5.D5 = null;
                break;
            case 6:
                wy0 wy0Var = (wy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity6 = wy0Var.a1.c;
                org.telegram.ui.Components.wc.x(profileActivity6.getParentActivity(), profileActivity6.s5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, wy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), wy0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                break;
            case 7:
                kz0 kz0Var = (kz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity7 = kz0Var.a1;
                org.telegram.ui.Components.wc.x(profileActivity7.getParentActivity(), profileActivity7.s5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, kz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), kz0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                break;
            case 8:
                ((l01) obj2).e.presentFragment(ProfileActivity.t4(((Long) obj).longValue()));
                break;
            case 9:
                da daVar = new da(null);
                daVar.d = (org.telegram.ui.ActionBar.u6) obj;
                ((org.telegram.ui.ActionBar.r2) obj2).presentFragment(daVar);
                break;
            case 10:
                w01 w01Var = (w01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = w01Var.d;
                org.telegram.ui.ActionBar.r2 r2Var = w01Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i19 = 0; i19 < split.length; i19++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i19]);
                    strArr2[i19] = translitString;
                    if (translitString.equals(split[i19])) {
                        strArr2[i19] = null;
                    }
                }
                int i20 = 0;
                while (true) {
                    v01[] v01VarArr = w01Var.c;
                    boolean z11 = z10;
                    if (i20 >= v01VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (w01Var.E != null) {
                            int size = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i21);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i22 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i22 < split.length) {
                                        if (split[i22].length() != 0) {
                                            String str8 = split[i22];
                                            int indexOf = str7.indexOf(" " + str8);
                                            i10 = size;
                                            if (indexOf < 0 && (str = strArr3[i22]) != null) {
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
                                        if (spannableStringBuilder2 != null && i22 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i22++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i21++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new q01(w01Var, str6, arrayList3, arrayList4, arrayList5, 0));
                        break;
                    } else {
                        v01 v01Var = v01VarArr[i20];
                        if (v01Var != null) {
                            String str9 = v01Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i23 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i23 < split.length) {
                                if (split[i23].length() != 0) {
                                    String str11 = split[i23];
                                    i11 = i20;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i23]) == null) {
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
                                        i20 = i11 + 1;
                                        z10 = z11;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i11 = i20;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i23 == split.length - 1) {
                                    if (v01Var.f == 502) {
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 >= 4) {
                                                i24 = -1;
                                            } else if (UserConfig.getInstance(i24).isClientActivated()) {
                                                i24++;
                                            }
                                        }
                                        if (i24 < 0) {
                                        }
                                    }
                                    arrayList3.add(v01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i23++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i20 = i11;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i20;
                        i20 = i11 + 1;
                        z10 = z11;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 11:
                w01 w01Var2 = (w01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                w01Var2.d.addAll(arrayList6);
                int i25 = w01Var2.f;
                MessagesController.getInstance(i25).faqSearchArray = arrayList6;
                MessagesController.getInstance(i25).faqWebPage = w01Var2.E;
                if (!w01Var2.w) {
                    w01Var2.l();
                    break;
                }
                break;
            case 12:
                a11 a11Var = (a11) obj2;
                a11Var.f.add((c11) obj);
                a11Var.a();
                break;
            case 13:
                w21 w21Var = (w21) ((View[]) obj2)[0];
                w21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                w21Var.c = null;
                w21Var.d = null;
                w21Var.f.g3.O(false);
                break;
            case 14:
                ((w21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 15:
                w21 w21Var2 = (w21) ((View[]) obj2)[0];
                w21Var2.b = null;
                w21Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                w21Var2.d = null;
                w21Var2.f.g3.O(false);
                break;
            case 16:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 17:
                org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.u90) obj);
                break;
            case 18:
                ((SecretMediaViewer) obj2).M = false;
                ((su0) obj).a.setVisible(false, true);
                break;
            case 19:
                ((SecretMediaViewer) ((m4.w1) obj2).c).h((File) obj);
                break;
            case 20:
                f61 f61Var = (f61) obj2;
                f61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.r2) obj).presentFragment(new StickersActivity(5, f61Var.L0));
                Runnable runnable = f61Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 21:
                f81.X((f81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 22:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.wc.b0((f81) obj2).k(false).j();
                break;
            case 23:
                y71 y71Var = (y71) obj2;
                a0.h hVar3 = (a0.h) obj;
                f81 f81Var = y71Var.a1;
                org.telegram.ui.Components.wc.x(f81Var.getParentActivity(), f81Var.b, hVar3.m(), hVar3.m() == 1 ? ((TLRPC.Dialog) hVar3.n(0)).id : 0L, y71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Fi), y71Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi)).j();
                break;
            case 24:
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                new p81(r2Var2.getContext(), r2Var2.getCurrentAccount(), r2Var2.getResourceProvider(), (li.s2) obj).show();
                break;
            case 25:
                ((StickersActivity) obj2).o0((org.telegram.ui.Cells.p8) obj);
                break;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.a9) {
                    ((org.telegram.ui.Cells.a9) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.y6.w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.y6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.y6.x), Double.valueOf(org.telegram.ui.ActionBar.y6.y));
                }
                org.telegram.ui.ActionBar.y6.t1();
                org.telegram.ui.Components.nm0 nm0Var = themeActivity2.b;
                if (nm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) nm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ga) {
                        ((org.telegram.ui.Cells.ga) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.y6.w, false, false);
                        break;
                    }
                }
                break;
            case 28:
                vc1 vc1Var = (vc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (vc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    vc1Var.B0.f(vc1Var.L0[0], true);
                    break;
                }
                break;
            default:
                ad1.Y((ad1) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ by0(org.telegram.ui.Components.nr0 nr0Var, a0.h hVar, int i10, int i11) {
        this.a = i11;
        this.b = nr0Var;
        this.c = hVar;
    }
}

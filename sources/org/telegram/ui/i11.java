package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i11(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
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
                ea eaVar = new ea(null);
                eaVar.d = (org.telegram.ui.ActionBar.c6) obj;
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment(eaVar);
                break;
            case 1:
                p11 p11Var = (p11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = p11Var.d;
                org.telegram.ui.ActionBar.m2 m2Var = p11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                int i13 = 0;
                while (i13 < split.length) {
                    boolean z11 = z10;
                    String translitString = LocaleController.getInstance().getTranslitString(split[i13]);
                    strArr2[i13] = translitString;
                    if (translitString.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                    i13++;
                    z10 = z11;
                }
                int i14 = 0;
                while (true) {
                    o11[] o11VarArr = p11Var.c;
                    if (i14 >= o11VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str6 = str5;
                        if (p11Var.E != null) {
                            int size = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i15);
                                String str7 = " " + faqSearchResult.title.toLowerCase();
                                int i16 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i16 < split.length) {
                                        if (split[i16].length() != 0) {
                                            String str8 = split[i16];
                                            int indexOf = str7.indexOf(" " + str8);
                                            i10 = size;
                                            if (indexOf < 0 && (str = strArr3[i16]) != null) {
                                                indexOf = str7.indexOf(" ".concat(str));
                                                str8 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(m2Var.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), indexOf, str8.length() + indexOf, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder2 != null && i16 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder2);
                                        }
                                        i16++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i15++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new l90(p11Var, str6, arrayList3, arrayList4, arrayList5, 22));
                        break;
                    } else {
                        o11 o11Var = o11VarArr[i14];
                        if (o11Var != null) {
                            String str9 = o11Var.a;
                            String str10 = " " + str9.toLowerCase();
                            int i17 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i17 < split.length) {
                                if (split[i17].length() != 0) {
                                    String str11 = split[i17];
                                    i11 = i14;
                                    int indexOf2 = str10.indexOf(" " + str11);
                                    if (indexOf2 >= 0 || (str4 = strArr2[i17]) == null) {
                                        str4 = str11;
                                    } else {
                                        indexOf2 = str10.indexOf(" ".concat(str4));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str12 = str4;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str9) : spannableStringBuilder3;
                                        str2 = str10;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(m2Var.getThemedColor(org.telegram.ui.ActionBar.g6.q6));
                                        int length = str12.length() + indexOf2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                    } else {
                                        i14 = i11 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str10;
                                    i11 = i14;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i17 == split.length - 1) {
                                    if (o11Var.f == 502) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 >= 4) {
                                                i18 = -1;
                                            } else if (UserConfig.getInstance(i18).isClientActivated()) {
                                                i18++;
                                            }
                                        }
                                        if (i18 < 0) {
                                        }
                                    }
                                    arrayList3.add(o11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i17++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                i14 = i11;
                                str5 = str3;
                                str10 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i14;
                        i14 = i11 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 2:
                p11 p11Var2 = (p11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                p11Var2.d.addAll(arrayList6);
                int i19 = p11Var2.f;
                MessagesController.getInstance(i19).faqSearchArray = arrayList6;
                MessagesController.getInstance(i19).faqWebPage = p11Var2.E;
                if (!p11Var2.w) {
                    p11Var2.l();
                    break;
                }
                break;
            case 3:
                t11 t11Var = (t11) obj2;
                t11Var.f.add((v11) obj);
                t11Var.a();
                break;
            case 4:
                ((l31) obj2).d0(34, (Bitmap) obj, true);
                break;
            case 5:
                g31 g31Var = (g31) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken != null) {
                    int i20 = g31Var.J;
                    if (i20 != 0 && i20 < tL_exportedContactToken.expires) {
                        try {
                            try {
                                Vibrator vibrator = (Vibrator) g31Var.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(100L);
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            g31Var.performHapticFeedback(0, 2);
                        }
                    }
                    g31Var.J = tL_exportedContactToken.expires;
                    g31Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                } else {
                    g31Var.getClass();
                    break;
                }
            case 6:
                h41 h41Var = (h41) ((View[]) obj2)[0];
                h41Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                h41Var.c = null;
                h41Var.d = null;
                h41Var.f.W2.N(false);
                break;
            case 7:
                ((h41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 8:
                h41 h41Var2 = (h41) ((View[]) obj2)[0];
                h41Var2.b = null;
                h41Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                h41Var2.d = null;
                h41Var2.f.W2.N(false);
                break;
            case 9:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.zc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 10:
                org.telegram.ui.Components.zc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.g90) obj);
                break;
            case 11:
                ((SecretMediaViewer) obj2).M = false;
                ((jv0) obj).a.setVisible(false, true);
                break;
            case 12:
                ((SecretMediaViewer) ((n3.b) obj2).c).h((File) obj);
                break;
            case 13:
                r71 r71Var = (r71) obj;
                r71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment(new StickersActivity(5, r71Var.L0));
                Runnable runnable = r71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.zc.a0((o91) obj2).k(false).j();
                break;
            case 15:
                o91.W((o91) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 16:
                h91 h91Var = (h91) obj2;
                a0.h hVar = (a0.h) obj;
                o91 o91Var = h91Var.b1;
                org.telegram.ui.Components.zc.x(o91Var.getParentActivity(), o91Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, h91Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), h91Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 17:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                new z91(m2Var2.getContext(), m2Var2.getCurrentAccount(), m2Var2.getResourceProvider(), (uc) obj).show();
                break;
            case 18:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            case 19:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 20:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str13 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.g6.w = str13;
                if (str13 == null) {
                    org.telegram.ui.ActionBar.g6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.g6.x), Double.valueOf(org.telegram.ui.ActionBar.g6.y));
                }
                org.telegram.ui.ActionBar.g6.r1();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity2.b;
                if (mm0Var != null && (wl0Var = (org.telegram.ui.Components.wl0) mm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = wl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.w, false, false);
                        break;
                    }
                }
                break;
            case 21:
                ce1 ce1Var = (ce1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (ce1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    ce1Var.A0.f(ce1Var.K0[0], true);
                    break;
                }
                break;
            case 22:
                he1.X((he1) obj2, (String) obj);
                break;
            case 23:
                he1.V((he1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 24:
                re1 re1Var = (re1) obj2;
                re1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                re1Var.c(true);
                break;
            case 25:
                re1 re1Var2 = (re1) obj2;
                re1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                re1Var2.c(true);
                break;
            case 26:
                qf1 qf1Var = (qf1) obj2;
                qf1Var.getClass();
                Bundle bundle = new Bundle();
                kg1 kg1Var = qf1Var.b;
                bundle.putLong("dialog_id", -kg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                kg1Var.presentFragment(new c21(bundle, null));
                break;
            case 27:
                gg1 gg1Var = (gg1) obj2;
                String str14 = (String) obj;
                ArrayList arrayList7 = gg1Var.c0;
                kg1 kg1Var2 = gg1Var.t0;
                String lowerCase = str14.trim().toLowerCase();
                ArrayList arrayList8 = new ArrayList();
                int i21 = 0;
                while (true) {
                    ArrayList arrayList9 = kg1Var2.b;
                    if (i21 >= arrayList9.size()) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList8);
                        gg1Var.L();
                        if (!arrayList7.isEmpty()) {
                            gg1Var.l0 = false;
                            gg1Var.o0.b(0);
                        }
                        gg1Var.J(str14);
                        break;
                    } else {
                        if (((bg1) arrayList9.get(i21)).c != null && ((bg1) arrayList9.get(i21)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList8.add(((bg1) arrayList9.get(i21)).c);
                            ((bg1) arrayList9.get(i21)).c.searchQuery = lowerCase;
                        }
                        i21++;
                    }
                }
                break;
            case 28:
                ng1 ng1Var = ((mg1) obj2).b;
                ng1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ng1Var.a.V();
                break;
            default:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
        }
    }

    public /* synthetic */ i11(r71 r71Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = 13;
        this.c = r71Var;
        this.b = m2Var;
    }

    public /* synthetic */ i11(h91 h91Var, a0.h hVar, int i10) {
        this.a = 16;
        this.b = h91Var;
        this.c = hVar;
    }
}

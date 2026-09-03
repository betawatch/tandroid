package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h21(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.el0 el0Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((u21) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 1:
                o21 o21Var = (o21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    o21Var.getClass();
                    break;
                } else {
                    int i11 = o21Var.G;
                    if (i11 != 0 && i11 < tL_exportedContactToken.expires) {
                        try {
                            try {
                                Vibrator vibrator = (Vibrator) o21Var.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(100L);
                                }
                            } catch (Exception unused) {
                                o21Var.performHapticFeedback(0, 2);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    o21Var.G = tL_exportedContactToken.expires;
                    o21Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                }
            case 2:
                p31 p31Var = (p31) ((View[]) obj2)[0];
                p31Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                p31Var.c = null;
                p31Var.d = null;
                p31Var.f.V2.N(false);
                break;
            case 3:
                ((p31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 4:
                p31 p31Var2 = (p31) ((View[]) obj2)[0];
                p31Var2.b = null;
                p31Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                p31Var2.d = null;
                p31Var2.f.V2.N(false);
                break;
            case 5:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.qc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 6:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.b90) obj);
                break;
            case 7:
                ((SecretMediaViewer) obj2).J = false;
                ((qu0) obj).a.setVisible(false, true);
                break;
            case 8:
                ((SecretMediaViewer) ((n7.qa) obj2).c).h((File) obj);
                break;
            case 9:
                w61 w61Var = (w61) obj2;
                w61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, w61Var.I0));
                Runnable runnable = w61Var.Q1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.qc.a0((v81) obj2).k(false).j();
                break;
            case 11:
                v81.W((v81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 12:
                o81 o81Var = (o81) obj2;
                a0.h hVar = (a0.h) obj;
                v81 v81Var = o81Var.Y0;
                org.telegram.ui.Components.qc.x(v81Var.getParentActivity(), v81Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, o81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), o81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 13:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new f91(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (lh.a1) obj).show();
                break;
            case 14:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.k8) obj);
                break;
            case 15:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 16:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.x), Double.valueOf(org.telegram.ui.ActionBar.k6.y));
                }
                org.telegram.ui.ActionBar.k6.q1();
                org.telegram.ui.Components.sl0 sl0Var = themeActivity2.b;
                if (sl0Var != null && (el0Var = (org.telegram.ui.Components.el0) sl0Var.K(themeActivity2.V)) != null) {
                    View view2 = el0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.aa) {
                        ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.w, false, false);
                        break;
                    }
                }
                break;
            case 17:
                jd1 jd1Var = (jd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (jd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    jd1Var.x0.f(jd1Var.H0[0], true);
                    break;
                }
                break;
            case 18:
                od1.X((od1) obj2, (String) obj);
                break;
            case 19:
                od1.V((od1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 20:
                zd1 zd1Var = (zd1) obj2;
                zd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                zd1Var.c(true);
                break;
            case 21:
                zd1 zd1Var2 = (zd1) obj2;
                zd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                zd1Var2.c(true);
                break;
            case 22:
                xe1 xe1Var = (xe1) obj2;
                xe1Var.getClass();
                Bundle bundle = new Bundle();
                sf1 sf1Var = xe1Var.b;
                bundle.putLong("dialog_id", -sf1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                sf1Var.presentFragment(new k11(bundle, null));
                break;
            case 23:
                of1 of1Var = (of1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = of1Var.W;
                sf1 sf1Var2 = of1Var.q0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = sf1Var2.b;
                    if (i12 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        of1Var.L();
                        if (!arrayList.isEmpty()) {
                            of1Var.i0 = false;
                            of1Var.l0.b(0);
                        }
                        of1Var.J(str2);
                        break;
                    } else {
                        if (((jf1) arrayList3.get(i12)).c != null && ((jf1) arrayList3.get(i12)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((jf1) arrayList3.get(i12)).c);
                            ((jf1) arrayList3.get(i12)).c.searchQuery = lowerCase;
                        }
                        i12++;
                    }
                }
                break;
            case 24:
                vf1 vf1Var = ((uf1) obj2).b;
                vf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                vf1Var.a.V();
                break;
            case 25:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 26:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 27:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 28:
                vg1.g0((vg1) obj2, (String) obj);
                break;
            default:
                Runnable runnable2 = (Runnable) obj;
                for (cs csVar : ((vg1) obj2).w.f) {
                    csVar.l(0.0f);
                }
                runnable2.run();
                break;
        }
    }

    public /* synthetic */ h21(o81 o81Var, a0.h hVar, int i10) {
        this.a = 12;
        this.b = o81Var;
        this.c = hVar;
    }
}

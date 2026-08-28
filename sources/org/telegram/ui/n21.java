package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n21(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ik0 ik0Var;
        int i9 = this.a;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i9) {
            case 0:
                x21 x21Var = (x21) ((View[]) obj2)[0];
                x21Var.b = null;
                x21Var.c = (TLRPC.TL_reportResultChooseOption) obj;
                x21Var.d = null;
                x21Var.f.U2.N(false);
                break;
            case 1:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.oc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                org.telegram.ui.Components.oc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.jg0) obj);
                break;
            case 3:
                ((SecretMediaViewer) obj2).I = false;
                ((bu0) obj).a.setVisible(false, true);
                break;
            case 4:
                ((SecretMediaViewer) ((org.telegram.ui.Cells.e3) obj2).c).h((File) obj);
                break;
            case 5:
                b61 b61Var = (b61) obj2;
                b61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, b61Var.H0));
                Runnable runnable = b61Var.P1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.oc.a0((z71) obj2).k(false).j();
                break;
            case 7:
                z71.V((z71) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 8:
                s71 s71Var = (s71) obj2;
                a0.h hVar = (a0.h) obj;
                z71 z71Var = s71Var.X0;
                org.telegram.ui.Components.oc.x(z71Var.getParentActivity(), z71Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, s71Var.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), s71Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi)).j();
                break;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                new k81(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider(), (df) obj).show();
                break;
            case 10:
                ((StickersActivity) obj2).m0((org.telegram.ui.Cells.k8) obj);
                break;
            case 11:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.t8) {
                    ((org.telegram.ui.Cells.t8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 12:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.f6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.f6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.f6.x), Double.valueOf(org.telegram.ui.ActionBar.f6.y));
                }
                org.telegram.ui.ActionBar.f6.q1();
                org.telegram.ui.Components.wk0 wk0Var = themeActivity2.b;
                if (wk0Var != null && (ik0Var = (org.telegram.ui.Components.ik0) wk0Var.K(themeActivity2.U)) != null) {
                    View view2 = ik0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ba) {
                        ((org.telegram.ui.Cells.ba) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.f6.w, false, false);
                        break;
                    }
                }
                break;
            case 13:
                oc1 oc1Var = (oc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (oc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    oc1Var.w0.f(oc1Var.G0[0], true);
                    break;
                }
                break;
            case 14:
                tc1.W((tc1) obj2, (String) obj);
                break;
            case 15:
                tc1.U((tc1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 16:
                dd1 dd1Var = (dd1) obj2;
                dd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                dd1Var.c(true);
                break;
            case 17:
                dd1 dd1Var2 = (dd1) obj2;
                dd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                dd1Var2.c(true);
                break;
            case 18:
                be1 be1Var = (be1) obj2;
                be1Var.getClass();
                Bundle bundle = new Bundle();
                we1 we1Var = be1Var.b;
                bundle.putLong("dialog_id", -we1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                we1Var.presentFragment(new s01(bundle, null));
                break;
            case 19:
                re1 re1Var = (re1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = re1Var.V;
                we1 we1Var2 = re1Var.p0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = we1Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        re1Var.L();
                        if (!arrayList.isEmpty()) {
                            re1Var.h0 = false;
                            re1Var.k0.b(0);
                        }
                        re1Var.J(str2);
                        break;
                    } else {
                        if (((me1) arrayList3.get(i13)).c != null && ((me1) arrayList3.get(i13)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((me1) arrayList3.get(i13)).c);
                            ((me1) arrayList3.get(i13)).c.searchQuery = lowerCase;
                        }
                        i13++;
                    }
                }
                break;
            case 20:
                af1 af1Var = ((ze1) obj2).b;
                af1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                af1Var.a.U();
                break;
            case 21:
                TwoStepVerificationActivity.X((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 22:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 23:
                TwoStepVerificationActivity.V((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                ag1.f0((ag1) obj2, (String) obj);
                break;
            case 25:
                Runnable runnable2 = (Runnable) obj;
                vr[] vrVarArr = ((ag1) obj2).w.f;
                int length = vrVarArr.length;
                while (i12 < length) {
                    vrVarArr[i12].l(0.0f);
                    i12++;
                }
                runnable2.run();
                break;
            case 26:
                gg1 gg1Var = (gg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gg1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = gg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(gg1Var.a).putChats(arrayList5, false);
                gg1Var.d = false;
                gg1Var.c = true;
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 27:
                mh1 mh1Var = (mh1) obj2;
                mh1Var.Q.a(new vg1(mh1Var, (VoIPService) obj, i11), true);
                break;
            case 28:
                mh1 mh1Var2 = (mh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.l2.P = false;
                org.telegram.ui.Components.voip.l2.i();
                ViewPropertyAnimator duration = mh1Var2.G.animate().setDuration(150L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f;
                duration.setInterpolator(grVar).start();
                mh1Var2.D.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.T.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar).start();
                mh1Var2.d0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                mh1Var2.e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                mh1Var2.I0.animate().alpha(1.0f).setDuration(350L).setInterpolator(grVar).start();
                valueAnimator.addListener(new ah1(mh1Var2, i10));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(grVar);
                valueAnimator.start();
                break;
            default:
                uh1 uh1Var = (uh1) obj2;
                int[] iArr = (int[]) obj;
                uh1Var.getClass();
                int i14 = iArr[0] - 1;
                iArr[0] = i14;
                if (i14 == 0) {
                    WallpapersListActivity wallpapersListActivity = uh1Var.a;
                    int[][] iArr2 = WallpapersListActivity.g0;
                    wallpapersListActivity.A0(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n21(s71 s71Var, a0.h hVar, int i9) {
        this.a = 8;
        this.b = s71Var;
        this.c = hVar;
    }
}

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m21(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.lk0 lk0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                w21 w21Var = (w21) ((View[]) obj2)[0];
                w21Var.b = null;
                w21Var.c = (TLRPC.TL_reportResultChooseOption) obj;
                w21Var.d = null;
                w21Var.f.U2.N(false);
                break;
            case 1:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.mc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.lg0) obj);
                break;
            case 3:
                ((SecretMediaViewer) obj2).I = false;
                ((cu0) obj).a.setVisible(false, true);
                break;
            case 4:
                ((SecretMediaViewer) ((i6) obj2).c).h((File) obj);
                break;
            case 5:
                a61 a61Var = (a61) obj2;
                a61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, a61Var.H0));
                Runnable runnable = a61Var.P1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.mc.a0((x71) obj2).k(false).j();
                break;
            case 7:
                x71.W((x71) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 8:
                q71 q71Var = (q71) obj2;
                a0.h hVar = (a0.h) obj;
                x71 x71Var = q71Var.X0;
                org.telegram.ui.Components.mc.x(x71Var.getParentActivity(), x71Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, q71Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), q71Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new i81(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (df) obj).show();
                break;
            case 10:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.h8) obj);
                break;
            case 11:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.p8) {
                    ((org.telegram.ui.Cells.p8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 12:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.g6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.g6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.g6.x), Double.valueOf(org.telegram.ui.ActionBar.g6.y));
                }
                org.telegram.ui.ActionBar.g6.q1();
                org.telegram.ui.Components.zk0 zk0Var = themeActivity2.b;
                if (zk0Var != null && (lk0Var = (org.telegram.ui.Components.lk0) zk0Var.K(themeActivity2.U)) != null) {
                    View view2 = lk0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.w, false, false);
                        break;
                    }
                }
                break;
            case 13:
                nc1 nc1Var = (nc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (nc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    nc1Var.w0.f(nc1Var.G0[0], true);
                    break;
                }
                break;
            case 14:
                tc1.X((tc1) obj2, (String) obj);
                break;
            case 15:
                tc1.V((tc1) obj2, (TLRPC.TL_theme) obj);
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
                ce1 ce1Var = (ce1) obj2;
                ce1Var.getClass();
                Bundle bundle = new Bundle();
                we1 we1Var = ce1Var.b;
                bundle.putLong("dialog_id", -we1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                we1Var.presentFragment(new t01(bundle, null));
                break;
            case 19:
                se1 se1Var = (se1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = se1Var.V;
                we1 we1Var2 = se1Var.p0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    ArrayList arrayList3 = we1Var2.b;
                    if (i14 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        se1Var.L();
                        if (!arrayList.isEmpty()) {
                            se1Var.h0 = false;
                            se1Var.k0.b(0);
                        }
                        se1Var.J(str2);
                        break;
                    } else {
                        if (((ne1) arrayList3.get(i14)).c != null && ((ne1) arrayList3.get(i14)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((ne1) arrayList3.get(i14)).c);
                            ((ne1) arrayList3.get(i14)).c.searchQuery = lowerCase;
                        }
                        i14++;
                    }
                }
                break;
            case 20:
                ze1 ze1Var = ((ye1) obj2).b;
                ze1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ze1Var.a.V();
                break;
            case 21:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 22:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 23:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                zf1.g0((zf1) obj2, (String) obj);
                break;
            case 25:
                Runnable runnable2 = (Runnable) obj;
                wr[] wrVarArr = ((zf1) obj2).w.f;
                int length = wrVarArr.length;
                while (i13 < length) {
                    wrVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable2.run();
                break;
            case 26:
                fg1 fg1Var = (fg1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = fg1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = fg1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(fg1Var.a).putChats(arrayList5, false);
                fg1Var.d = false;
                fg1Var.c = true;
                int size = arrayList4.size();
                while (i13 < size) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 27:
                lh1 lh1Var = (lh1) obj2;
                lh1Var.Q.a(new ug1(lh1Var, (VoIPService) obj, i12), true);
                break;
            case 28:
                lh1 lh1Var2 = (lh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.l2.P = false;
                org.telegram.ui.Components.voip.l2.i();
                ViewPropertyAnimator duration = lh1Var2.G.animate().setDuration(150L);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f;
                duration.setInterpolator(erVar).start();
                lh1Var2.D.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                lh1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                lh1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                lh1Var2.T.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                lh1Var2.f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(erVar).start();
                lh1Var2.d0.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar).start();
                lh1Var2.e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar).start();
                lh1Var2.I0.animate().alpha(1.0f).setDuration(350L).setInterpolator(erVar).start();
                valueAnimator.addListener(new zg1(lh1Var2, i11));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(erVar);
                valueAnimator.start();
                break;
            default:
                th1 th1Var = (th1) obj2;
                int[] iArr = (int[]) obj;
                th1Var.getClass();
                int i15 = iArr[0] - 1;
                iArr[0] = i15;
                if (i15 == 0) {
                    WallpapersListActivity wallpapersListActivity = th1Var.a;
                    int[][] iArr2 = WallpapersListActivity.g0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m21(q71 q71Var, a0.h hVar, int i10) {
        this.a = 8;
        this.b = q71Var;
        this.c = hVar;
    }
}

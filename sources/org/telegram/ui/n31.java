package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n31(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.am0 am0Var;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                b41 b41Var = (b41) ((View[]) obj2)[0];
                b41Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                b41Var.c = null;
                b41Var.d = null;
                b41Var.f.W2.N(false);
                break;
            case 1:
                ((b41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 2:
                b41 b41Var2 = (b41) ((View[]) obj2)[0];
                b41Var2.b = null;
                b41Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                b41Var2.d = null;
                b41Var2.f.W2.N(false);
                break;
            case 3:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.ad) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 4:
                org.telegram.ui.Components.ad.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ci0) obj);
                break;
            case 5:
                ((SecretMediaViewer) obj2).M = false;
                ((ev0) obj).a.setVisible(false, true);
                break;
            case 6:
                ((SecretMediaViewer) ((n6.t) obj2).c).h((File) obj);
                break;
            case 7:
                k71 k71Var = (k71) obj2;
                k71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, k71Var.L0));
                Runnable runnable = k71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 8:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.ad.a0((i91) obj2).k(false).j();
                break;
            case 9:
                i91.W((i91) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 10:
                b91 b91Var = (b91) obj2;
                a0.i iVar = (a0.i) obj;
                i91 i91Var = b91Var.b1;
                org.telegram.ui.Components.ad.x(i91Var.getParentActivity(), i91Var.b, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, b91Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), b91Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                break;
            case 11:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new t91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (pc) obj).show();
                break;
            case 12:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            case 13:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 14:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.i6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.i6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.i6.x), Double.valueOf(org.telegram.ui.ActionBar.i6.y));
                }
                org.telegram.ui.ActionBar.i6.r1();
                org.telegram.ui.Components.qm0 qm0Var = themeActivity2.b;
                if (qm0Var != null && (am0Var = (org.telegram.ui.Components.am0) qm0Var.K(themeActivity2.Y)) != null) {
                    View view2 = am0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ca) {
                        ((org.telegram.ui.Cells.ca) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.i6.w, false, false);
                        break;
                    }
                }
                break;
            case 15:
                xd1 xd1Var = (xd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (xd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    xd1Var.A0.f(xd1Var.K0[0], true);
                    break;
                }
                break;
            case 16:
                ce1.X((ce1) obj2, (String) obj);
                break;
            case 17:
                ce1.V((ce1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 18:
                me1 me1Var = (me1) obj2;
                me1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                me1Var.c(true);
                break;
            case 19:
                me1 me1Var2 = (me1) obj2;
                me1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                me1Var2.c(true);
                break;
            case 20:
                lf1 lf1Var = (lf1) obj2;
                lf1Var.getClass();
                Bundle bundle = new Bundle();
                fg1 fg1Var = lf1Var.b;
                bundle.putLong("dialog_id", -fg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                fg1Var.presentFragment(new v11(bundle, null));
                break;
            case 21:
                bg1 bg1Var = (bg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = bg1Var.c0;
                fg1 fg1Var2 = bg1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = fg1Var2.b;
                    if (i13 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        bg1Var.L();
                        if (!arrayList.isEmpty()) {
                            bg1Var.l0 = false;
                            bg1Var.o0.b(0);
                        }
                        bg1Var.J(str2);
                        break;
                    } else {
                        if (((wf1) arrayList3.get(i13)).c != null && ((wf1) arrayList3.get(i13)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((wf1) arrayList3.get(i13)).c);
                            ((wf1) arrayList3.get(i13)).c.searchQuery = lowerCase;
                        }
                        i13++;
                    }
                }
                break;
            case 22:
                ig1 ig1Var = ((hg1) obj2).b;
                ig1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ig1Var.a.V();
                break;
            case 23:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 24:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 25:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 26:
                ih1.g0((ih1) obj2, (String) obj);
                break;
            case 27:
                Runnable runnable2 = (Runnable) obj;
                es[] esVarArr = ((ih1) obj2).w.f;
                int length = esVarArr.length;
                while (i12 < length) {
                    esVarArr[i12].l(0.0f);
                    i12++;
                }
                runnable2.run();
                break;
            case 28:
                ph1 ph1Var = (ph1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ph1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = ph1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ph1Var.a).putChats(arrayList5, false);
                ph1Var.d = false;
                ph1Var.c = true;
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            default:
                wi1 wi1Var = (wi1) obj2;
                wi1Var.U.a(new ei1(wi1Var, (VoIPService) obj, i11), true);
                break;
        }
    }

    public /* synthetic */ n31(b91 b91Var, a0.i iVar, int i10) {
        this.a = 10;
        this.b = b91Var;
        this.c = iVar;
    }
}

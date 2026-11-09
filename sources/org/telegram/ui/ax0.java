package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ax0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.yi0 yi0Var;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                bx0 bx0Var = (bx0) obj2;
                bx0Var.f.add((dx0) obj);
                bx0Var.a();
                break;
            case 1:
                qy0 qy0Var = (qy0) ((View[]) obj2)[0];
                qy0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                qy0Var.c = null;
                qy0Var.d = null;
                qy0Var.f.f3.O(false);
                break;
            case 2:
                ((qy0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 3:
                qy0 qy0Var2 = (qy0) ((View[]) obj2)[0];
                qy0Var2.b = null;
                qy0Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                qy0Var2.d = null;
                qy0Var2.f.f3.O(false);
                break;
            case 4:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.hc) obj).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                break;
            case 5:
                org.telegram.ui.Components.hc.a0((org.telegram.ui.ActionBar.f2) obj2).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.w80) obj);
                break;
            case 6:
                ((SecretMediaViewer) obj2).K = false;
                ((yq0) obj).a.O0(false, true);
                break;
            case 7:
                ((SecretMediaViewer) ((j2.n) obj2).c).i((File) obj);
                break;
            case 8:
                s11 s11Var = (s11) obj2;
                s11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.f2) obj).presentFragment(new StickersActivity(5, s11Var.L0));
                Runnable runnable = s11Var.U1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.hc.a0((n31) obj2).k(false).j();
                break;
            case 10:
                n31.b0((n31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 11:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                new u31(f2Var.getContext(), f2Var.getCurrentAccount(), f2Var.getResourceProvider(), (org.telegram.messenger.voip.k) obj).show();
                break;
            case 12:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.g8) obj);
                break;
            case 13:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).setChecked(themeActivity.getMessagesController().S4());
                    break;
                }
                break;
            case 14:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.l6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.l6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.l6.x), Double.valueOf(org.telegram.ui.ActionBar.l6.y));
                }
                org.telegram.ui.ActionBar.l6.w1();
                org.telegram.ui.Components.qj0 qj0Var = themeActivity2.b;
                if (qj0Var != null && (yi0Var = (org.telegram.ui.Components.yi0) qj0Var.K(themeActivity2.Y)) != null) {
                    View view2 = yi0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.w9) {
                        ((org.telegram.ui.Cells.w9) view2).c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.l6.w, false, false);
                        break;
                    }
                }
                break;
            case 15:
                w71 w71Var = (w71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (w71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    w71Var.B0.c(w71Var.L0[0]);
                    break;
                }
                break;
            case 16:
                z71.c0((z71) obj2, (String) obj);
                break;
            case 17:
                z71.a0((z71) obj2, (TLRPC.TL_theme) obj);
                break;
            case 18:
                h81 h81Var = (h81) obj2;
                h81Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                h81Var.c(true);
                break;
            case 19:
                h81 h81Var2 = (h81) obj2;
                h81Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.ij.h0(((TLRPC.TodoItem) obj).title, false));
                h81Var2.c(true);
                break;
            case 20:
                f91 f91Var = (f91) obj2;
                f91Var.getClass();
                Bundle bundle = new Bundle();
                y91 y91Var = f91Var.b;
                bundle.putLong("dialog_id", -y91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                y91Var.presentFragment(new kx0(bundle, null));
                break;
            case 21:
                u91 u91Var = (u91) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = u91Var.e0;
                y91 y91Var2 = u91Var.v0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = y91Var2.b;
                    if (i12 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        u91Var.N();
                        if (!arrayList.isEmpty()) {
                            u91Var.n0 = false;
                            u91Var.q0.b(0);
                        }
                        u91Var.L(str2);
                        break;
                    } else {
                        if (((q91) arrayList3.get(i12)).c != null && ((q91) arrayList3.get(i12)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((q91) arrayList3.get(i12)).c);
                            ((q91) arrayList3.get(i12)).c.searchQuery = lowerCase;
                        }
                        i12++;
                    }
                }
                break;
            case 22:
                ba1 ba1Var = ((aa1) obj2).b;
                ba1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ba1Var.a.a0();
                break;
            case 23:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 24:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 25:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 26:
                bb1.l0((bb1) obj2, (String) obj);
                break;
            case 27:
                Runnable runnable2 = (Runnable) obj;
                dr[] drVarArr = ((bb1) obj2).x.f;
                int length = drVarArr.length;
                while (i11 < length) {
                    drVarArr[i11].C(0.0f);
                    i11++;
                }
                runnable2.run();
                break;
            case 28:
                gb1 gb1Var = (gb1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = gb1Var.f;
                ArrayList arrayList5 = gb1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                org.telegram.messenger.qp.s1(gb1Var.a).S3(arrayList5, false);
                gb1Var.d = false;
                gb1Var.c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj3 = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            default:
                ic1 ic1Var = (ic1) obj2;
                ic1Var.U.a(new rb1(ic1Var, (VoIPService) obj, i10), true);
                break;
        }
    }
}

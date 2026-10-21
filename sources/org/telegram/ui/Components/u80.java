package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((a90) this.b).dismiss();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.b).o(2);
                break;
            case 2:
                tc0 tc0Var = (tc0) this.b;
                tc0.b(tc0Var.getContext(), tc0Var.a, tc0Var.n, false, tc0Var.x, new rc0(tc0Var, 0), tc0Var.c);
                break;
            case 3:
                ((td0) this.b).onBackPressed();
                break;
            case 4:
                ue0.n((ue0) this.b);
                break;
            case 5:
                cg0 cg0Var = (cg0) this.b;
                cg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                dg0 dg0Var = cg0Var.d;
                if (intValue == dg0Var.y) {
                    dg0Var.N = t5Var.getCurrentColor();
                } else {
                    dg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = dg0Var.l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                dg0Var.g();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((kg0) this.b).a.y.url)));
                break;
            case 7:
                ah0 ah0Var = (ah0) this.b;
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null) {
                    lg0 lg0Var = ah0Var.r;
                    if (lg0Var == null) {
                        c81 c81Var = photoViewer.F2;
                        if (c81Var != null) {
                            if (c81Var.y()) {
                                c81Var.B();
                            } else {
                                c81Var.C();
                            }
                        }
                    } else if (lg0Var.G) {
                        lg0Var.f();
                    } else {
                        lg0Var.g();
                    }
                    ah0.p0.z();
                    break;
                }
                break;
            case 8:
                jh0 jh0Var = (jh0) this.b;
                jh0Var.getClass();
                gh0 gh0Var = (gh0) jh0Var;
                hh0 hh0Var = gh0Var.e;
                kh0 kh0Var = (kh0) gh0Var.getTag(R.id.object_tag);
                if (kh0Var.b.size() > 15) {
                    boolean z10 = kh0Var.e;
                    kh0Var.e = !z10;
                    if (!z10) {
                        kh0Var.f = 10;
                    }
                    hh0Var.s.P(gh0Var);
                    hh0Var.s.c.X(true);
                    break;
                }
                break;
            case 9:
                ((zm0) this.b).onBackPressed();
                break;
            case 10:
                un0 un0Var = ((tn0) this.b).c;
                nt.o(un0Var.F, un0Var.G);
                break;
            case 11:
                ei.e2 e2Var = ((vn0) this.b).e;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                break;
            case 12:
                go0 go0Var = (go0) this.b;
                go0Var.getClass();
                new sg.y0(go0Var.b, 24, true).show();
                break;
            case 13:
                ((wo0) this.b).Q(false);
                break;
            case 14:
                kr0 kr0Var = ((ir0) this.b).s;
                ArrayList arrayList = kr0Var.s;
                if (!arrayList.isEmpty()) {
                    kr0Var.r = TextUtils.join(" ", arrayList).toString();
                    kr0Var.n = false;
                    kr0Var.d();
                    kr0Var.w = null;
                    if (kr0Var.b != 0) {
                        kr0Var.b = 0;
                        jr0 jr0Var = kr0Var.H;
                        if (jr0Var != null) {
                            ((org.telegram.ui.hv) jr0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 15:
                uv0 uv0Var = ((du0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) uv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 16:
                ((hr0) this.b).run();
                break;
            case 17:
                ((tx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 18:
                AndroidUtilities.runOnUIThread((ci.l5) this.b, 100L);
                break;
            case 19:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 20:
                l21 l21Var = ((n21) this.b).b;
                l21Var.setText("");
                AndroidUtilities.showKeyboard(l21Var);
                break;
            case 21:
                ((w21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 22:
                ((t41) this.b).dismiss();
                break;
            case 23:
                org.telegram.ui.qn qnVar = ((org.telegram.ui.rk) this.b).s;
                if (qnVar.getUserConfig().isPremium() || ((chat = qnVar.e) != null && chat.autotranslation)) {
                    qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + qnVar.a(), 14).commit();
                    qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 13, false));
                }
                qnVar.Vc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

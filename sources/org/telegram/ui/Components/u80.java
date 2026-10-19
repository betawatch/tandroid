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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                te0.n((te0) this.b);
                break;
            case 5:
                bg0 bg0Var = (bg0) this.b;
                bg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                cg0 cg0Var = bg0Var.d;
                if (intValue == cg0Var.y) {
                    cg0Var.N = t5Var.getCurrentColor();
                } else {
                    cg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = cg0Var.l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                cg0Var.g();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((jg0) this.b).a.y.url)));
                break;
            case 7:
                zg0 zg0Var = (zg0) this.b;
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null) {
                    kg0 kg0Var = zg0Var.r;
                    if (kg0Var == null) {
                        b81 b81Var = photoViewer.F2;
                        if (b81Var != null) {
                            if (b81Var.y()) {
                                b81Var.B();
                            } else {
                                b81Var.C();
                            }
                        }
                    } else if (kg0Var.G) {
                        kg0Var.f();
                    } else {
                        kg0Var.g();
                    }
                    zg0.p0.z();
                    break;
                }
                break;
            case 8:
                ih0 ih0Var = (ih0) this.b;
                ih0Var.getClass();
                fh0 fh0Var = (fh0) ih0Var;
                gh0 gh0Var = fh0Var.e;
                jh0 jh0Var = (jh0) fh0Var.getTag(R.id.object_tag);
                if (jh0Var.b.size() > 15) {
                    boolean z10 = jh0Var.e;
                    jh0Var.e = !z10;
                    if (!z10) {
                        jh0Var.f = 10;
                    }
                    gh0Var.s.P(fh0Var);
                    gh0Var.s.c.X(true);
                    break;
                }
                break;
            case 9:
                ((ym0) this.b).onBackPressed();
                break;
            case 10:
                tn0 tn0Var = ((sn0) this.b).c;
                nt.o(tn0Var.F, tn0Var.G);
                break;
            case 11:
                ei.e2 e2Var = ((un0) this.b).e;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                break;
            case 12:
                fo0 fo0Var = (fo0) this.b;
                fo0Var.getClass();
                new sg.y0(fo0Var.b, 24, true).show();
                break;
            case 13:
                ((vo0) this.b).Q(false);
                break;
            case 14:
                jr0 jr0Var = ((hr0) this.b).s;
                ArrayList arrayList = jr0Var.s;
                if (!arrayList.isEmpty()) {
                    jr0Var.r = TextUtils.join(" ", arrayList).toString();
                    jr0Var.n = false;
                    jr0Var.d();
                    jr0Var.w = null;
                    if (jr0Var.b != 0) {
                        jr0Var.b = 0;
                        ir0 ir0Var = jr0Var.H;
                        if (ir0Var != null) {
                            ((org.telegram.ui.hv) ir0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 15:
                tv0 tv0Var = ((cu0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) tv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 16:
                ((gr0) this.b).run();
                break;
            case 17:
                ((sx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 18:
                AndroidUtilities.runOnUIThread((ci.l5) this.b, 100L);
                break;
            case 19:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 20:
                k21 k21Var = ((m21) this.b).b;
                k21Var.setText("");
                AndroidUtilities.showKeyboard(k21Var);
                break;
            case 21:
                ((v21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 22:
                ((s41) this.b).dismiss();
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
                qnVar.Uc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

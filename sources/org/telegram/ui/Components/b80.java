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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                d80 d80Var = (d80) this.b;
                d80Var.b = true;
                d80Var.dismiss();
                break;
            case 1:
                ((j80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                cc0 cc0Var = (cc0) this.b;
                cc0.b(cc0Var.getContext(), cc0Var.a, cc0Var.n, false, cc0Var.x, new xp(cc0Var, 29), cc0Var.c);
                break;
            case 4:
                ((dd0) this.b).onBackPressed();
                break;
            case 5:
                fe0.m((fe0) this.b);
                break;
            case 6:
                of0 of0Var = (of0) this.b;
                of0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                pf0 pf0Var = of0Var.d;
                if (intValue == pf0Var.y) {
                    pf0Var.K = u5Var.getCurrentColor();
                } else {
                    pf0Var.L = u5Var.getCurrentColor();
                }
                xz xzVar = pf0Var.i0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                pf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((wf0) this.b).a.y.url)));
                break;
            case 8:
                ng0 ng0Var = (ng0) this.b;
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null) {
                    xf0 xf0Var = ng0Var.r;
                    if (xf0Var == null) {
                        k71 k71Var = photoViewer.C2;
                        if (k71Var != null) {
                            if (k71Var.y()) {
                                k71Var.B();
                            } else {
                                k71Var.C();
                            }
                        }
                    } else if (xf0Var.D) {
                        xf0Var.f();
                    } else {
                        xf0Var.g();
                    }
                    ng0.m0.z();
                    break;
                }
                break;
            case 9:
                vg0 vg0Var = (vg0) this.b;
                vg0Var.getClass();
                sg0 sg0Var = (sg0) vg0Var;
                tg0 tg0Var = sg0Var.e;
                wg0 wg0Var = (wg0) sg0Var.getTag(R.id.object_tag);
                if (wg0Var.b.size() > 15) {
                    boolean z4 = wg0Var.e;
                    wg0Var.e = !z4;
                    if (!z4) {
                        wg0Var.f = 10;
                    }
                    tg0Var.s.O(sg0Var);
                    tg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((jm0) this.b).onBackPressed();
                break;
            case 11:
                en0 en0Var = ((dn0) this.b).c;
                dt.n(en0Var.C, en0Var.D);
                break;
            case 12:
                lg.f fVar = ((fn0) this.b).e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                break;
            case 13:
                pn0 pn0Var = (pn0) this.b;
                pn0Var.getClass();
                new fg.n1(pn0Var.b, 24, true).show();
                break;
            case 14:
                ((eo0) this.b).Q(false);
                break;
            case 15:
                rq0 rq0Var = ((pq0) this.b).s;
                ArrayList arrayList = rq0Var.s;
                if (!arrayList.isEmpty()) {
                    rq0Var.r = TextUtils.join(" ", arrayList).toString();
                    rq0Var.n = false;
                    rq0Var.d();
                    rq0Var.w = null;
                    if (rq0Var.b != 0) {
                        rq0Var.b = 0;
                        qq0 qq0Var = rq0Var.E;
                        if (qq0Var != null) {
                            ((org.telegram.ui.tv) qq0Var).g(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                zu0 zu0Var = ((ht0) this.b).f;
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) zu0Var.s1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((oq0) this.b).run();
                break;
            case 18:
                ((ax0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((oh.w4) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                r11 r11Var = ((t11) this.b).b;
                r11Var.setText("");
                AndroidUtilities.showKeyboard(r11Var);
                break;
            case 22:
                ((c21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((w31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.wk) this.b).s;
                if (xnVar.getUserConfig().isPremium() || ((chat = xnVar.e) != null && chat.autotranslation)) {
                    xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + xnVar.a(), 14).commit();
                    xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 13, false));
                }
                xnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

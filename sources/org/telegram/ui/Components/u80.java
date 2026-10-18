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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                        a81 a81Var = photoViewer.F2;
                        if (a81Var != null) {
                            if (a81Var.y()) {
                                a81Var.B();
                            } else {
                                a81Var.C();
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
                ir0 ir0Var = ((gr0) this.b).s;
                ArrayList arrayList = ir0Var.s;
                if (!arrayList.isEmpty()) {
                    ir0Var.r = TextUtils.join(" ", arrayList).toString();
                    ir0Var.n = false;
                    ir0Var.d();
                    ir0Var.w = null;
                    if (ir0Var.b != 0) {
                        ir0Var.b = 0;
                        hr0 hr0Var = ir0Var.H;
                        if (hr0Var != null) {
                            ((org.telegram.ui.jv) hr0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 15:
                sv0 sv0Var = ((bu0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) sv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 16:
                ((fr0) this.b).run();
                break;
            case 17:
                ((rx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 18:
                AndroidUtilities.runOnUIThread((ci.k5) this.b, 100L);
                break;
            case 19:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 20:
                j21 j21Var = ((l21) this.b).b;
                j21Var.setText("");
                AndroidUtilities.showKeyboard(j21Var);
                break;
            case 21:
                ((u21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 22:
                ((r41) this.b).dismiss();
                break;
            case 23:
                org.telegram.ui.sn snVar = ((org.telegram.ui.tk) this.b).s;
                if (snVar.getUserConfig().isPremium() || ((chat = snVar.e) != null && chat.autotranslation)) {
                    snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + snVar.a(), 14).commit();
                    snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 13, false));
                }
                snVar.Uc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

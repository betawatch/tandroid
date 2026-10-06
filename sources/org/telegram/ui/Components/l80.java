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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class l80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                n80 n80Var = (n80) this.b;
                n80Var.b = true;
                n80Var.dismiss();
                break;
            case 1:
                ((u80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                nc0 nc0Var = (nc0) this.b;
                nc0.b(nc0Var.getContext(), nc0Var.a, nc0Var.n, false, nc0Var.x, new lc0(nc0Var, 0), nc0Var.c);
                break;
            case 4:
                ((md0) this.b).onBackPressed();
                break;
            case 5:
                me0.m((me0) this.b);
                break;
            case 6:
                uf0 uf0Var = (uf0) this.b;
                uf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                vf0 vf0Var = uf0Var.d;
                if (intValue == vf0Var.y) {
                    vf0Var.N = u5Var.getCurrentColor();
                } else {
                    vf0Var.O = u5Var.getCurrentColor();
                }
                yz yzVar = vf0Var.l0;
                if (yzVar != null) {
                    yzVar.e(false, false, false);
                }
                vf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cg0) this.b).a.y.url)));
                break;
            case 8:
                rg0 rg0Var = (rg0) this.b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    dg0 dg0Var = rg0Var.r;
                    if (dg0Var == null) {
                        e81 e81Var = photoViewer.F2;
                        if (e81Var != null) {
                            if (e81Var.y()) {
                                e81Var.B();
                            } else {
                                e81Var.C();
                            }
                        }
                    } else if (dg0Var.G) {
                        dg0Var.f();
                    } else {
                        dg0Var.g();
                    }
                    rg0.p0.z();
                    break;
                }
                break;
            case 9:
                ah0 ah0Var = (ah0) this.b;
                ah0Var.getClass();
                xg0 xg0Var = (xg0) ah0Var;
                yg0 yg0Var = xg0Var.e;
                bh0 bh0Var = (bh0) xg0Var.getTag(R.id.object_tag);
                if (bh0Var.b.size() > 15) {
                    boolean z10 = bh0Var.e;
                    bh0Var.e = !z10;
                    if (!z10) {
                        bh0Var.f = 10;
                    }
                    yg0Var.s.M(xg0Var);
                    yg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((sm0) this.b).onBackPressed();
                break;
            case 11:
                on0 on0Var = ((nn0) this.b).c;
                ht.n(on0Var.F, on0Var.G);
                break;
            case 12:
                ci.h2 h2Var = ((pn0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                ao0 ao0Var = (ao0) this.b;
                ao0Var.getClass();
                new rg.y0(ao0Var.b, 24, true).show();
                break;
            case 14:
                ((qo0) this.b).S(false);
                break;
            case 15:
                fr0 fr0Var = ((dr0) this.b).s;
                ArrayList arrayList = fr0Var.s;
                if (!arrayList.isEmpty()) {
                    fr0Var.r = TextUtils.join(" ", arrayList).toString();
                    fr0Var.n = false;
                    fr0Var.d();
                    fr0Var.w = null;
                    if (fr0Var.b != 0) {
                        fr0Var.b = 0;
                        er0 er0Var = fr0Var.H;
                        if (er0Var != null) {
                            ((org.telegram.ui.xv) er0Var).i(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                qv0 qv0Var = ((zt0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) qv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((gq0) this.b).run();
                break;
            case 18:
                ((ux0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                m21 m21Var = ((o21) this.b).b;
                m21Var.setText("");
                AndroidUtilities.showKeyboard(m21Var);
                break;
            case 22:
                ((y21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((u41) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.yn ynVar = ((org.telegram.ui.wk) this.b).s;
                if (ynVar.getUserConfig().isPremium() || ((chat = ynVar.e) != null && chat.autotranslation)) {
                    ynVar.getMessagesController().getTranslateController().toggleTranslatingDialog(ynVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + ynVar.a(), 14).commit();
                    ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 13, false));
                }
                ynVar.Pc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

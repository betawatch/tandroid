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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h70(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i9;
        switch (this.a) {
            case 0:
                j70 j70Var = (j70) this.b;
                j70Var.b = true;
                j70Var.dismiss();
                break;
            case 1:
                ((p70) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                gb0 gb0Var = (gb0) this.b;
                gb0.b(gb0Var.getContext(), gb0Var.a, gb0Var.n, false, gb0Var.x, new np(gb0Var, 29), gb0Var.c);
                break;
            case 4:
                ((gc0) this.b).onBackPressed();
                break;
            case 5:
                hd0.m((hd0) this.b);
                break;
            case 6:
                pe0 pe0Var = (pe0) this.b;
                pe0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                qe0 qe0Var = pe0Var.d;
                if (intValue == qe0Var.y) {
                    qe0Var.J = u5Var.getCurrentColor();
                } else {
                    qe0Var.K = u5Var.getCurrentColor();
                }
                hz hzVar = qe0Var.h0;
                if (hzVar != null) {
                    hzVar.e(false, false, false);
                }
                qe0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ye0) this.b).a.y.url)));
                break;
            case 8:
                pf0 pf0Var = (pf0) this.b;
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null) {
                    ze0 ze0Var = pf0Var.r;
                    if (ze0Var == null) {
                        k61 k61Var = photoViewer.B2;
                        if (k61Var != null) {
                            if (k61Var.z()) {
                                k61Var.C();
                            } else {
                                k61Var.D();
                            }
                        }
                    } else if (ze0Var.C) {
                        ze0Var.f();
                    } else {
                        ze0Var.g();
                    }
                    pf0.l0.z();
                    break;
                }
                break;
            case 9:
                yf0 yf0Var = (yf0) this.b;
                yf0Var.getClass();
                vf0 vf0Var = (vf0) yf0Var;
                wf0 wf0Var = vf0Var.e;
                zf0 zf0Var = (zf0) vf0Var.getTag(R.id.object_tag);
                if (zf0Var.b.size() > 15) {
                    boolean z10 = zf0Var.e;
                    zf0Var.e = !z10;
                    if (!z10) {
                        zf0Var.f = 10;
                    }
                    wf0Var.s.N(vf0Var);
                    wf0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((ll0) this.b).onBackPressed();
                break;
            case 11:
                gm0 gm0Var = ((fm0) this.b).c;
                ss.n(gm0Var.B, gm0Var.C);
                break;
            case 12:
                fg.g gVar = ((hm0) this.b).e;
                gVar.setText("");
                AndroidUtilities.showKeyboard(gVar);
                break;
            case 13:
                sm0 sm0Var = (sm0) this.b;
                sm0Var.getClass();
                new zf.x0(sm0Var.b, 24, true).show();
                break;
            case 14:
                ((hn0) this.b).Q(false);
                break;
            case 15:
                wp0 wp0Var = ((up0) this.b).s;
                ArrayList arrayList = wp0Var.s;
                if (!arrayList.isEmpty()) {
                    wp0Var.r = TextUtils.join(" ", arrayList).toString();
                    wp0Var.n = false;
                    wp0Var.d();
                    wp0Var.w = null;
                    if (wp0Var.b != 0) {
                        wp0Var.b = 0;
                        vp0 vp0Var = wp0Var.D;
                        if (vp0Var != null) {
                            ((org.telegram.ui.jv) vp0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                eu0 eu0Var = ((ns0) this.b).f;
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) eu0Var.r1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((tp0) this.b).run();
                break;
            case 18:
                ((gw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ih.y4) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                t01 t01Var = ((v01) this.b).b;
                t01Var.setText("");
                AndroidUtilities.showKeyboard(t01Var);
                break;
            case 22:
                ((f11) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((z21) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.qn qnVar = ((org.telegram.ui.nk) this.b).s;
                if (qnVar.getUserConfig().isPremium() || ((chat = qnVar.e) != null && chat.autotranslation)) {
                    qnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(qnVar.a());
                } else {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i9).edit().putInt("dialog_show_translate_count" + qnVar.a(), 14).commit();
                    qnVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 13, false));
                }
                qnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

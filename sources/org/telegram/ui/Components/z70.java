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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                b80 b80Var = (b80) this.b;
                b80Var.b = true;
                b80Var.dismiss();
                break;
            case 1:
                ((h80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                ac0 ac0Var = (ac0) this.b;
                ac0.b(ac0Var.getContext(), ac0Var.a, ac0Var.n, false, ac0Var.x, new vp(ac0Var, 29), ac0Var.c);
                break;
            case 4:
                ((bd0) this.b).onBackPressed();
                break;
            case 5:
                de0.m((de0) this.b);
                break;
            case 6:
                mf0 mf0Var = (mf0) this.b;
                mf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                nf0 nf0Var = mf0Var.d;
                if (intValue == nf0Var.y) {
                    nf0Var.K = u5Var.getCurrentColor();
                } else {
                    nf0Var.L = u5Var.getCurrentColor();
                }
                vz vzVar = nf0Var.i0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                nf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((uf0) this.b).a.y.url)));
                break;
            case 8:
                lg0 lg0Var = (lg0) this.b;
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null) {
                    vf0 vf0Var = lg0Var.r;
                    if (vf0Var == null) {
                        i71 i71Var = photoViewer.C2;
                        if (i71Var != null) {
                            if (i71Var.y()) {
                                i71Var.B();
                            } else {
                                i71Var.C();
                            }
                        }
                    } else if (vf0Var.D) {
                        vf0Var.f();
                    } else {
                        vf0Var.g();
                    }
                    lg0.m0.z();
                    break;
                }
                break;
            case 9:
                tg0 tg0Var = (tg0) this.b;
                tg0Var.getClass();
                qg0 qg0Var = (qg0) tg0Var;
                rg0 rg0Var = qg0Var.e;
                ug0 ug0Var = (ug0) qg0Var.getTag(R.id.object_tag);
                if (ug0Var.b.size() > 15) {
                    boolean z4 = ug0Var.e;
                    ug0Var.e = !z4;
                    if (!z4) {
                        ug0Var.f = 10;
                    }
                    rg0Var.s.O(qg0Var);
                    rg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((im0) this.b).onBackPressed();
                break;
            case 11:
                dn0 dn0Var = ((cn0) this.b).c;
                bt.n(dn0Var.C, dn0Var.D);
                break;
            case 12:
                kg.f fVar = ((en0) this.b).e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                break;
            case 13:
                on0 on0Var = (on0) this.b;
                on0Var.getClass();
                new eg.o1(on0Var.b, 24, true).show();
                break;
            case 14:
                ((do0) this.b).Q(false);
                break;
            case 15:
                qq0 qq0Var = ((oq0) this.b).s;
                ArrayList arrayList = qq0Var.s;
                if (!arrayList.isEmpty()) {
                    qq0Var.r = TextUtils.join(" ", arrayList).toString();
                    qq0Var.n = false;
                    qq0Var.d();
                    qq0Var.w = null;
                    if (qq0Var.b != 0) {
                        qq0Var.b = 0;
                        pq0 pq0Var = qq0Var.E;
                        if (pq0Var != null) {
                            ((org.telegram.ui.sv) pq0Var).g(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                yu0 yu0Var = ((gt0) this.b).f;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.s1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((nq0) this.b).run();
                break;
            case 18:
                ((zw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((nh.v4) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                q11 q11Var = ((s11) this.b).b;
                q11Var.setText("");
                AndroidUtilities.showKeyboard(q11Var);
                break;
            case 22:
                ((b21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((v31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.xn xnVar = ((org.telegram.ui.wk) this.b).s;
                if (xnVar.getUserConfig().isPremium() || ((chat = xnVar.e) != null && chat.autotranslation)) {
                    xnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(xnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + xnVar.a(), 14).commit();
                    xnVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar, 13, false));
                }
                xnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

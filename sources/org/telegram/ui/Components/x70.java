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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                z70 z70Var = (z70) this.b;
                z70Var.b = true;
                z70Var.dismiss();
                break;
            case 1:
                ((g80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                ac0 ac0Var = (ac0) this.b;
                ac0.b(ac0Var.getContext(), ac0Var.a, ac0Var.n, false, ac0Var.x, new wp(ac0Var, 29), ac0Var.c);
                break;
            case 4:
                ((ad0) this.b).onBackPressed();
                break;
            case 5:
                ae0.m((ae0) this.b);
                break;
            case 6:
                if0 if0Var = (if0) this.b;
                if0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.y) {
                    jf0Var.N = t5Var.getCurrentColor();
                } else {
                    jf0Var.O = t5Var.getCurrentColor();
                }
                vz vzVar = jf0Var.l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                jf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pf0) this.b).a.y.url)));
                break;
            case 8:
                eg0 eg0Var = (eg0) this.b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = eg0Var.r;
                    if (qf0Var == null) {
                        g71 g71Var = photoViewer.F2;
                        if (g71Var != null) {
                            if (g71Var.y()) {
                                g71Var.B();
                            } else {
                                g71Var.C();
                            }
                        }
                    } else if (qf0Var.G) {
                        qf0Var.f();
                    } else {
                        qf0Var.g();
                    }
                    eg0.p0.z();
                    break;
                }
                break;
            case 9:
                ng0 ng0Var = (ng0) this.b;
                ng0Var.getClass();
                kg0 kg0Var = (kg0) ng0Var;
                lg0 lg0Var = kg0Var.e;
                og0 og0Var = (og0) kg0Var.getTag(R.id.object_tag);
                if (og0Var.b.size() > 15) {
                    boolean z10 = og0Var.e;
                    og0Var.e = !z10;
                    if (!z10) {
                        og0Var.f = 10;
                    }
                    lg0Var.s.O(kg0Var);
                    lg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((am0) this.b).onBackPressed();
                break;
            case 11:
                vm0 vm0Var = ((um0) this.b).c;
                dt.n(vm0Var.F, vm0Var.G);
                break;
            case 12:
                di.h2 h2Var = ((wm0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                hn0 hn0Var = (hn0) this.b;
                hn0Var.getClass();
                new sg.a1(hn0Var.b, 24, true).show();
                break;
            case 14:
                ((yn0) this.b).Q(false);
                break;
            case 15:
                mq0 mq0Var = ((kq0) this.b).s;
                ArrayList arrayList = mq0Var.s;
                if (!arrayList.isEmpty()) {
                    mq0Var.r = TextUtils.join(" ", arrayList).toString();
                    mq0Var.n = false;
                    mq0Var.d();
                    mq0Var.w = null;
                    if (mq0Var.b != 0) {
                        mq0Var.b = 0;
                        lq0 lq0Var = mq0Var.H;
                        if (lq0Var != null) {
                            ((org.telegram.ui.xv) lq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                xu0 xu0Var = ((gt0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xu0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((jq0) this.b).run();
                break;
            case 18:
                ((xw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((bi.j6) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                m11 m11Var = ((o11) this.b).b;
                m11Var.setText("");
                AndroidUtilities.showKeyboard(m11Var);
                break;
            case 22:
                ((y11) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((u31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.co coVar = ((org.telegram.ui.zk) this.b).s;
                if (coVar.getUserConfig().isPremium() || ((chat = coVar.e) != null && chat.autotranslation)) {
                    coVar.getMessagesController().getTranslateController().toggleTranslatingDialog(coVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + coVar.a(), 14).commit();
                    coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 13, false));
                }
                coVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b90(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((i90) this.b).dismiss();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 2:
                zc0 zc0Var = (zc0) this.b;
                zc0.b(zc0Var.getContext(), zc0Var.a, zc0Var.n, false, zc0Var.x, new nq(zc0Var, 29), zc0Var.c);
                break;
            case 3:
                ((ae0) this.b).onBackPressed();
                break;
            case 4:
                bf0.o((bf0) this.b);
                break;
            case 5:
                jg0 jg0Var = (jg0) this.b;
                jg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                kg0 kg0Var = jg0Var.d;
                if (intValue == kg0Var.y) {
                    kg0Var.N = u5Var.getCurrentColor();
                } else {
                    kg0Var.O = u5Var.getCurrentColor();
                }
                l00 l00Var = kg0Var.l0;
                if (l00Var != null) {
                    l00Var.e(false, false, false);
                }
                kg0Var.g();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((rg0) this.b).a.y.url)));
                break;
            case 7:
                gh0 gh0Var = (gh0) this.b;
                PhotoViewer photoViewer = gh0Var.V;
                if (photoViewer != null) {
                    sg0 sg0Var = gh0Var.r;
                    if (sg0Var == null) {
                        k81 k81Var = photoViewer.F2;
                        if (k81Var != null) {
                            if (k81Var.y()) {
                                k81Var.B();
                            } else {
                                k81Var.C();
                            }
                        }
                    } else if (sg0Var.G) {
                        sg0Var.f();
                    } else {
                        sg0Var.g();
                    }
                    gh0.p0.z();
                    break;
                }
                break;
            case 8:
                qh0 qh0Var = (qh0) this.b;
                qh0Var.getClass();
                nh0 nh0Var = (nh0) qh0Var;
                oh0 oh0Var = nh0Var.e;
                rh0 rh0Var = (rh0) nh0Var.getTag(R.id.object_tag);
                if (rh0Var.b.size() > 15) {
                    boolean z10 = rh0Var.e;
                    rh0Var.e = !z10;
                    if (!z10) {
                        rh0Var.f = 10;
                    }
                    oh0Var.s.P(nh0Var);
                    oh0Var.s.c.X(true);
                    break;
                }
                break;
            case 9:
                ((gn0) this.b).onBackPressed();
                break;
            case 10:
                bo0 bo0Var = ((ao0) this.b).c;
                vt.p(bo0Var.F, bo0Var.G);
                break;
            case 11:
                ci.g2 g2Var = ((co0) this.b).e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                break;
            case 12:
                no0 no0Var = (no0) this.b;
                no0Var.getClass();
                new rg.y0(no0Var.b, 24, true).show();
                break;
            case 13:
                ((dp0) this.b).Q(false);
                break;
            case 14:
                rr0 rr0Var = ((pr0) this.b).s;
                ArrayList arrayList = rr0Var.s;
                if (!arrayList.isEmpty()) {
                    rr0Var.r = TextUtils.join(" ", arrayList).toString();
                    rr0Var.n = false;
                    rr0Var.d();
                    rr0Var.w = null;
                    if (rr0Var.b != 0) {
                        rr0Var.b = 0;
                        qr0 qr0Var = rr0Var.H;
                        if (qr0Var != null) {
                            ((org.telegram.ui.vv) qr0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 15:
                bw0 bw0Var = ((ku0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) bw0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 16:
                ((or0) this.b).run();
                break;
            case 17:
                ((ay0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 18:
                AndroidUtilities.runOnUIThread((ai.b7) this.b, 100L);
                break;
            case 19:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 20:
                s21 s21Var = ((u21) this.b).b;
                s21Var.setText("");
                AndroidUtilities.showKeyboard(s21Var);
                break;
            case 21:
                ((e31) this.b).b.getImageReceiver().startAnimation();
                break;
            case 22:
                ((b51) this.b).dismiss();
                break;
            case 23:
                org.telegram.ui.zn znVar = ((org.telegram.ui.al) this.b).s;
                if (znVar.getUserConfig().isPremium() || ((chat = znVar.e) != null && chat.autotranslation)) {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar, 13, false));
                }
                znVar.Uc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

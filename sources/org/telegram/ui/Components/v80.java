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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((b90) this.b).dismiss();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.b).o(2);
                break;
            case 2:
                vc0 vc0Var = (vc0) this.b;
                vc0.b(vc0Var.getContext(), vc0Var.a, vc0Var.n, false, vc0Var.x, new yb0(vc0Var, 1), vc0Var.c);
                break;
            case 3:
                ((wd0) this.b).onBackPressed();
                break;
            case 4:
                xe0.m((xe0) this.b);
                break;
            case 5:
                gg0 gg0Var = (gg0) this.b;
                gg0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                hg0 hg0Var = gg0Var.d;
                if (intValue == hg0Var.y) {
                    hg0Var.N = t5Var.getCurrentColor();
                } else {
                    hg0Var.O = t5Var.getCurrentColor();
                }
                e00 e00Var = hg0Var.l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                hg0Var.g();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((og0) this.b).a.y.url)));
                break;
            case 7:
                dh0 dh0Var = (dh0) this.b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    pg0 pg0Var = dh0Var.r;
                    if (pg0Var == null) {
                        j81 j81Var = photoViewer.F2;
                        if (j81Var != null) {
                            if (j81Var.y()) {
                                j81Var.B();
                            } else {
                                j81Var.C();
                            }
                        }
                    } else if (pg0Var.G) {
                        pg0Var.f();
                    } else {
                        pg0Var.g();
                    }
                    dh0.p0.z();
                    break;
                }
                break;
            case 8:
                mh0 mh0Var = (mh0) this.b;
                mh0Var.getClass();
                jh0 jh0Var = (jh0) mh0Var;
                kh0 kh0Var = jh0Var.e;
                nh0 nh0Var = (nh0) jh0Var.getTag(R.id.object_tag);
                if (nh0Var.b.size() > 15) {
                    boolean z10 = nh0Var.e;
                    nh0Var.e = !z10;
                    if (!z10) {
                        nh0Var.f = 10;
                    }
                    kh0Var.s.Q(jh0Var);
                    kh0Var.s.c.X(true);
                    break;
                }
                break;
            case 9:
                ((cn0) this.b).onBackPressed();
                break;
            case 10:
                xn0 xn0Var = ((wn0) this.b).c;
                nt.n(xn0Var.F, xn0Var.G);
                break;
            case 11:
                ei.e2 e2Var = ((yn0) this.b).d;
                e2Var.setText("");
                AndroidUtilities.showKeyboard(e2Var);
                break;
            case 12:
                jo0 jo0Var = (jo0) this.b;
                jo0Var.getClass();
                new sg.y0(jo0Var.b, 24, true).show();
                break;
            case 13:
                ((ap0) this.b).P(false);
                break;
            case 14:
                nr0 nr0Var = ((lr0) this.b).s;
                ArrayList arrayList = nr0Var.s;
                if (!arrayList.isEmpty()) {
                    nr0Var.r = TextUtils.join(" ", arrayList).toString();
                    nr0Var.n = false;
                    nr0Var.d();
                    nr0Var.w = null;
                    if (nr0Var.b != 0) {
                        nr0Var.b = 0;
                        mr0 mr0Var = nr0Var.H;
                        if (mr0Var != null) {
                            ((org.telegram.ui.jv) mr0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 15:
                xv0 xv0Var = ((gu0) this.b).f;
                org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 16:
                ((kr0) this.b).run();
                break;
            case 17:
                ((wx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 18:
                AndroidUtilities.runOnUIThread((ci.k5) this.b, 100L);
                break;
            case 19:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 20:
                o21 o21Var = ((q21) this.b).b;
                o21Var.setText("");
                AndroidUtilities.showKeyboard(o21Var);
                break;
            case 21:
                ((a31) this.b).b.getImageReceiver().startAnimation();
                break;
            case 22:
                ((y41) this.b).dismiss();
                break;
            case 23:
                org.telegram.ui.sn snVar = ((org.telegram.ui.sk) this.b).y;
                if (snVar.getUserConfig().isPremium() || ((chat = snVar.e) != null && chat.autotranslation)) {
                    snVar.getMessagesController().getTranslateController().toggleTranslatingDialog(snVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + snVar.a(), 14).commit();
                    snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 13, false));
                }
                snVar.Xc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

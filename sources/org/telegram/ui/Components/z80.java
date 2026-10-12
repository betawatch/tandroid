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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class z80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((g90) this.b).dismiss();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.y) this.b).o(2);
                break;
            case 2:
                ad0 ad0Var = (ad0) this.b;
                ad0.b(ad0Var.getContext(), ad0Var.a, ad0Var.n, false, ad0Var.x, new yc0(ad0Var, 0), ad0Var.c);
                break;
            case 3:
                ((zd0) this.b).onBackPressed();
                break;
            case 4:
                ze0.n((ze0) this.b);
                break;
            case 5:
                hg0 hg0Var = (hg0) this.b;
                hg0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                ig0 ig0Var = hg0Var.d;
                if (intValue == ig0Var.y) {
                    ig0Var.N = u5Var.getCurrentColor();
                } else {
                    ig0Var.O = u5Var.getCurrentColor();
                }
                h00 h00Var = ig0Var.l0;
                if (h00Var != null) {
                    h00Var.d(false, false, false);
                }
                ig0Var.g();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pg0) this.b).a.y.url)));
                break;
            case 7:
                fh0 fh0Var = (fh0) this.b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    qg0 qg0Var = fh0Var.r;
                    if (qg0Var == null) {
                        h81 h81Var = photoViewer.F2;
                        if (h81Var != null) {
                            if (h81Var.y()) {
                                h81Var.B();
                            } else {
                                h81Var.C();
                            }
                        }
                    } else if (qg0Var.G) {
                        qg0Var.f();
                    } else {
                        qg0Var.g();
                    }
                    fh0.p0.z();
                    break;
                }
                break;
            case 8:
                oh0 oh0Var = (oh0) this.b;
                oh0Var.getClass();
                lh0 lh0Var = (lh0) oh0Var;
                mh0 mh0Var = lh0Var.e;
                ph0 ph0Var = (ph0) lh0Var.getTag(R.id.object_tag);
                if (ph0Var.b.size() > 15) {
                    boolean z10 = ph0Var.e;
                    ph0Var.e = !z10;
                    if (!z10) {
                        ph0Var.f = 10;
                    }
                    mh0Var.s.P(lh0Var);
                    mh0Var.s.c.X(true);
                    break;
                }
                break;
            case 9:
                ((cn0) this.b).onBackPressed();
                break;
            case 10:
                yn0 yn0Var = ((xn0) this.b).c;
                st.o(yn0Var.F, yn0Var.G);
                break;
            case 11:
                di.g2 g2Var = ((zn0) this.b).e;
                g2Var.setText("");
                AndroidUtilities.showKeyboard(g2Var);
                break;
            case 12:
                ko0 ko0Var = (ko0) this.b;
                ko0Var.getClass();
                new sg.y0(ko0Var.b, 24, true).show();
                break;
            case 13:
                ((zo0) this.b).Q(false);
                break;
            case 14:
                or0 or0Var = ((mr0) this.b).s;
                ArrayList arrayList = or0Var.s;
                if (!arrayList.isEmpty()) {
                    or0Var.r = TextUtils.join(" ", arrayList).toString();
                    or0Var.n = false;
                    or0Var.d();
                    or0Var.w = null;
                    if (or0Var.b != 0) {
                        or0Var.b = 0;
                        nr0 nr0Var = or0Var.H;
                        if (nr0Var != null) {
                            ((org.telegram.ui.aw) nr0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 15:
                xv0 xv0Var = ((gu0) this.b).f;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) xv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 16:
                ((lr0) this.b).run();
                break;
            case 17:
                ((wx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 18:
                AndroidUtilities.runOnUIThread((bi.m6) this.b, 100L);
                break;
            case 19:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 20:
                p21 p21Var = ((r21) this.b).b;
                p21Var.setText("");
                AndroidUtilities.showKeyboard(p21Var);
                break;
            case 21:
                ((a31) this.b).b.getImageReceiver().startAnimation();
                break;
            case 22:
                ((x41) this.b).dismiss();
                break;
            case 23:
                org.telegram.ui.fo foVar = ((org.telegram.ui.el) this.b).s;
                if (foVar.getUserConfig().isPremium() || ((chat = foVar.e) != null && chat.autotranslation)) {
                    foVar.getMessagesController().getTranslateController().toggleTranslatingDialog(foVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + foVar.a(), 14).commit();
                    foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 13, false));
                }
                foVar.Uc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

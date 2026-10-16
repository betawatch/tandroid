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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((f90) this.b).dismiss();
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
                af0.n((af0) this.b);
                break;
            case 5:
                ig0 ig0Var = (ig0) this.b;
                ig0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                jg0 jg0Var = ig0Var.d;
                if (intValue == jg0Var.y) {
                    jg0Var.N = u5Var.getCurrentColor();
                } else {
                    jg0Var.O = u5Var.getCurrentColor();
                }
                h00 h00Var = jg0Var.l0;
                if (h00Var != null) {
                    h00Var.d(false, false, false);
                }
                jg0Var.g();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((qg0) this.b).a.y.url)));
                break;
            case 7:
                fh0 fh0Var = (fh0) this.b;
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null) {
                    rg0 rg0Var = fh0Var.r;
                    if (rg0Var == null) {
                        i81 i81Var = photoViewer.F2;
                        if (i81Var != null) {
                            if (i81Var.y()) {
                                i81Var.B();
                            } else {
                                i81Var.C();
                            }
                        }
                    } else if (rg0Var.G) {
                        rg0Var.f();
                    } else {
                        rg0Var.g();
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
                xn0 xn0Var = ((wn0) this.b).c;
                st.o(xn0Var.F, xn0Var.G);
                break;
            case 11:
                di.g2 g2Var = ((yn0) this.b).e;
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
                            ((org.telegram.ui.aw) mr0Var).h(0);
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
                ((kr0) this.b).run();
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
                q21 q21Var = ((s21) this.b).b;
                q21Var.setText("");
                AndroidUtilities.showKeyboard(q21Var);
                break;
            case 21:
                ((b31) this.b).b.getImageReceiver().startAnimation();
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

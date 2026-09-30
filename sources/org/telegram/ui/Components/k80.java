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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                m80 m80Var = (m80) this.b;
                m80Var.b = true;
                m80Var.dismiss();
                break;
            case 1:
                ((t80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.y) this.b).o(2);
                break;
            case 3:
                mc0 mc0Var = (mc0) this.b;
                mc0.b(mc0Var.getContext(), mc0Var.a, mc0Var.n, false, mc0Var.x, new kc0(mc0Var, 0), mc0Var.c);
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
                xz xzVar = vf0Var.l0;
                if (xzVar != null) {
                    xzVar.e(false, false, false);
                }
                vf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((bg0) this.b).a.y.url)));
                break;
            case 8:
                qg0 qg0Var = (qg0) this.b;
                PhotoViewer photoViewer = qg0Var.V;
                if (photoViewer != null) {
                    cg0 cg0Var = qg0Var.r;
                    if (cg0Var == null) {
                        u71 u71Var = photoViewer.F2;
                        if (u71Var != null) {
                            if (u71Var.y()) {
                                u71Var.B();
                            } else {
                                u71Var.C();
                            }
                        }
                    } else if (cg0Var.G) {
                        cg0Var.f();
                    } else {
                        cg0Var.g();
                    }
                    qg0.p0.z();
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
                    yg0Var.s.O(xg0Var);
                    yg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((om0) this.b).onBackPressed();
                break;
            case 11:
                kn0 kn0Var = ((jn0) this.b).c;
                gt.n(kn0Var.F, kn0Var.G);
                break;
            case 12:
                ci.h2 h2Var = ((ln0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                wn0 wn0Var = (wn0) this.b;
                wn0Var.getClass();
                new rg.x0(wn0Var.b, 24, true).show();
                break;
            case 14:
                ((no0) this.b).Q(false);
                break;
            case 15:
                br0 br0Var = ((zq0) this.b).s;
                ArrayList arrayList = br0Var.s;
                if (!arrayList.isEmpty()) {
                    br0Var.r = TextUtils.join(" ", arrayList).toString();
                    br0Var.n = false;
                    br0Var.d();
                    br0Var.w = null;
                    if (br0Var.b != 0) {
                        br0Var.b = 0;
                        ar0 ar0Var = br0Var.H;
                        if (ar0Var != null) {
                            ((org.telegram.ui.sv) ar0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                lv0 lv0Var = ((ut0) this.b).f;
                org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) lv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((yq0) this.b).run();
                break;
            case 18:
                ((kx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                c21 c21Var = ((e21) this.b).b;
                c21Var.setText("");
                AndroidUtilities.showKeyboard(c21Var);
                break;
            case 22:
                ((o21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((k41) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.wk) this.b).s;
                if (wnVar.getUserConfig().isPremium() || ((chat = wnVar.e) != null && chat.autotranslation)) {
                    wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + wnVar.a(), 14).commit();
                    wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 13, false));
                }
                wnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

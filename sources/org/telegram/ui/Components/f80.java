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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                h80 h80Var = (h80) this.b;
                h80Var.b = true;
                h80Var.dismiss();
                break;
            case 1:
                ((o80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                hc0 hc0Var = (hc0) this.b;
                hc0.b(hc0Var.getContext(), hc0Var.a, hc0Var.n, false, hc0Var.x, new xp(hc0Var, 29), hc0Var.c);
                break;
            case 4:
                ((id0) this.b).onBackPressed();
                break;
            case 5:
                ie0.m((ie0) this.b);
                break;
            case 6:
                qf0 qf0Var = (qf0) this.b;
                qf0Var.getClass();
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                rf0 rf0Var = qf0Var.d;
                if (intValue == rf0Var.y) {
                    rf0Var.N = v5Var.getCurrentColor();
                } else {
                    rf0Var.O = v5Var.getCurrentColor();
                }
                vz vzVar = rf0Var.l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                rf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((xf0) this.b).a.y.url)));
                break;
            case 8:
                og0 og0Var = (og0) this.b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    yf0 yf0Var = og0Var.r;
                    if (yf0Var == null) {
                        t71 t71Var = photoViewer.F2;
                        if (t71Var != null) {
                            if (t71Var.y()) {
                                t71Var.B();
                            } else {
                                t71Var.C();
                            }
                        }
                    } else if (yf0Var.G) {
                        yf0Var.f();
                    } else {
                        yf0Var.g();
                    }
                    og0.p0.z();
                    break;
                }
                break;
            case 9:
                xg0 xg0Var = (xg0) this.b;
                xg0Var.getClass();
                ug0 ug0Var = (ug0) xg0Var;
                vg0 vg0Var = ug0Var.e;
                yg0 yg0Var = (yg0) ug0Var.getTag(R.id.object_tag);
                if (yg0Var.b.size() > 15) {
                    boolean z10 = yg0Var.e;
                    yg0Var.e = !z10;
                    if (!z10) {
                        yg0Var.f = 10;
                    }
                    vg0Var.s.O(ug0Var);
                    vg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((mm0) this.b).onBackPressed();
                break;
            case 11:
                in0 in0Var = ((hn0) this.b).c;
                et.n(in0Var.F, in0Var.G);
                break;
            case 12:
                ci.h2 h2Var = ((jn0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                un0 un0Var = (un0) this.b;
                un0Var.getClass();
                new rg.x0(un0Var.b, 24, true).show();
                break;
            case 14:
                ((lo0) this.b).R(false);
                break;
            case 15:
                zq0 zq0Var = ((xq0) this.b).s;
                ArrayList arrayList = zq0Var.s;
                if (!arrayList.isEmpty()) {
                    zq0Var.r = TextUtils.join(" ", arrayList).toString();
                    zq0Var.n = false;
                    zq0Var.d();
                    zq0Var.w = null;
                    if (zq0Var.b != 0) {
                        zq0Var.b = 0;
                        yq0 yq0Var = zq0Var.H;
                        if (yq0Var != null) {
                            ((org.telegram.ui.xv) yq0Var).g(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                jv0 jv0Var = ((st0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) jv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((wq0) this.b).run();
                break;
            case 18:
                ((jx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                b21 b21Var = ((d21) this.b).b;
                b21Var.setText("");
                AndroidUtilities.showKeyboard(b21Var);
                break;
            case 22:
                ((n21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((j41) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.yk) this.b).s;
                if (znVar.getUserConfig().isPremium() || ((chat = znVar.e) != null && chat.autotranslation)) {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar, 13, false));
                }
                znVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

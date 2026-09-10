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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) this.b;
                i80Var.b = true;
                i80Var.dismiss();
                break;
            case 1:
                ((q80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                ic0 ic0Var = (ic0) this.b;
                ic0.b(ic0Var.getContext(), ic0Var.a, ic0Var.n, false, ic0Var.x, new dq(ic0Var, 29), ic0Var.c);
                break;
            case 4:
                ((id0) this.b).onBackPressed();
                break;
            case 5:
                je0.m((je0) this.b);
                break;
            case 6:
                rf0 rf0Var = (rf0) this.b;
                rf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                sf0 sf0Var = rf0Var.d;
                if (intValue == sf0Var.y) {
                    sf0Var.N = u5Var.getCurrentColor();
                } else {
                    sf0Var.O = u5Var.getCurrentColor();
                }
                c00 c00Var = sf0Var.l0;
                if (c00Var != null) {
                    c00Var.e(false, false, false);
                }
                sf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((yf0) this.b).a.y.url)));
                break;
            case 8:
                og0 og0Var = (og0) this.b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    zf0 zf0Var = og0Var.r;
                    if (zf0Var == null) {
                        t71 t71Var = photoViewer.F2;
                        if (t71Var != null) {
                            if (t71Var.y()) {
                                t71Var.B();
                            } else {
                                t71Var.C();
                            }
                        }
                    } else if (zf0Var.G) {
                        zf0Var.f();
                    } else {
                        zf0Var.g();
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
                ((km0) this.b).onBackPressed();
                break;
            case 11:
                fn0 fn0Var = ((en0) this.b).c;
                kt.n(fn0Var.F, fn0Var.G);
                break;
            case 12:
                bi.t2 t2Var = ((gn0) this.b).e;
                t2Var.setText("");
                AndroidUtilities.showKeyboard(t2Var);
                break;
            case 13:
                rn0 rn0Var = (rn0) this.b;
                rn0Var.getClass();
                new qg.a1(rn0Var.b, 24, true).show();
                break;
            case 14:
                ((ho0) this.b).Q(false);
                break;
            case 15:
                xq0 xq0Var = ((vq0) this.b).s;
                ArrayList arrayList = xq0Var.s;
                if (!arrayList.isEmpty()) {
                    xq0Var.r = TextUtils.join(" ", arrayList).toString();
                    xq0Var.n = false;
                    xq0Var.d();
                    xq0Var.w = null;
                    if (xq0Var.b != 0) {
                        xq0Var.b = 0;
                        wq0 wq0Var = xq0Var.H;
                        if (wq0Var != null) {
                            ((org.telegram.ui.yv) wq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                iv0 iv0Var = ((qt0) this.b).f;
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) iv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((uq0) this.b).run();
                break;
            case 18:
                ((jx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((zh.s3) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                a21 a21Var = ((c21) this.b).b;
                a21Var.setText("");
                AndroidUtilities.showKeyboard(a21Var);
                break;
            case 22:
                ((n21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((i41) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.eo eoVar = ((org.telegram.ui.bl) this.b).s;
                if (eoVar.getUserConfig().isPremium() || ((chat = eoVar.e) != null && chat.autotranslation)) {
                    eoVar.getMessagesController().getTranslateController().toggleTranslatingDialog(eoVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + eoVar.a(), 14).commit();
                    eoVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 13, false));
                }
                eoVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

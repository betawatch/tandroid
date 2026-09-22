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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                k80 k80Var = (k80) this.b;
                k80Var.b = true;
                k80Var.dismiss();
                break;
            case 1:
                ((r80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                lc0 lc0Var = (lc0) this.b;
                lc0.b(lc0Var.getContext(), lc0Var.a, lc0Var.n, false, lc0Var.x, new jc0(lc0Var, 0), lc0Var.c);
                break;
            case 4:
                ((ld0) this.b).onBackPressed();
                break;
            case 5:
                le0.m((le0) this.b);
                break;
            case 6:
                tf0 tf0Var = (tf0) this.b;
                tf0Var.getClass();
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                int intValue = ((Integer) v5Var.getTag()).intValue();
                uf0 uf0Var = tf0Var.d;
                if (intValue == uf0Var.y) {
                    uf0Var.N = v5Var.getCurrentColor();
                } else {
                    uf0Var.O = v5Var.getCurrentColor();
                }
                vz vzVar = uf0Var.l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                uf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ag0) this.b).a.y.url)));
                break;
            case 8:
                rg0 rg0Var = (rg0) this.b;
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null) {
                    bg0 bg0Var = rg0Var.r;
                    if (bg0Var == null) {
                        v71 v71Var = photoViewer.F2;
                        if (v71Var != null) {
                            if (v71Var.y()) {
                                v71Var.B();
                            } else {
                                v71Var.C();
                            }
                        }
                    } else if (bg0Var.G) {
                        bg0Var.f();
                    } else {
                        bg0Var.g();
                    }
                    rg0.p0.z();
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
                et.n(kn0Var.F, kn0Var.G);
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
                ((no0) this.b).R(false);
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
                            ((org.telegram.ui.xv) ar0Var).g(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                lv0 lv0Var = ((ut0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) lv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((yq0) this.b).run();
                break;
            case 18:
                ((lx0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                d21 d21Var = ((f21) this.b).b;
                d21Var.setText("");
                AndroidUtilities.showKeyboard(d21Var);
                break;
            case 22:
                ((p21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((l41) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.zk) this.b).s;
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

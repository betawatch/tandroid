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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                ((p80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                ic0 ic0Var = (ic0) this.b;
                ic0.b(ic0Var.getContext(), ic0Var.a, ic0Var.n, false, ic0Var.x, new xp(ic0Var, 29), ic0Var.c);
                break;
            case 4:
                ((jd0) this.b).onBackPressed();
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
                vz vzVar = sf0Var.l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                sf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((yf0) this.b).a.y.url)));
                break;
            case 8:
                pg0 pg0Var = (pg0) this.b;
                PhotoViewer photoViewer = pg0Var.V;
                if (photoViewer != null) {
                    zf0 zf0Var = pg0Var.r;
                    if (zf0Var == null) {
                        u71 u71Var = photoViewer.F2;
                        if (u71Var != null) {
                            if (u71Var.y()) {
                                u71Var.B();
                            } else {
                                u71Var.C();
                            }
                        }
                    } else if (zf0Var.G) {
                        zf0Var.f();
                    } else {
                        zf0Var.g();
                    }
                    pg0.p0.z();
                    break;
                }
                break;
            case 9:
                yg0 yg0Var = (yg0) this.b;
                yg0Var.getClass();
                vg0 vg0Var = (vg0) yg0Var;
                wg0 wg0Var = vg0Var.e;
                zg0 zg0Var = (zg0) vg0Var.getTag(R.id.object_tag);
                if (zg0Var.b.size() > 15) {
                    boolean z10 = zg0Var.e;
                    zg0Var.e = !z10;
                    if (!z10) {
                        zg0Var.f = 10;
                    }
                    wg0Var.s.O(vg0Var);
                    wg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((nm0) this.b).onBackPressed();
                break;
            case 11:
                jn0 jn0Var = ((in0) this.b).c;
                et.n(jn0Var.F, jn0Var.G);
                break;
            case 12:
                ci.h2 h2Var = ((kn0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                vn0 vn0Var = (vn0) this.b;
                vn0Var.getClass();
                new rg.x0(vn0Var.b, 24, true).show();
                break;
            case 14:
                ((lo0) this.b).R(false);
                break;
            case 15:
                ar0 ar0Var = ((yq0) this.b).s;
                ArrayList arrayList = ar0Var.s;
                if (!arrayList.isEmpty()) {
                    ar0Var.r = TextUtils.join(" ", arrayList).toString();
                    ar0Var.n = false;
                    ar0Var.d();
                    ar0Var.w = null;
                    if (ar0Var.b != 0) {
                        ar0Var.b = 0;
                        zq0 zq0Var = ar0Var.H;
                        if (zq0Var != null) {
                            ((org.telegram.ui.xv) zq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                kv0 kv0Var = ((tt0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) kv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((xq0) this.b).run();
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

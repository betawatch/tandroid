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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                ((org.telegram.ui.ActionBar.y) this.b).o(2);
                break;
            case 3:
                kc0 kc0Var = (kc0) this.b;
                kc0.b(kc0Var.getContext(), kc0Var.a, kc0Var.n, false, kc0Var.x, new ic0(kc0Var, 0), kc0Var.c);
                break;
            case 4:
                ((kd0) this.b).onBackPressed();
                break;
            case 5:
                ke0.m((ke0) this.b);
                break;
            case 6:
                sf0 sf0Var = (sf0) this.b;
                sf0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                tf0 tf0Var = sf0Var.d;
                if (intValue == tf0Var.y) {
                    tf0Var.N = u5Var.getCurrentColor();
                } else {
                    tf0Var.O = u5Var.getCurrentColor();
                }
                wz wzVar = tf0Var.l0;
                if (wzVar != null) {
                    wzVar.e(false, false, false);
                }
                tf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((zf0) this.b).a.y.url)));
                break;
            case 8:
                og0 og0Var = (og0) this.b;
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null) {
                    ag0 ag0Var = og0Var.r;
                    if (ag0Var == null) {
                        s71 s71Var = photoViewer.F2;
                        if (s71Var != null) {
                            if (s71Var.y()) {
                                s71Var.B();
                            } else {
                                s71Var.C();
                            }
                        }
                    } else if (ag0Var.G) {
                        ag0Var.f();
                    } else {
                        ag0Var.g();
                    }
                    og0.p0.z();
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
                ((mm0) this.b).onBackPressed();
                break;
            case 11:
                in0 in0Var = ((hn0) this.b).c;
                ft.n(in0Var.F, in0Var.G);
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
                ((lo0) this.b).Q(false);
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
                            ((org.telegram.ui.sv) yq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                jv0 jv0Var = ((st0) this.b).f;
                org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
                if (m2Var != null && m2Var.getParentLayout() != null) {
                    ((ActionBarLayout) jv0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((wq0) this.b).run();
                break;
            case 18:
                ((ix0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
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
                ((m21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((i41) this.b).dismiss();
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

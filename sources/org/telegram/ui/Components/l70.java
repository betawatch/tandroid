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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                n70 n70Var = (n70) this.b;
                n70Var.b = true;
                n70Var.dismiss();
                break;
            case 1:
                ((t70) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                kb0 kb0Var = (kb0) this.b;
                kb0.b(kb0Var.getContext(), kb0Var.a, kb0Var.n, false, kb0Var.x, new lp(kb0Var, 29), kb0Var.c);
                break;
            case 4:
                ((kc0) this.b).onBackPressed();
                break;
            case 5:
                md0.m((md0) this.b);
                break;
            case 6:
                ue0 ue0Var = (ue0) this.b;
                ue0Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                ve0 ve0Var = ue0Var.d;
                if (intValue == ve0Var.y) {
                    ve0Var.J = r5Var.getCurrentColor();
                } else {
                    ve0Var.K = r5Var.getCurrentColor();
                }
                jz jzVar = ve0Var.h0;
                if (jzVar != null) {
                    jzVar.e(false, false, false);
                }
                ve0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cf0) this.b).a.y.url)));
                break;
            case 8:
                sf0 sf0Var = (sf0) this.b;
                PhotoViewer photoViewer = sf0Var.R;
                if (photoViewer != null) {
                    df0 df0Var = sf0Var.r;
                    if (df0Var == null) {
                        m61 m61Var = photoViewer.B2;
                        if (m61Var != null) {
                            if (m61Var.z()) {
                                m61Var.C();
                            } else {
                                m61Var.D();
                            }
                        }
                    } else if (df0Var.C) {
                        df0Var.f();
                    } else {
                        df0Var.g();
                    }
                    sf0.l0.z();
                    break;
                }
                break;
            case 9:
                ag0 ag0Var = (ag0) this.b;
                ag0Var.getClass();
                xf0 xf0Var = (xf0) ag0Var;
                yf0 yf0Var = xf0Var.e;
                bg0 bg0Var = (bg0) xf0Var.getTag(R.id.object_tag);
                if (bg0Var.b.size() > 15) {
                    boolean z10 = bg0Var.e;
                    bg0Var.e = !z10;
                    if (!z10) {
                        bg0Var.f = 10;
                    }
                    yf0Var.s.O(xf0Var);
                    yf0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((ol0) this.b).onBackPressed();
                break;
            case 11:
                jm0 jm0Var = ((im0) this.b).c;
                rs.n(jm0Var.B, jm0Var.C);
                break;
            case 12:
                gg.g gVar = ((km0) this.b).e;
                gVar.setText("");
                AndroidUtilities.showKeyboard(gVar);
                break;
            case 13:
                um0 um0Var = (um0) this.b;
                um0Var.getClass();
                new ag.g2(um0Var.b, 24, true).show();
                break;
            case 14:
                ((jn0) this.b).Q(false);
                break;
            case 15:
                xp0 xp0Var = ((vp0) this.b).s;
                ArrayList arrayList = xp0Var.s;
                if (!arrayList.isEmpty()) {
                    xp0Var.r = TextUtils.join(" ", arrayList).toString();
                    xp0Var.n = false;
                    xp0Var.d();
                    xp0Var.w = null;
                    if (xp0Var.b != 0) {
                        xp0Var.b = 0;
                        wp0 wp0Var = xp0Var.D;
                        if (wp0Var != null) {
                            ((org.telegram.ui.mv) wp0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                hu0 hu0Var = ((ps0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) hu0Var.r1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((up0) this.b).run();
                break;
            case 18:
                ((iw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((jh.u4) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                v01 v01Var = ((x01) this.b).b;
                v01Var.setText("");
                AndroidUtilities.showKeyboard(v01Var);
                break;
            case 22:
                ((h11) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((b31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.rn rnVar = ((org.telegram.ui.pk) this.b).s;
                if (rnVar.getUserConfig().isPremium() || ((chat = rnVar.e) != null && chat.autotranslation)) {
                    rnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(rnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + rnVar.a(), 14).commit();
                    rnVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 13, false));
                }
                rnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

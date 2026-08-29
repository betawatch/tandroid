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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                w70 w70Var = (w70) this.b;
                w70Var.b = true;
                w70Var.dismiss();
                break;
            case 1:
                ((c80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.a0) this.b).o(2);
                break;
            case 3:
                vb0 vb0Var = (vb0) this.b;
                vb0.b(vb0Var.getContext(), vb0Var.a, vb0Var.n, false, vb0Var.x, new rp(vb0Var, 29), vb0Var.c);
                break;
            case 4:
                ((vc0) this.b).onBackPressed();
                break;
            case 5:
                vd0.m((vd0) this.b);
                break;
            case 6:
                df0 df0Var = (df0) this.b;
                df0Var.getClass();
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                int intValue = ((Integer) s5Var.getTag()).intValue();
                ef0 ef0Var = df0Var.d;
                if (intValue == ef0Var.y) {
                    ef0Var.J = s5Var.getCurrentColor();
                } else {
                    ef0Var.K = s5Var.getCurrentColor();
                }
                qz qzVar = ef0Var.h0;
                if (qzVar != null) {
                    qzVar.e(false, false, false);
                }
                ef0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((lf0) this.b).a.y.url)));
                break;
            case 8:
                bg0 bg0Var = (bg0) this.b;
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null) {
                    mf0 mf0Var = bg0Var.r;
                    if (mf0Var == null) {
                        x61 x61Var = photoViewer.B2;
                        if (x61Var != null) {
                            if (x61Var.z()) {
                                x61Var.C();
                            } else {
                                x61Var.D();
                            }
                        }
                    } else if (mf0Var.C) {
                        mf0Var.f();
                    } else {
                        mf0Var.g();
                    }
                    bg0.l0.z();
                    break;
                }
                break;
            case 9:
                jg0 jg0Var = (jg0) this.b;
                jg0Var.getClass();
                gg0 gg0Var = (gg0) jg0Var;
                hg0 hg0Var = gg0Var.e;
                kg0 kg0Var = (kg0) gg0Var.getTag(R.id.object_tag);
                if (kg0Var.b.size() > 15) {
                    boolean z10 = kg0Var.e;
                    kg0Var.e = !z10;
                    if (!z10) {
                        kg0Var.f = 10;
                    }
                    hg0Var.s.O(gg0Var);
                    hg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((yl0) this.b).onBackPressed();
                break;
            case 11:
                tm0 tm0Var = ((sm0) this.b).c;
                xs.n(tm0Var.B, tm0Var.C);
                break;
            case 12:
                ig.f fVar = ((um0) this.b).e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                break;
            case 13:
                en0 en0Var = (en0) this.b;
                en0Var.getClass();
                new cg.p1(en0Var.b, 24, true).show();
                break;
            case 14:
                ((tn0) this.b).Q(false);
                break;
            case 15:
                iq0 iq0Var = ((gq0) this.b).s;
                ArrayList arrayList = iq0Var.s;
                if (!arrayList.isEmpty()) {
                    iq0Var.r = TextUtils.join(" ", arrayList).toString();
                    iq0Var.n = false;
                    iq0Var.d();
                    iq0Var.w = null;
                    if (iq0Var.b != 0) {
                        iq0Var.b = 0;
                        hq0 hq0Var = iq0Var.D;
                        if (hq0Var != null) {
                            ((org.telegram.ui.kv) hq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                qu0 qu0Var = ((ys0) this.b).f;
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) qu0Var.r1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((fq0) this.b).run();
                break;
            case 18:
                ((qw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((lh.u4) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                f11 f11Var = ((h11) this.b).b;
                f11Var.setText("");
                AndroidUtilities.showKeyboard(f11Var);
                break;
            case 22:
                ((r11) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((k31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.tn tnVar = ((org.telegram.ui.qk) this.b).s;
                if (tnVar.getUserConfig().isPremium() || ((chat = tnVar.e) != null && chat.autotranslation)) {
                    tnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(tnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + tnVar.a(), 14).commit();
                    tnVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 13, false));
                }
                tnVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

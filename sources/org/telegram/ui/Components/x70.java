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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                z70 z70Var = (z70) this.b;
                z70Var.b = true;
                z70Var.dismiss();
                break;
            case 1:
                ((g80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                zb0 zb0Var = (zb0) this.b;
                zb0.b(zb0Var.getContext(), zb0Var.a, zb0Var.n, false, zb0Var.x, new xp(zb0Var, 29), zb0Var.c);
                break;
            case 4:
                ((zc0) this.b).onBackPressed();
                break;
            case 5:
                ae0.m((ae0) this.b);
                break;
            case 6:
                if0 if0Var = (if0) this.b;
                if0Var.getClass();
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                int intValue = ((Integer) u5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.y) {
                    jf0Var.N = u5Var.getCurrentColor();
                } else {
                    jf0Var.O = u5Var.getCurrentColor();
                }
                vz vzVar = jf0Var.l0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                jf0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pf0) this.b).a.y.url)));
                break;
            case 8:
                eg0 eg0Var = (eg0) this.b;
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = eg0Var.r;
                    if (qf0Var == null) {
                        g71 g71Var = photoViewer.F2;
                        if (g71Var != null) {
                            if (g71Var.y()) {
                                g71Var.B();
                            } else {
                                g71Var.C();
                            }
                        }
                    } else if (qf0Var.G) {
                        qf0Var.f();
                    } else {
                        qf0Var.g();
                    }
                    eg0.p0.z();
                    break;
                }
                break;
            case 9:
                ng0 ng0Var = (ng0) this.b;
                ng0Var.getClass();
                kg0 kg0Var = (kg0) ng0Var;
                lg0 lg0Var = kg0Var.e;
                og0 og0Var = (og0) kg0Var.getTag(R.id.object_tag);
                if (og0Var.b.size() > 15) {
                    boolean z10 = og0Var.e;
                    og0Var.e = !z10;
                    if (!z10) {
                        og0Var.f = 10;
                    }
                    lg0Var.s.O(kg0Var);
                    lg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((am0) this.b).onBackPressed();
                break;
            case 11:
                vm0 vm0Var = ((um0) this.b).c;
                et.n(vm0Var.F, vm0Var.G);
                break;
            case 12:
                ci.h2 h2Var = ((wm0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                hn0 hn0Var = (hn0) this.b;
                hn0Var.getClass();
                new rg.x0(hn0Var.b, 24, true).show();
                break;
            case 14:
                ((yn0) this.b).Q(false);
                break;
            case 15:
                mq0 mq0Var = ((kq0) this.b).s;
                ArrayList arrayList = mq0Var.s;
                if (!arrayList.isEmpty()) {
                    mq0Var.r = TextUtils.join(" ", arrayList).toString();
                    mq0Var.n = false;
                    mq0Var.d();
                    mq0Var.w = null;
                    if (mq0Var.b != 0) {
                        mq0Var.b = 0;
                        lq0 lq0Var = mq0Var.H;
                        if (lq0Var != null) {
                            ((org.telegram.ui.wv) lq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                yu0 yu0Var = ((ht0) this.b).f;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
                if (n2Var != null && n2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((jq0) this.b).run();
                break;
            case 18:
                ((yw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                n11 n11Var = ((p11) this.b).b;
                n11Var.setText("");
                AndroidUtilities.showKeyboard(n11Var);
                break;
            case 22:
                ((z11) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((v31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.bo boVar = ((org.telegram.ui.zk) this.b).s;
                if (boVar.getUserConfig().isPremium() || ((chat = boVar.e) != null && chat.autotranslation)) {
                    boVar.getMessagesController().getTranslateController().toggleTranslatingDialog(boVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + boVar.a(), 14).commit();
                    boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 13, false));
                }
                boVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

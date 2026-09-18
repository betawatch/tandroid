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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((org.telegram.ui.ActionBar.a0) this.b).o(2);
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
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                jf0 jf0Var = if0Var.d;
                if (intValue == jf0Var.y) {
                    jf0Var.N = t5Var.getCurrentColor();
                } else {
                    jf0Var.O = t5Var.getCurrentColor();
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
                fg0 fg0Var = (fg0) this.b;
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null) {
                    qf0 qf0Var = fg0Var.r;
                    if (qf0Var == null) {
                        h71 h71Var = photoViewer.F2;
                        if (h71Var != null) {
                            if (h71Var.y()) {
                                h71Var.B();
                            } else {
                                h71Var.C();
                            }
                        }
                    } else if (qf0Var.G) {
                        qf0Var.f();
                    } else {
                        qf0Var.g();
                    }
                    fg0.p0.z();
                    break;
                }
                break;
            case 9:
                og0 og0Var = (og0) this.b;
                og0Var.getClass();
                lg0 lg0Var = (lg0) og0Var;
                mg0 mg0Var = lg0Var.e;
                pg0 pg0Var = (pg0) lg0Var.getTag(R.id.object_tag);
                if (pg0Var.b.size() > 15) {
                    boolean z10 = pg0Var.e;
                    pg0Var.e = !z10;
                    if (!z10) {
                        pg0Var.f = 10;
                    }
                    mg0Var.s.O(lg0Var);
                    mg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((bm0) this.b).onBackPressed();
                break;
            case 11:
                wm0 wm0Var = ((vm0) this.b).c;
                et.n(wm0Var.F, wm0Var.G);
                break;
            case 12:
                ci.h2 h2Var = ((xm0) this.b).e;
                h2Var.setText("");
                AndroidUtilities.showKeyboard(h2Var);
                break;
            case 13:
                jn0 jn0Var = (jn0) this.b;
                jn0Var.getClass();
                new rg.x0(jn0Var.b, 24, true).show();
                break;
            case 14:
                ((zn0) this.b).R(false);
                break;
            case 15:
                nq0 nq0Var = ((lq0) this.b).s;
                ArrayList arrayList = nq0Var.s;
                if (!arrayList.isEmpty()) {
                    nq0Var.r = TextUtils.join(" ", arrayList).toString();
                    nq0Var.n = false;
                    nq0Var.d();
                    nq0Var.w = null;
                    if (nq0Var.b != 0) {
                        nq0Var.b = 0;
                        mq0 mq0Var = nq0Var.H;
                        if (mq0Var != null) {
                            ((org.telegram.ui.yv) mq0Var).h(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                zu0 zu0Var = ((it0) this.b).f;
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
                if (o2Var != null && o2Var.getParentLayout() != null) {
                    ((ActionBarLayout) zu0Var.v1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((kq0) this.b).run();
                break;
            case 18:
                ((zw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((ai.a7) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                o11 o11Var = ((q11) this.b).b;
                o11Var.setText("");
                AndroidUtilities.showKeyboard(o11Var);
                break;
            case 22:
                ((a21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((w31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.bo boVar = ((org.telegram.ui.al) this.b).s;
                if (boVar.getUserConfig().isPremium() || ((chat = boVar.e) != null && chat.autotranslation)) {
                    boVar.getMessagesController().getTranslateController().toggleTranslatingDialog(boVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + boVar.a(), 14).commit();
                    boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar, 13, false));
                }
                boVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

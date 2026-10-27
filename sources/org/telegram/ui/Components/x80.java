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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((d90) this.b).dismiss();
                break;
            case 1:
                sc0 sc0Var = (sc0) this.b;
                sc0.b(sc0Var.getContext(), sc0Var.a, sc0Var.n, false, sc0Var.x, new xa0(sc0Var, 2), sc0Var.c);
                break;
            case 2:
                ((td0) this.b).onBackPressed();
                break;
            case 3:
                ue0.m((ue0) this.b);
                break;
            case 4:
                eg0 eg0Var = (eg0) this.b;
                eg0Var.getClass();
                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                int intValue = ((Integer) y5Var.getTag()).intValue();
                fg0 fg0Var = eg0Var.d;
                if (intValue == fg0Var.y) {
                    fg0Var.N = y5Var.getCurrentColor();
                } else {
                    fg0Var.O = y5Var.getCurrentColor();
                }
                e00 e00Var = fg0Var.l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                fg0Var.g();
                break;
            case 5:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((mg0) this.b).a.y.url)));
                break;
            case 6:
                dh0 dh0Var = (dh0) this.b;
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null) {
                    ng0 ng0Var = dh0Var.r;
                    if (ng0Var == null) {
                        t81 t81Var = photoViewer.F2;
                        if (t81Var != null) {
                            if (t81Var.y()) {
                                t81Var.B();
                            } else {
                                t81Var.C();
                            }
                        }
                    } else if (ng0Var.G) {
                        ng0Var.f();
                    } else {
                        ng0Var.g();
                    }
                    dh0.p0.z();
                    break;
                }
                break;
            case 7:
                mh0 mh0Var = (mh0) this.b;
                mh0Var.getClass();
                jh0 jh0Var = (jh0) mh0Var;
                kh0 kh0Var = jh0Var.e;
                nh0 nh0Var = (nh0) jh0Var.getTag(R.id.object_tag);
                if (nh0Var.b.size() > 15) {
                    boolean z10 = nh0Var.e;
                    nh0Var.e = !z10;
                    if (!z10) {
                        nh0Var.f = 10;
                    }
                    kh0Var.s.Q(jh0Var);
                    kh0Var.s.c.X(true);
                    break;
                }
                break;
            case 8:
                ((in0) this.b).onBackPressed();
                break;
            case 9:
                do0 do0Var = ((co0) this.b).c;
                pt.n(do0Var.F, do0Var.G);
                break;
            case 10:
                fi.c2 c2Var = ((eo0) this.b).d;
                c2Var.setText("");
                AndroidUtilities.showKeyboard(c2Var);
                break;
            case 11:
                po0 po0Var = (po0) this.b;
                po0Var.getClass();
                new tg.y0(po0Var.b, 24, true).show();
                break;
            case 12:
                ((fp0) this.b).R(false);
                break;
            case 13:
                rr0 rr0Var = ((pr0) this.b).s;
                ArrayList arrayList = rr0Var.s;
                if (!arrayList.isEmpty()) {
                    rr0Var.r = TextUtils.join(" ", arrayList).toString();
                    rr0Var.n = false;
                    rr0Var.d();
                    rr0Var.w = null;
                    if (rr0Var.b != 0) {
                        rr0Var.b = 0;
                        qr0 qr0Var = rr0Var.H;
                        if (qr0Var != null) {
                            ((org.telegram.ui.kv) qr0Var).i(0);
                            break;
                        }
                    }
                }
                break;
            case 14:
                bw0 bw0Var = ((ku0) this.b).f;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var.x1;
                if (r2Var != null && r2Var.getParentLayout() != null) {
                    ((ActionBarLayout) bw0Var.x1.getParentLayout()).r();
                    break;
                }
                break;
            case 15:
                ((np0) this.b).run();
                break;
            case 16:
                ((fy0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 17:
                AndroidUtilities.runOnUIThread((di.k5) this.b, 100L);
                break;
            case 18:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 19:
                x21 x21Var = ((z21) this.b).b;
                x21Var.setText("");
                AndroidUtilities.showKeyboard(x21Var);
                break;
            case 20:
                ((k31) this.b).b.getImageReceiver().startAnimation();
                break;
            case 21:
                ((g51) this.b).dismiss();
                break;
            case 22:
                org.telegram.ui.wn wnVar = ((org.telegram.ui.vk) this.b).y;
                if (wnVar.getUserConfig().isPremium() || ((chat = wnVar.e) != null && chat.autotranslation)) {
                    wnVar.getMessagesController().getTranslateController().toggleTranslatingDialog(wnVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + wnVar.a(), 14).commit();
                    wnVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 13, false));
                }
                wnVar.hd(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

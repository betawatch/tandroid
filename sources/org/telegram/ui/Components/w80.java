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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                ((c90) this.b).dismiss();
                break;
            case 1:
                rc0 rc0Var = (rc0) this.b;
                rc0.b(rc0Var.getContext(), rc0Var.a, rc0Var.n, false, rc0Var.x, new wa0(rc0Var, 2), rc0Var.c);
                break;
            case 2:
                ((sd0) this.b).onBackPressed();
                break;
            case 3:
                te0.m((te0) this.b);
                break;
            case 4:
                dg0 dg0Var = (dg0) this.b;
                dg0Var.getClass();
                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                int intValue = ((Integer) y5Var.getTag()).intValue();
                eg0 eg0Var = dg0Var.d;
                if (intValue == eg0Var.y) {
                    eg0Var.N = y5Var.getCurrentColor();
                } else {
                    eg0Var.O = y5Var.getCurrentColor();
                }
                e00 e00Var = eg0Var.l0;
                if (e00Var != null) {
                    e00Var.d(false, false, false);
                }
                eg0Var.g();
                break;
            case 5:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((lg0) this.b).a.y.url)));
                break;
            case 6:
                ch0 ch0Var = (ch0) this.b;
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null) {
                    mg0 mg0Var = ch0Var.r;
                    if (mg0Var == null) {
                        s81 s81Var = photoViewer.F2;
                        if (s81Var != null) {
                            if (s81Var.y()) {
                                s81Var.B();
                            } else {
                                s81Var.C();
                            }
                        }
                    } else if (mg0Var.G) {
                        mg0Var.f();
                    } else {
                        mg0Var.g();
                    }
                    ch0.p0.z();
                    break;
                }
                break;
            case 7:
                lh0 lh0Var = (lh0) this.b;
                lh0Var.getClass();
                ih0 ih0Var = (ih0) lh0Var;
                jh0 jh0Var = ih0Var.e;
                mh0 mh0Var = (mh0) ih0Var.getTag(R.id.object_tag);
                if (mh0Var.b.size() > 15) {
                    boolean z10 = mh0Var.e;
                    mh0Var.e = !z10;
                    if (!z10) {
                        mh0Var.f = 10;
                    }
                    jh0Var.s.Q(ih0Var);
                    jh0Var.s.c.X(true);
                    break;
                }
                break;
            case 8:
                ((hn0) this.b).onBackPressed();
                break;
            case 9:
                co0 co0Var = ((bo0) this.b).c;
                pt.n(co0Var.F, co0Var.G);
                break;
            case 10:
                fi.c2 c2Var = ((do0) this.b).d;
                c2Var.setText("");
                AndroidUtilities.showKeyboard(c2Var);
                break;
            case 11:
                oo0 oo0Var = (oo0) this.b;
                oo0Var.getClass();
                new tg.y0(oo0Var.b, 24, true).show();
                break;
            case 12:
                ((ep0) this.b).R(false);
                break;
            case 13:
                qr0 qr0Var = ((or0) this.b).s;
                ArrayList arrayList = qr0Var.s;
                if (!arrayList.isEmpty()) {
                    qr0Var.r = TextUtils.join(" ", arrayList).toString();
                    qr0Var.n = false;
                    qr0Var.d();
                    qr0Var.w = null;
                    if (qr0Var.b != 0) {
                        qr0Var.b = 0;
                        pr0 pr0Var = qr0Var.H;
                        if (pr0Var != null) {
                            ((org.telegram.ui.iv) pr0Var).i(0);
                            break;
                        }
                    }
                }
                break;
            case 14:
                aw0 aw0Var = ((ju0) this.b).f;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
                if (r2Var != null && r2Var.getParentLayout() != null) {
                    ((ActionBarLayout) aw0Var.x1.getParentLayout()).r();
                    break;
                }
                break;
            case 15:
                ((mp0) this.b).run();
                break;
            case 16:
                ((ey0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 17:
                AndroidUtilities.runOnUIThread((di.k5) this.b, 100L);
                break;
            case 18:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 19:
                w21 w21Var = ((y21) this.b).b;
                w21Var.setText("");
                AndroidUtilities.showKeyboard(w21Var);
                break;
            case 20:
                ((j31) this.b).b.getImageReceiver().startAnimation();
                break;
            case 21:
                ((f51) this.b).dismiss();
                break;
            case 22:
                org.telegram.ui.un unVar = ((org.telegram.ui.tk) this.b).y;
                if (unVar.getUserConfig().isPremium() || ((chat = unVar.e) != null && chat.autotranslation)) {
                    unVar.getMessagesController().getTranslateController().toggleTranslatingDialog(unVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + unVar.a(), 14).commit();
                    unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 13, false));
                }
                unVar.dd(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

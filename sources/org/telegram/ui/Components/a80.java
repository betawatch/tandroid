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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        switch (this.a) {
            case 0:
                c80 c80Var = (c80) this.b;
                c80Var.b = true;
                c80Var.dismiss();
                break;
            case 1:
                ((i80) this.b).dismiss();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.z) this.b).o(2);
                break;
            case 3:
                bc0 bc0Var = (bc0) this.b;
                bc0.b(bc0Var.getContext(), bc0Var.a, bc0Var.n, false, bc0Var.x, new up(bc0Var, 29), bc0Var.c);
                break;
            case 4:
                ((cd0) this.b).onBackPressed();
                break;
            case 5:
                ee0.m((ee0) this.b);
                break;
            case 6:
                nf0 nf0Var = (nf0) this.b;
                nf0Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                of0 of0Var = nf0Var.d;
                if (intValue == of0Var.y) {
                    of0Var.K = t5Var.getCurrentColor();
                } else {
                    of0Var.L = t5Var.getCurrentColor();
                }
                vz vzVar = of0Var.i0;
                if (vzVar != null) {
                    vzVar.e(false, false, false);
                }
                of0Var.g();
                break;
            case 7:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((vf0) this.b).a.y.url)));
                break;
            case 8:
                mg0 mg0Var = (mg0) this.b;
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null) {
                    wf0 wf0Var = mg0Var.r;
                    if (wf0Var == null) {
                        i71 i71Var = photoViewer.C2;
                        if (i71Var != null) {
                            if (i71Var.y()) {
                                i71Var.B();
                            } else {
                                i71Var.C();
                            }
                        }
                    } else if (wf0Var.D) {
                        wf0Var.f();
                    } else {
                        wf0Var.g();
                    }
                    mg0.m0.z();
                    break;
                }
                break;
            case 9:
                ug0 ug0Var = (ug0) this.b;
                ug0Var.getClass();
                rg0 rg0Var = (rg0) ug0Var;
                sg0 sg0Var = rg0Var.e;
                vg0 vg0Var = (vg0) rg0Var.getTag(R.id.object_tag);
                if (vg0Var.b.size() > 15) {
                    boolean z4 = vg0Var.e;
                    vg0Var.e = !z4;
                    if (!z4) {
                        vg0Var.f = 10;
                    }
                    sg0Var.s.O(rg0Var);
                    sg0Var.s.c.X(true);
                    break;
                }
                break;
            case 10:
                ((hm0) this.b).onBackPressed();
                break;
            case 11:
                cn0 cn0Var = ((bn0) this.b).c;
                at.n(cn0Var.C, cn0Var.D);
                break;
            case 12:
                kg.f fVar = ((dn0) this.b).e;
                fVar.setText("");
                AndroidUtilities.showKeyboard(fVar);
                break;
            case 13:
                nn0 nn0Var = (nn0) this.b;
                nn0Var.getClass();
                new eg.o1(nn0Var.b, 24, true).show();
                break;
            case 14:
                ((co0) this.b).Q(false);
                break;
            case 15:
                qq0 qq0Var = ((oq0) this.b).s;
                ArrayList arrayList = qq0Var.s;
                if (!arrayList.isEmpty()) {
                    qq0Var.r = TextUtils.join(" ", arrayList).toString();
                    qq0Var.n = false;
                    qq0Var.d();
                    qq0Var.w = null;
                    if (qq0Var.b != 0) {
                        qq0Var.b = 0;
                        pq0 pq0Var = qq0Var.E;
                        if (pq0Var != null) {
                            ((org.telegram.ui.uv) pq0Var).g(0);
                            break;
                        }
                    }
                }
                break;
            case 16:
                yu0 yu0Var = ((gt0) this.b).f;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
                if (p2Var != null && p2Var.getParentLayout() != null) {
                    ((ActionBarLayout) yu0Var.s1.getParentLayout()).r();
                    break;
                }
                break;
            case 17:
                ((nq0) this.b).run();
                break;
            case 18:
                ((zw0) this.b).b.getImageReceiver().startAnimation();
                break;
            case 19:
                AndroidUtilities.runOnUIThread((nh.v4) this.b, 100L);
                break;
            case 20:
                ((EditTextBoldCursor) this.b).setText("");
                break;
            case 21:
                q11 q11Var = ((s11) this.b).b;
                q11Var.setText("");
                AndroidUtilities.showKeyboard(q11Var);
                break;
            case 22:
                ((b21) this.b).b.getImageReceiver().startAnimation();
                break;
            case 23:
                ((v31) this.b).dismiss();
                break;
            case 24:
                org.telegram.ui.zn znVar = ((org.telegram.ui.yk) this.b).s;
                if (znVar.getUserConfig().isPremium() || ((chat = znVar.e) != null && chat.autotranslation)) {
                    znVar.getMessagesController().getTranslateController().toggleTranslatingDialog(znVar.a());
                } else {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_show_translate_count" + znVar.a(), 14).commit();
                    znVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 13, false));
                }
                znVar.Qc(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
        }
    }
}

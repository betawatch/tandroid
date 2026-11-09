package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.a;
        final int i11 = 1;
        boolean z9 = false;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                oa0 oa0Var = (oa0) obj;
                oa0.b(oa0Var.getContext(), oa0Var.a, oa0Var.n, false, oa0Var.y, new gp(oa0Var, 27), oa0Var.c);
                break;
            case 1:
                ((nb0) obj).onBackPressed();
                break;
            case 2:
                nc0.I0((nc0) obj);
                break;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                td0 td0Var = (td0) l4Var.e;
                if (intValue == td0Var.D) {
                    td0Var.N = r5Var.getCurrentColor();
                } else {
                    td0Var.O = r5Var.getCurrentColor();
                }
                sy syVar = td0Var.l0;
                if (syVar != null) {
                    syVar.c(false, false, false);
                }
                td0Var.d();
                break;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ae0) obj).a.D.url)));
                break;
            case 5:
                pe0 pe0Var = (pe0) obj;
                pe0Var.getClass();
                me0 me0Var = (me0) pe0Var;
                ne0 ne0Var = me0Var.e;
                qe0 qe0Var = (qe0) me0Var.getTag(R.id.object_tag);
                if (qe0Var.b.size() > 15) {
                    boolean z10 = qe0Var.e;
                    qe0Var.e = !z10;
                    if (!z10) {
                        qe0Var.f = 10;
                    }
                    ne0Var.s.J0(me0Var);
                    ne0Var.s.j1.X(true);
                    break;
                }
                break;
            case 6:
                ((kk0) obj).onBackPressed();
                break;
            case 7:
                el0 el0Var = (el0) ((bi.k5) obj).d;
                Activity activity = el0Var.F;
                org.telegram.ui.ActionBar.f2 f2Var = el0Var.G;
                int i12 = org.telegram.ui.p6.j1;
                if (f2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(i11, activity, z9);
                    p6Var.v0 = false;
                    p6Var.u0 = false;
                    int i13 = org.telegram.ui.ActionBar.l6.d6;
                    p6Var.P(i13);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.i6, p6Var.I0), 1, -1));
                    org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.xj, p6Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(R.drawable.ic_layer_close);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (objArr2) {
                                case 0:
                                    p6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.p6 p6Var2 = p6Var;
                                    p6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(org.telegram.messenger.qs.b5, new Object[0]);
                                    q10.getMessagesStorage().a.c(new org.telegram.messenger.w5(q10, 2));
                                    break;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ha.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    dv0 dv0Var = new dv0(activity, p6Var.a);
                    dv0Var.setStickerNum(9);
                    dv0Var.getImageReceiver().W(1);
                    linearLayout.addView(dv0Var, c8.ha.t(org.telegram.messenger.qs.v1, org.telegram.messenger.qs.v1, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i14 = org.telegram.ui.ActionBar.l6.j5;
                    org.telegram.ui.ActionBar.s6.U(textView, i14, null);
                    jg.g.v(textView, 1, 20.0f, null, 2131751346);
                    linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.s6.U(textView2, i14, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.id.a0("DownloadedFilesMessage", null, 2131751345, new Object[0]));
                    linearLayout.addView(textView2, c8.ha.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.id.M0(2131748697, null));
                    org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.Gi, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i15 = org.telegram.ui.ActionBar.l6.Ci;
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, i15, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i13, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i15);
                    org.telegram.ui.ActionBar.o6 g10 = org.telegram.ui.ActionBar.s6.g(i13, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.s6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ha.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.id.M0(2131752093, null));
                    org.telegram.ui.ActionBar.s6.U(textView4, i15, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i15, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.l6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.o6 g11 = org.telegram.ui.ActionBar.s6.g(i15, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.s6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ha.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.N = nestedScrollView;
                    textView3.setOnClickListener(new lk(8, p6Var, f2Var));
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    p6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.p6 p6Var2 = p6Var;
                                    p6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(p6Var2.a);
                                    q10.H.clear();
                                    q10.getNotificationCenter().k(org.telegram.messenger.qs.b5, new Object[0]);
                                    q10.getMessagesStorage().a.c(new org.telegram.messenger.w5(q10, 2));
                                    break;
                            }
                        }
                    });
                    p6Var.show();
                    break;
                }
                break;
            case 8:
                ah.i iVar = ((fl0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.K3(iVar);
                break;
            case 9:
                rl0 rl0Var = (rl0) obj;
                rl0Var.getClass();
                new ug.w0(rl0Var.b, 24, true).show();
                break;
            case 10:
                ((gm0) obj).R(false);
                break;
            case 11:
                qo0 qo0Var = (qo0) ((fi.i1) obj).w;
                ArrayList arrayList = qo0Var.s;
                if (!arrayList.isEmpty()) {
                    qo0Var.r = TextUtils.join(" ", arrayList).toString();
                    qo0Var.n = false;
                    qo0Var.d();
                    qo0Var.x = null;
                    if (qo0Var.b != 0) {
                        qo0Var.b = 0;
                        po0 po0Var = qo0Var.H;
                        if (po0Var != null) {
                            ((org.telegram.ui.hu) po0Var).i(0);
                            break;
                        }
                    }
                }
                break;
            case 12:
                zs0 zs0Var = ((lr0) obj).f;
                org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var.x1;
                if (f2Var2 != null && f2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) zs0Var.x1.getParentLayout()).r();
                    break;
                }
                break;
            case 13:
                ((kr0) obj).run();
                break;
            case 14:
                ((cv0) obj).b.getImageReceiver().P0(false);
                break;
            case 15:
                org.telegram.messenger.g0.i3((di.d5) obj, 100L);
                break;
            case 16:
                ((EditTextBoldCursor) obj).setText("");
                break;
            case 17:
                uz0 uz0Var = ((wz0) obj).b;
                uz0Var.setText("");
                org.telegram.messenger.g0.K3(uz0Var);
                break;
            case 18:
                ((f01) obj).b.getImageReceiver().P0(false);
                break;
            case 19:
                ((l21) obj).dismiss();
                break;
            case 20:
                org.telegram.ui.cn cnVar = ((org.telegram.ui.dk) obj).D;
                if (cnVar.getUserConfig().q() || ((chat = cnVar.e) != null && chat.autotranslation)) {
                    cnVar.getMessagesController().s7.K(cnVar.a(), !r2.B(r5));
                } else {
                    i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    org.telegram.messenger.qp.s1(i7).d7.edit().putInt("dialog_show_translate_count" + cnVar.a(), 14).commit();
                    cnVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar, 13, false));
                }
                cnVar.yd(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
        }
    }
}

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
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ db0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i10;
        int i11 = this.a;
        final int i12 = 1;
        boolean z10 = false;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (i11) {
            case 0:
                gb0 gb0Var = (gb0) obj;
                gb0.b(gb0Var.getContext(), gb0Var.a, gb0Var.n, false, gb0Var.y, new eb0(gb0Var, 0), gb0Var.c);
                break;
            case 1:
                ((fc0) obj).onBackPressed();
                break;
            case 2:
                hd0.I0((hd0) obj);
                break;
            case 3:
                fg.j jVar = (fg.j) obj;
                jVar.getClass();
                org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) view;
                int intValue = ((Integer) w5Var.getTag()).intValue();
                oe0 oe0Var = (oe0) jVar.e;
                if (intValue == oe0Var.D) {
                    oe0Var.N = w5Var.getCurrentColor();
                } else {
                    oe0Var.O = w5Var.getCurrentColor();
                }
                gz gzVar = oe0Var.l0;
                if (gzVar != null) {
                    gzVar.c(false, false, false);
                }
                oe0Var.f();
                break;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ue0) obj).a.D.url)));
                break;
            case 5:
                jf0 jf0Var = (jf0) obj;
                PhotoViewer photoViewer = jf0Var.V;
                if (photoViewer != null) {
                    ve0 ve0Var = jf0Var.r;
                    if (ve0Var == null) {
                        u61 u61Var = photoViewer.F2;
                        if (u61Var != null) {
                            if (u61Var.d0()) {
                                u61Var.g0();
                            } else {
                                u61Var.h0();
                            }
                        }
                    } else if (ve0Var.G) {
                        ve0Var.f();
                    } else {
                        ve0Var.g();
                    }
                    jf0.p0.z();
                    break;
                }
                break;
            case 6:
                rf0 rf0Var = (rf0) obj;
                rf0Var.getClass();
                of0 of0Var = (of0) rf0Var;
                pf0 pf0Var = of0Var.e;
                sf0 sf0Var = (sf0) of0Var.getTag(R.id.object_tag);
                if (sf0Var.b.size() > 15) {
                    boolean z11 = sf0Var.e;
                    sf0Var.e = !z11;
                    if (!z11) {
                        sf0Var.f = 10;
                    }
                    pf0Var.s.J0(of0Var);
                    pf0Var.s.j1.X(true);
                    break;
                }
                break;
            case 7:
                ((nl0) obj).onBackPressed();
                break;
            case 8:
                gm0 gm0Var = (gm0) ((kg.f) obj).d;
                Activity activity = gm0Var.F;
                org.telegram.ui.ActionBar.k2 k2Var = gm0Var.G;
                int i13 = org.telegram.ui.p6.j1;
                if (k2Var != null && activity != null) {
                    final org.telegram.ui.p6 p6Var = new org.telegram.ui.p6(i12, activity, z10);
                    p6Var.v0 = false;
                    p6Var.u0 = false;
                    int i14 = org.telegram.ui.ActionBar.t6.d6;
                    p6Var.Q(i14);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var.I0), 1, -1));
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.xj, p6Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(R.drawable.ic_layer_close);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.rs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (objArr2) {
                                case 0:
                                    p6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.p6 p6Var2 = p6Var;
                                    p6Var2.dismiss();
                                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(p6Var2.a);
                                    q6.H.clear();
                                    q6.getNotificationCenter().k(org.telegram.messenger.zs.b5, new Object[0]);
                                    q6.getMessagesStorage().a.c(new org.telegram.messenger.y5(q6, 2));
                                    break;
                            }
                        }
                    });
                    int L = org.telegram.messenger.i0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, w7.b6.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    ew0 ew0Var = new ew0(activity, p6Var.a);
                    ew0Var.setStickerNum(9);
                    ew0Var.getImageReceiver().W(1);
                    linearLayout.addView(ew0Var, w7.b6.t(org.telegram.messenger.zs.v1, org.telegram.messenger.zs.v1, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i15 = org.telegram.ui.ActionBar.t6.j5;
                    org.telegram.ui.ActionBar.a7.V(textView, i15, null);
                    sc.e.u(textView, 1, 20.0f, null, 2131751347);
                    linearLayout.addView(textView, w7.b6.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView2, i15, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.cd.a0("DownloadedFilesMessage", null, 2131751346, new Object[0]));
                    linearLayout.addView(textView2, w7.b6.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.i0.o());
                    textView3.setText(org.telegram.messenger.cd.L0(2131748712, null));
                    org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Gi, null);
                    int L2 = org.telegram.messenger.i0.L(8.0f);
                    int i16 = org.telegram.ui.ActionBar.t6.Ci;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                    int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, x02, o10, o10);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i16);
                    org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i14, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.a7.k(textView3, k02, N, h, null);
                    linearLayout.addView(textView3, w7.b6.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.i0.o());
                    textView4.setText(org.telegram.messenger.cd.L0(2131752093, null));
                    org.telegram.ui.ActionBar.a7.V(textView4, i16, null);
                    int L3 = org.telegram.messenger.i0.L(8.0f);
                    int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i16, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, 0, o11, o11);
                    org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i16, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.a7.k(textView4, k03, null, h10, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, w7.b6.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p6Var.N = nestedScrollView;
                    textView3.setOnClickListener(new sr(i12, p6Var, k2Var));
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.rs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i12) {
                                case 0:
                                    p6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.p6 p6Var2 = p6Var;
                                    p6Var2.dismiss();
                                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(p6Var2.a);
                                    q6.H.clear();
                                    q6.getNotificationCenter().k(org.telegram.messenger.zs.b5, new Object[0]);
                                    q6.getMessagesStorage().a.c(new org.telegram.messenger.y5(q6, 2));
                                    break;
                            }
                        }
                    });
                    p6Var.show();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.n0 n0Var = ((hm0) obj).d;
                n0Var.setText("");
                org.telegram.messenger.i0.J3(n0Var);
                break;
            case 10:
                rm0 rm0Var = (rm0) obj;
                rm0Var.getClass();
                new kg.i1(rm0Var.b, 24, true).show();
                break;
            case 11:
                ((gn0) obj).R(false);
                break;
            case 12:
                sp0 sp0Var = (sp0) ((qp0) obj).w;
                ArrayList arrayList = sp0Var.s;
                if (!arrayList.isEmpty()) {
                    sp0Var.r = TextUtils.join(" ", arrayList).toString();
                    sp0Var.n = false;
                    sp0Var.d();
                    sp0Var.x = null;
                    if (sp0Var.b != 0) {
                        sp0Var.b = 0;
                        rp0 rp0Var = sp0Var.H;
                        if (rp0Var != null) {
                            ((org.telegram.ui.iv) rp0Var).i(0);
                            break;
                        }
                    }
                }
                break;
            case 13:
                zt0 zt0Var = ((js0) obj).f;
                org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var.x1;
                if (k2Var2 != null && k2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) zt0Var.x1.getParentLayout()).r();
                    break;
                }
                break;
            case 14:
                ((uo0) obj).run();
                break;
            case 15:
                ((dw0) obj).b.getImageReceiver().P0(false);
                break;
            case 16:
                org.telegram.messenger.i0.h3((th.r3) obj, 100L);
                break;
            case 17:
                ((EditTextBoldCursor) obj).setText("");
                break;
            case 18:
                x01 x01Var = ((z01) obj).b;
                x01Var.setText("");
                org.telegram.messenger.i0.J3(x01Var);
                break;
            case 19:
                ((j11) obj).b.getImageReceiver().P0(false);
                break;
            case 20:
                ((m31) obj).dismiss();
                break;
            case 21:
                org.telegram.ui.un unVar = ((org.telegram.ui.xk) obj).D;
                if (unVar.getUserConfig().q() || ((chat = unVar.e) != null && chat.autotranslation)) {
                    unVar.getMessagesController().t7.K(unVar.a(), !r2.B(r5));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    org.telegram.messenger.vp.r1(i10).e7.edit().putInt("dialog_show_translate_count" + unVar.a(), 14).commit();
                    unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 13, false));
                }
                unVar.ld(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
        }
    }
}

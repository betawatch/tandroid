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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h70(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i7;
        int i10 = this.a;
        boolean z10 = false;
        Object[] objArr = 0;
        final int i11 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                j70 j70Var = (j70) obj;
                j70Var.m1 = true;
                j70Var.dismiss();
                break;
            case 1:
                ((p70) obj).dismiss();
                break;
            case 2:
                ya0 ya0Var = (ya0) obj;
                ya0.b(ya0Var.getContext(), ya0Var.a, ya0Var.n, false, ya0Var.y, new mo(ya0Var, 29), ya0Var.c);
                break;
            case 3:
                ((yb0) obj).onBackPressed();
                break;
            case 4:
                xc0.J0((xc0) obj);
                break;
            case 5:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj;
                l4Var.getClass();
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                int intValue = ((Integer) t5Var.getTag()).intValue();
                de0 de0Var = (de0) l4Var.e;
                if (intValue == de0Var.E) {
                    de0Var.O = t5Var.getCurrentColor();
                } else {
                    de0Var.P = t5Var.getCurrentColor();
                }
                cz czVar = de0Var.m0;
                if (czVar != null) {
                    czVar.c(false, false, false);
                }
                de0Var.d();
                break;
            case 6:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((je0) obj).a.E.url)));
                break;
            case 7:
                bf0 bf0Var = (bf0) obj;
                bf0Var.getClass();
                ye0 ye0Var = (ye0) bf0Var;
                ze0 ze0Var = ye0Var.e;
                cf0 cf0Var = (cf0) ye0Var.getTag(R.id.object_tag);
                if (cf0Var.b.size() > 15) {
                    boolean z11 = cf0Var.e;
                    cf0Var.e = !z11;
                    if (!z11) {
                        cf0Var.f = 10;
                    }
                    ze0Var.s.K0(ye0Var);
                    ze0Var.s.n1.X(true);
                    break;
                }
                break;
            case 8:
                ((wk0) obj).onBackPressed();
                break;
            case 9:
                ql0 ql0Var = (ql0) ((di.l4) obj).d;
                Activity activity = ql0Var.G;
                org.telegram.ui.ActionBar.h2 h2Var = ql0Var.H;
                int i12 = org.telegram.ui.o6.n1;
                if (h2Var != null && activity != null) {
                    final org.telegram.ui.o6 o6Var = new org.telegram.ui.o6(i11, activity, z10);
                    o6Var.w0 = false;
                    o6Var.v0 = false;
                    int i13 = org.telegram.ui.ActionBar.n6.d6;
                    o6Var.Q(i13);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, o6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Aj, o6Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(R.drawable.ic_layer_close);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ts
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (objArr2) {
                                case 0:
                                    o6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.o6 o6Var2 = o6Var;
                                    o6Var2.dismiss();
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(o6Var2.a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(org.telegram.messenger.ks.e5, new Object[0]);
                                    q10.getMessagesStorage().a.c(new org.telegram.messenger.x5(q10, 2));
                                    break;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, c8.ma.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    lv0 lv0Var = new lv0(activity, o6Var.a);
                    lv0Var.setStickerNum(9);
                    lv0Var.getImageReceiver().W(1);
                    linearLayout.addView(lv0Var, c8.ma.t(org.telegram.messenger.ks.v1, org.telegram.messenger.ks.v1, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i14 = org.telegram.ui.ActionBar.n6.j5;
                    org.telegram.ui.ActionBar.u6.U(textView, i14, null);
                    i5.c.r(20.0f, 1, 2131751335, textView, null);
                    linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.gd.a0("DownloadedFilesMessage", null, 2131751334, new Object[0]));
                    linearLayout.addView(textView2, c8.ma.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.gd.M0(2131748505, null));
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i15 = org.telegram.ui.ActionBar.n6.Fi;
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, i15, false);
                    int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i13, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, x02, o4, o4);
                    org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
                    org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i13, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.u6.j(textView3, k02, M, g10, null);
                    linearLayout.addView(textView3, c8.ma.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.gd.M0(2131752082, null));
                    org.telegram.ui.ActionBar.u6.U(textView4, i15, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i15, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L3, L3, L3, L3, 0, o10, o10);
                    org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i15, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.u6.j(textView4, k03, null, g11, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, c8.ma.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    o6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new y7(11, o6Var, h2Var));
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ts
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    o6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.o6 o6Var2 = o6Var;
                                    o6Var2.dismiss();
                                    org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(o6Var2.a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(org.telegram.messenger.ks.e5, new Object[0]);
                                    q10.getMessagesStorage().a.c(new org.telegram.messenger.x5(q10, 2));
                                    break;
                            }
                        }
                    });
                    o6Var.show();
                    break;
                }
                break;
            case 10:
                ah.i iVar = ((rl0) obj).d;
                iVar.setText("");
                org.telegram.messenger.g0.I3(iVar);
                break;
            case 11:
                cm0 cm0Var = (cm0) obj;
                cm0Var.getClass();
                new ug.z0(cm0Var.b, 24, true).show();
                break;
            case 12:
                ((rm0) obj).N(false);
                break;
            case 13:
                cp0 cp0Var = (cp0) ((hi.k1) obj).w;
                ArrayList arrayList = cp0Var.s;
                if (!arrayList.isEmpty()) {
                    cp0Var.r = TextUtils.join(" ", arrayList).toString();
                    cp0Var.n = false;
                    cp0Var.d();
                    cp0Var.x = null;
                    if (cp0Var.b != 0) {
                        cp0Var.b = 0;
                        bp0 bp0Var = cp0Var.I;
                        if (bp0Var != null) {
                            ((org.telegram.ui.ju) bp0Var).g(0);
                            break;
                        }
                    }
                }
                break;
            case 14:
                gt0 gt0Var = ((sr0) obj).f;
                org.telegram.ui.ActionBar.h2 h2Var2 = gt0Var.y1;
                if (h2Var2 != null && h2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) gt0Var.y1.getParentLayout()).r();
                    break;
                }
                break;
            case 15:
                ((ap0) obj).run();
                break;
            case 16:
                ((kv0) obj).b.getImageReceiver().P0(false);
                break;
            case 17:
                org.telegram.messenger.g0.h3((fi.s4) obj, 100L);
                break;
            case 18:
                c01 c01Var = ((e01) obj).b;
                c01Var.setText("");
                org.telegram.messenger.g0.I3(c01Var);
                break;
            case 19:
                ((o01) obj).b.getImageReceiver().P0(false);
                break;
            case 20:
                ((y21) obj).dismiss();
                break;
            case 21:
                org.telegram.ui.bn bnVar = ((org.telegram.ui.ck) obj).E;
                if (bnVar.getUserConfig().q() || ((chat = bnVar.e) != null && chat.autotranslation)) {
                    bnVar.getMessagesController().v7.K(bnVar.a(), !r2.B(r3));
                } else {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    org.telegram.messenger.mp.u1(i7).g7.edit().putInt("dialog_show_translate_count" + bnVar.a(), 14).commit();
                    bnVar.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) bnVar, 13, false));
                }
                bnVar.zd(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
        }
    }
}

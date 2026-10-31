package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ kw0(cx0 cx0Var, int i10) {
        this.a = i10;
        this.b = cx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.i5 i5Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 6;
        int i13 = 4;
        cx0 cx0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = cx0Var.C1;
                if (k2Var != null) {
                    new kg.i1(k2Var, 11, false).show();
                    break;
                } else if (cx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) cx0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(cx0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = cx0Var.J1;
                boolean z10 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = cx0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && cx0Var.p1 == null) {
                    cx0Var.o1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131744869, null));
                    cx0Var.o1.e(4, R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131751265, null));
                    if (z10) {
                        cx0Var.p1 = cx0Var.o1.e(5, R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, cx0Var.getContext(), cx0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.cd.L0(2131753756, null), false, cx0Var.I0).setOnClickListener(new kw0(cx0Var, i13));
                        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131744879, null), false, cx0Var.I0);
                        int i14 = org.telegram.ui.ActionBar.t6.q7;
                        cx0Var.W(i14);
                        c10.c(i14, i14);
                        c10.h(0.1f, i14);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131744872, null), false, cx0Var.I0).setOnClickListener(new kw0(cx0Var, i12));
                        c10.setOnClickListener(new kw0(cx0Var, 7));
                        cx0Var.p1 = cx0Var.o1.h(R.drawable.msg_delete, null, org.telegram.messenger.cd.L0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    cx0Var.o1.a(-1);
                    da0 da0Var = new da0(cx0Var.a, 4, cx0Var.getContext(), new ArrayList(), cx0Var.I0);
                    da0Var.setOnClickListener(new kw0(cx0Var, 8));
                    da0Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.t0 t0Var = cx0Var.o1;
                    t0Var.p();
                    t0Var.b.a(da0Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, cx0Var.I0);
                    cx0Var.p1.d(w02, w02);
                    cx0Var.p1.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
                    if (cx0Var.p1.getRightIcon() != null) {
                        cx0Var.p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (cx0Var.o1.getPopupLayout() != null) {
                    cx0Var.o1.getPopupLayout().requestLayout();
                }
                cx0Var.o1.U(null, null);
                break;
            case 2:
                cx0Var.O0();
                break;
            case 3:
                if (cx0Var.P1 != null) {
                    cx0Var.S0(cx0Var.L1);
                    cx0Var.O0();
                    cx0Var.L1 = null;
                    break;
                } else {
                    cx0Var.S1.a(cx0Var.K1, null, cx0Var.J1, null, cx0Var.Z1, true, 0, 0);
                    cx0Var.dismiss();
                    break;
                }
            case 4:
                cx0Var.o1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.f60 f60Var = cx0Var.U1;
                org.telegram.ui.k60 k60Var = f60Var.c;
                s4.a0 a0Var = k60Var.h;
                boolean z11 = k60Var.N;
                int L0 = a0Var.L0();
                ck0 ck0Var = (ck0) k60Var.d.K(L0);
                int top = ck0Var != null ? ck0Var.a.getTop() : Integer.MAX_VALUE;
                int i15 = k60Var.n;
                if (f60Var.a) {
                    k60Var.r = null;
                    k60Var.s = true;
                } else {
                    k60Var.r = f60Var.b;
                    k60Var.s = false;
                }
                if (z11) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.zy(f60Var, 10), 350L);
                }
                k60Var.l0();
                k60Var.j0(k60Var.r, true);
                if (i15 != -1) {
                    if (!k60Var.M) {
                        for (int i16 = 0; i16 < k60Var.d.getChildCount(); i16++) {
                            View childAt = k60Var.d.getChildAt(i16);
                            if (k60Var.d.T(childAt).b() == k60Var.E + i15) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    k60Var.e.g(i15);
                }
                if (k60Var.n != -1) {
                    if (!k60Var.M) {
                        for (int i17 = 0; i17 < k60Var.d.getChildCount(); i17++) {
                            View childAt2 = k60Var.d.getChildAt(i17);
                            if (k60Var.d.T(childAt2).b() == k60Var.E + k60Var.n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    k60Var.e.g(k60Var.n);
                }
                if (top != Integer.MAX_VALUE && !z11) {
                    k60Var.h.h1(L0 + 1, top);
                }
                if (k60Var.M) {
                    k60Var.L.P("", false);
                    i5Var = ((org.telegram.ui.ActionBar.k2) k60Var).simpleActionBar;
                    i5Var.j(true);
                }
                cx0Var.dismiss();
                break;
            case 6:
                cx0Var.o1.o();
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.a).f2(cx0Var.getContext(), cx0Var.J1, 1, cx0Var.C1, true, true);
                break;
            case 7:
                cx0Var.o1.o();
                hx0.b(cx0Var.J1.set, cx0Var.I0, cx0Var.getContext(), new mw0(cx0Var, i13));
                break;
            case 8:
                cx0Var.o1.o();
                cx0Var.dismiss();
                org.telegram.messenger.i0.h3(new mw0(cx0Var, i11), 200L);
                break;
            case 9:
                cx0Var.dismiss();
                ax0 ax0Var = cx0Var.T1;
                if (ax0Var != null) {
                    ax0Var.a();
                }
                if (cx0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(cx0Var.a).T.f(cx0Var.M1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = cx0Var.M1;
                        ConnectionsManager.getInstance(cx0Var.a).sendRequest(tL_messages_installStickerSet, new x1(cx0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (cx0Var.I1) {
                    cx0Var.L0();
                    break;
                } else {
                    cx0Var.N0();
                    break;
                }
            case 11:
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.a).f2(cx0Var.getContext(), cx0Var.J1, 1, cx0Var.C1, true, cx0Var.a2);
                break;
            case 12:
                cx0Var.dismiss();
                org.telegram.messenger.ui.b0(cx0Var.a).f2(cx0Var.getContext(), cx0Var.J1, 0, cx0Var.C1, true, cx0Var.a2);
                break;
            case 13:
                cx0 cx0Var2 = this.b;
                Context context = cx0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String L02 = org.telegram.messenger.cd.L0(2131749248, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L02;
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748267, null), new au(27));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.t5, cx0Var2.I0);
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                frameLayout.addView(g10, w7.b6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.a7.G(editTextBoldCursor, org.telegram.ui.ActionBar.t6.u5, org.telegram.ui.ActionBar.t6.v5, org.telegram.ui.ActionBar.t6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.j5, cx0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, cx0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new pw0(cx0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.b6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new pt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749247, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(6.0f));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q5, cx0Var2.I0);
                linearLayout.addView(textView, w7.b6.o(-1, -2));
                x1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                x1Var.show();
                editTextBoldCursor.requestFocus();
                x1Var.d(-1).setOnClickListener(new mg.f(cx0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                break;
            default:
                cx0Var.dismiss();
                break;
        }
    }
}

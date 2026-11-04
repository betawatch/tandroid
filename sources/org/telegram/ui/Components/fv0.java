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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ fv0(xv0 xv0Var, int i3) {
        this.a = i3;
        this.b = xv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.y4 y4Var;
        int i3 = this.a;
        int i10 = 3;
        int i11 = 6;
        int i12 = 4;
        xv0 xv0Var = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = xv0Var.D1;
                if (d2Var != null) {
                    new vg.v0(d2Var, 11, false).show();
                    break;
                } else if (xv0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xv0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(xv0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = xv0Var.K1;
                boolean z10 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && xv0Var.q1 == null) {
                    xv0Var.p1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131744861, null));
                    xv0Var.p1.e(4, R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131751265, null));
                    if (z10) {
                        xv0Var.q1 = xv0Var.p1.e(5, R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, xv0Var.getContext(), xv0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.bd.M0(2131753756, null), false, xv0Var.J0).setOnClickListener(new fv0(xv0Var, i12));
                        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131744871, null), false, xv0Var.J0);
                        int i13 = org.telegram.ui.ActionBar.k6.q7;
                        xv0Var.V(i13);
                        c2.c(i13, i13);
                        c2.h(0.1f, i13);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131744864, null), false, xv0Var.J0).setOnClickListener(new fv0(xv0Var, i11));
                        c2.setOnClickListener(new fv0(xv0Var, 7));
                        xv0Var.q1 = xv0Var.p1.h(R.drawable.msg_delete, null, org.telegram.messenger.bd.M0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    xv0Var.p1.a(-1);
                    h90 h90Var = new h90(xv0Var.a, 4, xv0Var.getContext(), new ArrayList(), xv0Var.J0);
                    h90Var.setOnClickListener(new fv0(xv0Var, 8));
                    h90Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = xv0Var.p1;
                    q0Var.p();
                    q0Var.b.a(h90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, xv0Var.J0);
                    xv0Var.q1.d(w02, w02);
                    xv0Var.q1.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
                    if (xv0Var.q1.getRightIcon() != null) {
                        xv0Var.q1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (xv0Var.p1.getPopupLayout() != null) {
                    xv0Var.p1.getPopupLayout().requestLayout();
                }
                xv0Var.p1.U(null, null);
                break;
            case 2:
                xv0Var.O0();
                break;
            case 3:
                if (xv0Var.Q1 != null) {
                    xv0Var.S0(xv0Var.M1);
                    xv0Var.O0();
                    xv0Var.M1 = null;
                    break;
                } else {
                    xv0Var.T1.a(xv0Var.L1, null, xv0Var.K1, null, xv0Var.a2, true, 0, 0);
                    xv0Var.dismiss();
                    break;
                }
            case 4:
                xv0Var.p1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.b50 b50Var = xv0Var.V1;
                org.telegram.ui.g50 g50Var = b50Var.c;
                u4.b0 b0Var = g50Var.h;
                boolean z11 = g50Var.O;
                int L0 = b0Var.L0();
                bj0 bj0Var = (bj0) g50Var.d.K(L0);
                int top = bj0Var != null ? bj0Var.a.getTop() : Integer.MAX_VALUE;
                int i14 = g50Var.n;
                if (b50Var.a) {
                    g50Var.r = null;
                    g50Var.s = true;
                } else {
                    g50Var.r = b50Var.b;
                    g50Var.s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.fz(b50Var, 9), 350L);
                }
                g50Var.m0();
                g50Var.k0(g50Var.r, true);
                if (i14 != -1) {
                    if (!g50Var.N) {
                        for (int i15 = 0; i15 < g50Var.d.getChildCount(); i15++) {
                            View childAt = g50Var.d.getChildAt(i15);
                            if (g50Var.d.T(childAt).b() == g50Var.F + i14) {
                                ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                            }
                        }
                    }
                    g50Var.e.g(i14);
                }
                if (g50Var.n != -1) {
                    if (!g50Var.N) {
                        for (int i16 = 0; i16 < g50Var.d.getChildCount(); i16++) {
                            View childAt2 = g50Var.d.getChildAt(i16);
                            if (g50Var.d.T(childAt2).b() == g50Var.F + g50Var.n) {
                                ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                            }
                        }
                    }
                    g50Var.e.g(g50Var.n);
                }
                if (top != Integer.MAX_VALUE && !z11) {
                    g50Var.h.h1(L0 + 1, top);
                }
                if (g50Var.N) {
                    g50Var.M.P("", false);
                    y4Var = ((org.telegram.ui.ActionBar.d2) g50Var).simpleActionBar;
                    y4Var.j(true);
                }
                xv0Var.dismiss();
                break;
            case 6:
                xv0Var.p1.o();
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.a).f2(xv0Var.getContext(), xv0Var.K1, 1, xv0Var.D1, true, true);
                break;
            case 7:
                xv0Var.p1.o();
                cw0.b(xv0Var.K1.set, xv0Var.J0, xv0Var.getContext(), new hv0(xv0Var, i12));
                break;
            case 8:
                xv0Var.p1.o();
                xv0Var.dismiss();
                org.telegram.messenger.g0.i3(new hv0(xv0Var, i10), 200L);
                break;
            case 9:
                xv0Var.dismiss();
                vv0 vv0Var = xv0Var.U1;
                if (vv0Var != null) {
                    vv0Var.a();
                }
                if (xv0Var.N1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.li.b0(xv0Var.a).U.f(xv0Var.N1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = xv0Var.N1;
                        ConnectionsManager.getInstance(xv0Var.a).sendRequest(tL_messages_installStickerSet, new w1(xv0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (xv0Var.J1) {
                    xv0Var.L0();
                    break;
                } else {
                    xv0Var.N0();
                    break;
                }
            case 11:
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.a).f2(xv0Var.getContext(), xv0Var.K1, 1, xv0Var.D1, true, xv0Var.b2);
                break;
            case 12:
                xv0Var.dismiss();
                org.telegram.messenger.li.b0(xv0Var.a).f2(xv0Var.getContext(), xv0Var.K1, 0, xv0Var.D1, true, xv0Var.b2);
                break;
            case 13:
                xv0 xv0Var2 = this.b;
                Context context = xv0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.bd.M0(2131749247, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748258, null), new lf0(11));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, b8.mf.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g7 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.t5, xv0Var2.J0);
                g7.setMaxLines(1);
                g7.setLines(1);
                g7.setText("t.me/addstickers/");
                g7.setInputType(16385);
                g7.setGravity(51);
                g7.setSingleLine(true);
                g7.setVisibility(4);
                g7.setImeOptions(6);
                g7.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(g7, b8.mf.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.j5, xv0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, xv0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new kv0(xv0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, b8.mf.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new s0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new at(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749246, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q5, xv0Var2.J0);
                linearLayout.addView(textView, b8.mf.o(-1, -2));
                s1Var.setOnShowListener(new e2(editTextBoldCursor, 2));
                s1Var.show();
                editTextBoldCursor.requestFocus();
                s1Var.d(-1).setOnClickListener(new m1(xv0Var2, iArr, editTextBoldCursor, textView, g7, alertDialog$Builder, 3));
                break;
            default:
                xv0Var.dismiss();
                break;
        }
    }
}

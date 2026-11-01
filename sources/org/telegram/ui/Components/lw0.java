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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ lw0(dx0 dx0Var, int i10) {
        this.a = i10;
        this.b = dx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.i5 i5Var;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 6;
        int i13 = 4;
        dx0 dx0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = dx0Var.C1;
                if (k2Var != null) {
                    new kg.i1(k2Var, 11, false).show();
                    break;
                } else if (dx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) dx0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(dx0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = dx0Var.J1;
                boolean z10 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = dx0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && dx0Var.p1 == null) {
                    dx0Var.o1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131744869, null));
                    dx0Var.o1.e(4, R.drawable.msg_edit, org.telegram.messenger.dd.L0(2131751265, null));
                    if (z10) {
                        dx0Var.p1 = dx0Var.o1.e(5, R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, dx0Var.getContext(), dx0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.dd.L0(2131753756, null), false, dx0Var.I0).setOnClickListener(new lw0(dx0Var, i13));
                        org.telegram.ui.ActionBar.b1 c10 = org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131744879, null), false, dx0Var.I0);
                        int i14 = org.telegram.ui.ActionBar.t6.q7;
                        dx0Var.W(i14);
                        c10.c(i14, i14);
                        c10.h(0.1f, i14);
                        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.dd.L0(2131744872, null), false, dx0Var.I0).setOnClickListener(new lw0(dx0Var, i12));
                        c10.setOnClickListener(new lw0(dx0Var, 7));
                        dx0Var.p1 = dx0Var.o1.h(R.drawable.msg_delete, null, org.telegram.messenger.dd.L0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    dx0Var.o1.a(-1);
                    da0 da0Var = new da0(dx0Var.a, 4, dx0Var.getContext(), new ArrayList(), dx0Var.I0);
                    da0Var.setOnClickListener(new lw0(dx0Var, 8));
                    da0Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.t0 t0Var = dx0Var.o1;
                    t0Var.p();
                    t0Var.b.a(da0Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, dx0Var.I0);
                    dx0Var.p1.d(w02, w02);
                    dx0Var.p1.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
                    if (dx0Var.p1.getRightIcon() != null) {
                        dx0Var.p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (dx0Var.o1.getPopupLayout() != null) {
                    dx0Var.o1.getPopupLayout().requestLayout();
                }
                dx0Var.o1.U(null, null);
                break;
            case 2:
                dx0Var.O0();
                break;
            case 3:
                if (dx0Var.P1 != null) {
                    dx0Var.S0(dx0Var.L1);
                    dx0Var.O0();
                    dx0Var.L1 = null;
                    break;
                } else {
                    dx0Var.S1.a(dx0Var.K1, null, dx0Var.J1, null, dx0Var.Z1, true, 0, 0);
                    dx0Var.dismiss();
                    break;
                }
            case 4:
                dx0Var.o1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.e60 e60Var = dx0Var.U1;
                org.telegram.ui.j60 j60Var = e60Var.c;
                s4.a0 a0Var = j60Var.h;
                boolean z11 = j60Var.N;
                int L0 = a0Var.L0();
                dk0 dk0Var = (dk0) j60Var.d.K(L0);
                int top = dk0Var != null ? dk0Var.a.getTop() : Integer.MAX_VALUE;
                int i15 = j60Var.n;
                if (e60Var.a) {
                    j60Var.r = null;
                    j60Var.s = true;
                } else {
                    j60Var.r = e60Var.b;
                    j60Var.s = false;
                }
                if (z11) {
                    org.telegram.messenger.i0.h3(new org.telegram.ui.yy(e60Var, 10), 350L);
                }
                j60Var.m0();
                j60Var.k0(j60Var.r, true);
                if (i15 != -1) {
                    if (!j60Var.M) {
                        for (int i16 = 0; i16 < j60Var.d.getChildCount(); i16++) {
                            View childAt = j60Var.d.getChildAt(i16);
                            if (j60Var.d.T(childAt).b() == j60Var.E + i15) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    j60Var.e.g(i15);
                }
                if (j60Var.n != -1) {
                    if (!j60Var.M) {
                        for (int i17 = 0; i17 < j60Var.d.getChildCount(); i17++) {
                            View childAt2 = j60Var.d.getChildAt(i17);
                            if (j60Var.d.T(childAt2).b() == j60Var.E + j60Var.n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    j60Var.e.g(j60Var.n);
                }
                if (top != Integer.MAX_VALUE && !z11) {
                    j60Var.h.h1(L0 + 1, top);
                }
                if (j60Var.M) {
                    j60Var.L.P("", false);
                    i5Var = ((org.telegram.ui.ActionBar.k2) j60Var).simpleActionBar;
                    i5Var.j(true);
                }
                dx0Var.dismiss();
                break;
            case 6:
                dx0Var.o1.o();
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.a).f2(dx0Var.getContext(), dx0Var.J1, 1, dx0Var.C1, true, true);
                break;
            case 7:
                dx0Var.o1.o();
                ix0.b(dx0Var.J1.set, dx0Var.I0, dx0Var.getContext(), new nw0(dx0Var, i13));
                break;
            case 8:
                dx0Var.o1.o();
                dx0Var.dismiss();
                org.telegram.messenger.i0.h3(new nw0(dx0Var, i11), 200L);
                break;
            case 9:
                dx0Var.dismiss();
                bx0 bx0Var = dx0Var.T1;
                if (bx0Var != null) {
                    bx0Var.a();
                }
                if (dx0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.vi.b0(dx0Var.a).T.f(dx0Var.M1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = dx0Var.M1;
                        ConnectionsManager.getInstance(dx0Var.a).sendRequest(tL_messages_installStickerSet, new x1(dx0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (dx0Var.I1) {
                    dx0Var.L0();
                    break;
                } else {
                    dx0Var.N0();
                    break;
                }
            case 11:
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.a).f2(dx0Var.getContext(), dx0Var.J1, 1, dx0Var.C1, true, dx0Var.a2);
                break;
            case 12:
                dx0Var.dismiss();
                org.telegram.messenger.vi.b0(dx0Var.a).f2(dx0Var.getContext(), dx0Var.J1, 0, dx0Var.C1, true, dx0Var.a2);
                break;
            case 13:
                dx0 dx0Var2 = this.b;
                Context context = dx0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String L02 = org.telegram.messenger.dd.L0(2131749248, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L02;
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131748267, null), new au(27));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, w7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.t5, dx0Var2.I0);
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
                org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, org.telegram.ui.ActionBar.t6.j5, dx0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, dx0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new qw0(dx0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.b6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new pt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749247, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(6.0f));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q5, dx0Var2.I0);
                linearLayout.addView(textView, w7.b6.o(-1, -2));
                x1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                x1Var.show();
                editTextBoldCursor.requestFocus();
                x1Var.d(-1).setOnClickListener(new mg.f(dx0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                break;
            default:
                dx0Var.dismiss();
                break;
        }
    }
}

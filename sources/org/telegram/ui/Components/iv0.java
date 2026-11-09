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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zv0 b;

    public /* synthetic */ iv0(zv0 zv0Var, int i7) {
        this.a = i7;
        this.b = zv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.y4 y4Var;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 6;
        int i12 = 10;
        int i13 = 4;
        zv0 zv0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = zv0Var.C1;
                if (f2Var != null) {
                    new ug.w0(f2Var, 11, false).show();
                    break;
                } else if (zv0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) zv0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(zv0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = zv0Var.J1;
                boolean z9 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = zv0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && zv0Var.p1 == null) {
                    zv0Var.o1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131744851, null));
                    zv0Var.o1.e(4, R.drawable.msg_edit, org.telegram.messenger.id.M0(2131751264, null));
                    if (z9) {
                        zv0Var.p1 = zv0Var.o1.e(5, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, zv0Var.getContext(), zv0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.id.M0(2131753756, null), false, zv0Var.I0).setOnClickListener(new iv0(zv0Var, i13));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131744861, null), false, zv0Var.I0);
                        int i14 = org.telegram.ui.ActionBar.l6.q7;
                        zv0Var.V(i14);
                        c10.c(i14, i14);
                        c10.h(0.1f, i14);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131744854, null), false, zv0Var.I0).setOnClickListener(new iv0(zv0Var, i11));
                        c10.setOnClickListener(new iv0(zv0Var, 7));
                        zv0Var.p1 = zv0Var.o1.h(R.drawable.msg_delete, null, org.telegram.messenger.id.M0(2131751598, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    zv0Var.o1.a(-1);
                    m90 m90Var = new m90(zv0Var.a, 4, zv0Var.getContext(), new ArrayList(), zv0Var.I0);
                    m90Var.setOnClickListener(new iv0(zv0Var, 8));
                    m90Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.r0 r0Var = zv0Var.o1;
                    r0Var.p();
                    r0Var.b.a(m90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q7, zv0Var.I0);
                    zv0Var.p1.d(w02, w02);
                    zv0Var.p1.setSelectorColor(org.telegram.ui.ActionBar.l6.r1(0.1f, w02));
                    if (zv0Var.p1.getRightIcon() != null) {
                        zv0Var.p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (zv0Var.o1.getPopupLayout() != null) {
                    zv0Var.o1.getPopupLayout().requestLayout();
                }
                zv0Var.o1.U(null, null);
                break;
            case 2:
                zv0Var.O0();
                break;
            case 3:
                if (zv0Var.P1 != null) {
                    zv0Var.S0(zv0Var.L1);
                    zv0Var.O0();
                    zv0Var.L1 = null;
                    break;
                } else {
                    zv0Var.S1.a(zv0Var.K1, null, zv0Var.J1, null, zv0Var.Z1, true, 0, 0);
                    zv0Var.dismiss();
                    break;
                }
            case 4:
                zv0Var.o1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.i50 i50Var = zv0Var.U1;
                org.telegram.ui.o50 o50Var = i50Var.c;
                v4.b0 b0Var = o50Var.h;
                boolean z10 = o50Var.N;
                int L0 = b0Var.L0();
                yi0 yi0Var = (yi0) o50Var.d.K(L0);
                int top = yi0Var != null ? yi0Var.a.getTop() : Integer.MAX_VALUE;
                int i15 = o50Var.n;
                if (i50Var.a) {
                    o50Var.r = null;
                    o50Var.s = true;
                } else {
                    o50Var.r = i50Var.b;
                    o50Var.s = false;
                }
                if (z10) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.jz(i50Var, i12), 350L);
                }
                o50Var.m0();
                o50Var.k0(o50Var.r, true);
                if (i15 != -1) {
                    if (!o50Var.M) {
                        for (int i16 = 0; i16 < o50Var.d.getChildCount(); i16++) {
                            View childAt = o50Var.d.getChildAt(i16);
                            if (o50Var.d.T(childAt).b() == o50Var.E + i15) {
                                ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                            }
                        }
                    }
                    o50Var.e.g(i15);
                }
                if (o50Var.n != -1) {
                    if (!o50Var.M) {
                        for (int i17 = 0; i17 < o50Var.d.getChildCount(); i17++) {
                            View childAt2 = o50Var.d.getChildAt(i17);
                            if (o50Var.d.T(childAt2).b() == o50Var.E + o50Var.n) {
                                ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                            }
                        }
                    }
                    o50Var.e.g(o50Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    o50Var.h.h1(L0 + 1, top);
                }
                if (o50Var.M) {
                    o50Var.L.P("", false);
                    y4Var = ((org.telegram.ui.ActionBar.f2) o50Var).simpleActionBar;
                    y4Var.k(true);
                }
                zv0Var.dismiss();
                break;
            case 6:
                zv0Var.o1.o();
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.a).f2(zv0Var.getContext(), zv0Var.J1, 1, zv0Var.C1, true, true);
                break;
            case 7:
                zv0Var.o1.o();
                ew0.b(zv0Var.J1.set, zv0Var.I0, zv0Var.getContext(), new kv0(zv0Var, i13));
                break;
            case 8:
                zv0Var.o1.o();
                zv0Var.dismiss();
                org.telegram.messenger.g0.i3(new kv0(zv0Var, i10), 200L);
                break;
            case 9:
                zv0Var.dismiss();
                xv0 xv0Var = zv0Var.T1;
                if (xv0Var != null) {
                    xv0Var.a();
                }
                if (zv0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(zv0Var.a).T.f(zv0Var.M1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = zv0Var.M1;
                        ConnectionsManager.getInstance(zv0Var.a).sendRequest(tL_messages_installStickerSet, new x1(zv0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (zv0Var.I1) {
                    zv0Var.L0();
                    break;
                } else {
                    zv0Var.N0();
                    break;
                }
            case 11:
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.a).f2(zv0Var.getContext(), zv0Var.J1, 1, zv0Var.C1, true, zv0Var.a2);
                break;
            case 12:
                zv0Var.dismiss();
                org.telegram.messenger.ui.b0(zv0Var.a).f2(zv0Var.getContext(), zv0Var.J1, 0, zv0Var.C1, true, zv0Var.a2);
                break;
            case 13:
                zv0 zv0Var2 = this.b;
                Context context = zv0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.id.M0(2131749239, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131748250, null), new jl0(i12));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.t5, zv0Var2.I0);
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(g10, c8.ha.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.s6.F(editTextBoldCursor, org.telegram.ui.ActionBar.l6.u5, org.telegram.ui.ActionBar.l6.v5, org.telegram.ui.ActionBar.l6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, org.telegram.ui.ActionBar.l6.j5, zv0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.l6.G6, zv0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new mv0(zv0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ha.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new ct(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749238, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q5, zv0Var2.I0);
                linearLayout.addView(textView, c8.ha.o(-1, -2));
                u1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                u1Var.show();
                editTextBoldCursor.requestFocus();
                u1Var.d(-1).setOnClickListener(new n1(zv0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                zv0Var.dismiss();
                break;
        }
    }
}

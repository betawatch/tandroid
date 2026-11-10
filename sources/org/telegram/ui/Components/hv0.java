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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ hv0(yv0 yv0Var, int i7) {
        this.a = i7;
        this.b = yv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 6;
        int i12 = 10;
        int i13 = 4;
        yv0 yv0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = yv0Var.F1;
                if (f2Var != null) {
                    new ug.w0(f2Var, 11, false).show();
                    break;
                } else if (yv0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) yv0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(yv0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yv0Var.M1;
                boolean z9 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yv0Var.M1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && yv0Var.s1 == null) {
                    yv0Var.r1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131744851, null));
                    yv0Var.r1.e(4, R.drawable.msg_edit, org.telegram.messenger.id.M0(2131751264, null));
                    if (z9) {
                        yv0Var.s1 = yv0Var.r1.e(5, R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, yv0Var.getContext(), yv0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.id.M0(2131753756, null), false, yv0Var.I0).setOnClickListener(new hv0(yv0Var, i13));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131744861, null), false, yv0Var.I0);
                        int i14 = org.telegram.ui.ActionBar.m6.q7;
                        yv0Var.V(i14);
                        c10.c(i14, i14);
                        c10.h(0.1f, i14);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131744854, null), false, yv0Var.I0).setOnClickListener(new hv0(yv0Var, i11));
                        c10.setOnClickListener(new hv0(yv0Var, 7));
                        yv0Var.s1 = yv0Var.r1.h(R.drawable.msg_delete, null, org.telegram.messenger.id.M0(2131751598, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    yv0Var.r1.a(-1);
                    l90 l90Var = new l90(yv0Var.a, 4, yv0Var.getContext(), new ArrayList(), yv0Var.I0);
                    l90Var.setOnClickListener(new hv0(yv0Var, 8));
                    l90Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.r0 r0Var = yv0Var.r1;
                    r0Var.p();
                    r0Var.b.a(l90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, yv0Var.I0);
                    yv0Var.s1.d(w02, w02);
                    yv0Var.s1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
                    if (yv0Var.s1.getRightIcon() != null) {
                        yv0Var.s1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (yv0Var.r1.getPopupLayout() != null) {
                    yv0Var.r1.getPopupLayout().requestLayout();
                }
                yv0Var.r1.U(null, null);
                break;
            case 2:
                yv0Var.O0();
                break;
            case 3:
                if (yv0Var.S1 != null) {
                    yv0Var.S0(yv0Var.O1);
                    yv0Var.O0();
                    yv0Var.O1 = null;
                    break;
                } else {
                    yv0Var.V1.a(yv0Var.N1, null, yv0Var.M1, null, yv0Var.c2, true, 0, 0);
                    yv0Var.dismiss();
                    break;
                }
            case 4:
                yv0Var.r1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.j50 j50Var = yv0Var.X1;
                org.telegram.ui.p50 p50Var = j50Var.c;
                v4.b0 b0Var = p50Var.h;
                boolean z10 = p50Var.N;
                int L0 = b0Var.L0();
                xi0 xi0Var = (xi0) p50Var.d.K(L0);
                int top = xi0Var != null ? xi0Var.a.getTop() : Integer.MAX_VALUE;
                int i15 = p50Var.n;
                if (j50Var.a) {
                    p50Var.r = null;
                    p50Var.s = true;
                } else {
                    p50Var.r = j50Var.b;
                    p50Var.s = false;
                }
                if (z10) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.kz(j50Var, i12), 350L);
                }
                p50Var.m0();
                p50Var.k0(p50Var.r, true);
                if (i15 != -1) {
                    if (!p50Var.M) {
                        for (int i16 = 0; i16 < p50Var.d.getChildCount(); i16++) {
                            View childAt = p50Var.d.getChildAt(i16);
                            if (p50Var.d.T(childAt).b() == p50Var.E + i15) {
                                ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                            }
                        }
                    }
                    p50Var.e.g(i15);
                }
                if (p50Var.n != -1) {
                    if (!p50Var.M) {
                        for (int i17 = 0; i17 < p50Var.d.getChildCount(); i17++) {
                            View childAt2 = p50Var.d.getChildAt(i17);
                            if (p50Var.d.T(childAt2).b() == p50Var.E + p50Var.n) {
                                ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                            }
                        }
                    }
                    p50Var.e.g(p50Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    p50Var.h.h1(L0 + 1, top);
                }
                if (p50Var.M) {
                    p50Var.L.P("", false);
                    z4Var = ((org.telegram.ui.ActionBar.f2) p50Var).simpleActionBar;
                    z4Var.l(true);
                }
                yv0Var.dismiss();
                break;
            case 6:
                yv0Var.r1.o();
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.M1, 1, yv0Var.F1, true, true);
                break;
            case 7:
                yv0Var.r1.o();
                dw0.b(yv0Var.M1.set, yv0Var.I0, yv0Var.getContext(), new jv0(yv0Var, i13));
                break;
            case 8:
                yv0Var.r1.o();
                yv0Var.dismiss();
                org.telegram.messenger.g0.i3(new jv0(yv0Var, i10), 200L);
                break;
            case 9:
                yv0Var.dismiss();
                wv0 wv0Var = yv0Var.W1;
                if (wv0Var != null) {
                    wv0Var.a();
                }
                if (yv0Var.P1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(yv0Var.a).T.f(yv0Var.P1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = yv0Var.P1;
                        ConnectionsManager.getInstance(yv0Var.a).sendRequest(tL_messages_installStickerSet, new w1(yv0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (yv0Var.L1) {
                    yv0Var.L0();
                    break;
                } else {
                    yv0Var.N0();
                    break;
                }
            case 11:
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.M1, 1, yv0Var.F1, true, yv0Var.d2);
                break;
            case 12:
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.M1, 0, yv0Var.F1, true, yv0Var.d2);
                break;
            case 13:
                yv0 yv0Var2 = this.b;
                Context context = yv0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.id.M0(2131749239, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131748250, null), new il0(i12));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(g10, org.telegram.ui.ActionBar.m6.t5, yv0Var2.I0);
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
                org.telegram.ui.ActionBar.t6.F(editTextBoldCursor, org.telegram.ui.ActionBar.m6.u5, org.telegram.ui.ActionBar.m6.v5, org.telegram.ui.ActionBar.m6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.j5, yv0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, yv0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new lv0(yv0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ha.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new s0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new bt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749238, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q5, yv0Var2.I0);
                linearLayout.addView(textView, c8.ha.o(-1, -2));
                u1Var.setOnShowListener(new f2(editTextBoldCursor, 2));
                u1Var.show();
                editTextBoldCursor.requestFocus();
                u1Var.d(-1).setOnClickListener(new m1(yv0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                yv0Var.dismiss();
                break;
        }
    }
}

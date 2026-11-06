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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ gv0(yv0 yv0Var, int i7) {
        this.a = i7;
        this.b = yv0Var;
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
        yv0 yv0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = yv0Var.C1;
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
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = yv0Var.J1;
                boolean z9 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = yv0Var.J1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && yv0Var.p1 == null) {
                    yv0Var.o1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744852, null));
                    yv0Var.o1.e(4, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751265, null));
                    if (z9) {
                        yv0Var.p1 = yv0Var.o1.e(5, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751599, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, yv0Var.getContext(), yv0Var.I0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.hd.M0(2131753756, null), false, yv0Var.I0).setOnClickListener(new gv0(yv0Var, i13));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131744862, null), false, yv0Var.I0);
                        int i14 = org.telegram.ui.ActionBar.k6.q7;
                        yv0Var.V(i14);
                        c10.c(i14, i14);
                        c10.h(0.1f, i14);
                        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131744855, null), false, yv0Var.I0).setOnClickListener(new gv0(yv0Var, i11));
                        c10.setOnClickListener(new gv0(yv0Var, 7));
                        yv0Var.p1 = yv0Var.o1.h(R.drawable.msg_delete, null, org.telegram.messenger.hd.M0(2131751599, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    yv0Var.o1.a(-1);
                    l90 l90Var = new l90(yv0Var.a, 4, yv0Var.getContext(), new ArrayList(), yv0Var.I0);
                    l90Var.setOnClickListener(new gv0(yv0Var, 8));
                    l90Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.r0 r0Var = yv0Var.o1;
                    r0Var.p();
                    r0Var.b.a(l90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, yv0Var.I0);
                    yv0Var.p1.d(w02, w02);
                    yv0Var.p1.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
                    if (yv0Var.p1.getRightIcon() != null) {
                        yv0Var.p1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (yv0Var.o1.getPopupLayout() != null) {
                    yv0Var.o1.getPopupLayout().requestLayout();
                }
                yv0Var.o1.U(null, null);
                break;
            case 2:
                yv0Var.O0();
                break;
            case 3:
                if (yv0Var.P1 != null) {
                    yv0Var.S0(yv0Var.L1);
                    yv0Var.O0();
                    yv0Var.L1 = null;
                    break;
                } else {
                    yv0Var.S1.a(yv0Var.K1, null, yv0Var.J1, null, yv0Var.Z1, true, 0, 0);
                    yv0Var.dismiss();
                    break;
                }
            case 4:
                yv0Var.o1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.g50 g50Var = yv0Var.U1;
                org.telegram.ui.m50 m50Var = g50Var.c;
                v4.b0 b0Var = m50Var.h;
                boolean z10 = m50Var.N;
                int L0 = b0Var.L0();
                xi0 xi0Var = (xi0) m50Var.d.K(L0);
                int top = xi0Var != null ? xi0Var.a.getTop() : Integer.MAX_VALUE;
                int i15 = m50Var.n;
                if (g50Var.a) {
                    m50Var.r = null;
                    m50Var.s = true;
                } else {
                    m50Var.r = g50Var.b;
                    m50Var.s = false;
                }
                if (z10) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.hz(g50Var, i12), 350L);
                }
                m50Var.m0();
                m50Var.k0(m50Var.r, true);
                if (i15 != -1) {
                    if (!m50Var.M) {
                        for (int i16 = 0; i16 < m50Var.d.getChildCount(); i16++) {
                            View childAt = m50Var.d.getChildAt(i16);
                            if (m50Var.d.T(childAt).b() == m50Var.E + i15) {
                                ((org.telegram.ui.Cells.g8) childAt).b(false, true);
                            }
                        }
                    }
                    m50Var.e.g(i15);
                }
                if (m50Var.n != -1) {
                    if (!m50Var.M) {
                        for (int i17 = 0; i17 < m50Var.d.getChildCount(); i17++) {
                            View childAt2 = m50Var.d.getChildAt(i17);
                            if (m50Var.d.T(childAt2).b() == m50Var.E + m50Var.n) {
                                ((org.telegram.ui.Cells.g8) childAt2).b(true, true);
                            }
                        }
                    }
                    m50Var.e.g(m50Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    m50Var.h.h1(L0 + 1, top);
                }
                if (m50Var.M) {
                    m50Var.L.P("", false);
                    y4Var = ((org.telegram.ui.ActionBar.f2) m50Var).simpleActionBar;
                    y4Var.j(true);
                }
                yv0Var.dismiss();
                break;
            case 6:
                yv0Var.o1.o();
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.J1, 1, yv0Var.C1, true, true);
                break;
            case 7:
                yv0Var.o1.o();
                dw0.b(yv0Var.J1.set, yv0Var.I0, yv0Var.getContext(), new iv0(yv0Var, i13));
                break;
            case 8:
                yv0Var.o1.o();
                yv0Var.dismiss();
                org.telegram.messenger.g0.i3(new iv0(yv0Var, i10), 200L);
                break;
            case 9:
                yv0Var.dismiss();
                wv0 wv0Var = yv0Var.T1;
                if (wv0Var != null) {
                    wv0Var.a();
                }
                if (yv0Var.M1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(yv0Var.a).T.f(yv0Var.M1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = yv0Var.M1;
                        ConnectionsManager.getInstance(yv0Var.a).sendRequest(tL_messages_installStickerSet, new x1(yv0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (yv0Var.I1) {
                    yv0Var.L0();
                    break;
                } else {
                    yv0Var.N0();
                    break;
                }
            case 11:
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.J1, 1, yv0Var.C1, true, yv0Var.a2);
                break;
            case 12:
                yv0Var.dismiss();
                org.telegram.messenger.ui.b0(yv0Var.a).f2(yv0Var.getContext(), yv0Var.J1, 0, yv0Var.C1, true, yv0Var.a2);
                break;
            case 13:
                yv0 yv0Var2 = this.b;
                Context context = yv0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.hd.M0(2131749238, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748249, null), new il0(i12));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ha.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.t5, yv0Var2.I0);
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
                org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.j5, yv0Var2.I0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, yv0Var2.I0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new lv0(yv0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ha.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new t0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new bt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749237, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q5, yv0Var2.I0);
                linearLayout.addView(textView, c8.ha.o(-1, -2));
                u1Var.setOnShowListener(new g2(editTextBoldCursor, 2));
                u1Var.show();
                editTextBoldCursor.requestFocus();
                u1Var.d(-1).setOnClickListener(new n1(yv0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                yv0Var.dismiss();
                break;
        }
    }
}

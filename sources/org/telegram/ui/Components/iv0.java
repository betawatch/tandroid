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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ iv0(bw0 bw0Var, int i7) {
        this.a = i7;
        this.b = bw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.w4 w4Var;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 6;
        int i12 = 4;
        bw0 bw0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = bw0Var.G1;
                if (e2Var != null) {
                    new ug.x0(e2Var, 11, false).show();
                    break;
                } else if (bw0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) bw0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(bw0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bw0Var.N1;
                boolean z10 = tL_messages_stickerSet == null || !b02.B0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = bw0Var.N1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && bw0Var.t1 == null) {
                    bw0Var.s1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131744851, null));
                    bw0Var.s1.e(4, R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751264, null));
                    if (z10) {
                        bw0Var.t1 = bw0Var.s1.e(5, R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, bw0Var.getContext(), bw0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.hd.M0(2131753756, null), false, bw0Var.J0).setOnClickListener(new iv0(bw0Var, i12));
                        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131744861, null), false, bw0Var.J0);
                        int i13 = org.telegram.ui.ActionBar.j6.q7;
                        bw0Var.W(i13);
                        c10.c(i13, i13);
                        c10.h(0.1f, i13);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131744854, null), false, bw0Var.J0).setOnClickListener(new iv0(bw0Var, i11));
                        c10.setOnClickListener(new iv0(bw0Var, 7));
                        bw0Var.t1 = bw0Var.s1.i(R.drawable.msg_delete, null, org.telegram.messenger.hd.M0(2131751598, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    bw0Var.s1.a(-1);
                    o90 o90Var = new o90(bw0Var.a, 4, bw0Var.getContext(), new ArrayList(), bw0Var.J0);
                    o90Var.setOnClickListener(new iv0(bw0Var, 8));
                    o90Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = bw0Var.s1;
                    q0Var.q();
                    q0Var.b.a(o90Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.q7, bw0Var.J0);
                    bw0Var.t1.d(w02, w02);
                    bw0Var.t1.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
                    if (bw0Var.t1.getRightIcon() != null) {
                        bw0Var.t1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (bw0Var.s1.getPopupLayout() != null) {
                    bw0Var.s1.getPopupLayout().requestLayout();
                }
                bw0Var.s1.V(null, null);
                break;
            case 2:
                bw0Var.O0();
                break;
            case 3:
                if (bw0Var.T1 != null) {
                    bw0Var.S0(bw0Var.P1);
                    bw0Var.O0();
                    bw0Var.P1 = null;
                    break;
                } else {
                    bw0Var.W1.d(bw0Var.O1, null, bw0Var.N1, null, bw0Var.d2, true, 0, 0);
                    bw0Var.dismiss();
                    break;
                }
            case 4:
                bw0Var.s1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.f50 f50Var = bw0Var.Y1;
                org.telegram.ui.l50 l50Var = f50Var.c;
                v4.b0 b0Var = l50Var.h;
                boolean z11 = l50Var.O;
                int L0 = b0Var.L0();
                cj0 cj0Var = (cj0) l50Var.d.K(L0);
                int top = cj0Var != null ? cj0Var.a.getTop() : Integer.MAX_VALUE;
                int i14 = l50Var.n;
                if (f50Var.a) {
                    l50Var.r = null;
                    l50Var.s = true;
                } else {
                    l50Var.r = f50Var.b;
                    l50Var.s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.iz(f50Var, 10), 350L);
                }
                l50Var.m0();
                l50Var.k0(l50Var.r, true);
                if (i14 != -1) {
                    if (!l50Var.N) {
                        for (int i15 = 0; i15 < l50Var.d.getChildCount(); i15++) {
                            View childAt = l50Var.d.getChildAt(i15);
                            if (l50Var.d.T(childAt).b() == l50Var.F + i14) {
                                ((org.telegram.ui.Cells.f8) childAt).b(false, true);
                            }
                        }
                    }
                    l50Var.e.g(i14);
                }
                if (l50Var.n != -1) {
                    if (!l50Var.N) {
                        for (int i16 = 0; i16 < l50Var.d.getChildCount(); i16++) {
                            View childAt2 = l50Var.d.getChildAt(i16);
                            if (l50Var.d.T(childAt2).b() == l50Var.F + l50Var.n) {
                                ((org.telegram.ui.Cells.f8) childAt2).b(true, true);
                            }
                        }
                    }
                    l50Var.e.g(l50Var.n);
                }
                if (top != Integer.MAX_VALUE && !z11) {
                    l50Var.h.h1(L0 + 1, top);
                }
                if (l50Var.N) {
                    l50Var.M.Q("", false);
                    w4Var = ((org.telegram.ui.ActionBar.e2) l50Var).simpleActionBar;
                    w4Var.m(true);
                }
                bw0Var.dismiss();
                break;
            case 6:
                bw0Var.s1.p();
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.a).f2(bw0Var.getContext(), bw0Var.N1, 1, bw0Var.G1, true, true);
                break;
            case 7:
                bw0Var.s1.p();
                gw0.b(bw0Var.N1.set, bw0Var.J0, bw0Var.getContext(), new kv0(bw0Var, i12));
                break;
            case 8:
                bw0Var.s1.p();
                bw0Var.dismiss();
                org.telegram.messenger.g0.i3(new kv0(bw0Var, i10), 200L);
                break;
            case 9:
                bw0Var.dismiss();
                zv0 zv0Var = bw0Var.X1;
                if (zv0Var != null) {
                    zv0Var.a();
                }
                if (bw0Var.Q1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.si.b0(bw0Var.a).U.f(bw0Var.Q1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = bw0Var.Q1;
                        ConnectionsManager.getInstance(bw0Var.a).sendRequest(tL_messages_installStickerSet, new v1(bw0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (bw0Var.M1) {
                    bw0Var.L0();
                    break;
                } else {
                    bw0Var.N0();
                    break;
                }
            case 11:
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.a).f2(bw0Var.getContext(), bw0Var.N1, 1, bw0Var.G1, true, bw0Var.e2);
                break;
            case 12:
                bw0Var.dismiss();
                org.telegram.messenger.si.b0(bw0Var.a).f2(bw0Var.getContext(), bw0Var.N1, 0, bw0Var.G1, true, bw0Var.e2);
                break;
            case 13:
                bw0 bw0Var2 = this.b;
                Context context = bw0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String M0 = org.telegram.messenger.hd.M0(2131749239, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748250, null), new rb0(16));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ja.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.t5, bw0Var2.J0);
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(g10, c8.ja.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.q6.F(editTextBoldCursor, org.telegram.ui.ActionBar.j6.u5, org.telegram.ui.ActionBar.j6.v5, org.telegram.ui.ActionBar.j6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, org.telegram.ui.ActionBar.j6.j5, bw0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.G6, bw0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new nv0(bw0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ja.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new q0(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new jt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749238, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q5, bw0Var2.J0);
                linearLayout.addView(textView, c8.ja.o(-1, -2));
                t1Var.setOnShowListener(new f2(editTextBoldCursor, 2));
                t1Var.show();
                editTextBoldCursor.requestFocus();
                t1Var.d(-1).setOnClickListener(new l1(bw0Var2, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                bw0Var.dismiss();
                break;
        }
    }
}

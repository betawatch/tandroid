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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw0 b;

    public /* synthetic */ tv0(kw0 kw0Var, int i7) {
        this.a = i7;
        this.b = kw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.z4 z4Var;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 6;
        int i12 = 4;
        kw0 kw0Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = kw0Var.G1;
                if (g2Var != null) {
                    new ug.y0(g2Var, 11, false).show();
                    break;
                } else if (kw0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) kw0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(kw0Var.a);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = kw0Var.N1;
                boolean z10 = tL_messages_stickerSet == null || !d02.E0(tL_messages_stickerSet.set.id, true);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kw0Var.N1;
                if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && kw0Var.t1 == null) {
                    kw0Var.s1.e(3, R.drawable.tabs_reorder, org.telegram.messenger.gd.N0(2131744610, null));
                    kw0Var.s1.e(4, R.drawable.msg_edit, org.telegram.messenger.gd.N0(2131751252, null));
                    if (z10) {
                        kw0Var.t1 = kw0Var.s1.e(5, R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131751586, null));
                    } else {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, kw0Var.getContext(), kw0Var.J0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, org.telegram.messenger.gd.N0(2131753753, null), false, kw0Var.J0).setOnClickListener(new tv0(kw0Var, i12));
                        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131744620, null), false, kw0Var.J0);
                        int i13 = org.telegram.ui.ActionBar.m6.q7;
                        kw0Var.W(i13);
                        c10.c(i13, i13);
                        c10.h(0.1f, i13);
                        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131744613, null), false, kw0Var.J0).setOnClickListener(new tv0(kw0Var, i11));
                        c10.setOnClickListener(new tv0(kw0Var, 7));
                        kw0Var.t1 = kw0Var.s1.i(R.drawable.msg_delete, null, org.telegram.messenger.gd.N0(2131751586, null), actionBarPopupWindow$ActionBarPopupWindowLayout);
                    }
                    kw0Var.s1.a(-1);
                    aa0 aa0Var = new aa0(kw0Var.a, 4, kw0Var.getContext(), new ArrayList(), kw0Var.J0);
                    aa0Var.setOnClickListener(new tv0(kw0Var, 8));
                    aa0Var.setTag(R.id.fit_width_tag, 1);
                    org.telegram.ui.ActionBar.q0 q0Var = kw0Var.s1;
                    q0Var.q();
                    q0Var.b.a(aa0Var, new LinearLayout.LayoutParams(-1, -2));
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, kw0Var.J0);
                    kw0Var.t1.d(w02, w02);
                    kw0Var.t1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
                    if (kw0Var.t1.getRightIcon() != null) {
                        kw0Var.t1.getRightIcon().setColorFilter(w02);
                    }
                }
                if (kw0Var.s1.getPopupLayout() != null) {
                    kw0Var.s1.getPopupLayout().requestLayout();
                }
                kw0Var.s1.V(null, null);
                break;
            case 2:
                kw0Var.P0();
                break;
            case 3:
                if (kw0Var.T1 != null) {
                    kw0Var.T0(kw0Var.P1);
                    kw0Var.P0();
                    kw0Var.P1 = null;
                    break;
                } else {
                    kw0Var.W1.d(kw0Var.O1, null, kw0Var.N1, null, kw0Var.d2, true, 0, 0);
                    kw0Var.dismiss();
                    break;
                }
            case 4:
                kw0Var.s1.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                org.telegram.ui.i50 i50Var = kw0Var.Y1;
                org.telegram.ui.n50 n50Var = i50Var.c;
                v4.c0 c0Var = n50Var.h;
                boolean z11 = n50Var.O;
                int L0 = c0Var.L0();
                mj0 mj0Var = (mj0) n50Var.d.K(L0);
                int top = mj0Var != null ? mj0Var.a.getTop() : Integer.MAX_VALUE;
                int i14 = n50Var.n;
                if (i50Var.a) {
                    n50Var.r = null;
                    n50Var.s = true;
                } else {
                    n50Var.r = i50Var.b;
                    n50Var.s = false;
                }
                if (z11) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.lz(i50Var, 10), 350L);
                }
                n50Var.m0();
                n50Var.k0(n50Var.r, true);
                if (i14 != -1) {
                    if (!n50Var.N) {
                        for (int i15 = 0; i15 < n50Var.d.getChildCount(); i15++) {
                            View childAt = n50Var.d.getChildAt(i15);
                            if (n50Var.d.T(childAt).b() == n50Var.F + i14) {
                                ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                            }
                        }
                    }
                    n50Var.e.g(i14);
                }
                if (n50Var.n != -1) {
                    if (!n50Var.N) {
                        for (int i16 = 0; i16 < n50Var.d.getChildCount(); i16++) {
                            View childAt2 = n50Var.d.getChildAt(i16);
                            if (n50Var.d.T(childAt2).b() == n50Var.F + n50Var.n) {
                                ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                            }
                        }
                    }
                    n50Var.e.g(n50Var.n);
                }
                if (top != Integer.MAX_VALUE && !z11) {
                    n50Var.h.h1(L0 + 1, top);
                }
                if (n50Var.N) {
                    n50Var.M.Q("", false);
                    z4Var = ((org.telegram.ui.ActionBar.g2) n50Var).simpleActionBar;
                    z4Var.o(true);
                }
                kw0Var.dismiss();
                break;
            case 6:
                kw0Var.s1.p();
                kw0Var.dismiss();
                org.telegram.messenger.ri.d0(kw0Var.a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, true, true);
                break;
            case 7:
                kw0Var.s1.p();
                pw0.b(kw0Var.N1.set, kw0Var.J0, kw0Var.getContext(), new vv0(kw0Var, i12));
                break;
            case 8:
                kw0Var.s1.p();
                kw0Var.dismiss();
                org.telegram.messenger.g0.h3(new vv0(kw0Var, i10), 200L);
                break;
            case 9:
                kw0Var.dismiss();
                iw0 iw0Var = kw0Var.X1;
                if (iw0Var != null) {
                    iw0Var.a();
                }
                if (kw0Var.Q1 != null) {
                    Runnable runnable = (Runnable) org.telegram.messenger.ri.d0(kw0Var.a).U.f(kw0Var.Q1.id);
                    if (runnable != null) {
                        runnable.run();
                        break;
                    } else {
                        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                        tL_messages_installStickerSet.stickerset = kw0Var.Q1;
                        ConnectionsManager.getInstance(kw0Var.a).sendRequest(tL_messages_installStickerSet, new f2(kw0Var, 12));
                        break;
                    }
                }
                break;
            case 10:
                if (kw0Var.M1) {
                    kw0Var.M0();
                    break;
                } else {
                    kw0Var.O0();
                    break;
                }
            case 11:
                kw0Var.dismiss();
                org.telegram.messenger.ri.d0(kw0Var.a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, true, kw0Var.e2);
                break;
            case 12:
                kw0Var.dismiss();
                org.telegram.messenger.ri.d0(kw0Var.a).k2(kw0Var.getContext(), kw0Var.N1, 0, kw0Var.G1, true, kw0Var.e2);
                break;
            case 13:
                kw0 kw0Var2 = this.b;
                Context context = kw0Var2.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String N0 = org.telegram.messenger.gd.N0(2131749046, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = N0;
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748057, null), new xb0(17));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.o(linearLayout);
                linearLayout.addView(frameLayout, c8.ma.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.t5, kw0Var2.J0);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setText("t.me/addstickers/");
                textView2.setInputType(16385);
                textView2.setGravity(51);
                textView2.setSingleLine(true);
                textView2.setVisibility(4);
                textView2.setImeOptions(6);
                textView2.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                frameLayout.addView(textView2, c8.ma.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                org.telegram.ui.ActionBar.t6.F(editTextBoldCursor, org.telegram.ui.ActionBar.m6.u5, org.telegram.ui.ActionBar.m6.v5, org.telegram.ui.ActionBar.m6.q7, null);
                editTextBoldCursor.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.j5, kw0Var2.J0);
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.G6, kw0Var2.J0);
                editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new xv0(kw0Var2, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, c8.ma.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new h(alertDialog$Builder, 9));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new qt(editTextBoldCursor));
                textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131749045, null)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(6.0f));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q5, kw0Var2.J0);
                linearLayout.addView(textView, c8.ma.o(-1, -2));
                t1Var.setOnShowListener(new p2(editTextBoldCursor, 2));
                t1Var.show();
                editTextBoldCursor.requestFocus();
                t1Var.d(-1).setOnClickListener(new w1(kw0Var2, iArr, editTextBoldCursor, textView, textView2, alertDialog$Builder, 3));
                break;
            default:
                kw0Var.dismiss();
                break;
        }
    }
}

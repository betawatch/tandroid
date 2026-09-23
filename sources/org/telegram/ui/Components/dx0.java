package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ux0 b;

    public /* synthetic */ dx0(ux0 ux0Var, int i10) {
        this.a = i10;
        this.b = ux0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ux0 ux0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = ux0Var.L;
                if (n2Var != null) {
                    new rg.x0(n2Var, 11, false).show();
                    break;
                } else if (ux0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ux0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                ux0.H(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                ux0 ux0Var2 = this.b;
                if (ux0Var2.Y != null) {
                    ux0Var2.u0(ux0Var2.U);
                    ux0Var2.q0();
                    ux0Var2.U = null;
                    break;
                } else {
                    ux0Var2.b0.d(ux0Var2.T, null, ux0Var2.S, null, ux0Var2.i0, true, 0, 0);
                    ux0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                ux0 ux0Var3 = this.b;
                org.telegram.ui.l70 l70Var = ux0Var3.d0;
                org.telegram.ui.q70 q70Var = l70Var.c;
                s4.c0 c0Var = q70Var.h;
                boolean z10 = q70Var.N;
                int L0 = c0Var.L0();
                wk0 wk0Var = (wk0) q70Var.d.K(L0);
                int top = wk0Var != null ? wk0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = q70Var.n;
                if (l70Var.a) {
                    q70Var.r = null;
                    q70Var.s = true;
                } else {
                    q70Var.r = l70Var.b;
                    q70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.d10(l70Var, 9), 350L);
                }
                q70Var.h0();
                q70Var.f0(q70Var.r, true);
                if (i10 != -1) {
                    if (!q70Var.M) {
                        for (int i11 = 0; i11 < q70Var.d.getChildCount(); i11++) {
                            View childAt = q70Var.d.getChildAt(i11);
                            if (q70Var.d.T(childAt).b() == q70Var.E + i10) {
                                ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                            }
                        }
                    }
                    q70Var.e.m(i10);
                }
                if (q70Var.n != -1) {
                    if (!q70Var.M) {
                        for (int i12 = 0; i12 < q70Var.d.getChildCount(); i12++) {
                            View childAt2 = q70Var.d.getChildAt(i12);
                            if (q70Var.d.T(childAt2).b() == q70Var.E + q70Var.n) {
                                ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                            }
                        }
                    }
                    q70Var.e.m(q70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    q70Var.h.h1(L0 + 1, top);
                }
                if (q70Var.M) {
                    q70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) q70Var).actionBar;
                    kVar.h(true);
                }
                ux0Var3.dismiss();
                break;
            case 6:
                ux0.r(this.b);
                break;
            case 7:
                ux0.n(this.b);
                break;
            case 8:
                ux0 ux0Var4 = this.b;
                ux0Var4.n.n();
                ux0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new fx0(ux0Var4, 3), 200L);
                break;
            case 9:
                ux0.A(this.b);
                break;
            case 10:
                ux0 ux0Var5 = this.b;
                if (ux0Var5.R) {
                    ux0Var5.n0();
                    break;
                } else {
                    ux0Var5.p0();
                    break;
                }
            case 11:
                ux0.z(this.b);
                break;
            case 12:
                ux0.q(this.b);
                break;
            case 13:
                ux0 ux0Var6 = this.b;
                Context context = ux0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new xc0(21));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.z0.g(context, 1, 16.0f);
                g10.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.u5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.v5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ix0(ux0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(ux0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

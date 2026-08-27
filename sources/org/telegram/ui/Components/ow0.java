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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex0 b;

    public /* synthetic */ ow0(ex0 ex0Var, int i10) {
        this.a = i10;
        this.b = ex0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ex0 ex0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = ex0Var.H;
                if (n2Var != null) {
                    new ag.g2(n2Var, 11, false).show();
                    break;
                } else if (ex0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ex0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                ex0.H(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                ex0 ex0Var2 = this.b;
                if (ex0Var2.U != null) {
                    ex0Var2.u0(ex0Var2.Q);
                    ex0Var2.q0();
                    ex0Var2.Q = null;
                    break;
                } else {
                    ex0Var2.X.e(ex0Var2.P, null, ex0Var2.O, null, ex0Var2.e0, true, 0, 0);
                    ex0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                ex0 ex0Var3 = this.b;
                org.telegram.ui.x60 x60Var = ex0Var3.Z;
                org.telegram.ui.c70 c70Var = x60Var.c;
                f2.k0 k0Var = c70Var.h;
                boolean z10 = c70Var.J;
                int L0 = k0Var.L0();
                lk0 lk0Var = (lk0) c70Var.d.K(L0);
                int top = lk0Var != null ? lk0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = c70Var.n;
                if (x60Var.a) {
                    c70Var.r = null;
                    c70Var.s = true;
                } else {
                    c70Var.r = x60Var.b;
                    c70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.r00(x60Var, 9), 350L);
                }
                c70Var.h0();
                c70Var.f0(c70Var.r, true);
                if (i10 != -1) {
                    if (!c70Var.I) {
                        for (int i11 = 0; i11 < c70Var.d.getChildCount(); i11++) {
                            View childAt = c70Var.d.getChildAt(i11);
                            if (c70Var.d.T(childAt).b() == c70Var.A + i10) {
                                ((org.telegram.ui.Cells.h8) childAt).b(false, true);
                            }
                        }
                    }
                    c70Var.e.m(i10);
                }
                if (c70Var.n != -1) {
                    if (!c70Var.I) {
                        for (int i12 = 0; i12 < c70Var.d.getChildCount(); i12++) {
                            View childAt2 = c70Var.d.getChildAt(i12);
                            if (c70Var.d.T(childAt2).b() == c70Var.A + c70Var.n) {
                                ((org.telegram.ui.Cells.h8) childAt2).b(true, true);
                            }
                        }
                    }
                    c70Var.e.m(c70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    c70Var.h.h1(L0 + 1, top);
                }
                if (c70Var.I) {
                    c70Var.H.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) c70Var).actionBar;
                    kVar.h(true);
                }
                ex0Var3.dismiss();
                break;
            case 6:
                ex0.s(this.b);
                break;
            case 7:
                ex0.n(this.b);
                break;
            case 8:
                ex0 ex0Var4 = this.b;
                ex0Var4.n.n();
                ex0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new qw0(ex0Var4, 3), 200L);
                break;
            case 9:
                ex0.C(this.b);
                break;
            case 10:
                ex0 ex0Var5 = this.b;
                if (ex0Var5.N) {
                    ex0Var5.n0();
                    break;
                } else {
                    ex0Var5.p0();
                    break;
                }
            case 11:
                ex0.B(this.b);
                break;
            case 12:
                ex0.r(this.b);
                break;
            case 13:
                ex0 ex0Var6 = this.b;
                Context context = ex0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new pc0(15));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, h7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView h = org.telegram.messenger.y1.h(context, 1, 16.0f);
                h.setTextColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.t5));
                h.setMaxLines(1);
                h.setLines(1);
                h.setText("t.me/addstickers/");
                h.setInputType(16385);
                h.setGravity(51);
                h.setSingleLine(true);
                h.setVisibility(4);
                h.setImeOptions(6);
                h.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(h, h7.z5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new sw0(ex0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, h7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new c1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vu(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ex0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.q5));
                linearLayout.addView(textView, h7.z5.n(-1, -2));
                d1 d1Var = new d1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(d1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new cg.f(ex0Var6, iArr, editTextBoldCursor, textView, h, alertDialog$Builder, 4));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy0 b;

    public /* synthetic */ xx0(oy0 oy0Var, int i10) {
        this.a = i10;
        this.b = oy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                oy0 oy0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = oy0Var.L;
                if (n2Var != null) {
                    new sg.x0(n2Var, 11, false).show();
                    break;
                } else if (oy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) oy0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                oy0.I(this.b);
                break;
            case 2:
                this.b.r0();
                break;
            case 3:
                oy0 oy0Var2 = this.b;
                if (oy0Var2.Y != null) {
                    oy0Var2.v0(oy0Var2.U);
                    oy0Var2.r0();
                    oy0Var2.U = null;
                    break;
                } else {
                    oy0Var2.b0.e(oy0Var2.T, null, oy0Var2.S, null, oy0Var2.i0, true, 0, 0);
                    oy0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                oy0 oy0Var3 = this.b;
                org.telegram.ui.x60 x60Var = oy0Var3.d0;
                org.telegram.ui.c70 c70Var = x60Var.c;
                s4.b0 b0Var = c70Var.h;
                boolean z10 = c70Var.N;
                int L0 = b0Var.L0();
                sl0 sl0Var = (sl0) c70Var.d.K(L0);
                int top = sl0Var != null ? sl0Var.a.getTop() : Integer.MAX_VALUE;
                int i10 = c70Var.n;
                if (x60Var.a) {
                    c70Var.r = null;
                    c70Var.s = true;
                } else {
                    c70Var.r = x60Var.b;
                    c70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.fz(x60Var, 10), 350L);
                }
                c70Var.h0();
                c70Var.f0(c70Var.r, true);
                if (i10 != -1) {
                    if (!c70Var.M) {
                        for (int i11 = 0; i11 < c70Var.d.getChildCount(); i11++) {
                            View childAt = c70Var.d.getChildAt(i11);
                            if (c70Var.d.T(childAt).b() == c70Var.E + i10) {
                                ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                            }
                        }
                    }
                    c70Var.e.m(i10);
                }
                if (c70Var.n != -1) {
                    if (!c70Var.M) {
                        for (int i12 = 0; i12 < c70Var.d.getChildCount(); i12++) {
                            View childAt2 = c70Var.d.getChildAt(i12);
                            if (c70Var.d.T(childAt2).b() == c70Var.E + c70Var.n) {
                                ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                            }
                        }
                    }
                    c70Var.e.m(c70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    c70Var.h.h1(L0 + 1, top);
                }
                if (c70Var.M) {
                    c70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) c70Var).actionBar;
                    kVar.h(true);
                }
                oy0Var3.dismiss();
                break;
            case 6:
                oy0.s(this.b);
                break;
            case 7:
                oy0.o(this.b);
                break;
            case 8:
                oy0 oy0Var4 = this.b;
                oy0Var4.n.n();
                oy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new zx0(oy0Var4, 3), 200L);
                break;
            case 9:
                oy0.C(this.b);
                break;
            case 10:
                oy0 oy0Var5 = this.b;
                if (oy0Var5.R) {
                    oy0Var5.o0();
                    break;
                } else {
                    oy0Var5.q0();
                    break;
                }
            case 11:
                oy0.B(this.b);
                break;
            case 12:
                oy0.r(this.b);
                break;
            case 13:
                oy0 oy0Var6 = this.b;
                Context context = oy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new tg0(11));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
                f7.setTextColor(oy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.z5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.u5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.v5, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(oy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(oy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new cy0(oy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(oy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.q5));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(oy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

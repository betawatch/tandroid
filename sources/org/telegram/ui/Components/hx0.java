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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx0 b;

    public /* synthetic */ hx0(yx0 yx0Var, int i10) {
        this.a = i10;
        this.b = yx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                yx0 yx0Var = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = yx0Var.I;
                if (p2Var != null) {
                    new fg.n1(p2Var, 11, false).show();
                    break;
                } else if (yx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) yx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                yx0.G(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                yx0 yx0Var2 = this.b;
                if (yx0Var2.V != null) {
                    yx0Var2.u0(yx0Var2.R);
                    yx0Var2.q0();
                    yx0Var2.R = null;
                    break;
                } else {
                    yx0Var2.Y.d(yx0Var2.Q, null, yx0Var2.P, null, yx0Var2.f0, true, 0, 0);
                    yx0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                yx0 yx0Var3 = this.b;
                org.telegram.ui.i70 i70Var = yx0Var3.a0;
                org.telegram.ui.n70 n70Var = i70Var.c;
                f2.j0 j0Var = n70Var.h;
                boolean z4 = n70Var.K;
                int L0 = j0Var.L0();
                fl0 fl0Var = (fl0) n70Var.d.K(L0);
                int top = fl0Var != null ? fl0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = n70Var.n;
                if (i70Var.a) {
                    n70Var.r = null;
                    n70Var.s = true;
                } else {
                    n70Var.r = i70Var.b;
                    n70Var.s = false;
                }
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(i70Var, 9), 350L);
                }
                n70Var.h0();
                n70Var.f0(n70Var.r, true);
                if (i10 != -1) {
                    if (!n70Var.J) {
                        for (int i11 = 0; i11 < n70Var.d.getChildCount(); i11++) {
                            View childAt = n70Var.d.getChildAt(i11);
                            if (n70Var.d.T(childAt).b() == n70Var.B + i10) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    n70Var.e.m(i10);
                }
                if (n70Var.n != -1) {
                    if (!n70Var.J) {
                        for (int i12 = 0; i12 < n70Var.d.getChildCount(); i12++) {
                            View childAt2 = n70Var.d.getChildAt(i12);
                            if (n70Var.d.T(childAt2).b() == n70Var.B + n70Var.n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    n70Var.e.m(n70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z4) {
                    n70Var.h.h1(L0 + 1, top);
                }
                if (n70Var.J) {
                    n70Var.I.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.p2) n70Var).actionBar;
                    kVar.h(true);
                }
                yx0Var3.dismiss();
                break;
            case 6:
                yx0.r(this.b);
                break;
            case 7:
                yx0.n(this.b);
                break;
            case 8:
                yx0 yx0Var4 = this.b;
                yx0Var4.n.n();
                yx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new jx0(yx0Var4, 3), 200L);
                break;
            case 9:
                yx0.B(this.b);
                break;
            case 10:
                yx0 yx0Var5 = this.b;
                if (yx0Var5.O) {
                    yx0Var5.n0();
                    break;
                } else {
                    yx0Var5.p0();
                    break;
                }
            case 11:
                yx0.A(this.b);
                break;
            case 12:
                yx0.q(this.b);
                break;
            case 13:
                yx0 yx0Var6 = this.b;
                Context context = yx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new mh0(9));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, k7.c6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
                g10.setTextColor(yx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, k7.c6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.u5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.v5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(yx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(yx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new lx0(yx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, k7.c6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(yx0Var6.getThemedColor(org.telegram.ui.ActionBar.k6.q5));
                linearLayout.addView(textView, k7.c6.n(-1, -2));
                e1 e1Var = new e1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.setOnShowListener(e1Var);
                d2Var.show();
                editTextBoldCursor.requestFocus();
                d2Var.d(-1).setOnClickListener(new hg.e(yx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

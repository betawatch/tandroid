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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy0 b;

    public /* synthetic */ px0(hy0 hy0Var, int i10) {
        this.a = i10;
        this.b = hy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 0:
                hy0 hy0Var = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = hy0Var.L;
                if (p2Var != null) {
                    new qg.a1(p2Var, 11, false).show();
                    break;
                } else if (hy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) hy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                hy0.H(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                hy0 hy0Var2 = this.b;
                if (hy0Var2.Y != null) {
                    hy0Var2.u0(hy0Var2.U);
                    hy0Var2.q0();
                    hy0Var2.U = null;
                    break;
                } else {
                    hy0Var2.b0.d(hy0Var2.T, null, hy0Var2.S, null, hy0Var2.i0, true, 0, 0);
                    hy0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                hy0 hy0Var3 = this.b;
                org.telegram.ui.n70 n70Var = hy0Var3.d0;
                org.telegram.ui.s70 s70Var = n70Var.c;
                s4.c0 c0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = c0Var.L0();
                fl0 fl0Var = (fl0) s70Var.d.K(L0);
                int top = fl0Var != null ? fl0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = s70Var.n;
                if (n70Var.a) {
                    s70Var.r = null;
                    s70Var.s = true;
                } else {
                    s70Var.r = n70Var.b;
                    s70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i10(n70Var, 9), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.r, true);
                if (i10 != -1) {
                    if (!s70Var.M) {
                        for (int i11 = 0; i11 < s70Var.d.getChildCount(); i11++) {
                            View childAt = s70Var.d.getChildAt(i11);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i10) {
                                ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                            }
                        }
                    }
                    s70Var.e.m(i10);
                }
                if (s70Var.n != -1) {
                    if (!s70Var.M) {
                        for (int i12 = 0; i12 < s70Var.d.getChildCount(); i12++) {
                            View childAt2 = s70Var.d.getChildAt(i12);
                            if (s70Var.d.T(childAt2).b() == s70Var.E + s70Var.n) {
                                ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                            }
                        }
                    }
                    s70Var.e.m(s70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    s70Var.h.h1(L0 + 1, top);
                }
                if (s70Var.M) {
                    s70Var.L.H("", false);
                    lVar = ((org.telegram.ui.ActionBar.p2) s70Var).actionBar;
                    lVar.h(true);
                }
                hy0Var3.dismiss();
                break;
            case 6:
                hy0.r(this.b);
                break;
            case 7:
                hy0.n(this.b);
                break;
            case 8:
                hy0 hy0Var4 = this.b;
                hy0Var4.n.n();
                hy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new rx0(hy0Var4, 3), 200L);
                break;
            case 9:
                hy0.A(this.b);
                break;
            case 10:
                hy0 hy0Var5 = this.b;
                if (hy0Var5.R) {
                    hy0Var5.n0();
                    break;
                } else {
                    hy0Var5.p0();
                    break;
                }
            case 11:
                hy0.z(this.b);
                break;
            case 12:
                hy0.q(this.b);
                break;
            case 13:
                hy0 hy0Var6 = this.b;
                Context context = hy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new gp0(6));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.a2.g(context, 1, 16.0f);
                g10.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.a6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new vx0(hy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.a6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new g1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(hy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
                linearLayout.addView(textView, w7.a6.n(-1, -2));
                h1 h1Var = new h1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.setOnShowListener(h1Var);
                d2Var.show();
                editTextBoldCursor.requestFocus();
                d2Var.d(-1).setOnClickListener(new o0(hy0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

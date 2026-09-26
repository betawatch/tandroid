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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy0 b;

    public /* synthetic */ ox0(fy0 fy0Var, int i10) {
        this.a = i10;
        this.b = fy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                fy0 fy0Var = this.b;
                org.telegram.ui.ActionBar.m2 m2Var = fy0Var.L;
                if (m2Var != null) {
                    new rg.x0(m2Var, 11, false).show();
                    break;
                } else if (fy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) fy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                fy0.H(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                fy0 fy0Var2 = this.b;
                if (fy0Var2.Y != null) {
                    fy0Var2.u0(fy0Var2.U);
                    fy0Var2.q0();
                    fy0Var2.U = null;
                    break;
                } else {
                    fy0Var2.b0.d(fy0Var2.T, null, fy0Var2.S, null, fy0Var2.i0, true, 0, 0);
                    fy0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                fy0 fy0Var3 = this.b;
                org.telegram.ui.j70 j70Var = fy0Var3.d0;
                org.telegram.ui.o70 o70Var = j70Var.c;
                s4.c0 c0Var = o70Var.h;
                boolean z10 = o70Var.N;
                int L0 = c0Var.L0();
                gl0 gl0Var = (gl0) o70Var.d.K(L0);
                int top = gl0Var != null ? gl0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = o70Var.n;
                if (j70Var.a) {
                    o70Var.r = null;
                    o70Var.s = true;
                } else {
                    o70Var.r = j70Var.b;
                    o70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.c10(j70Var, 9), 350L);
                }
                o70Var.h0();
                o70Var.f0(o70Var.r, true);
                if (i10 != -1) {
                    if (!o70Var.M) {
                        for (int i11 = 0; i11 < o70Var.d.getChildCount(); i11++) {
                            View childAt = o70Var.d.getChildAt(i11);
                            if (o70Var.d.T(childAt).b() == o70Var.E + i10) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    o70Var.e.m(i10);
                }
                if (o70Var.n != -1) {
                    if (!o70Var.M) {
                        for (int i12 = 0; i12 < o70Var.d.getChildCount(); i12++) {
                            View childAt2 = o70Var.d.getChildAt(i12);
                            if (o70Var.d.T(childAt2).b() == o70Var.E + o70Var.n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    o70Var.e.m(o70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    o70Var.h.h1(L0 + 1, top);
                }
                if (o70Var.M) {
                    o70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.m2) o70Var).actionBar;
                    kVar.h(true);
                }
                fy0Var3.dismiss();
                break;
            case 6:
                fy0.r(this.b);
                break;
            case 7:
                fy0.n(this.b);
                break;
            case 8:
                fy0 fy0Var4 = this.b;
                fy0Var4.n.n();
                fy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new qx0(fy0Var4, 3), 200L);
                break;
            case 9:
                fy0.A(this.b);
                break;
            case 10:
                fy0 fy0Var5 = this.b;
                if (fy0Var5.R) {
                    fy0Var5.n0();
                    break;
                } else {
                    fy0Var5.p0();
                    break;
                }
            case 11:
                fy0.z(this.b);
                break;
            case 12:
                fy0.q(this.b);
                break;
            case 13:
                fy0 fy0Var6 = this.b;
                Context context = fy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new fa0(23));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
                f7.setTextColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.y5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.u5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.v5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new tx0(fy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(fy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.setOnShowListener(f1Var);
                a2Var.show();
                editTextBoldCursor.requestFocus();
                a2Var.d(-1).setOnClickListener(new m0(fy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

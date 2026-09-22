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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy0 b;

    public /* synthetic */ rx0(iy0 iy0Var, int i10) {
        this.a = i10;
        this.b = iy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                iy0 iy0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = iy0Var.L;
                if (n2Var != null) {
                    new rg.x0(n2Var, 11, false).show();
                    break;
                } else if (iy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) iy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                iy0.G(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                iy0 iy0Var2 = this.b;
                if (iy0Var2.Y != null) {
                    iy0Var2.u0(iy0Var2.U);
                    iy0Var2.q0();
                    iy0Var2.U = null;
                    break;
                } else {
                    iy0Var2.b0.d(iy0Var2.T, null, iy0Var2.S, null, iy0Var2.i0, true, 0, 0);
                    iy0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                iy0 iy0Var3 = this.b;
                org.telegram.ui.o70 o70Var = iy0Var3.d0;
                org.telegram.ui.t70 t70Var = o70Var.c;
                s4.c0 c0Var = t70Var.h;
                boolean z10 = t70Var.N;
                int L0 = c0Var.L0();
                il0 il0Var = (il0) t70Var.d.L(L0);
                int top = il0Var != null ? il0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = t70Var.n;
                if (o70Var.a) {
                    t70Var.r = null;
                    t70Var.s = true;
                } else {
                    t70Var.r = o70Var.b;
                    t70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(o70Var, 9), 350L);
                }
                t70Var.h0();
                t70Var.f0(t70Var.r, true);
                if (i10 != -1) {
                    if (!t70Var.M) {
                        for (int i11 = 0; i11 < t70Var.d.getChildCount(); i11++) {
                            View childAt = t70Var.d.getChildAt(i11);
                            if (t70Var.d.U(childAt).b() == t70Var.E + i10) {
                                ((org.telegram.ui.Cells.n8) childAt).b(false, true);
                            }
                        }
                    }
                    t70Var.e.m(i10);
                }
                if (t70Var.n != -1) {
                    if (!t70Var.M) {
                        for (int i12 = 0; i12 < t70Var.d.getChildCount(); i12++) {
                            View childAt2 = t70Var.d.getChildAt(i12);
                            if (t70Var.d.U(childAt2).b() == t70Var.E + t70Var.n) {
                                ((org.telegram.ui.Cells.n8) childAt2).b(true, true);
                            }
                        }
                    }
                    t70Var.e.m(t70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    t70Var.h.h1(L0 + 1, top);
                }
                if (t70Var.M) {
                    t70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) t70Var).actionBar;
                    kVar.h(true);
                }
                iy0Var3.dismiss();
                break;
            case 6:
                iy0.r(this.b);
                break;
            case 7:
                iy0.n(this.b);
                break;
            case 8:
                iy0 iy0Var4 = this.b;
                iy0Var4.n.n();
                iy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new tx0(iy0Var4, 3), 200L);
                break;
            case 9:
                iy0.A(this.b);
                break;
            case 10:
                iy0 iy0Var5 = this.b;
                if (iy0Var5.R) {
                    iy0Var5.n0();
                    break;
                } else {
                    iy0Var5.p0();
                    break;
                }
            case 11:
                iy0.z(this.b);
                break;
            case 12:
                iy0.q(this.b);
                break;
            case 13:
                iy0 iy0Var6 = this.b;
                Context context = iy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new lg0(12));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.l0.f(context, 1, 16.0f);
                f7.setTextColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.t5));
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
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new wx0(iy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.y5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(iy0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
                linearLayout.addView(textView, w7.y5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(iy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

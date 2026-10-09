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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy0 b;

    public /* synthetic */ gy0(xy0 xy0Var, int i10) {
        this.a = i10;
        this.b = xy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                xy0 xy0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = xy0Var.L;
                if (n2Var != null) {
                    new rg.y0(n2Var, 11, false).show();
                    break;
                } else if (xy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xy0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                xy0.I(this.b);
                break;
            case 2:
                this.b.r0();
                break;
            case 3:
                xy0 xy0Var2 = this.b;
                if (xy0Var2.Y != null) {
                    xy0Var2.v0(xy0Var2.U);
                    xy0Var2.r0();
                    xy0Var2.U = null;
                    break;
                } else {
                    xy0Var2.b0.d(xy0Var2.T, null, xy0Var2.S, null, xy0Var2.i0, true, 0, 0);
                    xy0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                xy0 xy0Var3 = this.b;
                org.telegram.ui.n70 n70Var = xy0Var3.d0;
                org.telegram.ui.s70 s70Var = n70Var.c;
                s4.d0 d0Var = s70Var.h;
                boolean z10 = s70Var.N;
                int L0 = d0Var.L0();
                am0 am0Var = (am0) s70Var.d.K(L0);
                int top = am0Var != null ? am0Var.a.getTop() : Integer.MAX_VALUE;
                int i10 = s70Var.n;
                if (n70Var.a) {
                    s70Var.r = null;
                    s70Var.s = true;
                } else {
                    s70Var.r = n70Var.b;
                    s70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.uz(n70Var, 10), 350L);
                }
                s70Var.h0();
                s70Var.f0(s70Var.r, true);
                if (i10 != -1) {
                    if (!s70Var.M) {
                        for (int i11 = 0; i11 < s70Var.d.getChildCount(); i11++) {
                            View childAt = s70Var.d.getChildAt(i11);
                            if (s70Var.d.T(childAt).b() == s70Var.E + i10) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
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
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
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
                    kVar = ((org.telegram.ui.ActionBar.n2) s70Var).actionBar;
                    kVar.h(true);
                }
                xy0Var3.dismiss();
                break;
            case 6:
                xy0.t(this.b);
                break;
            case 7:
                xy0.p(this.b);
                break;
            case 8:
                xy0 xy0Var4 = this.b;
                xy0Var4.n.n();
                xy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new iy0(xy0Var4, 3), 200L);
                break;
            case 9:
                xy0.D(this.b);
                break;
            case 10:
                xy0 xy0Var5 = this.b;
                if (xy0Var5.R) {
                    xy0Var5.o0();
                    break;
                } else {
                    xy0Var5.q0();
                    break;
                }
            case 11:
                xy0.C(this.b);
                break;
            case 12:
                xy0.s(this.b);
                break;
            case 13:
                xy0 xy0Var6 = this.b;
                Context context = xy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new fe0(15));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
                f7.setTextColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.t5));
                f7.setMaxLines(1);
                f7.setLines(1);
                f7.setText("t.me/addstickers/");
                f7.setInputType(16385);
                f7.setGravity(51);
                f7.setSingleLine(true);
                f7.setVisibility(4);
                f7.setImeOptions(6);
                f7.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(f7, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.u5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.v5, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ly0(xy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bw(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(xy0Var6.getThemedColor(org.telegram.ui.ActionBar.i6.q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(xy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

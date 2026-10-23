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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy0 b;

    public /* synthetic */ zx0(qy0 qy0Var, int i10) {
        this.a = i10;
        this.b = qy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                qy0 qy0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = qy0Var.L;
                if (n2Var != null) {
                    new sg.y0(n2Var, 11, false).show();
                    break;
                } else if (qy0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) qy0Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                qy0.I(this.b);
                break;
            case 2:
                this.b.r0();
                break;
            case 3:
                qy0 qy0Var2 = this.b;
                if (qy0Var2.Y != null) {
                    qy0Var2.v0(qy0Var2.U);
                    qy0Var2.r0();
                    qy0Var2.U = null;
                    break;
                } else {
                    qy0Var2.b0.e(qy0Var2.T, null, qy0Var2.S, null, qy0Var2.i0, true, 0, 0);
                    qy0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                qy0 qy0Var3 = this.b;
                org.telegram.ui.v60 v60Var = qy0Var3.d0;
                org.telegram.ui.a70 a70Var = v60Var.c;
                s4.b0 b0Var = a70Var.h;
                boolean z10 = a70Var.N;
                int L0 = b0Var.L0();
                tl0 tl0Var = (tl0) a70Var.d.K(L0);
                int top = tl0Var != null ? tl0Var.a.getTop() : Integer.MAX_VALUE;
                int i10 = a70Var.n;
                if (v60Var.a) {
                    a70Var.r = null;
                    a70Var.s = true;
                } else {
                    a70Var.r = v60Var.b;
                    a70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dz(v60Var, 10), 350L);
                }
                a70Var.h0();
                a70Var.f0(a70Var.r, true);
                if (i10 != -1) {
                    if (!a70Var.M) {
                        for (int i11 = 0; i11 < a70Var.d.getChildCount(); i11++) {
                            View childAt = a70Var.d.getChildAt(i11);
                            if (a70Var.d.T(childAt).b() == a70Var.E + i10) {
                                ((org.telegram.ui.Cells.l8) childAt).b(false, true);
                            }
                        }
                    }
                    a70Var.e.m(i10);
                }
                if (a70Var.n != -1) {
                    if (!a70Var.M) {
                        for (int i12 = 0; i12 < a70Var.d.getChildCount(); i12++) {
                            View childAt2 = a70Var.d.getChildAt(i12);
                            if (a70Var.d.T(childAt2).b() == a70Var.E + a70Var.n) {
                                ((org.telegram.ui.Cells.l8) childAt2).b(true, true);
                            }
                        }
                    }
                    a70Var.e.m(a70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    a70Var.h.h1(L0 + 1, top);
                }
                if (a70Var.M) {
                    a70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) a70Var).actionBar;
                    kVar.h(true);
                }
                qy0Var3.dismiss();
                break;
            case 6:
                qy0.t(this.b);
                break;
            case 7:
                qy0.o(this.b);
                break;
            case 8:
                qy0 qy0Var4 = this.b;
                qy0Var4.n.n();
                qy0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new by0(qy0Var4, 3), 200L);
                break;
            case 9:
                qy0.C(this.b);
                break;
            case 10:
                qy0 qy0Var5 = this.b;
                if (qy0Var5.R) {
                    qy0Var5.o0();
                    break;
                } else {
                    qy0Var5.q0();
                    break;
                }
            case 11:
                qy0.B(this.b);
                break;
            case 12:
                qy0.s(this.b);
                break;
            case 13:
                qy0 qy0Var6 = this.b;
                Context context = qy0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new ug0(11));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.z5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
                f7.setTextColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.t5));
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
                editTextBoldCursor.setTextColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ey0(qy0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.z5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new e1(alertDialog$Builder, 8));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv(editTextBoldCursor, 23));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(qy0Var6.getThemedColor(org.telegram.ui.ActionBar.h6.q5));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                f1 f1Var = new f1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(f1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new m0(qy0Var6, iArr, editTextBoldCursor, textView, f7, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

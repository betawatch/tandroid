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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ ww0(nx0 nx0Var, int i10) {
        this.a = i10;
        this.b = nx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 0:
                nx0 nx0Var = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = nx0Var.H;
                if (o2Var != null) {
                    new cg.p1(o2Var, 11, false).show();
                    break;
                } else if (nx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) nx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                nx0.G(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                nx0 nx0Var2 = this.b;
                if (nx0Var2.U != null) {
                    nx0Var2.u0(nx0Var2.Q);
                    nx0Var2.q0();
                    nx0Var2.Q = null;
                    break;
                } else {
                    nx0Var2.X.a(nx0Var2.P, null, nx0Var2.O, null, nx0Var2.e0, true, 0, 0);
                    nx0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                nx0 nx0Var3 = this.b;
                org.telegram.ui.w60 w60Var = nx0Var3.Z;
                org.telegram.ui.c70 c70Var = w60Var.c;
                f2.j0 j0Var = c70Var.h;
                boolean z10 = c70Var.J;
                int L0 = j0Var.L0();
                vk0 vk0Var = (vk0) c70Var.d.K(L0);
                int top = vk0Var != null ? vk0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = c70Var.n;
                if (w60Var.a) {
                    c70Var.r = null;
                    c70Var.s = true;
                } else {
                    c70Var.r = w60Var.b;
                    c70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.q00(w60Var, 9), 350L);
                }
                c70Var.h0();
                c70Var.f0(c70Var.r, true);
                if (i10 != -1) {
                    if (!c70Var.I) {
                        for (int i11 = 0; i11 < c70Var.d.getChildCount(); i11++) {
                            View childAt = c70Var.d.getChildAt(i11);
                            if (c70Var.d.T(childAt).b() == c70Var.A + i10) {
                                ((org.telegram.ui.Cells.i8) childAt).b(false, true);
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
                                ((org.telegram.ui.Cells.i8) childAt2).b(true, true);
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
                    lVar = ((org.telegram.ui.ActionBar.o2) c70Var).actionBar;
                    lVar.h(true);
                }
                nx0Var3.dismiss();
                break;
            case 6:
                nx0.r(this.b);
                break;
            case 7:
                nx0.n(this.b);
                break;
            case 8:
                nx0 nx0Var4 = this.b;
                nx0Var4.n.n();
                nx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new zw0(nx0Var4, 3), 200L);
                break;
            case 9:
                nx0.B(this.b);
                break;
            case 10:
                nx0 nx0Var5 = this.b;
                if (nx0Var5.N) {
                    nx0Var5.n0();
                    break;
                } else {
                    nx0Var5.p0();
                    break;
                }
            case 11:
                nx0.A(this.b);
                break;
            case 12:
                nx0.q(this.b);
                break;
            case 13:
                nx0 nx0Var6 = this.b;
                Context context = nx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new xo0(4));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, i7.f6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView h = org.telegram.messenger.x3.h(context, 1, 16.0f);
                h.setTextColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.t5));
                h.setMaxLines(1);
                h.setLines(1);
                h.setText("t.me/addstickers/");
                h.setInputType(16385);
                h.setGravity(51);
                h.setSingleLine(true);
                h.setVisibility(4);
                h.setImeOptions(6);
                h.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(h, i7.f6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.v5, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new bx0(nx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, i7.f6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new f1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(nx0Var6.getThemedColor(org.telegram.ui.ActionBar.g6.q5));
                linearLayout.addView(textView, i7.f6.n(-1, -2));
                g1 g1Var = new g1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.setOnShowListener(g1Var);
                c2Var.show();
                editTextBoldCursor.requestFocus();
                c2Var.d(-1).setOnClickListener(new eg.f(nx0Var6, iArr, editTextBoldCursor, textView, h, alertDialog$Builder, 4));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

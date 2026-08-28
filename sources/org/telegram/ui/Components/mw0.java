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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;

    public /* synthetic */ mw0(cx0 cx0Var, int i9) {
        this.a = i9;
        this.b = cx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                cx0 cx0Var = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = cx0Var.H;
                if (o2Var != null) {
                    new zf.x0(o2Var, 11, false).show();
                    break;
                } else if (cx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) cx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                cx0.G(this.b);
                break;
            case 2:
                this.b.p0();
                break;
            case 3:
                cx0 cx0Var2 = this.b;
                if (cx0Var2.U != null) {
                    cx0Var2.t0(cx0Var2.Q);
                    cx0Var2.p0();
                    cx0Var2.Q = null;
                    break;
                } else {
                    cx0Var2.X.a(cx0Var2.P, null, cx0Var2.O, null, cx0Var2.e0, true, 0, 0);
                    cx0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                cx0 cx0Var3 = this.b;
                org.telegram.ui.u60 u60Var = cx0Var3.Z;
                org.telegram.ui.z60 z60Var = u60Var.c;
                f2.m0 m0Var = z60Var.h;
                boolean z10 = z60Var.J;
                int L0 = m0Var.L0();
                ik0 ik0Var = (ik0) z60Var.d.K(L0);
                int top = ik0Var != null ? ik0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i9 = z60Var.n;
                if (u60Var.a) {
                    z60Var.r = null;
                    z60Var.s = true;
                } else {
                    z60Var.r = u60Var.b;
                    z60Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.o00(u60Var, 9), 350L);
                }
                z60Var.g0();
                z60Var.e0(z60Var.r, true);
                if (i9 != -1) {
                    if (!z60Var.I) {
                        for (int i10 = 0; i10 < z60Var.d.getChildCount(); i10++) {
                            View childAt = z60Var.d.getChildAt(i10);
                            if (z60Var.d.T(childAt).b() == z60Var.A + i9) {
                                ((org.telegram.ui.Cells.k8) childAt).b(false, true);
                            }
                        }
                    }
                    z60Var.e.m(i9);
                }
                if (z60Var.n != -1) {
                    if (!z60Var.I) {
                        for (int i11 = 0; i11 < z60Var.d.getChildCount(); i11++) {
                            View childAt2 = z60Var.d.getChildAt(i11);
                            if (z60Var.d.T(childAt2).b() == z60Var.A + z60Var.n) {
                                ((org.telegram.ui.Cells.k8) childAt2).b(true, true);
                            }
                        }
                    }
                    z60Var.e.m(z60Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    z60Var.h.h1(L0 + 1, top);
                }
                if (z60Var.I) {
                    z60Var.H.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.o2) z60Var).actionBar;
                    kVar.h(true);
                }
                cx0Var3.dismiss();
                break;
            case 6:
                cx0.r(this.b);
                break;
            case 7:
                cx0.n(this.b);
                break;
            case 8:
                cx0 cx0Var4 = this.b;
                cx0Var4.n.n();
                cx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ow0(cx0Var4, 3), 200L);
                break;
            case 9:
                cx0.A(this.b);
                break;
            case 10:
                cx0 cx0Var5 = this.b;
                if (cx0Var5.N) {
                    cx0Var5.m0();
                    break;
                } else {
                    cx0Var5.o0();
                    break;
                }
            case 11:
                cx0.z(this.b);
                break;
            case 12:
                cx0.q(this.b);
                break;
            case 13:
                cx0 cx0Var6 = this.b;
                Context context = cx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.N = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new if0(10));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, g7.e6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
                g10.setTextColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, g7.e6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.u5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.v5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new qw0(cx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, g7.e6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new c1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wu(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(cx0Var6.getThemedColor(org.telegram.ui.ActionBar.f6.q5));
                linearLayout.addView(textView, g7.e6.n(-1, -2));
                d1 d1Var = new d1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.setOnShowListener(d1Var);
                c2Var.show();
                editTextBoldCursor.requestFocus();
                c2Var.d(-1).setOnClickListener(new bg.h(cx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

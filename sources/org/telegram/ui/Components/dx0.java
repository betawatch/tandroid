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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ux0 b;

    public /* synthetic */ dx0(ux0 ux0Var, int i10) {
        this.a = i10;
        this.b = ux0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ux0 ux0Var = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = ux0Var.L;
                if (n2Var != null) {
                    new sg.a1(n2Var, 11, false).show();
                    break;
                } else if (ux0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) ux0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                ux0.H(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                ux0 ux0Var2 = this.b;
                if (ux0Var2.Y != null) {
                    ux0Var2.u0(ux0Var2.U);
                    ux0Var2.q0();
                    ux0Var2.U = null;
                    break;
                } else {
                    ux0Var2.b0.a(ux0Var2.T, null, ux0Var2.S, null, ux0Var2.i0, true, 0, 0);
                    ux0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                ux0 ux0Var3 = this.b;
                org.telegram.ui.p70 p70Var = ux0Var3.d0;
                org.telegram.ui.u70 u70Var = p70Var.c;
                s4.c0 c0Var = u70Var.h;
                boolean z10 = u70Var.N;
                int L0 = c0Var.L0();
                vk0 vk0Var = (vk0) u70Var.d.K(L0);
                int top = vk0Var != null ? vk0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = u70Var.n;
                if (p70Var.a) {
                    u70Var.r = null;
                    u70Var.s = true;
                } else {
                    u70Var.r = p70Var.b;
                    u70Var.s = false;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.g10(p70Var, 9), 350L);
                }
                u70Var.h0();
                u70Var.f0(u70Var.r, true);
                if (i10 != -1) {
                    if (!u70Var.M) {
                        for (int i11 = 0; i11 < u70Var.d.getChildCount(); i11++) {
                            View childAt = u70Var.d.getChildAt(i11);
                            if (u70Var.d.T(childAt).b() == u70Var.E + i10) {
                                ((org.telegram.ui.Cells.m8) childAt).b(false, true);
                            }
                        }
                    }
                    u70Var.e.m(i10);
                }
                if (u70Var.n != -1) {
                    if (!u70Var.M) {
                        for (int i12 = 0; i12 < u70Var.d.getChildCount(); i12++) {
                            View childAt2 = u70Var.d.getChildAt(i12);
                            if (u70Var.d.T(childAt2).b() == u70Var.E + u70Var.n) {
                                ((org.telegram.ui.Cells.m8) childAt2).b(true, true);
                            }
                        }
                    }
                    u70Var.e.m(u70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z10) {
                    u70Var.h.h1(L0 + 1, top);
                }
                if (u70Var.M) {
                    u70Var.L.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.n2) u70Var).actionBar;
                    kVar.h(true);
                }
                ux0Var3.dismiss();
                break;
            case 6:
                ux0.r(this.b);
                break;
            case 7:
                ux0.n(this.b);
                break;
            case 8:
                ux0 ux0Var4 = this.b;
                ux0Var4.n.n();
                ux0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new fx0(ux0Var4, 3), 200L);
                break;
            case 9:
                ux0.B(this.b);
                break;
            case 10:
                ux0 ux0Var5 = this.b;
                if (ux0Var5.R) {
                    ux0Var5.n0();
                    break;
                } else {
                    ux0Var5.p0();
                    break;
                }
            case 11:
                ux0.A(this.b);
                break;
            case 12:
                ux0.q(this.b);
                break;
            case 13:
                ux0 ux0Var6 = this.b;
                Context context = ux0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new wo0(5));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.w1.g(context, 1, 16.0f);
                g10.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, w7.x5.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new ix0(ux0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, w7.x5.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new f1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new kv(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(ux0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                g1 g1Var = new g1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.setOnShowListener(g1Var);
                b2Var.show();
                editTextBoldCursor.requestFocus();
                b2Var.d(-1).setOnClickListener(new n0(ux0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 3));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

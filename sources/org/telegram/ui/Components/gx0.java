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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xx0 b;

    public /* synthetic */ gx0(xx0 xx0Var, int i10) {
        this.a = i10;
        this.b = xx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                xx0 xx0Var = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = xx0Var.I;
                if (p2Var != null) {
                    new eg.o1(p2Var, 11, false).show();
                    break;
                } else if (xx0Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) xx0Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    break;
                }
                break;
            case 1:
                xx0.G(this.b);
                break;
            case 2:
                this.b.q0();
                break;
            case 3:
                xx0 xx0Var2 = this.b;
                if (xx0Var2.V != null) {
                    xx0Var2.u0(xx0Var2.R);
                    xx0Var2.q0();
                    xx0Var2.R = null;
                    break;
                } else {
                    xx0Var2.Y.d(xx0Var2.Q, null, xx0Var2.P, null, xx0Var2.f0, true, 0, 0);
                    xx0Var2.dismiss();
                    break;
                }
            case 4:
                this.b.n.getPopupLayout().getSwipeBack().b(true);
                break;
            case 5:
                xx0 xx0Var3 = this.b;
                org.telegram.ui.j70 j70Var = xx0Var3.a0;
                org.telegram.ui.o70 o70Var = j70Var.c;
                f2.i0 i0Var = o70Var.h;
                boolean z4 = o70Var.K;
                int L0 = i0Var.L0();
                dl0 dl0Var = (dl0) o70Var.d.K(L0);
                int top = dl0Var != null ? dl0Var.a.getTop() : ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i10 = o70Var.n;
                if (j70Var.a) {
                    o70Var.r = null;
                    o70Var.s = true;
                } else {
                    o70Var.r = j70Var.b;
                    o70Var.s = false;
                }
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.d10(j70Var, 9), 350L);
                }
                o70Var.h0();
                o70Var.f0(o70Var.r, true);
                if (i10 != -1) {
                    if (!o70Var.J) {
                        for (int i11 = 0; i11 < o70Var.d.getChildCount(); i11++) {
                            View childAt = o70Var.d.getChildAt(i11);
                            if (o70Var.d.T(childAt).b() == o70Var.B + i10) {
                                ((org.telegram.ui.Cells.j8) childAt).b(false, true);
                            }
                        }
                    }
                    o70Var.e.m(i10);
                }
                if (o70Var.n != -1) {
                    if (!o70Var.J) {
                        for (int i12 = 0; i12 < o70Var.d.getChildCount(); i12++) {
                            View childAt2 = o70Var.d.getChildAt(i12);
                            if (o70Var.d.T(childAt2).b() == o70Var.B + o70Var.n) {
                                ((org.telegram.ui.Cells.j8) childAt2).b(true, true);
                            }
                        }
                    }
                    o70Var.e.m(o70Var.n);
                }
                if (top != Integer.MAX_VALUE && !z4) {
                    o70Var.h.h1(L0 + 1, top);
                }
                if (o70Var.J) {
                    o70Var.I.H("", false);
                    kVar = ((org.telegram.ui.ActionBar.p2) o70Var).actionBar;
                    kVar.h(true);
                }
                xx0Var3.dismiss();
                break;
            case 6:
                xx0.r(this.b);
                break;
            case 7:
                xx0.n(this.b);
                break;
            case 8:
                xx0 xx0Var4 = this.b;
                xx0Var4.n.n();
                xx0Var4.dismiss();
                AndroidUtilities.runOnUIThread(new ix0(xx0Var4, 3), 200L);
                break;
            case 9:
                xx0.B(this.b);
                break;
            case 10:
                xx0 xx0Var5 = this.b;
                if (xx0Var5.O) {
                    xx0Var5.n0();
                    break;
                } else {
                    xx0Var5.p0();
                    break;
                }
            case 11:
                xx0.A(this.b);
                break;
            case 12:
                xx0.q(this.b);
                break;
            case 13:
                xx0 xx0Var6 = this.b;
                Context context = xx0Var6.getContext();
                int[] iArr = {0};
                FrameLayout frameLayout = new FrameLayout(context);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.ImportStickersEnterName);
                alertDialog$Builder.k(LocaleController.getString(R.string.Next), new lh0(9));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                linearLayout.addView(frameLayout, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                TextView textView = new TextView(context);
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
                g10.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.t5));
                g10.setMaxLines(1);
                g10.setLines(1);
                g10.setText("t.me/addstickers/");
                g10.setInputType(16385);
                g10.setGravity(51);
                g10.setSingleLine(true);
                g10.setVisibility(4);
                g10.setImeOptions(6);
                g10.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                frameLayout.addView(g10, k7.b6.e(-2, 36, 51));
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                editTextBoldCursor.setBackground(null);
                editTextBoldCursor.setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.v5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                editTextBoldCursor.setTextSize(1, 16.0f);
                editTextBoldCursor.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.j5));
                editTextBoldCursor.setMaxLines(1);
                editTextBoldCursor.setLines(1);
                editTextBoldCursor.setInputType(16385);
                editTextBoldCursor.setGravity(51);
                editTextBoldCursor.setSingleLine(true);
                editTextBoldCursor.setImeOptions(5);
                editTextBoldCursor.setCursorColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                editTextBoldCursor.setCursorWidth(1.5f);
                editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                editTextBoldCursor.addTextChangedListener(new kx0(xx0Var6, iArr, textView, editTextBoldCursor));
                frameLayout.addView(editTextBoldCursor, k7.b6.e(-1, 36, 51));
                editTextBoldCursor.setOnEditorActionListener(new d1(alertDialog$Builder, 7));
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ev(editTextBoldCursor, 22));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
                textView.setTextColor(xx0Var6.getThemedColor(org.telegram.ui.ActionBar.j6.q5));
                linearLayout.addView(textView, k7.b6.n(-1, -2));
                e1 e1Var = new e1(3, editTextBoldCursor);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.setOnShowListener(e1Var);
                d2Var.show();
                editTextBoldCursor.requestFocus();
                d2Var.d(-1).setOnClickListener(new gg.e(xx0Var6, iArr, editTextBoldCursor, textView, g10, alertDialog$Builder, 4));
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}

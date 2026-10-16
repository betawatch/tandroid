package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bl0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ el0 c;

    public bl0(el0 el0Var) {
        this.c = el0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.n;
    }

    @Override // s4.g0
    public final long i(int i10) {
        cl0 cl0Var;
        el0 el0Var = this.c;
        int i11 = el0Var.E;
        if (i10 < i11 || i10 >= el0Var.F) {
            int i12 = el0Var.r;
            cl0Var = (i10 < i12 || i10 >= el0Var.s) ? null : (cl0) el0Var.a.get(i10 - i12);
        } else {
            cl0Var = (cl0) el0Var.b.get(i10 - i11);
        }
        if (cl0Var != null) {
            return cl0Var.c;
        }
        el0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == el0Var.y) {
            return 2L;
        }
        if (i10 == el0Var.v) {
            return 3L;
        }
        if (i10 == el0Var.w) {
            return 4L;
        }
        if (i10 == el0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.g0
    public final int j(int i10) {
        el0 el0Var = this.c;
        if (i10 >= el0Var.E && i10 < el0Var.F) {
            return 0;
        }
        el0Var.getClass();
        if (i10 == 0 || i10 == el0Var.y) {
            return 1;
        }
        if (i10 == el0Var.v) {
            return 2;
        }
        return (i10 == el0Var.w || i10 == el0Var.x) ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        el0 el0Var = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = el0Var.h;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            dl0 dl0Var = (dl0) view;
            int i12 = el0Var.E;
            cl0 cl0Var = (i10 < i12 || i10 >= el0Var.F) ? null : (cl0) el0Var.b.get(i10 - i12);
            int i13 = el0Var.r;
            if (i10 >= i13 && i10 < el0Var.s) {
                cl0Var = (cl0) el0Var.a.get(i10 - i13);
            }
            if (cl0Var != null) {
                boolean z10 = dl0Var.e == cl0Var;
                boolean z11 = cl0Var == el0Var.H;
                boolean z12 = el0Var.J.get(cl0Var.c) != null;
                dl0Var.e = cl0Var;
                dl0Var.a.setText(cl0Var.f);
                dl0Var.d = i10 != el0Var.F - 1;
                dl0Var.b.a(z11, z10);
                dl0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == el0Var.y) {
                    m4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
        Drawable drawable = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.N6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.k7, c6Var), mode));
        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(drawable, drawable2);
        g2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        g2Var.b.setImageDrawable(crVar);
        g2Var.c = false;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            dl0 dl0Var = new dl0(context);
            RadioButton radioButton = new RadioButton(context);
            dl0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.g7, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h7, c6Var));
            boolean z10 = LocaleController.isRTL;
            dl0Var.addView(radioButton, w7.z5.a(22.0f, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f, 22, (z10 ? 5 : 3) | 16));
            org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 24, c6Var);
            dl0Var.c = aqVar;
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            aqVar.b(-1, i11, org.telegram.ui.ActionBar.g6.k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            dl0Var.addView(aqVar, w7.z5.a(26.0f, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f, 26, (z11 ? 5 : 3) | 16));
            aqVar.a(true, false);
            TextView textView = new TextView(context);
            dl0Var.a = textView;
            org.telegram.messenger.sk.o(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            dl0Var.addView(textView, w7.z5.a(-2.0f, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f, -2, (z12 ? 5 : 3) | 16));
            dl0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
            view = dl0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, c6Var);
            g2Var.d = 61;
            g2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            view = g2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, c6Var);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            view = m4Var;
        } else {
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}

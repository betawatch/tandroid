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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cl0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ fl0 c;

    public cl0(fl0 fl0Var) {
        this.c = fl0Var;
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
        dl0 dl0Var;
        fl0 fl0Var = this.c;
        int i11 = fl0Var.E;
        if (i10 < i11 || i10 >= fl0Var.F) {
            int i12 = fl0Var.r;
            dl0Var = (i10 < i12 || i10 >= fl0Var.s) ? null : (dl0) fl0Var.a.get(i10 - i12);
        } else {
            dl0Var = (dl0) fl0Var.b.get(i10 - i11);
        }
        if (dl0Var != null) {
            return dl0Var.c;
        }
        fl0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == fl0Var.y) {
            return 2L;
        }
        if (i10 == fl0Var.v) {
            return 3L;
        }
        if (i10 == fl0Var.w) {
            return 4L;
        }
        if (i10 == fl0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.g0
    public final int j(int i10) {
        fl0 fl0Var = this.c;
        if (i10 >= fl0Var.E && i10 < fl0Var.F) {
            return 0;
        }
        fl0Var.getClass();
        if (i10 == 0 || i10 == fl0Var.y) {
            return 1;
        }
        if (i10 == fl0Var.v) {
            return 2;
        }
        return (i10 == fl0Var.w || i10 == fl0Var.x) ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        fl0 fl0Var = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = fl0Var.h;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            el0 el0Var = (el0) view;
            int i12 = fl0Var.E;
            dl0 dl0Var = (i10 < i12 || i10 >= fl0Var.F) ? null : (dl0) fl0Var.b.get(i10 - i12);
            int i13 = fl0Var.r;
            if (i10 >= i13 && i10 < fl0Var.s) {
                dl0Var = (dl0) fl0Var.a.get(i10 - i13);
            }
            if (dl0Var != null) {
                boolean z10 = el0Var.e == dl0Var;
                boolean z11 = dl0Var == fl0Var.H;
                boolean z12 = fl0Var.J.get(dl0Var.c) != null;
                el0Var.e = dl0Var;
                el0Var.a.setText(dl0Var.f);
                el0Var.d = i10 != fl0Var.F - 1;
                el0Var.b.a(z11, z10);
                el0Var.c.a(z12, z10);
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
                if (i10 == fl0Var.y) {
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
            el0 el0Var = new el0(context);
            RadioButton radioButton = new RadioButton(context);
            el0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.g7, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h7, c6Var));
            boolean z10 = LocaleController.isRTL;
            el0Var.addView(radioButton, w7.a6.a(22.0f, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f, 22, (z10 ? 5 : 3) | 16));
            org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 24, c6Var);
            el0Var.c = aqVar;
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            aqVar.b(-1, i11, org.telegram.ui.ActionBar.g6.k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            el0Var.addView(aqVar, w7.a6.a(26.0f, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f, 26, (z11 ? 5 : 3) | 16));
            aqVar.a(true, false);
            TextView textView = new TextView(context);
            el0Var.a = textView;
            org.telegram.messenger.yh.n(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            el0Var.addView(textView, w7.a6.a(-2.0f, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f, -2, (z12 ? 5 : 3) | 16));
            el0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
            view = el0Var;
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
            view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}

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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jk0 extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ mk0 c;

    public jk0(mk0 mk0Var) {
        this.c = mk0Var;
    }

    @Override // org.telegram.ui.Components.hm0
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
        kk0 kk0Var;
        mk0 mk0Var = this.c;
        int i11 = mk0Var.E;
        if (i10 < i11 || i10 >= mk0Var.F) {
            int i12 = mk0Var.r;
            kk0Var = (i10 < i12 || i10 >= mk0Var.s) ? null : (kk0) mk0Var.a.get(i10 - i12);
        } else {
            kk0Var = (kk0) mk0Var.b.get(i10 - i11);
        }
        if (kk0Var != null) {
            return kk0Var.c;
        }
        mk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == mk0Var.y) {
            return 2L;
        }
        if (i10 == mk0Var.v) {
            return 3L;
        }
        if (i10 == mk0Var.w) {
            return 4L;
        }
        if (i10 == mk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.g0
    public final int j(int i10) {
        mk0 mk0Var = this.c;
        if (i10 >= mk0Var.E && i10 < mk0Var.F) {
            return 0;
        }
        mk0Var.getClass();
        if (i10 == 0 || i10 == mk0Var.y) {
            return 1;
        }
        if (i10 == mk0Var.v) {
            return 2;
        }
        return (i10 == mk0Var.w || i10 == mk0Var.x) ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        mk0 mk0Var = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = mk0Var.h;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            lk0 lk0Var = (lk0) view;
            int i12 = mk0Var.E;
            kk0 kk0Var = (i10 < i12 || i10 >= mk0Var.F) ? null : (kk0) mk0Var.b.get(i10 - i12);
            int i13 = mk0Var.r;
            if (i10 >= i13 && i10 < mk0Var.s) {
                kk0Var = (kk0) mk0Var.a.get(i10 - i13);
            }
            if (kk0Var != null) {
                boolean z10 = lk0Var.e == kk0Var;
                boolean z11 = kk0Var == mk0Var.H;
                boolean z12 = mk0Var.J.get(kk0Var.c) != null;
                lk0Var.e = kk0Var;
                lk0Var.a.setText(kk0Var.f);
                lk0Var.d = i10 != mk0Var.F - 1;
                lk0Var.b.a(z11, z10);
                lk0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == mk0Var.y) {
                    l4Var.setText(LocaleController.getString(R.string.SystemTones));
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
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.k7, d6Var), mode));
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
        g2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        g2Var.b.setImageDrawable(zqVar);
        g2Var.c = false;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            lk0 lk0Var = new lk0(context);
            RadioButton radioButton = new RadioButton(context);
            lk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.g7, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h7, d6Var));
            boolean z10 = LocaleController.isRTL;
            lk0Var.addView(radioButton, w7.z5.a(22.0f, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f, 22, (z10 ? 5 : 3) | 16));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 24, d6Var);
            lk0Var.c = xpVar;
            int i11 = org.telegram.ui.ActionBar.h6.d6;
            xpVar.b(-1, i11, org.telegram.ui.ActionBar.h6.k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            lk0Var.addView(xpVar, w7.z5.a(26.0f, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f, 26, (z11 ? 5 : 3) | 16));
            xpVar.a(true, false);
            TextView textView = new TextView(context);
            lk0Var.a = textView;
            org.telegram.messenger.kk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            lk0Var.addView(textView, w7.z5.a(-2.0f, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f, -2, (z12 ? 5 : 3) | 16));
            lk0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            view = lk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, d6Var);
            g2Var.d = 61;
            g2Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            view = g2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, d6Var);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            view = l4Var;
        } else {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}

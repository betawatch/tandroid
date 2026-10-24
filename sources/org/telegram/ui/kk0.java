package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kk0 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ nk0 c;

    public kk0(nk0 nk0Var) {
        this.c = nk0Var;
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
        lk0 lk0Var;
        nk0 nk0Var = this.c;
        int i11 = nk0Var.E;
        if (i10 < i11 || i10 >= nk0Var.F) {
            int i12 = nk0Var.r;
            lk0Var = (i10 < i12 || i10 >= nk0Var.s) ? null : (lk0) nk0Var.a.get(i10 - i12);
        } else {
            lk0Var = (lk0) nk0Var.b.get(i10 - i11);
        }
        if (lk0Var != null) {
            return lk0Var.c;
        }
        nk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == nk0Var.y) {
            return 2L;
        }
        if (i10 == nk0Var.v) {
            return 3L;
        }
        if (i10 == nk0Var.w) {
            return 4L;
        }
        if (i10 == nk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.g0
    public final int j(int i10) {
        nk0 nk0Var = this.c;
        if (i10 >= nk0Var.E && i10 < nk0Var.F) {
            return 0;
        }
        nk0Var.getClass();
        if (i10 == 0 || i10 == nk0Var.y) {
            return 1;
        }
        if (i10 == nk0Var.v) {
            return 2;
        }
        return (i10 == nk0Var.w || i10 == nk0Var.x) ? 3 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        nk0 nk0Var = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = nk0Var.h;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            mk0 mk0Var = (mk0) view;
            int i12 = nk0Var.E;
            lk0 lk0Var = (i10 < i12 || i10 >= nk0Var.F) ? null : (lk0) nk0Var.b.get(i10 - i12);
            int i13 = nk0Var.r;
            if (i10 >= i13 && i10 < nk0Var.s) {
                lk0Var = (lk0) nk0Var.a.get(i10 - i13);
            }
            if (lk0Var != null) {
                boolean z10 = mk0Var.e == lk0Var;
                boolean z11 = lk0Var == nk0Var.H;
                boolean z12 = nk0Var.J.get(lk0Var.c) != null;
                mk0Var.e = lk0Var;
                mk0Var.a.setText(lk0Var.f);
                mk0Var.d = i10 != nk0Var.F - 1;
                mk0Var.b.a(z11, z10);
                mk0Var.c.a(z12, z10);
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
                if (i10 == nk0Var.y) {
                    l4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
        Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int i14 = org.telegram.ui.ActionBar.k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(f2Var, drawable, i14, g6Var, mode);
        org.telegram.ui.ActionBar.r6.z(f2Var, drawable2, org.telegram.ui.ActionBar.k6.k7, g6Var, mode);
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(drawable, drawable2);
        f2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        f2Var.b.setImageDrawable(yqVar);
        f2Var.c = false;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.g6 g6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            mk0 mk0Var = new mk0(context);
            RadioButton radioButton = new RadioButton(context);
            mk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            org.telegram.ui.ActionBar.r6.Q(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, g6Var);
            boolean z10 = LocaleController.isRTL;
            mk0Var.addView(radioButton, w7.z5.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 24, g6Var);
            mk0Var.c = xpVar;
            int i11 = org.telegram.ui.ActionBar.k6.d6;
            xpVar.b(-1, i11, org.telegram.ui.ActionBar.k6.k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            mk0Var.addView(xpVar, w7.z5.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            xpVar.a(true, false);
            TextView textView = new TextView(context);
            mk0Var.a = textView;
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
            org.telegram.messenger.sl.u(textView, 1, 16.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            mk0Var.addView(textView, w7.z5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            org.telegram.ui.ActionBar.r6.i(i11, mk0Var, g6Var);
            view = mk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, g6Var);
            f2Var.d = 61;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f2Var, g6Var);
            view = f2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, g6Var);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, g6Var);
            view = l4Var;
        } else {
            view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}

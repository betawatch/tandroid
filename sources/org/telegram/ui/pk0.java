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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pk0 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ sk0 c;

    public pk0(sk0 sk0Var) {
        this.c = sk0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.n;
    }

    @Override // s4.h0
    public final long i(int i10) {
        qk0 qk0Var;
        sk0 sk0Var = this.c;
        int i11 = sk0Var.E;
        if (i10 < i11 || i10 >= sk0Var.F) {
            int i12 = sk0Var.r;
            qk0Var = (i10 < i12 || i10 >= sk0Var.s) ? null : (qk0) sk0Var.a.get(i10 - i12);
        } else {
            qk0Var = (qk0) sk0Var.b.get(i10 - i11);
        }
        if (qk0Var != null) {
            return qk0Var.c;
        }
        sk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == sk0Var.y) {
            return 2L;
        }
        if (i10 == sk0Var.v) {
            return 3L;
        }
        if (i10 == sk0Var.w) {
            return 4L;
        }
        if (i10 == sk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // s4.h0
    public final int j(int i10) {
        sk0 sk0Var = this.c;
        if (i10 >= sk0Var.E && i10 < sk0Var.F) {
            return 0;
        }
        sk0Var.getClass();
        if (i10 == 0 || i10 == sk0Var.y) {
            return 1;
        }
        if (i10 == sk0Var.v) {
            return 2;
        }
        return (i10 == sk0Var.w || i10 == sk0Var.x) ? 3 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        sk0 sk0Var = this.c;
        org.telegram.ui.ActionBar.d6 d6Var = sk0Var.h;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            rk0 rk0Var = (rk0) view;
            int i12 = sk0Var.E;
            qk0 qk0Var = (i10 < i12 || i10 >= sk0Var.F) ? null : (qk0) sk0Var.b.get(i10 - i12);
            int i13 = sk0Var.r;
            if (i10 >= i13 && i10 < sk0Var.s) {
                qk0Var = (qk0) sk0Var.a.get(i10 - i13);
            }
            if (qk0Var != null) {
                boolean z10 = rk0Var.e == qk0Var;
                boolean z11 = qk0Var == sk0Var.H;
                boolean z12 = sk0Var.J.get(qk0Var.c) != null;
                rk0Var.e = qk0Var;
                rk0Var.a.setText(qk0Var.f);
                rk0Var.d = i10 != sk0Var.F - 1;
                rk0Var.b.a(z11, z10);
                rk0Var.c.a(z12, z10);
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
                if (i10 == sk0Var.y) {
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
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.N6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k7, d6Var), mode));
        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(drawable, drawable2);
        g2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        g2Var.b.setImageDrawable(qqVar);
        g2Var.c = false;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            rk0 rk0Var = new rk0(context);
            RadioButton radioButton = new RadioButton(context);
            rk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.g7, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h7, d6Var));
            boolean z10 = LocaleController.isRTL;
            rk0Var.addView(radioButton, w7.y5.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 24, d6Var);
            rk0Var.c = opVar;
            int i11 = org.telegram.ui.ActionBar.h6.d6;
            opVar.b(-1, i11, org.telegram.ui.ActionBar.h6.k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            rk0Var.addView(opVar, w7.y5.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            opVar.a(true, false);
            TextView textView = new TextView(context);
            rk0Var.a = textView;
            org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            rk0Var.addView(textView, w7.y5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            rk0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
            view = rk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, d6Var);
            g2Var.d = 61;
            g2Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            view = g2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var));
            view = m4Var;
        } else {
            view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}

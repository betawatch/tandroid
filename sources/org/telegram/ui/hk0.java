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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hk0 extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ kk0 c;

    public hk0(kk0 kk0Var) {
        this.c = kk0Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.n;
    }

    @Override // f2.q0
    public final long i(int i10) {
        ik0 ik0Var;
        kk0 kk0Var = this.c;
        int i11 = kk0Var.A;
        if (i10 < i11 || i10 >= kk0Var.B) {
            int i12 = kk0Var.r;
            ik0Var = (i10 < i12 || i10 >= kk0Var.s) ? null : (ik0) kk0Var.a.get(i10 - i12);
        } else {
            ik0Var = (ik0) kk0Var.b.get(i10 - i11);
        }
        if (ik0Var != null) {
            return ik0Var.c;
        }
        kk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == kk0Var.y) {
            return 2L;
        }
        if (i10 == kk0Var.v) {
            return 3L;
        }
        if (i10 == kk0Var.w) {
            return 4L;
        }
        if (i10 == kk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // f2.q0
    public final int j(int i10) {
        kk0 kk0Var = this.c;
        if (i10 >= kk0Var.A && i10 < kk0Var.B) {
            return 0;
        }
        kk0Var.getClass();
        if (i10 == 0 || i10 == kk0Var.y) {
            return 1;
        }
        if (i10 == kk0Var.v) {
            return 2;
        }
        return (i10 == kk0Var.w || i10 == kk0Var.x) ? 3 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        kk0 kk0Var = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = kk0Var.h;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            jk0 jk0Var = (jk0) view;
            int i12 = kk0Var.A;
            ik0 ik0Var = (i10 < i12 || i10 >= kk0Var.B) ? null : (ik0) kk0Var.b.get(i10 - i12);
            int i13 = kk0Var.r;
            if (i10 >= i13 && i10 < kk0Var.s) {
                ik0Var = (ik0) kk0Var.a.get(i10 - i13);
            }
            if (ik0Var != null) {
                boolean z10 = jk0Var.e == ik0Var;
                boolean z11 = ik0Var == kk0Var.D;
                boolean z12 = kk0Var.F.get(ik0Var.c) != null;
                jk0Var.e = ik0Var;
                jk0Var.a.setText(ik0Var.f);
                jk0Var.d = i10 != kk0Var.B - 1;
                jk0Var.b.a(z11, z10);
                jk0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == 0) {
                j4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == kk0Var.y) {
                    j4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
        Drawable drawable = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k7, c6Var), mode));
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawable, drawable2);
        e2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        e2Var.b.setImageDrawable(dqVar);
        e2Var.c = false;
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            jk0 jk0Var = new jk0(context);
            RadioButton radioButton = new RadioButton(context);
            jk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h7, c6Var));
            boolean z10 = LocaleController.isRTL;
            jk0Var.addView(radioButton, h7.z5.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 24, c6Var);
            jk0Var.c = bpVar;
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            bpVar.b(-1, i11, org.telegram.ui.ActionBar.g6.k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            jk0Var.addView(bpVar, h7.z5.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            bpVar.a(true, false);
            TextView textView = new TextView(context);
            jk0Var.a = textView;
            org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            jk0Var.addView(textView, h7.z5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            jk0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            view = jk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, c6Var);
            e2Var.d = 61;
            e2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            view = e2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            view = j4Var;
        } else {
            view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hk0 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ kk0 c;

    public hk0(kk0 kk0Var) {
        this.c = kk0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 2;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.n;
    }

    @Override // f2.r0
    public final long i(int i9) {
        ik0 ik0Var;
        kk0 kk0Var = this.c;
        int i10 = kk0Var.A;
        if (i9 < i10 || i9 >= kk0Var.B) {
            int i11 = kk0Var.r;
            ik0Var = (i9 < i11 || i9 >= kk0Var.s) ? null : (ik0) kk0Var.a.get(i9 - i11);
        } else {
            ik0Var = (ik0) kk0Var.b.get(i9 - i10);
        }
        if (ik0Var != null) {
            return ik0Var.c;
        }
        kk0Var.getClass();
        if (i9 == 0) {
            return 1L;
        }
        if (i9 == kk0Var.y) {
            return 2L;
        }
        if (i9 == kk0Var.v) {
            return 3L;
        }
        if (i9 == kk0Var.w) {
            return 4L;
        }
        if (i9 == kk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // f2.r0
    public final int j(int i9) {
        kk0 kk0Var = this.c;
        if (i9 >= kk0Var.A && i9 < kk0Var.B) {
            return 0;
        }
        kk0Var.getClass();
        if (i9 == 0 || i9 == kk0Var.y) {
            return 1;
        }
        if (i9 == kk0Var.v) {
            return 2;
        }
        return (i9 == kk0Var.w || i9 == kk0Var.x) ? 3 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        kk0 kk0Var = this.c;
        org.telegram.ui.ActionBar.b6 b6Var = kk0Var.h;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            jk0 jk0Var = (jk0) view;
            int i11 = kk0Var.A;
            ik0 ik0Var = (i9 < i11 || i9 >= kk0Var.B) ? null : (ik0) kk0Var.b.get(i9 - i11);
            int i12 = kk0Var.r;
            if (i9 >= i12 && i9 < kk0Var.s) {
                ik0Var = (ik0) kk0Var.a.get(i9 - i12);
            }
            if (ik0Var != null) {
                boolean z10 = jk0Var.e == ik0Var;
                boolean z11 = ik0Var == kk0Var.D;
                boolean z12 = kk0Var.F.get(ik0Var.c) != null;
                jk0Var.e = ik0Var;
                jk0Var.a.setText(ik0Var.f);
                jk0Var.d = i9 != kk0Var.B - 1;
                jk0Var.b.a(z11, z10);
                jk0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i9 == kk0Var.y) {
                    m4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
        Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k7, b6Var), mode));
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
        f2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        f2Var.b.setImageDrawable(fqVar);
        f2Var.c = false;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        org.telegram.ui.ActionBar.b6 b6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i9 == 0) {
            jk0 jk0Var = new jk0(context);
            RadioButton radioButton = new RadioButton(context);
            jk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.g7, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h7, b6Var));
            boolean z10 = LocaleController.isRTL;
            jk0Var.addView(radioButton, g7.e6.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 24, b6Var);
            jk0Var.c = dpVar;
            int i10 = org.telegram.ui.ActionBar.f6.d6;
            dpVar.b(-1, i10, org.telegram.ui.ActionBar.f6.k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            jk0Var.addView(dpVar, g7.e6.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            dpVar.a(true, false);
            TextView textView = new TextView(context);
            jk0Var.a = textView;
            org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            jk0Var.addView(textView, g7.e6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            jk0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            view = jk0Var;
        } else if (i9 == 2) {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, b6Var);
            f2Var.d = 61;
            f2Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
            view = f2Var;
        } else if (i9 != 3) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, b6Var);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
            view = m4Var;
        } else {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        }
        return j3.r0.s(view, view, -1, -2);
    }
}

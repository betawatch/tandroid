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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lk0 extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ ok0 c;

    public lk0(ok0 ok0Var) {
        this.c = ok0Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.n;
    }

    @Override // f2.o0
    public final long i(int i10) {
        mk0 mk0Var;
        ok0 ok0Var = this.c;
        int i11 = ok0Var.B;
        if (i10 < i11 || i10 >= ok0Var.C) {
            int i12 = ok0Var.r;
            mk0Var = (i10 < i12 || i10 >= ok0Var.s) ? null : (mk0) ok0Var.a.get(i10 - i12);
        } else {
            mk0Var = (mk0) ok0Var.b.get(i10 - i11);
        }
        if (mk0Var != null) {
            return mk0Var.c;
        }
        ok0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == ok0Var.y) {
            return 2L;
        }
        if (i10 == ok0Var.v) {
            return 3L;
        }
        if (i10 == ok0Var.w) {
            return 4L;
        }
        if (i10 == ok0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // f2.o0
    public final int j(int i10) {
        ok0 ok0Var = this.c;
        if (i10 >= ok0Var.B && i10 < ok0Var.C) {
            return 0;
        }
        ok0Var.getClass();
        if (i10 == 0 || i10 == ok0Var.y) {
            return 1;
        }
        if (i10 == ok0Var.v) {
            return 2;
        }
        return (i10 == ok0Var.w || i10 == ok0Var.x) ? 3 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ok0 ok0Var = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = ok0Var.h;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            nk0 nk0Var = (nk0) view;
            int i12 = ok0Var.B;
            mk0 mk0Var = (i10 < i12 || i10 >= ok0Var.C) ? null : (mk0) ok0Var.b.get(i10 - i12);
            int i13 = ok0Var.r;
            if (i10 >= i13 && i10 < ok0Var.s) {
                mk0Var = (mk0) ok0Var.a.get(i10 - i13);
            }
            if (mk0Var != null) {
                boolean z4 = nk0Var.e == mk0Var;
                boolean z10 = mk0Var == ok0Var.E;
                boolean z11 = ok0Var.G.get(mk0Var.c) != null;
                nk0Var.e = mk0Var;
                nk0Var.a.setText(mk0Var.f);
                nk0Var.d = i10 != ok0Var.C - 1;
                nk0Var.b.a(z10, z4);
                nk0Var.c.a(z11, z4);
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
                if (i10 == ok0Var.y) {
                    m4Var.setText(LocaleController.getString(R.string.SystemTones));
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
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(drawable, drawable2);
        f2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        f2Var.b.setImageDrawable(nqVar);
        f2Var.c = false;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            nk0 nk0Var = new nk0(context);
            RadioButton radioButton = new RadioButton(context);
            nk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h7, f6Var));
            boolean z4 = LocaleController.isRTL;
            nk0Var.addView(radioButton, k7.b6.d(22, 22.0f, (z4 ? 5 : 3) | 16, z4 ? 0 : 20, 0.0f, z4 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(context, 24, f6Var);
            nk0Var.c = lpVar;
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            lpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z10 = LocaleController.isRTL;
            nk0Var.addView(lpVar, k7.b6.d(26, 26.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 18, 0.0f, z10 ? 18 : 0, 0.0f));
            lpVar.a(true, false);
            TextView textView = new TextView(context);
            nk0Var.a = textView;
            b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            nk0Var.addView(textView, k7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 23 : 61, 0.0f, z11 ? 61 : 23, 0.0f));
            nk0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            view = nk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, f6Var);
            f2Var.d = 61;
            f2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = f2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, f6Var);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = m4Var;
        } else {
            view = new org.telegram.ui.Cells.z6(context, (b) null);
        }
        return yh.o(view, view, -1, -2);
    }
}

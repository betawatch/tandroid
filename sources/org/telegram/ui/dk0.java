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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dk0 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ gk0 c;

    public dk0(gk0 gk0Var) {
        this.c = gk0Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.n;
    }

    @Override // f2.p0
    public final long i(int i10) {
        ek0 ek0Var;
        gk0 gk0Var = this.c;
        int i11 = gk0Var.A;
        if (i10 < i11 || i10 >= gk0Var.B) {
            int i12 = gk0Var.r;
            ek0Var = (i10 < i12 || i10 >= gk0Var.s) ? null : (ek0) gk0Var.a.get(i10 - i12);
        } else {
            ek0Var = (ek0) gk0Var.b.get(i10 - i11);
        }
        if (ek0Var != null) {
            return ek0Var.c;
        }
        gk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == gk0Var.y) {
            return 2L;
        }
        if (i10 == gk0Var.v) {
            return 3L;
        }
        if (i10 == gk0Var.w) {
            return 4L;
        }
        if (i10 == gk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // f2.p0
    public final int j(int i10) {
        gk0 gk0Var = this.c;
        if (i10 >= gk0Var.A && i10 < gk0Var.B) {
            return 0;
        }
        gk0Var.getClass();
        if (i10 == 0 || i10 == gk0Var.y) {
            return 1;
        }
        if (i10 == gk0Var.v) {
            return 2;
        }
        return (i10 == gk0Var.w || i10 == gk0Var.x) ? 3 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        gk0 gk0Var = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = gk0Var.h;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            fk0 fk0Var = (fk0) view;
            int i12 = gk0Var.A;
            ek0 ek0Var = (i10 < i12 || i10 >= gk0Var.B) ? null : (ek0) gk0Var.b.get(i10 - i12);
            int i13 = gk0Var.r;
            if (i10 >= i13 && i10 < gk0Var.s) {
                ek0Var = (ek0) gk0Var.a.get(i10 - i13);
            }
            if (ek0Var != null) {
                boolean z10 = fk0Var.e == ek0Var;
                boolean z11 = ek0Var == gk0Var.D;
                boolean z12 = gk0Var.F.get(ek0Var.c) != null;
                fk0Var.e = ek0Var;
                fk0Var.a.setText(ek0Var.f);
                fk0Var.d = i10 != gk0Var.B - 1;
                fk0Var.b.a(z11, z10);
                fk0Var.c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == 0) {
                k4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == gk0Var.y) {
                    k4Var.setText(LocaleController.getString(R.string.SystemTones));
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
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(drawable, drawable2);
        e2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        e2Var.b.setImageDrawable(jqVar);
        e2Var.c = false;
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.c6 c6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            fk0 fk0Var = new fk0(context);
            RadioButton radioButton = new RadioButton(context);
            fk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h7, c6Var));
            boolean z10 = LocaleController.isRTL;
            fk0Var.addView(radioButton, i7.f6.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 24, c6Var);
            fk0Var.c = hpVar;
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            hpVar.b(-1, i11, org.telegram.ui.ActionBar.g6.k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            fk0Var.addView(hpVar, i7.f6.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            hpVar.a(true, false);
            TextView textView = new TextView(context);
            fk0Var.a = textView;
            b.m(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            fk0Var.addView(textView, i7.f6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            fk0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            view = fk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, c6Var);
            e2Var.d = 61;
            e2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            view = e2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, c6Var);
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            view = k4Var;
        } else {
            view = new org.telegram.ui.Cells.x6(context, (b) null);
        }
        return th.m(view, view, -1, -2);
    }
}

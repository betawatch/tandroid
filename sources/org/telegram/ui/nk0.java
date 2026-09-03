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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nk0 extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ qk0 c;

    public nk0(qk0 qk0Var) {
        this.c = qk0Var;
    }

    @Override // org.telegram.ui.Components.ql0
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
        ok0 ok0Var;
        qk0 qk0Var = this.c;
        int i11 = qk0Var.B;
        if (i10 < i11 || i10 >= qk0Var.C) {
            int i12 = qk0Var.r;
            ok0Var = (i10 < i12 || i10 >= qk0Var.s) ? null : (ok0) qk0Var.a.get(i10 - i12);
        } else {
            ok0Var = (ok0) qk0Var.b.get(i10 - i11);
        }
        if (ok0Var != null) {
            return ok0Var.c;
        }
        qk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == qk0Var.y) {
            return 2L;
        }
        if (i10 == qk0Var.v) {
            return 3L;
        }
        if (i10 == qk0Var.w) {
            return 4L;
        }
        if (i10 == qk0Var.x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override // f2.o0
    public final int j(int i10) {
        qk0 qk0Var = this.c;
        if (i10 >= qk0Var.B && i10 < qk0Var.C) {
            return 0;
        }
        qk0Var.getClass();
        if (i10 == 0 || i10 == qk0Var.y) {
            return 1;
        }
        if (i10 == qk0Var.v) {
            return 2;
        }
        return (i10 == qk0Var.w || i10 == qk0Var.x) ? 3 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        qk0 qk0Var = this.c;
        org.telegram.ui.ActionBar.f6 f6Var = qk0Var.h;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            pk0 pk0Var = (pk0) view;
            int i12 = qk0Var.B;
            ok0 ok0Var = (i10 < i12 || i10 >= qk0Var.C) ? null : (ok0) qk0Var.b.get(i10 - i12);
            int i13 = qk0Var.r;
            if (i10 >= i13 && i10 < qk0Var.s) {
                ok0Var = (ok0) qk0Var.a.get(i10 - i13);
            }
            if (ok0Var != null) {
                boolean z4 = pk0Var.e == ok0Var;
                boolean z10 = ok0Var == qk0Var.E;
                boolean z11 = qk0Var.G.get(ok0Var.c) != null;
                pk0Var.e = ok0Var;
                pk0Var.a.setText(ok0Var.f);
                pk0Var.d = i10 != qk0Var.C - 1;
                pk0Var.b.a(z10, z4);
                pk0Var.c.a(z11, z4);
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
                if (i10 == qk0Var.y) {
                    l4Var.setText(LocaleController.getString(R.string.SystemTones));
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
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, f6Var), mode));
        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
        e2Var.a.l(LocaleController.getString(R.string.UploadSound), false);
        e2Var.b.setImageDrawable(mqVar);
        e2Var.c = false;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var = this.c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            pk0 pk0Var = new pk0(context);
            RadioButton radioButton = new RadioButton(context);
            pk0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h7, f6Var));
            boolean z4 = LocaleController.isRTL;
            pk0Var.addView(radioButton, k7.b6.d(22, 22.0f, (z4 ? 5 : 3) | 16, z4 ? 0 : 20, 0.0f, z4 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(context, 24, f6Var);
            pk0Var.c = kpVar;
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            kpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
            boolean z10 = LocaleController.isRTL;
            pk0Var.addView(kpVar, k7.b6.d(26, 26.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 18, 0.0f, z10 ? 18 : 0, 0.0f));
            kpVar.a(true, false);
            TextView textView = new TextView(context);
            pk0Var.a = textView;
            b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            pk0Var.addView(textView, k7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 23 : 61, 0.0f, z11 ? 61 : 23, 0.0f));
            pk0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            view = pk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, f6Var);
            e2Var.d = 61;
            e2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = e2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            view = l4Var;
        } else {
            view = new org.telegram.ui.Cells.y6(context, (b) null);
        }
        return ai.n(view, view, -1, -2);
    }
}

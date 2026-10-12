package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wk0 extends pg.b {
    public final /* synthetic */ gl0 d;

    public wk0(gl0 gl0Var) {
        this.d = gl0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((xk0) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        if (i11 == 0 || i11 == 3) {
            el0 el0Var = (el0) b1Var.a;
            el0Var.setScaleX(1.0f);
            el0Var.setScaleY(1.0f);
            el0.a(el0Var, ((xk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        gl0 gl0Var = this.d;
        if (i10 == 1) {
            gl0Var.R = new FrameLayout(gl0Var.getContext());
            sg.c1 c1Var = new sg.c1(gl0Var.getContext(), 0, null);
            gl0Var.u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F8, false);
            int i11 = org.telegram.ui.ActionBar.g6.h5;
            c1Var.setColor(i0.a.d(0.7f, x02, org.telegram.ui.ActionBar.g6.x0(null, i11, false)));
            gl0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            gl0Var.u0.setScaleX(0.0f);
            gl0Var.u0.setScaleY(0.0f);
            gl0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            gl0Var.R.addView(gl0Var.u0, w7.a6.e(26, 26, 17));
            final int i12 = 0;
            gl0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk0
                public final /* synthetic */ wk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            wk0 wk0Var = this.b;
                            wk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            gl0 gl0Var2 = wk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            gl0Var2.getClass();
                            new sg.y0(gl0Var2.t0, 4, true).show();
                            break;
                        default:
                            gl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = gl0Var.R;
        } else if (i10 != 2) {
            view = new el0(gl0Var, gl0Var.getContext());
        } else {
            gl0Var.S = new ah.v(gl0Var, gl0Var.getContext());
            gs gsVar = new gs(gl0Var, gl0Var.getContext());
            gl0Var.v0 = gsVar;
            gsVar.setImageResource(R.drawable.msg_reactions_expand);
            gl0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = gl0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                gl0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                gl0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            gl0Var.v0.setBackground(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), 40)));
            gl0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            gl0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            gl0Var.S.addView(gl0Var.v0, w7.a6.e(30, 30, 17));
            final int i14 = 1;
            gl0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vk0
                public final /* synthetic */ wk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            wk0 wk0Var = this.b;
                            wk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            gl0 gl0Var2 = wk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            gl0Var2.getClass();
                            new sg.y0(gl0Var2.t0, 4, true).show();
                            break;
                        default:
                            gl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = gl0Var.S;
        }
        int topOffset = ((gl0Var.getLayoutParams().height - ((int) gl0Var.getTopOffset())) - gl0Var.getPaddingTop()) - gl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((el0) b1Var.a).f(((xk0) arrayList.get(b10)).c, false);
        }
    }
}

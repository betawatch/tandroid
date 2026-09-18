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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wj0 extends og.b {
    public final /* synthetic */ gk0 d;

    public wj0(gk0 gk0Var) {
        this.d = gk0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((xj0) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        if (i11 == 0 || i11 == 3) {
            ek0 ek0Var = (ek0) c1Var.a;
            ek0Var.setScaleX(1.0f);
            ek0Var.setScaleY(1.0f);
            ek0.a(ek0Var, ((xj0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        gk0 gk0Var = this.d;
        if (i10 == 1) {
            gk0Var.R = new FrameLayout(gk0Var.getContext());
            rg.b1 b1Var = new rg.b1(gk0Var.getContext(), 0, null);
            gk0Var.u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i11 = org.telegram.ui.ActionBar.j6.h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
            gk0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            gk0Var.u0.setScaleX(0.0f);
            gk0Var.u0.setScaleY(0.0f);
            gk0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            gk0Var.R.addView(gk0Var.u0, w7.x5.e(26, 26, 17));
            final int i12 = 0;
            gk0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vj0
                public final /* synthetic */ wj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            wj0 wj0Var = this.b;
                            wj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            gk0 gk0Var2 = wj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            gk0Var2.getClass();
                            new rg.x0(gk0Var2.t0, 4, true).show();
                            break;
                        default:
                            gk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = gk0Var.R;
        } else if (i10 != 2) {
            view = new ek0(gk0Var, gk0Var.getContext());
        } else {
            gk0Var.S = new ci.n6(gk0Var, gk0Var.getContext());
            sr srVar = new sr(gk0Var, gk0Var.getContext());
            gk0Var.v0 = srVar;
            srVar.setImageResource(R.drawable.msg_reactions_expand);
            gk0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = gk0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                gk0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                gk0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            gk0Var.v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 40)));
            gk0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            gk0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            gk0Var.S.addView(gk0Var.v0, w7.x5.e(30, 30, 17));
            final int i14 = 1;
            gk0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vj0
                public final /* synthetic */ wj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            wj0 wj0Var = this.b;
                            wj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            gk0 gk0Var2 = wj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            gk0Var2.getClass();
                            new rg.x0(gk0Var2.t0, 4, true).show();
                            break;
                        default:
                            gk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = gk0Var.S;
        }
        int topOffset = ((gk0Var.getLayoutParams().height - ((int) gk0Var.getTopOffset())) - gk0Var.getPaddingTop()) - gk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new wk0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((ek0) c1Var.a).f(((xj0) arrayList.get(b10)).c, false);
        }
    }
}

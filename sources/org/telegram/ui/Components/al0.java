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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class al0 extends og.b {
    public final /* synthetic */ kl0 d;

    public al0(kl0 kl0Var) {
        this.d = kl0Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        return ((bl0) this.d.d.get(i10)).a;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        if (i11 == 0 || i11 == 3) {
            il0 il0Var = (il0) d1Var.a;
            il0Var.setScaleX(1.0f);
            il0Var.setScaleY(1.0f);
            il0.a(il0Var, ((bl0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        kl0 kl0Var = this.d;
        if (i10 == 1) {
            kl0Var.R = new FrameLayout(kl0Var.getContext());
            rg.c1 c1Var = new rg.c1(kl0Var.getContext(), 0, null);
            kl0Var.u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.F8, false);
            int i11 = org.telegram.ui.ActionBar.i6.h5;
            c1Var.setColor(i0.a.d(0.7f, x02, org.telegram.ui.ActionBar.i6.x0(null, i11, false)));
            kl0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            kl0Var.u0.setScaleX(0.0f);
            kl0Var.u0.setScaleY(0.0f);
            kl0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            kl0Var.R.addView(kl0Var.u0, w7.x5.e(26, 26, 17));
            final int i12 = 0;
            kl0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zk0
                public final /* synthetic */ al0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            al0 al0Var = this.b;
                            al0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            kl0 kl0Var2 = al0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            kl0Var2.getClass();
                            new rg.y0(kl0Var2.t0, 4, true).show();
                            break;
                        default:
                            kl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = kl0Var.R;
        } else if (i10 != 2) {
            view = new il0(kl0Var, kl0Var.getContext());
        } else {
            kl0Var.S = new ci.m6(kl0Var, kl0Var.getContext());
            js jsVar = new js(kl0Var, kl0Var.getContext());
            kl0Var.v0 = jsVar;
            jsVar.setImageResource(R.drawable.msg_reactions_expand);
            kl0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = kl0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                kl0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                kl0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            kl0Var.v0.setBackground(org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false), 40)));
            kl0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            kl0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            kl0Var.S.addView(kl0Var.v0, w7.x5.e(30, 30, 17));
            final int i14 = 1;
            kl0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zk0
                public final /* synthetic */ al0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            al0 al0Var = this.b;
                            al0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            kl0 kl0Var2 = al0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            kl0Var2.getClass();
                            new rg.y0(kl0Var2.t0, 4, true).show();
                            break;
                        default:
                            kl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = kl0Var.S;
        }
        int topOffset = ((kl0Var.getLayoutParams().height - ((int) kl0Var.getTopOffset())) - kl0Var.getPaddingTop()) - kl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new am0(view);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = d1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = d1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((il0) d1Var.a).f(((bl0) arrayList.get(b10)).c, false);
        }
    }
}

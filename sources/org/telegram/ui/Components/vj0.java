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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vj0 extends pg.b {
    public final /* synthetic */ fk0 d;

    public vj0(fk0 fk0Var) {
        this.d = fk0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((wj0) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        if (i11 == 0 || i11 == 3) {
            dk0 dk0Var = (dk0) c1Var.a;
            dk0Var.setScaleX(1.0f);
            dk0Var.setScaleY(1.0f);
            dk0.a(dk0Var, ((wj0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        fk0 fk0Var = this.d;
        if (i10 == 1) {
            fk0Var.R = new FrameLayout(fk0Var.getContext());
            sg.e1 e1Var = new sg.e1(fk0Var.getContext(), 0, null);
            fk0Var.u0 = e1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i11 = org.telegram.ui.ActionBar.j6.h5;
            e1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
            fk0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            fk0Var.u0.setScaleX(0.0f);
            fk0Var.u0.setScaleY(0.0f);
            fk0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            fk0Var.R.addView(fk0Var.u0, w7.x5.e(26, 26, 17));
            final int i12 = 0;
            fk0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.uj0
                public final /* synthetic */ vj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            vj0 vj0Var = this.b;
                            vj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fk0 fk0Var2 = vj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fk0Var2.getClass();
                            new sg.a1(fk0Var2.t0, 4, true).show();
                            break;
                        default:
                            fk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = fk0Var.R;
        } else if (i10 != 2) {
            view = new dk0(fk0Var, fk0Var.getContext());
        } else {
            fk0Var.S = new ah.w(fk0Var, fk0Var.getContext());
            rr rrVar = new rr(fk0Var, fk0Var.getContext());
            fk0Var.v0 = rrVar;
            rrVar.setImageResource(R.drawable.msg_reactions_expand);
            fk0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = fk0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                fk0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                fk0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            fk0Var.v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 40)));
            fk0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            fk0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            fk0Var.S.addView(fk0Var.v0, w7.x5.e(30, 30, 17));
            final int i14 = 1;
            fk0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.uj0
                public final /* synthetic */ vj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            vj0 vj0Var = this.b;
                            vj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fk0 fk0Var2 = vj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fk0Var2.getClass();
                            new sg.a1(fk0Var2.t0, 4, true).show();
                            break;
                        default:
                            fk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = fk0Var.S;
        }
        int topOffset = ((fk0Var.getLayoutParams().height - ((int) fk0Var.getTopOffset())) - fk0Var.getPaddingTop()) - fk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new vk0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((dk0) c1Var.a).f(((wj0) arrayList.get(b10)).c, false);
        }
    }
}

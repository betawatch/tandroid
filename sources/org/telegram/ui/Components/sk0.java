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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class sk0 extends pg.b {
    public final /* synthetic */ cl0 d;

    public sk0(cl0 cl0Var) {
        this.d = cl0Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((tk0) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        if (i11 == 0 || i11 == 3) {
            al0 al0Var = (al0) b1Var.a;
            al0Var.setScaleX(1.0f);
            al0Var.setScaleY(1.0f);
            al0.a(al0Var, ((tk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        cl0 cl0Var = this.d;
        if (i10 == 1) {
            cl0Var.R = new FrameLayout(cl0Var.getContext());
            sg.c1 c1Var = new sg.c1(cl0Var.getContext(), 0, null);
            cl0Var.u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i11 = org.telegram.ui.ActionBar.h6.h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
            cl0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            cl0Var.u0.setScaleX(0.0f);
            cl0Var.u0.setScaleY(0.0f);
            cl0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            cl0Var.R.addView(cl0Var.u0, w7.z5.e(26, 26, 17));
            final int i12 = 0;
            cl0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk0
                public final /* synthetic */ sk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            sk0 sk0Var = this.b;
                            sk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            cl0 cl0Var2 = sk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            cl0Var2.getClass();
                            new sg.y0(cl0Var2.t0, 4, true).show();
                            break;
                        default:
                            cl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = cl0Var.R;
        } else if (i10 != 2) {
            view = new al0(cl0Var, cl0Var.getContext());
        } else {
            cl0Var.S = new ah.v(cl0Var, cl0Var.getContext());
            ds dsVar = new ds(cl0Var, cl0Var.getContext());
            cl0Var.v0 = dsVar;
            dsVar.setImageResource(R.drawable.msg_reactions_expand);
            cl0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = cl0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                cl0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                cl0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            cl0Var.v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 40)));
            cl0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            cl0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            cl0Var.S.addView(cl0Var.v0, w7.z5.e(30, 30, 17));
            final int i14 = 1;
            cl0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rk0
                public final /* synthetic */ sk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            sk0 sk0Var = this.b;
                            sk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            cl0 cl0Var2 = sk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            cl0Var2.getClass();
                            new sg.y0(cl0Var2.t0, 4, true).show();
                            break;
                        default:
                            cl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = cl0Var.S;
        }
        int topOffset = ((cl0Var.getLayoutParams().height - ((int) cl0Var.getTopOffset())) - cl0Var.getPaddingTop()) - cl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new sl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((al0) b1Var.a).f(((tk0) arrayList.get(b10)).c, false);
        }
    }
}

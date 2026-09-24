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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class gk0 extends og.b {
    public final /* synthetic */ qk0 d;

    public gk0(qk0 qk0Var) {
        this.d = qk0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((hk0) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        if (i11 == 0 || i11 == 3) {
            ok0 ok0Var = (ok0) c1Var.a;
            ok0Var.setScaleX(1.0f);
            ok0Var.setScaleY(1.0f);
            ok0.a(ok0Var, ((hk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        qk0 qk0Var = this.d;
        if (i10 == 1) {
            qk0Var.R = new FrameLayout(qk0Var.getContext());
            rg.b1 b1Var = new rg.b1(qk0Var.getContext(), 0, null);
            qk0Var.u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i11 = org.telegram.ui.ActionBar.h6.h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.h6.w0(null, i11, false)));
            qk0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            qk0Var.u0.setScaleX(0.0f);
            qk0Var.u0.setScaleY(0.0f);
            qk0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            qk0Var.R.addView(qk0Var.u0, w7.y5.e(26, 26, 17));
            final int i12 = 0;
            qk0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk0
                public final /* synthetic */ gk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            gk0 gk0Var = this.b;
                            gk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            qk0 qk0Var2 = gk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            qk0Var2.getClass();
                            new rg.x0(qk0Var2.t0, 4, true).show();
                            break;
                        default:
                            qk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = qk0Var.R;
        } else if (i10 != 2) {
            view = new ok0(qk0Var, qk0Var.getContext());
        } else {
            qk0Var.S = new ci.m6(qk0Var, qk0Var.getContext());
            tr trVar = new tr(qk0Var, qk0Var.getContext());
            qk0Var.v0 = trVar;
            trVar.setImageResource(R.drawable.msg_reactions_expand);
            qk0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = qk0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                qk0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                qk0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            qk0Var.v0.setBackground(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false), 40)));
            qk0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            qk0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            qk0Var.S.addView(qk0Var.v0, w7.y5.e(30, 30, 17));
            final int i14 = 1;
            qk0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk0
                public final /* synthetic */ gk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            gk0 gk0Var = this.b;
                            gk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            qk0 qk0Var2 = gk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            qk0Var2.getClass();
                            new rg.x0(qk0Var2.t0, 4, true).show();
                            break;
                        default:
                            qk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = qk0Var.S;
        }
        int topOffset = ((qk0Var.getLayoutParams().height - ((int) qk0Var.getTopOffset())) - qk0Var.getPaddingTop()) - qk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new gl0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((ok0) c1Var.a).f(((hk0) arrayList.get(b10)).c, false);
        }
    }
}

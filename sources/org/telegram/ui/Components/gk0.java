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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gk0 extends cg.c {
    public final /* synthetic */ qk0 d;

    public gk0(qk0 qk0Var) {
        this.d = qk0Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((hk0) this.d.d.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        if (i11 == 0 || i11 == 3) {
            ok0 ok0Var = (ok0) m1Var.a;
            ok0Var.setScaleX(1.0f);
            ok0Var.setScaleY(1.0f);
            ok0.a(ok0Var, ((hk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        qk0 qk0Var = this.d;
        if (i10 == 1) {
            qk0Var.O = new FrameLayout(qk0Var.getContext());
            fg.r1 r1Var = new fg.r1(qk0Var.getContext(), 0, null);
            qk0Var.r0 = r1Var;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.F8, false);
            int i11 = org.telegram.ui.ActionBar.k6.h5;
            r1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.k6.w0(null, i11, false)));
            qk0Var.r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            qk0Var.r0.setScaleX(0.0f);
            qk0Var.r0.setScaleY(0.0f);
            qk0Var.r0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            qk0Var.O.addView(qk0Var.r0, k7.c6.e(26, 26, 17));
            final int i12 = 0;
            qk0Var.r0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk0
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
                            new fg.n1(qk0Var2.q0, 4, true).show();
                            break;
                        default:
                            qk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = qk0Var.O;
        } else if (i10 != 2) {
            view = new ok0(qk0Var, qk0Var.getContext());
        } else {
            qk0Var.P = new ag.l(qk0Var, qk0Var.getContext());
            rr rrVar = new rr(qk0Var, qk0Var.getContext());
            qk0Var.s0 = rrVar;
            rrVar.setImageResource(R.drawable.msg_reactions_expand);
            qk0Var.s0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = qk0Var.J0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                qk0Var.s0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                qk0Var.s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            qk0Var.s0.setBackground(org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 40)));
            qk0Var.s0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            qk0Var.s0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            qk0Var.P.addView(qk0Var.s0, k7.c6.e(30, 30, 17));
            final int i14 = 1;
            qk0Var.s0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fk0
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
                            new fg.n1(qk0Var2.q0, 4, true).show();
                            break;
                        default:
                            qk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = qk0Var.P;
        }
        int topOffset = ((qk0Var.getLayoutParams().height - ((int) qk0Var.getTopOffset())) - qk0Var.getPaddingTop()) - qk0Var.getPaddingBottom();
        view.setLayoutParams(new f2.x0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new el0(view);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = m1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = m1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((ok0) m1Var.a).f(((hk0) arrayList.get(b10)).c, false);
        }
    }
}

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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ik0 extends og.b {
    public final /* synthetic */ sk0 d;

    public ik0(sk0 sk0Var) {
        this.d = sk0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((jk0) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        if (i11 == 0 || i11 == 3) {
            qk0 qk0Var = (qk0) c1Var.a;
            qk0Var.setScaleX(1.0f);
            qk0Var.setScaleY(1.0f);
            qk0.a(qk0Var, ((jk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        sk0 sk0Var = this.d;
        if (i10 == 1) {
            sk0Var.R = new FrameLayout(sk0Var.getContext());
            rg.b1 b1Var = new rg.b1(sk0Var.getContext(), 0, null);
            sk0Var.u0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i11 = org.telegram.ui.ActionBar.j6.h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
            sk0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            sk0Var.u0.setScaleX(0.0f);
            sk0Var.u0.setScaleY(0.0f);
            sk0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            sk0Var.R.addView(sk0Var.u0, w7.y5.e(26, 26, 17));
            final int i12 = 0;
            sk0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hk0
                public final /* synthetic */ ik0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            ik0 ik0Var = this.b;
                            ik0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            sk0 sk0Var2 = ik0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            sk0Var2.getClass();
                            new rg.x0(sk0Var2.t0, 4, true).show();
                            break;
                        default:
                            sk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = sk0Var.R;
        } else if (i10 != 2) {
            view = new qk0(sk0Var, sk0Var.getContext());
        } else {
            sk0Var.S = new ci.n6(sk0Var, sk0Var.getContext());
            sr srVar = new sr(sk0Var, sk0Var.getContext());
            sk0Var.v0 = srVar;
            srVar.setImageResource(R.drawable.msg_reactions_expand);
            sk0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = sk0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                sk0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                sk0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            sk0Var.v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 40)));
            sk0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            sk0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            sk0Var.S.addView(sk0Var.v0, w7.y5.e(30, 30, 17));
            final int i14 = 1;
            sk0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.hk0
                public final /* synthetic */ ik0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            ik0 ik0Var = this.b;
                            ik0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            sk0 sk0Var2 = ik0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            sk0Var2.getClass();
                            new rg.x0(sk0Var2.t0, 4, true).show();
                            break;
                        default:
                            sk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = sk0Var.S;
        }
        int topOffset = ((sk0Var.getLayoutParams().height - ((int) sk0Var.getTopOffset())) - sk0Var.getPaddingTop()) - sk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new il0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((qk0) c1Var.a).f(((jk0) arrayList.get(b10)).c, false);
        }
    }
}

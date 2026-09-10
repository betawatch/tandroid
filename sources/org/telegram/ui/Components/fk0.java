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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fk0 extends ng.b {
    public final /* synthetic */ pk0 d;

    public fk0(pk0 pk0Var) {
        this.d = pk0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((gk0) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        if (i11 == 0 || i11 == 3) {
            nk0 nk0Var = (nk0) c1Var.a;
            nk0Var.setScaleX(1.0f);
            nk0Var.setScaleY(1.0f);
            nk0.a(nk0Var, ((gk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        pk0 pk0Var = this.d;
        if (i10 == 1) {
            pk0Var.R = new FrameLayout(pk0Var.getContext());
            qg.e1 e1Var = new qg.e1(pk0Var.getContext(), 0, null);
            pk0Var.u0 = e1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i11 = org.telegram.ui.ActionBar.j6.h5;
            e1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
            pk0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            pk0Var.u0.setScaleX(0.0f);
            pk0Var.u0.setScaleY(0.0f);
            pk0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pk0Var.R.addView(pk0Var.u0, w7.a6.e(26, 26, 17));
            final int i12 = 0;
            pk0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ek0
                public final /* synthetic */ fk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            fk0 fk0Var = this.b;
                            fk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            pk0 pk0Var2 = fk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            pk0Var2.getClass();
                            new qg.a1(pk0Var2.t0, 4, true).show();
                            break;
                        default:
                            pk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = pk0Var.R;
        } else if (i10 != 2) {
            view = new nk0(pk0Var, pk0Var.getContext());
        } else {
            pk0Var.S = new bi.n7(pk0Var, pk0Var.getContext());
            yr yrVar = new yr(pk0Var, pk0Var.getContext());
            pk0Var.v0 = yrVar;
            yrVar.setImageResource(R.drawable.msg_reactions_expand);
            pk0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = pk0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                pk0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                pk0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            pk0Var.v0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 40)));
            pk0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            pk0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            pk0Var.S.addView(pk0Var.v0, w7.a6.e(30, 30, 17));
            final int i14 = 1;
            pk0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ek0
                public final /* synthetic */ fk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            fk0 fk0Var = this.b;
                            fk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            pk0 pk0Var2 = fk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            pk0Var2.getClass();
                            new qg.a1(pk0Var2.t0, 4, true).show();
                            break;
                        default:
                            pk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = pk0Var.S;
        }
        int topOffset = ((pk0Var.getLayoutParams().height - ((int) pk0Var.getTopOffset())) - pk0Var.getPaddingTop()) - pk0Var.getPaddingBottom();
        view.setLayoutParams(new s4.p0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new fl0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = c1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = c1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((nk0) c1Var.a).f(((gk0) arrayList.get(b10)).c, false);
        }
    }
}

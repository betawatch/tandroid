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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mj0 extends xf.b {
    public final /* synthetic */ wj0 d;

    public mj0(wj0 wj0Var) {
        this.d = wj0Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((nj0) this.d.d.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f;
        if (i11 == 0 || i11 == 3) {
            uj0 uj0Var = (uj0) o1Var.a;
            uj0Var.setScaleX(1.0f);
            uj0Var.setScaleY(1.0f);
            uj0.a(uj0Var, ((nj0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        wj0 wj0Var = this.d;
        if (i10 == 1) {
            wj0Var.N = new FrameLayout(wj0Var.getContext());
            ag.k2 k2Var = new ag.k2(wj0Var.getContext(), 0, null);
            wj0Var.q0 = k2Var;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F8, false);
            int i11 = org.telegram.ui.ActionBar.g6.h5;
            k2Var.setColor(i0.b.d(0.7f, w02, org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
            wj0Var.q0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            wj0Var.q0.setScaleX(0.0f);
            wj0Var.q0.setScaleY(0.0f);
            wj0Var.q0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            wj0Var.N.addView(wj0Var.q0, h7.z5.e(26, 26, 17));
            final int i12 = 0;
            wj0Var.q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lj0
                public final /* synthetic */ mj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            mj0 mj0Var = this.b;
                            mj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            wj0 wj0Var2 = mj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            wj0Var2.getClass();
                            new ag.g2(wj0Var2.p0, 4, true).show();
                            break;
                        default:
                            wj0.a(this.b.d);
                            break;
                    }
                }
            });
            view = wj0Var.N;
        } else if (i10 != 2) {
            view = new uj0(wj0Var, wj0Var.getContext());
        } else {
            wj0Var.O = new ag.y1(wj0Var, wj0Var.getContext());
            gr grVar = new gr(wj0Var, wj0Var.getContext());
            wj0Var.r0 = grVar;
            grVar.setImageResource(R.drawable.msg_reactions_expand);
            wj0Var.r0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = wj0Var.I0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                wj0Var.r0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                wj0Var.r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            wj0Var.r0.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(28.0f), 0, i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 40)));
            wj0Var.r0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            wj0Var.r0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            wj0Var.O.addView(wj0Var.r0, h7.z5.e(30, 30, 17));
            final int i14 = 1;
            wj0Var.r0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lj0
                public final /* synthetic */ mj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            mj0 mj0Var = this.b;
                            mj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            wj0 wj0Var2 = mj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            wj0Var2.getClass();
                            new ag.g2(wj0Var2.p0, 4, true).show();
                            break;
                        default:
                            wj0.a(this.b.d);
                            break;
                    }
                }
            });
            view = wj0Var.O;
        }
        int topOffset = ((wj0Var.getLayoutParams().height - ((int) wj0Var.getTopOffset())) - wj0Var.getPaddingTop()) - wj0Var.getPaddingBottom();
        view.setLayoutParams(new f2.y0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new lk0(view);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = o1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = o1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((uj0) o1Var.a).f(((nj0) arrayList.get(b10)).c, false);
        }
    }
}

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kj0 extends wf.b {
    public final /* synthetic */ uj0 d;

    public kj0(uj0 uj0Var) {
        this.d = uj0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((lj0) this.d.d.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        if (i10 == 0 || i10 == 3) {
            sj0 sj0Var = (sj0) q1Var.a;
            sj0Var.setScaleX(1.0f);
            sj0Var.setScaleY(1.0f);
            sj0.a(sj0Var, ((lj0) this.d.d.get(i9)).c, i9);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        uj0 uj0Var = this.d;
        if (i9 == 1) {
            uj0Var.N = new FrameLayout(uj0Var.getContext());
            zf.b1 b1Var = new zf.b1(uj0Var.getContext(), 0, null);
            uj0Var.q0 = b1Var;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.F8, false);
            int i10 = org.telegram.ui.ActionBar.f6.h5;
            b1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
            uj0Var.q0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
            uj0Var.q0.setScaleX(0.0f);
            uj0Var.q0.setScaleY(0.0f);
            uj0Var.q0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            uj0Var.N.addView(uj0Var.q0, g7.e6.e(26, 26, 17));
            final int i11 = 0;
            uj0Var.q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jj0
                public final /* synthetic */ kj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            kj0 kj0Var = this.b;
                            kj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            uj0 uj0Var2 = kj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            uj0Var2.getClass();
                            new zf.x0(uj0Var2.p0, 4, true).show();
                            break;
                        default:
                            uj0.a(this.b.d);
                            break;
                    }
                }
            });
            view = uj0Var.N;
        } else if (i9 != 2) {
            view = new sj0(uj0Var, uj0Var.getContext());
        } else {
            uj0Var.O = new fh.v(uj0Var, uj0Var.getContext());
            ir irVar = new ir(uj0Var, uj0Var.getContext());
            uj0Var.r0 = irVar;
            irVar.setImageResource(R.drawable.msg_reactions_expand);
            uj0Var.r0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i12 = uj0Var.I0;
            if (i12 == 1 || i12 == 2 || i12 == 4) {
                uj0Var.r0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                uj0Var.r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            uj0Var.r0.setBackground(org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 40)));
            uj0Var.r0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            uj0Var.r0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            uj0Var.O.addView(uj0Var.r0, g7.e6.e(30, 30, 17));
            final int i13 = 1;
            uj0Var.r0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jj0
                public final /* synthetic */ kj0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            kj0 kj0Var = this.b;
                            kj0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            uj0 uj0Var2 = kj0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            uj0Var2.getClass();
                            new zf.x0(uj0Var2.p0, 4, true).show();
                            break;
                        default:
                            uj0.a(this.b.d);
                            break;
                    }
                }
            });
            view = uj0Var.O;
        }
        int topOffset = ((uj0Var.getLayoutParams().height - ((int) uj0Var.getTopOffset())) - uj0Var.getPaddingTop()) - uj0Var.getPaddingBottom();
        view.setLayoutParams(new f2.a1(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i9 = q1Var.f;
        if ((i9 == 0 || i9 == 3) && (b10 = q1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((sj0) q1Var.a).f(((lj0) arrayList.get(b10)).c, false);
        }
    }
}

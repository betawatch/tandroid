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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fk0 extends bg.c {
    public final /* synthetic */ pk0 d;

    public fk0(pk0 pk0Var) {
        this.d = pk0Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((gk0) this.d.d.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        if (i11 == 0 || i11 == 3) {
            nk0 nk0Var = (nk0) l1Var.a;
            nk0Var.setScaleX(1.0f);
            nk0Var.setScaleY(1.0f);
            nk0.a(nk0Var, ((gk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        pk0 pk0Var = this.d;
        if (i10 == 1) {
            pk0Var.O = new FrameLayout(pk0Var.getContext());
            eg.s1 s1Var = new eg.s1(pk0Var.getContext(), 0, null);
            pk0Var.r0 = s1Var;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false);
            int i11 = org.telegram.ui.ActionBar.j6.h5;
            s1Var.setColor(i0.a.d(0.7f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
            pk0Var.r0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            pk0Var.r0.setScaleX(0.0f);
            pk0Var.r0.setScaleY(0.0f);
            pk0Var.r0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pk0Var.O.addView(pk0Var.r0, k7.b6.e(26, 26, 17));
            final int i12 = 0;
            pk0Var.r0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ek0
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
                            new eg.o1(pk0Var2.q0, 4, true).show();
                            break;
                        default:
                            pk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = pk0Var.O;
        } else if (i10 != 2) {
            view = new nk0(pk0Var, pk0Var.getContext());
        } else {
            pk0Var.P = new ah.e(pk0Var, pk0Var.getContext());
            or orVar = new or(pk0Var, pk0Var.getContext());
            pk0Var.s0 = orVar;
            orVar.setImageResource(R.drawable.msg_reactions_expand);
            pk0Var.s0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = pk0Var.J0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                pk0Var.s0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                pk0Var.s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            pk0Var.s0.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 40)));
            pk0Var.s0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            pk0Var.s0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            pk0Var.P.addView(pk0Var.s0, k7.b6.e(30, 30, 17));
            final int i14 = 1;
            pk0Var.s0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ek0
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
                            new eg.o1(pk0Var2.q0, 4, true).show();
                            break;
                        default:
                            pk0.a(this.b.d);
                            break;
                    }
                }
            });
            view = pk0Var.P;
        }
        int topOffset = ((pk0Var.getLayoutParams().height - ((int) pk0Var.getTopOffset())) - pk0Var.getPaddingTop()) - pk0Var.getPaddingBottom();
        view.setLayoutParams(new f2.w0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new dl0(view);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = l1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = l1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((nk0) l1Var.a).f(((gk0) arrayList.get(b10)).c, false);
        }
    }
}

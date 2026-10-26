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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vk0 extends qg.b {
    public final /* synthetic */ fl0 d;

    public vk0(fl0 fl0Var) {
        this.d = fl0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((wk0) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        if (i11 == 0 || i11 == 3) {
            dl0 dl0Var = (dl0) e1Var.a;
            dl0Var.setScaleX(1.0f);
            dl0Var.setScaleY(1.0f);
            dl0.a(dl0Var, ((wk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        fl0 fl0Var = this.d;
        if (i10 == 1) {
            fl0Var.R = new FrameLayout(fl0Var.getContext());
            tg.c1 c1Var = new tg.c1(fl0Var.getContext(), 0, null);
            fl0Var.u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.F8, false);
            int i11 = org.telegram.ui.ActionBar.y6.h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.y6.x0(null, i11, false)));
            org.telegram.ui.ActionBar.f7.t(fl0Var.u0, i11, null, PorterDuff.Mode.MULTIPLY);
            fl0Var.u0.setScaleX(0.0f);
            fl0Var.u0.setScaleY(0.0f);
            fl0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            fl0Var.R.addView(fl0Var.u0, gb1.i(26, 26, 17));
            final int i12 = 0;
            fl0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.uk0
                public final /* synthetic */ vk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            vk0 vk0Var = this.b;
                            vk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fl0 fl0Var2 = vk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fl0Var2.getClass();
                            new tg.y0(fl0Var2.t0, 4, true).show();
                            break;
                        default:
                            fl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = fl0Var.R;
        } else if (i10 != 2) {
            view = new dl0(fl0Var, fl0Var.getContext());
        } else {
            fl0Var.S = new bh.p(fl0Var, fl0Var.getContext());
            fs fsVar = new fs(fl0Var, fl0Var.getContext());
            fl0Var.v0 = fsVar;
            fsVar.setImageResource(R.drawable.msg_reactions_expand);
            fl0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = fl0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                fl0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                org.telegram.ui.ActionBar.f7.t(fl0Var.v0, org.telegram.ui.ActionBar.y6.h5, null, PorterDuff.Mode.MULTIPLY);
            }
            fs fsVar2 = fl0Var.v0;
            int dp = AndroidUtilities.dp(28.0f);
            int i14 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.f7.R(fsVar2, org.telegram.ui.ActionBar.y6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 40)), null, org.telegram.ui.ActionBar.f7.h(i14, 40), null);
            fl0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            fl0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            fl0Var.S.addView(fl0Var.v0, gb1.i(30, 30, 17));
            final int i15 = 1;
            fl0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.uk0
                public final /* synthetic */ vk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            vk0 vk0Var = this.b;
                            vk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            fl0 fl0Var2 = vk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            fl0Var2.getClass();
                            new tg.y0(fl0Var2.t0, 4, true).show();
                            break;
                        default:
                            fl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = fl0Var.S;
        }
        int topOffset = ((fl0Var.getLayoutParams().height - ((int) fl0Var.getTopOffset())) - fl0Var.getPaddingTop()) - fl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.q0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new vl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = e1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = e1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((dl0) e1Var.a).f(((wk0) arrayList.get(b10)).c, false);
        }
    }
}

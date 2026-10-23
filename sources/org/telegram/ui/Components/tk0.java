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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class tk0 extends pg.b {
    public final /* synthetic */ dl0 d;

    public tk0(dl0 dl0Var) {
        this.d = dl0Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((uk0) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        if (i11 == 0 || i11 == 3) {
            bl0 bl0Var = (bl0) b1Var.a;
            bl0Var.setScaleX(1.0f);
            bl0Var.setScaleY(1.0f);
            bl0.a(bl0Var, ((uk0) this.d.d.get(i10)).c, i10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        dl0 dl0Var = this.d;
        if (i10 == 1) {
            dl0Var.R = new FrameLayout(dl0Var.getContext());
            sg.c1 c1Var = new sg.c1(dl0Var.getContext(), 0, null);
            dl0Var.u0 = c1Var;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F8, false);
            int i11 = org.telegram.ui.ActionBar.h6.h5;
            c1Var.setColor(i0.a.f(0.7f, x02, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
            dl0Var.u0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            dl0Var.u0.setScaleX(0.0f);
            dl0Var.u0.setScaleY(0.0f);
            dl0Var.u0.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            dl0Var.R.addView(dl0Var.u0, w7.z5.e(26, 26, 17));
            final int i12 = 0;
            dl0Var.u0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk0
                public final /* synthetic */ tk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            tk0 tk0Var = this.b;
                            tk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            dl0 dl0Var2 = tk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            dl0Var2.getClass();
                            new sg.y0(dl0Var2.t0, 4, true).show();
                            break;
                        default:
                            dl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = dl0Var.R;
        } else if (i10 != 2) {
            view = new bl0(dl0Var, dl0Var.getContext());
        } else {
            dl0Var.S = new ah.v(dl0Var, dl0Var.getContext());
            ds dsVar = new ds(dl0Var, dl0Var.getContext());
            dl0Var.v0 = dsVar;
            dsVar.setImageResource(R.drawable.msg_reactions_expand);
            dl0Var.v0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i13 = dl0Var.M0;
            if (i13 == 1 || i13 == 2 || i13 == 4) {
                dl0Var.v0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            } else {
                dl0Var.v0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false), PorterDuff.Mode.MULTIPLY));
            }
            dl0Var.v0.setBackground(org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 40)));
            dl0Var.v0.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            dl0Var.v0.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
            dl0Var.S.addView(dl0Var.v0, w7.z5.e(30, 30, 17));
            final int i14 = 1;
            dl0Var.v0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sk0
                public final /* synthetic */ tk0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            tk0 tk0Var = this.b;
                            tk0Var.getClass();
                            view2.getLocationOnScreen(new int[2]);
                            dl0 dl0Var2 = tk0Var.d;
                            view2.getMeasuredWidth();
                            view2.getMeasuredHeight();
                            dl0Var2.getClass();
                            new sg.y0(dl0Var2.t0, 4, true).show();
                            break;
                        default:
                            dl0.a(this.b.d);
                            break;
                    }
                }
            });
            view = dl0Var.S;
        }
        int topOffset = ((dl0Var.getLayoutParams().height - ((int) dl0Var.getTopOffset())) - dl0Var.getPaddingTop()) - dl0Var.getPaddingBottom();
        view.setLayoutParams(new s4.o0(topOffset - AndroidUtilities.dp(12.0f), topOffset));
        return new tl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int b10;
        ArrayList arrayList = this.d.d;
        int i10 = b1Var.f;
        if ((i10 == 0 || i10 == 3) && (b10 = b1Var.b()) >= 0 && b10 < arrayList.size()) {
            ((bl0) b1Var.a).f(((uk0) arrayList.get(b10)).c, false);
        }
    }
}

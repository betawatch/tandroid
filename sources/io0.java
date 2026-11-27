// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class io0 extends FrameLayout {
    public final /* synthetic */ lo0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(lo0 lo0Var, Activity activity) {
        super(activity);
        this.a = lo0Var;
        final byte b = 0;
        setWillNotDraw(false);
        jo0 jo0Var = new jo0(lo0Var, getContext());
        jo0 jo0Var2 = new jo0(lo0Var, getContext());
        jo0 jo0Var3 = new jo0(lo0Var, getContext());
        jo0Var.c(R.drawable.filled_boost_plus, ob6.M0(2131753657, null));
        jo0Var2.c(R.drawable.filled_gift_premium, ob6.M0(2131749324, null));
        jo0Var3.c(R.drawable.filled_info, ob6.M0(2131750795, null));
        jo0Var.setOnClickListener(new View.OnClickListener(this) { // from class: ho0
            public final /* synthetic */ io0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vnb vnbVar;
                byte b2 = b;
                io0 io0Var = this.b;
                switch (b2) {
                    case 0:
                        lo0 lo0Var2 = io0Var.a;
                        long j = lo0Var2.S;
                        wg1 wg1Var = lo0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lo0Var2.U;
                        int i = l46.R2;
                        if (wg1Var != null && tL_premium_boostsStatus != null && lo0Var2.getParentActivity() != null) {
                            l46 l46Var = new l46(19, lo0Var2.getCurrentAccount(), lo0Var2.getResourceProvider(), lo0Var2.getParentActivity(), lo0Var2);
                            l46Var.s1(wg1Var);
                            l46Var.r1(tL_premium_boostsStatus, true);
                            l46Var.t1(j);
                            l46Var.b2 = null;
                            lo0Var2.showDialog(l46Var);
                            break;
                        }
                        break;
                    case 1:
                        lo0 lo0Var3 = io0Var.a;
                        lo0Var3.y0(true);
                        long j2 = lo0Var3.S;
                        vnbVar = ((e) lo0Var3).resourceProvider;
                        dn0.E0(lo0Var3, vnbVar, j2, null);
                        dn0.o1.I0 = new o1(io0Var, (byte) 5);
                        break;
                    default:
                        lo0 lo0Var4 = io0Var.a;
                        l46 l46Var2 = new l46(31, lo0Var4.T, lo0Var4.getResourceProvider(), io0Var.getContext(), lo0Var4);
                        l46Var2.r1(lo0Var4.U, true);
                        l46Var2.t1(lo0Var4.S);
                        lo0Var4.showDialog(l46Var2);
                        break;
                }
            }
        });
        final byte b2 = 1;
        jo0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ho0
            public final /* synthetic */ io0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vnb vnbVar;
                byte b22 = b2;
                io0 io0Var = this.b;
                switch (b22) {
                    case 0:
                        lo0 lo0Var2 = io0Var.a;
                        long j = lo0Var2.S;
                        wg1 wg1Var = lo0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lo0Var2.U;
                        int i = l46.R2;
                        if (wg1Var != null && tL_premium_boostsStatus != null && lo0Var2.getParentActivity() != null) {
                            l46 l46Var = new l46(19, lo0Var2.getCurrentAccount(), lo0Var2.getResourceProvider(), lo0Var2.getParentActivity(), lo0Var2);
                            l46Var.s1(wg1Var);
                            l46Var.r1(tL_premium_boostsStatus, true);
                            l46Var.t1(j);
                            l46Var.b2 = null;
                            lo0Var2.showDialog(l46Var);
                            break;
                        }
                        break;
                    case 1:
                        lo0 lo0Var3 = io0Var.a;
                        lo0Var3.y0(true);
                        long j2 = lo0Var3.S;
                        vnbVar = ((e) lo0Var3).resourceProvider;
                        dn0.E0(lo0Var3, vnbVar, j2, null);
                        dn0.o1.I0 = new o1(io0Var, (byte) 5);
                        break;
                    default:
                        lo0 lo0Var4 = io0Var.a;
                        l46 l46Var2 = new l46(31, lo0Var4.T, lo0Var4.getResourceProvider(), io0Var.getContext(), lo0Var4);
                        l46Var2.r1(lo0Var4.U, true);
                        l46Var2.t1(lo0Var4.S);
                        lo0Var4.showDialog(l46Var2);
                        break;
                }
            }
        });
        final byte b3 = 2;
        jo0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: ho0
            public final /* synthetic */ io0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vnb vnbVar;
                byte b22 = b3;
                io0 io0Var = this.b;
                switch (b22) {
                    case 0:
                        lo0 lo0Var2 = io0Var.a;
                        long j = lo0Var2.S;
                        wg1 wg1Var = lo0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lo0Var2.U;
                        int i = l46.R2;
                        if (wg1Var != null && tL_premium_boostsStatus != null && lo0Var2.getParentActivity() != null) {
                            l46 l46Var = new l46(19, lo0Var2.getCurrentAccount(), lo0Var2.getResourceProvider(), lo0Var2.getParentActivity(), lo0Var2);
                            l46Var.s1(wg1Var);
                            l46Var.r1(tL_premium_boostsStatus, true);
                            l46Var.t1(j);
                            l46Var.b2 = null;
                            lo0Var2.showDialog(l46Var);
                            break;
                        }
                        break;
                    case 1:
                        lo0 lo0Var3 = io0Var.a;
                        lo0Var3.y0(true);
                        long j2 = lo0Var3.S;
                        vnbVar = ((e) lo0Var3).resourceProvider;
                        dn0.E0(lo0Var3, vnbVar, j2, null);
                        dn0.o1.I0 = new o1(io0Var, (byte) 5);
                        break;
                    default:
                        lo0 lo0Var4 = io0Var.a;
                        l46 l46Var2 = new l46(31, lo0Var4.T, lo0Var4.getResourceProvider(), io0Var.getContext(), lo0Var4);
                        l46Var2.r1(lo0Var4.U, true);
                        l46Var2.t1(lo0Var4.S);
                        lo0Var4.showDialog(l46Var2);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(jo0Var, tre.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (uc7.s1(lo0Var.T).k4.W1.f && xc2.N(lo0Var.j0)) {
            linearLayout.addView(jo0Var2, tre.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(jo0Var3, tre.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, tre.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}

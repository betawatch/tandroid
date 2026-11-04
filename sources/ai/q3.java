package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q3 extends n61 {
    public final /* synthetic */ int W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(FrameLayout frameLayout, Context context, Object obj, int i3) {
        super(context, null);
        this.W = i3;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.n61
    public void a() {
        switch (this.W) {
            case 0:
                vp0 vp0Var = (vp0) this.b0;
                m61 m61Var = vp0Var.n;
                if (vp0Var.b() && m61Var != null) {
                    if (vp0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2.p1.k(2131750106, null, new StringBuilder("+ ")));
                        wp wpVar = new wp(R.drawable.poll_add_plus, 0);
                        wpVar.H = 0.8f;
                        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                        vp0Var.K = spannableStringBuilder;
                    }
                    m61Var.a(-1, vp0Var.K);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public boolean c(MotionEvent motionEvent) {
        boolean g7;
        switch (this.W) {
            case 0:
                g7 = ((vp0) this.b0).g();
                break;
            case 1:
                g7 = ((tp0) this.b0).H.F1;
                break;
            default:
                return super.c(motionEvent);
        }
        return !g7;
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        switch (this.W) {
            case 0:
                vp0 vp0Var = (vp0) this.b0;
                vp0Var.l();
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.a0;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).V();
                    View fragmentView = d2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                vp0Var.p();
                break;
            case 1:
                tp0 tp0Var = (tp0) this.b0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    tp0Var.H.W0();
                    break;
                }
                break;
            default:
                xp0 xp0Var = (xp0) this.a0;
                xp0Var.d.U0(((yp0) this.b0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void x(int i3) {
        switch (this.W) {
            case 1:
                tp0 tp0Var = (tp0) this.b0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    tp0Var.H.W0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void y(int i3, boolean z10) {
        switch (this.W) {
            case 2:
                xp0 xp0Var = (xp0) this.a0;
                int i10 = ((yp0) this.b0).b.c0.get(i3, -1);
                ws0 ws0Var = xp0Var.d;
                if (i10 > 0) {
                    ws0.t(ws0Var, ws0Var.v1(i10).a, z10);
                    break;
                } else {
                    ws0.t(ws0Var, 8, z10);
                    break;
                }
            default:
                super.y(i3, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void z(int i3) {
        switch (this.W) {
            case 0:
                ((vp0) this.b0).l();
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.a0;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).V();
                    break;
                }
                break;
            case 1:
                tp0 tp0Var = (tp0) this.b0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    tp0Var.H.W0();
                    break;
                }
                break;
            default:
                xp0 xp0Var = (xp0) this.a0;
                ((yp0) this.b0).b.c0.get(i3, -1);
                xp0Var.d.U0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(tp0 tp0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.b0 = tp0Var;
    }
}

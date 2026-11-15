package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f3 extends w61 {
    public final /* synthetic */ int W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.w61
    public void a() {
        switch (this.W) {
            case 0:
                wp0 wp0Var = (wp0) this.b0;
                v61 v61Var = wp0Var.n;
                if (wp0Var.b() && v61Var != null) {
                    if (wp0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750098, null, new StringBuilder("+ ")));
                        eq eqVar = new eq(R.drawable.poll_add_plus, 0);
                        eqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
                        wp0Var.K = spannableStringBuilder;
                    }
                    v61Var.a(-1, wp0Var.K);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public boolean b(MotionEvent motionEvent) {
        boolean g10;
        switch (this.W) {
            case 0:
                g10 = ((wp0) this.b0).g();
                break;
            case 1:
                g10 = ((vp0) this.b0).H.F1;
                break;
            default:
                return super.b(motionEvent);
        }
        return !g10;
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
        switch (this.W) {
            case 0:
                wp0 wp0Var = (wp0) this.b0;
                wp0Var.l();
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.a0;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W();
                    View fragmentView = e2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                wp0Var.p();
                break;
            case 1:
                vp0 vp0Var = (vp0) this.b0;
                String currentLang = vp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    vp0Var.H.Y0();
                    break;
                }
                break;
            default:
                yp0 yp0Var = (yp0) this.a0;
                yp0Var.d.V0(((zp0) this.b0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void v(int i7) {
        switch (this.W) {
            case 1:
                vp0 vp0Var = (vp0) this.b0;
                String currentLang = vp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    vp0Var.H.Y0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void w(int i7, boolean z10) {
        switch (this.W) {
            case 2:
                yp0 yp0Var = (yp0) this.a0;
                int i10 = ((zp0) this.b0).b.c0.get(i7, -1);
                ys0 ys0Var = yp0Var.d;
                if (i10 > 0) {
                    ys0.t(ys0Var, ys0Var.x1(i10).a, z10);
                    break;
                } else {
                    ys0.t(ys0Var, 8, z10);
                    break;
                }
            default:
                super.w(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void x(int i7) {
        switch (this.W) {
            case 0:
                ((wp0) this.b0).l();
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.a0;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W();
                    break;
                }
                break;
            case 1:
                vp0 vp0Var = (vp0) this.b0;
                String currentLang = vp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    vp0Var.H.Y0();
                    break;
                }
                break;
            default:
                yp0 yp0Var = (yp0) this.a0;
                ((zp0) this.b0).b.c0.get(i7, -1);
                yp0Var.d.V0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(vp0 vp0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.b0 = vp0Var;
    }
}

package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class a extends w61 {
    public final /* synthetic */ int V;
    public Object W;
    public final /* synthetic */ FrameLayout a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.V = i7;
        this.a0 = frameLayout;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.w61
    public final void A(int i7) {
        switch (this.V) {
            case 0:
                tp0 tp0Var = (tp0) this.a0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    tp0Var.G.Y0();
                    break;
                }
                break;
            case 1:
                yp0 yp0Var = (yp0) this.W;
                ((zp0) this.a0).b.b0.get(i7, -1);
                yp0Var.d.V0(1.0f);
                break;
            default:
                ((vp0) this.a0).l();
                f2 f2Var = (f2) this.W;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void a() {
        switch (this.V) {
            case 2:
                vp0 vp0Var = (vp0) this.a0;
                v61 v61Var = vp0Var.n;
                if (vp0Var.b() && v61Var != null) {
                    if (vp0Var.J == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131750098, null, new StringBuilder("+ ")));
                        wp wpVar = new wp(R.drawable.poll_add_plus, 0);
                        wpVar.G = 0.8f;
                        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                        vp0Var.J = spannableStringBuilder;
                    }
                    v61Var.a(-1, vp0Var.J);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public boolean b(MotionEvent motionEvent) {
        boolean z9;
        switch (this.V) {
            case 0:
                z9 = ((tp0) this.a0).G.E1;
                break;
            case 1:
            default:
                return super.b(motionEvent);
            case 2:
                z9 = ((vp0) this.a0).g();
                break;
        }
        return !z9;
    }

    @Override // org.telegram.ui.Components.w61
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                tp0 tp0Var = (tp0) this.a0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    tp0Var.G.Y0();
                    break;
                }
                break;
            case 1:
                yp0 yp0Var = (yp0) this.W;
                yp0Var.d.V0(((zp0) this.a0).b.getAnimatingIndicatorProgress());
                break;
            default:
                vp0 vp0Var = (vp0) this.a0;
                vp0Var.l();
                f2 f2Var = (f2) this.W;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).V();
                    View fragmentView = f2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                vp0Var.p();
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void y(int i7) {
        switch (this.V) {
            case 0:
                tp0 tp0Var = (tp0) this.a0;
                String currentLang = tp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    tp0Var.G.Y0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void z(int i7, boolean z9) {
        switch (this.V) {
            case 1:
                yp0 yp0Var = (yp0) this.W;
                int i10 = ((zp0) this.a0).b.b0.get(i7, -1);
                zs0 zs0Var = yp0Var.d;
                if (i10 > 0) {
                    zs0.t(zs0Var, zs0Var.x1(i10).a, z9);
                    break;
                } else {
                    zs0.t(zs0Var, 8, z9);
                    break;
                }
            default:
                super.z(i7, z9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tp0 tp0Var, Context context) {
        super(context, null);
        this.V = 0;
        this.a0 = tp0Var;
    }
}

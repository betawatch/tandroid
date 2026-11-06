package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.yp0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a extends v61 {
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

    @Override // org.telegram.ui.Components.v61
    public final void A(int i7) {
        switch (this.V) {
            case 0:
                sp0 sp0Var = (sp0) this.a0;
                String currentLang = sp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    sp0Var.G.W0();
                    break;
                }
                break;
            case 1:
                xp0 xp0Var = (xp0) this.W;
                ((yp0) this.a0).b.b0.get(i7, -1);
                xp0Var.d.U0(1.0f);
                break;
            default:
                ((up0) this.a0).l();
                f2 f2Var = (f2) this.W;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void a() {
        switch (this.V) {
            case 2:
                up0 up0Var = (up0) this.a0;
                u61 u61Var = up0Var.n;
                if (up0Var.b() && u61Var != null) {
                    if (up0Var.J == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jg.g.l(2131750097, null, new StringBuilder("+ ")));
                        wp wpVar = new wp(R.drawable.poll_add_plus, 0);
                        wpVar.G = 0.8f;
                        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
                        up0Var.J = spannableStringBuilder;
                    }
                    u61Var.a(-1, up0Var.J);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public boolean b(MotionEvent motionEvent) {
        boolean z9;
        switch (this.V) {
            case 0:
                z9 = ((sp0) this.a0).G.E1;
                break;
            case 1:
            default:
                return super.b(motionEvent);
            case 2:
                z9 = ((up0) this.a0).g();
                break;
        }
        return !z9;
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                sp0 sp0Var = (sp0) this.a0;
                String currentLang = sp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    sp0Var.G.W0();
                    break;
                }
                break;
            case 1:
                xp0 xp0Var = (xp0) this.W;
                xp0Var.d.U0(((yp0) this.a0).b.getAnimatingIndicatorProgress());
                break;
            default:
                up0 up0Var = (up0) this.a0;
                up0Var.l();
                f2 f2Var = (f2) this.W;
                if (f2Var instanceof ProfileActivity) {
                    ((ProfileActivity) f2Var).V();
                    View fragmentView = f2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                up0Var.p();
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void y(int i7) {
        switch (this.V) {
            case 0:
                sp0 sp0Var = (sp0) this.a0;
                String currentLang = sp0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.W, currentLang)) {
                    this.W = currentLang;
                    sp0Var.G.W0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void z(int i7, boolean z9) {
        switch (this.V) {
            case 1:
                xp0 xp0Var = (xp0) this.W;
                int i10 = ((yp0) this.a0).b.b0.get(i7, -1);
                xs0 xs0Var = xp0Var.d;
                if (i10 > 0) {
                    xs0.t(xs0Var, xs0Var.v1(i10).a, z9);
                    break;
                } else {
                    xs0.t(xs0Var, 8, z9);
                    break;
                }
            default:
                super.z(i7, z9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sp0 sp0Var, Context context) {
        super(context, null);
        this.V = 0;
        this.a0 = sp0Var;
    }
}

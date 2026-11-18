package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n5 extends g71 {
    public final /* synthetic */ int W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.g71
    public void a() {
        switch (this.W) {
            case 0:
                eq0 eq0Var = (eq0) this.b0;
                f71 f71Var = eq0Var.n;
                if (eq0Var.b() && f71Var != null) {
                    if (eq0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750082, null, new StringBuilder("+ ")));
                        lq lqVar = new lq(R.drawable.poll_add_plus, 0);
                        lqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
                        eq0Var.K = spannableStringBuilder;
                    }
                    f71Var.a(-1, eq0Var.K);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public boolean b(MotionEvent motionEvent) {
        boolean g10;
        switch (this.W) {
            case 0:
                g10 = ((eq0) this.b0).g();
                break;
            case 1:
                g10 = ((dq0) this.b0).H.F1;
                break;
            default:
                return super.b(motionEvent);
        }
        return !g10;
    }

    @Override // org.telegram.ui.Components.g71
    public final void s(boolean z10) {
        switch (this.W) {
            case 0:
                eq0 eq0Var = (eq0) this.b0;
                eq0Var.l();
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.a0;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).W();
                    View fragmentView = h2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                eq0Var.p();
                break;
            case 1:
                dq0 dq0Var = (dq0) this.b0;
                String currentLang = dq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    dq0Var.H.Y0();
                    break;
                }
                break;
            default:
                gq0 gq0Var = (gq0) this.a0;
                gq0Var.d.V0(((hq0) this.b0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void u(int i7) {
        switch (this.W) {
            case 1:
                dq0 dq0Var = (dq0) this.b0;
                String currentLang = dq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    dq0Var.H.Y0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void v(int i7, boolean z10) {
        switch (this.W) {
            case 2:
                gq0 gq0Var = (gq0) this.a0;
                int i10 = ((hq0) this.b0).b.c0.get(i7, -1);
                gt0 gt0Var = gq0Var.d;
                if (i10 > 0) {
                    gt0.t(gt0Var, gt0Var.x1(i10).a, z10);
                    break;
                } else {
                    gt0.t(gt0Var, 8, z10);
                    break;
                }
            default:
                super.v(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final void w(int i7) {
        switch (this.W) {
            case 0:
                ((eq0) this.b0).l();
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.a0;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).W();
                    break;
                }
                break;
            case 1:
                dq0 dq0Var = (dq0) this.b0;
                String currentLang = dq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    dq0Var.H.Y0();
                    break;
                }
                break;
            default:
                gq0 gq0Var = (gq0) this.a0;
                ((hq0) this.b0).b.c0.get(i7, -1);
                gq0Var.d.V0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(dq0 dq0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.b0 = dq0Var;
    }
}

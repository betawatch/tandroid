package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p5 extends j71 {
    public final /* synthetic */ int W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.j71
    public void a() {
        switch (this.W) {
            case 0:
                gq0 gq0Var = (gq0) this.b0;
                i71 i71Var = gq0Var.n;
                if (gq0Var.b() && i71Var != null) {
                    if (gq0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750081, null, new StringBuilder("+ ")));
                        nq nqVar = new nq(R.drawable.poll_add_plus, 0);
                        nqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
                        gq0Var.K = spannableStringBuilder;
                    }
                    i71Var.a(-1, gq0Var.K);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public boolean b(MotionEvent motionEvent) {
        boolean g10;
        switch (this.W) {
            case 0:
                g10 = ((gq0) this.b0).g();
                break;
            case 1:
                g10 = ((fq0) this.b0).H.F1;
                break;
            default:
                return super.b(motionEvent);
        }
        return !g10;
    }

    @Override // org.telegram.ui.Components.j71
    public final void s(boolean z10) {
        switch (this.W) {
            case 0:
                gq0 gq0Var = (gq0) this.b0;
                gq0Var.l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    View fragmentView = g2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                gq0Var.p();
                break;
            case 1:
                fq0 fq0Var = (fq0) this.b0;
                String currentLang = fq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    fq0Var.H.Y0();
                    break;
                }
                break;
            default:
                iq0 iq0Var = (iq0) this.a0;
                iq0Var.d.V0(((jq0) this.b0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void u(int i7) {
        switch (this.W) {
            case 1:
                fq0 fq0Var = (fq0) this.b0;
                String currentLang = fq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    fq0Var.H.Y0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void v(int i7, boolean z10) {
        switch (this.W) {
            case 2:
                iq0 iq0Var = (iq0) this.a0;
                int i10 = ((jq0) this.b0).b.c0.get(i7, -1);
                jt0 jt0Var = iq0Var.d;
                if (i10 > 0) {
                    jt0.t(jt0Var, jt0Var.x1(i10).a, z10);
                    break;
                } else {
                    jt0.t(jt0Var, 8, z10);
                    break;
                }
            default:
                super.v(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void w(int i7) {
        switch (this.W) {
            case 0:
                ((gq0) this.b0).l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    break;
                }
                break;
            case 1:
                fq0 fq0Var = (fq0) this.b0;
                String currentLang = fq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    fq0Var.H.Y0();
                    break;
                }
                break;
            default:
                iq0 iq0Var = (iq0) this.a0;
                ((jq0) this.b0).b.c0.get(i7, -1);
                iq0Var.d.V0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(fq0 fq0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.b0 = fq0Var;
    }
}

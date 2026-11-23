package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s5 extends k71 {
    public final /* synthetic */ int W;
    public Object a0;
    public final /* synthetic */ FrameLayout b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(FrameLayout frameLayout, Context context, Object obj, int i7) {
        super(context, null);
        this.W = i7;
        this.b0 = frameLayout;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.k71
    public void a() {
        switch (this.W) {
            case 0:
                fq0 fq0Var = (fq0) this.b0;
                j71 j71Var = fq0Var.n;
                if (fq0Var.b() && j71Var != null) {
                    if (fq0Var.K == null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i5.c.k(2131750081, null, new StringBuilder("+ ")));
                        kq kqVar = new kq(R.drawable.poll_add_plus, 0);
                        kqVar.H = 0.8f;
                        spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
                        fq0Var.K = spannableStringBuilder;
                    }
                    j71Var.a(-1, fq0Var.K);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public boolean b(MotionEvent motionEvent) {
        boolean g10;
        switch (this.W) {
            case 0:
                g10 = ((fq0) this.b0).g();
                break;
            case 1:
                g10 = ((eq0) this.b0).H.F1;
                break;
            default:
                return super.b(motionEvent);
        }
        return !g10;
    }

    @Override // org.telegram.ui.Components.k71
    public final void t(boolean z10) {
        switch (this.W) {
            case 0:
                fq0 fq0Var = (fq0) this.b0;
                fq0Var.l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    View fragmentView = g2Var.getFragmentView();
                    if (fragmentView != null) {
                        fragmentView.invalidate();
                    }
                }
                fq0Var.p();
                break;
            case 1:
                eq0 eq0Var = (eq0) this.b0;
                String currentLang = eq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    eq0Var.H.Y0();
                    break;
                }
                break;
            default:
                hq0 hq0Var = (hq0) this.a0;
                hq0Var.d.V0(((iq0) this.b0).b.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void v(int i7) {
        switch (this.W) {
            case 1:
                eq0 eq0Var = (eq0) this.b0;
                String currentLang = eq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    eq0Var.H.Y0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void w(int i7, boolean z10) {
        switch (this.W) {
            case 2:
                hq0 hq0Var = (hq0) this.a0;
                int i10 = ((iq0) this.b0).b.c0.get(i7, -1);
                it0 it0Var = hq0Var.d;
                if (i10 > 0) {
                    it0.t(it0Var, it0Var.x1(i10).a, z10);
                    break;
                } else {
                    it0.t(it0Var, 8, z10);
                    break;
                }
            default:
                super.w(i7, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public final void x(int i7) {
        switch (this.W) {
            case 0:
                ((fq0) this.b0).l();
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.a0;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).W();
                    break;
                }
                break;
            case 1:
                eq0 eq0Var = (eq0) this.b0;
                String currentLang = eq0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.a0, currentLang)) {
                    this.a0 = currentLang;
                    eq0Var.H.Y0();
                    break;
                }
                break;
            default:
                hq0 hq0Var = (hq0) this.a0;
                ((iq0) this.b0).b.c0.get(i7, -1);
                hq0Var.d.V0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(eq0 eq0Var, Context context) {
        super(context, null);
        this.W = 1;
        this.b0 = eq0Var;
    }
}

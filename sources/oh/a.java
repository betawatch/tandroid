package oh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.yu0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a extends l81 {
    public final /* synthetic */ int Q = 0;
    public Object R;
    public final /* synthetic */ FrameLayout S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr0 sr0Var, Context context, rr0 rr0Var) {
        super(context, null);
        this.S = sr0Var;
        this.R = rr0Var;
    }

    @Override // org.telegram.ui.Components.l81
    public boolean i(MotionEvent motionEvent) {
        switch (this.Q) {
            case 0:
                return !((nr0) this.S).D.z1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void w(boolean z4) {
        switch (this.Q) {
            case 0:
                nr0 nr0Var = (nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    break;
                }
                break;
            default:
                rr0 rr0Var = (rr0) this.R;
                rr0Var.d.J0(((sr0) this.S).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void x(int i10) {
        switch (this.Q) {
            case 0:
                nr0 nr0Var = (nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void y(int i10, boolean z4) {
        switch (this.Q) {
            case 1:
                rr0 rr0Var = (rr0) this.R;
                int i11 = ((sr0) this.S).n.V.get(i10, -1);
                yu0 yu0Var = rr0Var.d;
                if (i11 > 0) {
                    yu0.t(yu0Var, yu0Var.i1(i11).a, z4);
                    break;
                } else {
                    yu0.t(yu0Var, 8, z4);
                    break;
                }
            default:
                super.y(i10, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public final void z(int i10) {
        switch (this.Q) {
            case 0:
                nr0 nr0Var = (nr0) this.S;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.R, currentLang)) {
                    this.R = currentLang;
                    nr0Var.D.L0();
                    break;
                }
                break;
            default:
                rr0 rr0Var = (rr0) this.R;
                ((sr0) this.S).n.V.get(i10, -1);
                rr0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nr0 nr0Var, Context context) {
        super(context, null);
        this.S = nr0Var;
    }
}

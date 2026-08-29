package mh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a extends z71 {
    public final /* synthetic */ int P = 0;
    public Object Q;
    public final /* synthetic */ FrameLayout R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kr0 kr0Var, Context context, jr0 jr0Var) {
        super(context, null);
        this.R = kr0Var;
        this.Q = jr0Var;
    }

    @Override // org.telegram.ui.Components.z71
    public boolean i(MotionEvent motionEvent) {
        switch (this.P) {
            case 0:
                return !((fr0) this.R).C.y1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final void w(boolean z10) {
        switch (this.P) {
            case 0:
                fr0 fr0Var = (fr0) this.R;
                String currentLang = fr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    fr0Var.C.L0();
                    break;
                }
                break;
            default:
                jr0 jr0Var = (jr0) this.Q;
                jr0Var.d.J0(((kr0) this.R).n.getAnimatingIndicatorProgress());
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void x(int i10) {
        switch (this.P) {
            case 0:
                fr0 fr0Var = (fr0) this.R;
                String currentLang = fr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    fr0Var.C.L0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void y(int i10, boolean z10) {
        switch (this.P) {
            case 1:
                jr0 jr0Var = (jr0) this.Q;
                int i11 = ((kr0) this.R).n.U.get(i10, -1);
                qu0 qu0Var = jr0Var.d;
                if (i11 > 0) {
                    qu0.t(qu0Var, qu0Var.i1(i11).a, z10);
                    break;
                } else {
                    qu0.t(qu0Var, 8, z10);
                    break;
                }
            default:
                super.y(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final void z(int i10) {
        switch (this.P) {
            case 0:
                fr0 fr0Var = (fr0) this.R;
                String currentLang = fr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    fr0Var.C.L0();
                    break;
                }
                break;
            default:
                jr0 jr0Var = (jr0) this.Q;
                ((kr0) this.R).n.U.get(i10, -1);
                jr0Var.d.J0(1.0f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fr0 fr0Var, Context context) {
        super(context, null);
        this.R = fr0Var;
    }
}

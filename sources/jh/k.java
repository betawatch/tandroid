package jh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.g1;
import f2.n1;
import f2.y;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k extends y {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ci ciVar, int i9, int i10) {
        super(i9);
        this.Q = i10;
        this.R = ciVar;
    }

    @Override // f2.m0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((cx0) this.R).S != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // f2.y, f2.m0, f2.z0
    public int o0(int i9, g1 g1Var, n1 n1Var) {
        switch (this.Q) {
            case 0:
                if (((q) this.R).b) {
                    i9 = 0;
                }
                return super.o0(i9, g1Var, n1Var);
            default:
                return super.o0(i9, g1Var, n1Var);
        }
    }

    @Override // f2.m0, f2.z0
    public void v0(RecyclerView recyclerView, n1 n1Var, int i9) {
        switch (this.Q) {
            case 1:
                wi wiVar = new wi(this, recyclerView.getContext());
                wiVar.a = i9;
                w0(wiVar);
                break;
            case 2:
                ql qlVar = new ql(this, recyclerView.getContext());
                qlVar.a = i9;
                w0(qlVar);
                break;
            default:
                super.v0(recyclerView, n1Var, i9);
                break;
        }
    }

    @Override // f2.y, f2.m0, f2.z0
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return super.y0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cx0 cx0Var) {
        super(5);
        this.Q = 3;
        this.R = cx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar) {
        super(3);
        this.Q = 0;
        this.R = qVar;
    }
}

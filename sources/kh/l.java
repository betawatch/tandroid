package kh;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import f2.e1;
import f2.l1;
import f2.x;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.yh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l extends x {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(yh yhVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = yhVar;
    }

    @Override // f2.k0
    public boolean Y0() {
        switch (this.Q) {
            case 3:
                return ((ex0) this.R).S != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // f2.x, f2.k0, f2.x0
    public int o0(int i10, e1 e1Var, l1 l1Var) {
        switch (this.Q) {
            case 0:
                if (((r) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, e1Var, l1Var);
            default:
                return super.o0(i10, e1Var, l1Var);
        }
    }

    @Override // f2.k0, f2.x0
    public void v0(RecyclerView recyclerView, l1 l1Var, int i10) {
        switch (this.Q) {
            case 1:
                si siVar = new si(this, recyclerView.getContext());
                siVar.a = i10;
                w0(siVar);
                break;
            case 2:
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.a = i10;
                w0(mlVar);
                break;
            default:
                super.v0(recyclerView, l1Var, i10);
                break;
        }
    }

    @Override // f2.x, f2.k0, f2.x0
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
    public l(ex0 ex0Var) {
        super(5);
        this.Q = 3;
        this.R = ex0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar) {
        super(3);
        this.Q = 0;
        this.R = rVar;
    }
}

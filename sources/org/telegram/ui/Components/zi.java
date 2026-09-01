package org.telegram.ui.Components;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zi extends f2.w {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi(ei eiVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = eiVar;
    }

    @Override // f2.j0
    public boolean Y0() {
        switch (this.Q) {
            case 2:
                return ((yx0) this.R).T != null && LocaleController.isRTL;
            default:
                return super.Y0();
        }
    }

    @Override // f2.w, f2.j0, f2.w0
    public int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        switch (this.Q) {
            case 3:
                if (((ph.l) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, fVar, j1Var);
            default:
                return super.o0(i10, fVar, j1Var);
        }
    }

    @Override // f2.j0, f2.w0
    public void v0(RecyclerView recyclerView, f2.j1 j1Var, int i10) {
        switch (this.Q) {
            case 0:
                yi yiVar = new yi(this, recyclerView.getContext());
                yiVar.a = i10;
                w0(yiVar);
                break;
            case 1:
                xl xlVar = new xl(this, recyclerView.getContext());
                xlVar.a = i10;
                w0(xlVar);
                break;
            default:
                super.v0(recyclerView, j1Var, i10);
                break;
        }
    }

    @Override // f2.w, f2.j0, f2.w0
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
            default:
                return super.y0();
            case 3:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(yx0 yx0Var) {
        super(5);
        this.Q = 2;
        this.R = yx0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(ph.l lVar) {
        super(3);
        this.Q = 3;
        this.R = lVar;
    }
}

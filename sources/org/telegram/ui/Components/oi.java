package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oi extends s4.r {
    public final /* synthetic */ int Q;
    public final /* synthetic */ KeyEvent.Callback R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(int i10, FrameLayout frameLayout) {
        super(3);
        this.Q = i10;
        this.R = frameLayout;
    }

    @Override // s4.a0
    public boolean Y0() {
        switch (this.Q) {
            case 2:
                return ((cx0) this.R).N1 != null && org.telegram.messenger.cd.X;
            default:
                return super.Y0();
        }
    }

    @Override // s4.r, s4.a0, s4.n0
    public void b0(hf.e eVar, s4.z0 z0Var) {
        switch (this.Q) {
            case 4:
                super.b0(eVar, z0Var);
                vh.k2 k2Var = (vh.k2) this.R;
                if (k2Var.U) {
                    k2Var.U = false;
                    k2Var.a();
                    break;
                }
                break;
            default:
                super.b0(eVar, z0Var);
                break;
        }
    }

    @Override // s4.r, s4.a0, s4.n0
    public int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        switch (this.Q) {
            case 3:
                if (((uh.i) this.R).b) {
                    i10 = 0;
                }
                return super.o0(i10, eVar, z0Var);
            default:
                return super.o0(i10, eVar, z0Var);
        }
    }

    @Override // s4.a0, s4.n0
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                ni niVar = new ni(this, recyclerView.getContext());
                niVar.a = i10;
                w0(niVar);
                break;
            case 1:
                vl vlVar = new vl(this, recyclerView.getContext());
                vlVar.a = i10;
                w0(vlVar);
                break;
            default:
                super.v0(recyclerView, z0Var, i10);
                break;
        }
    }

    @Override // s4.r, s4.a0, s4.n0
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
    public /* synthetic */ oi(uh uhVar, int i10, int i11) {
        super(i10);
        this.Q = i11;
        this.R = uhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(cx0 cx0Var) {
        super(5);
        this.Q = 2;
        this.R = cx0Var;
    }
}

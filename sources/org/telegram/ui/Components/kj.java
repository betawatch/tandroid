package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kj extends dw0 {
    public final /* synthetic */ int K = 2;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(xj xjVar, Context context, zz zzVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, zzVar, 1, p6Var);
        this.L = xjVar;
    }

    @Override // org.telegram.ui.Components.dw0
    public void e(boolean z10, boolean z11) {
        switch (this.K) {
            case 1:
                pb1 pb1Var = (pb1) this.L;
                super.e(z10, z11);
                if (!z11) {
                    ((TextView) pb1Var.n.d).animate().cancel();
                    ((TextView) pb1Var.n.d).setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) pb1Var.n.d).animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.K) {
            case 0:
                return super.getTranslationY() - ((xj) this.L).M;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.K) {
            case 2:
                th.y3 y3Var = ((th.u3) this.L).d;
                super.onMeasure(i10, org.telegram.messenger.z20.c(y3Var.e, y3Var.n - y3Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.K) {
            case 0:
                super.setTranslationY(f7 + ((xj) this.L).M);
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(int i10, Context context, th.b bVar, th.u3 u3Var) {
        super(context, null, i10, bVar);
        this.L = u3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(pb1 pb1Var, Context context, zz zzVar) {
        super(context, zzVar, 0, null);
        this.L = pb1Var;
    }
}

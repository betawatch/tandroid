package fi;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w4 extends mv0 {
    public final /* synthetic */ int L = 0;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(kk kkVar, Context context, vz vzVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, vzVar, 1, i6Var);
        this.M = kkVar;
    }

    @Override // org.telegram.ui.Components.mv0
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                w91 w91Var = (w91) this.M;
                super.e(z10, z11);
                if (!z11) {
                    ((TextView) w91Var.n.d).animate().cancel();
                    ((TextView) w91Var.n.d).setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) w91Var.n.d).animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.L) {
            case 1:
                return super.getTranslationY() - ((kk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                b5 b5Var = ((x4) this.M).d;
                super.onMeasure(i7, m10.c(b5Var.e, b5Var.n - b5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.L) {
            case 1:
                super.setTranslationY(f10 + ((kk) this.M).N);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(int i7, Context context, b bVar, x4 x4Var) {
        super(context, null, i7, bVar);
        this.M = x4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(w91 w91Var, Context context, vz vzVar) {
        super(context, vzVar, 0, null);
        this.M = w91Var;
    }
}

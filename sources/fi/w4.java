package fi;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class w4 extends nv0 {
    public final /* synthetic */ int L = 0;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(mk mkVar, Context context, yz yzVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, yzVar, 1, h6Var);
        this.M = mkVar;
    }

    @Override // org.telegram.ui.Components.nv0
    public void e(boolean z10, boolean z11) {
        switch (this.L) {
            case 2:
                y91 y91Var = (y91) this.M;
                super.e(z10, z11);
                if (!z11) {
                    ((TextView) y91Var.n.d).animate().cancel();
                    ((TextView) y91Var.n.d).setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) y91Var.n.d).animate().alpha(z10 ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((mk) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.L) {
            case 0:
                b5 b5Var = ((x4) this.M).d;
                super.onMeasure(i7, o10.c(b5Var.e, b5Var.n - b5Var.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f10 + ((mk) this.M).N);
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
    public w4(y91 y91Var, Context context, yz yzVar) {
        super(context, yzVar, 0, null);
        this.M = y91Var;
    }
}

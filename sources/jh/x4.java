package jh;

import android.content.Context;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x4 extends iw0 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(bk bkVar, Context context, h00 h00Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, h00Var, 1, c6Var);
        this.H = bkVar;
    }

    @Override // org.telegram.ui.Components.iw0
    public void e(boolean z10, boolean z11) {
        switch (this.G) {
            case 2:
                we1 we1Var = (we1) this.H;
                super.e(z10, z11);
                if (!z11) {
                    we1Var.n.a.animate().cancel();
                    we1Var.n.a.setAlpha(z10 ? 0.0f : 1.0f);
                    break;
                } else {
                    we1Var.n.a.animate().alpha(z10 ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z10, z11);
                break;
        }
    }

    @Override // android.view.View
    public float getTranslationY() {
        switch (this.G) {
            case 1:
                return super.getTranslationY() - ((bk) this.H).I;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                c5 c5Var = ((y4) this.H).d;
                super.onMeasure(i10, rl.d(c5Var.e, c5Var.n - c5Var.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.G) {
            case 1:
                super.setTranslationY(f10 + ((bk) this.H).I);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(int i10, Context context, b bVar, y4 y4Var) {
        super(context, null, i10, bVar);
        this.H = y4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(we1 we1Var, Context context, h00 h00Var) {
        super(context, h00Var, 0, null);
        this.H = we1Var;
    }
}

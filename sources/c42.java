// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c42 extends a1b {
    public final /* synthetic */ byte L = 1;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c42(sxb sxbVar, Context context, tk4 tk4Var) {
        super(context, tk4Var, 0, null);
        this.M = sxbVar;
    }

    @Override // a1b
    public final void e(boolean z, boolean z2) {
        switch (this.L) {
            case 2:
                super.e(z, z2);
                sxb sxbVar = (sxb) this.M;
                uvb uvbVar = sxbVar.n;
                if (!z2) {
                    ((TextView) uvbVar.d).animate().cancel();
                    ((TextView) sxbVar.n.d).setAlpha(z ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) uvbVar.d).animate().alpha(z ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z, z2);
                break;
        }
    }

    @Override // android.view.View
    public final float getTranslationY() {
        switch (this.L) {
            case 0:
                return super.getTranslationY() - ((p42) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.L) {
            case 1:
                i2a i2aVar = ((e2a) this.M).d;
                super.onMeasure(i, wi8.f(i2aVar.e, i2aVar.n - i2aVar.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.L) {
            case 0:
                super.setTranslationY(f + ((p42) this.M).N);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c42(int i, r63 r63Var, e2a e2aVar, Context context) {
        super(context, null, i, r63Var);
        this.M = e2aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c42(p42 p42Var, Context context, tk4 tk4Var, ylb ylbVar) {
        super(context, tk4Var, 1, ylbVar);
        this.M = p42Var;
    }
}

// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class h32 extends z2b {
    public final /* synthetic */ byte L = 1;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(tzb tzbVar, Context context, tk4 tk4Var) {
        super(context, tk4Var, 0, null);
        this.M = tzbVar;
    }

    @Override // z2b
    public final void e(boolean z, boolean z2) {
        switch (this.L) {
            case 2:
                super.e(z, z2);
                tzb tzbVar = (tzb) this.M;
                uxb uxbVar = tzbVar.n;
                if (!z2) {
                    ((TextView) uxbVar.d).animate().cancel();
                    ((TextView) tzbVar.n.d).setAlpha(z ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) uxbVar.d).animate().alpha(z ? 0.0f : 1.0f).start();
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
                return super.getTranslationY() - ((u32) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.L) {
            case 1:
                z3a z3aVar = ((v3a) this.M).d;
                super.onMeasure(i, ik8.f(z3aVar.e, z3aVar.n - z3aVar.r.getPaddingTop(), TLObject.FLAG_30));
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
                super.setTranslationY(f + ((u32) this.M).N);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(int i, x53 x53Var, v3a v3aVar, Context context) {
        super(context, null, i, x53Var);
        this.M = v3aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(u32 u32Var, Context context, tk4 tk4Var, vnb vnbVar) {
        super(context, tk4Var, 1, vnbVar);
        this.M = u32Var;
    }
}

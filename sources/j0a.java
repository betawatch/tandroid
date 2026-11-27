// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j0a extends xy3 {
    public final /* synthetic */ int g0;
    public final /* synthetic */ n1a h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0a(n1a n1aVar, Context context, vnb vnbVar, boolean z, boolean z2, int i, dn9 dn9Var, int i2, int i3) {
        super(context, vnbVar, z, z2, false, true, i, dn9Var, i2, false);
        this.h0 = n1aVar;
        this.g0 = i3;
    }

    @Override // xy3
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.l1;
    }

    @Override // xy3
    public final boolean h(int i) {
        int i2;
        b1a b1aVar;
        n1a n1aVar = this.h0;
        SparseIntArray sparseIntArray = n1aVar.y0;
        if (n1aVar.y1) {
            return false;
        }
        int i3 = this.g0;
        if (i3 == 4 && i == 0) {
            n1aVar.R = !n1aVar.R;
            n1aVar.e0.setVisibility(8);
            xy3 xy3Var = n1aVar.d0[n1aVar.R ? 1 : 0];
            n1aVar.e0 = xy3Var;
            xy3Var.setVisibility(0);
            n1aVar.e0.x.setDrawable(getContext().getDrawable(n1aVar.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            n1aVar.e0.x.setContentDescription(ob6.M0(n1aVar.R ? 2131754751 : 2131751161, null));
            n1aVar.B(true, false, false);
            n1aVar.s0.g1(0, 0);
            return true;
        }
        uy3 uy3Var = this.E;
        int i4 = ((uy3Var == null || !this.b0) ? 0 : 1) + 1;
        if (uy3Var != null && this.b0 && i == 1) {
            i2 = n1aVar.n;
        } else {
            if ((i3 != 4 || i != 0) && i > 0) {
                int i5 = i - i4;
                if (sparseIntArray.indexOfKey(i5) >= 0) {
                    i2 = sparseIntArray.get(i5);
                }
            }
            i2 = 0;
        }
        n1aVar.u(i2, hl.L((i3 == 6 ? 7 : 0) - 2));
        n1aVar.e0.j(i, true);
        n1aVar.i0.K1 = true;
        n1aVar.v(null, true, true);
        e0a e0aVar = n1aVar.g0;
        if (e0aVar != null && (b1aVar = e0aVar.n) != null) {
            b1aVar.J1(null);
        }
        return true;
    }

    @Override // xy3
    public final void i(uy3 uy3Var) {
        ValueAnimator valueAnimator = this.h0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            uy3Var.setScaleX(0.0f);
            uy3Var.setScaleY(0.0f);
        }
    }
}

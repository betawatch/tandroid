package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f0 extends b9 {
    public Drawable D;
    public int E;
    public boolean F;
    public final p6 x;
    public ColorDrawable y;

    public f0(Context context, p6 p6Var) {
        super(context, p6Var);
        this.x = p6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = t6.b7;
        p6 p6Var = this.x;
        Drawable X0 = t6.X0(context, i10, t6.w0(i11, p6Var));
        ColorDrawable colorDrawable = new ColorDrawable(t6.w0(t6.a7, p6Var));
        this.y = colorDrawable;
        this.D = X0;
        eq eqVar = new eq(colorDrawable, X0, 0, 0);
        eqVar.x = true;
        setBackground(eqVar);
    }

    @Override // org.telegram.ui.Cells.b9, org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            p6 p6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(t6.w0(t6.a7, p6Var));
            }
            if (this.D != null) {
                int w02 = t6.w0(t6.b7, p6Var);
                if (w02 == this.E && this.F) {
                    return;
                }
                this.E = w02;
                this.F = true;
                this.D.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}

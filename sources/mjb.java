// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mjb extends njb {
    public Drawable E;
    public int F;
    public boolean G;
    public final ylb x;
    public ColorDrawable y;

    public mjb(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.x = ylbVar;
    }

    public void setBackground(boolean z) {
        Context context = getContext();
        int i = z ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i2 = cmb.a7;
        ylb ylbVar = this.x;
        Drawable V0 = cmb.V0(context, i, cmb.v0(i2, ylbVar));
        ColorDrawable colorDrawable = new ColorDrawable(cmb.v0(cmb.Z6, ylbVar));
        this.y = colorDrawable;
        this.E = V0;
        sn2 sn2Var = new sn2(colorDrawable, V0, 0, 0);
        sn2Var.x = true;
        setBackground(sn2Var);
    }

    @Override // njb, vlb
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            ylb ylbVar = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(cmb.v0(cmb.Z6, ylbVar));
            }
            if (this.E != null) {
                int v0 = cmb.v0(cmb.a7, ylbVar);
                if (v0 == this.F && this.G) {
                    return;
                }
                this.F = v0;
                this.G = true;
                this.E.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

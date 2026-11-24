// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cr1 extends xu1 {
    public ff0 e;
    public int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ mu1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr1(mu1 mu1Var, Context context, boolean z) {
        super(context);
        this.n = mu1Var;
        this.h = z;
    }

    @Override // xu1
    public final void d() {
        try {
            int themedColor = this.n.getThemedColor(bkb.mf);
            if (this.e != null) {
                Drawable background = getBackground();
                Drawable drawable = this.e;
                if (background == drawable) {
                    if (themedColor != this.f) {
                        bkb.F1(drawable, 436207615 & themedColor, true);
                    }
                    if (getImageView() != null && (themedColor != this.f || getImageView().getColorFilter() == null)) {
                        getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    }
                    this.f = themedColor;
                    if (getTextView() != null || getTextView().getCurrentTextColor() == themedColor) {
                    }
                    getTextView().setTextColor(themedColor);
                    return;
                }
            }
            ff0 W = bkb.W(gl.L(19.0f), themedColor & 436207615, this.h ? gl.L(4.0f) : 0, gl.L(3.0f), 0, gl.L(3.0f));
            this.e = W;
            setBackground(W);
            if (getImageView() != null) {
                getImageView().setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            this.f = themedColor;
            if (getTextView() != null) {
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // xu1
    public final void setEditButton(boolean z) {
        super.setEditButton(z);
        if (this.h) {
            getTextView().setMaxWidth(z ? gl.L(116.0f) : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
    }
}

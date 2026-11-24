// default package

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kn extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public kn(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ln lnVar = new ln(null);
        Drawable newDrawable = this.a.newDrawable();
        lnVar.b = newDrawable;
        newDrawable.setCallback(lnVar.e);
        return lnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ln lnVar = new ln(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        lnVar.b = newDrawable;
        newDrawable.setCallback(lnVar.e);
        return lnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ln lnVar = new ln(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        lnVar.b = newDrawable;
        newDrawable.setCallback(lnVar.e);
        return lnVar;
    }
}

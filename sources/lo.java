// default package

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lo extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public lo(Drawable.ConstantState constantState) {
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
        mo moVar = new mo(null);
        Drawable newDrawable = this.a.newDrawable();
        moVar.b = newDrawable;
        newDrawable.setCallback(moVar.e);
        return moVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        mo moVar = new mo(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        moVar.b = newDrawable;
        newDrawable.setCallback(moVar.e);
        return moVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        mo moVar = new mo(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        moVar.b = newDrawable;
        newDrawable.setCallback(moVar.e);
        return moVar;
    }
}

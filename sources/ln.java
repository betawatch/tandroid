// default package

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ln extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public ln(Drawable.ConstantState constantState) {
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
        mn mnVar = new mn(null);
        Drawable newDrawable = this.a.newDrawable();
        mnVar.b = newDrawable;
        newDrawable.setCallback(mnVar.e);
        return mnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        mn mnVar = new mn(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        mnVar.b = newDrawable;
        newDrawable.setCallback(mnVar.e);
        return mnVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        mn mnVar = new mn(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        mnVar.b = newDrawable;
        newDrawable.setCallback(mnVar.e);
        return mnVar;
    }
}

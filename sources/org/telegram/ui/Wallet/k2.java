package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public class k2 extends bb implements org.telegram.ui.ActionBar.y5 {
    public u61 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float a0;

    public k2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, true, false, d6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, 0);
        d();
        this.X.N(false);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return null;
    }

    @Override // org.telegram.ui.Components.bb
    public void F(float f7) {
        this.a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.a7);
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        int Q = Q();
        this.Z.setColor(Q);
        setBackgroundColor(Q);
        fixNavigationBar(Q);
        ViewGroup viewGroup = this.Y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        float height = getContainer().getHeight();
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.a0 + this.backgroundPaddingTop);
        if (max >= height) {
            return;
        }
        boolean z10 = this.containerView.getWidth() < getContainer().getWidth();
        canvas.drawRect(z10 ? this.containerView.getX() + this.backgroundPaddingLeft : 0.0f, max, z10 ? (this.containerView.getX() + this.containerView.getWidth()) - this.backgroundPaddingLeft : getContainer().getWidth(), height, this.Z);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void setOverlayNavBarColor(int i10) {
        super.setOverlayNavBarColor(i10);
        AndroidUtilities.setNavigationBarColor((Dialog) this, 0, false);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public void show() {
        if (getWindow() != null) {
            AndroidUtilities.enableEdgeToEdge(getWindow());
        }
        super.show();
        int Q = Q();
        setOverlayNavBarColor(Q);
        AndroidUtilities.setLightNavigationBar(this, AndroidUtilities.computePerceivedBrightness(Q) > 0.721f);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(jm0Var, getContext(), this.currentAccount, 0, true, new d(this, 5), this.resourcesProvider);
        this.X = u61Var;
        return u61Var;
    }
}

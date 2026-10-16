package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public class j2 extends db implements org.telegram.ui.ActionBar.x5 {
    public a71 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float a0;

    public j2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, c6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        d();
        this.X.N(false);
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        return null;
    }

    @Override // org.telegram.ui.Components.db
    public void G(float f7) {
        this.a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.g6.a7);
    }

    @Override // org.telegram.ui.ActionBar.x5
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

    @Override // org.telegram.ui.ActionBar.e3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        float height = getContainer().getHeight();
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.a0 + this.backgroundPaddingTop);
        if (max >= height) {
            return;
        }
        canvas.drawRect(0.0f, max, getContainer().getWidth(), height, this.Z);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void setOverlayNavBarColor(int i10) {
        super.setOverlayNavBarColor(i10);
        AndroidUtilities.setNavigationBarColor((Dialog) this, 0, false);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
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

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 6), this.resourcesProvider);
        this.X = a71Var;
        return a71Var;
    }
}

package org.telegram.ui.Wallet;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public class j2 extends bb implements org.telegram.ui.ActionBar.p6 {
    public j71 X;
    public final ViewGroup Y;
    public final Paint Z;
    public float a0;

    public j2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, true, false, u6Var);
        this.Z = new Paint();
        this.v = 0.1f;
        this.Y = viewGroup;
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        updateColors();
        this.X.O(false);
    }

    @Override // org.telegram.ui.Components.bb
    public void F(float f7) {
        this.a0 = f7;
        if (this.topBulletinContainer != null) {
            this.topBulletinContainer.setTranslationY(Math.max((this.containerView.getY() + f7) + this.backgroundPaddingTop, this.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - this.topBulletinContainer.getBottom());
        }
    }

    public int P() {
        return getThemedColor(org.telegram.ui.ActionBar.y6.a7);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.a7));
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        float height = getContainer().getHeight();
        float max = Math.max(height - AndroidUtilities.navigationBarHeight, this.containerView.getY() + this.a0 + this.backgroundPaddingTop);
        if (max >= height) {
            return;
        }
        boolean z10 = this.containerView.getWidth() < getContainer().getWidth();
        canvas.drawRect(z10 ? this.containerView.getX() + this.backgroundPaddingLeft : 0.0f, max, z10 ? (this.containerView.getX() + this.containerView.getWidth()) - this.backgroundPaddingLeft : getContainer().getWidth(), height, this.Z);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void setOverlayNavBarColor(int i10) {
        super.setOverlayNavBarColor(i10);
        AndroidUtilities.setNavigationBarColor((Dialog) this, 0, false);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public void show() {
        if (getWindow() != null) {
            AndroidUtilities.enableEdgeToEdge(getWindow());
        }
        super.show();
        int P = P();
        setOverlayNavBarColor(P);
        AndroidUtilities.setLightNavigationBar(this, AndroidUtilities.computePerceivedBrightness(P) > 0.721f);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int P = P();
        this.Z.setColor(P);
        setBackgroundColor(P);
        fixNavigationBar(P);
        ViewGroup viewGroup = this.Y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 5), this.resourcesProvider);
        this.X = j71Var;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return null;
    }
}

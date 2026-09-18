package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class du0 extends qu0 {
    public final /* synthetic */ int p0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ du0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, tu0 tu0Var, FrameLayout frameLayout, int i10) {
        super(context, tu0Var, frameLayout);
        this.p0 = i10;
        this.q0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.qu0
    public boolean C() {
        switch (this.p0) {
            case 0:
                return !((PhotoViewer) this.q0).s;
            default:
                return super.C();
        }
    }

    @Override // org.telegram.ui.qu0
    public void D() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.r1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.qu0
    public void F() {
        switch (this.p0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.q0).r1);
                break;
        }
    }

    @Override // org.telegram.ui.qu0
    public void G() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.K0 == null) {
                    secretMediaViewer.k(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.k0, true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.q0;
                bv0[] bv0VarArr = photoViewer.W0;
                ImageView[] imageViewArr = photoViewer.y3;
                if (photoViewer.J) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.Q1.getTranslationY();
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    boolean z11 = scrollY == 0 && translationY == 0.0f;
                    if (!z10) {
                        int b10 = bv0VarArr[0].b() + bv0VarArr[0].j;
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))) - AndroidUtilities.dp(12.0f);
                        boolean z12 = top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY());
                        z10 = top > b10;
                        z11 = z12;
                    }
                    if (photoViewer.z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new er0(this, 4)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    bv0VarArr[0].e(2, z10 ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}

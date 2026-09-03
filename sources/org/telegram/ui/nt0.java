package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nt0 extends au0 {
    public final /* synthetic */ int m0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, du0 du0Var, FrameLayout frameLayout, int i10) {
        super(context, du0Var, frameLayout);
        this.m0 = i10;
        this.n0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.au0
    public boolean C() {
        switch (this.m0) {
            case 0:
                return !((PhotoViewer) this.n0).s;
            default:
                return super.C();
        }
    }

    @Override // org.telegram.ui.au0
    public void D() {
        switch (this.m0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.n0;
                if (secretMediaViewer.G && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.o1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.au0
    public void F() {
        switch (this.m0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.n0).o1);
                break;
        }
    }

    @Override // org.telegram.ui.au0
    public void G() {
        switch (this.m0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.n0;
                if (secretMediaViewer.H0 == null) {
                    secretMediaViewer.k(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.h0, true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.m0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.n0;
                mu0[] mu0VarArr = photoViewer.T0;
                ImageView[] imageViewArr = photoViewer.v3;
                if (photoViewer.G) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.N1.getTranslationY();
                    boolean z4 = scrollY == 0 && translationY == 0.0f;
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    if (!z4) {
                        int b10 = mu0VarArr[0].b() + mu0VarArr[0].j;
                        int top = (((photoViewer.W1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))) - AndroidUtilities.dp(12.0f);
                        boolean z11 = top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY());
                        z4 = top > b10;
                        z10 = z11;
                    }
                    if (photoViewer.w3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z10) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new ss0(this, 3)).start();
                        } else if (imageViewArr[0].getTag() == null && !z10) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    mu0VarArr[0].e(2, z4 ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}

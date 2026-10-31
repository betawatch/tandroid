package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fr0 extends tr0 {
    public final /* synthetic */ int p0;
    public final /* synthetic */ org.telegram.messenger.us q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr0(org.telegram.messenger.us usVar, Context context, wr0 wr0Var, FrameLayout frameLayout, int i10) {
        super(context, wr0Var, frameLayout);
        this.p0 = i10;
        this.q0 = usVar;
    }

    @Override // org.telegram.ui.tr0
    public boolean D() {
        switch (this.p0) {
            case 0:
                return !((PhotoViewer) this.q0).s;
            default:
                return super.D();
        }
    }

    @Override // org.telegram.ui.tr0
    public void E() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    org.telegram.messenger.i0.h3(secretMediaViewer.p1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.tr0
    public void F() {
        switch (this.p0) {
            case 1:
                org.telegram.messenger.i0.r(((SecretMediaViewer) this.q0).p1);
                break;
        }
    }

    @Override // org.telegram.ui.tr0
    public void G() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.I0 == null) {
                    secretMediaViewer.l(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.i0, true);
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
                fq0[] fq0VarArr = photoViewer.W0;
                ImageView[] imageViewArr = photoViewer.y3;
                if (photoViewer.J) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.Q1.getTranslationY();
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    boolean z11 = scrollY == 0 && translationY == 0.0f;
                    if (!z10) {
                        int b10 = fq0VarArr[0].b() + fq0VarArr[0].j;
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (D() ? org.telegram.messenger.i0.m : 0))) - org.telegram.messenger.i0.L(12.0f);
                        boolean z12 = top > org.telegram.messenger.i0.L(32.0f) + ((int) imageViewArr[0].getY());
                        z10 = top > b10;
                        z11 = z12;
                    }
                    if (photoViewer.z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.h2(this, 24)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    fq0VarArr[0].e(2, z10 ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hi0 implements z4.e {
    public final /* synthetic */ pi0 a;

    public hi0(pi0 pi0Var) {
        this.a = pi0Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        pi0 pi0Var = this.a;
        pi0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = pi0Var.D0.k(i10);
            if (pi0Var.i1) {
                k10--;
            }
            pi0Var.getCurrentItemView();
            int childCount = pi0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pi0Var.getChildAt(i12);
                if (childAt instanceof z9) {
                    oi0 oi0Var = pi0Var.D0;
                    int k11 = oi0Var.k(oi0Var.d.indexOf(childAt));
                    if (pi0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((z9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < pi0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) pi0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(pi0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) pi0Var.W0.get(k11)) != null) {
                                animation.y(imageLocation.videoSeekTo, false, true);
                            }
                            imageReceiver.setAllowStartAnimation(false);
                            imageReceiver.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    @Override // z4.e
    public final void b(int i10) {
        pi0 pi0Var = this.a;
        int i11 = pi0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            pi0Var.getClass();
            pi0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = pi0Var.S0;
        if (dialogPhotos != null) {
            oi0 oi0Var = pi0Var.D0;
            dialogPhotos.loadAfter(i10 - (oi0Var != null ? oi0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ci0 implements z4.e {
    public final /* synthetic */ ki0 a;

    public ci0(ki0 ki0Var) {
        this.a = ki0Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ki0 ki0Var = this.a;
        ki0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ki0Var.D0.k(i10);
            if (ki0Var.i1) {
                k10--;
            }
            ki0Var.getCurrentItemView();
            int childCount = ki0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ki0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    ji0 ji0Var = ki0Var.D0;
                    int k11 = ji0Var.k(ji0Var.d.indexOf(childAt));
                    if (ki0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ki0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ki0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ki0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            e6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ki0Var.W0.get(k11)) != null) {
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
        ki0 ki0Var = this.a;
        int i11 = ki0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            ki0Var.getClass();
            ki0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ki0Var.S0;
        if (dialogPhotos != null) {
            ji0 ji0Var = ki0Var.D0;
            dialogPhotos.loadAfter(i10 - (ji0Var != null ? ji0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}

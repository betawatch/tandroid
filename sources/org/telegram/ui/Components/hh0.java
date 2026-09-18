package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hh0 implements z4.e {
    public final /* synthetic */ ph0 a;

    public hh0(ph0 ph0Var) {
        this.a = ph0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        ph0 ph0Var = this.a;
        int i11 = ph0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            ph0Var.getClass();
            ph0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ph0Var.S0;
        if (dialogPhotos != null) {
            oh0 oh0Var = ph0Var.D0;
            dialogPhotos.loadAfter(i10 - (oh0Var != null ? oh0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ph0 ph0Var = this.a;
        ph0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ph0Var.D0.k(i10);
            if (ph0Var.i1) {
                k10--;
            }
            ph0Var.getCurrentItemView();
            int childCount = ph0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ph0Var.getChildAt(i12);
                if (childAt instanceof u9) {
                    oh0 oh0Var = ph0Var.D0;
                    int k11 = oh0Var.k(oh0Var.d.indexOf(childAt));
                    if (ph0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((u9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ph0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ph0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ph0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            b6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ph0Var.W0.get(k11)) != null) {
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
    public final void c(int i10) {
    }
}

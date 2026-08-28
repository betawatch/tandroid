package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sg0 implements m2.e {
    public final /* synthetic */ ah0 a;

    public sg0(ah0 ah0Var) {
        this.a = ah0Var;
    }

    @Override // m2.e
    public final void b(int i9) {
        ah0 ah0Var = this.a;
        int i10 = ah0Var.k1;
        boolean z10 = i9 >= i10;
        if (i9 != i10) {
            ah0Var.getClass();
            ah0Var.k1 = i9;
        }
        MessagesController.DialogPhotos dialogPhotos = ah0Var.O0;
        if (dialogPhotos != null) {
            zg0 zg0Var = ah0Var.z0;
            dialogPhotos.loadAfter(i9 - (zg0Var != null ? zg0Var.j() : 0), z10);
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        ImageLocation imageLocation;
        ah0 ah0Var = this.a;
        ah0Var.B(f10, i9);
        if (i10 == 0) {
            int k10 = ah0Var.z0.k(i9);
            if (ah0Var.e1) {
                k10--;
            }
            ah0Var.getCurrentItemView();
            int childCount = ah0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ah0Var.getChildAt(i11);
                if (childAt instanceof o9) {
                    zg0 zg0Var = ah0Var.z0;
                    int k11 = zg0Var.k(zg0Var.d.indexOf(childAt));
                    if (ah0Var.e1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((o9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ah0Var.S0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ah0Var.S0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ah0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            x5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ah0Var.S0.get(k11)) != null) {
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

    @Override // m2.e
    public final void d(int i9) {
    }
}

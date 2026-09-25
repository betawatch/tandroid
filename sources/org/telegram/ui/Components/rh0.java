package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rh0 implements z4.e {
    public final /* synthetic */ zh0 a;

    public rh0(zh0 zh0Var) {
        this.a = zh0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        zh0 zh0Var = this.a;
        int i11 = zh0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            zh0Var.getClass();
            zh0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = zh0Var.S0;
        if (dialogPhotos != null) {
            yh0 yh0Var = zh0Var.D0;
            dialogPhotos.loadAfter(i10 - (yh0Var != null ? yh0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        zh0 zh0Var = this.a;
        zh0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = zh0Var.D0.k(i10);
            if (zh0Var.i1) {
                k10--;
            }
            zh0Var.getCurrentItemView();
            int childCount = zh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = zh0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    yh0 yh0Var = zh0Var.D0;
                    int k11 = yh0Var.k(yh0Var.d.indexOf(childAt));
                    if (zh0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < zh0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) zh0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(zh0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            d6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) zh0Var.W0.get(k11)) != null) {
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

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gi0 implements z4.f {
    public final /* synthetic */ oi0 a;

    public gi0(oi0 oi0Var) {
        this.a = oi0Var;
    }

    @Override // z4.f
    public final void a(int i10) {
        oi0 oi0Var = this.a;
        int i11 = oi0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            oi0Var.getClass();
            oi0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = oi0Var.S0;
        if (dialogPhotos != null) {
            ni0 ni0Var = oi0Var.D0;
            dialogPhotos.loadAfter(i10 - (ni0Var != null ? ni0Var.j() : 0), z10);
        }
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        oi0 oi0Var = this.a;
        oi0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = oi0Var.D0.k(i10);
            if (oi0Var.i1) {
                k10--;
            }
            oi0Var.getCurrentItemView();
            int childCount = oi0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = oi0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    ni0 ni0Var = oi0Var.D0;
                    int k11 = ni0Var.k(ni0Var.d.indexOf(childAt));
                    if (oi0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < oi0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) oi0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(oi0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            e6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) oi0Var.W0.get(k11)) != null) {
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

    @Override // z4.f
    public final void c(int i10) {
    }
}

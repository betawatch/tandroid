package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ch0 implements m2.e {
    public final /* synthetic */ kh0 a;

    public ch0(kh0 kh0Var) {
        this.a = kh0Var;
    }

    @Override // m2.e
    public final void a(int i10) {
        kh0 kh0Var = this.a;
        int i11 = kh0Var.k1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            kh0Var.getClass();
            kh0Var.k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = kh0Var.O0;
        if (dialogPhotos != null) {
            jh0 jh0Var = kh0Var.z0;
            dialogPhotos.loadAfter(i10 - (jh0Var != null ? jh0Var.j() : 0), z10);
        }
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        ImageLocation imageLocation;
        kh0 kh0Var = this.a;
        kh0Var.B(f9, i10);
        if (i11 == 0) {
            int k9 = kh0Var.z0.k(i10);
            if (kh0Var.e1) {
                k9--;
            }
            kh0Var.getCurrentItemView();
            int childCount = kh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = kh0Var.getChildAt(i12);
                if (childAt instanceof t9) {
                    jh0 jh0Var = kh0Var.z0;
                    int k10 = jh0Var.k(jh0Var.d.indexOf(childAt));
                    if (kh0Var.e1) {
                        k10--;
                    }
                    ImageReceiver imageReceiver = ((t9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k10 >= 0 && k10 < kh0Var.S0.size()) {
                        if (k10 == k9) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) kh0Var.S0.get(k10);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(kh0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) kh0Var.S0.get(k10)) != null) {
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
    public final void c(int i10) {
    }
}

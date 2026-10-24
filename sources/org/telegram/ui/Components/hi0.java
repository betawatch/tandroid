package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hi0 implements z4.f {
    public final /* synthetic */ org.telegram.ui.wy0 a;

    public hi0(org.telegram.ui.wy0 wy0Var) {
        this.a = wy0Var;
    }

    @Override // z4.f
    public final void a(int i10) {
        org.telegram.ui.wy0 wy0Var = this.a;
        int i11 = wy0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            wy0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = wy0Var.S0;
        if (dialogPhotos != null) {
            ni0 ni0Var = wy0Var.D0;
            dialogPhotos.loadAfter(i10 - (ni0Var != null ? ni0Var.j() : 0), z10);
        }
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.wy0 wy0Var = this.a;
        ni0 ni0Var = wy0Var.D0;
        ArrayList arrayList = wy0Var.W0;
        wy0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ni0Var.k(i10);
            wy0Var.getCurrentItemView();
            int childCount = wy0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = wy0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    int k11 = ni0Var.k(ni0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(wy0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            e6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) arrayList.get(k11)) != null) {
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

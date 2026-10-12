package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ii0 implements z4.e {
    public final /* synthetic */ org.telegram.ui.wz0 a;

    public ii0(org.telegram.ui.wz0 wz0Var) {
        this.a = wz0Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.wz0 wz0Var = this.a;
        oi0 oi0Var = wz0Var.D0;
        ArrayList arrayList = wz0Var.W0;
        wz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = oi0Var.k(i10);
            wz0Var.getCurrentItemView();
            int childCount = wz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = wz0Var.getChildAt(i12);
                if (childAt instanceof z9) {
                    int k11 = oi0Var.k(oi0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((z9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(wz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
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

    @Override // z4.e
    public final void b(int i10) {
        org.telegram.ui.wz0 wz0Var = this.a;
        int i11 = wz0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            wz0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = wz0Var.S0;
        if (dialogPhotos != null) {
            oi0 oi0Var = wz0Var.D0;
            dialogPhotos.loadAfter(i10 - (oi0Var != null ? oi0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}

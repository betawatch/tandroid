package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class sh0 implements z4.e {
    public final /* synthetic */ org.telegram.ui.pz0 a;

    public sh0(org.telegram.ui.pz0 pz0Var) {
        this.a = pz0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        org.telegram.ui.pz0 pz0Var = this.a;
        int i11 = pz0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            pz0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = pz0Var.S0;
        if (dialogPhotos != null) {
            yh0 yh0Var = pz0Var.D0;
            dialogPhotos.loadAfter(i10 - (yh0Var != null ? yh0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.pz0 pz0Var = this.a;
        yh0 yh0Var = pz0Var.D0;
        ArrayList arrayList = pz0Var.W0;
        pz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = yh0Var.k(i10);
            pz0Var.getCurrentItemView();
            int childCount = pz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pz0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    int k11 = yh0Var.k(yh0Var.d.indexOf(childAt));
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
                                FileLoader.getInstance(pz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            d6 animation = imageReceiver.getAnimation();
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
    public final void c(int i10) {
    }
}

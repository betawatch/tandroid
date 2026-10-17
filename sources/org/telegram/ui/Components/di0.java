package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class di0 implements z4.e {
    public final /* synthetic */ org.telegram.ui.uy0 a;

    public di0(org.telegram.ui.uy0 uy0Var) {
        this.a = uy0Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.uy0 uy0Var = this.a;
        ji0 ji0Var = uy0Var.D0;
        ArrayList arrayList = uy0Var.W0;
        uy0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ji0Var.k(i10);
            uy0Var.getCurrentItemView();
            int childCount = uy0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = uy0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    int k11 = ji0Var.k(ji0Var.d.indexOf(childAt));
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
                                FileLoader.getInstance(uy0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
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

    @Override // z4.e
    public final void b(int i10) {
        org.telegram.ui.uy0 uy0Var = this.a;
        int i11 = uy0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            uy0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = uy0Var.S0;
        if (dialogPhotos != null) {
            ji0 ji0Var = uy0Var.D0;
            dialogPhotos.loadAfter(i10 - (ji0Var != null ? ji0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}

package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vg0 implements m2.e {
    public final /* synthetic */ org.telegram.ui.my0 a;

    public vg0(org.telegram.ui.my0 my0Var) {
        this.a = my0Var;
    }

    @Override // m2.e
    public final void b(int i10) {
        org.telegram.ui.my0 my0Var = this.a;
        int i11 = my0Var.k1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            my0Var.k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = my0Var.O0;
        if (dialogPhotos != null) {
            bh0 bh0Var = my0Var.z0;
            dialogPhotos.loadAfter(i10 - (bh0Var != null ? bh0Var.j() : 0), z10);
        }
    }

    @Override // m2.e
    public final void c(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.my0 my0Var = this.a;
        bh0 bh0Var = my0Var.z0;
        ArrayList arrayList = my0Var.S0;
        my0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = bh0Var.k(i10);
            my0Var.getCurrentItemView();
            int childCount = my0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = my0Var.getChildAt(i12);
                if (childAt instanceof n9) {
                    int k11 = bh0Var.k(bh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((n9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(my0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            x5 animation = imageReceiver.getAnimation();
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

    @Override // m2.e
    public final void d(int i10) {
    }
}

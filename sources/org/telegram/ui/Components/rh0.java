package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rh0 implements z4.e {
    public final /* synthetic */ org.telegram.ui.tz0 a;

    public rh0(org.telegram.ui.tz0 tz0Var) {
        this.a = tz0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        org.telegram.ui.tz0 tz0Var = this.a;
        int i11 = tz0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            tz0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = tz0Var.S0;
        if (dialogPhotos != null) {
            xh0 xh0Var = tz0Var.D0;
            dialogPhotos.loadAfter(i10 - (xh0Var != null ? xh0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.tz0 tz0Var = this.a;
        xh0 xh0Var = tz0Var.D0;
        ArrayList arrayList = tz0Var.W0;
        tz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = xh0Var.k(i10);
            tz0Var.getCurrentItemView();
            int childCount = tz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = tz0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    int k11 = xh0Var.k(xh0Var.d.indexOf(childAt));
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
                                FileLoader.getInstance(tz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
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

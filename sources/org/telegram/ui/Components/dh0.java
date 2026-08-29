package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dh0 implements m2.e {
    public final /* synthetic */ org.telegram.ui.my0 a;

    public dh0(org.telegram.ui.my0 my0Var) {
        this.a = my0Var;
    }

    @Override // m2.e
    public final void a(int i10) {
        org.telegram.ui.my0 my0Var = this.a;
        int i11 = my0Var.k1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            my0Var.k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = my0Var.O0;
        if (dialogPhotos != null) {
            jh0 jh0Var = my0Var.z0;
            dialogPhotos.loadAfter(i10 - (jh0Var != null ? jh0Var.j() : 0), z10);
        }
    }

    @Override // m2.e
    public final void b(float f9, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.my0 my0Var = this.a;
        jh0 jh0Var = my0Var.z0;
        ArrayList arrayList = my0Var.S0;
        my0Var.B(f9, i10);
        if (i11 == 0) {
            int k9 = jh0Var.k(i10);
            my0Var.getCurrentItemView();
            int childCount = my0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = my0Var.getChildAt(i12);
                if (childAt instanceof t9) {
                    int k10 = jh0Var.k(jh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((t9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k10 >= 0 && k10 < arrayList.size()) {
                        if (k10 == k9) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k10);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(my0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) arrayList.get(k10)) != null) {
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

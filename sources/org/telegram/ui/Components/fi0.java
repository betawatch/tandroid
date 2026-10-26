package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fi0 implements a5.i {
    public final /* synthetic */ ni0 a;

    public fi0(ni0 ni0Var) {
        this.a = ni0Var;
    }

    @Override // a5.i
    public final void a(int i10) {
        ni0 ni0Var = this.a;
        int i11 = ni0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            ni0Var.getClass();
            ni0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ni0Var.S0;
        if (dialogPhotos != null) {
            mi0 mi0Var = ni0Var.D0;
            dialogPhotos.loadAfter(i10 - (mi0Var != null ? mi0Var.j() : 0), z10);
        }
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ni0 ni0Var = this.a;
        ni0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ni0Var.D0.k(i10);
            if (ni0Var.i1) {
                k10--;
            }
            ni0Var.getCurrentItemView();
            int childCount = ni0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ni0Var.getChildAt(i12);
                if (childAt instanceof y9) {
                    mi0 mi0Var = ni0Var.D0;
                    int k11 = mi0Var.k(mi0Var.d.indexOf(childAt));
                    if (ni0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((y9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ni0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ni0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ni0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            g6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ni0Var.W0.get(k11)) != null) {
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

    @Override // a5.i
    public final void c(int i10) {
    }
}

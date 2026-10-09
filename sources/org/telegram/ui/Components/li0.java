package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class li0 implements z4.e {
    public final /* synthetic */ ti0 a;

    public li0(ti0 ti0Var) {
        this.a = ti0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        ti0 ti0Var = this.a;
        int i11 = ti0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            ti0Var.getClass();
            ti0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ti0Var.S0;
        if (dialogPhotos != null) {
            si0 si0Var = ti0Var.D0;
            dialogPhotos.loadAfter(i10 - (si0Var != null ? si0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ti0 ti0Var = this.a;
        ti0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ti0Var.D0.k(i10);
            if (ti0Var.i1) {
                k10--;
            }
            ti0Var.getCurrentItemView();
            int childCount = ti0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ti0Var.getChildAt(i12);
                if (childAt instanceof y9) {
                    si0 si0Var = ti0Var.D0;
                    int k11 = si0Var.k(si0Var.d.indexOf(childAt));
                    if (ti0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((y9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ti0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ti0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ti0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ti0Var.W0.get(k11)) != null) {
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

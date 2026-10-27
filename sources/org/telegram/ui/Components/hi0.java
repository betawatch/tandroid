package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hi0 implements a5.i {
    public final /* synthetic */ org.telegram.ui.bz0 a;

    public hi0(org.telegram.ui.bz0 bz0Var) {
        this.a = bz0Var;
    }

    @Override // a5.i
    public final void a(int i10) {
        org.telegram.ui.bz0 bz0Var = this.a;
        int i11 = bz0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            bz0Var.o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = bz0Var.S0;
        if (dialogPhotos != null) {
            ni0 ni0Var = bz0Var.D0;
            dialogPhotos.loadAfter(i10 - (ni0Var != null ? ni0Var.j() : 0), z10);
        }
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.bz0 bz0Var = this.a;
        ni0 ni0Var = bz0Var.D0;
        ArrayList arrayList = bz0Var.W0;
        bz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ni0Var.k(i10);
            bz0Var.getCurrentItemView();
            int childCount = bz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = bz0Var.getChildAt(i12);
                if (childAt instanceof y9) {
                    int k11 = ni0Var.k(ni0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((y9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(bz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            g6 animation = imageReceiver.getAnimation();
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

    @Override // a5.i
    public final void c(int i10) {
    }
}

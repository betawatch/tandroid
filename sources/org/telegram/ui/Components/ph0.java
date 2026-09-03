package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ph0 implements m2.f {
    public final /* synthetic */ org.telegram.ui.dz0 a;

    public ph0(org.telegram.ui.dz0 dz0Var) {
        this.a = dz0Var;
    }

    @Override // m2.f
    public final void a(int i10) {
        org.telegram.ui.dz0 dz0Var = this.a;
        int i11 = dz0Var.l1;
        boolean z4 = i10 >= i11;
        if (i10 != i11) {
            dz0Var.l1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = dz0Var.P0;
        if (dialogPhotos != null) {
            vh0 vh0Var = dz0Var.A0;
            dialogPhotos.loadAfter(i10 - (vh0Var != null ? vh0Var.j() : 0), z4);
        }
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.dz0 dz0Var = this.a;
        vh0 vh0Var = dz0Var.A0;
        ArrayList arrayList = dz0Var.T0;
        dz0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = vh0Var.k(i10);
            dz0Var.getCurrentItemView();
            int childCount = dz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = dz0Var.getChildAt(i12);
                if (childAt instanceof p9) {
                    int k11 = vh0Var.k(vh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(dz0Var.I0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            y5 animation = imageReceiver.getAnimation();
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

    @Override // m2.f
    public final void c(int i10) {
    }
}

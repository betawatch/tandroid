package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ mq0 c;

    public /* synthetic */ an0(PhotoViewer photoViewer, mq0 mq0Var, int i3) {
        this.a = i3;
        this.b = photoViewer;
        this.c = mq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.i0.setImageBitmap(null);
                mq0 mq0Var = this.c;
                if (mq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = mq0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.Z1();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.q4 = null;
                int i3 = 0;
                photoViewer2.f0.setLayerType(0, null);
                photoViewer2.o4 = 0;
                photoViewer2.I1();
                photoViewer2.b2(this.c);
                MediaController.B().F0();
                if (photoViewer2.w7 && !photoViewer2.x7 && (arrayList = photoViewer2.h7) != null) {
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        if (obj instanceof org.telegram.messenger.ye) {
                            ((org.telegram.messenger.ye) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.q4 = null;
                gq0 gq0Var = photoViewer3.f0;
                if (gq0Var != null) {
                    int i10 = 0;
                    gq0Var.setLayerType(0, null);
                    photoViewer3.o4 = 0;
                    photoViewer3.b2(this.c);
                    photoViewer3.f0.setScaleX(1.0f);
                    photoViewer3.f0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.w7 && !photoViewer3.x7 && (arrayList2 = photoViewer3.h7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.ye) {
                                ((org.telegram.messenger.ye) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}

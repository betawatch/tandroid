package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ClippingImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;
    public final /* synthetic */ yq0 c;

    public /* synthetic */ hn0(PhotoViewer photoViewer, yq0 yq0Var, int i7) {
        this.a = i7;
        this.b = photoViewer;
        this.c = yq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClippingImageView clippingImageView;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                photoViewer.h0.setImageBitmap(null);
                yq0 yq0Var = this.c;
                if (yq0Var != null && !org.telegram.messenger.g0.Q1() && (clippingImageView = yq0Var.m) != null) {
                    clippingImageView.setImageBitmap(null);
                }
                try {
                    if (photoViewer.g0.getParent() != null) {
                        ((WindowManager) photoViewer.D.getSystemService("window")).removeView(photoViewer.g0);
                        photoViewer.U1();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.o4 = null;
                int i7 = 0;
                photoViewer2.e0.setLayerType(0, null);
                photoViewer2.m4 = 0;
                photoViewer2.D1();
                photoViewer2.W1(this.c);
                MediaController.B().F0();
                if (photoViewer2.u7 && !photoViewer2.v7 && (arrayList = photoViewer2.f7) != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        if (obj instanceof org.telegram.messenger.gf) {
                            ((org.telegram.messenger.gf) obj).h();
                        }
                    }
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.o4 = null;
                rq0 rq0Var = photoViewer3.e0;
                if (rq0Var != null) {
                    int i10 = 0;
                    rq0Var.setLayerType(0, null);
                    photoViewer3.m4 = 0;
                    photoViewer3.W1(this.c);
                    photoViewer3.e0.setScaleX(1.0f);
                    photoViewer3.e0.setScaleY(1.0f);
                    MediaController.B().F0();
                    if (photoViewer3.u7 && !photoViewer3.v7 && (arrayList2 = photoViewer3.f7) != null) {
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof org.telegram.messenger.gf) {
                                ((org.telegram.messenger.gf) obj2).h();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
